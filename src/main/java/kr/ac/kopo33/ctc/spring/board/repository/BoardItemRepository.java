package kr.ac.kopo33.ctc.spring.board.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kr.ac.kopo33.ctc.spring.board.domain.BoardItem;

@Repository
public interface BoardItemRepository extends JpaRepository<BoardItem, Integer> {
  Page<BoardItem> findAll(Pageable pageable);
  Page<BoardItem> findAllByOrderByIdDesc(Pageable pageable);
  Page<BoardItem> findAllByWriter(String wirter, Pageable pageable);
  
  @Query("select t from BoardItem t where content like concat('%', :searchString , '%')")
  Page<BoardItem> findAllSearch(@Param("searchString") String searchString, Pageable pageable);
  
  //board_id에 맞는 boardItem list
  List<BoardItem> findAllByBoard_IdOrderByIdDesc(int board_id);
  
  //검색에서 사용
  List<BoardItem> findAllByTitle(String string);
  List<BoardItem> findAllByContent(String string);
}

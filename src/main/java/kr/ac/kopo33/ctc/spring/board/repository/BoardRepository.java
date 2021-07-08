package kr.ac.kopo33.ctc.spring.board.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kr.ac.kopo33.ctc.spring.board.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
//  List<Board> findAllById(int id);
  
//  List<Board> findByIdAndTitle(int id, String title);
//  
//  @Query("select b from Board b where title=:title")
//  List<Board> findByTitleThanSQL(@Param("title") String title);
//  
//  List<Board> findByTitleThanOrderByIdDesc(String title, int id);
}

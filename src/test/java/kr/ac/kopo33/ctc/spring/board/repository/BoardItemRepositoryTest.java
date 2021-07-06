package kr.ac.kopo33.ctc.spring.board.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.ac.kopo33.ctc.spring.board.domain.Board;
import kr.ac.kopo33.ctc.spring.board.domain.BoardItem;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardItemRepositoryTest {
  
  @Autowired
  private BoardRepository boardRepository;
  
  @Autowired
  private BoardItemRepository boardItemRepository;
  
  @Test
  void create() {
    Board board1 = new Board();
    board1.setTitle("title1");
    
    BoardItem boardItem1 = new BoardItem();
    boardItem1.setTitle("boardItem1");
    boardItem1.setBoard(board1);
    
    BoardItem boardItem2 = new BoardItem();
    boardItem2.setTitle("boardItem2");
    boardItem2.setBoard(board1);
    
    List<BoardItem> list = new ArrayList<>();
    list.add(boardItem1);
    list.add(boardItem2);
    
    board1.setBoardItems(list);
    
    boardRepository.save(board1);
  }
  
//  @Test
//  void selectAll1() {
//    Optional<Board> boardOptional = boardRepository.findById(18L);
//    if (boardOptional.isPresent()) {
//      Board board = boardOptional.get();
//      Hibernate.initialize(board.getBoardItems());
//      System.out.println(board.getTitle());
//    }
//  }
//  
//  @Test
//  void selectAll2() {
//    List<BoardItem> boardItems = boardItemRepository.findAll();
//    for(BoardItem boardItem: boardItems) {
//      System.out.println(boardItem.getTitle());
//    }
//  }
//  
//  @Test
//  void selectOne1() {
//    Optional<Board> boardOptional = boardRepository.findById(4L);
//    if (boardOptional.isPresent()) {
//      Board board = boardOptional.get();
//      System.out.println(board.getTitle());
//    }
//  }
//  
//  @Test
//  void deleteOne() {
//    boardRepository.deleteById(15L);
//  }
}

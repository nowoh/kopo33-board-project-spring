package kr.ac.kopo33.ctc.spring.board.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.joda.time.LocalDateTime;
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
  
//  @Test   
  void create() {
    Date date = new Date();
    Board board1 = new Board();
    board1.setTitle("title1");
    
    Board board2 = new Board();
    board2.setTitle("title2");
    
    BoardItem boardItem1 = new BoardItem();
    boardItem1.setTitle("boardItem1");
    boardItem1.setDate(date);
    boardItem1.setContent("안녕하세요");
    boardItem1.setWriter("이호원");
    boardItem1.setBoard(board1);
    
    
    BoardItem boardItem2 = new BoardItem();
    boardItem2.setTitle("boardItem2");
    boardItem2.setDate(date);
    boardItem2.setContent("나는 boardItem2");
    boardItem2.setWriter("이호투");
    boardItem2.setBoard(board1);
    
    
    List<BoardItem> list = new ArrayList<>();
    list.add(boardItem1);
    list.add(boardItem2);
    
    board2.setBoardItems(list);
    
    boardRepository.save(board1);
    boardRepository.save(board2);
  }
  
  @Test
  void selectAll1() {
    Optional<Board> boardOptional = boardRepository.findById(4);
    if (boardOptional.isPresent()) {
      Board board = boardOptional.get();
      Hibernate.initialize(board.getBoardItems());
      System.out.println(board.getTitle());
    }
  }
  
//  @Test
  void selectAll2() {
    List<BoardItem> boardItems = boardItemRepository.findAll();
    for(BoardItem boardItem: boardItems) {
      System.out.println(boardItem.getTitle());
    }
  }
  
//  @Test
  void selectOne1() {
    Optional<Board> boardOptional = boardRepository.findById(3);
    if (boardOptional.isPresent()) {
      Board board = boardOptional.get();
      System.out.println(board.getTitle());
    }
  }
  
//  @Test
  void selectOne2() {
    Optional<BoardItem> boardItemOptional = boardItemRepository.findById(5);
    if (boardItemOptional.isPresent()) {
      BoardItem boardItem = boardItemOptional.get();
      System.out.println(boardItem.getTitle());
    }
  }
  
//  @Test   //완료
  void deleteOne1() {
    boardRepository.deleteById(3);
  }
  
//  @Test
  void deleteOne2() {
    boardItemRepository.deleteById(14);
  }
  
}

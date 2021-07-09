package kr.ac.kopo33.ctc.spring.board.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    Optional<Board> boardOptional = boardRepository.findById(1);
    Board board1 = boardOptional.get();
    
//    Board board2 = new Board();
//    board2.setTitle("title2");
    
    BoardItem boardItem1 = new BoardItem();
    boardItem1.setTitle("boardItem1");
    boardItem1.setContent("안녕하세요");
    boardItem1.setWriter("이호원");
    boardItem1.setBoard(board1);
    
    
    BoardItem boardItem2 = new BoardItem();
    boardItem2.setTitle("boardItem2");
    boardItem2.setContent("나는 boardItem2");
    boardItem2.setWriter("이호투");
    boardItem2.setBoard(board1);
    
    BoardItem boardItem3 = new BoardItem();
    boardItem3.setTitle("boardItem3");
    boardItem3.setContent("나는 boardItem3");
    boardItem3.setWriter("이호삼");
    boardItem3.setBoard(board1);
    
    BoardItem boardItem4 = new BoardItem();
    boardItem4.setTitle("boardItem4");
    boardItem4.setContent("나는 boardItem4");
    boardItem4.setWriter("이호사");
    boardItem4.setBoard(board1);
    
    BoardItem boardItem5 = new BoardItem();
    boardItem5.setTitle("boardItem5");
    boardItem5.setContent("나는 boardItem5");
    boardItem5.setWriter("이호오");
    boardItem5.setBoard(board1);
    
    BoardItem boardItem6 = new BoardItem();
    boardItem6.setTitle("boardItem6");
    boardItem6.setContent("나는 boardItem6");
    boardItem6.setWriter("이호육");
    boardItem6.setBoard(board1);
    
    BoardItem boardItem7 = new BoardItem();
    boardItem7.setTitle("boardItem7");
    boardItem7.setContent("나는 boardItem7");
    boardItem7.setWriter("이호칠");
    boardItem7.setBoard(board1);
   
    BoardItem boardItem8 = new BoardItem();
    boardItem8.setTitle("boardItem8");
    boardItem8.setContent("나는 boardItem8");
    boardItem8.setWriter("이호팔");
    boardItem8.setBoard(board1);
    
    BoardItem boardItem9 = new BoardItem();
    boardItem9.setTitle("boardItem9");
    boardItem9.setContent("나는 boardItem9");
    boardItem9.setWriter("이호구");
    boardItem9.setBoard(board1);
    
    BoardItem boardItem10 = new BoardItem();
    boardItem10.setTitle("boardItem10");
    boardItem10.setContent("나는 boardItem10");
    boardItem10.setWriter("이호십");
    boardItem10.setBoard(board1);
    
    
    List<BoardItem> list = new ArrayList<>();
    list.add(boardItem1);
    list.add(boardItem2);
    list.add(boardItem3);
    list.add(boardItem4);
    list.add(boardItem5);
    list.add(boardItem6);
    list.add(boardItem7);
    list.add(boardItem8);
    list.add(boardItem9);
    list.add(boardItem10);
    
    board1.setBoardItems(list);
//    board2.setBoardItems(list);
    
    boardRepository.save(board1);
//    boardRepository.save(board2);
  }
  
//  @Test
  void selectAll1() {
    Optional<Board> boardOptional = boardRepository.findById(2);
    if (boardOptional.isPresent()) {
      Board board = boardOptional.get();
      Hibernate.initialize(board.getBoardItems());
      System.out.println(board.getTitle());
//      System.out.println(board.getBoardItems().size());
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
  
  //update test
//  @Test
  void update() {
    Optional<BoardItem> boardItemOptional = boardItemRepository.findById(2);
    if (boardItemOptional.isPresent()) {
      BoardItem boardItem = boardItemOptional.get();
      boardItem.setContent("안녕하시오");
      boardItemRepository.save(boardItem);
    }
  }
  
  
//  pagination 미완성
//  @Test
//  @Transactional
//  public void oneToMany_OneWay() {
//    // 미리 아이템 100개를 적재
//    for(int i = 0 ; i < 100; i++){
//      BoardItem be = new BoardItem();
//      be.setContent(dummyString());
//      if( i % 3 == 0 ){
//        be.setWriter("first");
//      }
//      else if( i % 3 == 1 ) {
//        be.setWriter("second");
//      }
//      else {
//        be.setWriter("third");
//      }
//      boardItemRepository.save(be);
//    }
//
//    // 한 페이지 아이템 10개, 0번째 페이지 호출
//    Page<BoardItem> page = boardItemRepository.findAll(PageRequest.of(0, 10));
//    printPageData("simple", page);
//
//    // 한 페이지 아이템 10개, 글번호 내림차순으로, 0번째 페이지 호출
//    page = boardItemRepository.findAllByOrderByIdDesc(PageRequest.of(0, 10));
//    printPageData("sort_seq_desc", page);
//
//    // 한 페이지에 아이템 10개, 글번호 내림차순으로, 2번째 페이지 호출
//    page = boardItemRepository.findAll(PageRequest.of(2, 10, new Sort(Direction.DESC, "id")));
//    printPageData("sort", page);
//
//    // 한페이지에 아이템 10개, 글작성자 "first", 0번째 페이지 호출
//    page = boardItemRepository.findAllByWriter("first", PageRequest.of(0, 10));
//    printPageData("sort_writer", page);
//
//    // 한페이지 아이템 10개, 작성자 내림차순으로, 2번째 페이지 호출
//    page = boardItemRepository.findAll(PageRequest.of(2, 10, new Sort(Direction.DESC, "writer")));
//    printPageData("sort_writer_desc", page);
//
//    // 한페이지 아이템 10개, 검색어 중, 글번호 내림차순으로, 2번째 페이지 호출
//    page = boardItemRepository.findAllSearch("bc", PageRequest.of(2, 10, new Sort(Direction.DESC, "id")));
//    printPageData("sort_search_desc", page);
//  }
//
//  // 페이지 데이터 출력
//  private void printPageData(String label, Page<BoardItem> page){
//    if( page == null || page.getSize() <= 0 ) return;
//
//    for( int i = 0 ; i < page.getSize(); i++ ){
//      BoardItem be = page.getContent().get(i);
//      System.out.println("["+label+"] "+ be.getId() + " " + be.getWriter() + " " + be.getContent());
//    }
//  }
//
//  // 더미 문자열 반환
//  private String dummyString(){
//
//    String [] dummy = {"abc", "bcd", "cde", "def"};
//    int rand = (int)(System.currentTimeMillis() % dummy.length);
//
//    return dummy[rand];
//  }
//    
}

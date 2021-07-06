package kr.ac.kopo33.ctc.spring.board.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Board {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
  @Column
  private Long id;
  private String title;
  
  @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="board")
  //fetch -> fk 연결해서 보드 지워지면 게시글 같이 지워지는 것과 같음 default는 eager가 아닌 lazy
  private List<BoardItem> boardItems;
  
  public void addBoardItems(BoardItem BI) {
    Collection<BoardItem> boardItems = getBoardItems();
    boardItems.add(BI);
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  
  public List<BoardItem> getBoardItems() {
    if (boardItems == null) {
      boardItems = new ArrayList<BoardItem>();
    }
    return boardItems;
  }
  
  public void setBoardItems(List<BoardItem> boardItems) {
    this.boardItems = boardItems;
  }
  
  @Override
  public String toString() {
    String result = "[" + id + "]" + title;
    for ( BoardItem BI : getBoardItems() ) {
      result += "\n" + BI.toString();
    }
    return result;
  }
  
  
  
  
  
}

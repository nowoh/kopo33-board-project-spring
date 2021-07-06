package kr.ac.kopo33.ctc.spring.board.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BoardItem {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
  @Column
  private int id;
  
  @Column
  private String title;
  
  @Column
  private Date date;
  
  @Column
  private String content;
  
  @Column
  private int viewcount;
  
  @Column
  private String writer;
  
  @Column
  private int fk_board_id;
  
  @ManyToOne(optional=false)
  @JoinColumn(name="board_id")
  private Board board;

  @Override
  public String toString() {
    String result = "[boardItem_" + id + "] " + title;
    return result;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getViewcount() {
    return viewcount;
  }

  public void setViewcount(int viewcount) {
    this.viewcount = viewcount;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getFk_board_id() {
    return fk_board_id;
  }

  public void setFk_board_id(int fk_board_id) {
    this.fk_board_id = fk_board_id;
  }

  public Board getBoard() {
    return board;
  }

  public void setBoard(Board board) {
    this.board = board;
  }
  
  
}

package kr.ac.kopo33.ctc.spring.board.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
  
  @CreatedDate
  private String createdDate;
  
  @LastModifiedDate
  private String modifiedDate;
  
  @PrePersist
  public void onPrePersist() {
    this.createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    this.modifiedDate = this.createdDate;
  }
  
  @PreUpdate
  public void onPreUpdate() {
    this.modifiedDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
  }

  public String getCreatedDate() {
    return createdDate;
  }

  public String getModifiedDate() {
    return modifiedDate;
  }

}

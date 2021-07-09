package kr.ac.kopo33.ctc.spring.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo33.ctc.spring.board.repository.BoardItemRepository;
import kr.ac.kopo33.ctc.spring.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

//  @Autowired
//  private BoardRepository boardRepository;
//  
//  @Autowired
//  private BoardItemRepository boardItemRepository;

//  private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);  
  
  @Override
  public String test() {
    String msg = "hello, spring boot no aop";
    System.out.println(msg);
    return msg;
  }

  @Override
  public String testAop() {
    String msg = "hello, spring boot aop";
    System.out.println(msg);
    return msg;
  }
}

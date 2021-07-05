package kr.ac.kopo33.ctc.spring.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo33.ctc.spring.board.repository.BoardItemRepository;
import kr.ac.kopo33.ctc.spring.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

  @Autowired
  private BoardRepository boardRepository;
  
  @Autowired
  private BoardItemRepository boardItemRepository;
}

package kr.ac.kopo33.ctc.spring.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.ac.kopo33.ctc.spring.board.repository.BoardItemRepository;
import kr.ac.kopo33.ctc.spring.board.repository.BoardRepository;

@SpringBootTest
class SpringBoardApplicationTests {

  @Autowired
  private BoardRepository boardRepository;
  
  @Autowired
  private BoardItemRepository boardItemRepository;
  
	@Test
	void contextLoads() {
	  
	}

}

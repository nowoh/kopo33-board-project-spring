package kr.ac.kopo33.ctc.spring.board.service;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardServiceTest {

  @Autowired
  private BoardService boardService;

  @Ignore
  @Test
  public void testNoAop() {
    boardService.test();
  }

  @Test
  public void testAop() {
    boardService.testAop();
  }
}

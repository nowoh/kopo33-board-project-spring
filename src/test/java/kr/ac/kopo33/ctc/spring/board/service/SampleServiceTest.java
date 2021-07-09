package kr.ac.kopo33.ctc.spring.board.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleServiceTest {

  @Autowired
  private SampleService sampleService;
  
  @Ignore
  @Test(expected = RuntimeException.class)
  public void testNoTransactional() {
    sampleService.testNoTransactional();
  }
  
  @Test(expected = RuntimeException.class)
  public void testTransactional() {
    sampleService.testTransactional();
  }
}

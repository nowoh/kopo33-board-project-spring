package kr.ac.kopo33.ctc.spring.board.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleRepositoryTest {
  @Autowired
  private SampleRepository sampleRepository;
  
  @Before
  public void before() {
    System.out.println("before");
  }
  
  @After
  public void after() {
    System.out.println("after");
  }
  
  @Test
  public void findAll() {
    assertEquals(5, sampleRepository.count());
  }
  
  @Test
  public void equalTest() {
    assertEquals("a", "a");
  }
  
  @Test
  @Ignore
  public void notEqualTest() {
    assertEquals("a", "b");
  }
//  @Test
//  public void findAll() {
//    Map<String, Object> filter = new HashMap<String, Object>();
//    filter.put("title", "이호원");
//    
//    PageRequest pageable = PageRequest.of(0,10);
//    Page<Sample> page = sampleRepository.findAllByTitle(SampleSpecs.search(filter), pageable);
//    
//    for(Sample s : page) {
//      System.out.println(s.getTitle());
//    }
//  }
}

package kr.ac.kopo33.ctc.spring.board.repository;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import kr.ac.kopo33.ctc.spring.board.domain.Sample;

public class SampleRepositoryTest {
  @Autowired
  private SampleRepository sampleRepository;
  
  @Test
  void contextLoads() {
    Map<String, Object> filter = new HashMap<String, Object>();
    filter.put("title", "3");
    
    PageRequest pageable = PageRequest.of(0, 10);
    Page<Sample> page = sampleRepository.findAllByTitle(SampleSpecs.search(filter), pageable);
    
    for (Sample sample: page) {
      System.out.println(sample.getTitle());
    }
  }
}

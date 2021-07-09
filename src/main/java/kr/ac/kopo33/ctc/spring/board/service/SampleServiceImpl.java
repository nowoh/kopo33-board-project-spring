package kr.ac.kopo33.ctc.spring.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.kopo33.ctc.spring.board.domain.Sample;
import kr.ac.kopo33.ctc.spring.board.repository.SampleRepository;

public class SampleServiceImpl implements SampleService {

  @Autowired
  private SampleRepository sampleRepository;
  
  @Override
  public String testNoTransactional() {
    Sample sample = sampleRepository.findById(1L).get();
    sample.setTitle("update1");
    sampleRepository.save(sample);
    
    throw new RuntimeException("Spring Boot No Transactional Test");
  }

  @Override
  @Transactional
  public String testTransactional() {
    Sample sample = sampleRepository.findById(1L).get();
    sample.setTitle("update1");
    sampleRepository.save(sample);
    
    throw new RuntimeException("Spring Boot Transactional Test");
  }

}

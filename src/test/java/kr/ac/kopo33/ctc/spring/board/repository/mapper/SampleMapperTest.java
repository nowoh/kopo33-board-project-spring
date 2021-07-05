package kr.ac.kopo33.ctc.spring.board.repository.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.ac.kopo33.ctc.spring.board.domain.Sample;

@SpringBootTest
public class SampleMapperTest {

  private static final Logger logger = LoggerFactory.getLogger(SampleMapperTest.class);

  @Autowired
  SampleMapper sampleMapper;

  @Test
  public void findAll() {
    List<Sample> samples = sampleMapper.findAll();

    for (Sample s : samples) {
      logger.info(s.getTitle());
    }
  }
}

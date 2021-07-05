package kr.ac.kopo33.ctc.spring.board.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.ac.kopo33.ctc.spring.board.domain.Sample;

@Mapper
@Repository
public interface SampleMapper {
  List<Sample> findAll();
}

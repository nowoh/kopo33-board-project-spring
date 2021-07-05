package kr.ac.kopo33.ctc.spring.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo33.ctc.spring.board.domain.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {

}

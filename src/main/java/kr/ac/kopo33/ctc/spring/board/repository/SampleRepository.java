package kr.ac.kopo33.ctc.spring.board.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import kr.ac.kopo33.ctc.spring.board.domain.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long>, JpaSpecificationExecutor<Sample> {
  //optional => 값이 있을 수도 있고 없을 수도 있다.
  Optional<Sample> findOneByTitle(String title);
  
  Page<Sample> findAllByTitle(String title, Pageable pageable);
  
  List<Sample> findByAllTitle(String title);
}

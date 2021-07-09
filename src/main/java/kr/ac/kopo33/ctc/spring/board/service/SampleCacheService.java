package kr.ac.kopo33.ctc.spring.board.service;

public interface SampleCacheService {
  String testNoCache(Long id);
  String testCache(Long id);
  void testCacheClear(Long id);
}

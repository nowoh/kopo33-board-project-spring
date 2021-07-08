package kr.ac.kopo33.ctc.spring.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo33.ctc.spring.board.domain.BoardItem;
import kr.ac.kopo33.ctc.spring.board.repository.BoardItemRepository;

public class BoardItemController {
  
  @Autowired
  private BoardItemRepository boardItemRepository;
  
  @RequestMapping(value = "/boardItem/findAll")
  @ResponseBody
  public List<BoardItem> All(Model model) {
    List<BoardItem> all = boardItemRepository.findAllByTitle("boardItem1");
    return all;
  }
}

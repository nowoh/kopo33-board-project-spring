package kr.ac.kopo33.ctc.spring.board.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo33.ctc.spring.board.domain.BoardItem;
import kr.ac.kopo33.ctc.spring.board.repository.BoardItemRepository;

@Controller
public class BoardItemController {
  
  @Autowired
  private BoardItemRepository boardItemRepository;
  
  @RequestMapping(value = "/boardItemList")
//  @ResponseBody
  public String All(Model model) {
    Optional<BoardItem> boardItemOptional = boardItemRepository.findById(2);
    BoardItem boardItem = boardItemRepository.findById(2).get();
    model.addAttribute("boardItem", boardItem);
    return "boardItemList";
  }
}

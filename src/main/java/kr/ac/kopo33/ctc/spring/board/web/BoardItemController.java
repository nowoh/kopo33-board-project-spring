package kr.ac.kopo33.ctc.spring.board.web;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

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
  public String boardItemList(Model model, HttpServletRequest request) {
    int board_id = Integer.parseInt(request.getParameter("board_id"));
    List<BoardItem> boardItemLists = boardItemRepository.findAllByBoard_IdOrderByIdDesc(board_id);
    model.addAttribute("boardItemLists", boardItemLists);
    return "boardItemList";
  }
  
//  @RequestMapping(value = "/boardItem_insert")
//  public 
}

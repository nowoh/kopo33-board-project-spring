package kr.ac.kopo33.ctc.spring.board.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo33.ctc.spring.board.repository.BoardItemRepository;
import kr.ac.kopo33.ctc.spring.board.repository.BoardRepository;


@Controller
public class BoardController {

    @Autowired        //DI: 스프링이 annotation을 다 뒤져서 객체를 가져옴
    private BoardRepository boardRepository;
    
    @Autowired        
    private BoardItemRepository boardItemRepository;
    
    @RequestMapping(value = "/boardList")
    public String boardList(Model model) {
      model.addAttribute("boardLists", boardRepository.findAll());
      return "boardList";
    }
}

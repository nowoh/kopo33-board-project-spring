package kr.ac.kopo33.ctc.spring.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo33.ctc.spring.board.service.BoardItemService;
import kr.ac.kopo33.ctc.spring.board.service.BoardService;


@Controller
public class BoardController {

    @Autowired        //DI: 스프링이 annotation을 다 뒤져서 객체를 가져옴
    private BoardService boardService;
    
    @Autowired        
    private BoardItemService boardItemService;
    
    @RequestMapping(value = "/boardList")
    public String boardList(Model model) {
      model.addAttribute("name", "홍길동");
      return "boardList";
    }
}

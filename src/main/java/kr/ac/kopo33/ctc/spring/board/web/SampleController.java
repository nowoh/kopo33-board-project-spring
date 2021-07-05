package kr.ac.kopo33.ctc.spring.board.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo33.ctc.spring.board.domain.Sample;
import kr.ac.kopo33.ctc.spring.board.repository.SampleRepository;

@Controller
public class SampleController {

   @Autowired
   private SampleRepository sampleRepository;
   
   @RequestMapping(value = "/sample/list")
   @ResponseBody
   public List<Sample> list(Model model) {
     return sampleRepository.findAll();
   }
   
   @RequestMapping(value = "/sample/pageable")
   @ResponseBody
   public List<Sample> pageable(Model model) {
     PageRequest pageable = PageRequest.of(0, 1);
     Page<Sample> page = sampleRepository.findAll(pageable);
     return page.getContent();
   }
   
   @RequestMapping(value = "/sample/filter")
   @ResponseBody
   public Optional<Sample> filter(Model model) {
     Optional<Sample> filtering = sampleRepository.findOneByTitle("이호원");
     return filtering;
   }
   
   @RequestMapping(value = "/sample/all")
   @ResponseBody
   public List<Sample> All(Model model) {
       List<Sample> all = sampleRepository.findAllByTitle("이호원");
     return all;
   }
}

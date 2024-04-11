package edu.ex.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import edu.ex.vo.RspVO;

@Service // @Component + 의미(Command) = 비지니스 로직
public class RspServiceImpl implements   RspService {

   @Override
   public void start(String rsp, Model model) {
      System.out.println(rsp);
      
      RspVO you = new RspVO(rsp);
      RspVO computer = new RspVO(you);
      
      model.addAttribute("computer", computer);
      model.addAttribute("you", you);   
      
   }


}

package com.choi.foodie.controller;

import com.choi.foodie.dto.ResponseDTO;
import com.choi.foodie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "api/v1/app/findAll", method = RequestMethod.POST)
    public ResponseEntity<?> findAll(){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("S0001");
        responseDTO.setRes(userService.findAll());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "/")	public ModelAndView index() throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index"); //jsp(html)로 갈때는 setViewName // class로 갈때는 setView

        return mav;
    }
}

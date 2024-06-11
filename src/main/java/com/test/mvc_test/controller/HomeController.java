//package com.test.mvc_test.controller;
//
//import com.test.mvc_test.domain.Support;
//
//import com.test.mvc_test.repository.SupportRepository;
//import com.test.mvc_test.service.SupportService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//@RequiredArgsConstructor
//@Slf4j
//public class HomeController {
//    private final SupportRepository supportRepository;
//
//    @GetMapping("/")
//    public String index(Model model){
//        List<Support> entitys =supportRepository.findAll();
//        model.addAttribute("Entity", entitys);
//        return "index";
//    }
//
//}

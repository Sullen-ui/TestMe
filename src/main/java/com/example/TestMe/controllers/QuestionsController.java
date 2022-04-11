package com.example.TestMe.controllers;

import com.example.TestMe.models.Question;
import com.example.TestMe.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class QuestionsController {
    private final QuestionService questionService;


    @GetMapping("/")
    public String questions(Model model) {
        model.addAttribute("questions", questionService.listQuestions());
        return "index";
    }
    @PostMapping("/question/create")
    public String createQuestion(Question question) {
        questionService.saveQuestion(question);
        return "redirect:/";
    }
    @PostMapping("/question/delete/{id}")
    public String deleteQuestion(@PathVariable Long id){
        questionService.deleteQuestion(id);
        return "redirect:/";
    }
}

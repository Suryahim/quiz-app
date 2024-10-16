package com.jspyder.quizapp.controller;


import com.jspyder.quizapp.Question;
import com.jspyder.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired QuestionService questionService;
    @GetMapping("allQuestion")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestionService();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}

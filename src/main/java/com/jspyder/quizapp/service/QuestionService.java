package com.jspyder.quizapp.service;

import com.jspyder.quizapp.Question;
import com.jspyder.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestionService() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }


    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }
}

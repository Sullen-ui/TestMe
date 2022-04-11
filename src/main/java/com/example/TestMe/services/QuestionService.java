package com.example.TestMe.services;

import com.example.TestMe.models.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class QuestionService {
    private List<Question> questions = new ArrayList<>();
    private long ID = 0;
    {
        questions.add(new Question(++ID,"Docker", "Что делает команда Docker run?"
                                    , "Создает новый контейнер и запускает его" , "1"));
    }
    public List<Question> listQuestions() {return questions;}

    public void saveQuestion(Question question){
        question.setId(++ID);
        questions.add(question);
    }

    public void deleteQuestion(Long id){

        questions.removeIf(question ->  question.getId().equals(id));
    }

    public Question getQuestionById(Long id){
        for (Question question: questions){
            if(question.getId().equals(id)) return question;
        }
        return null;
    }
}

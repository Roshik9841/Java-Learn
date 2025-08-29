import tools.*;
import quiz.*;

class Program{
    public static void main(String args[]){
           QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.printScore();
    }
}
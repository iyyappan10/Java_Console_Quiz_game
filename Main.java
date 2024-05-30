public class Main{

    public static void main(String[] args) {

         //mostly main file empty
        //we call displayQuestions()-->create object of that class
        QuestionService service=new QuestionService();
         //calling method
        service.play_quiz();
        service.printsocre();
    }
}
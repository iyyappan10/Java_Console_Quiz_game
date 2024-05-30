import java.util.Scanner;

public class QuestionService {


//create object of array questions how many questions 5 
    Question[] questions=new Question[5];
    //create selection array user
    String selection[]=new String[5];
    //we need constructor all passing values this link to questin constructor
    public QuestionService(){
        //questions[0]ref var==Question actual var
        questions[0]=new Question(1,"size of byte ?","1","2","4","6","1");
        questions[1]=new Question(2,"size of int ?","2","4","6","8","4");
        questions[2]=new Question(3,"size of float ?","2","5","4","8","4");
        questions[3]=new Question(4,"size of double ?","8","10","1","12","8");
        questions[4]=new Question(5,"size of char ?","1","2","4","10","2");
    }
    //method()
    /**
     * 
     */
    public void play_quiz(){
        //we need display the questins with options and answer
        //and loop for all questions dispalys
        int i=0;
        for(Question q:questions){
            // we need display in properway
            // System.out.println(q);
            System.out.println("question id "+q.getId());
            System.out.println(q.getQuestions());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());
            //input from the user
            System.out.print("enter your Answer: ");
            Scanner sc=new Scanner(System.in);
            //we need to store user data use selectionarray using i for iterate 1 to 5
            selection[i]=sc.nextLine();
            //iterate each time 
            i++;
        }
        System.out.println(" ");
        //we need to print user data
        for(String s:selection){
            
            System.out.println(s);
        }
        // sc.close();
    }
    //we need to get user score 
    public void printsocre(){

        int score=0;
        for(int i=0;i<questions.length;i++)
        {

            Question que=questions[i];
            String actualAnswer=que.getAnswer();
            String userAnswer=selection[i];

            if(actualAnswer.equals(userAnswer))
            {

                score++;
            }
            
        }
        System.out.println("your score is: "+score);
    }
    
}

package Java_Test_Practice;

/**
 * Created by musti on 12/06/2018.
 */
public class if_else_if_else {

    public static void main(String[] arg) {
        int number = 10;
        int answer = 10 / 3;

        if (answer == 2) {
            System.out.println("The answer is correct.");

        } else if(answer >=5) {

            System.out.println("We need to check out the question");

        }else{

            System.out.println("The answer is very WRONG."+  " We need to check out the question");

        }
    }
}

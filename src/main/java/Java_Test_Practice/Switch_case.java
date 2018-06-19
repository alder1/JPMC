package Java_Test_Practice;

/**
 * Created by musti on 12/06/2018.
 */
public class Switch_case {

    public static void main(String[] arg){

        int month = 2;

        switch (month){
            case 1:
                System.out.println("Jan");
                break;

            case 2:
                System.out.println("Feb");
                break;

            case 12:
                System.out.println("Dec");
                break;

            default:
                System.out.println("Out of Date");
                break;

        }
    }
}

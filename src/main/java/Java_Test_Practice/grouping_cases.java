package Java_Test_Practice;

/**
 * Created by musti on 13/06/2018.
 */
public class grouping_cases {

    public static void main(String[] arg){

        int Man = 20;

        switch (Man){
            case 1:
            case 2:
            case 3:
                System.out.println("Good man");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Great Man");
                break;

            default:
                System.out.println("Not a Good Man");
                break;

        }
    }
}

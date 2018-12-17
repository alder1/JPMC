package Java_Test_Practice;

/**
 * Created by musti on 11/06/2018.
 */
public class arrays {
    public static void main(String[] args) {

//        int mySet[] = {1,3,4,5,6,78,9};
//        System.out.println(mySet[3]);

//        int myValue = 5;
//        System.out.println(myValue++);

          int mySet[] = {8,1,0,5,3,4,5,6,78,9};

          int temp;
          for (int i=0; i<mySet.length-1; i++){
              if(mySet[i] > mySet[i+1]){

                  temp = mySet[i+1];
                  mySet[i+1] = mySet[i];
                  mySet[i]= temp;

              }

          }

    }
}

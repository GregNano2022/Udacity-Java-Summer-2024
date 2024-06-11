package lesson1;

public class LoopsExercise {


    public static void main(String[] args) {


        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //for (int i = 0; i < 10; i++) {
        int i=0;
        do{
        //while(i<10){
            System.out.println(i);
          i++;

        }
        while(i<numbers.length);

    }
}

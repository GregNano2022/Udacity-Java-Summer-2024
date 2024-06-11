package lesson1;

public class ArraysExercise {

    public static void main(String[] args) {
        int[] numberArray;
        numberArray= new int[5];
        numberArray[0] = 1;
        numberArray[1]= 2;
        numberArray[2] = 3;
        numberArray[3] =4;
        numberArray[4] =5;

         for (int i=0; i <numberArray.length; i++){
             System.out.println(numberArray[i]);
         }
        }
    }

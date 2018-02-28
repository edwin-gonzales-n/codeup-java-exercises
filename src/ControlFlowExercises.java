import java.lang.Math;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 0;

//        while (i <= 15){
//            System.out.print(" " + i++);
//        }

//        do {
//            System.out.print(i);
//            i+=2;
//        } while(i<102);
//        int  i = 100;
        int i;
//            for (i = 100; i >= -10; i-=5){
//                System.out.printf("%d ",i);
//            }
//        do {
//            System.out.printf("%d ", i);
//            i-=5;
//        } while(i >= -10);

//        do{
//            System.out.println((int) Math.pow(i,2));
//            i*=2;
//        }while(i <= 500);
//        for (i = 1; i <=500; i*=2){
//            System.out.println((int) Math.pow(i,2));
//        }

        // ### Fizz Buzz
        for (i = 1; i <=100; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz: " + i);
            } else if (i%3 ==0) {
                System.out.println("Fizz: " + i);
            } else if (i%5 ==0){
                System.out.println("Buzz: " + i);
            } else {
                System.out.println(i);
            }
        }

    }
}
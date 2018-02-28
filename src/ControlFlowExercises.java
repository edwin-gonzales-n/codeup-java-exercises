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
//        do {
//            System.out.printf("%d ", i);
//            i-=5;
//        } while(i >= -10);
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536
        int i = 1;
        do{
            System.out.println((int) Math.pow(i,2));
            i*=2;
        }while(i <= 500);

    }
}
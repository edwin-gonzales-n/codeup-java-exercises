import java.util.ArrayList;
import java.util.List;

public class quitTest {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(8); // Line 7
        numbers.add((int) 3.6); // Line 8
        for (Integer number: numbers) System.out.println(number); // Line 9
    }

}

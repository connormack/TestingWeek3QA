import java.util.Scanner;

public class FizzBuzz {
    public static String output_fizz(int maxVal){
        StringBuilder output_string = new StringBuilder();
        for (int i = 1; i <= maxVal; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output_string.append("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                output_string.append("Fizz");
            }
            else if (i % 5 == 0)
            {
                output_string.append("Buzz");
            }
            else
            {
                output_string.append(String.valueOf(i));
            }
            output_string.append(", ");
        }


        return output_string.toString();
    }

    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        System.out.println("Input Number Here");
        int num_in = user_in.nextInt();
        FizzBuzz obj = new FizzBuzz();
        String answer1 = output_fizz(num_in);
        System.out.println(answer1);

    }
}

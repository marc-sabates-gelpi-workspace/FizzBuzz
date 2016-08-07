public class FizzBuzz {
    public static final void main(String argv[]){
        for(int i = 1; i <= 100; i++){
            System.out.println(FizzBuzz.fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int number) {
        boolean fizz = (number % 3 ) == 0;
        boolean buzz = (number % 5 ) == 0;
        String result = "";

        if (fizz) result += "Fizz";
        if (buzz) result += "Buzz";
        if (!fizz && !buzz) result += String.valueOf(number);

        return result;
    }
}

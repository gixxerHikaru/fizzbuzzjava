public class Fizzbuzz {
    static String answer(int x) {
        if(x%5 == 0){
            return "buzz";
        }
        else if(x%3 == 0){
            return "fizz";
        }
        else {
            return Integer.toString(x);
        }

    }
}

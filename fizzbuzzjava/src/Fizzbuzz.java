public class Fizzbuzz {
    static String answer(int x) {
        String answer;
        if(x == 3){
            answer = "fizz";
        } else {
            answer = Integer.toString(x);
        }
        return answer;
    }
}

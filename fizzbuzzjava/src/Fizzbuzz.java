public class Fizzbuzz {
    static String answer(int x) {
        String answer;
        answer = switch (x) {
            case 5 -> "buzz";
            case 3 -> "fizz";
            default -> Integer.toString(x);
        };
        return answer;
    }
}

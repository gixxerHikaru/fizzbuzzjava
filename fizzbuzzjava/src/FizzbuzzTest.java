import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzbuzzTest {
    @Test
    public void test入力値1の時出力値1() {
        int x = 1;
        Fizzbuzz.answer(x);
        assertEquals("1", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値2の時出力値2() {
        int x = 2;
        Fizzbuzz.answer(x);
        assertEquals("2", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値3の時出力値fizz() {
        int x = 3;
        Fizzbuzz.answer(x);
        assertEquals("fizz", Fizzbuzz.answer(x));
    }
}

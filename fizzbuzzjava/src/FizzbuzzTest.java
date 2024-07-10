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

    @Test
    public void test入力値4の時出力値4() {
        int x = 4;
        Fizzbuzz.answer(x);
        assertEquals("4", Fizzbuzz.answer(x));
    }
    
    @Test
    public void test入力値5の時出力値buzz() {
        int x = 5;
        Fizzbuzz.answer(x);
        assertEquals("buzz", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値6の時出力値fizz() {
        int x = 6;
        Fizzbuzz.answer(x);
        assertEquals("fizz", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値7の時出力値7() {
        int x = 7;
        Fizzbuzz.answer(x);
        assertEquals("7", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値8の時出力値8() {
        int x = 8;
        Fizzbuzz.answer(x);
        assertEquals("8", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値9の時出力値fizz() {
        int x = 9;
        Fizzbuzz.answer(x);
        assertEquals("fizz", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値10の時出力値buzz() {
        int x = 10;
        Fizzbuzz.answer(x);
        assertEquals("buzz", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値11の時出力値11() {
        int x = 11;
        Fizzbuzz.answer(x);
        assertEquals("11", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値12の時出力値fizz() {
        int x = 12;
        Fizzbuzz.answer(x);
        assertEquals("fizz", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値13の時出力値13() {
        int x = 13;
        Fizzbuzz.answer(x);
        assertEquals("13", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値14の時出力値14() {
        int x = 14;
        Fizzbuzz.answer(x);
        assertEquals("14", Fizzbuzz.answer(x));
    }

    @Test
    public void test入力値15の時出力値fizzbuzz() {
        int x = 15;
        Fizzbuzz.answer(x);
        assertEquals("fizzbuzz", Fizzbuzz.answer(x));
    }

}

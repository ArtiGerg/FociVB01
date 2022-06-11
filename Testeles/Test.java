package Testeles;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.Test
    void isPrime() {
        assertFalse(Prime.isPrime(-1));
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(2));
        assertFalse(Prime.isPrime(10));
        assertFalse(Prime.isPrime(100));
        assertFalse(Prime.isPrime(13));

    }
}
package com.fizbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz()
    {
        String temp =" 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz" ;
        FizzBuzz  fizz= new FizzBuzz();
        fizz.printFizzBuzz();
       assertEquals(temp, fizz.printFizzBuzz());
    }

}

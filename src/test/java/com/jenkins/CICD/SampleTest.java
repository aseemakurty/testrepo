package com.jenkins.CICD;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

public class SampleTest {


     Sample sample = new Sample();

    @Test
    public void testFizzOrBuzz_case1() throws Exception{
        String expected = sample.fizzOrBuzz(10);
        Assert.assertEquals("Buzz",expected);
    }

    @Test
    public void testFizzOrBuzz_case2() throws Exception{
        String expected = sample.fizzOrBuzz(15);
        Assert.assertEquals("Fizz",expected);
    }

    @Test
    public void testFizzOrBuzz_case3() throws Exception{
        String expected = sample.fizzOrBuzz(18);
        Assert.assertEquals("Fizz",expected);
    }
}

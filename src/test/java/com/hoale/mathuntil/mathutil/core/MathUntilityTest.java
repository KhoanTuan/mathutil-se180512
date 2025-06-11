package com.hoale.mathuntil.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MathUntilityTest {

    @Test //@test tương đương hàm Main() biến mỗi testcase thì thành test run, thành main() để chạy
    public void verifyFactorialGivenRightArg0RunsWell(){
        assertEquals(6, MathUntility.getFactorial(3));

    }

    @Test //@test tương đương hàm Main() biến mỗi testcase thì thành test run, thành main() để chạy
    public void verifyFactorialGivenRightArg1RunsWell(){
        assertEquals(2, MathUntility.getFactorial(2));

    }

    @Test //@test tương đương hàm Main() biến mỗi testcase thì thành test run, thành main() để chạy
    public void verifyFactorialGivenRightArg2RunsWell(){
        assertEquals(1, MathUntility.getFactorial(1));

    }

    @Test //@test tương đương hàm Main() biến mỗi testcase thì thành test run, thành main() để chạy
    public void verifyFactorialGivenRightArg3RunsWell(){
        assertEquals(1, MathUntility.getFactorial(0));

    }
}
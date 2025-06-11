package com.hoale.mathuntil;

import com.hoale.mathuntil.mathutil.core.MathUntility;


public class Main {
    public static void main(String[] args) {
    verifyFactorialGivenRightArg0RunsWell();
    verifyFactorialGivenRightArg1RunsWell();
    verifyFactorialGivenRightArg2RunsWell();
    verifyFactorialGivenRightArgsRunsWell();
    }
        // test thử hàm tính giai thừa gọi trong main
        //  tạo test case
        // test case #1: VERIFY THE GETFACTORIAL()WITH N= 0
        // STEP:
    //          GIVEN N =0
    //          CALL getFactorial (n = 0)
    //     EXPECTED RESULT:
    //      the mothod must return 1 as the result of 0! = 1


    public static void verifyFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1;
        long actual = MathUntility.getFactorial(n);
        //test là so sánh
        System.out.println(n+"! = expected: " + expected + " , actual: " + actual);
    }
    // test case #2: VERIFY THE GETFACTORIAL()WITH N= 1
    public static void verifyFactorialGivenRightArg1RunsWell(){
        int n = 1;
        long expected = 1;
        long actual = MathUntility.getFactorial(n);
        //test là so sánh
        System.out.println(n+"! = expected: " + expected + " , actual: " + actual);
    }
    // test case #3: VERIFY THE GETFACTORIAL()WITH N= 2
    public static void verifyFactorialGivenRightArg2RunsWell(){
        int n = 2;
        long expected = 2;
        long actual = MathUntility.getFactorial(n);
        //test là so sánh
        System.out.println(n+"! = expected: " + expected + " , actual: " + actual);
    }
    public static void verifyFactorialGivenRightArgsRunsWell(){
        int n = 3;
        long expected = 6;
        long actual = MathUntility.getFactorial(n);
        //test là so sánh
        System.out.println(n+"! = expected: " + expected + " , actual: " + actual);
        n = 4;
        expected = 24;
        actual = MathUntility.getFactorial(n);
        //test là so sánh
        System.out.println(n+"! = expected: " + expected + " , actual: " + actual);
        n = 5;
        expected = 120;
        actual = MathUntility.getFactorial(n);
        //test là so sánh
        System.out.println(n+"! = expected: " + expected + " , actual: " + actual);
        n = 6;
        expected = 720;
        actual = MathUntility.getFactorial(n);
        //test là so sánh
        System.out.println(n+"! = expected: " + expected + " , actual: " + actual);
    }
}
// Kĩ thuật vừa gõ code, vừa gõ test case, vừa gõ test run được gọi là
// TDD (đưa vào CV) test Driven Development
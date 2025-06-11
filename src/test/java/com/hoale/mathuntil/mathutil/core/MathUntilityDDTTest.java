package com.hoale.mathuntil.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUntilityDDTTest {
    private MathUntility MathUtility;
    // chuẩn bị bộ DATA ĐỂ RIÊNG  -ĐD- DATA DRIVEN
    // LÁT HỒI FILL VÀO HÀM SO SÁNH  T TESTING
    // FILL VÀO QUA THAM SỐ HÀM - HÀM LÀM VIỆC VỚI NHIỀU DATA
    // DDT CÒN GỌI TÊN KHÁC : PARAMETERIZED TESTING -> KIỂM THỬ THEO KIỂU THAM SÓO HÓA

    // BỘ DATA : NẰM TRONG HÀM STATIC - TĨNH 1 CHỖ ĐỂ CÁC NƠI NÀO VÀO LẤY
    // BỘ DATA: THƯỜNG LÀ MẢNG 2 CHIỀU , GIÁ TRỊ ĐẦU VÀO VÀ GIÁ TRIJ KÌ VỌNG
    // BỘ DATA : THƯỜNG LÀ MẲNG 2 CHIỀU, GIÁ TRỊ ĐÀU VÀO VÀ GIÁ TRI KÌ VỌNG
    public static Object [][] initData(){
        return new Object[][]{{0,1},
                              {1,1},
                              {2,2},
                              {3,6},
                              {4,24},
                              {5,120},
                              {6,720}};
                 //n expected
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected){
        assertEquals(expected , MathUntility.getFactorial(n));
    }


}
package com.hoale.mathuntil.mathutil.core;

public class MathUntility {
    //class dùng cung cấp các hàm tính toán toán học
    // bắt chước class math. trong jdk
    // vì những thứ này tính xong rồi trả ra không cần tính lại,
    // nên ta làm nó static
    // ta làm hàm tính N! = 1.2.3.4....N
    //quy ước:
    // 0! = 1
    //không có gia thừa số âm
    //20! vừa đủ kiểu long,
    public static long getFactorial(int n){
        if (n <0 || n>20){
            throw new IllegalArgumentException("n must be between 0 and 20");
            // if data
        }
        if(n == 0) return 1;

        //tinh n!=1,2,3,4..... thuật toán con heo đất, ốc bu nhồi thịt, nhân dồn, cộng dồn tích lũy
        long result  = 1 ;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;
    }

}

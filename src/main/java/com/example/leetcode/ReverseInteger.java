package com.example.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        long reversedNum = 0;

        while(x!=0){
            int lastDigit = x%10;
            reversedNum +=lastDigit;
            reversedNum = reversedNum * 10;
            x=x/10;
        }
        reversedNum = reversedNum /10;
        if(reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE ){
            return 0;
        }
        if(x<0){
            return (int) (-1*reversedNum);
        }
        return (int) reversedNum;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 123;
        System.out.println(reverseInteger.reverse(x));
    }

}

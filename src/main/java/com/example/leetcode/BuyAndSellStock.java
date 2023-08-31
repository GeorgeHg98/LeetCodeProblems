package com.example.leetcode;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit;
        int n = prices.length;
        int smallestPrice = Integer.MAX_VALUE;
        for(int i = 0; i< n; i++){
            if(prices[i] < smallestPrice){
                smallestPrice = prices[i];
            }
            profit = prices[i] - smallestPrice;
            if(maxProfit < profit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(buyAndSellStock.maxProfit(prices));
    }
}

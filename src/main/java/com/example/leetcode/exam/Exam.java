package com.example.leetcode.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);

        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);
    }

}

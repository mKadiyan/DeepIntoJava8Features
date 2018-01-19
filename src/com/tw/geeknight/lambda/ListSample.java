package com.tw.geeknight.lambda;

import java.util.Arrays;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,3,4,2,5,6,7,7);
        numbers.stream()
                .filter((number) -> {
                    System.out.println("first "+number);
                    return number % 2 == 0;
                })
                .filter((number) -> {
                    System.out.println("second "+number);
                    return number > 3;
                })
                .findFirst();




    }
}

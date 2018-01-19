package com.tw.geeknight.lambda;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        List<String> data = Arrays.asList("Hello","Lambda","Expression");

        data.stream().map(str -> str.length())
                    .map(val -> Integer.toHexString(val))
                    .forEach(result -> System.out.println(result+"here"));

        data.stream().map(String::length)
                    .map(Integer::toHexString)
                    .forEach(System.out::println);
    }
}

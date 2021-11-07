package learn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    fun(12,23,23,345,66);

    }
    static void fun(int...v)// taking as array of integer.
    {

        System.out.println(Arrays.toString(v));


    }
}
/*
*** varargs :- varargs allows the method or function to accept multiple or zero arguments.
* Before varargs we use overloaded method or take an array as method parameter , but it is not considered as practice
  */

package com.ideal.jdk8.lambda;

public class Something {

    public Something() {};

    public Something(String something) {
        System.out.println("call Something(String something):" + something);
    }

    public static String staticMethod(String str) {
        System.out.println("call static method");
        return "static" + str;
    }

    public String startWith(String str) {
        System.out.println("call object method");
        return String.valueOf(str.charAt(str.length() - 1));
    }

    public static String lambdaMethod(String string, IConvert<String, String> iConvert) {
        System.out.println("call lambdaMethod");
        String lStr = iConvert.convert(string);
        return "lambdaMethod" + lStr;
    }
}

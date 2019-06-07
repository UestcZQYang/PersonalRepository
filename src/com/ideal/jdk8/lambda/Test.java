
package com.ideal.jdk8.lambda;
public class Test {

    public static void main(String args[]) {
        IConvert<String, String> iConvert1 = Something::staticMethod;
        String str1 = iConvert1.convert("arg1");

        IConvert<String, Something> iConvert2 = Something::new;
        Something something = iConvert2.convert("arg2");

        Something something3 = new Something();
        IConvert<String, String> iConvert3 = something3::startWith;
        String str3 = iConvert3.convert("arg3");

        System.out.println(Something.lambdaMethod("arg4", (x) -> {
            return x + "->";
        }));
    }

}

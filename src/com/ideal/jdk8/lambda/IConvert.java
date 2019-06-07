package com.ideal.jdk8.lambda;

@FunctionalInterface
public interface IConvert<T, F> {
    F convert(T t);
}

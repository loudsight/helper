package com.loudsight.useful.helper;


public class Helper {

//    fun <T: Any> toKClass(aClass: Class<T>): KClass<T> {
//        return aClass.kotlin
//    }

    public static <T> T uncheckedCast(Object entity) {
        return (T)entity;
    }
}
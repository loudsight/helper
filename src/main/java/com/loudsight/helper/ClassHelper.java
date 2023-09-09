package com.loudsight.helper;


public class ClassHelper {

//    fun <T: Any> toKClass(aClass: Class<T>): KClass<T> {
//        return aClass.kotlin
//    }

    /**
     * Method to cast a given type to an arbitrary type. The small size of the method means it will likely be in-lined
     * by the JVM compiler The method is may be used to deal with situations where a warning is produced by the compiler
     * stating that a given is an unsafe one i.e. "Type safety: Unchecked cast from O to T" Using this method reduces the
     * number of places where the @SuppressWarnings annotation is required and restricts the suppression of warning to this
     * method only - ensuring that real warnings aren't inadvertently hidden. The method infers the target type from the
     * required return type as illustrated below:<br></br>
     * `
     * // Ex.
     * <br />
     * T typedObject = Cast.uncheckedCast(object) // where T is the target type
     * ` *
     *
     * @param entity - Object to cast
     * @return the typed object
     */
    public static <T> T uncheckedCast(Object entity) {
        return (T)entity;
    }
}
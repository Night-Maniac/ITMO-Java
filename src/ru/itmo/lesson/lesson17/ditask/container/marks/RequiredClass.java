package ru.ifmo.base.lesson17.ditask.container.marks;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Делай эксепшн если проперти файл неправельный максимум эксепшенов
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiredClass {
}

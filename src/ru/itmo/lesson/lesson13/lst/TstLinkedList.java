package ru.itmo.lesson.lesson13.lst;

public class TstLinkedList {
    public static void main(String[] args) {
        SimpleLinkedList<String> list = new SimpleLinkedList();
        list.add("23");
        list.add("12");

        System.out.println(list.get(1)); //получение по индексу

    }
}

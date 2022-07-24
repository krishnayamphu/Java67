package com.mt.collections;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<Book> booklist=new LinkedList<>();
        Book b1=new Book("c programming","abc",200);

        Book b2=new Book();
        b2.setTitle("Java Program");
        b2.setAuthor("abc");
        b2.setPrice(400);

        booklist.add(b1);
        booklist.add(b2);
        for(Book book:booklist){
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            System.out.println(book.getPrice());
            System.out.println("===============");
        }

        booklist.add(new Book("WEB Design","xyz",200));
        for(Book book:booklist){
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            System.out.println(book.getPrice());
            System.out.println("===============");
        }

    }
}

package com.company;

public class Main {
    
    public static void main(String[] args) {
        SimpleXMLParser xml = new SimpleXMLParser("c:\\1.xml");
        String value = xml.get("catalog/book/author");
        System.out.println(value);

    }  
}
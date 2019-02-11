package com.ashok;

public class Allstring {

        String str = "Hello";
        Integer strLength = 5;
    public void displayStrings() {
        System.out.println("String Length is :" +str.length());
        System.out.println("Character at index 2 is:" +str.charAt(2));
        System.out.println("The concatenated string is :" + str.concat("world"));
        System.out.println("String comparison is :" + str.compareTo("Ashok"));
        System.out.println("Index of O is :" + str.indexOf("o"));
        System.out.println("The replaced e is " + str.lastIndexOf("e"));
        System.out.println("The repalcement of strins is ::" + str.replace("e", "a"));
        System.out.println("Substring is::"+str.substring(2, 5));
        System.out.println("The text in lowercase is::"+str.toLowerCase());
        System.out.println("The text to uppercase is::"+str.toUpperCase());
        System.out.println("Integer to String is:"+strLength.toString());
        System.out.println("The untrimmed:: "+str.trim());
    }

    public static void main(String[] args) {
        Allstring objString=new Allstring();
        objString.displayStrings();

    }
}


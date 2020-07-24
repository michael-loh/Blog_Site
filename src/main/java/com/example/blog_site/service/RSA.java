package com.example.blog_site.service;

import java.util.ArrayList;

public class RSA {
    private static int p = 1193;
    private static int q = 457;
    private static int e = 4033;
    private static String password = "herro";

    public static int[] generate(int p, int q, int e){

        int[] arr = {p*q, e};

        return arr;
    }

    public static int modExp(int b, int e, int m){
        if (e==0) {return 1;}
        else if (e%2 == 0) {
            return (int) (Math.pow((Math.pow(b,Math.floorDiv(e, 2))%m),2)%m); }
        else {return (int) (Math.pow(b,(e-1)%m))%m;}
    }

    public static String encrypt(String text, int[] key){
        ArrayList<Integer> asciiList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++){
            int ascii = (int) text.charAt(i);
            asciiList.add(ascii);
        }
        String encrypted = "";
        for (int i=0; i < asciiList.size(); i++){
            encrypted += Integer.toString(modExp(i, key[1], key[0]));
        }
        return encrypted;
    }


    public static void main(String[] args) {

        System.out.println(encrypt(password, generate(p, q, e)));
    }
}
package com.leapfrog.classpractice;

import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        String text = "AAAA!wwwweeeerhhhqwe ";
        String output = "";
        int count = 0;
        char prev = '0';
        for(int i = 0; i<text.length();i++){
            if(prev=='0'){
                prev= text.charAt(i);
                count=1;
            }
            else if(prev!=text.charAt(i)){
                System.out.print(count + String.valueOf(prev));
                prev=text.charAt(i);
                count = 1;
            }else{
                count++;
            }
            
        }
        System.out.println("");
    }
}
package com.example.demostring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoStringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoStringApplication.class, args);
        //các cách để tạo biến String
      //  1. Sử dụng String Literal
      //  String literal được tạo ra bằng cách sử dụng 2 dấu nháy kép. Ví dụ:
        String a = "welcome";
      //  2. Sử dụng từ khóa new
        String b =new String("Welcome");


        //Cách so sánh 2 chuỗi (Sử dụng Phương thức equals() hoặc toán tử ==)
        String s1 = "laptrinhtudau";
        String s2 = "laptrinhtudau";
        String s3 = new String("PHP");
        String s4 = "Java";
        String s5 = new String("laptrinhtudau");
        String s6 = new String("laptrinhtudau");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s5==s6);
    }

}

package com.example.demojavacore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJavaCoreApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoJavaCoreApplication.class, args);

//        // Truy cập qua tên lớp (cách khuyến khích)
//        System.out.println(Demo.count);
//        Demo.printMessage();

//        // Truy cập qua đối tượng (không nên)
//        Demo obj = new Demo();
//        System.out.println(obj.count);
//        obj.printMessage();

    }


//    //demo static , final
//    public class Demo {
//        public static int count = 0;  // Thuộc tính static
//
//        public static void printMessage() {  // Phương thức static
//            System.out.println("Hello from static method!");
//        }










}

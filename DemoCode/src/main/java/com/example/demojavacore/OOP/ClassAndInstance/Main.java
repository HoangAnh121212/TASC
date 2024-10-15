package com.example.demojavacore.OOP.ClassAndInstance;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();  // Tạo một instance của class Dog
        dog1.name = "Buddy";    // Gán giá trị cho thuộc tính
        dog1.age = 3;           // Gán giá trị cho thuộc tính
        dog1.bark();            // Gọi phương thức bark

        Dog dog2 = new Dog();   // Tạo một instance khác
        dog2.name = "Max";
        dog2.age = 2;
        dog2.bark();            // Gọi phương thức bark
    }
}
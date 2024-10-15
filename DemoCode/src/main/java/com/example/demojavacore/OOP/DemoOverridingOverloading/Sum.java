package com.example.demojavacore.OOP.DemoOverridingOverloading;

public class Sum extends Calculate{

    // Ghi đè phương thức Sum từ lớp cha
    @Override
    public void Sum(Integer a, Integer b) {
        System.out.println("Tổng trong Sum: " + (a + b));
    }

    // Nạp chồng với tham số kiểu khác (double)
    void Sum(double a, double b) {
        System.out.println("Tổng hai số thực: " + (a + b));
    }

    // Nạp chồng với số lượng tham số khác
    void Sum(Integer a, Integer b, Integer c) {
        System.out.println("Tổng ba số nguyên: " + (a + b + c));
    }

    public static void main(String[] args) {
        Sum sum = new Sum();

//        // Gọi các phương thức nạp chồng
        sum.Sum(5, 10);                    // Gọi phương thức từ lớp cha
        sum.Sum(2.5, 3.5);                 // Gọi phương thức nạp chồng với double
        sum.Sum(1, 2, 3);                  // Gọi phương thức nạp chồng với 3 tham số

        Calculate calcObj = new Sum();
        calcObj.Sum(3, 7);  // Vẫn gọi phương thức ghi đè trong lớp Sum

    }
}

package com.example.demojavacore.FinalStatic;

public class DemoFinalStatic {
    static int staticVar = 10;  // Biến static
    final int finalVar;          // Biến final

    // Constructor
    public DemoFinalStatic(int value) {
        finalVar = value;  // Phải khởi tạo finalVar trong constructor
    }

    // Phương thức main
    public static void main(String[] args) {
        DemoFinalStatic obj1 = new DemoFinalStatic(5);
        DemoFinalStatic obj2 = new DemoFinalStatic(10);

        // staticVar có thể thay đổi
        System.out.println("Static variable: " + staticVar);  // Kết quả: 10
        staticVar = 20;  // Thay đổi giá trị
        System.out.println("Static variable after change: " + staticVar);  // Kết quả: 20

        // finalVar không thể thay đổi
        System.out.println("Final variable of obj1: " + obj1.finalVar);  // Kết quả: 5
        // obj1.finalVar = 15;  // Lỗi: Không thể thay đổi finalVar
        StringChange();
    }

    //có thể thay đổi nội dung đối tượng final(nếu đối tưọngw đó là mutable)
    public static void StringChange(){
                final int x = 10;  // Biến final
                // x = 20;  // Lỗi: Không thể gán lại giá trị cho x

                final StringBuilder sb = new StringBuilder("Hello");
                sb.append(" World");  // Có thể thay đổi nội dung của đối tượng
                System.out.println(sb);  // Kết quả: Hello World

                // sb = new StringBuilder("New");  // Lỗi: Không thể gán lại cho sb

    }
}

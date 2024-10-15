I.Tìm hiểu về các đặc điểm và tính chất của String trong java
-Một đối tượng String là chuỗi ký tự dùng để lưu dữ các ký tự theo một dãy có thứ tự, số ký tự lưu được không hạn chế, có thể biểu diễn chuỗi trên một dòng với các ký tự trong dấu nháy kép ""
-Tính chất của String 
+Tính bất biến :
Một khi một đối tượng String được tạo, nó không thể thay đổi nội dung.
Khi thực hiện các thao tác như nối chuỗi hoặc thay thế, Java tạo ra một đối tượng mới, thay vì thay đổi đối tượng hiện có.
ví dụ :
String str1 = "Hello";
String str2 = str1.concat(" World");  // Tạo ra chuỗi mới "Hello World"
System.out.println(str1);  // Kết quả: Hello
System.out.println(str2);  // Kết quả: Hello World

+String là 1 đối tượng :
String không phải là kiểu nguyên thủy, mà là một lớp trong Java (java.lang.String).
Khi khai báo String, đối tượng này được lưu trong String Pool để tối ưu bộ nhớ.
ví dụ :
String str1 = "Java";  // Lưu trong String Pool
String str2 = "Java";  // Sử dụng lại đối tượng trong String Pool
System.out.println(str1 == str2);  // true, cùng tham chiếu

+String Pool trong Java:
Java sử dụng String Pool để tối ưu bộ nhớ, nơi các chuỗi có nội dung giống nhau sẽ dùng chung một tham chiếu.
Nếu bạn tạo chuỗi bằng từ khóa new, đối tượng sẽ được lưu trong heap memory, không sử dụng String Pool.
ví dụ :
String str1 = "Java";  // Lưu trong String Pool
String str2 = new String("Java");  // Tạo đối tượng mới trong heap
System.out.println(str1 == str2);  // false, khác tham chiếu

+Các phương thức phổ biến trong String 
length(): Trả về độ dài chuỗi.
charAt(int index): Lấy ký tự tại vị trí chỉ định.
substring(int beginIndex, int endIndex): Lấy chuỗi con.
indexOf(String s): Tìm vị trí đầu tiên của chuỗi con.
equals(Object obj): So sánh nội dung chuỗi.
equalsIgnoreCase(String anotherString): So sánh không phân biệt chữ hoa/thường.
toUpperCase() / toLowerCase(): Chuyển chuỗi thành chữ hoa/thường.
trim(): Loại bỏ khoảng trắng ở đầu và cuối chuỗi

+Nối chuỗi bằng +
+Hỗ trợ so sánh (equals, compareTo)	
+Hỗ trợ Regex	
+StringBuilder / StringBuffer	




II.Có bao nhiêu cách để tạo 1 biến String
Có 2 cách để tạo đối tượng String:
Sử dụng string literal
Sử dụng từ khóa new
1. Sử dụng String Literal
String literal được tạo ra bằng cách sử dụng 2 dấu nháy kép. Ví dụ:
String s = "welcome"; 
2. Sử dụng từ khóa new
String s=new String("Welcome"); 



III. StringPool

1. String pool là gì ?
String pool là một vùng nhớ đặc biệt nằm trong vùng nhớ Heap (Heap memory), dùng để lưu trữ các biến được khai báo theo kiểu String.
String pool giúp tối ưu hoá việc lưu trữ và sử dụng vùng nhớ khi khai báo biến String, giúp hạn chế tình trạng tràn bộ nhớ Java Heap Space.

IV .Làm sao để so sánh hai chuỗi trong java
Sử dụng phương thức equals() hoặc toán tử ==
 Vì các cách khia báo String khác nhau sẽ lưu vào StringPool theo nhiều cách khác nhau , vì vậy cũng có nhiều cách để so sánh 2 chuỗi
 -Toán tử == thường sử dụng để so sánh gía trị được lưu cùng trong địa chỉ bộ nhớ
 - Phương thức equals() thường so sánh gía trị của các object được lưu ở 2 vùng bộ nhớ khác nhau 
 ví dụ :
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

  kết quả trả về :
true
false
false
false


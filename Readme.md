# java
I.Primitive and Object data type
1. Phân biệt kiểu dữ liệu nguyên thủy và kiểu dữ liệu object
Kiểu dữ liệu nguyên thủy (Primitive types)
-Lưu trữ trực tiếp giá trị trong bộ nhớ.
- Không có thuộc tính hoặc phương thức đính kèm.
- Khi truyền vào hàm, dữ liệu được truyền bằng giá trị (pass by value), tức là tạo ra một bản sao độc lập.
- Chiếm ít bộ nhớ hơn và có hiệu suất xử lý nhanh.
Kiểu dữ liệu đối tượng (Object types)
Kiểu đối tượng là những kiểu dữ liệu phức tạp, có thể chứa nhiều giá trị và chức năng bên trong.
-Lưu trữ tham chiếu đến địa chỉ của đối tượng trong bộ nhớ (chứ không trực tiếp lưu giá trị).
-Có thể chứa thuộc tính và phương thức.
-Khi truyền vào hàm, dữ liệu được truyền bằng tham chiếu (pass by reference), nghĩa là hàm có thể thay đổi giá trị của đối tượng ban đầu.
-Tốn nhiều bộ nhớ hơn do cần lưu thông tin về cấu trúc của đối tượng.
Như vậy điểm khác biệt giữa 2 kiểu dữ liệu đối tượng và nguyên thủy đó là 1 thằng có tính tham chiếu và 1 thằng có tính tham trị và khi sử dụng chúng nó sẽ khác nhau về việc cấp phát địa chỉ ô nhớ và các refernces vào địa chỉ ô nhớ đó.
2. Có thể chuyển đổi giữa hai kiểu dữ liệu này không ?
Việc chuyển đổi giữa 2 kiểu dữ liệu này là hoàn toàn khả thi.
•  Boxing: Chuyển kiểu nguyên thủy thành đối tượng tương ứng (gói giá trị vào object).
•  Unboxing: Lấy giá trị từ object và chuyển thành kiểu nguyên thủy.
Ví dụ :
// Boxing: Chuyển int thành Integer(Object) 
int a = 5; 
Integer obj = Integer.valueOf(a); // Boxing thủ công

 // Autoboxing (Java tự động chuyển đổi) Integer obj2 = a; 

// Unboxing: Lấy giá trị từ object Integer
 int b = obj.intValue(); // Unboxing thủ công 

// Auto-unboxing int c = obj2;

3. Có thể so sánh hai kiểu dữ liệu này với nhau không?
Có thể so sánh 2 kiểu dữ liệu này , cụ thể :
•  Nguyên thủy được so sánh bằng toán tử == , != , < , >
Tại vì nguyên thuỷ thì lưu giá trị trên cùng 1 vùng bộ nhớ , tức là nếu có gía trị trước đó được lưu vào vùng bộ nhớ này thì khi có giá trị mới cần so sánh , nó sẽ tìm đến vùng bộ nhớ này để xem đã tồn tại giá trị được so sánh hay chưa .
•  Object so sánh bằng tham chiếu. Nếu muốn so sánh nội dung, bạn phải dùng phương thức .equals().

Ví dụ :
// So sánh nguyên thủy
 int a = 5; int b = 5;
 System.out.println(a == b); // true, vì giá trị bằng nhau
 // So sánh object (String) 
String str1 = new String("Hello");
 String str2 = new String("Hello"); 
System.out.println(str1 == str2); // false, vì khác tham chiếu 
System.out.println(str1.equals(str2)); // true, vì cùng nội dung

4. Giá trị khi khởi tạo biến với hai loại kiểu dữ liệu này là gì?
•  Kiểu nguyên thủy: Khi khai báo, biến sẽ được gán giá trị mặc định tùy thuộc vào loại dữ liệu.
•  Object: Khi khai báo, biến object sẽ có giá trị mặc định là null nếu chưa được khởi tạo cụ thể.



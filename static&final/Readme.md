I. Thế nào là static ? Phương thức, thuộc tính khai báo bằng từ khóa static được sử dụng khi nào ? Làm thế nào để truy cập được tới phương thức, thuộc tính static

1. Khái niệm static trong Java
static là một từ khóa trong Java, được dùng để định nghĩa các thuộc tính (fields) hoặc phương thức (methods) mà thuộc về lớp (class) chứ không thuộc về đối tượng (instance).
Điều này có nghĩa là biến hoặc phương thức được khai báo là static sẽ được chia sẻ chung giữa tất cả các đối tượng của lớp đó và không cần tạo đối tượng để truy cập.

2. Thuộc tính và phương thức static
2.1. Thuộc tính static
-Thuộc tính được khai báo là static sẽ chỉ tồn tại duy nhất một bản sao trong bộ nhớ, bất kể có bao nhiêu đối tượng của lớp đó được tạo ra.
-Không cần tạo đối tượng để truy cập thuộc tính này, mà có thể truy cập trực tiếp thông qua tên lớp.

-Thuộc tính static được dùng khi bạn muốn một giá trị chung cho tất cả các đối tượng, ví dụ:
Đếm số lượng đối tượng đã được tạo.
Một hằng số chung cho toàn bộ lớp (như Math.PI).
2.2. Phương thức static
-Phương thức khai báo là static có thể được gọi mà không cần tạo đối tượng của lớp.
-Phương thức static không thể truy cập các thuộc tính hoặc phương thức non-static (vì các thuộc tính và phương thức non-static chỉ có sau khi đối tượng được tạo).

-Phương thức static được dùng khi:
Phương thức không phụ thuộc vào dữ liệu của đối tượng.
Bạn cần một phương thức tiện ích (utility), chẳng hạn như các phương thức trong lớp Math (Math.sqrt(), Math.abs()).

3. Cách truy cập thuộc tính và phương thức static
Có 2 cách truy cập:
Truy cập thông qua tên lớp: (Cách khuyến khích dùng)
Truy cập thông qua đối tượng: (Dù được phép, nhưng không nên dùng vì thiếu rõ ràng)

II.Thế nào là final ? Khai báo 1 biến final khác gì với static, biến khai báo bằng final có thể chỉnh sửa được không ? Nếu được cho ví dụ minh họa.

1. Khái niệm final trong Java
final là một từ khóa trong Java được dùng để đánh dấu một biến, phương thức hoặc lớp không thể bị thay đổi hoặc ghi đè. Khi một đối tượng, phương thức, hoặc lớp được khai báo với từ khóa final, nó sẽ không thể thay đổi sau khi đã được định nghĩa.

2. Khai báo 1 biến final khác gì với static, biến khai báo bằng final có thể chỉnh sửa được không ?
-Biến static có thể thay đổi giá trị. Sau khi gán giá trị mới cho nó, ta vẫn có thể truy cập và thấy giá trị mới.
-Biến final được khởi tạo thông qua constructor và không thể thay đổi sau khi đã được gán, cho dù ta có nhiều đối tượng khác nhau.

-Nếu biến là kiểu tham chiếu (reference type), nó không thể trỏ đến một đối tượng khác, nhưng nội dung của đối tượng vẫn có thể thay đổi (nếu đối tượng đó là mutable).
ví dụ :
public static void main(String[] args) {
        final int x = 10;  // Biến final
        // x = 20;  // Lỗi: Không thể gán lại giá trị cho x

        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");  // Có thể thay đổi nội dung của đối tượng
        System.out.println(sb);  // Kết quả: Hello World

        // sb = new StringBuilder("New");  // Lỗi: Không thể gán lại cho sb
    }




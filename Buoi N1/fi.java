public class fi {  
    public static int removeElement(int[] a, int val) {  
        int n = a.length; // Lấy độ dài của mảng a  
        for (int i = 0; i < n; i++) { // Duyệt qua từng phần tử của mảng  
            if (a[i] == val) { // Nếu phần tử bằng giá trị cần xóa  
                // Xóa phần tử a[i] và giữ nguyên  
                for (int j = i; j < (n - 1); j++) {  
                    a[j] = a[j + 1]; // Dịch chuyển các phần tử  
                }  
                n--; // Giảm kích thước mảng  
                i--; // Giảm chỉ số i để kiểm tra lại phần tử mới ở vị trí i  
            } else { // Nếu không phải xóa thì tăng i  
                i++;  
            }  
        }  
        return n; // Trả về kích thước mới của mảng  
    }  

    public static void main(String[] args) {  
        int[] a = {3, 2, 2, 3}; // Khai báo mảng a  
        System.out.println(removeElement(a, 2)); // Gọi hàm removeElement  
        System.out.println("DONE"); // In ra thông báo "DONE"  
    }  
}  

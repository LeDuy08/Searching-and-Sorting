public class FindNumbers {  
    public static int findNumbers(int[] nums) {  
        int bienDem = 0; // Biến đếm số lượng số có số chữ số chẵn  
        for (int a : nums) {  
            // Kiểm tra số chữ số của a  
            // Nếu số chữ số là chẵn => tăng biến đếm lên 1  
            int soLuongChuSo = tinhSoChuSo(a);  
            if (soLuongChuSo % 2 == 0) {  
                bienDem++;  
            }  
        }  
        return bienDem; // Trả về số lượng số có số chữ số chẵn  
    }  

    private static int tinhSoChuSo(int a) {  
        int bienDem = 0; // Biến đếm số chữ số  
        int kq = a; // Biến tạm để tính số chữ số  
        while (kq != 0) {  
            kq = kq / 10; // Chia kq cho 10  
            a = kq; // Cập nhật a  
            bienDem++; // Tăng biến đếm  
        }  
        return bienDem; // Trả về số chữ số  
    }  
}
    public static void main(String[] args) {  
        int[] nums = {1, 22, 3, 4444}; // Khai báo mảng nums  
        int[] n2 = new int[4]; // Khai báo mảng n2 với kích thước 4  

        // Duyệt và lấy các giá trị từng phần tử của mảng  
        for (int ai : nums) {  
            System.out.println("ai = " + ai);  
        }  

        // Duyệt và lấy giá trị từng phần tử của mảng và lấy index tại phần tử đó  
        for (int i = 0; i < nums.length; i++) {  
            System.out.println(i + ") a[i] = " + nums[i]);  
        }  

        // Test hàm tính số chữ số  
        System.out.println(tinhSoChuSo(1)); // Kết quả cho số 1  
        System.out.println(tinhSoChuSo(99)); // Kết quả cho số 99  
        System.out.println(tinhSoChuSo(321)); // Kết quả cho số 321  

        // Test hàm tính số chẵn của mảng  
        System.out.println(findNumbers(nums)); // Kết quả cho mảng nums  
    }  




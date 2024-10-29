import java.util.Scanner;  

public class BT1 {  
    
    // Hàm đệ quy tính tổng từ 1 đến n  
    public static int sum(int n) {  
        if (n <= 1) {  
            return n; // Điều kiện cơ sở: T(1) = 1, T(0) = 0  
        } else {  
            return n + sum(n - 1); // Đệ quy  
        }  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Nhập số nguyên dương n: ");  
        int n = scanner.nextInt();  

        if (n < 1) {  
            System.out.println("Vui lòng nhập một số nguyên dương.");  
        } else {  
            int result = sum(n);  
            System.out.println("Tổng từ 1 đến " + n + " là: " + result);  
        }  

        scanner.close();  
    }  
}  
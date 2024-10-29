import java.util.Scanner;  

public class BCNN{  

    // Hàm tính UCLN bằng thuật toán Euclid  
    public static int gcd(int a, int b) {  
        if (b == 0) {  
            return a; // Điều kiện dừng  
        } else {  
            return gcd(b, a % b); // Đệ quy  
        }  
    }  

    // Hàm tính BCNN sử dụng UCLN  
    public static int lcm(int a, int b) {  
        return Math.abs(a * b) / gcd(a, b); // Tính BCNN  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Nhập số nguyên dương a: ");  
        int a = scanner.nextInt();  

        System.out.print("Nhập số nguyên dương b: ");  
        int b = scanner.nextInt();  

        if (a <= 0 || b <= 0) {  
            System.out.println("Vui lòng nhập các số nguyên dương.");  
        } else {  
            int result = lcm(a, b);  
            System.out.println("Bội số chung nhỏ nhất (BCNN) của " + a + " và " + b + " là: " + result);  
        }  

        scanner.close();  
    }  
}  

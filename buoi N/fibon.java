import java.util.Scanner;  

public class fibon {  
    // Mảng để lưu trữ các giá trị Fibonacci đã tính  
    static long[] t = new long[100];  

    public static long fib1(int n) {  
        // Kiểm tra xem giá trị đã được tính hay chưa  
        if (t[n] != 0) return t[n];  
        
        // Điều kiện cơ sở  
        if (n < 2) {  
            t[n] = n; // fib(0) = 0, fib(1) = 1  
            return t[n];  
        } else {  
            // Tính giá trị Fibonacci bằng đệ quy  
            t[n] = fib1(n - 1) + fib1(n - 2);  
            return t[n];  
        }  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Nhập số nguyên không âm để tính số Fibonacci: ");  
        int n = scanner.nextInt();  

        if (n < 0) {  
            System.out.println("Vui lòng nhập một số không âm.");  
        } else {  
            long result = fib1(n);  
            System.out.println("Số Fibonacci tại vị trí " + n + " là: " + result);  
        }  

        scanner.close();  
    }  
}  
public class Si {  
    public static void merge(int[] n1, int m, int[] n2, int n) {  
        for (int ai : n2) {  
            chenPhanTuVaoMang(ai, n1, m);  
            m++;  
        }  
    }  

    private static void chenPhanTuVaoMang(int x, int[] a, int m) {  
        boolean timDuocK = false;  
        for (int k = 0; k < m; k++) {  
            if (a[k] > x) {  
                timDuocK = true;           
                for (int i = m - 1; i >= k; i--) {  
                    a[i + 1] = a[i];  
                }  
                a[k] = x;  
                break;  
            } 
        } 

        if (timDuocK == false) {  
            a[m] = x;  
        }  
    }  

    public static void main(String[] args) {  
        int[] n1 = {2, 3, 4, 5, 0, 0, 0}; // Mảng n1 với các phần tử ban đầu  
        int[] n2 = {0, 3, 6}; // Mảng n2 với các phần tử cần hợp nhất  

        merge(n1, 4, n2, 3);; // Gọi hàm merge để hợp nhất n2 vào n1  
        System.out.println("DONE"); // In ra thông báo "DONE"  
    }  
}
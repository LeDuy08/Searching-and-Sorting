

public class BinarySearch {  
    // Phương thức tìm kiếm nhị phân  
    public static int binarySearch(int[] arr, int target) {  
        int left = 0;  
        int right = arr.length - 1;  

        while (left <= right) {  
            int mid = left + (right - left) / 2;  

            // Kiểm tra xem mục tiêu có ở giữa không  
            if (arr[mid] == target) {  
                return mid; // Trả về chỉ số nếu tìm thấy  
            }  

            // Nếu mục tiêu lớn hơn, bỏ qua nửa bên trái  
            if (arr[mid] < target) {  
                left = mid + 1;  
            }   
            // Nếu mục tiêu nhỏ hơn, bỏ qua nửa bên phải  
            else {  
                right = mid - 1;  
            }  
        }  

        // Không tìm thấy mục tiêu  
        return -1;  
    }  
}

import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        // Nhập số lượng phần tử của mảng  
        System.out.print("Nhập số lượng phần tử của mảng: ");  
        int arrayLength = scanner.nextInt();  
        
        // Khởi tạo mảng  
        int[] arrayInput = new int[arrayLength];  
        
        // Nhập các phần tử của mảng từ bàn phím  
        System.out.println("Nhập các phần tử của mảng: ");  
        for (int i = 0; i < arrayLength; i++) {  
            System.out.print("Phần tử thứ " + (i + 1) + ": "); // Thay đổi chỉ số cho dễ đọc  
            arrayInput[i] = scanner.nextInt();  
        }  

        System.out.print("Nhập giá trị cần tìm: ");  
        int key = scanner.nextInt();  
        callMeForLinearSearch(arrayInput, key);  // Gọi phương thức tìm kiếm  
        scanner.close();  
    }  
    
    // Phương thức tìm kiếm tuyến tính  
    static void callMeForLinearSearch(int[] array, int key) {  
        boolean found = false;  
        for (int i = 0; i < array.length; i++) {  
            if (array[i] == key) {  
                System.out.println("Giá trị " + key + " được tìm thấy ở vị trí: " + i);  
                found = true;  
                break;  
            }  
        }  
        if (!found) {  
            System.out.println("Giá trị " + key + " không được tìm thấy trong mảng.");  
        }  
    }  
}


// import java.util.Scanner;  

// public class Main {  
//     public static void main(String[] args) {  
//         Scanner scanner = new Scanner(System.in);  
        
//         // Nhập số lượng phần tử của mảng  
//         System.out.print("Nhập số lượng phần tử của mảng: ");  
//         int arrayLength = scanner.nextInt();  
        
//         // Khởi tạo mảng  
//         int[] arrayInput = new int[arrayLength];  
        
//         // Nhập các phần tử của mảng từ bàn phím  
//         System.out.println("Nhập các phần tử của mảng: ");  
//         for (int i = 0; i < arrayLength; i++) {  
//             System.out.print("Phần tử thứ " + i + ": ");  
//             arrayInput[i] = scanner.nextInt();  
//         }  

//         System.out.print("Nhập giá trị cần tìm: ");  
//         int key = scanner.nextInt();  
//         callMeForLinearSearch(arrayInput, key);  
//         scanner.close();  
        
//         // callMeForMergeSort(arrayInput);  
//         // scanner.close();  
//     }  
// }










// public class Main {  
//     public static void main(String[] args) {  
//         // Gọi các phương thức tìm kiếm và sắp xếp  
//     }  

//     static void callMeForBinarySearch(int[] arrayInput, int key) {  
//         System.out.println(BinarySearch.binarySearch(arrayInput, key));  
//     }  

//     static void callMeForLinearSearch(int[] arrayInput, int key) {  
//         LinearSearch linearSearchInstance = new LinearSearch();  
//         System.out.println("Vị trí của phần tử cần tìm là: " + linearSearchInstance.linearSearch(arrayInput, key));  
//     }  

//     static void callMeForSelectionSort(int[] arrayInput) {  
//         SelectionSort selectionSortInstance = new SelectionSort();  
//         System.out.println("Mảng trước khi sắp xếp là:");  
//         selectionSortInstance.selectionSort(arrayInput);  
//         printArray(arrayInput);  
//     }  

//     static void callMeForInsertionSort(int[] arrayInput) {  
//         InsertionSort insertionSortInstance = new InsertionSort();  
//         printArray(arrayInput);  
//         insertionSortInstance.insertionSort(arrayInput);  
//         System.out.println("Mảng sau khi sắp xếp từ lớn đến bé:");  
//         printArray(arrayInput);  
//     }  

//     // Hàm in mảng  
//     static void printArray(int[] array) {  
//         for (int value : array) {  
//             System.out.print(value + " ");  
//         }  
//         System.out.println();  
//     }  
// }
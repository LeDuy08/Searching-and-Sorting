// public class Test {
//     public static void main(String[] args) {
//         LinkedList<String> ll = new LinkedList<>();
    
//     ll.addFirst("Le duy");
//     ll.addFirst("CTDL Va GIAI");
//     ll.addFirst("TITV");
//     // ll.traverse();

//     ll.addLast("Viet Nam");
//     // ll.traverse();

//     ll.insertAfter("TITV", "vn");
//     // ll.traverse();
//     System.out.println("----------------");
//     System.out.println(ll.remove(".VN"));
//     System.out.println(ll.remove(".vn"));
//     System.out.println("----------------");
//     ll.traverse();

//     // System.out.println("check empty"+ll.isEmpty());
//     }
// }

public class Test {  
    public static void main(String[] args) {  
        StudentsMS sms = new StudentsMS(); // Khởi tạo đối tượng StudentsMS  

        Student s1 = new Student(id: "MS01", fullName: "Le Nhat Tung", age: 18, gpa: 9.8f);  
        Student s2 = new Student(id: "MS02", fullName: "Nguyen Van A", age: 19, gpa: 6.6f);  
        Student s3 = new Student(id: "MS03", fullName: "Le Thi C", age: 20, gpa: 10f);  
        Student s4 = new Student(id: "MS04", fullName: "Tran Van D", age: 21, gpa: 7f);  

        sms.addStudent(s1); // Thêm sinh viên s1 vào danh sách  
        sms.addStudent(s2); // Thêm sinh viên s2 vào danh sách  
        sms.addStudent(s3); // Thêm sinh viên s3 vào danh sách  
        sms.addStudent(s4); // Thêm sinh viên s4 vào danh sách  

        sms.printList(); // In danh sách sinh viên  
    }  
}

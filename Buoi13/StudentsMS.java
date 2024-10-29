public class StudentsMS {  
    private LinkedList<Student> list; // Khai báo danh sách liên kết chứa các đối tượng Student  

    public StudentsMS() { // Constructor  
        this.list = new LinkedList<Student>(); // Khởi tạo danh sách liên kết  
    }  

    public void addStudent(Student student) { // Phương thức thêm sinh viên  
        this.list.addLast(student); // Thêm sinh viên vào cuối danh sách  
    }  

    public void printList() { // Phương thức in danh sách sinh viên  
        this.list.traverse(); // Gọi phương thức traverse để in danh sách  
    }  
    public boolean findStudent(Student student) {  
        return list.findItem(student);  
    }
}

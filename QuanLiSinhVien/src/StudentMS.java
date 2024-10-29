
public class StudentMS {
    private LinkedList<Student> list;

    public StudentMS() {
        this.list = new LinkedList<Student>();

    }

    // Them sinh vien
    public void addStudent(Student student) {
        this.list.addLast(student);
    }

    // In danh sach sinh vien
    public void printList() {
        this.list.traverse();
    }

    // Tim sinh vien co ten giong nhau
    public boolean find(Student student) {
        return list.findItem(student);
    }

    // Chinh sua
    public void update(Student student) {
        Node<Student> tmp = list.getHead();
        while (tmp != null) {
            Student st = tmp.getData();
            if (st.getId().equals(student.getId())) {
                st.setFullName(student.getFullName());
                st.setAge(student.getAge());
                st.setGpa(student.getGpa());
            }
            tmp.getNext();
        }
    }

    // Xoa sinh vien ra khoi danh sach
    public void remove(Student student) {
        this.list.remove(student);
    }

    // Dem sinh vien ten giong nhau
    public int countStudent(String fullName) {
        int count = 0;
        Node<Student> tmp = list.getHead();
        while (tmp != null) {

            Student st = tmp.getData();
            if (st.getFullName().equals(fullName)) {
                count++;
            }
            tmp = tmp.getNext();

        }
        return count;
    }

}
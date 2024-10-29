import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StudentMS sms = new StudentMS();
        Scanner input = new Scanner(System.in);
        int choose; // Khai báo biến cho lựa chọn của người dùng

        do {
            System.out.println("------------DANH SACH SINH VIEN--------------");
            System.out.println("1. Them sinh vien");
            System.out.println("2. In danh sach sinh vien");
            System.out.println("3. Kiem tra xem sinh vien co o trong danh sach hay khong");
            System.out.println("4. Sua doi thong tin sinh vien");
            System.out.println("5. Xoa sinh vien");
            System.out.println("6. Dem so luong sinh vien co ten trung nhau");
            System.out.println("7. Thoat");
            System.out.print("Moi ban chon (1/2/3/4/5/6/7): ");

            choose = input.nextInt();
            input.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Moi ban thong tin sinh vien muon them");

                    // Nhập ID
                    System.out.print("Id sinh vien: ");
                    String id = input.nextLine().trim();

                    // Nhập họ và tên
                    System.out.print("Ho va ten: ");
                    String fullName = input.nextLine().trim();

                    // Nhập tuổi
                    System.out.print("Tuoi: ");
                    int age = 0;
                    if (input.hasNextInt()) {
                        age = input.nextInt();
                    } else {
                        System.out.println("Tuoi khong hop le. Vui long nhap so nguyen.");
                        input.nextLine(); // Xóa đầu vào không hợp lệ
                        break;
                    }

                    // Xóa bộ đệm sau khi đọc đầu vào số nguyên
                    input.nextLine();

                    // Nhập GPA
                    System.out.print("GPA: ");
                    float gpa = 0;
                    if (input.hasNextFloat()) {
                        gpa = input.nextFloat();
                    } else {
                        System.out.println("GPA khong hop le. Vui long nhap so thuc.");
                        input.nextLine(); // Xóa đầu vào không hợp lệ
                        break;
                    }

                    input.nextLine(); // Xóa bộ đệm sau khi đọc đầu vào số thực

                    // Thêm sinh viên mới vào hệ thống
                    sms.addStudent(new Student(id, fullName, age, gpa));
                    System.out.println("Da them sinh vien thanh cong.");
                    break;

                case 2:
                    System.out.println("Danh sach sinh vien: ");
                    sms.printList();
                    break;

                case 3:
                    // Kiem tra xem sinh vien co trong danh sach hay khong
                    System.out.println("Nhap thong tin sinh vien can kiem tra:");
                    String checkId = input.nextLine();

                    Student studentCheck = new Student(checkId, "", 0, 0);
                    if (sms.find(studentCheck)) {
                        System.out.println("Sinh vien co id " + checkId + " da ton tai trong danh sach");
                    } else {
                        System.out.println("Khong tim thay sinh vien co id = " + checkId);
                    }
                case 4:
                    // Nhap id sinh vien can sua
                    System.out.println("Nhap id sinh vien can sua: ");
                    String idUpdate = input.nextLine().trim();
                    System.out.print("Nhap ten moi: ");
                    String newName = input.nextLine().trim();
                    System.out.print("Nhap tuoi moi :");
                    int newAge = input.nextInt();
                    System.out.print("Nhap GPA moi: ");
                    float newGpa = input.nextFloat();
                    Student studentUpdate = new Student(idUpdate, newName, newAge, newGpa);
                    sms.update(studentUpdate);
                    break;

                case 5:
                    System.out.println("Nhap thong tin sinh vien can xoa:");
                    System.out.print("Id sinh vien: ");
                    String idRemove = input.nextLine();
                    System.out.print("Ho va ten: ");
                    String fullNameRemove = input.nextLine();
                    System.out.print("Tuoi: ");
                    int ageRemove = input.nextInt();
                    System.out.print("GPA: ");
                    float GpaRemove = input.nextFloat();
                    Student studentRemove = new Student(idRemove, fullNameRemove, ageRemove, GpaRemove);
                    sms.remove(studentRemove);
                    break;

                case 6:
                    // Ham check cac sinh vien co ten giong nhau
                    System.out.println("Nhap ten sinh vien ban can tim giong nhau: ");
                    String countName = input.nextLine();
                    int souongsv = sms.countStudent(countName);
                    System.err.println("So luong sinh vien co ten la " + countName + " : " + souongsv);

                    break;

                case 7:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }

        } while (choose != 7); // Lặp lại cho đến khi người dùng chọn 7

        input.close(); // Đóng scanner khi xong
    }
}
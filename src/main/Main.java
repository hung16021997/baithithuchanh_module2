package main;


import option.PhoneManager;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static PhoneManager manager = new PhoneManager();
    static Scanner input = new Scanner(System.in);

    public void menu(){
        System.out.println("----CHƯƠNG TRÌNH QUẢN LÍ DANH ----\n" +
                "Chọn chức năng tiếp theo để tiếp tục : \n" +
                "1.Xem danh bạ\n" +
                "2.Thêm mới\n" +
                "3.Sửa \n" +
                "4.Xóa\n" +
                "5.Tìm kiếm\n" +
                "6.Đọc từ file\n" +
                "7.Ghi từ file\n" +
                "8.Thoát\n" +
                "Chọn chức năng :" );
    }
    public void addPhoneBook(){
        System.out.println("Nhập họ tên :");
        String name = input.nextLine();
        name = input.nextLine();
        System.out.println("Nhập số điện thoại :");
        String numberPhone = input.nextLine();
        System.out.println("Nhập giới tính : ");
        String gioitinh = input.nextLine();
        System.out.println("Nhập ngày sinh : ");
        String ngaysinh = input.nextLine();
        System.out.println("Nhập địa chỉ : ");
        String address = input.nextLine();
        System.out.println("Nhập nhóm : ");
        String group = input.nextLine();
        System.out.println("Nhập Email : ");
        String email = input.nextLine();
        String[] newPhoneBook ={name,numberPhone,gioitinh,ngaysinh,address,group,email};
        manager.add(newPhoneBook);
    }
    public void editPhonBook(){
        System.out.println("Nhập họ tên người muốn sửa : ");
        String oldname = input.nextLine();
        oldname = input.nextLine();
        System.out.println("Nhập họ tên :");
        String name = input.nextLine();
        System.out.println("Nhập số điện thoại :");
        String numberPhone = input.nextLine();
        System.out.println("Nhập giới tính : ");
        String gioitinh = input.nextLine();
        System.out.println("Nhập ngày sinh : ");
        String ngaysinh = input.nextLine();
        System.out.println("Nhập địa chỉ : ");
        String address = input.nextLine();
        System.out.println("Nhập nhóm : ");
        String group = input.nextLine();
        System.out.println("Nhập Email : ");
        String email = input.nextLine();
        manager.edit(oldname,name,numberPhone,address,gioitinh,ngaysinh,group,email);
    }
    public void removePhoneBook(){
        System.out.println("Nhập họ tên muốn xóa : ");
        String name = input.nextLine();
        name = input.nextLine();
        manager.delete(name);
    }
    public void searchPhoneBook(){
        System.out.println("Nhập họ tên muốn tìm kiếm : ");
        String name = input.nextLine();
        name = input.nextLine();
        manager.search(name);
    }
    public void read(){
        try {
            manager.read();
        } catch (IOException e) {
            System.out.println("Đọc file lỗi,kiểm tra lại đường dẫn !!!!");
        }
    }
    public void write(){
        try {
            manager.push();
        } catch (IOException e) {
            System.out.println("Lỗi không thể ghi,kiểm tra lại !!!");
        }
    }
    public void start() {
        try {
            int x = -1;
            while (x != 0) {
                menu();
                int choose = input.nextInt();
                switch (choose) {
                    case 1:
                        manager.showInfo();
                        break;
                    case 2:
                        addPhoneBook();
                        break;
                    case 3:
                        editPhonBook();
                        break;
                    case 4:
                        removePhoneBook();
                        break;
                    case 5:
                        searchPhoneBook();
                        break;
                    case 6:
                        read();
                        System.out.println("Đã cập nhật danh bạ.");
                        break;
                    case 7:
                        write();
                        break;
                    case 8:
                        System.exit(-1);
                    default:
                        System.out.println("Không hợp lệ !");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Nhập không hợp lệ,chỉ nhập số ! ");
        }
    }
}

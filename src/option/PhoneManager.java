package option;

import model.PhoneBook;
import strage.PhoneBookList;

import java.io.*;

public class PhoneManager extends PhoneBookList implements IManager {
    public void read() throws IOException {
        File fileVocabulary = new File("/Users/mac/CodeGym/Module2/baithithuchanh/src/strage/phone.csv");
        FileReader fileReader = new FileReader(fileVocabulary);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine())!= null){
            String[] list = line.split("_");
            this.add(list);
        }
        fileReader.close();
    }

    public void add(String[] list){
        PhoneBook phoneBook = new PhoneBook(list[0],list[1],list[2],list[3],list[4],list[5],list[6]);
        this.list.add(phoneBook);
    }

    public void edit(String oldname,String name, String phone, String address, String email, String group, String gioitinh, String ngaysinh){
        for (int i = 0;i < list.size();i++){
            if(list.get(i).getName().equals(oldname)){
                list.get(i).setName(name);
                list.get(i).setPhone(phone);
                list.get(i).setAddress(address);
                list.get(i).setEmail(email);
                list.get(i).setGroup(group);
                list.get(i).setNgaysinh(ngaysinh);
                list.get(i).setGioitinh(gioitinh);
            }
        }
    }
    public void delete(String name){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                list.remove(i);
            }
        }
    }

    public void search(String name){
        for(int i = 0;i < list.size();i++){
            if(list.get(i).getName().contains(name)){
                System.out.println("Họ tên : "+list.get(i).getName()+"\n" +
                        "Số điện thoại : " + list.get(i).getPhone() + "\n" +
                        "Giới tính : " + list.get(i).getGioitinh() + "\n" +
                        "Ngày sinh : " + list.get(i).getNgaysinh() + "\n" +
                        "Địa chỉ : " + list.get(i).getAddress() + "\n" +
                        "Nhóm : " + list.get(i).getGroup() + "\n" +
                        "Email : " + list.get(i).getEmail() + "\n" +
                        "============================");
            }
        }
    }

    public void push() throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/mac/CodeGym/Module2/baithithuchanh/src/strage/phone.csv");
        for (PhoneBook check: list){
            fileWriter.write(""+
                    check.getName()+"_"+
                    check.getPhone()+"_"+
                    check.getGioitinh()+"_"+
                    check.getNgaysinh()+"_"+
                    check.getAddress()+"_"+
                    check.getGroup()+"_" +
                    check.getEmail()+"\n");
            fileWriter.flush();
        }
        fileWriter.close();
    }
    public void showInfo(){
        for (int i = 0;i < list.size();i++){
            System.out.println("Họ tên : "+list.get(i).getName()+"\n" +
                    "Số điện thoại : " + list.get(i).getPhone() + "\n" +
                    "Giới tính : " + list.get(i).getGioitinh() + "\n" +
                    "Ngày sinh : " + list.get(i).getNgaysinh() + "\n" +
                    "Địa chỉ : " + list.get(i).getAddress() + "\n" +
                    "Nhóm : " + list.get(i).getGroup() + "\n" +
                    "Email : " + list.get(i).getEmail() + "\n" +
                    "============================");
        }
    }

}
package option;

import java.io.IOException;

public interface IManager {
     void add(String[] arr);
     void edit(String oldname,String name, String phone, String address, String email, String group, String gioitinh, String ngaysinh);
     void delete(String name);
     void search(String name);
     void push() throws IOException;
     void showInfo();
}

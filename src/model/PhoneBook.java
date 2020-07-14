package model;

public class PhoneBook {
    String name,phone,address,email, group,gioitinh,ngaysinh;

    public PhoneBook() {
    }

    public PhoneBook(String name, String phone, String gioitinh, String ngaysinh,String address,String group, String email) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.group = group;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
}

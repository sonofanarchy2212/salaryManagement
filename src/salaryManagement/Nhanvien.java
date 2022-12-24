
package salaryManagement;

import java.util.Date;

public class Nhanvien {
    private int idnv;
    private String MaNV,Hovaten,Chucvu,Diachi,Email,Gtinh,SDT,Trangthai;
    private Date Nsinh;
    private double hesoluong,luong;
    public Nhanvien(){
        
    }

    public Nhanvien(String MaNV, String Hovaten, String Chucvu, String Diachi, String Email, String Gtinh, String SDT, String Trangthai, Date Nsinh, double hesoluong, double luong) {
        this.MaNV = MaNV;
        this.Hovaten = Hovaten;
        this.Chucvu = Chucvu;
        this.Diachi = Diachi;
        this.Email = Email;
        this.Gtinh = Gtinh;
        this.SDT = SDT;
        this.Trangthai = Trangthai;
        this.Nsinh = Nsinh;
        this.hesoluong = hesoluong;
        this.luong = luong;
    }





    public int getIdnv() {
        return idnv;
    }

    public void setIdnv(int idnv) {
        this.idnv = idnv;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String Hovaten) {
        this.Hovaten = Hovaten;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGtinh() {
        return Gtinh;
    }

    public void setGtinh(String Gtinh) {
        this.Gtinh = Gtinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNsinh() {
        return Nsinh;
    }

    public void setNsinh(Date Nsinh) {
        this.Nsinh = Nsinh;
    }

    public double getHesoluong() {
        if(getChucvu().equals("CONG TAC VAN THU") || getChucvu().equals("KE TOAN") || getChucvu().equals("THU KY")){
            hesoluong=(float) 3.5;
        }
        else if(getChucvu().equals("TRUONG PHONG")){
            hesoluong=(float) 6.5;
        }
        else if(getChucvu().equals("NHAN SU")){
            hesoluong=(float) 3.0;
        }
        else if(getChucvu().equals("LAP TRINH VIEN")){
            hesoluong=(float) 5.5;
        }
        else {
            hesoluong=(float) 5.0;
        }        
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public double getLuong() {
        luong = getHesoluong()*3000000;
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }



    void setGtinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

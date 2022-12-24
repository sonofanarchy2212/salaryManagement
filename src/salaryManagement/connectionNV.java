
package salaryManagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class connectionNV {
    private Connection con;
    public connectionNV(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://LAPTOP-M90NF5KC:1433;databaseName=QLNV;integratedSecurity=true";
            con= DriverManager.getConnection(connectionURL, "sa", "123456");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Luong> getListHSLuong() {
        ArrayList<Luong> listluong = new ArrayList<>();
        String SQL="SELECT * FROM tbHesoluong";
        try{
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Luong hsl = new Luong();
                hsl.setChucvu(rs.getString("CHUCVU"));
                hsl.setHesoluong(rs.getFloat("HESOLUONG"));
                listluong.add(hsl);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return listluong;
    }

    public boolean addNhanvien(Nhanvien nv){
        String SQL = "INSERT INTO tbNV(MANV ,HOVATEN, NGAYSINH, GIOITINH, CHUCVU, DIACHI, SODIENTHOAI, EMAIL, HESOLUONG, LUONG, TRANGTHAI) "+ "VALUES (?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement ps= con.prepareStatement(SQL);
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getHovaten());
            ps.setDate(3, new Date(nv.getNsinh().getTime()));
            ps.setString(4, nv.getGtinh());
            ps.setString(5, nv.getChucvu());
            ps.setString(6, nv.getDiachi());
            ps.setString(7, nv.getSDT());
            ps.setString(8, nv.getEmail());
            ps.setDouble(9, nv.getHesoluong());
            ps.setDouble(10, nv.getLuong());
            ps.setString(11, nv.getTrangthai());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public void deleteNhanvien(int id){
        String SQL="DELETE FROM tbNV WHERE ID=?";
        try{
            PreparedStatement ps = con.prepareCall(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public void updateTrangthai(String trangthai){
        String SQL="UPDATE tbNV SET TRANGTHAI = ?";
        try{
            PreparedStatement ps = con.prepareCall(SQL);
            ps.setString(1, trangthai);
            ps.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
        public ArrayList<Nhanvien> searchNhanvien(String manv) {
        ArrayList<Nhanvien> list = new ArrayList<>();
        String SQL="SELECT * FROM tbNV WHERE MANV like ?";
        try{
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1,manv +"%" );
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Nhanvien nv = new Nhanvien();
                nv.setIdnv(rs.getInt("ID"));
                nv.setMaNV(rs.getString("MANV"));
                nv.setHovaten(rs.getString("HOVATEN"));
                nv.setNsinh(rs.getDate("NGAYSINH"));
                nv.setGtinh(rs.getString("GIOITINH"));
                nv.setChucvu(rs.getString("CHUCVU"));
                nv.setDiachi(rs.getString("DIACHI"));
                nv.setSDT(rs.getString("SODIENTHOAI"));
                nv.setEmail(rs.getString("EMAIL"));
                list.add(nv);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args){
        new connectionNV();
    }
}

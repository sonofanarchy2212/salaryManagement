
package salaryManagement;


public class Luong {
    private String Chucvu;
    private float hesoluong;
    
    public Luong(){
        
    }
    public Luong(String Chucvu, float hesoluong) {
        this.Chucvu = Chucvu;
        this.hesoluong = hesoluong;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public float getHesoluong() {
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
    
}

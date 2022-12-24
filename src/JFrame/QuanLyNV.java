

package JFrame;
import java.awt.List;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import salaryManagement.Luong;
import salaryManagement.Nhanvien;
import salaryManagement.connectionNV;

/**
 *
 * @author Admin
 */
public class QuanLyNV extends javax.swing.JFrame {
    private DefaultTableModel modelNV,modelHesoluong,modelLuong;
    private ArrayList<Nhanvien> list;
    private ArrayList<Luong> listhsluong;
    private ArrayList<Nhanvien> listLuong;
    int selectedIndex;
    public QuanLyNV() {
        initComponents();
        list = new connectionNV().getListNV();
        modelNV= (DefaultTableModel)tbNV.getModel();
        modelNV.setColumnIdentifiers(new Object[]{
            "STT","MÃ NHÂN VIÊN","HỌ VÀ TÊN","NGÀY SINH","GIỚI TÍNH","CHỨC VỤ","ĐỊA CHỈ","SỐ ĐIỆN THOẠI","EMAIL"
        });
        showTable();
        modelHesoluong= (DefaultTableModel)tbHesoluong.getModel();
        modelHesoluong.setColumnIdentifiers(new Object[]{
            "CHỨC VỤ","HỆ SỐ LƯƠNG"
        });
        showHesoluong();
        listLuong = new connectionNV().getListNV();
        modelLuong= (DefaultTableModel)tbLuong.getModel();
        modelLuong.setColumnIdentifiers(new Object[]{
            "STT","MÃ NHÂN VIÊN","HỌ VÀ TÊN","CHỨC VỤ", "LƯƠNG" , "TRẠNG THÁI"
        });
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGT = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHesoluong = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbLuong = new javax.swing.JTable();
        bttinhLuong = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btTrangthai = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NGAYSINH = new javax.swing.JLabel();
        GIOITINH = new javax.swing.JLabel();
        CHUCVU = new javax.swing.JLabel();
        DIACHI = new javax.swing.JLabel();
        SDT = new javax.swing.JLabel();
        EMAIL = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btMale = new javax.swing.JRadioButton();
        btFemale = new javax.swing.JRadioButton();
        cbMajor = new javax.swing.JComboBox<>();
        txtDate = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        bnDelete = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN VIÊN VÀ TÍNH LƯƠNG");

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("PHẦN MỀM QUẢN LÝ NHÂN VIÊN VÀ TÍNH TIỀN LƯƠNG");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Authors : Hồ Quang Đăng");

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\home pic.jpg")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("MSSV: B1906453");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(373, 373, 373))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addGap(63, 63, 63)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\salary icon (2).png")); // NOI18N
        jLabel4.setText("TÍNH LƯƠNG");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tbHesoluong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "CHỨC VỤ", "HỆ SỐ LƯƠNG"
            }
        ));
        jScrollPane2.setViewportView(tbHesoluong);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tbLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ NV", "HỌ VÀ TÊN", "CHỨC VỤ", "LƯƠNG", "TRẠNG THÁI"
            }
        ));
        jScrollPane3.setViewportView(tbLuong);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        bttinhLuong.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        bttinhLuong.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\updatesalary icon (1).png")); // NOI18N
        bttinhLuong.setText("Tính Lương");
        bttinhLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttinhLuongActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("DANH SÁCH HỆ SỐ LƯƠNG");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("DANH SÁCH HỆ SỐ LƯƠNG");

        btTrangthai.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btTrangthai.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\check icon (1).png")); // NOI18N
        btTrangthai.setText("Cập nhật trạng thái");
        btTrangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrangthaiActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText("LƯƠNG = LƯƠNG CƠ BẢN * HỆ SỐ LƯƠNG");
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setText("LƯƠNG CƠ BẢN = 3.000.000 VND");
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(676, 676, 676)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel7)
                        .addGap(734, 734, 734)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(bttinhLuong)
                                .addGap(26, 26, 26)
                                .addComponent(btTrangthai))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(527, 527, 527))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btTrangthai)
                            .addComponent(bttinhLuong))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tính lương", jPanel5);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\manager icon (2).png")); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\iconID.png")); // NOI18N
        jLabel2.setText("MÃ NHÂN VIÊN:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\nameicon.png")); // NOI18N
        jLabel3.setText("HỌ VÀ TÊN:");

        NGAYSINH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NGAYSINH.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\dateicon.png")); // NOI18N
        NGAYSINH.setText("NGÀY SINH:");

        GIOITINH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GIOITINH.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\sexicon.png")); // NOI18N
        GIOITINH.setText("GIỚI TÍNH:");

        CHUCVU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CHUCVU.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\majoricon.png")); // NOI18N
        CHUCVU.setText("CHỨC VỤ:");

        DIACHI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DIACHI.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\Home-Icon (1).png")); // NOI18N
        DIACHI.setText("ĐỊA CHỈ:");

        SDT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SDT.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\phone-icon.png")); // NOI18N
        SDT.setText("SỐ ĐIỆN THOẠI:");

        EMAIL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EMAIL.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\email icon.png")); // NOI18N
        EMAIL.setText("EMAIL:");

        btGT.add(btMale);
        btMale.setSelected(true);
        btMale.setText("NAM");

        btGT.add(btFemale);
        btFemale.setText("NỮ");

        cbMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONG TAC VAN THU", "TRUONG PHONG", "NHAN SU", "KE TOAN", "THU KY", "LAP TRINH VIEN", "THIET KE VIEN", " " }));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btAdd.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btAdd.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\add icon (1).png")); // NOI18N
        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btEdit.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\edit icon (1).png")); // NOI18N
        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        bnDelete.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        bnDelete.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\delete icon (1).png")); // NOI18N
        bnDelete.setText("Delete");
        bnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDeleteActionPerformed(evt);
            }
        });

        btRefresh.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btRefresh.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\refresh icon (1).png")); // NOI18N
        btRefresh.setText("Refresh");
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        btSearch.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btSearch.setIcon(new javax.swing.ImageIcon("D:\\HOCTAP\\LapTrinhJAVA\\ThiCuoiKy\\src\\images\\search icon (1).png")); // NOI18N
        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnDelete)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btEdit)
                    .addComponent(bnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRefresh)
                    .addComponent(btSearch))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(NGAYSINH)
                    .addComponent(GIOITINH)
                    .addComponent(CHUCVU)
                    .addComponent(DIACHI)
                    .addComponent(EMAIL)
                    .addComponent(SDT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName)
                    .addComponent(txtDate)
                    .addComponent(txtAddress)
                    .addComponent(txtPhone)
                    .addComponent(txtEmail)
                    .addComponent(txtID)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btMale)
                                .addGap(18, 18, 18)
                                .addComponent(btFemale))
                            .addComponent(cbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NGAYSINH)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GIOITINH)
                    .addComponent(btMale)
                    .addComponent(btFemale))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHUCVU)
                    .addComponent(cbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIACHI)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SDT)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EMAIL)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tbNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        tbNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MÃ NHÂN VIÊN", "HỌ VÀ TÊN", "NGÀY SINH", "GIỚI TÍNH", "CHỨC VỤ", "ĐỊA CHỈ", "SỐ ĐIỆN THOẠI", "EMAIL"
            }
        ));
        tbNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNV);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(881, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(467, 467, 467))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý thông tin", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNVMouseClicked
        selectedIndex=tbNV.getSelectedRow();
        Nhanvien nv = list.get(selectedIndex);
        txtID.setText(nv.getMaNV());
        txtName.setText(nv.getHovaten());
        txtDate.setText(nv.getNsinh().toString());
        String gioitinh=nv.getGtinh();
        if(gioitinh.equals("Nam")){
            btMale.setSelected(true);
        }
        else{
            btFemale.setSelected(true);
        }
        cbMajor.setSelectedItem(nv.getChucvu());
        txtAddress.setText(nv.getDiachi());
        txtPhone.setText(nv.getSDT());
        txtEmail.setText(nv.getEmail());
    }//GEN-LAST:event_tbNVMouseClicked

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        String Manv = txtID.getText();
        if(Manv.length()>0){
            list = new connectionNV().searchNhanvien(Manv);
            modelNV.setRowCount(0);
            for(Nhanvien nv:list){
                modelNV.addRow(new Object[]{
                    j++,nv.getMaNV(),nv.getHovaten(),nv.getNsinh(),nv.getGtinh(),nv.getChucvu(),nv.getDiachi(),nv.getSDT(),nv.getEmail()
                });
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Noi dung tim kiem khong phu hop!");
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        txtID.setText("");
        txtName.setText("");
        txtDate.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        btMale.setSelected(true);
        btFemale.setSelected(false);
    }//GEN-LAST:event_btRefreshActionPerformed

    private void bnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDeleteActionPerformed
        selectedIndex=tbNV.getSelectedRow();
        Nhanvien nv = list.get(selectedIndex);
        JOptionPane.showConfirmDialog(this, "Bạn đã chắc chắn muốn xóa chưa ?");
        new connectionNV().deleteNhanvien(nv.getIdnv());
        showTable();
    }//GEN-LAST:event_bnDeleteActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        if(list.isEmpty()){
            JOptionPane.showMessageDialog(this, "Hiện tại không có dữ liệu để chỉnh sửa!");
        }
        selectedIndex=tbNV.getSelectedRow();
        Nhanvien n = list.get(selectedIndex);
        new connectionNV().deleteNhanvien(n.getIdnv());
            Nhanvien nv=new Nhanvien();
            nv.setMaNV(txtID.getText());
            nv.setHovaten(txtName.getText());
            try {
                nv.setNsinh(new SimpleDateFormat("yyyy-MM-dd").parse(txtDate.getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            nv.setChucvu(cbMajor.getSelectedItem().toString());
            nv.setDiachi(txtAddress.getText());
            nv.setSDT(txtPhone.getText());
            nv.setEmail(txtEmail.getText());
            if(btMale.isSelected()){
                nv.setGtinh("Nam");
            }
            else{
                nv.setGtinh("Nu");
            }
            if(new connectionNV().addNhanvien(nv)){
                JOptionPane.showMessageDialog(rootPane, "Chỉnh sửa thành công !");
                list.add(nv); // them vao danh sach SV.
                showTable();
            } else{
                JOptionPane.showMessageDialog(rootPane, "Kiểm tra lại thông tin !");
            }

    }//GEN-LAST:event_btEditActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        Nhanvien nv=new Nhanvien();
        nv.setMaNV(txtID.getText());
        nv.setHovaten(txtName.getText());
        try {
            nv.setNsinh(new SimpleDateFormat("yyyy-MM-dd").parse(txtDate.getText()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        nv.setChucvu(cbMajor.getSelectedItem().toString());
        nv.setDiachi(txtAddress.getText());
        nv.setSDT(txtPhone.getText());
        nv.setEmail(txtEmail.getText());
        if(btMale.isSelected()){
            nv.setGtinh("Nam");
        }
        else{
            nv.setGtinh("Nu");
        }
        nv.setTrangthai("CHUA TRA LUONG");
        if(new connectionNV().addNhanvien(nv)){
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
            list.add(nv); // them vao danh sach SV.
            showTable();
        } else{
                JOptionPane.showMessageDialog(rootPane, "Vui lòng kiểm tra lại thông tin !");
            }
    }//GEN-LAST:event_btAddActionPerformed

    private void bttinhLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttinhLuongActionPerformed
        modelLuong.setRowCount(0);
        listLuong = new connectionNV().getListNV();   
        showLuong();
    }//GEN-LAST:event_bttinhLuongActionPerformed

    private void btTrangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrangthaiActionPerformed
        modelLuong.setRowCount(0);
        new connectionNV().updateTrangthai("DA TRA LUONG");
        listLuong = new connectionNV().getListNV();
        showLuong();
    }//GEN-LAST:event_btTrangthaiActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    int j=1;    public void showResult() {
        Nhanvien nv = list.get(list.size() - 1);
        modelNV.addRow(new Object[]{
            i++,nv.getMaNV(),nv.getHovaten(),nv.getNsinh(),nv.getGtinh(),nv.getChucvu(),nv.getDiachi(),nv.getSDT(),nv.getEmail() 
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLyNV().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(QuanLyNV.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CHUCVU;
    private javax.swing.JLabel DIACHI;
    private javax.swing.JLabel EMAIL;
    private javax.swing.JLabel GIOITINH;
    private javax.swing.JLabel NGAYSINH;
    private javax.swing.JLabel SDT;
    private javax.swing.JButton bnDelete;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btEdit;
    private javax.swing.JRadioButton btFemale;
    private javax.swing.ButtonGroup btGT;
    private javax.swing.JRadioButton btMale;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btTrangthai;
    private javax.swing.JButton bttinhLuong;
    private javax.swing.JComboBox<String> cbMajor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbHesoluong;
    private javax.swing.JTable tbLuong;
    private javax.swing.JTable tbNV;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
    int i=1;
    private void showTable() {
        list = new connectionNV().getListNV();
        modelNV.setRowCount(0);
        for(Nhanvien nv:list){
            modelNV.addRow(new Object[]{
            tbNV.getRowCount()+1,nv.getMaNV(),nv.getHovaten(),nv.getNsinh(),nv.getGtinh(),nv.getChucvu(),nv.getDiachi(),nv.getSDT(),nv.getEmail()
            });
        }
        }
        private void showHesoluong() {
        listhsluong = new connectionNV().getListHSLuong();
        modelHesoluong.setRowCount(0);
        for(Luong hsl:listhsluong){
            modelHesoluong.addRow(new Object[]{
            hsl.getChucvu(),hsl.getHesoluong()
            });
        }
        }
    Locale locale = new Locale("vi","VN");
    NumberFormat format = NumberFormat.getCurrencyInstance(locale);
    private void showLuong() {
        list = new connectionNV().getListNV();
        modelLuong.setRowCount(0);
        for(Nhanvien nv:list){
            modelLuong.addRow(new Object[]{
            tbLuong.getRowCount()+1,nv.getMaNV(),nv.getHovaten(),nv.getChucvu(),format.format(nv.getLuong()), nv.getTrangthai()
            });
        }
        }
    }


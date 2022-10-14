
package payment.tracker;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class insertionpage extends javax.swing.JFrame {

    private boolean rbflag;
    public String Account_name;
    public insertionpage(String name) {
        openpage op=new openpage();
        Account_name=name;
        rbflag=false;
        initComponents();
        img();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Xfield = new javax.swing.JTextField();
        Yfield = new javax.swing.JTextField();
        flag = new javax.swing.JLabel();
        remind = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        description = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText(":");

        Xfield.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Xfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XfieldActionPerformed(evt);
            }
        });

        Yfield.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        flag.setBackground(new java.awt.Color(153, 153, 153));
        flag.setForeground(new java.awt.Color(153, 153, 153));
        flag.setOpaque(true);

        remind.setBackground(new java.awt.Color(153, 153, 153));
        remind.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remind.setText("Remind me");
        remind.setBorder(null);
        remind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remindActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("(use this feature to get remind your future payments)  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(remind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(flag, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Xfield)
                    .addComponent(Yfield))
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Xfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Yfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(5, 5, 5)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flag, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remind))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("Description:    ");

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SAVE");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Edit");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("(Any additional information in short text)");

        jButton6.setBackground(new java.awt.Color(102, 255, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("View");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mainpage mp=new mainpage(Account_name);
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void XfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XfieldActionPerformed


    }//GEN-LAST:event_XfieldActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Yfield.setText("");
        description.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            save();
        } catch (ParseException ex) {
            Logger.getLogger(insertionpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        description.setText("");
    }//GEN-LAST:event_descriptionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        editable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
           call();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void remindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remindActionPerformed
        rbflag=!rbflag;
        if(rbflag){
        JOptionPane.showMessageDialog(null,"This feature uses for just reminders");
        }  
    }//GEN-LAST:event_remindActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Xfield;
    public javax.swing.JTextField Yfield;
    public javax.swing.JTextField description;
    public javax.swing.JLabel flag;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton remind;
    // End of variables declaration//GEN-END:variables

    public void insertfunction(String Filename) {
        File file=new File("C:\\Payment Tracker\\database\\"+Account_name+"\\"+Filename+".txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(insertionpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel1.setText(Filename+"  ");
        Date L_date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd MMM yyyy");
        String date=formatter.format(L_date);
        Xfield.setText(date);
        jLabel2.setText("Enter the date to change (dd MMM yyyy) format");
        jLabel3.setText("Enter the Value you Spent (only in Numerical) ");
         
    }

    private void save() throws ParseException {
        DecimalFormat df=new DecimalFormat("0.00");
        Date L_date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd MMM yyyy");
        String updateddate=formatter.format(L_date);
        String Fname=jLabel1.getText();
        String Filename=Fname.substring(0,Fname.length()-2);
        String x=Xfield.getText();
        if(x.equals("")){
            JOptionPane.showMessageDialog(null,"Invalid Input at x-position");
            return;
        }
        String y=Yfield.getText();
        String desc=description.getText();
         if(desc.equals(""))
                desc="-";
        if(rbflag){
            File newfile=new File("C:\\Payment Tracker\\database\\"+Account_name+"\\Reminders");
            if(y.equals(""))y="0";
            try { 
                if(newfile.exists()==false){
                    newfile.createNewFile();
                }
                BufferedWriter out=new BufferedWriter(new FileWriter("C:\\Payment Tracker\\database\\"+Account_name+"\\Reminders",true));
                String s=Filename+"    "+x+"    "+updateddate+"    "+y+"    "+desc;
                out.append(s+"\n");out.close();
                JOptionPane.showMessageDialog(null,"Set reminder successfully");
                rbflag=false;
                return;
                        
            } catch (IOException ex) {
                Logger.getLogger(insertionpage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String date=x.substring(0,2);
        String month=x.substring(3,x.length()-5);
        String year=x.substring(7,x.length());
        if(y.equals("")){
            JOptionPane.showMessageDialog(null,"Please! enter the value you spent");
            return;
        }
        try{
        Double yvalue=Double.valueOf(y);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Please! enter Only in numerical value you spent");
            return;
        }
        String check=flag.getText();
        String es=date+"    "+month+"    "+year+"    "+x+"    "+updateddate+"    "+y+"    "+desc;
        String words[]=null;
        String ld,nd,oldstring="",str;
        words=es.split("    ");
        ld=nd=words[3];
        if(check.equals("")){
            try{
                 BufferedReader in=new BufferedReader(new FileReader("C:\\Payment Tracker\\database\\"+Account_name+"\\"+Filename+".txt"));
                 while((str=in.readLine())!=null){
                    oldstring=str;
                    words=oldstring.split("    ");
                  ld=words[3];
                 }in.close();  
                   Boolean cmp=sortdate(ld,nd);
                if(cmp){    
                    BufferedWriter out=new BufferedWriter(new FileWriter("C:\\Payment Tracker\\database\\"+Account_name+"\\"+Filename+".txt",true)); 
                    out.append(es+"\n");    
                    out.close();
                }else{
                    File temp=new File("C:\\Payment Tracker\\database\\"+Account_name+"\\Tempfile");
                    temp.createNewFile();
                    boolean inst=true;
                    in=new BufferedReader(new FileReader("C:\\Payment Tracker\\database\\"+Account_name+"\\"+Filename+".txt"));
                    BufferedWriter out=new BufferedWriter(new FileWriter("C:\\Payment Tracker\\database\\"+Account_name+"\\Tempfile")); 
                    while((str=in.readLine())!=null){
                        out.append(str+"\n");    
                    }out.close();
                    in=new BufferedReader(new FileReader("C:\\Payment Tracker\\database\\"+Account_name+"\\Tempfile"));
                    out=new BufferedWriter(new FileWriter("C:\\Payment Tracker\\database\\"+Account_name+"\\"+Filename+".txt"));
                    while((str=in.readLine())!=null){
                        words=str.split("    ");
                        ld=words[3];
                        if(inst && sortdate(ld,nd)==false){
                            out.append(es+"\n");
                            inst=false;
                        } 
                        out.append(str+"\n");
                    }out.close();
                    temp.delete();
                }
                JOptionPane.showMessageDialog(null,"Data Succesfully Entered");
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
        if(check.equals("")==false){    
             modify(check,es);
             flag.setText("");
             JOptionPane.showMessageDialog(null,"Data Succesfully Updated");
        }    
         
           Yfield.setText("");
           description.setText("");
    }

    private void editable() {
        String x;
         x=Xfield.getText();
        if(x.equals("")){
             JOptionPane.showMessageDialog(null,"Please Enter the details of first row");
             return;
        }     
        String Fname=jLabel1.getText();
        String Filename=Fname.substring(0,Fname.length()-2);
            try{
              BufferedReader in=new BufferedReader(new FileReader("C:\\Payment Tracker\\database\\"+Account_name+"\\"+Filename+".txt"));
            String words[]=null;
            String str;
            while((str=in.readLine())!=null){
                words=str.split("    ");
                if(words[3].equals(x)){ 
                    Yfield.setText(words[5]);
                    description.setText(words[6]);  
                    flag.setText(str);
                        return;
                } 
            }
            in.close();
            JOptionPane.showMessageDialog(null,"Sorry! the details were not found\nPlease Enter correct details");
            }
             catch(IOException e){
                System.out.println(e);
            }
        } 

    private void modify(String check, String es) {
        String Fname=jLabel1.getText();
        String Filename=Fname.substring(0,Fname.length()-2);
            try{
              BufferedReader in=new BufferedReader(new FileReader("C:\\Payment Tracker\\database\\"+Account_name+"\\"+Filename+".txt"));
            String str,oldstring="",oldcontent="";
            while((str=in.readLine())!=null){
                oldcontent=oldcontent+str+System.lineSeparator(); 
            }
            String newcontent=oldcontent.replaceAll(check,es);
            FileWriter writer=new FileWriter("C:\\Payment Tracker\\database\\"+Account_name+"\\"+Filename+".txt");
            writer.write(newcontent);
            writer.close();
            in.close();
            }
             catch(IOException e){
                System.out.println(e);
            }
    }      
    private boolean sortdate(String ld,String nd){
        try {
            SimpleDateFormat formatter=new SimpleDateFormat("dd MMM yyyy");
            Date lastdate,newdate;
            newdate=formatter.parse(nd);
            lastdate=formatter.parse(ld);
            return(newdate.compareTo(lastdate)>=0)? true:false;
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"Please! Enter the Valid Date ");
        }return true;
    }        

    public boolean call() {
        output_page op=new output_page(Account_name);
        String Fname=jLabel1.getText();
        String Filename=Fname.substring(0,Fname.length()-2);
            try{
              BufferedReader in=new BufferedReader(new FileReader("C:\\Payment Tracker\\database\\"+Account_name+"\\"+Filename+".txt"));
            String words[]=null;
            String str;
            if(in.readLine()!=null){
                 op.insertfunction(Filename);
                 op.setVisible(true);
                 dispose();
            }    
            else{
                JOptionPane.showMessageDialog(jButton6,"SORRY! you haven't enter any data in this field");
                return false;
            }
            }
             catch(IOException e){
                System.out.println(e);
            }  
            return true;
    }
    private void img() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(".png")));
    }
}
        
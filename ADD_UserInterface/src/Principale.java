
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEBA
 */
public class Principale extends javax.swing.JFrame {

    /**
     * Creates new form Principale
     */
    public Principale() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        nv = new javax.swing.JTextField();
        ni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        m_carrées = new javax.swing.JButton();
        m_rectangle = new javax.swing.JButton();
        ACP_nonNormée = new javax.swing.JButton();
        ACP_normée = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N.Var");

        jLabel2.setText("N.Imd");

        nv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvActionPerformed(evt);
            }
        });

        ni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niActionPerformed(evt);
            }
        });

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0.5", "0"},
                {"-0.1", "-0.5"},
                {"-0.5", "0.5"},
                {"-0.3", "0.1"},
                {"0", "2.5"},
                {"1.6", "-0.7"},
                {"2", "2"},
                {"2.4", "1.2"},
                {"0.5", "3.5"},
                {"2.7", "-0.9"}
            },
            new String [] {
                "V1", "V2"
            }
        ));
        jScrollPane1.setViewportView(tab);

        m_carrées.setText("m.carrées");
        m_carrées.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_carréesMouseClicked(evt);
            }
        });
        m_carrées.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_carréesActionPerformed(evt);
            }
        });

        m_rectangle.setText("m.rectangle");

        ACP_nonNormée.setText("ACP non normée");

        ACP_normée.setText("ACP normée");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nv, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(m_carrées)
                        .addGap(55, 55, 55)
                        .addComponent(m_rectangle)
                        .addGap(44, 44, 44)
                        .addComponent(ACP_nonNormée)
                        .addGap(56, 56, 56)
                        .addComponent(ACP_normée)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(nv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_carrées)
                    .addComponent(m_rectangle)
                    .addComponent(ACP_nonNormée)
                    .addComponent(ACP_normée))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void niActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niActionPerformed

    private void m_carréesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_carréesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_carréesActionPerformed

    private void m_carréesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_carréesMouseClicked
        
        try {
            MC m = new MC();
            m.show(); // 
            mcar mca= new mcar();
            mca.sai();
            
            DecimalFormat dtime = new DecimalFormat("#.##"); 
            
            m.mx.setText(String.valueOf(dtime.format(mca.moyx())));
            m.my.setText(String.valueOf(dtime.format((mca.moyy()))));
            m.vx.setText(String.valueOf(dtime.format(mca.varx())));
            m.vy.setText(String.valueOf(dtime.format(mca.vary())));
            m.cv.setText(String.valueOf(dtime.format(mca.cov())));
            m.cc.setText(String.valueOf(dtime.format(mca.co())));
            
           /* double result[] = mca.droit();
            System.out.println("Droite d'ajustement : y=" + result[0] +"x +" + result[1]);
            */
            double result[] = mca.droit();
            m.D.setText("droite d'ajustement : y = "+ String.valueOf(dtime.format(result[0])) + "x+" + String.valueOf(dtime.format(result[1])));




        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_m_carréesMouseClicked

    private void nvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nvActionPerformed

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
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACP_nonNormée;
    private javax.swing.JButton ACP_normée;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton m_carrées;
    private javax.swing.JButton m_rectangle;
    private javax.swing.JTextField ni;
    private javax.swing.JTextField nv;
    public javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables

    /* la methode des moindres rectangles */
    class mcar{
        int i = Integer.parseInt(ni.getText());
        int v = Integer.parseInt(nv.getText());
        double[][] data = new double[i][v];
        
        void sai(){
            System.out.println("sai");
            for(int ligne=0;ligne<i;ligne++){
                for(int col=0;col<v;col++){
                    //System.out.println("loop");
                    //data[ligne][col] = Double.parseDouble(String.valueOf(tab.getModel().getValueAt(ligne,col)));
                    data[ligne][col] = Double.parseDouble((String) tab.getValueAt(ligne,col));
                }   
            }
            System.out.println(data);
        }
        
        double moyx(){
            double s=0;
            double moyx;
            for(int ligne=0;ligne<i;ligne++){
                for(int col=0;col<v;col++){
                    if(col==0){
                        s = s+data[ligne][col];
                    }
                }   
            }
            return  moyx = s/i;
        }
        
          double moyy(){
            double s=0;
            double moyy;
            for(int ligne=0;ligne<i;ligne++){
                for(int col=0;col<v;col++){
                    if(col==1){
                        s = s+data[ligne][col];
                    }
                }   
            }
            return  moyy = s/i;
        }
        
        double varx(){
            double s=0;
            double varx;
            for(int ligne=0;ligne<i;ligne++){
                for(int col=0;col<v;col++){
                    if(col==0){
                        s = s+ Math.pow(data[ligne][col],2);
                    }
                }   
            }
            s = s/i;
            varx = s-moyx();
            return  varx;
        }
        
        double vary(){
            double s=0;
            double vary;
            for(int ligne=0;ligne<i;ligne++){
                for(int col=0;col<v;col++){
                    if(col==1){
                        s = s+ Math.pow(data[ligne][col],2);
                    }
                }   
            }
            s = s/i;
            vary = s-moyy();
            return  vary;
        } 
        
        double cov(){
            double s=1;
            double xiyi=0;
            double cov;
            for(int ligne=0;ligne<i;ligne++){
                for(int col=0;col<v;col++){
                    s = s*data[ligne][col];  
                }
                xiyi = xiyi + s;
                System.out.println(xiyi);
                s=1;
            }System.out.println(xiyi);
            xiyi = xiyi/i;
            System.out.println(xiyi);
            cov = xiyi-(moyx()*moyy());
            return  cov;
        }
        
        double co(){
            double rx = Math.sqrt(varx());
            double ry = Math.sqrt(vary());
            double co = cov()/(rx)*(ry);
           
            return  co;
        }
        
        double[] droit(){
            double a = cov()/varx();
            double b = moyy()-a*moyx();
            return new double[] {a,b};
        }
    }
    
        /* la methode des moindres rectangles */
        class mrec{
                double varx;
                double vary;
                double cov;
            double[][] mat = new double[2][2];  
            mrec(double varx,double vary,double cov){
                this.varx = varx;
                this.vary = vary;
                this.cov = cov;
            }
           
            double det(){
                double L=0;
                
                mat[0][0] = varx;
                mat[1][1] = vary;
                mat[0][1] = cov;
                mat[1][0] = cov;
                // V - LI 
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        if (i == j){
                            mat[i][j] = mat[i][j]-L;
                        }
                    }
                }
                // det(V - LI) 
                double det=1;
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        if (i == j){
                            det = det  mat[i][j];
                        }
                    }
                }
                return 0;
            }
        }
        
}

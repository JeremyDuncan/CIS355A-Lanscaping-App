
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jeremyduncan
 */
public class LanscapingGUI extends javax.swing.JFrame {

    /**
     * Creates new form LanscapingGUI
     */
    public LanscapingGUI() {
        initComponents();

        // Center the form
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompanyName = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblInstructions2 = new javax.swing.JLabel();
        lblLength = new javax.swing.JLabel();
        txtLength = new javax.swing.JTextField();
        lblWidth = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lbOrderSummary = new javax.swing.JLabel();
        scrOrderSummary = new javax.swing.JScrollPane();
        txaOrderInfo = new javax.swing.JTextArea();
        btnSubmitOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jeremy Duncan Landscapes");

        lblCompanyName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompanyName.setText("Jeremy Duncan Lanscapes");

        lblInstructions1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstructions1.setText("Please enter your information:");

        lblName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblName.setText("Name:");

        lblAddress.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAddress.setText("Address:");

        txtName.setNextFocusableComponent(txtAddress);

        txtAddress.setNextFocusableComponent(txtLength);

        lblInstructions2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstructions2.setText("Enter the length and width of your yard:");

        lblLength.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblLength.setText("Length (ft.)");

        txtLength.setNextFocusableComponent(txtWidth);

        lblWidth.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblWidth.setText("Width (ft.)");

        txtWidth.setNextFocusableComponent(btnCalculate);

        btnCalculate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCalculate.setLabel("Calculate");
        btnCalculate.setNextFocusableComponent(btnSubmitOrder);
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lbOrderSummary.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbOrderSummary.setText("Order Summary:");

        txaOrderInfo.setColumns(16);
        txaOrderInfo.setRows(5);
        scrOrderSummary.setViewportView(txaOrderInfo);

        btnSubmitOrder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSubmitOrder.setText("Submit Order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLength)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWidth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCalculate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblInstructions2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblInstructions1)))
                .addGap(31, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scrOrderSummary, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(btnSubmitOrder)
                    .addComponent(lbOrderSummary))
                .addGap(40, 40, 40))
            .addComponent(lblCompanyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompanyName)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstructions1)
                    .addComponent(lbOrderSummary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addGap(24, 24, 24)
                        .addComponent(lblInstructions2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLength)
                            .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWidth)
                            .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scrOrderSummary))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnSubmitOrder))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // validate the inputs
        if (validateInputs() == false) {
            return;      // end the method if validation failed
        }

        // create the Customer object and show the information
        Customer cust = createCustomer();
        txaOrderInfo.setText(cust.getDetails());

    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(LanscapingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanscapingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanscapingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanscapingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanscapingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.JLabel lbOrderSummary;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JScrollPane scrOrderSummary;
    private javax.swing.JTextArea txaOrderInfo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        String sName = txtName.getText();
        String sAddress = txtAddress.getText();
        String sWidth = txtWidth.getText();
        String sLength = txtLength.getText();

        if (sName.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a Name",
                    "Name Error", JOptionPane.ERROR_MESSAGE);
            txtName.requestFocusInWindow();
            return false;
        }

        if (sAddress.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a Address",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sAddress.length() <= 5) {
            JOptionPane.showMessageDialog(this,
                    "Address isn't long enough.",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sWidth.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a Width",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.requestFocusInWindow();
            return false;
        }

        try {
            Double.parseDouble(sWidth);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Width must be a number",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.setText("");
            txtWidth.requestFocusInWindow();
            return false;
        }

        if (Double.parseDouble(sWidth) <= 0) {
            JOptionPane.showMessageDialog(this,
                    "Width must be greater than 0",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        }

        if (sLength.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a Length",
                    "Length Error", JOptionPane.ERROR_MESSAGE);

            txtLength.requestFocusInWindow();
            return false;
        }

        try {
            Double.parseDouble(sLength);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Length must be a number",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;

        }

        if (Double.parseDouble(sLength) <= 0) {
            JOptionPane.showMessageDialog(this,
                    "Length must be must be greater than 0",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        } else {
            // all is good so return true
            return true;
        }
    }

    private Customer createCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

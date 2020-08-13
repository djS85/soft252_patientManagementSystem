/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import frames.ViewMain;
import static panels.SecretarySystemMain.SecPanelType.APPROVE_ACCOUNTS;
import static panels.SecretarySystemMain.SecPanelType.CREATE_APPOINTMENT;
import static panels.SecretarySystemMain.SecPanelType.DISPENSE_MEDS;
import static panels.SecretarySystemMain.SecPanelType.ORDER_STOCK;
import static panels.SecretarySystemMain.SecPanelType.REMOVE_PATIENT;
import patientmanagementsystem.secretary_system.Secretary;

/**
 *
 * @author Dyn
 */
public class SecretarySystemMain extends javax.swing.JPanel {

    /**
     * Creates new form SecretarySystemMain
     */
    
    private SecApproveAccounts secApproveAccounts;
    private DoctorAppointmentPanel secAppointmentPanel;
    private DispenseMedicine dispenseMedicine;
    private SecretaryRemovePatient removePatient;
    private OrderMedicine orderMedicine;
    
    private ViewMain parent;
    private Secretary user;
    
    public enum SecPanelType {
        APPROVE_ACCOUNTS,
        CREATE_APPOINTMENT,
        DISPENSE_MEDS,
        REMOVE_PATIENT,
        ORDER_STOCK
    }
    
    public SecretarySystemMain(ViewMain _parent, Secretary _user) {
        this.parent = _parent;
        this.user = _user;
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Secretary Home");

        jButton1.setText("Approve Accounts");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Appointment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Dispense Medicine");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remove Patient");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Order Medicine");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(96, 96, 96)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(0, 318, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setPanel(APPROVE_ACCOUNTS);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setPanel(CREATE_APPOINTMENT);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setPanel(DISPENSE_MEDS);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setPanel(REMOVE_PATIENT);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setPanel(ORDER_STOCK);
    }//GEN-LAST:event_jButton5ActionPerformed

    public void setPanel(SecPanelType _panelType) {
        
        switch (_panelType) {
            
            case APPROVE_ACCOUNTS:
                if ( secApproveAccounts == null ) {
                    secApproveAccounts = new SecApproveAccounts(this, user);
                    parent.setContentPane(secApproveAccounts);
                } else {
                    parent.setContentPane(secApproveAccounts);
                }
                break;
                
            case CREATE_APPOINTMENT:
                if ( secAppointmentPanel == null ) {
                    secAppointmentPanel = new DoctorAppointmentPanel(this, user);
                    parent.setContentPane(secAppointmentPanel);
                } else {
                    parent.setContentPane(secAppointmentPanel);
                }
                break;
                
            case DISPENSE_MEDS:
                if ( dispenseMedicine == null ) {
                    dispenseMedicine = new DispenseMedicine(this, user);
                    parent.setContentPane(dispenseMedicine);
                } else {
                    parent.setContentPane(dispenseMedicine);
                }
                break;
                
            case REMOVE_PATIENT:
                if ( removePatient == null ) {
                    removePatient = new SecretaryRemovePatient(this, user);
                    parent.setContentPane(removePatient);
                } else {
                    parent.setContentPane(removePatient);
                }
                break;
                
            case ORDER_STOCK:
                if ( orderMedicine == null ) {
                    orderMedicine = new OrderMedicine(this, user);
                    parent.setContentPane(orderMedicine);
                } else {
                    parent.setContentPane(orderMedicine);
                }
                break;
                
            default:
                break;
        
        }
        
        parent.repaint();
        parent.revalidate();
    
    }
    
    public void setHomePanel() {
        parent.setPanel(PanelType.SEC_MAIN);
    }
    
    public void clearFields() {
        parent.clearFields();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

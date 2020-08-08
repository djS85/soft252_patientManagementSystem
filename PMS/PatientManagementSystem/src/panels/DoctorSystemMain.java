/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import frames.ViewMain;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JTextField;
import static panels.DoctorSystemMain.DoctorPanelType.APPOINTMENT_NOTES;
import static panels.DoctorSystemMain.DoctorPanelType.CREATE_PRESCRIPTION;
import static panels.DoctorSystemMain.DoctorPanelType.MAKE_APPOINTMENT;
import static panels.DoctorSystemMain.DoctorPanelType.VIEW_APPOINTMENTS;
import patientmanagementsystem.doctor_system.Doctor;

/**
 *
 * @author djs85
 */
public class DoctorSystemMain extends javax.swing.JPanel {

    /**
     * Creates new form DoctorSystemMain
     */
    
    protected ViewMain parent;
    
    private DoctorAppointmentPanel doctorAppointmentPanel;
    private DoctorViewAppointments doctorViewAppointments;
    private DoctorAppointmentNotes doctorAppointmentNotes;
    private DoctorCreatePrescription doctorCreatePrescription;
    
    private Doctor user;

    public enum DoctorPanelType {
        MAKE_APPOINTMENT,
        VIEW_APPOINTMENTS,
        APPOINTMENT_NOTES,
        CREATE_PRESCRIPTION
    }
    
    public DoctorSystemMain(ViewMain _parent, Doctor _user) {
        this.user = _user;
        this.parent = _parent;
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

        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Home");

        jButton1.setText("Create Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View Appointments");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Appointment Notes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Create Prescription");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(118, 118, 118)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setPanel(MAKE_APPOINTMENT);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setPanel(VIEW_APPOINTMENTS);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setPanel(APPOINTMENT_NOTES);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setPanel(CREATE_PRESCRIPTION);
    }//GEN-LAST:event_jButton4ActionPerformed

    public void setPanel(DoctorPanelType _panelType) {
        
        switch (_panelType) {
            case MAKE_APPOINTMENT:
                    if ( doctorAppointmentPanel == null ) {
                        doctorAppointmentPanel = new DoctorAppointmentPanel(this, user);
                        parent.setContentPane(doctorAppointmentPanel);
                    } else {
                        parent.setContentPane(doctorAppointmentPanel);
                    }
                break;
                
            case VIEW_APPOINTMENTS:
                if ( doctorViewAppointments == null ) {
                    doctorViewAppointments = new DoctorViewAppointments(this, user);
                    parent.setContentPane(doctorViewAppointments);
                } else {
                    parent.setContentPane(doctorViewAppointments);
                }
                break;
                
            case APPOINTMENT_NOTES:
                if ( doctorAppointmentNotes == null ) {
                    doctorAppointmentNotes = new DoctorAppointmentNotes(this, user);
                    parent.setContentPane(doctorAppointmentNotes);
                } else {
                    parent.setContentPane(doctorAppointmentNotes);
                }
                break;
                
            case CREATE_PRESCRIPTION:
                if ( doctorCreatePrescription == null ) {
                    doctorCreatePrescription = new DoctorCreatePrescription(this, user);
                    parent.setContentPane(doctorCreatePrescription);
                } else {
                    parent.setContentPane(doctorCreatePrescription);
                }
                break;
                
            default:
                break;
                
        }
        
        parent.repaint();
        parent.revalidate();
        
    }
    
    public void setHomePanel() {
        parent.setPanel(PanelType.DOCTOR_MAIN);
    }
    
    public void clearFields() {
        parent.clearFields();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

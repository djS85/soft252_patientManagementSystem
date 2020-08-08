/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import frames.ViewMain;
import static panels.PatientSystemMain.PatientPanelType.BOOK_APPOINTMENT;
import static panels.PatientSystemMain.PatientPanelType.RATE_DOCTOR;
import static panels.PatientSystemMain.PatientPanelType.VIEW_APPOINTMENTS;
import patientmanagementsystem.admin_system.DoctorRatingsPanel;
import patientmanagementsystem.patient_system.Patient;

/**
 *
 * @author djs85
 */
public class PatientSystemMain extends javax.swing.JPanel {

    /**
     * Creates new form PatientSystemMain
     */
    
    private DoctorRatingsPanel doctorRatingsPanel;
    private AppointmentPanel appointmentPanel;
    private ViewAppointments viewAppointments;
    
    protected ViewMain parent;
    protected Patient user;
    
    public enum PatientPanelType {
        
        RATE_DOCTOR,
        BOOK_APPOINTMENT,
        VIEW_APPOINTMENTS
    
    }
    
    public PatientSystemMain(ViewMain _parent, Patient _user) {
        this.parent = _parent;
        this.user = _user;
        initComponents();
        
        String patientName = user.getFullName();
        
        jLabel2.setText("Welcome " + patientName);
        
    }
    
    public void setPanel(PatientPanelType panelType) {
    
        switch (panelType) {
            
            case RATE_DOCTOR:
                if ( this.doctorRatingsPanel == null ) {
                    this.doctorRatingsPanel = new DoctorRatingsPanel(user);
                    parent.setContentPane(this.doctorRatingsPanel);
                } else {
                    parent.setContentPane(this.doctorRatingsPanel);
                } 
            
                break;
                
            case BOOK_APPOINTMENT:
                if ( this.appointmentPanel == null ) {
                    this.appointmentPanel = new AppointmentPanel(user, this);
                    parent.setContentPane(this.appointmentPanel);
                } else {
                    parent.setContentPane(this.appointmentPanel);
                }
                
                break;
                
            case VIEW_APPOINTMENTS:
                if ( viewAppointments == null ) {
                    this.viewAppointments = new ViewAppointments(user, this);
                    parent.setContentPane(this.viewAppointments);
                } else {
                    parent.setContentPane(this.viewAppointments);
                }
                
                break;
                
            default:
                break;
        }
        
        parent.repaint();
        parent.revalidate();
        
    }
    
    public void setHomePanel() {
        parent.setPanel(PanelType.PATIENT_MAIN);
    }
    
    public void clearFields() {
        parent.clearFields();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Patient Home");

        jButton1.setText("Rate Doctor/ View Ratings");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Book Appointment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("View Appointments");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1)))
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setPanel(RATE_DOCTOR);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setPanel(BOOK_APPOINTMENT);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setPanel(VIEW_APPOINTMENTS);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

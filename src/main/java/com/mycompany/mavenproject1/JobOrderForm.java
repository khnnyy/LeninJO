/*
 * 
 *
 *
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Arrays;
import java.util.UUID;
import javax.swing.SwingUtilities;

/**
 *
 * @author khanny
 */
public class JobOrderForm extends javax.swing.JFrame {
    
    private String jO;

    JOVar att = new JOVar();
    MangoDBConnection mangoDBConnection = new MangoDBConnection();
    /**
     * Creates new form JobOrderForm
     */
    
    
    public JobOrderForm() {
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

        jobtype = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cm = new javax.swing.JRadioButton();
        occular = new javax.swing.JRadioButton();
        project = new javax.swing.JRadioButton();
        clientName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        contact = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        concern = new javax.swing.JTextArea();
        leader = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        transportation = new javax.swing.JComboBox<>();
        title = new javax.swing.JLabel();
        jobCode = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dueDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Job Order Type:");

        jobtype.add(cm);
        cm.setText("CM");
        cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmActionPerformed(evt);
            }
        });

        jobtype.add(occular);
        occular.setText("OCULLAR");
        occular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occularActionPerformed(evt);
            }
        });

        jobtype.add(project);
        project.setText("PROJECT");
        project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectActionPerformed(evt);
            }
        });

        clientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Client Name:");

        jLabel4.setText("Address:");

        jLabel5.setText("Contact:");

        jLabel6.setText("Initial Concern:");

        jLabel7.setText("Team Leader:");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        concern.setColumns(20);
        concern.setRows(5);
        jScrollPane3.setViewportView(concern);

        leader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderActionPerformed(evt);
            }
        });

        jLabel9.setText("Tranportation:");

        transportation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "1-5 KM", "6-10 KM", "11-15 KM", "16-20 KM", "20-25 KM", " " }));
        transportation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportationActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        title.setText("Job Order Form");

        jobCode.setEditable(false);
        jobCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobCodeActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        clear.setText("Clear Form");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel3.setText("Due Date:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jLabel8.setText("mm/dd/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(occular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(project)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jobCode))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(clear))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(submit, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(contact)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(leader, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dueDate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(transportation, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cm)
                    .addComponent(occular)
                    .addComponent(project)
                    .addComponent(jobCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(dueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(transportation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit)
                    .addComponent(clear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectActionPerformed
        updateJobCode();
    }//GEN-LAST:event_projectActionPerformed

    private void occularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occularActionPerformed
        updateJobCode();
    }//GEN-LAST:event_occularActionPerformed

    private void cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmActionPerformed
        updateJobCode();
    }//GEN-LAST:event_cmActionPerformed

    private void clientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientNameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void leaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leaderActionPerformed

    private void transportationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transportationActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        
        String jobOrderType = getJobOrderType();
        String clientName = this.clientName.getText();
        String address = this.address.getText();
        String contact = this.contact.getText();
        String concern = this.concern.getText();
        String leader = this.leader.getText();
        String transportation = this.transportation.getSelectedItem().toString();
        String jobCode = this.jobCode.getText();
        String status = "pending";

        att.setJobOrderType(jobOrderType);
        att.setClientName(clientName);
        att.setAddress(address);
        att.setContact(contact);
        att.setConcern(concern);
        att.setLeader(leader);
        att.setTranspo(transportation);
        att.setJobCode(jobCode);
        att.setStatus(status);
        
        // Disable UI components during processing
        submit.setEnabled(false);
        clear.setEnabled(false);

        // Build email body
//        StringBuilder body = new StringBuilder();
//        body.append("<html><body>");
//        body.append("<h2>Job Order Form Submission</h2>");
//        body.append("<p><strong>Job Order Type:</strong> ").append(jobOrderType).append("</p>");
//        body.append("<p><strong>Client Name:</strong> ").append(clientName).append("</p>");
//        body.append("<p><strong>Address:</strong> ").append(address).append("</p>");
//        body.append("<p><strong>Contact:</strong> ").append(contact).append("</p>");
//        body.append("<p><strong>Initial Concern:</strong><br>").append(concern).append("</p>");
//        body.append("<p><strong>Team Leader:</strong> ").append(leader).append("</p>");
//        body.append("<p><strong>Transportation:</strong> ").append(transportation).append("</p>");
//        body.append("<p><strong>Job Code:</strong> ").append(jobCode).append("</p>");
//        body.append("</body></html>");
////        body.append("<p>Click <a href='http://localhost:8080/joborder/updateStatus?jobCode=").append(jobCode).append("&status=confirmed'>here</a> to confirm.</p>");
////        String uRL = "https://leninwebserverjo.onrender.com"; // Replace <your_ngrok_subdomain> with the actual subdomain provided by ngrok
        String uRL = "https://leninwebserver.onrender.com"; // Replace <your_ngrok_subdomain> with the actual subdomain provided by ngrok
//        body.append("<p>Click <a href='").append(uRL).append("/joborder/updateStatus?jobCode=").append(jobCode).append("&status=confirmed'>here</a> to confirm.</p>");
//        
//        body.append("</body></html>");
        
StringBuilder body = new StringBuilder();
body.append("<!DOCTYPE html>");
body.append("<html lang='en' style='font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, Oxygen, Ubuntu, Cantarell, \"Open Sans\", \"Helvetica Neue\", sans-serif;'>");
body.append("<head>");
body.append("<meta charset='UTF-8'>");
body.append("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
body.append("<title>Job Order Form Submission</title>");
body.append("<style>");
body.append("body { margin: 0; padding: 0; background-color: #f9f9f9; }");
body.append("table { width: 100%; border-collapse: collapse; border-spacing: 0; }");
body.append("th, td { padding: 10px; border-bottom: 1px solid #ddd; }");
body.append("th { background-color: #f0f0f0; }");
body.append("a { text-decoration: none; color: #337ab7; }");
body.append("a:hover { color: #23527c; }");
body.append("</style>");
body.append("</head>");
body.append("<body>");
body.append("<header style='background-color: #333; color: #fff; padding: 20px; text-align: center;'>");
body.append("<h2>Job Order Form Submission</h2>");
body.append("</header>");
body.append("<main style='max-width: 600px; margin: 40px auto; padding: 20px; background-color: #fff; border: 1px solid #ddd; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);'>");
body.append("<table>");
body.append("<tr><th>Job Order Type:</th><td>").append(jobOrderType).append("</td></tr>");
body.append("<tr><th>Client Name:</th><td>").append(clientName).append("</td></tr>");
body.append("<tr><th>Address:</th><td>").append(address).append("</td></tr>");
body.append("<tr><th>Contact:</th><td>").append(contact).append("</td></tr>");
body.append("<tr><th>Initial Concern:</th><td>").append(concern).append("</td></tr>");
body.append("<tr><th>Team Leader:</th><td>").append(leader).append("</td></tr>");
body.append("<tr><th>Transportation:</th><td>").append(transportation).append("</td></tr>");
body.append("<tr><th>Job Code:</th><td>").append(jobCode).append("</td></tr>");
body.append("</table>");
body.append("<p style='margin-top: 20px;'>Click <a href='").append(uRL).append("/joborder/updateStatus?jobCode=").append(jobCode).append("&status=confirmed'>here</a> to confirm.</p>");
body.append("</main>");
body.append("</body>");
body.append("</html>");

        // Send email and update Google Sheets in background
        // Existing email sending and Google Sheets update code...
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws IOException, GeneralSecurityException {
                // Update MongoDB status based on job code
                EmailForm.readEmailConfig();
                JOVar mail = EmailForm.getConfig();
                mangoDBConnection.insertData(att);

                // Send email
                String to = "xabubakarzx@gmail.com";
                String from = mail.getEmail();
                String host = "smtp.gmail.com";
                String subject = "Job Order Form Submission";

                EmailForm.sendEmail(to, from, host, subject, body.toString(), null);

                return null;
            }

            @Override
            protected void done() {
                // Enable UI components after processing completes
                SwingUtilities.invokeLater(() -> {
                    submit.setEnabled(true);
                    clear.setEnabled(true);
                    JOptionPane.showMessageDialog(JobOrderForm.this,
                            "Email Sent successfully and data updated in MongoDB.",
                            "Operation Status", JOptionPane.INFORMATION_MESSAGE);
                });
            }
        };


        // Execute the SwingWorker
        worker.execute();
    }//GEN-LAST:event_submitActionPerformed

    public static List<List<Object>> prepareRowData(String jobOrderType, String clientName, String address, String contact,
                                                    String concern, String leader, String transportation, String jobCode) {
        return Arrays.asList(
            Arrays.asList(jobOrderType, clientName, address, contact, concern, leader, transportation, jobCode)
        );
    }

    
    private void jobCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobCodeActionPerformed
 
    }//GEN-LAST:event_jobCodeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        jobCode.setText("");
        clientName.setText("");
        address.setText("");
        contact.setText("");
        concern.setText("");
        leader.setText("");
        transportation.getSelectedItem();
        jobCode.getText();

    }//GEN-LAST:event_clearActionPerformed
    
    
    private void updateJobCode() {
    try {
        att.setJobOrderType(getJobOrderType());
        String jobC = mangoDBConnection.jobCode(att);
        // Update the job code text field
        jobCode.setText(jobC);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error fetching next job code: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    
private String getJobOrderType() {
    
    if (cm.isSelected()) {
        return "CM";
    } else if (occular.isSelected()) {
        return "OCCULAR";
    } else if (project.isSelected()) {
        return "PROJECT";
    }
    JOptionPane.showMessageDialog(this, "Please select a Job Order.", "Job Order Selection", JOptionPane.WARNING_MESSAGE);
    return "";
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
            java.util.logging.Logger.getLogger(JobOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JobOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JobOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JobOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JobOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JButton clear;
    private javax.swing.JTextField clientName;
    private javax.swing.JRadioButton cm;
    private javax.swing.JTextArea concern;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField dueDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jobCode;
    private javax.swing.ButtonGroup jobtype;
    private javax.swing.JTextField leader;
    private javax.swing.JRadioButton occular;
    private javax.swing.JRadioButton project;
    private javax.swing.JButton submit;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> transportation;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itcs3166_project;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


/**
 *
 * @author Kyle
 */
public class UI extends javax.swing.JPanel {

    Router r = new Router();
    
    /**
     * Creates new form UI
     */
    public UI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        inputIP = new javax.swing.JTextPane();
        goButton = new javax.swing.JButton();
        binaryOutput = new javax.swing.JLabel();
        subnetmaskLabel = new javax.swing.JLabel();
        binaryLabel1 = new javax.swing.JLabel();
        subnetmaskOutput = new javax.swing.JLabel();
        subnetmaskLabel1 = new javax.swing.JLabel();
        routesTo = new javax.swing.JLabel();

        inputIP.setText("IP Address");
        jScrollPane1.setViewportView(inputIP);

        goButton.setText("GO");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonPressed(evt);
            }
        });

        binaryOutput.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        binaryOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        subnetmaskLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subnetmaskLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subnetmaskLabel.setText("Binary Subnet Mask");

        binaryLabel1.setBackground(new java.awt.Color(0, 0, 0));
        binaryLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        binaryLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        binaryLabel1.setText("Binary IP Address");

        subnetmaskOutput.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        subnetmaskOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        subnetmaskLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subnetmaskLabel1.setText("Routes to:");

        routesTo.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        routesTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subnetmaskOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(binaryOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subnetmaskLabel1)
                            .addComponent(goButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(routesTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(binaryLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subnetmaskLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(binaryLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(binaryOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subnetmaskLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subnetmaskOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(routesTo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(subnetmaskLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(goButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    //Begin application
    private void goButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonPressed
        // TODO add your handling code here:
        String ipAddress = r.getIPAddress(inputIP.getText());
        String subnetMask = r.getSubnetMask(inputIP.getText());
        try{
        binaryOutput.setText(r.getAsBinary(ipAddress));
        subnetmaskOutput.setText(r.getSubnetMask(parseInt(subnetMask)));
        routesTo.setText(r.checkRouting(inputIP.getText()));
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter a valid IP address \n xxxx.xxxx.xxxx.xxxx/xx");
        }
        
    }//GEN-LAST:event_goButtonPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel binaryLabel1;
    private javax.swing.JLabel binaryOutput;
    private javax.swing.JButton goButton;
    private javax.swing.JTextPane inputIP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel routesTo;
    private javax.swing.JLabel subnetmaskLabel;
    private javax.swing.JLabel subnetmaskLabel1;
    private javax.swing.JLabel subnetmaskOutput;
    // End of variables declaration//GEN-END:variables
}

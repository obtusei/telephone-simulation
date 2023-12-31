package com.mycompany.telephone_019312;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Telephone extends javax.swing.JFrame {
    
    boolean call_1 = true;
    boolean call_2 = true;
    boolean call_3 = true;
    boolean call_4 = true;
    boolean call_5 = true;
    boolean call_6 = true;
    int calling[] = new int[7];
    int total_processed_call = 0;
    int completed_call = 0;
    int busy_call = 0;
    int blocked_call = 0;
    private Timer timer;
    private int seconds = 1057;
    int max_calls = 0; //max will be 2
    
    public Telephone() {
        initComponents();
    }
    
    private void removeCallFromTable(String val){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        if (rowCount != 0) {
            for (int i = rowCount - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) != null) {
                    if (model.getValueAt(i, 0).toString().equals(val)) {
                        completed_call++;
                        completedCalls.setText(Integer.toString(completed_call));
                        model.removeRow(i);
                    }
                }
            }
        }
    }
    
    
    private void showCurrentTime(){
        int delay = 2500; // 1000 milliseconds = 1 second
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seconds++;
                currentTime.setText(Integer.toString(seconds));
               DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int rowCount = model.getRowCount();
                if (rowCount != 0){
                     for (int i = rowCount - 1; i >= 0; i--) {
                        if (seconds == Integer.parseInt(model.getValueAt(i, 2).toString())){
                            switch (model.getValueAt(i, 0).toString()){
                                case "1": end1.doClick();break;
                                case "2": end2.doClick();break;
                                case "3": end3.doClick();break;
                                case "4": end4.doClick();break;
                                case "5": end5.doClick();break;
                                case "6": end6.doClick();break;
                                default : System.out.println("ERRRORRR");
                            }
                        }
                    }
                }
            }
        });
        timer.start();
        repaint();
    }
    
    private String call(Object possibilities[]){ 
        
        String s = (String)JOptionPane.showInputDialog(
                                        this,
                                        "Select phone number to dial",
                                        "Number To Call",
                                        JOptionPane.PLAIN_MESSAGE,
                                        null,
                                        possibilities,
                                        possibilities[0]);
        if ((s != null) && (s.length() > 0)){
        return s;
        }else{
            return "";
        }
    }
    
    private int callLength(){ 
        
        String input = JOptionPane.showInputDialog(this,"Enter call length:");
        if (input == null) {
            return 0;
        } else {
            try {
                // Parse the input into an integer
                int number = Integer.parseInt(input);
                System.out.println("You entered: " + number);
                return number;
                // Now you can use the 'number' variable for numerical operations
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return 0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        call1 = new javax.swing.JToggleButton();
        end1 = new javax.swing.JToggleButton();
        state1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        call2 = new javax.swing.JToggleButton();
        end2 = new javax.swing.JToggleButton();
        state2 = new javax.swing.JLabel();
        call3 = new javax.swing.JToggleButton();
        state3 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        end3 = new javax.swing.JToggleButton();
        label4 = new javax.swing.JLabel();
        call4 = new javax.swing.JToggleButton();
        end4 = new javax.swing.JToggleButton();
        state4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        call5 = new javax.swing.JToggleButton();
        end5 = new javax.swing.JToggleButton();
        state5 = new javax.swing.JLabel();
        call6 = new javax.swing.JToggleButton();
        state6 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        end6 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        completedCalls = new javax.swing.JLabel();
        blockedCalls = new javax.swing.JLabel();
        busyCalls = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        currentTime = new javax.swing.JLabel();
        simulate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        totalProcessedCalls = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        callInUse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 0));

        label1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        label1.setText("1");

        call1.setText("Call");
        call1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call1ActionPerformed(evt);
            }
        });

        end1.setText("End");
        end1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end1ActionPerformed(evt);
            }
        });

        state1.setText("Ready");

        label2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        label2.setText("2");

        call2.setText("Call");
        call2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call2ActionPerformed(evt);
            }
        });

        end2.setText("End");
        end2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end2ActionPerformed(evt);
            }
        });

        state2.setText("Ready");

        call3.setText("Call");
        call3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call3ActionPerformed(evt);
            }
        });

        state3.setText("Ready");

        label3.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        label3.setText("3");

        end3.setText("End");
        end3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end3ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        label4.setText("4");

        call4.setText("Call");
        call4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call4ActionPerformed(evt);
            }
        });

        end4.setText("End");
        end4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end4ActionPerformed(evt);
            }
        });

        state4.setText("Ready");

        label5.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        label5.setText("5");

        call5.setText("Call");
        call5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call5ActionPerformed(evt);
            }
        });

        end5.setText("End");
        end5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end5ActionPerformed(evt);
            }
        });

        state5.setText("Ready");

        call6.setText("Call");
        call6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call6ActionPerformed(evt);
            }
        });

        state6.setText("Ready");

        label6.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        label6.setText("6");

        end6.setText("End");
        end6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end6ActionPerformed(evt);
            }
        });

        jLabel2.setText("Completed Calls:");

        jLabel3.setText("Blocked Calls:");

        jLabel4.setText("Busy Calls:");

        completedCalls.setText("0");

        blockedCalls.setText("0");

        busyCalls.setText("0");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setText("Telphone System Simulation");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel11.setText("Simulation and Modeling Lab");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel12.setText("By Abhishek Bhatta (019-312)");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Nepal Engineering College");

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel14.setText("Clock Time:");

        currentTime.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        currentTime.setText("0");

        simulate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        simulate.setForeground(new java.awt.Color(51, 51, 255));
        simulate.setText("Start Timer");
        simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FROM", "TO", "END"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel15.setText("Total Processed Calls:");

        totalProcessedCalls.setText("0");

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel17.setText("CALL IN PROGRESS");

        jLabel1.setText("MAX:");

        jLabel5.setText("2");

        jLabel6.setText("IN USE:");

        callInUse.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(call1)
                            .addComponent(end1)
                            .addComponent(state1))
                        .addGap(99, 99, 99)
                        .addComponent(label4)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(call4)
                            .addComponent(end4)
                            .addComponent(state4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(call2)
                            .addComponent(end2)
                            .addComponent(state2))
                        .addGap(99, 99, 99)
                        .addComponent(label5)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(call5)
                            .addComponent(end5)
                            .addComponent(state5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(call3)
                            .addComponent(end3)
                            .addComponent(state3))
                        .addGap(99, 99, 99)
                        .addComponent(label6)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(call6)
                            .addComponent(end6)
                            .addComponent(state6)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(callInUse)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(completedCalls)
                            .addComponent(blockedCalls)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(totalProcessedCalls, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(busyCalls, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel17)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(currentTime))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(call1)
                                .addGap(6, 6, 6)
                                .addComponent(end1)
                                .addGap(6, 6, 6)
                                .addComponent(state1))
                            .addComponent(label4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(call4)
                                .addGap(6, 6, 6)
                                .addComponent(end4)
                                .addGap(6, 6, 6)
                                .addComponent(state4)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(call2)
                                .addGap(6, 6, 6)
                                .addComponent(end2)
                                .addGap(6, 6, 6)
                                .addComponent(state2))
                            .addComponent(label5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(call5)
                                .addGap(6, 6, 6)
                                .addComponent(end5)
                                .addGap(6, 6, 6)
                                .addComponent(state5)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(call3)
                                        .addGap(6, 6, 6)
                                        .addComponent(end3)
                                        .addGap(7, 7, 7)
                                        .addComponent(state3)))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(callInUse)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(call6)
                                        .addGap(6, 6, 6)
                                        .addComponent(end6)
                                        .addGap(6, 6, 6)
                                        .addComponent(state6)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(completedCalls)
                                    .addComponent(jLabel2))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(blockedCalls)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(busyCalls)
                                    .addComponent(jLabel4))
                                .addGap(6, 6, 6)
                                .addComponent(totalProcessedCalls)))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void makeACall(int callLen, int[] between, JLabel label1,JLabel label2, JToggleButton call1,JToggleButton call2,JToggleButton end1,JToggleButton end2,JLabel state1, JLabel state2) {
        // Perform some action with the JLabel
        label1.setForeground(Color.green);
        label2.setForeground(Color.green);
//        completed_call++;
        max_calls++;
//        completedCalls.setText(Integer.toString(completed_call));
        callInUse.setText(Integer.toString(max_calls));
        call1.setEnabled(false);
        end1.setEnabled(true);
        call2.setEnabled(false);
        end2.setEnabled(true);
        calling[between[0]] = between[1];
        calling[between[1]] = between[0];
        state1.setText("In call with " + between[1]);
        state2.setText("In call with " + between[0]);
        Object[] newItem = {label1.getText(),label2.getText(),seconds+callLen};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(newItem);
        // You can do any other operations with the label here
    } 
    private void call1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call1ActionPerformed
        // TODO add your handling code here:
        if (max_calls<2){
        Object calls[] = {"2", "3", "4", "5", "6"};
        String s = call(calls);
        if (!s.isEmpty()){
            int callLen = callLength();
            if (callLen != 0){
                total_processed_call++;
                totalProcessedCalls.setText(Integer.toString(total_processed_call));
                if("2".matches(s) && call_2){
                    int[] numbers = {1, 2};
                    call_1 =false;
                    call_2 = false;
                    makeACall(callLen,numbers,label1,label2,call1,call2,end1,end2,state1,state2);
                }else if("3".matches(s) && call_3){
                    int[] numbers = {1, 3};
                    call_1=false;
                    call_3=false;
                    makeACall(
                            callLen,
                            numbers,
                            label1,
                            label3,
                            call1,
                            call3,
                            end1,
                            end3,
                            state1,
                            state3
                    );
                }else if("4".matches(s) && call_4){
                    int[] numbers = {1, 4};
                    call_1=false;
                    call_4=false;
                    makeACall(
                            callLen,
                            numbers,
                            label1,
                            label4,
                            call1,
                            call4,
                            end1,
                            end4,
                            state1,
                            state4
                    );
                }else if("5".matches(s) && call_5){
                    int[] numbers = {1, 5};
                    call_1=false;
                    call_5=false;
                    makeACall(
                            callLen,
                            numbers,
                            label1,
                            label5,
                            call1,
                            call5,
                            end1,
                            end5,
                            state1,
                            state5
                    );
                }else if("6".matches(s) && call_6){
                    int[] numbers = {1, 6};
                    call_1=false;
                    call_6=false;
                    makeACall(
                            callLen,
                            numbers,
                            label1,
                            label6,
                            call1,
                            call6,
                            end1,
                            end6,
                            state1,
                            state6
                    );
                }
                else{
                    javax.swing.JOptionPane.showMessageDialog(this, "The subscriber is busy, please try again later!", "Busy", javax.swing.JOptionPane.ERROR_MESSAGE);
                    busy_call++;
                    busyCalls.setText(Integer.toString(busy_call));
                }
            } 
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "You have reached the limit (maximum 2)", "LIMITED CALLS ONLY", javax.swing.JOptionPane.ERROR_MESSAGE);
            blocked_call++;
            blockedCalls.setText(Integer.toString(blocked_call));
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
        }
        System.out.println("MAX CALL IS: " + max_calls);
    }//GEN-LAST:event_call1ActionPerformed

    private void simulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateActionPerformed
        // TODO add your handling code here:
        showCurrentTime();
    }//GEN-LAST:event_simulateActionPerformed

    private void end1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end1ActionPerformed
        // TODO add your handling code here:
        removeCallFromTable("1");
        call1.setEnabled(true);
        end1.setEnabled(false);
        state1.setText("Ready");
        max_calls--;
        callInUse.setText(Integer.toString(max_calls));
        call_1 = true;
        label1.setForeground(Color.black);
        
        if(calling[1] == 2){
            call_2 = true;
            state2.setText("Ready");
            call2.setEnabled(true);
            end2.setEnabled(false);
            label2.setForeground(Color.black);
        }if(calling[1] == 3){
            call_3 = true;
            state3.setText("Ready");
            call3.setEnabled(true);
            end3.setEnabled(false);
            label3.setForeground(Color.black);
        }if(calling[1] == 4){
            call_4 = true;
            state4.setText("Ready");
            call4.setEnabled(true);
            end4.setEnabled(false);
            label4.setForeground(Color.black);
        }if(calling[1] == 5){
            call_5 = true;
            state5.setText("Ready");
            call5.setEnabled(true);
            end5.setEnabled(false);
            label5.setForeground(Color.black);
        }if(calling[1] == 6){
            call_6 = true;
            state6.setText("Ready");
            call6.setEnabled(true);
            end6.setEnabled(false);
            label6.setForeground(Color.black);
        }
    }//GEN-LAST:event_end1ActionPerformed

    private void call2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call2ActionPerformed
        // TODO add your handling code here:
        
        if (max_calls<2){
        Object calls[] = {"1", "3", "4", "5", "6"};
        String s = call(calls);
        if (!s.isEmpty()){
            int callLen = callLength();
            if (callLen != 0){
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
            if("1".matches(s) && call_1){
                int[] numbers = {2, 1};
                call_2=call_1=false;
                makeACall(callLen,numbers,label2,label1,call2,call1,end2,end1,
                        state2,
                        state1);
            }else if("3".matches(s) && call_3){
                int[] numbers = {2, 3};
                call_2=call_3=false;
                makeACall(
                        callLen,
                        numbers,
                        label2,
                        label3,
                        call2,
                        call3,
                        end2,
                        end3,
                        state2,
                        state3
                );
            }else if("4".matches(s) && call_4){
                int[] numbers = {2, 4};
                call_2=call_4=false;
                makeACall(
                        callLen,
                        numbers,
                        label2,
                        label4,
                        call2,
                        call4,
                        end2,
                        end4,
                        state2,
                        state4
                );
            }else if("5".matches(s) && call_5){
                int[] numbers = {2, 5};
                call_2=call_5=false;
                makeACall(
                        callLen,
                        numbers,
                        label2,
                        label5,
                        call2,
                        call5,
                        end2,
                        end5,
                        state2,
                        state5
                );
            }else if("6".matches(s) && call_6){
                int[] numbers = {2, 6};
                call_2=call_6=false;
                makeACall(
                        callLen,
                        numbers,
                        label2,
                        label6,
                        call2,
                        call6,
                        end2,
                        end6,
                        state2,
                        state6
                );
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(this, "The subscriber is busy, please try again later!", "Busy", javax.swing.JOptionPane.ERROR_MESSAGE);
                busy_call++;
                busyCalls.setText(Integer.toString(busy_call));
            }
            }
        } 
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "You have reached the limit (maximum 2)", "LIMITED CALLS ONLY", javax.swing.JOptionPane.ERROR_MESSAGE);
            blocked_call++;
            blockedCalls.setText(Integer.toString(blocked_call));
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
        }
        System.out.println("MAX CALL IS: " + max_calls);
    }//GEN-LAST:event_call2ActionPerformed

    private void end2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end2ActionPerformed
        // TODO add your handling code here:
        call2.setEnabled(true);
        end2.setEnabled(false);
        state2.setText("Ready");
        max_calls--;
        callInUse.setText(Integer.toString(max_calls));
        label2.setForeground(Color.black);
        removeCallFromTable("2");
        call_2 = true;
        if(calling[2] == 1){
            call_1 = true;
            state1.setText("Ready");
            call1.setEnabled(true);
            end1.setEnabled(false);
            label1.setForeground(Color.black);
        }if(calling[2] == 3){
            call_3 = true;
            state3.setText("Ready");
            call3.setEnabled(true);
            end3.setEnabled(false);
            label3.setForeground(Color.black);
        }if(calling[2] == 4){
            call_4 = true;
            state4.setText("Ready");
            call4.setEnabled(true);
            end4.setEnabled(false);
            label4.setForeground(Color.black);
        }if(calling[2] == 5){
            call_5 = true;
            state5.setText("Ready");
            call5.setEnabled(true);
            end5.setEnabled(false);
            label5.setForeground(Color.black);
        }if(calling[2] == 6){
            call_6 = true;
            state6.setText("Ready");
            call6.setEnabled(true);
            end6.setEnabled(false);
            label6.setForeground(Color.black);
        }
    }//GEN-LAST:event_end2ActionPerformed

    private void call3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call3ActionPerformed
        // TODO add your handling code here:
        
        if (max_calls<2){
        Object calls[] = {"1", "2", "4", "5", "6"};
        String s = call(calls);
        if (!s.isEmpty()){
            int callLen = callLength();
            if (callLen != 0){
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
            if("1".matches(s) && call_1){
                int[] numbers = {3, 1};
                call_3=call_1=false;
                makeACall(callLen,numbers,label3,label1,call3,call1,end3,end1,
                        state3,
                        state1);
            }else if("2".matches(s) && call_2){
                int[] numbers = {3, 2};
                call_3=call_2=false;
                makeACall(
                        callLen,
                        numbers,
                        label3,
                        label2,
                        call3,
                        call2,
                        end3,
                        end2,
                        state3,
                        state2
                );
            }else if("4".matches(s) && call_4){
                int[] numbers = {3, 4};
                call_3=call_4=false;
                makeACall(
                        callLen,
                        
                        numbers,
                        label3,
                        label4,
                        call3,
                        call4,
                        end3,
                        end4,
                        state3,
                        state4
                );
            }else if("5".matches(s) && call_5){
                int[] numbers = {3, 5};
                call_3=false;
                call_5=false;
                makeACall(
                        callLen,        
                        numbers,
                        label3,
                        label5,
                        call3,
                        call5,
                        end3,
                        end5,
                        state3,
                        state5
                );
            }else if("6".matches(s) && call_6){
                int[] numbers = {3, 6};
                call_3=false;
                call_6=false;
                makeACall(
                        callLen,        
                        numbers,
                        label3,
                        label6,
                        call3,
                        call6,
                        end3,
                        end6,
                        state3,
                        state6
                );
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(this, "The subscriber is busy, please try again later!", "Busy", javax.swing.JOptionPane.ERROR_MESSAGE);
                busy_call++;
                busyCalls.setText(Integer.toString(busy_call));
            }
            }
        } 
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "You have reached the limit (maximum 2)", "LIMITED CALLS ONLY", javax.swing.JOptionPane.ERROR_MESSAGE);
            blocked_call++;
            blockedCalls.setText(Integer.toString(blocked_call));
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
        }   
        System.out.println("MAX CALL IS: " + max_calls);
    }//GEN-LAST:event_call3ActionPerformed

    private void end3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end3ActionPerformed
        // TODO add your handling code here:
        call3.setEnabled(true);
        end3.setEnabled(false);
        state3.setText("Ready");
        max_calls--;
        callInUse.setText(Integer.toString(max_calls));
        call_3 = true;
        label3.setForeground(Color.black);
        removeCallFromTable("3");
        if(calling[3] == 1){
            call_1 = true;
            state1.setText("Ready");
            call1.setEnabled(true);
            end1.setEnabled(false);
            label1.setForeground(Color.black);
        }if(calling[3] == 2){
            call_2 = true;
            state2.setText("Ready");
            call2.setEnabled(true);
            end2.setEnabled(false);
            label2.setForeground(Color.black);
        }if(calling[3] == 4){
            call_4 = true;
            state4.setText("Ready");
            call4.setEnabled(true);
            end4.setEnabled(false);
            label4.setForeground(Color.black);
        }if(calling[3] == 5){
            call_5 = true;
            state5.setText("Ready");
            call5.setEnabled(true);
            end5.setEnabled(false);
            label5.setForeground(Color.black);
        }if(calling[3] == 6){
            call_6 = true;
            state6.setText("Ready");
            call6.setEnabled(true);
            end6.setEnabled(false);
            label6.setForeground(Color.black);
        }
    }//GEN-LAST:event_end3ActionPerformed

    private void call4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call4ActionPerformed
        // TODO add your handling code here:
        if (max_calls<2){
        Object calls[] = {"1", "2", "3", "5", "6"};
        String s = call(calls);
        if (!s.isEmpty()){
            int callLen = callLength();
            if (callLen != 0){
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
            if("1".matches(s) && call_1){
                int[] numbers = {4, 1};
                call_4=call_1=false;
                makeACall(callLen,numbers,label4,label1,call4,call1,end4,end1,state4,state1);
            }else if("2".matches(s) && call_2){
                int[] numbers = {4, 3};
                call_4=call_2=false;
                makeACall(
                        callLen,
                        numbers,
                        label4,
                        label2,
                        call4,
                        call2,
                        end4,
                        end2,
                        state4,
                        state2
                );
            }else if("3".matches(s) && call_3){
                int[] numbers = {4, 3};
                call_4=call_3=false;
                makeACall(
                        callLen,
                        numbers,
                        label4,
                        label3,
                        call4,
                        call3,
                        end4,
                        end3,
                        state4,
                        state3
                );
            }else if("5".matches(s) && call_5){
                int[] numbers = {4, 5};
                call_4=call_5=false;
                makeACall(
                        callLen,
                        numbers,
                        label4,
                        label5,
                        call4,
                        call5,
                        end4,
                        end5,
                        state4,
                        state5
                );
            }else if("6".matches(s) && call_6){
                int[] numbers = {4, 6};
                call_4=call_6=false;
                makeACall(
                        callLen,
                        numbers,
                        label4,
                        label6,
                        call4,
                        call4,
                        end4,
                        end6,
                        state4,
                        state6
                );
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(this, "The subscriber is busy, please try again later!", "Busy", javax.swing.JOptionPane.ERROR_MESSAGE);
                busy_call++;
                busyCalls.setText(Integer.toString(busy_call));
                total_processed_call++;
                totalProcessedCalls.setText(Integer.toString(total_processed_call));
            }
        } 
        }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "You have reached the limit (maximum 2)", "LIMITED CALLS ONLY", javax.swing.JOptionPane.ERROR_MESSAGE);
            blocked_call++;
            blockedCalls.setText(Integer.toString(blocked_call));
        }
        System.out.println("MAX CALL IS: " + max_calls);
    }//GEN-LAST:event_call4ActionPerformed

    private void end4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end4ActionPerformed
        // TODO add your handling code here:
        
        call4.setEnabled(true);
        end4.setEnabled(false);
        state4.setText("Ready");
        max_calls--;
        callInUse.setText(Integer.toString(max_calls));
        call_4 = true;
        label4.setForeground(Color.black);
        removeCallFromTable("4");
        if(calling[4] == 1){
            call_1 = true;
            state1.setText("Ready");
            call1.setEnabled(true);
            end1.setEnabled(false);
            label1.setForeground(Color.black);
        }if(calling[4] == 2){
            call_2 = true;
            state2.setText("Ready");
            call2.setEnabled(true);
            end2.setEnabled(false);
            label2.setForeground(Color.black);
        }if(calling[4] == 3){
            call_3 = true;
            state3.setText("Ready");
            call3.setEnabled(true);
            end3.setEnabled(false);
            label3.setForeground(Color.black);
        }if(calling[4] == 5){
            call_5 = true;
            state5.setText("Ready");
            call5.setEnabled(true);
            end5.setEnabled(false);
            label5.setForeground(Color.black);
        }if(calling[4] == 6){
            call_6 = true;
            state6.setText("Ready");
            call6.setEnabled(true);
            end6.setEnabled(false);
            label6.setForeground(Color.black);
        }
    }//GEN-LAST:event_end4ActionPerformed

    private void call5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call5ActionPerformed
        // TODO add your handling code here:
        if (max_calls<2){
        Object calls[] = {"1", "2", "3", "4", "6"};
        String s = call(calls);
        if (!s.isEmpty()){
            int callLen = callLength();
            if (callLen != 0){
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
            if("2".matches(s) && call_2){
                int[] numbers = {5, 2};
                call_5=call_2=false;
                makeACall(callLen,numbers,label5,label2,call5,call2,end5,end2,state5,state2);
            }else if("3".matches(s) && call_3){
                int[] numbers = {5, 3};
                call_5=call_3=false;
                makeACall(
                        callLen,
                        numbers,
                        label5,
                        label3,
                        call5,
                        call3,
                        end5,
                        end3,
                        state5,
                        state3
                );
            }else if("4".matches(s) && call_4){
                int[] numbers = {5, 4};
                call_5=call_4=false;
                makeACall(
                        callLen,
                        numbers,
                        label5,
                        label4,
                        call5,
                        call4,
                        end5,
                        end4,
                        state5,
                        state4
                );
            }else if("1".matches(s) && call_1){
                int[] numbers = {5, 1};
                call_5=call_1=false;
                makeACall(
                        callLen,
                        numbers,
                        label5,
                        label1,
                        call5,
                        call1,
                        end5,
                        end1,
                        state5,
                        state1
                );
            }else if("6".matches(s) && call_6){
                int[] numbers = {5, 6};
                call_5=call_6=false;
                makeACall(
                        callLen,
                        numbers,
                        label5,
                        label6,
                        call5,
                        call6,
                        end5,
                        end6,
                        state5,
                        state6
                );
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(this, "The subscriber is busy, please try again later!", "Busy", javax.swing.JOptionPane.ERROR_MESSAGE);
                busy_call++;
                busyCalls.setText(Integer.toString(busy_call));
            }
        }
        }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "You have reached the limit (maximum 2)", "LIMITED CALLS ONLY", javax.swing.JOptionPane.ERROR_MESSAGE);
            blocked_call++;
            blockedCalls.setText(Integer.toString(blocked_call));
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
        }
        System.out.println("MAX CALL IS: " + max_calls);
    }//GEN-LAST:event_call5ActionPerformed

    private void end5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end5ActionPerformed
        // TODO add your handling code here:
        call5.setEnabled(true);
        end5.setEnabled(false);
        state5.setText("Ready");
        label5.setForeground(Color.black);
        removeCallFromTable("5");
        max_calls--;
        callInUse.setText(Integer.toString(max_calls));
        call_5 = true;
        if(calling[5] == 2){
            call_2 = true;
            state2.setText("Ready");
            call2.setEnabled(true);
            end2.setEnabled(false);
            label2.setForeground(Color.black);
        }if(calling[5] == 3){
            call_3 = true;
            state3.setText("Ready");
            call3.setEnabled(true);
            end3.setEnabled(false);
            label3.setForeground(Color.black);
        }if(calling[5] == 4){
            call_4 = true;
            state4.setText("Ready");
            call4.setEnabled(true);
            end4.setEnabled(false);
            label4.setForeground(Color.black);
        }if(calling[5] == 1){
            call_1 = true;
            state1.setText("Ready");
            call1.setEnabled(true);
            end1.setEnabled(false);
            label1.setForeground(Color.black);
        }if(calling[5] == 6){
            call_6 = true;
            state6.setText("Ready");
            call6.setEnabled(true);
            end6.setEnabled(false);
            label6.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_end5ActionPerformed

    private void call6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call6ActionPerformed
        // TODO add your handling code here:
        if (max_calls < 2){
            Object calls[] = {"1","2", "3", "4", "5"};
        String s = call(calls);
        if (!s.isEmpty()){
            int callLen = callLength();
            if (callLen != 0){
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
            if("2".matches(s) && call_2){
                int[] numbers = {6, 2};
                call_6=call_2=false;
                makeACall(callLen,numbers,label6,label2,call6,call2,end6,end2, state6,state2);
            }else if("3".matches(s) && call_3){
                int[] numbers = {6, 3};
                call_6=call_3=false;
                makeACall(
                        callLen,
                        numbers,
                        label6,
                        label3,
                        call6,
                        call3,
                        end6,
                        end3,
                        state6,
                        state3
                );
            }else if("4".matches(s) && call_4){
                int[] numbers = {6, 4};
                call_6=call_4=false;
                makeACall(
                        callLen,
                        numbers,
                        label6,
                        label4,
                        call6,
                        call4,
                        end6,
                        end4,
                        state6,
                        state4
                );
            }else if("5".matches(s) && call_5){
                int[] numbers = {6, 5};
                call_6=call_5=false;
                makeACall(
                        callLen,
                        numbers,
                        label6,
                        label5,
                        call6,
                        call5,
                        end6,
                        end5,
                        state6,
                        state5
                );
            }else if("1".matches(s) && call_1){
                int[] numbers = {6, 1};
                call_6=call_1=false;
                makeACall(
                        callLen,
                        numbers,
                        label6,
                        label1,
                        call6,
                        call1,
                        end6,
                        end1,
                        state6,
                        state1
                );
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(this, "The subscriber is busy, please try again later!", "Busy", javax.swing.JOptionPane.ERROR_MESSAGE);
                busy_call++;
                busyCalls.setText(Integer.toString(busy_call));
            }
            }
        }
        } else{
            javax.swing.JOptionPane.showMessageDialog(this, "You have reached the limit (maximum 2)", "LIMITED CALLS ONLY", javax.swing.JOptionPane.ERROR_MESSAGE);
            blocked_call++;
            blockedCalls.setText(Integer.toString(blocked_call));
            total_processed_call++;
            totalProcessedCalls.setText(Integer.toString(total_processed_call));
        }
        System.out.println("MAX CALL IS: " + max_calls);
    }//GEN-LAST:event_call6ActionPerformed

    private void end6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end6ActionPerformed
        // TODO add your handling code here:
        call6.setEnabled(true);
        end6.setEnabled(false);
        state6.setText("Ready");
        removeCallFromTable("6");
        max_calls--;
        callInUse.setText(Integer.toString(max_calls));
        call_6 = true;
        label6.setForeground(Color.black);
        if(calling[6] == 2){
            call_2 = true;
            state2.setText("Ready");
            call2.setEnabled(true);
            end2.setEnabled(false);
            label2.setForeground(Color.black);
        }if(calling[6] == 3){
            call_3 = true;
            state3.setText("Ready");
            call3.setEnabled(true);
            end3.setEnabled(false);
            label3.setForeground(Color.black);
        }if(calling[6] == 4){
            call_4 = true;
            state4.setText("Ready");
            call4.setEnabled(true);
            end4.setEnabled(false);
            label4.setForeground(Color.black);
        }if(calling[6] == 5){
            call_5 = true;
            state5.setText("Ready");
            call5.setEnabled(true);
            end5.setEnabled(false);
            label5.setForeground(Color.black);
        }if(calling[6] == 1){
            call_1 = true;
            state1.setText("Ready");
            call1.setEnabled(true);
            end1.setEnabled(false);
            label1.setForeground(Color.black);
        }
    }//GEN-LAST:event_end6ActionPerformed

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
            java.util.logging.Logger.getLogger(Telephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telephone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blockedCalls;
    private javax.swing.JLabel busyCalls;
    private javax.swing.JToggleButton call1;
    private javax.swing.JToggleButton call2;
    private javax.swing.JToggleButton call3;
    private javax.swing.JToggleButton call4;
    private javax.swing.JToggleButton call5;
    private javax.swing.JToggleButton call6;
    private javax.swing.JLabel callInUse;
    private javax.swing.JLabel completedCalls;
    private javax.swing.JLabel currentTime;
    private javax.swing.JToggleButton end1;
    private javax.swing.JToggleButton end2;
    private javax.swing.JToggleButton end3;
    private javax.swing.JToggleButton end4;
    private javax.swing.JToggleButton end5;
    private javax.swing.JToggleButton end6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JButton simulate;
    private javax.swing.JLabel state1;
    private javax.swing.JLabel state2;
    private javax.swing.JLabel state3;
    private javax.swing.JLabel state4;
    private javax.swing.JLabel state5;
    private javax.swing.JLabel state6;
    private javax.swing.JLabel totalProcessedCalls;
    // End of variables declaration//GEN-END:variables
}

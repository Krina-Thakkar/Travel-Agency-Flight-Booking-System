/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Flights;

import Business.Customers;
import Business.Flights;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Krina Thakkar
 */
public class seatSelectionPanel extends javax.swing.JPanel {

    /**
     * Creates new form seatSelectionPanel
     */
    private Flights flight;
    private JPanel leftpanel;
    private Customers customer;
    static String seat= null;
    
    static boolean statusa1 = false;
    static boolean statusa2 = false;
    static boolean statusa3 = false;
    static boolean statusa4 = false;
    static boolean statusa5 = false;
    static boolean statusa6 = false;
    
    static boolean statusb1 = false;
    static boolean statusb2 = false;
    static boolean statusb3 = false;
    static boolean statusb4 = false;
    static boolean statusb5 = false;
    static boolean statusb6 = false;
    
    static boolean statusc1 = false;
    static boolean statusc2 = false;
    static boolean statusc3 = false;
    static boolean statusc4 = false;
    static boolean statusc5 = false;
    static boolean statusc6 = false;
    
    static boolean statusd1 = false;
    static boolean statusd2 = false;
    static boolean statusd3 = false;
    static boolean statusd4 = false;
    static boolean statusd5 = false;
    static boolean statusd6 = false;
    
    static boolean statuse1 = false;
    static boolean statuse2 = false;
    static boolean statuse3 = false;
    static boolean statuse4 = false;
    static boolean statuse5 = false;
    static boolean statuse6 = false;
    
    static boolean statusf1 = false;
    static boolean statusf2 = false;
    static boolean statusf3 = false;
    static boolean statusf4 = false;
    static boolean statusf5 = false;
    static boolean statusf6 = false;
    
    static boolean statusg1 = false;
    static boolean statusg2 = false;
    static boolean statusg3 = false;
    static boolean statusg4 = false;
    static boolean statusg5 = false;
    static boolean statusg6 = false;
    
    public seatSelectionPanel(JPanel leftpanel,Customers customer,Flights flight) {
        initComponents();
        this.leftpanel = leftpanel;
        this.customer = customer;
        this.flight = flight;
        System.out.println(flight);
        
         if(statusa1 == true)
            a1.setEnabled(false);
        if(statusa2 == true)
            a2.setEnabled(false);
        if(statusa3 == true)
            a3.setEnabled(false);
        if(statusa4 == true)
            a4.setEnabled(false);
        if(statusa5 == true)
            a5.setEnabled(false);
        if(statusa6 == true)
            a6.setEnabled(false);
        
        if(statusb1 == true)
            b1.setEnabled(false);
        if(statusb2 == true)
            b2.setEnabled(false);
        if(statusb3 == true)
            b3.setEnabled(false);
        if(statusb4 == true)
            b4.setEnabled(false);
        if(statusb5 == true)
            b5.setEnabled(false);
        if(statusb6 == true)
            b6.setEnabled(false);
        
        if(statusc1 == true)
            c1.setEnabled(false);
        if(statusc2 == true)
            c2.setEnabled(false);
        if(statusc3 == true)
            c3.setEnabled(false);
        if(statusc4 == true)
            c4.setEnabled(false);
        if(statusc5 == true)
            c5.setEnabled(false);
        if(statusc6 == true)
            c6.setEnabled(false);
        
        if(statusd1 == true)
            d1.setEnabled(false);
        if(statusd2 == true)
            d2.setEnabled(false);
        if(statusd3 == true)
            d3.setEnabled(false);
        if(statusd4 == true)
            d4.setEnabled(false);
        if(statusd5 == true)
            d5.setEnabled(false);
        if(statusd6 == true)
            d6.setEnabled(false);
        
        if(statuse1 == true)
            e1.setEnabled(false);
        if(statuse2 == true)
            e2.setEnabled(false);
        if(statuse3 == true)
            e3.setEnabled(false);
        if(statuse4 == true)
            e4.setEnabled(false);
        if(statuse5 == true)
            e5.setEnabled(false);
        if(statuse6 == true)
            e6.setEnabled(false);
        
        if(statusf1 == true)
            f1.setEnabled(false);
        if(statusf2 == true)
            f2.setEnabled(false);
        if(statusf3 == true)
            f3.setEnabled(false);
        if(statusf4 == true)
            f4.setEnabled(false);
        if(statusf5 == true)
            f5.setEnabled(false);
        if(statusf6 == true)
            f6.setEnabled(false);
        
        if(statusg1 == true)
            g1.setEnabled(false);
        if(statusg2 == true)
            g2.setEnabled(false);
        if(statusg3 == true)
            g3.setEnabled(false);
        if(statusg4 == true)
            g4.setEnabled(false);
        if(statusg5 == true)
            g5.setEnabled(false);
        if(statusg6 == true)
            g6.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        e1 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        g2 = new javax.swing.JButton();
        g1 = new javax.swing.JButton();
        g3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();
        d6 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        e5 = new javax.swing.JButton();
        e6 = new javax.swing.JButton();
        f1 = new javax.swing.JButton();
        f2 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        f5 = new javax.swing.JButton();
        f6 = new javax.swing.JButton();
        g4 = new javax.swing.JButton();
        g5 = new javax.swing.JButton();
        g6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        confirmSeatBtn = new javax.swing.JButton();

        jButton13.setText("jButton1");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        a1.setText("jButton1");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setText("jButton1");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setText("jButton1");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        b1.setText("jButton1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("jButton1");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("jButton1");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        c1.setText("jButton1");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.setText("jButton1");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        c3.setText("jButton1");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        d1.setText("jButton1");
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });

        d2.setText("jButton1");
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });

        d3.setText("jButton1");
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });

        e1.setText("jButton1");
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });

        e2.setText("jButton1");
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });

        e3.setText("jButton1");
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });

        g2.setText("jButton1");
        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });

        g1.setText("jButton1");
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });

        g3.setText("jButton1");
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });

        a4.setText("jButton1");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a5.setText("jButton1");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a6.setText("jButton1");
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        b4.setText("jButton1");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setText("jButton1");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("jButton1");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        c4.setText("jButton1");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        c5.setText("jButton1");
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });

        c6.setText("jButton1");
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });

        d4.setText("jButton1");
        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });

        d5.setText("jButton1");
        d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ActionPerformed(evt);
            }
        });

        d6.setText("jButton1");
        d6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6ActionPerformed(evt);
            }
        });

        e4.setText("jButton1");
        e4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ActionPerformed(evt);
            }
        });

        e5.setText("jButton1");
        e5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e5ActionPerformed(evt);
            }
        });

        e6.setText("jButton1");
        e6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e6ActionPerformed(evt);
            }
        });

        f1.setText("jButton1");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        f2.setText("jButton1");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        f3.setText("jButton1");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        f4.setText("jButton1");
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        f5.setText("jButton1");
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        f6.setText("jButton1");
        f6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f6ActionPerformed(evt);
            }
        });

        g4.setText("jButton1");
        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });

        g5.setText("jButton1");
        g5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g5ActionPerformed(evt);
            }
        });

        g6.setText("jButton1");
        g6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g6ActionPerformed(evt);
            }
        });

        jLabel1.setText("A");

        jLabel2.setText("B");

        jLabel3.setText("C");

        jLabel4.setText("D");

        jLabel5.setText("E");

        jLabel6.setText("F");

        jLabel7.setText("G");

        jLabel8.setText("W");

        jLabel9.setText("M");

        jLabel10.setText("A");

        jLabel11.setText("W");

        jLabel12.setText("M");

        jLabel13.setText("A");

        jLabel14.setText("1");

        jLabel15.setText("2");

        jLabel16.setText("3");

        jLabel17.setText("4");

        jLabel18.setText("5");

        jLabel19.setText("6");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        confirmSeatBtn.setText("Confirm Seat");
        confirmSeatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmSeatBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(confirmSeatBtn)))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmSeatBtn)
                    .addComponent(backBtn))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        b2.setEnabled(false);
        seat = "B2";
        statusb2 = true;
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        b3.setEnabled(false);
        seat = "B3";
        statusb3 = true;
    }//GEN-LAST:event_b3ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
        c1.setEnabled(false);
        seat = "C1";
        statusc1 = true;
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
        c2.setEnabled(false);
        seat = "C2";
        statusc2 = true;
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
        c3.setEnabled(false);
        seat = "C3";
        statusc3 = true;
    }//GEN-LAST:event_c3ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        // TODO add your handling code here:
        d1.setEnabled(false);
        seat = "D1";
        statusd1 = true;
    }//GEN-LAST:event_d1ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        // TODO add your handling code here:
        d2.setEnabled(false);
        seat = "D2";
        statusd2 = true;
    }//GEN-LAST:event_d2ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        // TODO add your handling code here:
        d3.setEnabled(false);
        seat = "D3";
        statusd3 = true;
    }//GEN-LAST:event_d3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
        e1.setEnabled(false);
        seat = "E1";
        statuse1 = true;
    }//GEN-LAST:event_e1ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        // TODO add your handling code here:
        e2.setEnabled(false);
        seat = "E2";
        statuse2 = true;
    }//GEN-LAST:event_e2ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
        // TODO add your handling code here:
        e1.setEnabled(false);
        seat = "E1";
        statuse1 = true;
    }//GEN-LAST:event_e3ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        // TODO add your handling code here:
         g2.setEnabled(false);
        seat = "G2";
        statusg2 = true;
    }//GEN-LAST:event_g2ActionPerformed

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        // TODO add your handling code here:
        g1.setEnabled(false);
        seat = "G1";
        statusg1 = true;
    }//GEN-LAST:event_g1ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
        g3.setEnabled(false);
        seat = "G3";
        statusg3 = true;
    }//GEN-LAST:event_g3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        // TODO add your handling code here:
        a4.setEnabled(false);
        seat = "A4";
        statusa4 = true;
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
        a5.setEnabled(false);
        seat = "A5";
        statusa5 = true;
    }//GEN-LAST:event_a5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        // TODO add your handling code here:
        a6.setEnabled(false);
        seat = "A6";
        statusa6 = true;
    }//GEN-LAST:event_a6ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        b4.setEnabled(false);
        seat = "B4";
        statusb4 = true;
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        b5.setEnabled(false);
        seat = "B5";
        statusb5 = true;
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        b6.setEnabled(false);
        seat = "B6";
        statusb6 = true;
    }//GEN-LAST:event_b6ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
        c4.setEnabled(false);
        seat = "C4";
        statusc4 = true;
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        // TODO add your handling code here:
        c5.setEnabled(false);
        seat = "C5";
        statusc5 = true;
    }//GEN-LAST:event_c5ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        // TODO add your handling code here:
        c6.setEnabled(false);
        seat = "C6";
        statusc6 = true;
    }//GEN-LAST:event_c6ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
        // TODO add your handling code here:
        d4.setEnabled(false);
        seat = "D4";
        statusd4 = true;
    }//GEN-LAST:event_d4ActionPerformed

    private void d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ActionPerformed
        // TODO add your handling code here:
        d5.setEnabled(false);
        seat = "D5";
        statusd5 = true;
    }//GEN-LAST:event_d5ActionPerformed

    private void d6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6ActionPerformed
        // TODO add your handling code here:
        d6.setEnabled(false);
        seat = "D6";
        statusd6 = true;
    }//GEN-LAST:event_d6ActionPerformed

    private void e4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e4ActionPerformed
        // TODO add your handling code here:
        e4.setEnabled(false);
        seat = "E4";
        statuse4 = true;
    }//GEN-LAST:event_e4ActionPerformed

    private void e5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e5ActionPerformed
        // TODO add your handling code here:
        e5.setEnabled(false);
        seat = "E5";
        statuse5 = true;
    }//GEN-LAST:event_e5ActionPerformed

    private void e6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e6ActionPerformed
        // TODO add your handling code here:
        e6.setEnabled(false);
        seat = "E6";
        statuse6 = true;
    }//GEN-LAST:event_e6ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
        f1.setEnabled(false);
        seat = "F1";
        statusf1 = true;
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
        f2.setEnabled(false);
        seat = "F2";
        statusf2 = true;
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        // TODO add your handling code here:
        f3.setEnabled(false);
        seat = "F3";
        statusf3 = true;
    }//GEN-LAST:event_f3ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        // TODO add your handling code here:
        f4.setEnabled(false);
        seat = "F4";
        statusf4 = true;
    }//GEN-LAST:event_f4ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        // TODO add your handling code here:
        f5.setEnabled(false);
        seat = "F5";
        statusf5 = true;
    }//GEN-LAST:event_f5ActionPerformed

    private void f6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f6ActionPerformed
        // TODO add your handling code here:
        f6.setEnabled(false);
        seat = "F6";
        statusf6 = true;
    }//GEN-LAST:event_f6ActionPerformed

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
        // TODO add your handling code here:
        g4.setEnabled(false);
        seat = "G4";
        statusg4 = true;
    }//GEN-LAST:event_g4ActionPerformed

    private void g5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g5ActionPerformed
        // TODO add your handling code here:
         g5.setEnabled(false);
        seat = "G5";
        statusg5 = true;
    }//GEN-LAST:event_g5ActionPerformed

    private void g6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g6ActionPerformed
        // TODO add your handling code here:
         g6.setEnabled(false);
        seat = "G6";
        statusg6 = true;
    }//GEN-LAST:event_g6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        b1.setEnabled(false);
        seat = "B1";
        statusb1 = true;
    }//GEN-LAST:event_b1ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
        a1.setEnabled(false);
        seat = "A1";
        statusa1 = true;
    }//GEN-LAST:event_a1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        leftpanel.remove(this);
        CardLayout layout = (CardLayout) leftpanel.getLayout();
        layout.previous(leftpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void confirmSeatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmSeatBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Congrats! You have reserved your seat!");
        customer.setSeat(seat);
        flight.setSeat(seat);
        String s;
        String s1;
        s = customer.getSeat();
        s1 = flight.getSeat();
        System.out.println(s);
        System.out.println(s1);
        displayItineraryWithSeatPanel panel = new displayItineraryWithSeatPanel(leftpanel, customer, flight);
        leftpanel.add("displayItineraryWithSeatPanel",panel);
        CardLayout layout = (CardLayout) leftpanel.getLayout();
        layout.next(leftpanel);
    }//GEN-LAST:event_confirmSeatBtnActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
        a2.setEnabled(false);
        seat = "A2";
        statusa2 = true;
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
        a3.setEnabled(false);
        seat = "A3";
        statusa3 = true;
    }//GEN-LAST:event_a3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton confirmSeatBtn;
    private javax.swing.JButton d1;
    private javax.swing.JButton d2;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton d6;
    private javax.swing.JButton e1;
    private javax.swing.JButton e2;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JButton e5;
    private javax.swing.JButton e6;
    private javax.swing.JButton f1;
    private javax.swing.JButton f2;
    private javax.swing.JButton f3;
    private javax.swing.JButton f4;
    private javax.swing.JButton f5;
    private javax.swing.JButton f6;
    private javax.swing.JButton g1;
    private javax.swing.JButton g2;
    private javax.swing.JButton g3;
    private javax.swing.JButton g4;
    private javax.swing.JButton g5;
    private javax.swing.JButton g6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sinwamadi Boitumelo
 */
public class TicTacToe extends javax.swing.JFrame {

 private String startGame = "X";
 private int xCount = 0;
 private int oCount = 0;
 boolean checker; 
    public TicTacToe() {
        initComponents();
    }
    private void GameScore() 
    {
        scorex.setText(String.valueOf(xCount));
        scoreo.setText(String.valueOf(oCount));
    }
    private void choose_a_player() 
    {
     if  (startGame.equalsIgnoreCase("X")) 
     {
        startGame = "O"; 
     }
     else 
     {
         startGame = "X";
     }
    }
    private void winningGame()
    {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
         
         if (b1 == ("X") && b2 == ("X") && b3 == ("X"))  
        {
          JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn1.setBackground(Color.BLUE);
          btn2.setBackground(Color.BLUE);
          btn3.setBackground(Color.BLUE);
          xCount++;
          GameScore();
          
        }
        
         if (b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
          JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn4.setBackground(Color.BLUE);
          btn5.setBackground(Color.BLUE);
          btn6.setBackground(Color.BLUE);
          xCount++;
          GameScore();
          
        }
         
         if (b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
          JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn7.setBackground(Color.BLUE);
          btn8.setBackground(Color.BLUE);
          btn9.setBackground(Color.BLUE);
          xCount++;
          GameScore();
          
        }
         
          if (b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
          JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn1.setBackground(Color.BLUE);
          btn4.setBackground(Color.BLUE);
          btn7.setBackground(Color.BLUE);
          xCount++;
          GameScore();
          
        }
           if (b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
          JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn2.setBackground(Color.BLUE);
          btn5.setBackground(Color.BLUE);
          btn8.setBackground(Color.BLUE);
          xCount++;
          GameScore();
          
        }
            if (b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
          JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn3.setBackground(Color.BLUE);
          btn6.setBackground(Color.BLUE);
          btn9.setBackground(Color.BLUE);
          xCount++;
          GameScore();
          
        }
             if (b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
          JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn1.setBackground(Color.BLUE);
          btn5.setBackground(Color.BLUE);
          btn9.setBackground(Color.BLUE);
          xCount++;
          GameScore();
          
        }
              if (b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
          JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn3.setBackground(Color.BLUE);
          btn5.setBackground(Color.BLUE);
          btn7.setBackground(Color.BLUE);
          xCount++;
          GameScore();
          
        }
              if (b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn1.setBackground(Color.RED);
          btn2.setBackground(Color.RED);
          btn3.setBackground(Color.RED);
          oCount++;
          GameScore();
          
        }
         if (b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn4.setBackground(Color.RED);
          btn5.setBackground(Color.RED);
          btn6.setBackground(Color.RED);
          oCount++;
          GameScore();
          
        }
         if (b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn7.setBackground(Color.RED);
          btn8.setBackground(Color.RED);
          btn9.setBackground(Color.RED);
          oCount++;
          GameScore();
          
        }
         if (b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn1.setBackground(Color.RED);
          btn4.setBackground(Color.RED);
          btn7.setBackground(Color.RED);
          oCount++;
          GameScore();
          
        }
         if (b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn2.setBackground(Color.RED);
          btn5.setBackground(Color.RED);
          btn8.setBackground(Color.RED);
          oCount++;
          GameScore();
          
        }
         if (b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn3.setBackground(Color.RED);
          btn5.setBackground(Color.RED);
          btn9.setBackground(Color.RED);
          oCount++;
          GameScore();
          
        }
         if (b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn3.setBackground(Color.RED);
          btn5.setBackground(Color.RED);
          btn7.setBackground(Color.RED);
          oCount++;
          GameScore();
          
        }
         if (b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);  
          btn1.setBackground(Color.RED);
          btn5.setBackground(Color.RED);
          btn9.setBackground(Color.RED);
          oCount++;
          GameScore();
         }
         
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
        jPanel5 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scorex = new javax.swing.JLabel();
        JLABEL = new javax.swing.JLabel();
        scoreo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn1.setMaximumSize(new java.awt.Dimension(200, 158));
        btn1.setMinimumSize(new java.awt.Dimension(200, 258));
        btn1.setPreferredSize(new java.awt.Dimension(200, 158));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel5.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 90));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn2.setMaximumSize(new java.awt.Dimension(200, 158));
        btn2.setMinimumSize(new java.awt.Dimension(200, 258));
        btn2.setPreferredSize(new java.awt.Dimension(200, 158));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel5.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 90, 90));

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn3.setMaximumSize(new java.awt.Dimension(200, 158));
        btn3.setMinimumSize(new java.awt.Dimension(200, 258));
        btn3.setPreferredSize(new java.awt.Dimension(200, 158));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel5.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 90, 90));

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn6.setMaximumSize(new java.awt.Dimension(200, 158));
        btn6.setMinimumSize(new java.awt.Dimension(200, 258));
        btn6.setPreferredSize(new java.awt.Dimension(200, 158));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel5.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 90));

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn7.setMaximumSize(new java.awt.Dimension(200, 158));
        btn7.setMinimumSize(new java.awt.Dimension(200, 258));
        btn7.setPreferredSize(new java.awt.Dimension(200, 158));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel5.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, 90));

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn8.setMaximumSize(new java.awt.Dimension(200, 158));
        btn8.setMinimumSize(new java.awt.Dimension(200, 258));
        btn8.setPreferredSize(new java.awt.Dimension(200, 158));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel5.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, 90));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn4.setMaximumSize(new java.awt.Dimension(200, 158));
        btn4.setMinimumSize(new java.awt.Dimension(200, 258));
        btn4.setPreferredSize(new java.awt.Dimension(200, 158));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel5.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 90));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn5.setMaximumSize(new java.awt.Dimension(200, 158));
        btn5.setMinimumSize(new java.awt.Dimension(200, 258));
        btn5.setPreferredSize(new java.awt.Dimension(200, 158));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel5.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, 90));

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn9.setMaximumSize(new java.awt.Dimension(200, 158));
        btn9.setMinimumSize(new java.awt.Dimension(200, 258));
        btn9.setPreferredSize(new java.awt.Dimension(200, 158));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel5.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 90, 90));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton13.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton13.setMinimumSize(new java.awt.Dimension(200, 258));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 158));
        jPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 90, 90));

        jPanel7.setBackground(new java.awt.Color(51, 255, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reset.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        reset.setText("Replay");
        reset.setMaximumSize(new java.awt.Dimension(200, 158));
        reset.setMinimumSize(new java.awt.Dimension(200, 258));
        reset.setPreferredSize(new java.awt.Dimension(200, 158));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel7.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 90));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Exit.setText("Exit");
        Exit.setMaximumSize(new java.awt.Dimension(200, 158));
        Exit.setMinimumSize(new java.awt.Dimension(200, 258));
        Exit.setPreferredSize(new java.awt.Dimension(200, 158));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel7.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 190, 90));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jButton1.setText("Clear Score");
        jButton1.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 258));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 90));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 400, 210));

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("PLAYER  X:");
        jPanel8.add(jLabel2);

        scorex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        scorex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scorex.setText("0");
        scorex.setOpaque(true);
        scorex.setPreferredSize(new java.awt.Dimension(65, 14));
        jPanel8.add(scorex);

        JLABEL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLABEL.setText("PLAYER O:");
        jPanel8.add(JLABEL);

        scoreo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        scoreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreo.setText("0");
        scoreo.setOpaque(true);
        scoreo.setPreferredSize(new java.awt.Dimension(65, 14));
        scoreo.setRequestFocusEnabled(false);
        scoreo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                scoreoComponentMoved(evt);
            }
        });
        jPanel8.add(scoreo);

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 80, 290));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 540));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 10)); // NOI18N
        jLabel1.setText("BOITUMELO PEREZ XOXO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 490, 590));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tic Tac Toe ");
        jPanel2.add(jLabel3);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
     frame = new JFrame("Exit");
     if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Tic Tac Toe",
             JOptionPane.YES_NO_OPTION )  ==  JOptionPane.YES_NO_OPTION)
     {
         System.exit(0);
     }
    }//GEN-LAST:event_ExitActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       btn1.setText(startGame);
       btn1.setEnabled(false);
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
            btn1.setBackground(Color.ORANGE);
       }
       else
       {
           checker = true;
            btn1.setBackground(Color.GREEN);
       }
       
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btn1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
 btn1.setEnabled(true);
 btn2.setEnabled(true);
 btn3.setEnabled(true);
 btn4.setEnabled(true);
 btn5.setEnabled(true);
 btn6.setEnabled(true);
 btn7.setEnabled(true);
 btn8.setEnabled(true);
 btn9.setEnabled(true);
 
 btn1.setText("");
 btn2.setText("");
 btn3.setText("");
 btn4.setText("");
 btn5.setText("");
 btn6.setText("");
 btn7.setText("");
 btn8.setText("");
 btn9.setText("");
 
 btn1.setBackground(Color.LIGHT_GRAY);
 btn2.setBackground(Color.LIGHT_GRAY);
 btn3.setBackground(Color.LIGHT_GRAY);
 btn4.setBackground(Color.LIGHT_GRAY);
 btn5.setBackground(Color.LIGHT_GRAY);
 btn6.setBackground(Color.LIGHT_GRAY);
 btn7.setBackground(Color.LIGHT_GRAY);
 btn8.setBackground(Color.LIGHT_GRAY);
 btn9.setBackground(Color.LIGHT_GRAY);
 
 
    }//GEN-LAST:event_resetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 btn1.setEnabled(true);
 btn2.setEnabled(true);
 btn3.setEnabled(true);
 btn4.setEnabled(true);
 btn5.setEnabled(true);
 btn6.setEnabled(true);
 btn7.setEnabled(true);
 btn8.setEnabled(true);
 btn9.setEnabled(true);
 
 scoreo.setText("0");
 scorex.setText("0");
 
 btn1.setText("");
 btn2.setText("");
 btn3.setText("");
 btn4.setText("");
 btn5.setText("");
 btn6.setText("");
 btn7.setText("");
 btn8.setText("");
 btn9.setText("");
 
 btn1.setBackground(Color.LIGHT_GRAY);
 btn2.setBackground(Color.LIGHT_GRAY);
 btn3.setBackground(Color.LIGHT_GRAY);
 btn4.setBackground(Color.LIGHT_GRAY);
 btn5.setBackground(Color.LIGHT_GRAY);
 btn6.setBackground(Color.LIGHT_GRAY);
 btn7.setBackground(Color.LIGHT_GRAY);
 btn8.setBackground(Color.LIGHT_GRAY);
 btn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
      btn2.setText(startGame);
      btn2.setEnabled(false);
      
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
           btn2.setBackground(Color.ORANGE);
       }
       else
       {
           checker = true;
           btn2.setBackground(Color.GREEN);
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      btn3.setText(startGame);
      btn3.setEnabled(false);
      
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
           btn3.setBackground(Color.ORANGE);
       }
       else
       {
           checker = true;
           btn3.setBackground(Color.GREEN);
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
    btn4.setText(startGame);
    btn4.setEnabled(false);
    
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
            btn4.setBackground(Color.ORANGE);
       }
       else
       {
           checker = true;
           btn4.setBackground(Color.GREEN);
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(startGame);
        btn5.setEnabled(false);
        
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
            btn5.setBackground(Color.ORANGE);
       }
       else
       {
           checker = true;
           btn5.setBackground(Color.GREEN);
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       btn6.setText(startGame);
       btn6.setEnabled(false);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
            btn6.setBackground(Color.ORANGE);
       }
       else
       {

           checker = true;
           btn6.setBackground(Color.GREEN);
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(startGame);
        btn7.setEnabled(false);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
            btn7.setBackground(Color.ORANGE);
       }
       else
       {
           checker = true;
           btn7.setBackground(Color.GREEN);
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
     btn8.setText(startGame);
     btn8.setEnabled(false);
  
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
            btn8.setBackground(Color.ORANGE);
       }
       else
       {
           checker = true;
           btn8.setBackground(Color.GREEN);
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
    btn9.setText(startGame);
    btn9.setEnabled(false);
    
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
            btn9.setBackground(Color.ORANGE);
       }
       else
       {
           checker = true;
           btn9.setBackground(Color.GREEN);
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btn9ActionPerformed

    private void scoreoComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_scoreoComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreoComponentMoved

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel JLABEL;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton reset;
    private javax.swing.JLabel scoreo;
    private javax.swing.JLabel scorex;
    // End of variables declaration//GEN-END:variables

}

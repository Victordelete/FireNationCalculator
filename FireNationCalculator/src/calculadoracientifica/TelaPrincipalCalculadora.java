/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadoracientifica;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Victor Hugo Marques
 */
public final class TelaPrincipalCalculadora extends javax.swing.JFrame {

    String operacaoApresentada = "";
    
    public TelaPrincipalCalculadora() {
        initComponents();
        
        URL caminhoImagemLogo = this.getClass().getResource("/img/icons8_math_64px.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagemLogo); 
        setIconImage(iconeTitulo);
        
        atualizaTextoDisplayCalculadora();
    }
    
    public void atualizaTextoDisplayCalculadora(){
        jTextPane1.setText(operacaoApresentada);
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
        jButtonNum1 = new javax.swing.JButton();
        jButtonNum2 = new javax.swing.JButton();
        jButtonOpeSoma = new javax.swing.JButton();
        jButtonOpeMult = new javax.swing.JButton();
        jButtonNum3 = new javax.swing.JButton();
        jButtonOpeDiv = new javax.swing.JButton();
        jButtonOpeSub = new javax.swing.JButton();
        jButtonNum6 = new javax.swing.JButton();
        jButtonNum5 = new javax.swing.JButton();
        jButtonNum4 = new javax.swing.JButton();
        jButtonOpePot = new javax.swing.JButton();
        jButtonOpePorc = new javax.swing.JButton();
        jButtonNum9 = new javax.swing.JButton();
        jButtonNum8 = new javax.swing.JButton();
        jButtonNum7 = new javax.swing.JButton();
        jButtonOpeResult = new javax.swing.JButton();
        jButtonOpeApagar = new javax.swing.JButton();
        jButtonNum0 = new javax.swing.JButton();
        jButtonOpeVirgula = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabelResult = new javax.swing.JLabel();
        jButtonSubir = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(366, 436));
        setMinimumSize(new java.awt.Dimension(366, 436));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButtonNum1.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum1.setText("1");
        jButtonNum1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum1ActionPerformed(evt);
            }
        });

        jButtonNum2.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum2.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum2.setText("2");
        jButtonNum2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum2ActionPerformed(evt);
            }
        });

        jButtonOpeSoma.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOpeSoma.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonOpeSoma.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpeSoma.setText("+");
        jButtonOpeSoma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOpeSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpeSomaActionPerformed(evt);
            }
        });

        jButtonOpeMult.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOpeMult.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonOpeMult.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpeMult.setText("x");
        jButtonOpeMult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOpeMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpeMultActionPerformed(evt);
            }
        });

        jButtonNum3.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum3.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum3.setText("3");
        jButtonNum3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum3ActionPerformed(evt);
            }
        });

        jButtonOpeDiv.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOpeDiv.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonOpeDiv.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpeDiv.setText("/");
        jButtonOpeDiv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOpeDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpeDivActionPerformed(evt);
            }
        });

        jButtonOpeSub.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOpeSub.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonOpeSub.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpeSub.setText("-");
        jButtonOpeSub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOpeSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpeSubActionPerformed(evt);
            }
        });

        jButtonNum6.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum6.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum6.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum6.setText("6");
        jButtonNum6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum6ActionPerformed(evt);
            }
        });

        jButtonNum5.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum5.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum5.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum5.setText("5");
        jButtonNum5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum5ActionPerformed(evt);
            }
        });

        jButtonNum4.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum4.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum4.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum4.setText("4");
        jButtonNum4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum4ActionPerformed(evt);
            }
        });

        jButtonOpePot.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOpePot.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonOpePot.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpePot.setText("^");
        jButtonOpePot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOpePot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpePotActionPerformed(evt);
            }
        });

        jButtonOpePorc.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOpePorc.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonOpePorc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpePorc.setText("%");
        jButtonOpePorc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOpePorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpePorcActionPerformed(evt);
            }
        });

        jButtonNum9.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum9.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum9.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum9.setText("9");
        jButtonNum9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum9ActionPerformed(evt);
            }
        });

        jButtonNum8.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum8.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum8.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum8.setText("8");
        jButtonNum8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum8ActionPerformed(evt);
            }
        });

        jButtonNum7.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum7.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum7.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum7.setText("7");
        jButtonNum7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum7ActionPerformed(evt);
            }
        });

        jButtonOpeResult.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOpeResult.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonOpeResult.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpeResult.setText("=");
        jButtonOpeResult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOpeResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpeResultActionPerformed(evt);
            }
        });

        jButtonOpeApagar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOpeApagar.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonOpeApagar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpeApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_back_26px_1.png"))); // NOI18N
        jButtonOpeApagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOpeApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpeApagarActionPerformed(evt);
            }
        });

        jButtonNum0.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNum0.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonNum0.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNum0.setText("0");
        jButtonNum0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum0ActionPerformed(evt);
            }
        });

        jButtonOpeVirgula.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOpeVirgula.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonOpeVirgula.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpeVirgula.setText(".");
        jButtonOpeVirgula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOpeVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpeVirgulaActionPerformed(evt);
            }
        });

        jTextPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTextPane1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jScrollPane2.setViewportView(jTextPane1);

        jLabelResult.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabelResult.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButtonSubir.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSubir.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonSubir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_up_24px_1.png"))); // NOI18N
        jButtonSubir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSubir.setMaximumSize(new java.awt.Dimension(25, 33));
        jButtonSubir.setMinimumSize(new java.awt.Dimension(25, 33));
        jButtonSubir.setPreferredSize(new java.awt.Dimension(25, 33));
        jButtonSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubirActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpar.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("c");
        jButtonLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonOpeVirgula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNum5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNum2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNum6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNum9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonOpeApagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNum3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonOpeSub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonOpeDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonOpePorc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonOpePot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonOpeSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonOpeMult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonOpeResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSubir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpeSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpeMult, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpeSub, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpeDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpePorc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpePot, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonOpeApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonOpeVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonOpeResult, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOpeVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpeVirgulaActionPerformed
        //no clicar do usuário
        if(operacaoApresentada.charAt(operacaoApresentada.length()-1)!= '.'){
            operacaoApresentada = operacaoApresentada + ".";
            atualizaTextoDisplayCalculadora();
        }
    }//GEN-LAST:event_jButtonOpeVirgulaActionPerformed

    private void jButtonNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum0ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "0";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum0ActionPerformed

    private void jButtonOpeApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpeApagarActionPerformed
        //no clicar do usuário
        if(operacaoApresentada.length()>0){
            operacaoApresentada = operacaoApresentada.substring(0, operacaoApresentada.length()-1);
            atualizaTextoDisplayCalculadora();
        }
    }//GEN-LAST:event_jButtonOpeApagarActionPerformed

    private void jButtonOpeResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpeResultActionPerformed
        //Deverá calcular o resultado da operação armazenada na String gerada
        motorCalcular mtCalc = new motorCalcular();
        mtCalc.setOpera(operacaoApresentada+"f");
        jLabelResult.setText(mtCalc.opera.toString().substring(1, mtCalc.opera.toString().length()-1));
        //System.out.println(mtCalc.opera.toString()); //impressão para acompanhameno no terminal
    }//GEN-LAST:event_jButtonOpeResultActionPerformed

    private void jButtonNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum7ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "7";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum7ActionPerformed

    private void jButtonNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum8ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "8";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum8ActionPerformed

    private void jButtonNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum9ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "9";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum9ActionPerformed

    private void jButtonOpePorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpePorcActionPerformed
        //no clicar do usuário
        if(operacaoApresentada.charAt(operacaoApresentada.length()-1)!= '%'){
            operacaoApresentada = operacaoApresentada + "%";
            atualizaTextoDisplayCalculadora();
        }
    }//GEN-LAST:event_jButtonOpePorcActionPerformed

    private void jButtonOpePotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpePotActionPerformed
        //no clicar do usuário
        if(operacaoApresentada.charAt(operacaoApresentada.length()-1)!= '^'){
            operacaoApresentada = operacaoApresentada + "^";
            atualizaTextoDisplayCalculadora();
        }
    }//GEN-LAST:event_jButtonOpePotActionPerformed

    private void jButtonNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum4ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "4";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum4ActionPerformed

    private void jButtonNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum5ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "5";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum5ActionPerformed

    private void jButtonNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum6ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "6";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum6ActionPerformed

    private void jButtonOpeSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpeSubActionPerformed
        //no clicar do usuário
        if(operacaoApresentada.charAt(operacaoApresentada.length()-1)!= '-'){
            operacaoApresentada = operacaoApresentada + "-";
            atualizaTextoDisplayCalculadora();
        }
    }//GEN-LAST:event_jButtonOpeSubActionPerformed

    private void jButtonOpeDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpeDivActionPerformed
        //no clicar do usuário
        if(operacaoApresentada.charAt(operacaoApresentada.length()-1)!= '/'){
            operacaoApresentada = operacaoApresentada + "/";
            atualizaTextoDisplayCalculadora();
        }
    }//GEN-LAST:event_jButtonOpeDivActionPerformed

    private void jButtonNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum3ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "3";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum3ActionPerformed

    private void jButtonOpeMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpeMultActionPerformed
        //no clicar do usuário
        if(operacaoApresentada.charAt(operacaoApresentada.length()-1)!= 'x' ){
            operacaoApresentada = operacaoApresentada + "x";
            atualizaTextoDisplayCalculadora();
        }
    }//GEN-LAST:event_jButtonOpeMultActionPerformed

    private void jButtonOpeSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpeSomaActionPerformed
        //no clicar do usuário
        if(operacaoApresentada.charAt(operacaoApresentada.length()-1)!= '+' ){
            operacaoApresentada = operacaoApresentada + "+";
            atualizaTextoDisplayCalculadora();
        }
    }//GEN-LAST:event_jButtonOpeSomaActionPerformed

    private void jButtonNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum2ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "2";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum2ActionPerformed

    private void jButtonNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum1ActionPerformed
        //no clicar do usuário
        operacaoApresentada = operacaoApresentada + "1";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonNum1ActionPerformed

    private void jButtonSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubirActionPerformed
        operacaoApresentada = jLabelResult.getText();
        jLabelResult.setText("");
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonSubirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        operacaoApresentada = "";
        atualizaTextoDisplayCalculadora();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaPrincipalCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNum0;
    private javax.swing.JButton jButtonNum1;
    private javax.swing.JButton jButtonNum2;
    private javax.swing.JButton jButtonNum3;
    private javax.swing.JButton jButtonNum4;
    private javax.swing.JButton jButtonNum5;
    private javax.swing.JButton jButtonNum6;
    private javax.swing.JButton jButtonNum7;
    private javax.swing.JButton jButtonNum8;
    private javax.swing.JButton jButtonNum9;
    private javax.swing.JButton jButtonOpeApagar;
    private javax.swing.JButton jButtonOpeDiv;
    private javax.swing.JButton jButtonOpeMult;
    private javax.swing.JButton jButtonOpePorc;
    private javax.swing.JButton jButtonOpePot;
    private javax.swing.JButton jButtonOpeResult;
    private javax.swing.JButton jButtonOpeSoma;
    private javax.swing.JButton jButtonOpeSub;
    private javax.swing.JButton jButtonOpeVirgula;
    private javax.swing.JButton jButtonSubir;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

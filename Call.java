
package calculadora;


public class Call extends javax.swing.JFrame {

  
    public Call() {
        initComponents();
        setResizable(false);
    }
    private boolean punto=true;
    double num1,num2,result;
    String opr,contenido;
    
    public void enable()
    {
        txt.setEnabled(true);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        Btn_tan = new javax.swing.JButton();
        Btn_cos = new javax.swing.JButton();
        Btn_Borrar = new javax.swing.JButton();
        Btn_potencia = new javax.swing.JButton();
        Btn_raiz = new javax.swing.JButton();
        Btn_suma = new javax.swing.JButton();
        Btn_siete = new javax.swing.JButton();
        Btn_ocho = new javax.swing.JButton();
        Btn_Resta = new javax.swing.JButton();
        Btn_cuatro = new javax.swing.JButton();
        Btn_cinco = new javax.swing.JButton();
        Btn_multi = new javax.swing.JButton();
        Btn_uno = new javax.swing.JButton();
        Btn_dos = new javax.swing.JButton();
        Btn_Division = new javax.swing.JButton();
        Btn_punto = new javax.swing.JButton();
        Btn_cero = new javax.swing.JButton();
        Btn_igual = new javax.swing.JButton();
        Btn_porcentaje = new javax.swing.JButton();
        Btn_nueve = new javax.swing.JButton();
        Btn_seis = new javax.swing.JButton();
        Btn_tres = new javax.swing.JButton();
        Btn_sen = new javax.swing.JButton();

        jButton9.setText("jButton1");

        jButton10.setText("jButton1");

        jButton11.setText("jButton1");

        jButton12.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txt.setBackground(new java.awt.Color(153, 153, 153));
        txt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Btn_tan.setBackground(new java.awt.Color(0, 102, 153));
        Btn_tan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_tan.setForeground(new java.awt.Color(255, 255, 255));
        Btn_tan.setText("tan");
        Btn_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_tanActionPerformed(evt);
            }
        });

        Btn_cos.setBackground(new java.awt.Color(0, 102, 153));
        Btn_cos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_cos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_cos.setText("cos");
        Btn_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cosActionPerformed(evt);
            }
        });

        Btn_Borrar.setBackground(new java.awt.Color(0, 102, 153));
        Btn_Borrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Borrar.setText("Ac");
        Btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BorrarActionPerformed(evt);
            }
        });

        Btn_potencia.setBackground(new java.awt.Color(0, 102, 153));
        Btn_potencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_potencia.setForeground(new java.awt.Color(255, 255, 255));
        Btn_potencia.setText("X^y");
        Btn_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_potenciaActionPerformed(evt);
            }
        });

        Btn_raiz.setBackground(new java.awt.Color(0, 102, 153));
        Btn_raiz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_raiz.setForeground(new java.awt.Color(255, 255, 255));
        Btn_raiz.setText("√");
        Btn_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_raizActionPerformed(evt);
            }
        });

        Btn_suma.setBackground(new java.awt.Color(0, 102, 153));
        Btn_suma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_suma.setForeground(new java.awt.Color(255, 255, 255));
        Btn_suma.setText("+");
        Btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sumaActionPerformed(evt);
            }
        });

        Btn_siete.setBackground(new java.awt.Color(0, 0, 0));
        Btn_siete.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_siete.setForeground(new java.awt.Color(255, 255, 255));
        Btn_siete.setText("7");
        Btn_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sieteActionPerformed(evt);
            }
        });

        Btn_ocho.setBackground(new java.awt.Color(0, 0, 0));
        Btn_ocho.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_ocho.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ocho.setText("8");
        Btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ochoActionPerformed(evt);
            }
        });

        Btn_Resta.setBackground(new java.awt.Color(0, 102, 153));
        Btn_Resta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Resta.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Resta.setText("-");
        Btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RestaActionPerformed(evt);
            }
        });

        Btn_cuatro.setBackground(new java.awt.Color(0, 0, 0));
        Btn_cuatro.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_cuatro.setForeground(new java.awt.Color(255, 255, 255));
        Btn_cuatro.setText("4");
        Btn_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cuatroActionPerformed(evt);
            }
        });

        Btn_cinco.setBackground(new java.awt.Color(0, 0, 0));
        Btn_cinco.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_cinco.setForeground(new java.awt.Color(255, 255, 255));
        Btn_cinco.setText("5");
        Btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cincoActionPerformed(evt);
            }
        });

        Btn_multi.setBackground(new java.awt.Color(0, 102, 153));
        Btn_multi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_multi.setForeground(new java.awt.Color(255, 255, 255));
        Btn_multi.setText("*");
        Btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_multiActionPerformed(evt);
            }
        });

        Btn_uno.setBackground(new java.awt.Color(0, 0, 0));
        Btn_uno.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_uno.setForeground(new java.awt.Color(255, 255, 255));
        Btn_uno.setText("1");
        Btn_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_unoActionPerformed(evt);
            }
        });

        Btn_dos.setBackground(new java.awt.Color(0, 0, 0));
        Btn_dos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_dos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_dos.setText("2");
        Btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_dosActionPerformed(evt);
            }
        });

        Btn_Division.setBackground(new java.awt.Color(0, 102, 153));
        Btn_Division.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Division.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Division.setText("/");
        Btn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DivisionActionPerformed(evt);
            }
        });

        Btn_punto.setBackground(new java.awt.Color(0, 102, 153));
        Btn_punto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_punto.setForeground(new java.awt.Color(255, 255, 255));
        Btn_punto.setText(".");
        Btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_puntoActionPerformed(evt);
            }
        });

        Btn_cero.setBackground(new java.awt.Color(0, 0, 0));
        Btn_cero.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_cero.setForeground(new java.awt.Color(255, 255, 255));
        Btn_cero.setText("0");
        Btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ceroActionPerformed(evt);
            }
        });

        Btn_igual.setBackground(new java.awt.Color(0, 102, 153));
        Btn_igual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        Btn_igual.setText("=");
        Btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_igualActionPerformed(evt);
            }
        });

        Btn_porcentaje.setBackground(new java.awt.Color(0, 102, 153));
        Btn_porcentaje.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        Btn_porcentaje.setText("%");
        Btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_porcentajeActionPerformed(evt);
            }
        });

        Btn_nueve.setBackground(new java.awt.Color(0, 0, 0));
        Btn_nueve.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_nueve.setForeground(new java.awt.Color(255, 255, 255));
        Btn_nueve.setText("9");
        Btn_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_nueveActionPerformed(evt);
            }
        });

        Btn_seis.setBackground(new java.awt.Color(0, 0, 0));
        Btn_seis.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_seis.setForeground(new java.awt.Color(255, 255, 255));
        Btn_seis.setText("6");
        Btn_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_seisActionPerformed(evt);
            }
        });

        Btn_tres.setBackground(new java.awt.Color(0, 0, 0));
        Btn_tres.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_tres.setForeground(new java.awt.Color(255, 255, 255));
        Btn_tres.setText("3");
        Btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_tresActionPerformed(evt);
            }
        });

        Btn_sen.setBackground(new java.awt.Color(0, 102, 153));
        Btn_sen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Btn_sen.setForeground(new java.awt.Color(255, 255, 255));
        Btn_sen.setText("sin");
        Btn_sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_senActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Btn_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn_uno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_sen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Division, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txt))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_sen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Division, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ceroActionPerformed
        txt.setText(txt.getText() + "0");
    }//GEN-LAST:event_Btn_ceroActionPerformed

    private void Btn_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_unoActionPerformed
        txt.setText(txt.getText() + "1");
    }//GEN-LAST:event_Btn_unoActionPerformed

    private void Btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_dosActionPerformed
        txt.setText(txt.getText() + "2");
    }//GEN-LAST:event_Btn_dosActionPerformed

    private void Btn_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_tresActionPerformed
        txt.setText(txt.getText() + "3");
    }//GEN-LAST:event_Btn_tresActionPerformed

    private void Btn_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cuatroActionPerformed
        txt.setText(txt.getText() + "4");
    }//GEN-LAST:event_Btn_cuatroActionPerformed

    private void Btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cincoActionPerformed
        txt.setText(txt.getText() + "5");
    }//GEN-LAST:event_Btn_cincoActionPerformed

    private void Btn_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_seisActionPerformed
        txt.setText(txt.getText() + "6");
    }//GEN-LAST:event_Btn_seisActionPerformed

    private void Btn_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sieteActionPerformed
        txt.setText(txt.getText() + "7");
    }//GEN-LAST:event_Btn_sieteActionPerformed

    private void Btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ochoActionPerformed
        txt.setText(txt.getText() + "8");
    }//GEN-LAST:event_Btn_ochoActionPerformed

    private void Btn_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_nueveActionPerformed
        txt.setText(txt.getText() + "9");
    }//GEN-LAST:event_Btn_nueveActionPerformed

    private void Btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_puntoActionPerformed
        contenido=txt.getText();
        if(contenido.length()<=0){
            txt.setText("0.");
        }else
            if(txt.getText().contains(".")){
            }else{
                
                txt.setText(txt.getText()+".");
                punto=false;
            }
        
    }//GEN-LAST:event_Btn_puntoActionPerformed
    
    private void Btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BorrarActionPerformed
       txt.setText("");
    }//GEN-LAST:event_Btn_BorrarActionPerformed

    private void Btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sumaActionPerformed
        num1 = Double.parseDouble(txt.getText());
        
        txt.setText("");
        
        opr = "+";
    }//GEN-LAST:event_Btn_sumaActionPerformed

    private void Btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RestaActionPerformed
        num1 = Double.parseDouble(txt.getText());
        
        txt.setText("");
        
        opr = "-";
    }//GEN-LAST:event_Btn_RestaActionPerformed

    private void Btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_multiActionPerformed
        num1 = Double.parseDouble(txt.getText());
        
        txt.setText("");
        
        opr = "*";
    }//GEN-LAST:event_Btn_multiActionPerformed

    private void Btn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DivisionActionPerformed
       num1 = Double.parseDouble(txt.getText());
        
        txt.setText("");
        
        opr = "/";
    }//GEN-LAST:event_Btn_DivisionActionPerformed

    
    private void Btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_igualActionPerformed
       num2 = Double.parseDouble(txt.getText());
       
       if(opr == "+"){
           result = num1 + num2;
           txt.setText(Double.toString(result));
       }
       else if(opr == "-"){
           result = num1 - num2;
           txt.setText(Double.toString(result));
       }
       else if(opr == "*"){
           result = num1 * num2;
           txt.setText(Double.toString(result));
       }
       else if(opr == "/"){
           result = num1/num2;
           txt.setText(Double.toString(result));
       }
        else if(opr == "%"){
           result = num1/100;
           txt.setText(Double.toString(result));
       }
       else if(opr == "x^y"){
           result= Math.pow(num1, num2);
           txt.setText(Double.toString(result));
       }     
    }//GEN-LAST:event_Btn_igualActionPerformed

    private void Btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_porcentajeActionPerformed
        num1 = Double.parseDouble(txt.getText());
        
        txt.setText("");
        
        opr = "%";
    }//GEN-LAST:event_Btn_porcentajeActionPerformed

    private void Btn_senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_senActionPerformed
        double t=Math.sin(Double.parseDouble(txt.getText()));
        
        txt.setText("");
        txt.setText(txt.getText()+ t);
    }//GEN-LAST:event_Btn_senActionPerformed

    private void Btn_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cosActionPerformed
        double t=Math.cos(Double.parseDouble(txt.getText()));
        
        txt.setText("");
        txt.setText(txt.getText()+ t);
    }//GEN-LAST:event_Btn_cosActionPerformed

    private void Btn_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_tanActionPerformed
        double t=Math.tan(Double.parseDouble(txt.getText()));
        
        txt.setText("");
        txt.setText(txt.getText()+ t);
    }//GEN-LAST:event_Btn_tanActionPerformed

    private void Btn_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_raizActionPerformed
        double t=Math.sqrt(Double.parseDouble(txt.getText()));
        
        txt.setText("");
        txt.setText(txt.getText()+ t);
    }//GEN-LAST:event_Btn_raizActionPerformed

    private void Btn_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_potenciaActionPerformed
       num1 = Double.parseDouble(txt.getText());
       
        
        txt.setText("");
        opr = "x^y";
    }//GEN-LAST:event_Btn_potenciaActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Call().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Borrar;
    private javax.swing.JButton Btn_Division;
    private javax.swing.JButton Btn_Resta;
    private javax.swing.JButton Btn_cero;
    private javax.swing.JButton Btn_cinco;
    private javax.swing.JButton Btn_cos;
    private javax.swing.JButton Btn_cuatro;
    private javax.swing.JButton Btn_dos;
    private javax.swing.JButton Btn_igual;
    private javax.swing.JButton Btn_multi;
    private javax.swing.JButton Btn_nueve;
    private javax.swing.JButton Btn_ocho;
    private javax.swing.JButton Btn_porcentaje;
    private javax.swing.JButton Btn_potencia;
    private javax.swing.JButton Btn_punto;
    private javax.swing.JButton Btn_raiz;
    private javax.swing.JButton Btn_seis;
    private javax.swing.JButton Btn_sen;
    private javax.swing.JButton Btn_siete;
    private javax.swing.JButton Btn_suma;
    private javax.swing.JButton Btn_tan;
    private javax.swing.JButton Btn_tres;
    private javax.swing.JButton Btn_uno;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}

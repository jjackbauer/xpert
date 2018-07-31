/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import model.projeto.Projeto;
import xPertCore.EtapaCore;
import xPertCore.ProjetoCore;

/**
 *
 * @author UNIVASF
 */
public class FormInfoProjeto extends javax.swing.JFrame {

    /**
     * Creates new form PaginaDeProjeto
     */
    private Projeto projeto;
    private ArrayList<EtapaCore> etapas;
    private ProjetoCore projetoCore;
    
    public FormInfoProjeto(Projeto p) {
        projeto = p;
        projetoCore = projeto.convert();
        projetoCore.simular();
        projeto = projetoCore.convert();
        etapas = projetoCore.getEtapasDisponiveis();
        initComponents();
        configJanela();
    }
    
    private void configJanela() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Projeto: "+projeto.getNome());
        jLabelNomeDoProjeto.setText(projeto.getNome());
        //this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setMaximumSize(new Dimension(1000, 700));
        this.setMinimumSize(new Dimension(1000, 700));
        this.setVisible(true);
        refresh();
    }
    
    private void refresh(){
        jLabelEtapasAFazer.setText("Etapas a fazer: " + projetoCore.getEtapasAFazer());
        jLabelEtapasAtrasadas.setText("Etapas atrasadas: " + projetoCore.getEtapasAtrasadas());
        jLabelEtapasCriticas.setText("Etapas criticas: " + projetoCore.getEtapasCriticas());
        jLabelEtapasRealizadas.setText("Etapas Realizadas: " + projetoCore.getEtapasConcluidas().size());
        
        int prof[] = projetoCore.getProfundidades();
        jLabelMenorProfundidadeAtual.setText("Menor profundidade atual: "+prof[0]);
        jLabelMaiorProfundidadeAtual.setText("Maior Profundidade Atual: " + prof[1]);
        jLabelProfundidadeTotal.setText("Profundidade Total: " + prof[2]);
        
        jLabelETA.setText("");
        
    }

     private void fillTabela(){
        String [][] data = new String[etapas.size()][4];
        int i =0;
        for (EtapaCore e : etapas){
            String[] row = {
                Integer.toString(e.getIdentificacao()),
                e.getNome(), 
                Integer.toString(e.getTempoDeDuracaoPrevista()),
                Integer.toString(e.getMaiorTempoDeFolga()),
            };
            data[i++] = row;
        }
        String titulos[] = {"id","nome","ETA","folga"};
        jTable1 = new JTable(data,titulos);
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMaiorProfundidade = new javax.swing.JLabel();
        jLabelMenorProfundidade = new javax.swing.JLabel();
        jLabelValorProfundidadeTotal = new javax.swing.JLabel();
        jLabelValorEtapasRealizadas = new javax.swing.JLabel();
        jLabelNumeroDeEtapasAFazer = new javax.swing.JLabel();
        NumeroDeEtapasCriticas = new javax.swing.JLabel();
        barraDeProgresso = new javax.swing.JProgressBar();
        jLabelNomeDoProjeto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelNumeroDeEtapasAtrasadas = new javax.swing.JLabel();
        jLabelValorDataInicio = new javax.swing.JLabel();
        jLabelNumeroDeDiasRestantes = new javax.swing.JLabel();
        jLabelDataETA = new javax.swing.JLabel();
        painelEtapas = new javax.swing.JPanel();
        jLabelEtapasRealizadas = new javax.swing.JLabel();
        jLabelEtapasAtrasadas = new javax.swing.JLabel();
        jLabelEtapasCriticas = new javax.swing.JLabel();
        jLabelEtapasAFazer = new javax.swing.JLabel();
        painelTempo = new javax.swing.JPanel();
        jLabelDiasRestantes = new javax.swing.JLabel();
        jLabelETA = new javax.swing.JLabel();
        jLabelDataInicio = new javax.swing.JLabel();
        painelProfundidade = new javax.swing.JPanel();
        jLabelMenorProfundidadeAtual = new javax.swing.JLabel();
        jLabelMaiorProfundidadeAtual = new javax.swing.JLabel();
        jLabelProfundidadeTotal = new javax.swing.JLabel();
        painelAcoes = new javax.swing.JPanel();
        btnMarcar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1000, 700));

        jLabelNomeDoProjeto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelNomeDoProjeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeDoProjeto.setText("Nome do Projeto");
        jLabelNomeDoProjeto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelNomeDoProjeto.setMaximumSize(new java.awt.Dimension(600, 50));
        jLabelNomeDoProjeto.setMinimumSize(new java.awt.Dimension(0, 50));
        jLabelNomeDoProjeto.setPreferredSize(new java.awt.Dimension(250, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Etapa", "ETA", "Concluído em"
            }
        ));
        fillTabela();
        jScrollPane1.setViewportView(jTable1);

        jLabelEtapasRealizadas.setText("Etapas Realizadas:");
        jLabelEtapasRealizadas.setMaximumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasRealizadas.setMinimumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasRealizadas.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabelEtapasAtrasadas.setText("Etapas Atrasadas:");
        jLabelEtapasAtrasadas.setMaximumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasAtrasadas.setMinimumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasAtrasadas.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabelEtapasCriticas.setText("Etapas Críticas:");
        jLabelEtapasCriticas.setMaximumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasCriticas.setMinimumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasCriticas.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabelEtapasAFazer.setText("Etapas a fazer: ");
        jLabelEtapasAFazer.setMaximumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasAFazer.setMinimumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasAFazer.setPreferredSize(new java.awt.Dimension(100, 15));

        javax.swing.GroupLayout painelEtapasLayout = new javax.swing.GroupLayout(painelEtapas);
        painelEtapas.setLayout(painelEtapasLayout);
        painelEtapasLayout.setHorizontalGroup(
            painelEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEtapasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelEtapasCriticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEtapasRealizadas, javax.swing.GroupLayout.DEFAULT_SIZE, 131, 1000)
                        .addComponent(jLabelEtapasAFazer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 1000))
                    .addComponent(jLabelEtapasAtrasadas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 1000))
        );
        painelEtapasLayout.setVerticalGroup(
            painelEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEtapasLayout.createSequentialGroup()
                .addComponent(jLabelEtapasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEtapasAFazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEtapasAtrasadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEtapasCriticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jLabelDiasRestantes.setText("Dias Restantes:");

        jLabelETA.setText("ETA:");

        jLabelDataInicio.setText("Data de Início:");

        javax.swing.GroupLayout painelTempoLayout = new javax.swing.GroupLayout(painelTempo);
        painelTempo.setLayout(painelTempoLayout);
        painelTempoLayout.setHorizontalGroup(
            painelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTempoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelETA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDiasRestantes)
                    .addComponent(jLabelDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );
        painelTempoLayout.setVerticalGroup(
            painelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTempoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelETA)
                .addGap(0, 0, 0)
                .addComponent(jLabelDataInicio)
                .addGap(0, 0, 0)
                .addComponent(jLabelDiasRestantes)
                .addContainerGap())
        );

        jLabelMenorProfundidadeAtual.setText("Menor Profundidade Atual:");

        jLabelMaiorProfundidadeAtual.setText("Maior Profundidade Atual:");

        jLabelProfundidadeTotal.setText("Profundidade Total:");

        javax.swing.GroupLayout painelProfundidadeLayout = new javax.swing.GroupLayout(painelProfundidade);
        painelProfundidade.setLayout(painelProfundidadeLayout);
        painelProfundidadeLayout.setHorizontalGroup(
            painelProfundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProfundidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProfundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMaiorProfundidadeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProfundidadeTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMenorProfundidadeAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );
        painelProfundidadeLayout.setVerticalGroup(
            painelProfundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProfundidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMenorProfundidadeAtual)
                .addGap(0, 0, 0)
                .addComponent(jLabelMaiorProfundidadeAtual)
                .addGap(0, 0, 0)
                .addComponent(jLabelProfundidadeTotal)
                .addGap(12, 12, 12))
        );

        painelAcoes.setLayout(new java.awt.GridLayout(1, 0));

        btnMarcar.setText("Marcar Etapa");
        btnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarActionPerformed(evt);
            }
        });
        painelAcoes.add(btnMarcar);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        painelAcoes.add(btnEditar);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelAcoes.add(btnSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(832, 832, 832)
                .addComponent(jLabelValorProfundidadeTotal)
                .addGap(887, 887, 887)
                .addComponent(jLabelNumeroDeDiasRestantes))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMaiorProfundidade)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMenorProfundidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addComponent(painelEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumeroDeEtapasAtrasadas)
                    .addComponent(jLabelValorEtapasRealizadas))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValorDataInicio)
                    .addComponent(jLabelNumeroDeEtapasAFazer))
                .addGap(0, 0, 0)
                .addComponent(jLabelDataETA)
                .addGap(0, 0, 0)
                .addComponent(NumeroDeEtapasCriticas))
            .addComponent(jLabelNomeDoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(painelAcoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 936, 1000)
                        .addComponent(barraDeProgresso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 1000))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelNomeDoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(painelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelMaiorProfundidade)
                                    .addComponent(jLabelValorEtapasRealizadas)
                                    .addComponent(jLabelNumeroDeEtapasAFazer)
                                    .addComponent(NumeroDeEtapasCriticas)))
                            .addComponent(painelProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelMenorProfundidade)
                                .addComponent(jLabelNumeroDeEtapasAtrasadas)
                                .addComponent(jLabelValorDataInicio)
                                .addComponent(jLabelDataETA))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, 1000)
                .addGap(18, 18, 18)
                .addComponent(barraDeProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, 1000)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorProfundidadeTotal)
                    .addComponent(jLabelNumeroDeDiasRestantes))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarActionPerformed
        // TODO add your handling code here:
        //concluirEtapaVinculada
    }//GEN-LAST:event_btnMarcarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        JFrame form = new FormInserirProjeto();
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FormInfoProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInfoProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInfoProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInfoProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInfoProjeto(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumeroDeEtapasCriticas;
    private javax.swing.JProgressBar barraDeProgresso;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnMarcar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabelDataETA;
    private javax.swing.JLabel jLabelDataInicio;
    private javax.swing.JLabel jLabelDiasRestantes;
    private javax.swing.JLabel jLabelETA;
    private javax.swing.JLabel jLabelEtapasAFazer;
    private javax.swing.JLabel jLabelEtapasAtrasadas;
    private javax.swing.JLabel jLabelEtapasCriticas;
    private javax.swing.JLabel jLabelEtapasRealizadas;
    private javax.swing.JLabel jLabelMaiorProfundidade;
    private javax.swing.JLabel jLabelMaiorProfundidadeAtual;
    private javax.swing.JLabel jLabelMenorProfundidade;
    private javax.swing.JLabel jLabelMenorProfundidadeAtual;
    private javax.swing.JLabel jLabelNomeDoProjeto;
    private javax.swing.JLabel jLabelNumeroDeDiasRestantes;
    private javax.swing.JLabel jLabelNumeroDeEtapasAFazer;
    private javax.swing.JLabel jLabelNumeroDeEtapasAtrasadas;
    private javax.swing.JLabel jLabelProfundidadeTotal;
    private javax.swing.JLabel jLabelValorDataInicio;
    private javax.swing.JLabel jLabelValorEtapasRealizadas;
    private javax.swing.JLabel jLabelValorProfundidadeTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelAcoes;
    private javax.swing.JPanel painelEtapas;
    private javax.swing.JPanel painelProfundidade;
    private javax.swing.JPanel painelTempo;
    // End of variables declaration//GEN-END:variables
}

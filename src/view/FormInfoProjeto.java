/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.projeto.Projeto;

/**
 *
 * @author UNIVASF
 */
public class FormInfoProjeto extends javax.swing.JFrame {

    /**
     * Creates new form PaginaDeProjeto
     */
    public FormInfoProjeto(Projeto p) {
        initComponents();
        configJanela();
    }
    
    private void configJanela() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Projetos");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelProjeto = new javax.swing.JLabel();
        jLabelMaiorProfundidadeAtual = new javax.swing.JLabel();
        jLabelMaiorProfundidade = new javax.swing.JLabel();
        jLabelMenorProfundidadeAtual = new javax.swing.JLabel();
        jLabelMenorProfundidade = new javax.swing.JLabel();
        jLabelProfundidadeTotal = new javax.swing.JLabel();
        jLabelValorProfundidadeTotal = new javax.swing.JLabel();
        jLabelEtapasRealizadas = new javax.swing.JLabel();
        jLabelValorEtapasRealizadas = new javax.swing.JLabel();
        jLabelEtapasAFazer = new javax.swing.JLabel();
        jLabelNumeroDeEtapasAFazer = new javax.swing.JLabel();
        jLabelEtapasCriticas = new javax.swing.JLabel();
        NumeroDeEtapasCriticas = new javax.swing.JLabel();
        barraDeProgresso = new javax.swing.JProgressBar();
        jLabelNomeDoProjeto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelEtapasAtrasadas = new javax.swing.JLabel();
        jLabelNumeroDeEtapasAtrasadas = new javax.swing.JLabel();
        jLabelDataInicio = new javax.swing.JLabel();
        jLabelValorDataInicio = new javax.swing.JLabel();
        jLabelDiasRestantes = new javax.swing.JLabel();
        jLabelNumeroDeDiasRestantes = new javax.swing.JLabel();
        jLabelDias = new javax.swing.JLabel();
        jLabelETA = new javax.swing.JLabel();
        jLabelDataETA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelProjeto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelProjeto.setText("Projeto:");

        jLabelMaiorProfundidadeAtual.setText("Maior Profundidade Atual:");

        jLabelMenorProfundidadeAtual.setText("Menor Profundidade Atual:");

        jLabelProfundidadeTotal.setText("Profundidade Total:");

        jLabelEtapasRealizadas.setText("Etapas Realizadas:");

        jLabelEtapasAFazer.setText("Etapas a fazer: ");

        jLabelEtapasCriticas.setText("Etapas Críticas:");

        jLabelNomeDoProjeto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelNomeDoProjeto.setText("NomeDoProjeto");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "", "", "", ""},
                {"2", "", "", "", ""},
                {"3", "", "", "", ""},
                {"4", "", "", "", ""},
                {"5", "", "", "", ""}
            },
            new String [] {
                "Nº", "Etapa", "Duração (dias)", "ETA", "Concluído em"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Nº");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Etapa");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Duração (dias)");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("ETA");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Concluído em");
        }

        jLabelEtapasAtrasadas.setText("Etapas Atrasadas:");

        jLabelDataInicio.setText("Data de Início:");

        jLabelDiasRestantes.setText("Dias Restantes:");

        jLabelDias.setText("dias");

        jLabelETA.setText("ETA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelProfundidadeTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelValorProfundidadeTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelProjeto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelMaiorProfundidadeAtual, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMenorProfundidadeAtual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeDoProjeto)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelMaiorProfundidade)
                                            .addComponent(jLabelMenorProfundidade))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelDiasRestantes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelNumeroDeDiasRestantes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelDias))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelEtapasRealizadas)
                                                    .addComponent(jLabelEtapasAtrasadas))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelValorEtapasRealizadas)
                                                    .addComponent(jLabelNumeroDeEtapasAtrasadas))
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelEtapasAFazer)
                                                    .addComponent(jLabelDataInicio))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelValorDataInicio)
                                                    .addComponent(jLabelNumeroDeEtapasAFazer))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabelEtapasCriticas)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(NumeroDeEtapasCriticas))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabelETA)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabelDataETA)))))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 328, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(barraDeProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProjeto)
                    .addComponent(jLabelNomeDoProjeto))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMaiorProfundidadeAtual)
                    .addComponent(jLabelMaiorProfundidade)
                    .addComponent(jLabelEtapasRealizadas)
                    .addComponent(jLabelValorEtapasRealizadas)
                    .addComponent(jLabelEtapasAFazer)
                    .addComponent(jLabelNumeroDeEtapasAFazer)
                    .addComponent(jLabelEtapasCriticas)
                    .addComponent(NumeroDeEtapasCriticas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMenorProfundidadeAtual)
                    .addComponent(jLabelMenorProfundidade)
                    .addComponent(jLabelEtapasAtrasadas)
                    .addComponent(jLabelNumeroDeEtapasAtrasadas)
                    .addComponent(jLabelDataInicio)
                    .addComponent(jLabelValorDataInicio)
                    .addComponent(jLabelETA)
                    .addComponent(jLabelDataETA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProfundidadeTotal)
                    .addComponent(jLabelValorProfundidadeTotal)
                    .addComponent(jLabelDiasRestantes)
                    .addComponent(jLabelNumeroDeDiasRestantes)
                    .addComponent(jLabelDias))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(barraDeProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabelDataETA;
    private javax.swing.JLabel jLabelDataInicio;
    private javax.swing.JLabel jLabelDias;
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
    private javax.swing.JLabel jLabelProjeto;
    private javax.swing.JLabel jLabelValorDataInicio;
    private javax.swing.JLabel jLabelValorEtapasRealizadas;
    private javax.swing.JLabel jLabelValorProfundidadeTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.etapa.Etapa;
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
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private Date dateInicio = new Date();
    private Date dateETA = new Date();
    private Calendar cal = Calendar.getInstance(); 
    
    public FormInfoProjeto(Projeto p) {
        projeto = p;
        projetoCore = projeto.convert();
        projetoCore.simular();
        projeto = projetoCore.convert();
        projeto.update();
        etapas = projetoCore.getEtapasDisponiveis();
        cal.setTime(dateInicio);
        cal.add(Calendar.DATE,projetoCore.getETA());
        dateETA = cal.getTime();
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
        Toolkit tk = Toolkit.getDefaultToolkit();
            int xsize = (int) tk.getScreenSize().getWidth();
            int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        refresh();
    }
    
    private void refresh(){
        etapas = projetoCore.getEtapasDisponiveis();
        jLabelEtapasAFazer.setText("Etapas a fazer: " + projetoCore.getEtapasAFazer());
        jLabelEtapasAtrasadas.setText("Etapas atrasadas: " + projetoCore.getEtapasAtrasadas());
        jLabelEtapasCriticas.setText("Etapas criticas: " + projetoCore.getEtapasCriticas());
        jLabelEtapasRealizadas.setText("Etapas Realizadas: " + projetoCore.getEtapasConcluidas().size());
        int prof[] = projetoCore.getProfundidades();
        jLabelMenorProfundidadeAtual.setText("Menor profundidade atual: "+prof[0]);
        jLabelMaiorProfundidadeAtual.setText("Maior Profundidade Atual: " + prof[1]);
        jLabelProfundidadeTotal.setText("Profundidade Total: " + prof[2]);
        cal.setTime(dateInicio);
        cal.add(Calendar.DATE,projetoCore.getETA()+projetoCore.getAtraso());
        dateETA = cal.getTime();
        jLabelETA.setText("ETA: "+formatter.format(dateETA));
        jLabelAtraso.setText("Atraso: "+projetoCore.getAtraso()+" dias");
        jLabelDataInicio.setText("Data de início: "+formatter.format(dateInicio));
        jLabelDiasRestantes.setText("Dias restantes: "+projetoCore.getDiasRestantes());
        barraDeProgresso.setValue(projetoCore.getSituacao());
        barraDeProgresso.setStringPainted(true);
        barraDeProgresso.setString(projetoCore.getSituacao()+"%");
    }

     private void fillTabela(){
        Date datainicioEtapa = new Date();
        String [][] data = new String[etapas.size()][5];
        int i =0;
        for (EtapaCore e : etapas){
            cal.setTime(dateInicio);
            cal.add(Calendar.DATE,e.getTempoRealDeInicioEtapa());
            datainicioEtapa = cal.getTime();
            String[] row = {
                Integer.toString(e.getIdentificacao()),
                e.getNome(), 
                Integer.toString(e.getTempoDeDuracaoPrevista())+" dias",
                (Integer.toString(e.getMaiorTempoDeFolga())+" dias"),
                formatter.format(datainicioEtapa),
            };
            data[i++] = row;
        }
        String titulos[] = {"id","nome","ETA","folga","Data de inicio"};
        jTable1 = new JTable(data,titulos); 
      
        jScrollPane1.setViewportView(jTable1);
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
        jLabelAtraso = new javax.swing.JLabel();
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
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/Bundle"); // NOI18N
        jLabelNomeDoProjeto.setText(bundle.getString("FormInfoProjeto.jLabelNomeDoProjeto.text")); // NOI18N
        jLabelNomeDoProjeto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelNomeDoProjeto.setMaximumSize(new java.awt.Dimension(600, 50));
        jLabelNomeDoProjeto.setMinimumSize(new java.awt.Dimension(0, 50));
        jLabelNomeDoProjeto.setPreferredSize(new java.awt.Dimension(250, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id","nome","ETA","folga","data de inicio"
            }
        ));
        fillTabela();
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable1);

        jLabelEtapasRealizadas.setText(bundle.getString("FormInfoProjeto.jLabelEtapasRealizadas.text")); // NOI18N
        jLabelEtapasRealizadas.setMaximumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasRealizadas.setMinimumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasRealizadas.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabelEtapasAtrasadas.setText(bundle.getString("FormInfoProjeto.jLabelEtapasAtrasadas.text")); // NOI18N
        jLabelEtapasAtrasadas.setMaximumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasAtrasadas.setMinimumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasAtrasadas.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabelEtapasCriticas.setText(bundle.getString("FormInfoProjeto.jLabelEtapasCriticas.text")); // NOI18N
        jLabelEtapasCriticas.setMaximumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasCriticas.setMinimumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasCriticas.setPreferredSize(new java.awt.Dimension(100, 15));

        jLabelEtapasAFazer.setText(bundle.getString("FormInfoProjeto.jLabelEtapasAFazer.text")); // NOI18N
        jLabelEtapasAFazer.setMaximumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasAFazer.setMinimumSize(new java.awt.Dimension(100, 15));
        jLabelEtapasAFazer.setPreferredSize(new java.awt.Dimension(100, 15));

        javax.swing.GroupLayout painelEtapasLayout = new javax.swing.GroupLayout(painelEtapas);
        painelEtapas.setLayout(painelEtapasLayout);
        painelEtapasLayout.setHorizontalGroup(
            painelEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEtapasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEtapasCriticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEtapasRealizadas, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jLabelEtapasAFazer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEtapasAtrasadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(jLabelEtapasCriticas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jLabelDiasRestantes.setText(bundle.getString("FormInfoProjeto.jLabelDiasRestantes.text")); // NOI18N

        jLabelETA.setText(bundle.getString("FormInfoProjeto.jLabelETA.text")); // NOI18N

        jLabelDataInicio.setText(bundle.getString("FormInfoProjeto.jLabelDataInicio.text")); // NOI18N

        jLabelAtraso.setText(bundle.getString("FormInfoProjeto.jLabelAtraso.text")); // NOI18N

        javax.swing.GroupLayout painelTempoLayout = new javax.swing.GroupLayout(painelTempo);
        painelTempo.setLayout(painelTempoLayout);
        painelTempoLayout.setHorizontalGroup(
            painelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTempoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelTempoLayout.createSequentialGroup()
                        .addComponent(jLabelETA, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelDiasRestantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAtraso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAtraso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelMenorProfundidadeAtual.setText(bundle.getString("FormInfoProjeto.jLabelMenorProfundidadeAtual.text")); // NOI18N

        jLabelMaiorProfundidadeAtual.setText(bundle.getString("FormInfoProjeto.jLabelMaiorProfundidadeAtual.text")); // NOI18N

        jLabelProfundidadeTotal.setText(bundle.getString("FormInfoProjeto.jLabelProfundidadeTotal.text")); // NOI18N

        javax.swing.GroupLayout painelProfundidadeLayout = new javax.swing.GroupLayout(painelProfundidade);
        painelProfundidade.setLayout(painelProfundidadeLayout);
        painelProfundidadeLayout.setHorizontalGroup(
            painelProfundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProfundidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelProfundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelProfundidadeTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMaiorProfundidadeAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMenorProfundidadeAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelProfundidadeLayout.setVerticalGroup(
            painelProfundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProfundidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMenorProfundidadeAtual)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelMaiorProfundidadeAtual)
                .addGap(0, 0, 0)
                .addComponent(jLabelProfundidadeTotal)
                .addGap(12, 12, 12))
        );

        painelAcoes.setLayout(new java.awt.GridLayout(1, 0));

        btnMarcar.setText(bundle.getString("FormInfoProjeto.btnMarcar.text")); // NOI18N
        btnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarActionPerformed(evt);
            }
        });
        painelAcoes.add(btnMarcar);

        btnEditar.setText(bundle.getString("FormInfoProjeto.btnEditar.text")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        painelAcoes.add(btnEditar);

        btnSair.setText(bundle.getString("FormInfoProjeto.btnSair.text")); // NOI18N
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
                .addContainerGap()
                .addComponent(painelProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMaiorProfundidade)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMenorProfundidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumeroDeEtapasAtrasadas)
                    .addComponent(jLabelValorEtapasRealizadas))
                .addGap(0, 0, 0)
                .addComponent(jLabelNumeroDeEtapasAFazer)
                .addGap(0, 0, 0)
                .addComponent(jLabelDataETA)
                .addGap(0, 0, 0)
                .addComponent(NumeroDeEtapasCriticas))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(832, 832, 832)
                        .addComponent(jLabelValorProfundidadeTotal)
                        .addGap(887, 887, 887)
                        .addComponent(jLabelNumeroDeDiasRestantes))
                    .addComponent(jLabelNomeDoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(barraDeProgresso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1625, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(painelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelNomeDoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(painelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelMaiorProfundidade)
                                    .addComponent(jLabelValorEtapasRealizadas)
                                    .addComponent(jLabelNumeroDeEtapasAFazer)
                                    .addComponent(NumeroDeEtapasCriticas)))
                            .addComponent(painelProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelMenorProfundidade)
                                .addComponent(jLabelNumeroDeEtapasAtrasadas)
                                .addComponent(jLabelDataETA))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, 1000)
                .addGap(18, 18, 18)
                .addComponent(barraDeProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorProfundidadeTotal)
                    .addComponent(jLabelNumeroDeDiasRestantes))
                .addGap(0, 0, 0))
        );

        barraDeProgresso.setMinimum(0);
        barraDeProgresso.setMaximum(100);
        barraDeProgresso.setValue(0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarActionPerformed

        int selected = jTable1.getSelectedRow();
        int gasto = Integer.parseInt(JOptionPane.showInputDialog(this, 
                    "Informe o tempo gasto para concluir a tarefa",
                    "Confirmar conclusão",
                    JOptionPane.OK_CANCEL_OPTION));
        projetoCore.concluirEtapaVinculada(this.etapas.get(selected).getIdentificacao(), gasto);
        Etapa e = this.etapas.get(selected).convert(projeto.getId());
        e.setRealizado(true);
        System.out.println("salvou a atarefa: "+e.getId());
        e.update();
        System.out.println(".... ::: "+e.getRealizado());
        projeto = projetoCore.convert();
        projeto.update();
        refresh();
        fillTabela();

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
    private javax.swing.JLabel jLabelAtraso;
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

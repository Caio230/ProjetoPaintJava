package paint2;
//Alunos : Caio Gabriel Bispo dos Santos, Obertran Oliveira Lima Júnior
import java.math.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class JanelaPaint extends javax.swing.JFrame {
    //Area de declaração dos botoes
    protected boolean mouseaction;
    protected boolean botaoImprime;
    protected boolean botaoQuadradoColorido;
    protected boolean botaoElipseColorida;
    protected boolean valorq;
    protected boolean valorc;
    protected boolean botaoRemoveFigura;
    protected boolean mouseExit;
   // protected boolean disp;
    
    //Atributos
    protected int x;
    protected int y;
    protected Color cor = Color.BLACK;
    protected int contadorQ = 1;
    protected int contadorE = 1;
    protected int contadorQC = 1;
    protected int contadorEC = 1;
    protected int indiceJList;
    protected String NomeArquivo;
    
    //Objetos e ArrayLists
    protected Editor1 e1 = new Editor1();
    private ArrayList<Quadrado1> q = new ArrayList();
    private ArrayList<Elipse> e = new ArrayList();
    private DefaultListModel<String> model = new DefaultListModel<>();
    private ArrayList<String> strings;
    
    //Novas Janelas        
    JanelaCor jc = new JanelaCor();
    JanelaMouseFora jm = new JanelaMouseFora();
    ErroValorJlistInvalido evj = new ErroValorJlistInvalido();
    //Fim da area de declarações
    
    //Construtor da janela
    public JanelaPaint() {
        this.strings = new ArrayList<String>();
        initComponents();
        centralizarComponente();
    }
    //Codigo Swing
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoQuadrado = new javax.swing.JButton();
        BotaoElipse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        Imprime = new javax.swing.JButton();
        LimparTela = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new JList<String>(new DefaultListModel<String>());
        QuadradoColorido = new javax.swing.JButton();
        ElipseColorida = new javax.swing.JButton();
        LimparTudo = new javax.swing.JButton();
        RmvFigura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Paint");
        setBackground(new java.awt.Color(102, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BotaoQuadrado.setBackground(new java.awt.Color(51, 153, 255));
        BotaoQuadrado.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        BotaoQuadrado.setText("Quadrado");
        BotaoQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoQuadradoActionPerformed(evt);
            }
        });

        BotaoElipse.setBackground(new java.awt.Color(51, 153, 255));
        BotaoElipse.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        BotaoElipse.setText("Elipse");
        BotaoElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoElipseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel1.setForeground(java.awt.Color.darkGray);
        jLabel1.setText("                             Figuras criadas");

        painel2.setBackground(java.awt.Color.white);
        painel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione uma figura e clique e solte para desenhar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N
        painel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        Imprime.setBackground(new java.awt.Color(51, 255, 0));
        Imprime.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Imprime.setText("SalvarTudo");
        Imprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimeActionPerformed(evt);
            }
        });

        LimparTela.setBackground(new java.awt.Color(51, 153, 255));
        LimparTela.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        LimparTela.setText("LimparTela");
        LimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparTelaActionPerformed(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(204, 204, 204));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            public void addForma(String forma){
                strings.add(forma);
            };
            public String getElementAt(int i) {return strings.get(i);}
            public int getSize() { return strings.size(); }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        QuadradoColorido.setBackground(new java.awt.Color(51, 153, 255));
        QuadradoColorido.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        QuadradoColorido.setText("QuadradoColorido");
        QuadradoColorido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuadradoColoridoActionPerformed(evt);
            }
        });

        ElipseColorida.setBackground(new java.awt.Color(51, 153, 255));
        ElipseColorida.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        ElipseColorida.setText("ElipseColorida");
        ElipseColorida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElipseColoridaActionPerformed(evt);
            }
        });

        LimparTudo.setBackground(new java.awt.Color(255, 51, 51));
        LimparTudo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LimparTudo.setText("Limpar Tudo");
        LimparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparTudoActionPerformed(evt);
            }
        });

        RmvFigura.setBackground(new java.awt.Color(51, 153, 255));
        RmvFigura.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        RmvFigura.setText("RemoveFigura");
        RmvFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RmvFiguraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LimparTudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imprime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(RmvFigura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LimparTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoElipse, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoQuadrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuadradoColorido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ElipseColorida)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoQuadrado)
                    .addComponent(BotaoElipse)
                    .addComponent(QuadradoColorido)
                    .addComponent(ElipseColorida)
                    .addComponent(LimparTela)
                    .addComponent(RmvFigura)
                    .addComponent(Imprime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(LimparTudo))
                    .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Ação Botao do Quadrado
    private void BotaoQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoQuadradoActionPerformed
    valorq = true;
    botaoQuadradoColorido = false;
    botaoElipseColorida = false;
    valorc = false;
    }//GEN-LAST:event_BotaoQuadradoActionPerformed

//Acao do Botão da Elipse
    private void BotaoElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoElipseActionPerformed
    valorq = false;
    botaoQuadradoColorido = false;
    botaoElipseColorida = false;
    valorc = true;
    }//GEN-LAST:event_BotaoElipseActionPerformed

//Ação de Clicar no painel para pegar o 1º ponto
    private void painel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painel2MousePressed
        x = evt.getX();
        y = evt.getY();
        mouseaction = true;
        mouseExit = false;
    }//GEN-LAST:event_painel2MousePressed

//Ação de soltar o mouse para desenhar as figuras se o botao tiver apertado
    private void painel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painel2MouseReleased
    if(mouseExit == true ) jm.setVisible(true);    
    else if(valorq == true){
            int xf = evt.getX(), yf = evt.getY();
            int l1 = yf - y; l1 = Math.abs(l1);
            int l2 = xf - x; l2 = Math.abs(l2);
            if((xf - x) > 0 && (yf - y) > 0)  {
                try {
                    Quadrado1 quad = new Quadrado1("Vazio", x, y, l2, l1);
                    quad.setCont(contadorQ);
                    q.add(quad);
                    model.addElement("Quadrado " + contadorQ);
                    jList1.setModel(model);
                    contadorQ++;
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharQuadrado(painel2.getGraphics(), x, y, l2, l1);
                
            }
            else if((xf - x) < 0 && (yf - y) > 0) {
                try {
                    Quadrado1 quad = new Quadrado1("Vazio",x - l2, y, l2, l1);
                    quad.setCont(contadorQ);
                    q.add(quad);
                    model.addElement("Quadrado " + contadorQ);
                    jList1.setModel(model);
                    contadorQ++;
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharQuadrado(painel2.getGraphics(), x - l2, y, l2, l1);
                
            }
            else if((xf - x) > 0 && (yf - y) < 0) {
                try {
                    Quadrado1 quad = new Quadrado1("Vazio", x, y - l1, l2, l1);
                    quad.setCont(contadorQ);
                    q.add(quad);
                    model.addElement("Quadrado " + contadorQ);
                    jList1.setModel(model);
                    contadorQ++;
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharQuadrado(painel2.getGraphics(), x, y - l1, l2, l1);
                
            }
            else if((xf - x) < 0 && (yf - y) < 0) {
                try {
                    Quadrado1 quad = new Quadrado1("Vazio", x - l2, y - l1, l2, l1);
                    quad.setCont(contadorQ);
                    q.add(quad);
                    model.addElement("Quadrado " + contadorQ);
                    jList1.setModel(model);
                    contadorQ++;
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharQuadrado(painel2.getGraphics(), x - l2, y - l1, l2, l1);
                
            }
        }else if(valorc == true){
            int xf = evt.getX(), yf = evt.getY();
            int a = yf- y; a = Math.abs(a);
            int b = xf - x; b = Math.abs(b); 
            if((xf - x) > 0 && (yf - y) > 0) {
                try {
                    Elipse elipse = new Elipse("Vazio", x, y, b, a);
                    elipse.setCont(contadorE);
                    e.add(elipse);
                    model.addElement("Elipse " + contadorE);
                    jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharElipse(painel2.getGraphics(), x, y, b, a);
                contadorE++;
            }else if((xf - x) < 0 && (yf - y) > 0){
                try {
                    Elipse elipse = new Elipse("Vazio", x - b, y, b, a);
                    elipse.setCont(contadorE);
                    e.add(elipse);
                    model.addElement("Elipse " + contadorE);
                jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                   JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                  }
                DesenharElipse(painel2.getGraphics(), x - b, y, b, a);
                contadorE++;
            }
            else if((xf - x) > 0 && (yf - y) < 0) {
                try {
                    Elipse elipse = new Elipse("Vazio", x, y - a, b, a);
                    elipse.setCont(contadorE);
                    e.add(elipse);
                    model.addElement("Elipse " + contadorE);
                    jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                   JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharElipse(painel2.getGraphics(), x, y - a, b, a);
                contadorE++;
            }else if((xf - x) < 0 && (yf - y) < 0){
                try {
                    Elipse elipse = new Elipse("Vazio",x - b, y - a, b, a);
                    elipse.setCont(contadorE);
                    e.add(elipse);
                    model.addElement("Elipse " + contadorE);
                    jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharElipse(painel2.getGraphics(), x - b, y - a, b, a);
                contadorE++;
            }
        }else if(botaoQuadradoColorido == true){
            int xf = evt.getX(), yf = evt.getY();
            int l1 = yf - y; l1 = Math.abs(l1);
            int l2 = xf - x; l2 = Math.abs(l2);
            this.cor = jc.getC();
            if((xf - x) > 0 && (yf - y) > 0)  {
                try {
                    Quadrado1 quad = new Quadrado1(cor.toString(), x, y, l2, l1);
                    quad.setCont(contadorQC);
                    q.add(quad);
                    model.addElement("ColoredSquare " + contadorQC);
                    jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharQuadradoColorido(painel2.getGraphics(), x, y, l2, l1, cor);
                contadorQC++;
            }
            else if((xf - x) < 0 && (yf - y) > 0) {
                try {
                    Quadrado1 quad = new Quadrado1(cor.toString(), x - l2, y, l2, l1);
                    quad.setCont(contadorQC);
                    q.add(quad);
                    model.addElement("ColoredSquare " + contadorQC);
                    jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharQuadradoColorido(painel2.getGraphics(), x - l2, y, l2, l1, cor);
                contadorQC++;
            }
            else if((xf - x) > 0 && (yf - y) < 0) {
                try {
                    Quadrado1 quad = new Quadrado1(cor.toString(), x, y - l1, l2, l1);
                    quad.setCont(contadorQC);
                    q.add(quad);
                    model.addElement("ColoredSquare " + contadorQC);
                    jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharQuadradoColorido(painel2.getGraphics(), x, y - l1, l2, l1, cor);
                contadorQC++;
            }
            else if((xf - x) < 0 && (yf - y) < 0) {
                try {
                    Quadrado1 quad = new Quadrado1(cor.toString(), x - l2, y - l1, l2, l1);
                    quad.setCont(contadorQC);
                    q.add(quad);
                    model.addElement("ColoredSquare " + contadorQC);
                    jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharQuadradoColorido(painel2.getGraphics(), x - l2, y - l1, l2, l1, cor);
                contadorQC++;
            }
        }else if(botaoElipseColorida == true){
            int xf = evt.getX(), yf = evt.getY();
            int a = yf- y; a = Math.abs(a);
            int b = xf - x; b = Math.abs(b); 
            this.cor = jc.getC();
            if((xf - x) > 0 && (yf - y) > 0) {
                try {
                    Elipse elipse = new Elipse(cor.toString(), x, y, b, a);
                    elipse.setCont(contadorEC);
                    e.add(elipse);
                    model.addElement("PaintedEllipse " + contadorEC);
                jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharElipseColorida(painel2.getGraphics(), x, y, b, a, cor);
                contadorEC++;
            }else if((xf - x) < 0 && (yf - y) > 0){
                try {
                    Elipse elipse = new Elipse(cor.toString(), x - b, y, b, a);
                    elipse.setCont(contadorEC);
                    e.add(elipse);
                    model.addElement("PaintedEllipse " + contadorEC);
                jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharElipseColorida(painel2.getGraphics(), x - b, y, b, a, cor);
                contadorEC++;
            }
            else if((xf - x) > 0 && (yf - y) < 0) {
                try {
                    Elipse elipse = new Elipse(cor.toString(),x, y - a, b, a);
                    elipse.setCont(contadorEC);
                    e.add(elipse);
                    model.addElement("PaintedEllipse " + contadorEC);
                    jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharElipseColorida(painel2.getGraphics(), x, y - a, b, a, cor);
                contadorEC++;
            }else if((xf - x) < 0 && (yf - y) < 0){
                try {
                    Elipse elipse = new Elipse(cor.toString(), x - b, y - a, b, a);
                    elipse.setCont(contadorEC);
                    e.add(elipse);
                    model.addElement("PaintedEllipse " + contadorEC);
                    jList1.setModel(model);
                } catch (ValoresInvalidosException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!!");
                }
                DesenharElipseColorida(painel2.getGraphics(), x - b, y - a, b, a, cor);
                contadorEC++;
            }
        }
    }//GEN-LAST:event_painel2MouseReleased

//Ação do botao Imprimir
    private void ImprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimeActionPerformed
        mouseExit = false;
        e1.LimpaEditor();
        for(Quadrado1 quad : q)  e1.addFigura(quad);
        for(Elipse eli : e)  e1.addFigura(eli);
        
        System.out.println(e1.imprimirFiguras());
        JOptionPane.showMessageDialog(null, "Lembre-se de limpar tudo antes de criar um novo arquivo");
        NomeArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo");
        Arquivo a = new Arquivo();
        a.Write(NomeArquivo + ".txt", e1.imprimirFiguras());
        a.Write(NomeArquivo + ".dat", e1.imprimirFiguras());
    }//GEN-LAST:event_ImprimeActionPerformed

//Limpar a tela
    private void LimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparTelaActionPerformed
        mouseExit = false;
        painel2.repaint();
        JOptionPane.showMessageDialog(null, "A tela foi limpa com sucesso!");
    }//GEN-LAST:event_LimparTelaActionPerformed

//Remover as figuras adicionadas
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
    mouseExit = false;
    try{
    indiceJList = jList1.getSelectedIndex();
    String s2 = model.get(indiceJList);
        if(botaoRemoveFigura == true){
            if(s2.startsWith("Colored")){
                int c = Integer.parseInt(s2.substring(14));
                for(Quadrado1 q2 : q){
                    if(q2.getCont() == c){
                        ApagarQuadradoColorido(painel2.getGraphics(), q2.getX(), q2.getY(), q2.getL1(), q2.getL2());
                        q.remove(q2);
                        model.remove(indiceJList);
                        break;
                    }
                }
            }else if(s2.startsWith("Quadrado ")){
                int c = Integer.parseInt(s2.substring(9));
                for(Quadrado1 q2 : q){
                    if(q2.getCont() == c){
                        ApagarQuadrado(painel2.getGraphics(), q2.getX(), q2.getY(), q2.getL1(), q2.getL2());
                        q.remove(q2);
                        model.remove(indiceJList);
                        break;
                    }
                }
            }else if(s2.startsWith("PaintedEllipse")){
                int c = Integer.parseInt(s2.substring(15));
                for(Elipse e2 : e){
                    if(e2.getCont() == c){
                        ApagarElipseColorida( painel2.getGraphics(), e2.getX(), e2.getY(), e2.a, e2.b );
                        e.remove(e2);
                        model.remove(indiceJList);
                        break;
                    }
                }
            }else if(s2.startsWith("Elipse ")){
                int c = Integer.parseInt(s2.substring(7));
                for(Elipse e2 : e){
                    if(e2.getCont() == c){
                        ApagarElipse(painel2.getGraphics(),e2.getX(), e2.getY(), e2.a, e2.b );
                        e.remove(e2);
                        model.remove(indiceJList);
                        break;
                    }
                }
            }
        }}catch(Exception ex){
            evj.setVisible(true);
                }
    }//GEN-LAST:event_jList1MouseClicked

//Ação do botao quadrado colorido
    private void QuadradoColoridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuadradoColoridoActionPerformed
        JOptionPane.showMessageDialog(null, "Por favor selecione uma cor");
        jc.setVisible(true);
        botaoQuadradoColorido = true;
        botaoElipseColorida = false;
        valorq = false;
        valorc = false;
    }//GEN-LAST:event_QuadradoColoridoActionPerformed

//Acção do botao elipse colorida
    private void ElipseColoridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElipseColoridaActionPerformed
        JOptionPane.showMessageDialog(null, "Por favor selecione uma cor");
        jc.setVisible(true);
        botaoQuadradoColorido = false;
        botaoElipseColorida = true;
        valorq = false;
        valorc = false;
    }//GEN-LAST:event_ElipseColoridaActionPerformed
//limpar tudo incluindo arquivo criado e tudo feito antes
    private void LimparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparTudoActionPerformed
        painel2.repaint();
        q.clear();
        e.clear();
        model.clear();
        contadorQ = 1;
        contadorE = 1;
        contadorEC = 1;
        contadorQC = 1;
        q.removeAll(q);
        e.removeAll(e);
        e1.LimpaEditor();
        JOptionPane.showMessageDialog(null, "Tudo Foi Limpo Com Sucesso!");
    }//GEN-LAST:event_LimparTudoActionPerformed
//Botao remover figura
    private void RmvFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RmvFiguraActionPerformed
        JOptionPane.showMessageDialog(null, "Selecione no jlist a figura que deseja apagar");
        botaoRemoveFigura = true;
        botaoQuadradoColorido = false;
        botaoElipseColorida = false;
        valorq = false;
        valorc = false;
    }//GEN-LAST:event_RmvFiguraActionPerformed

    private void painel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painel2MouseExited
       mouseExit = true;
    }//GEN-LAST:event_painel2MouseExited

//Area de getters e setter
    public Arquivo LimpaArquivo(Arquivo a){
        return a;
    }
    
    public void DesenharElipseColorida(Graphics g, int x, int y, int a, int b, Color c){
       g.setColor(c);
       g.fillOval(x, y, a, b);
    }
    
    public void ApagarQuadradoColorido(Graphics g, int x, int y, int l1, int l2){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, l1, l2);
    }
    
    public void ApagarElipse(Graphics g, int x, int y, int a, int b){
        g.setColor(Color.WHITE);
        g.drawOval(x, y, a, b);
    }
    
    public void ApagarElipseColorida(Graphics g, int x, int y, int a, int b){
        g.setColor(Color.WHITE);
        g.fillOval(x, y, a, b);
    }
    
    public void ApagarQuadrado(Graphics g, int x, int y, int l1, int l2){
        g.setColor(Color.WHITE);
        g.drawRect(x, y, l1, l2);
    }
    
    public void DesenharQuadradoColorido(Graphics g, int x, int y, int l1, int l2, Color c){
        g.setColor(c);
        g.fillRect(x, y, l1, l2);
    }
    
    public void DesenharQuadrado(Graphics g, int x, int y, int l1, int l2){
        g.drawRect(x, y, l1, l2);
    }
    public void DesenharElipse(Graphics g, int x, int y, int a, int b){
        g.drawOval(x, y, a, b);
    }
    
    public boolean isValorq() {
        return valorq;
    }

    public void setValorq(boolean valorq) {
        this.valorq = valorq;
    }

    public boolean isValorc() {
        return valorc;
    }

    public void setValorc(boolean valorc) {
        this.valorc = valorc;
    }
//Fim da area dos getters e setters    
    
//Metodo para centralizar a tela
public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }    
    
//main
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
            java.util.logging.Logger.getLogger(JanelaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPaint().setVisible(true);
            }
        });
    }
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoElipse;
    private javax.swing.JButton BotaoQuadrado;
    private javax.swing.JButton ElipseColorida;
    private javax.swing.JButton Imprime;
    private javax.swing.JButton LimparTela;
    private javax.swing.JButton LimparTudo;
    private javax.swing.JButton QuadradoColorido;
    private javax.swing.JButton RmvFigura;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painel2;
    // End of variables declaration//GEN-END:variables
}

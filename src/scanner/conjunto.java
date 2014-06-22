/*inicio
/*ERRORES
 * ERROR # 0:No se encontro definida la palabra FIN
 * Ubicacion: se encuentra en en el troso de codigo, en las linea de la 532 a 539
 * ERROR # 1:Se esperaba Nombre del conjunto antes del signo
 * Ubicacion:se encuentra en en el troso de codigo, en las linea de la 612 a 620
 * ERROR # 2:No se encontro el nombre del POGRAMA
 * Ubicacion:se encuentra en en el troso de codigo, en las linea de la 516 a 525
 * ERROR # 3:No se encontro definida la palabra PROGRAMA
 * Ubicacion:se encuentra en en el troso de codigo, en las linea de la 526 a 530
 * ERROR # 4:No se encontro defnida la palabra CONJUNTO
 * Ubicacion:se encuentra en en el troso de codigo, en las linea de la 548 a 555
 * ERROR # 5:No se encontro DEFINIDO NINGUN CONJUNTO
 * Ubicacion:se encuentra en en el troso de codigo, en las linea de la 556 a 563
 * ERROR # 6:No se encontro definida la palabra INICIO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 654 a 660
 * ERROR # 7:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 661 a 662
 * ERROR # 8:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 705 a 710
 * ERROR # 9:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 719 a 722
 * ERROR # 10:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 837 a  839
 * ERROR # 11:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 907 a 908
 * ERROR # 12:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 760 a 764
 * ERROR # 13:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 831 a 833
 * ERROR # 14:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 835 a 837
 * ERROR # 15:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 901 a 902
 * ERROR # 16:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 903 a 904
 * ERROR # 17:No se encontro declarada la palbra RESULTADO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 992 a 995
 * ERROR # 18:No se encontro definida la palabra ESCRIBIR
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 1000 a 1003
 * ERROR # 19:No se encontro DECLARADO EL CONJUNTO
 * Ubicacion:encuentra en en el troso de codigo, en las linea de la 1136 a 1119
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * inicio.java
 *
 * Created on 23/08/2011, 02:21:32 AM
 */
package scanner;

/**
 *
 * @author tony
 */
        import java.awt.BorderLayout;
        import java.awt.Component;
        import java.awt.Desktop;
        import java.io.BufferedWriter;
        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.net.URI;
        import javax.swing.*;
        import javax.swing.filechooser.FileNameExtensionFilter;
    public class conjunto extends javax.swing.JFrame {
        private Component parentComponent;
        public int esconj(String X){
      return 0;
    }
   
    
    /** Creates new form inicio */
    public conjunto() {
        initComponents();
        fondo fon= new fondo();//objeto de fondo
        this.add(fon,BorderLayout.CENTER);
        this.pack();
    }
    public String busca= "prueba.txt";
        String Tit[]=new String[10^100];
        int sta;
        String j2[][]= new String [10000][3] ;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        // setUndecorated(true);
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        // setUndecorated(true);
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        // setUndecorated(true);
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        // setUndecorated(true);
        jTable4 = new javax.swing.JTable();
        lblTit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("I   N   I   C   I   O");
        setBounds(new java.awt.Rectangle(400, 250, 0, 0));
        setResizable(false);

        jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(332, 287));
        jInternalFrame1.setVisible(false);

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            j2,
            new String [] {
                "No.","Token", "Tipo"
            }
        ){
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);

        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 16));
        jButton2.setText("REGRESAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            j2,
            new String [] {
                "No.","Token", "Tipo"
            }
        ){
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(jTable2);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);

        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            j2,
            new String [] {
                "No.","Token", "Tipo"
            }
        ){
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane4.setViewportView(jTable3);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);

        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            j2,
            new String [] {
                "No.","Token", "Tipo"
            }
        ){
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable4.setAutoscrolls(false);
        jScrollPane5.setViewportView(jTable4);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);

        lblTit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTit.setText("---");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TITULO DEL PROGRAMA: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Lectura del Archivo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Los Conjuntos");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Resultados de las Operaciones");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("ERRORES");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTit, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                            .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(151, 151, 151))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap(245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTit, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 22));
        jButton1.setText("REVISAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl1.setBackground(new java.awt.Color(113, 121, 238));
        lbl1.setFont(new java.awt.Font("Ubuntu", 0, 20));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText(busca);
        lbl1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(169, 188, 234));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18));
        jLabel2.setText(" que se abrira:");
        jLabel2.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(169, 188, 234));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18));
        jLabel1.setText("Nombre del Archivo");
        jLabel1.setOpaque(true);

        jMenu2.setText("Opciones");

        jMenuItem1.setText("Abir Archivo");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("?");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });

        jMenuItem3.setText("Ayuda");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Acerca de");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(lbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setSize(250, 250);
        jInternalFrame1.setVisible(false);

}//GEN-LAST:event_jButton2ActionPerformed

private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
    
}//GEN-LAST:event_jMenuItem1MouseClicked

private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        String vars=new String(),vars2=new String();

            JFileChooser fc = new JFileChooser("\\");
            fc.setDialogTitle("S E L E C C I O N E    A R C H I V O    P A R A    R E V I S A R");
            fc.setFileFilter(new FileNameExtensionFilter("TEXTO (*.txt)", "txt")); 
            fc.showOpenDialog(parentComponent);
                try{
                vars=fc.getSelectedFile().getPath();
                vars2=fc.getSelectedFile().getName();
                busca=vars;
                lbl1.setText(vars2);
                }catch (Exception e){
                busca="prueba.txt";
                 lbl1.setText(busca);
                System.out.print("No Selecciono Nada");
             
                }
}//GEN-LAST:event_jMenuItem1MousePressed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String j2[][]= new String [10000][3] ;
        sintaxis stx=new sintaxis();
        int i=0,inc=0,ho=0;
        int j=0;
        Integer lineas[]=new Integer[10^100];
        scan lexico = new scan();
        lex token = new lex();
        String erro[][]=new String[10^100][10];
         int ve=0;
        lexico.AbrirArchivo(busca);
        
            if(lexico.sta==1){
                token = lexico.GetToken();
                this.setSize(630, 630);
                jInternalFrame1.setSize(320,320);
            }else{
                busca="prueba.txt";
                lbl1.setText(busca);
            }
                int fin=0;
                while (token.Atributo != lexico.Estado_Final) {
                    lineas[i]=token.linea;
                    j2[i][j]=Integer.toString(i+1);
                    fin=i+1;
                    j++;
                    j2[i][j]=token.Lexema;
                    j++;
                    j2[i][j]=token.decir;
                    j=0;
                    i++;
                    token = lexico.GetToken();
                }
                    lexico.CerrarArchivo();
                    
                ///VARIABLES PARA CCONJUNTOS/////////////
                 i=0;
                 j=0;
                 String[][] conj=new String[10^100][10^100];  
                 int k=0,l=0,hi=-1;
                 String Nconj[]=new String[10^100];
                 String Nop[]=new String[10^100];
                 String tmp=null;
                 String tmpo[][]=new String[10^100][10^100] ;
                 int tmpJ=0;
                 Tit[0]=null;
                 stx.analizar(j2, lineas, fin);
                 ve=stx.v_ve();
                 erro=stx.v_eror();
    //PROGRAMA// En esta parte de código se analiza si viene la palbara programa para iniciar el programa y continuar...
                    
                 while(i<fin){
                        
     
                     
                if(((i+1)==fin)&&(Tit[0]==null)){
                    System.out.print("\n\nERROR: #3 No se Encontro definido el \"PROGRAMA\"") ;  
                    erro[ve][0]="ERROR: #3 No se Encontro definido el \"PROGRAMA\" ";
                    ve++;
                }else if((j2[i][1].equalsIgnoreCase("programa"))&&(j2[i+1][2].equals("Identificador"))){
                    Tit[j]=j2[i+1][1];
                    j2[i][2]="PALABRA DEFINIDA";
                    j2[i+1][2]="TITULO";
                    lblTit.setText(j2[i+1][1]);
                    j++;
                }else if((j2[i][1].equalsIgnoreCase("programa"))&&(!(j2[i+1][2].equals("Identificador")))){
                    System.out.print("\n\nERROR: #2 se esperaba Nombre del Programa Despues de \"PROGRAMA\"") ;   
                    erro[ve][0]="ERROR: #2 se esperaba Nombre del Programa Despues de \"PROGRAMA\"";
                    ve++;
                 } 
           
                if(j2[i][1].equalsIgnoreCase("fin")){
      //  System.out.println("HAY FIN");
                    j2[i][2]="PALABRA DEFINIDA";
                }else if ((i+1)==fin){
                    Tit[j-1]=null;
                    System.out.print("\n\nERROR: #0 No se Encontro definido el \"FIN\"") ;  
                    erro[ve][0]="ERROR: #0 No se Encontro definido el \"FIN\" ";
                   ve++;
        
                }
                    i++;
                }
    //CONJUNTOS // En esta parte  se analiza si viene la palbra definida CONJUNTOS...
            tmp=null;
                if (Tit[0]!=null){
                    i=0;
                    while(i<fin){
                        if((j2[i][1].equalsIgnoreCase("Conjuntos"))&&(j2[i][2].equals("Identificador"))){
                            tmp=j2[i][1];
                            j2[i][2]="PALABRA DEFINIDA";
                        }else if(((i+1)==fin)&&(tmp==null)){
                            erro[ve][0]="ERROR: #4 No se Encontro definido  \"CONJUNTOS\"";
                            ve++;
                            System.out.print("\n\nERRRO: #4 No se Encontro definido  \"CONJUNTOS\"") ;      
                         }else if((j2[i][1].equalsIgnoreCase("Conjuntos"))&&(!((j2[i+1][2].equals("Identificador"))||(j2[i+1][2].equals("Numero"))))){
                            erro[ve][0]="ERROR: #5 se esperaba Que definiera algun  \"CONJUNTO\"";
                            ve++;
                            System.out.print("\n\nERRRO: #5 se esperaba Que definiera algun  \"CONJUNTO\"") ;   
                         } 
                            i++;
                    }
                }
     //CONJUNTOS-2/// Esta parte de códigoanaliza y forma conjuntos Si viene la palbra CONUUNTOS
             i=0;
             j=0;
             int tmpi=0;
                 if (tmp!=null){
    
                    while(i<fin){
                         if(j2[i][1].equalsIgnoreCase("inicio")){    
                             tmpi=i;
                             i=fin-1;
     
                         }
                    if((j2[i][1].equals("="))&&((j2[i-1][2].equals("Identificador"))||(j2[i-1][2].equals("Numero")))){
                        
                        if (!esconj(j2[i-1][1],Nconj)){
           
                            if(hi!=(-1)){
                                k=hi;
                                hi=-1;
                            }
                                Nconj[k]=j2[i-1][1];
                                j2[i-1][2]="CONJUNTO";
                                k++;
                                
                                if(j>tmpJ){
                                    tmpJ=j+1;}
                                    j=0;
                                }else{
                                    hi=k;
                                    k=vaconj(j2[i-1][1],Nconj);
                                    k++;
                                    j2[i-1][2]="RE-CONJUNTO";
                                    
                                    while(j!=(tmpJ+1)){
                                        conj[j][k-1]=null;
                                        j++;
                                    }
                                         if(j>tmpJ){
                                            tmpJ=j+1;}
                                            j=0; 
                                }
         
                    }else if ((j2[i][1].equals("="))&&(!(j2[i-1][2].equals("Identificador")))){
                         erro[ve][0]="ERROR: #1 se esperaba Nombre del conjunto antes del signo \"=\"LINEA= #"+lineas[i];
                         ve++;
                         System.out.print("\n\nERROR: #1 se esperaba Nombre del conjunto antes del signo \"=\"") ;}
                        if((j2[i][1].equals("{"))&&((j2[i+1][2].equals("Identificador"))||(j2[i+1][2].equals("Numero"))||((j2[i+1][1].equals("}"))))){
if(j<0){
j=0;
}
if(k==0){
k=1;
}
if(i<0){
i=0;
}
                                 conj[j][k-1]=j2[i+1][1];
           
                                 ho=i+1;
                                 j++;
                                if(j2[i+1][1].equals("}")){
                                    j--;
                                    conj[j][k-1]=null;
                                }
                    }
            if((j2[i][1].equals(","))&&((j2[i+1][2].equals("Identificador"))||(j2[i+1][2].equals("Numero")))){
if(k==0){
k=1;
}
                conj[j][k-1]=j2[i+1][1];
                 j++;
                  
                     while(ho!=i){
                         if(j2[i+1][1].equalsIgnoreCase(j2[ho][1])){
                            j--;
                             conj[j][k-1]=null; 
                         }
                         
                            ho++;
                     }
            }
                i++;
    
                    }

                        if(j>tmpJ){
                             tmpJ=j+1;}
                        }   
//INICIO// las operaciones AKI se analiza si viene la palbra definida CONJUTNOS
            i=tmpi; 
            Integer m[]=new Integer[10^100]; 
            m[5]=0;//signo "+"UNICOIN   
            m[10]=0;//singo "-"DIFERENCIA
            m[11]=0;//SIGNO "*"INTERSECCIOn
            m[3]=0;
            m[14]=0;//SIGNO "=" IGUAL
            m[15]=(10^100);/////////USADO PARA RESERVAR VALORES de conjunto e intercambio de ocnjutno
            String tm[]=new String[10^100];
            
            while(i<fin){
      
                if(((i+1)==fin)&&(!tmp.equalsIgnoreCase("inicio"))){
                    erro[ve][0]="ERROR: #6 No se Encontro definido  \"INICIO\"";
                    ve++;
                    System.out.print("\n\nERROR: #6 No se Encontro definido  \"INICIO\"") ;      
                }else if((j2[i][1].equalsIgnoreCase("Inicio"))&&(j2[i+1][2].equals("Identificador"))){
                    tmp=j2[i][1];
                    j2[i][2]="PALABRA DEFINIDA";
                }else if((j2[i][1].equalsIgnoreCase("inicio"))&&(!(j2[i+1][2].equals("Identificador")))){
                    erro[ve][0]="ERROR: #7 se esperaba Que definiera algun  \"CONJUNTO\"";
                    ve++;
                System.out.print("\n\nERROR: #7 se esperaba Que definiera algun  \"CONJUNTO\"") ;   
                } 
                i++;
            }
    //INICIO// rellena los conjuntos ya definidos y analiza si no estan 
             int h=0;
             i=tmpi;
                if((tmp!=null)&&(tmp.equalsIgnoreCase("inicio"))){
                    j=0;
                   while(i<fin){
                        if(j2[i][1].equalsIgnoreCase("Resultados")){    
                            tmpi=i;
                            i=fin-1;
                 }
                        if((j2[i][1].equals("="))&&((j2[i-1][2].equals("Identificador")||(j2[i-1][2].equals("Numero")))))
                        {   
                            if(m[14]>0){
                                for(int cont=0;cont!=(10^100);cont++){
if(m[15]==-1){
m[15]=0;
}
                                    conj[cont][m[15]]=null;
                                }
                                 int cont2=0;
                                    for(int cont=0;cont!=(10^100);cont++){
                            
                                        if(tm[cont]!=null){
                                            conj[cont2][m[15]]=tm[cont];
                                            cont2++;                               
                                        }
                                    }
                        
                      
                            }
                           
                        
                         if (esconj(j2[i-1][1],Nconj)){
                            k=0;  
                                while(Nconj[k]!=null){
                                    if(Nconj[k].equalsIgnoreCase(j2[i-1][1])){
                                        Nop[h]=Nconj[k]  ;
                                        j2[i-1][2]="CONJUNTO";
                                        h++;
                                        m[5]=0;
                                        int jo=0;
                                        while(jo!=(10^100)){
                                            tm[jo]=null;
                                            jo++;
                                        }
                                    }        
                                     k++;

                                }
                        }else{
                            erro[ve][0]="ERRRO: #9 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1];//j2[i-1][0];
                            ve++;
                            System.out.print("\n\nERROR: #9 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1]);}
                            j=0;
                     }else if((j2[i][1].equals("="))&&!(esconj(j2[i-1][1],Nconj))){
                         erro[ve][0]="ERROR: #8 El conjutno que desa operar no puede ser un   \"NUMERO\"";
                         ve++;
                         System.out.print("\n\nERROR: #8 El conjutno que desa operar no puede ser un   \"NUMERO\"") ;}



                 //  /////////////   //UNION!!!!!!!!!!!!!!!!!!
                     if(Nop[0]!=null){

                        k=0;     

               ///////////////////I W A L D A D /////////////////      
                            if(j2[i][1].equalsIgnoreCase("=")){
                       
                            m[15]=vaconj(j2[i-1][1],Nconj);
                            m[14]++;
                            m[4]=1;
                            m[3]=0;
                            m[0]=vaconj(j2[i+1][1],Nconj); 
                            j2[i+1][2]="CONJUNTO";
                            while(m[4]!=2){
                                j=0;
                                    while(j!=tmpJ){
                                        try{
                                            if(conj[j][m[k]]!=null){
                                                        tmpo[m[3]][h-1]=conj[j][m[k]];
                                                        tm[m[3]]=conj[j][m[k]];
                                            }else{m[3]--;}
                                        }catch(Exception e){
                                        }
                                            j++;
                                            m[3]++;
                                    }
                                    m[4]++;
                            }
            if(!tmp.equalsIgnoreCase("inicio")){
                i=fin;
                erro[ve][0]="ERROR: #6.2 No se Encontro definido  \"INICIO\"";
                ve++;
                System.out.print("\n\nERROR: #6.2 No se Encontro definido  \"INICIO\"") ;   
            }else if(!esconj(j2[i+1][1],Nconj)){
                erro[ve][0]="ERRRO: #12 El conjunto \""+j2[i+1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1];
                ve++;
                System.out.print("\n\nERROR: #12 El conjunto \""+j2[i+1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1]) ;   
                        }
                            }


                try{

                        ////////////////////// DIFERENCIA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    if(((esconj(j2[i-1][1],Nconj))&&((esconj(j2[i+1][1],Nconj))))&&(j2[i][1].equalsIgnoreCase("-"))){
                        j=0;
                        m[0]=vaconj(j2[i-1][1],Nconj); 
                        m[1]=vaconj(j2[i+1][1],Nconj); 
                        j2[i+1][2]="CONJUNTO";
                        m[10]++;

                        if(m[10]>0){//M[10] cuando venga repetido el signo -

                            j=0;
                            k=1;
                            m[4]=0;
                            m[3]=0;
                            int jo=0;
                                while(jo!=(10^100)){
                                    if(tm[jo]!=null){
                                         tmpo[jo][h-1]=tm[jo];

                                         m[3]++;
                                    }    
                                     jo++;
                                }
                                while(m[4]!=2){
                                    j=0;

                                        if(m[0]==m[1]){m[4]=1;}
                                            while(j!=(10^100)){
                                                try{
                                                    if(conj[j][m[k]]!=null){

                                                        inc=0;

                                                          while(inc!=(10^100)){
                                                            if(k!=0){
                                                                if(conj[j][m[k]].equalsIgnoreCase(tm[inc])){

                                                                    tmpo[inc][h-1]=null;
                                                                    tm[inc]=null;
                                                                    m[3]--;
                                                                    inc=-1;
                                                                    j++;}
                                                            }    
                                                                inc++;
                                                         }
                                                            tmpo[m[3]][h-1]=conj[j][m[k]];
                                                            tm[m[3]]=conj[j][m[k]];
                                                    }else if(conj[j][m[k]]==null){k++;m[3]--;j=-1;}
                                                        }catch(Exception e){
                                                        }
                                                        j++;
                                                     m[3]++;
                                            }
                                                    m[4]++;
                                                }

                        }



                }else if(((!(esconj(j2[i-1][1],Nconj))))&&(j2[i][1].equalsIgnoreCase("-"))){
                        erro[ve][0]="ERROR: #13 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1];
                        ve++;
                        System.out.print("\n\nERROR: #10 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1]) ;
                }else if(((!(esconj(j2[i+1][1],Nconj))))&&(j2[i][1].equalsIgnoreCase("-"))){
                        erro[ve][0]="ERRRO: #14 El conjunto \""+j2[i+1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1];
                        ve++;
                        System.out.print("\n\nERROR: #11 El conjunto \""+j2[i+1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1]) ;
                }

                        ////////////////////// INTERSECCION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                        if(((esconj(j2[i-1][1],Nconj))&&((esconj(j2[i+1][1],Nconj))))&&(j2[i][1].equalsIgnoreCase("*"))){
                            j=0;
                            m[0]=vaconj(j2[i-1][1],Nconj); 
                            m[1]=vaconj(j2[i+1][1],Nconj); 
                            j2[i+1][2]="CONJUNTO";
                            m[11]++;

                            if(m[11]>0){//M[11] cuando venga repetido el signo *

                                j=0;
                                k=1;
                                m[4]=0;
                                m[3]=0;
                                int jo=0;
                                while(jo!=(10^100)){
                                    tmpo[jo][h-1]=null;     
                                    if(tm[jo]!=null){

                          
                                    }    
                                        jo++;
                                }
                                    while(m[4]!=2){
                                    j=0;
                                        if(m[0]==m[1]){m[4]=1;}
                                            while(j!=(10^100)){
                                                try{
                                                    if(conj[j][m[k]]!=null){

                                                    inc=0;

                                    while(inc!=(10^100)){
                                        if(k!=0){
                                            if(conj[j][m[k]].equalsIgnoreCase(tm[inc])){
                                                tmpo[inc][h-1]=conj[j][m[k]];
                                                tm[inc]=conj[j][m[k]];
                                                m[3]--;
                                                inc=-1;
                                                j++;}
                                            }    
                                                inc++;
                                }

                                        tmpo[m[3]][h-1]=null;//conj[j][m[k]];
                                        tm[m[3]]=null;//conj[j][m[k]];
                                                    }else if(conj[j][m[k]]==null){k++;m[3]--;j=-1;}
                                                        }catch(Exception e){
                                                        }
                                                            j++;
                                                            m[3]++;
                                        }
                                                             m[4]++;
                                }

                            }//FIN DEL M[11]>0



                           }else if(((!(esconj(j2[i-1][1],Nconj))))&&(j2[i][1].equalsIgnoreCase("*"))){
                       // "ERRRO: #10 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" ","ERRRO: #10 ", JOptionPane.ERROR_MESSAGE);
                                erro[ve][0]="ERROR: #15 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1];
                                ve++;
                                System.out.print("\n\nERROR: #10 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1]) ;
                            }else if(((!(esconj(j2[i+1][1],Nconj))))&&(j2[i][1].equalsIgnoreCase("*"))){
                                erro[ve][0]="ERROR: #16 El conjunto \""+j2[i+1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1];
                                ve++;
                                System.out.print("\n\nERROR: #11 El conjunto \""+j2[i+1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1]) ;
                            }




                   ////////// //  /////////////   //UNION!!!!!!!!!!!!!!!!!!///////////////////
                        if(((esconj(j2[i-1][1],Nconj))&&((esconj(j2[i+1][1],Nconj))))&&(j2[i][1].equalsIgnoreCase("+"))){
                            j=0;
                            m[0]=vaconj(j2[i-1][1],Nconj); 
                            m[1]=vaconj(j2[i+1][1],Nconj); 
                            j2[i+1][2]="CONJUNTO";

                            m[5]++;// contador de signo "+"



                        if(m[5]>0){//M[5] cuando venga repetido el signo +

                            j=0;
                            k=1;
                            m[4]=0;
                            m[3]=0;
                            int jo=0;
                                while(jo!=(10^100)){
                                    if(tm[jo]!=null){
                                        tmpo[jo][h-1]=tm[jo];

                                        m[3]++;
                                    }    
                                        jo++;
                      }
                        while(m[4]!=2){
                            j=0;

                            if(m[0]==m[1]){m[4]=1;}
                                while(j!=(10^100)){
                                    try{
                                        if(conj[j][m[k]]!=null){

                                            inc=0;

                                                while(inc!=(10^100)){
                                                    if(k!=0){
                                                         if(conj[j][m[k]].equalsIgnoreCase(tm[inc])){
                                                            inc=-1;
                                                                j++;}
                                                    }    
                                                            inc++;
                                                }
                                                    tmpo[m[3]][h-1]=conj[j][m[k]];
                                                    tm[m[3]]=conj[j][m[k]];
                                        }else if(conj[j][m[k]]==null){k++;

                                            m[3]--;j=-1;}
                                            }catch(Exception e){
                                            }
                                            j++;
                                            m[3]++;
                                            }
                                            m[4]++;
                                            }

                            }//FIN DEL M[5]>1///
                    
                        }else if(((!(esconj(j2[i-1][1],Nconj))))&&(j2[i][1].equalsIgnoreCase("+"))){
                      
                            erro[ve][0]="ERROR: #10 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1];
                            ve++;
                            System.out.print("\n\nERROR: #10 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1]) ;
                        }else if(((!(esconj(j2[i+1][1],Nconj))))&&(j2[i][1].equalsIgnoreCase("+"))){
                            erro[ve][0]="ERROR: #11 El conjunto \""+j2[i+1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1];
                            ve++;
                            System.out.print("\n\nERROR: #11 El conjunto \""+j2[i+1][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i-1]) ;
                        }
                            }catch(Exception e){
                            }
                        }
                            i++;
                                    } 
                                        }
/////////////////////////////////////////////RECONOSE EL RESULTADOS!!!////////////////
  i=0;
                    while(i<fin){
      
                        if(((i+1)==fin)&&(!tmp.equalsIgnoreCase("resultados"))){
                            erro[ve][0]="ERROR: #17 No se Encontro definido  \"RESULTADOS\"";
                            ve++;
                            System.out.print("\n\nERROR: #17 No se Encontro definido  \"RESULTADOS\"") ;      
                        }else if((j2[i][1].equalsIgnoreCase("resultados"))&&(j2[i+1][2].equals("Identificador"))){
                            tmp=j2[i][1];
                            j2[i][2]="PALABRA DEFINIDA";
          
                        }else if((j2[i][1].equalsIgnoreCase("resultados"))&&(!(j2[i+1][2].equals("Identificador")))){
                            erro[ve][0]="ERROR: #18 se esperaba Que definiera algun  \"ESCRIBIR\"";
                            ve++;
                            System.out.print("\n\nERROR: #18 se esperaba Que definiera algun  \"ESCRIBIR\"") ;   
                        } 
                            i++;
     }
                
                        for(i=0;i!=(10^100);i++){   
    
                                for(j=0;j!=(10^100);j++){
                                    tm[j]=tmpo[j][i];  
                                }
                                k=0; 
                                try{
                                    for(j=0;j!=(10^100);j++){
   
                                        if(tm[j]!=null){ 
     
                                            tmpo[k][i]=tm[j];
                                            k++;
        
                                            if(m[14]>0){
                                                for(int cont=0;cont!=(10^100);cont++){
                                                    conj[cont][m[15]]=null;
                                 
                                                }
                                                int cont2=0;
                                                for(int cont=0;cont!=(10^100);cont++){
                            
                                                     if(tm[cont]!=null){
                                                     conj[cont2][m[15]]=tm[cont];
                                                     cont2++;                               
                                
                                                     }
                                                }
                                            }
                                        }
                                }
                for(j=(k);j!=(10^100);j++){
    
                    tmpo[j][i]=null;
                }
                    }catch(Exception e){}
                    }
                
          
 ////////////////////////////////////INICIA RESULTADOS
                h=0;
                File Archivo=new File("Salida.txt");
                try{
                    FileWriter escrive=new FileWriter(Archivo);
                    BufferedWriter bw=new BufferedWriter(escrive);
                    PrintWriter  salida=new PrintWriter(bw);
       
                    i=tmpi;
                
                    int tmpifin=0;
                    j=0;
                     if((tmp!=null)&&(tmp.equalsIgnoreCase("Resultados"))){

                             while(i<fin){     
                                if(j2[i][1].equalsIgnoreCase("Fin")){    
                                    tmpifin=i;
                                    i=fin-1;
                                    }
                                    i++;
                                    }
                                    i=0;
                                    while(i<fin){
                   
                                        if((i>tmpi)&&(i<tmpifin)){
                          
                                            if( (j2[i][1].equalsIgnoreCase("escribir")&&(j2[i+1][1].equalsIgnoreCase("("))&&(esconj(j2[i+2][1],Nop)))   ){
                                                j2[i][2]="PALABRA RESERVADA";
                                                j=i+2;
                                                while(j<=fin){
                              
                                                    if(lineas[i]==lineas[j]){
                                                        String tmpt=new String();
                                                        if(esconj(j2[j][1],Nop)){
                                                            j2[j][2]="CONJUNTO";
                                                            int este=vaconj(j2[j][1],Nop);
                                                            tmpt=j2[j][1]+"="+"{";
                                                            int co=0;
                                                            while (co!=(10^100)){
                                                                try{
                                                                    if(!(conj[co+1][este]==null)){
                                                                        tmpt=tmpt+conj[co][este]+","; 
                                                                    }else if(conj[co][este]!=null){
                                                                    tmpt=tmpt+conj[co][este]+"";
                                                                    }
                                                                }catch(Exception e){
                                                     
                                                  
                                                                }
                                                                    co++;
                                                            }
               
                                                                salida.println(tmpt+"}");
                                                            }else if(((!(esconj(j2[j][1],Nop)))&&(j2[j][2].equalsIgnoreCase("identificador")))){
                       // JOptionPane.showMessageDialog(null,"ERRRO: #10 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" ","ERRRO: #10 ", JOptionPane.ERROR_MESSAGE);
                                                                erro[ve][0]="ERRRO: #19 El conjunto \""+j2[j][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i];
                                                                ve++;
                                                                System.out.print("\n\nERROR: #19 El conjunto \""+j2[j][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i]) ;
                                                            }
                                               
                                }else if(lineas[i]<lineas[j]){
                                    j=255;
                                }
                                     j++;
                                    }

                                    }
                                    else if(((!(esconj(j2[i+2][1],Nop))))&&(j2[i][1].equalsIgnoreCase("escrivir"))){
                       // JOptionPane.showMessageDialog(null,"ERRRO: #10 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA DECLARADO\" ","ERRRO: #10 ", JOptionPane.ERROR_MESSAGE);
                                        erro[ve][0]="ERRRO: #19 El conjunto \""+j2[i+2][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i];
                                        ve++;
                                        System.out.print("\n\nERRRO: #19 El conjunto \""+j2[i+2][1]+"\" \" NO ESTA DECLARADO\" LINEA= #"+lineas[i]) ;
                                    }
                                        }
                                    i++;
                                    }
                   
                        }
                            salida.close();
                            bw.close();
                
                
                
                            }catch (Exception e){}
     
     
     ///FORMA DEL CUADRADO////////////// INTERNO del JIF1
                     final Boolean falso[]=new Boolean[10^100];
                        int co=0;      
                    while(co!=(10^100))
                        {falso[co]=false;co++;}//FALSOS PARA TODOS LOS EDITAR!!!
                        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        j2,
                        new String [] {
                        "No.","Token", "Tipo"
                        }
                        ){
                            boolean[] canEdit = new boolean [] {
                            false, false, false
                            };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                        }
                        });

        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.getVerticalScrollBar().setValue(0);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);


  ///FORMA DEL CUADRADO////////////// INTERNO del JIF2
        jTable2.setModel(new javax.swing.table.DefaultTableModel(conj/*MATIRZ*/,Nconj){
            Boolean[] canEdit = falso;
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }});

        jScrollPane3.setViewportView(jTable2);
        jScrollPane3.getVerticalScrollBar().setValue(0);

        for(i=0;i!=(10^100);i++){   
            jTable2.getColumnModel().getColumn(i).setPreferredWidth(100);

        for(j=0;j!=(10^100);j++){
            tm[j]=tmpo[j][i];  
        }
            k=0; try{
        for(j=0;j!=(10^100);j++){
   
            if(tm[j]!=null){ 
     
                tmpo[k][i]=tm[j];
                k++;
            }
        }   
        for(j=(k);j!=(10^100);j++){
    
            tmpo[j][i]=null;
        }
                }catch(Exception e){}
        }
///FORMA DEL CUADRADO////////////// INTERNO del JIF3 RESULTADOS
        jTable3.setModel(new javax.swing.table.DefaultTableModel(tmpo/*MATIRZ*/,Nop){
        
            Boolean[] canEdit = falso;
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }});

        jScrollPane4.setViewportView(jTable3);
        jScrollPane4.getVerticalScrollBar().setValue(0);

        for(i=0;i==(10^100);i++){
            jTable3.getColumnModel().getColumn(i).setPreferredWidth(100);}
            ///FORMA DEL CUADRADO////////////// INTERNO del JIF4 ERRORES!!!!!!!!!
            jTable4.setModel(new javax.swing.table.DefaultTableModel(erro/*MATIRZ*/,
            new String [] {
            "ERRORES"
            }){
            boolean[] canEdit = new boolean [] {
            false
            };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
        });


        jScrollPane5.setViewportView(jTable4);
        jScrollPane5.getVerticalScrollBar().setValue(0);
    jTable4.getColumnModel().getColumn(0).setPreferredWidth(1000);

        for(i=0;i==(10^100);i++){
     jTable4.getColumnModel().getColumn(i).setPreferredWidth(100);}
        
///////////////////////////////////////////////////////////////////////////////
        jInternalFrame1.setVisible(true);
}//GEN-LAST:event_jButton1ActionPerformed
    public Boolean esconj(String X,String Y[]){
        int  k=0;
            while(Y[k]!=null){
             
                if(Y[k].equalsIgnoreCase(X)){
                    return true; 
                }
                    k++;}
            return false;
    }
    public int vaconj(String X,String Y[]){
        int k=0;  
             while(Y[k]!=null){
                  if(Y[k].equalsIgnoreCase(X)){
                  return k;
                 }        
                 k++;
                 }
    return -1;
    }    
private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
        JOptionPane.showMessageDialog(null,"UNIVERCIDAD MARIANO GALVEZ DE GUATEMALA\n                Facultad de Ingenieria en Sistemas\n                                                                                  Carné:\nAutores: Luis Antonio Garcia Aguirre         1690-10-1493\n                Carlos Antonio Morales Matus    1690-10-3643\n                Erick Urbelino Chayax Tesucun  1690-10-3661\n                Erick Hernandez Reynoso           1690-09-4668\nVercion: 10.0\nPractica de Programacion Avanzada\nTrabajado en Java\nCompilador NetBeans IDE","ACERCA De...", JOptionPane.WARNING_MESSAGE, new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage()));

}//GEN-LAST:event_jMenuItem2MousePressed

private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed

}//GEN-LAST:event_jMenu1MousePressed

private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed

    
    File f = new File("manual.pdf");
        if(f.exists()){
            try {Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "manual.pdf");}
            catch(Exception e){}
            }
            else
            JOptionPane.showMessageDialog(this, "No existe\n"+"manual.pdf", "ERROR", JOptionPane.ERROR_MESSAGE);

}//GEN-LAST:event_jMenuItem3MousePressed


    public static void hacer() {
       
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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new conjunto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblTit;
    // End of variables declaration//GEN-END:variables
}
   class sintaxis{
      private  int ve_salida=0;
      private String er_salida[][]=new String[10^100][1];
      
      sintaxis(){
      ve_salida=0;
      for(int i=0;i!=(10^100);i++){
          er_salida[i][0]=null;
                  }
      }
            public void analizar(String j2[][],Integer lineas[],int fin){
                for(int i=0;i!=fin;i++){
                    if((j2[i][1].equalsIgnoreCase("="))&&((!((j2[i-1][2].equalsIgnoreCase("Identificador"))||(j2[i-1][2].equalsIgnoreCase("Numero"))))||(j2[i-1][1].equalsIgnoreCase("conjuntos"))  )  ){
                         er_salida[ve_salida][0]="ERROR: #20 El conjunto \""+j2[i-1][1]+"\" \" NO ESTA \'CORECTAMENTE\' DECLARADO\" LINEA= #"+lineas[i];
                         ve_salida++;
                    }
                    
                    if((j2[i][1].equalsIgnoreCase("="))&&(j2[i+1][1].equalsIgnoreCase("="))){
                     er_salida[ve_salida][0]="ERROR: #21 El Conjunto \""+j2[i-1][1]+"\" \" NO ESTA \'CORECTAMENTE\' DECLARADO\" Signos '==' repetidos LINEA= #"+lineas[i-1];
                         ve_salida++;
                    }
                    
                    if((j2[i][1].equalsIgnoreCase("}"))&&((j2[i+1][2].equalsIgnoreCase("Identificador"))||(j2[i+1][2].equalsIgnoreCase("numero")))&&(!(j2[i+2][1].equalsIgnoreCase("=")))&&(!defi(j2[i+1][1]))){
                        
                         er_salida[ve_salida][0]="ERROR: #22 Caracter \""+j2[i+1][1]+"\" \" CARACATER SIN RAZON LINEA= #"+lineas[i+1];
                         ve_salida++;
                    }
                    if(j2[i][1].equalsIgnoreCase("{")&&(!j2[i-1][1].equalsIgnoreCase("="))){
                         er_salida[ve_salida][0]="ERROR: #23  \" ESTA MAL DECLARADO Falta singno '=' LINEA= #"+lineas[i];
                         ve_salida++;
                    }
                    if(j2[i][1].equalsIgnoreCase("=")&&((j2[i+1][2].equalsIgnoreCase("otros signos"))&&(!(j2[i+1][1].equalsIgnoreCase("{"))))){
                         er_salida[ve_salida][0]="ERROR: #24 El Conjunto \""+j2[i-1][1]+"\" \" NO ESTA \'CORECTAMENTE\' DECLARADO\" LINEA= #"+lineas[i-1];
                         ve_salida++;
                    }
                    if(j2[i][2].equalsIgnoreCase("otros signos")&&(!(j2[i][1].equalsIgnoreCase("{")||j2[i][1].equalsIgnoreCase("}")||j2[i][1].equalsIgnoreCase(",")||j2[i][1].equalsIgnoreCase("(")||j2[i][1].equalsIgnoreCase(")"))  )){
                         er_salida[ve_salida][0]="ERROR: #25 El Caracter \""+j2[i][1]+"\" \" NO ESTA \'PERMITIDO\'\" LINEA= #"+lineas[i];
                         ve_salida++;
                    }
                    if((j2[i][1].equalsIgnoreCase(","))&&(j2[i+1][1].equalsIgnoreCase(","))){
                         er_salida[ve_salida][0]="ERROR: #26 El Caracter \""+j2[i][1]+"\" \" NO PUEDE SER \'ELEMENTO VALIDO PARA UN CONJUNTO\'\" LINEA= #"+lineas[i];
                         ve_salida++;
                    
                    }
                }

            }
            public int v_ve(){
                return ve_salida;
            }
            public String[][] v_eror(){
                return er_salida;
            }
            public Boolean defi(String rev){
                if(rev.equalsIgnoreCase("Inicio")||rev.equalsIgnoreCase("conjuntos")||rev.equalsIgnoreCase("programa")||rev.equalsIgnoreCase("resultados")){
                    return true;
                }
            return false;
            }
    }


package heroes;

import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.Cartas;

public class main extends javax.swing.JFrame {

    Random rnd = new Random();
    Cartas carta[]= new Cartas[10];
    int numberPlay,numberPlay1, num=0,sc1=0,sc2=0;
    String c,ce="La carta enemiga es: ",n="",r="";
    boolean si_no=false;
    
    public main() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/cartas/icono.jpg")).getImage());
    }//Constructor
    
    public void num(){
        num+=+1;
        JTxt_round.setText(String.valueOf(num));
    }
    
    public void score1(){
        sc1+=+1;
        Score_Jugador.setText("Score: "+String.valueOf(sc1));
    }
    public void score2(){
        sc2+=+1;
        Score_Enemiga.setText("Score: "+String.valueOf(sc2));
    }
    
    public void resultado_pantalla(){
        if(carta[numberPlay1].ataque>=carta[numberPlay].vida){
           JOptionPane.showMessageDialog(null, "GANADOR: MAQUINA\nSCORE+1","Resultado",1);
           score2();
        }else if(carta[numberPlay].ataque>=carta[numberPlay1].vida){
            JOptionPane.showMessageDialog(null, "GANADOR: JUGADOR\nSCORE+1","Resultado",1);
            score1();
        }else{
            JOptionPane.showMessageDialog(null, "EMPATE, NUNGUNO GANÓ","Resultado",1);
        }
    }
    public void resultado_consola(){
        if(carta[numberPlay1].ataque>=carta[numberPlay].vida){
            r="GANADOR: MAQUINA";
            //GANADOR: MAQUINA
        }else if(carta[numberPlay].ataque>=carta[numberPlay1].vida){
            r="GANADOR: JUGADOR";
            //GANADOR: JUGADOR
        }else{
            r="EMPATE, NUNGUNO GANÓ";
            //EMPATE, NUNGUNO GANÓ
        }
    }
    
    public void llenarcartas(){
        carta[0]=new Cartas(5,4,5,"Ele Campeao do Nexus Saraad","campeon.png");
        carta[1]=new Cartas(6,4,7,"Ele Capitao Celeste Kragg","capitan.png");
        carta[2]=new Cartas(6,2,4,"O Dama do lago","dama.png");
        carta[3]=new Cartas(2,1,1,"Ele Escudeiro Humilde","escudero.png");
        carta[4]=new Cartas(4,3,3,"O Eydis Trevatroz","eydis.png");
        carta[5]=new Cartas(4,3,3,"O Fiola Ruinaluz","fiola.png");
        carta[6]=new Cartas(5,2,3,"Ele Gerente do Coliseu","gerente.png");
        carta[7]=new Cartas(3,1,4,"O Lamina Envenenada","lamina.png");
        carta[8]=new Cartas(2,3,3,"Ele Mestre de Cerimonias","maestro.png");
        carta[9]=new Cartas(3,3,3,"Ele Regente do Punho de Prata","regente.png");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_de_fondo = new javax.swing.JPanel();
        JPanelPrincipal = new javax.swing.JPanel();
        Imagen_Jugador = new javax.swing.JLabel();
        Nombre_Jugador = new javax.swing.JLabel();
        Score_Jugador = new javax.swing.JLabel();
        Panel_Secundaria = new javax.swing.JPanel();
        Panel_de_Acciones = new javax.swing.JPanel();
        JTxt_round = new javax.swing.JTextField();
        jRonda = new javax.swing.JLabel();
        JName = new javax.swing.JLabel();
        JTxt_name = new javax.swing.JTextField();
        Inicio = new javax.swing.JButton();
        area = new javax.swing.JPanel();
        jTextArea = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        JPanelPrincipal_enemiga = new javax.swing.JPanel();
        Imagen_Enemiga = new javax.swing.JLabel();
        Nombre_Enemiga = new javax.swing.JLabel();
        Score_Enemiga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HearthStone");
        setResizable(false);

        Panel_de_fondo.setBackground(new java.awt.Color(255, 255, 255));

        JPanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        Imagen_Jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/SN.png"))); // NOI18N

        Nombre_Jugador.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        Nombre_Jugador.setForeground(new java.awt.Color(255, 255, 255));
        Nombre_Jugador.setText("Tu carta");

        Score_Jugador.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Score_Jugador.setForeground(new java.awt.Color(255, 255, 255));
        Score_Jugador.setText("Score: 0");

        javax.swing.GroupLayout JPanelPrincipalLayout = new javax.swing.GroupLayout(JPanelPrincipal);
        JPanelPrincipal.setLayout(JPanelPrincipalLayout);
        JPanelPrincipalLayout.setHorizontalGroup(
            JPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nombre_Jugador)
                .addGap(110, 110, 110))
            .addGroup(JPanelPrincipalLayout.createSequentialGroup()
                .addGroup(JPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelPrincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Imagen_Jugador))
                    .addGroup(JPanelPrincipalLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Score_Jugador)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        JPanelPrincipalLayout.setVerticalGroup(
            JPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Nombre_Jugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imagen_Jugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Score_Jugador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_Secundaria.setBackground(new java.awt.Color(204, 204, 204));

        Panel_de_Acciones.setBackground(new java.awt.Color(255, 255, 255));

        JTxt_round.setEditable(false);
        JTxt_round.setText("0");
        JTxt_round.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxt_roundKeyTyped(evt);
            }
        });

        jRonda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jRonda.setText("Ronda:");
        jRonda.setToolTipText("");

        JName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JName.setText("Nombre del jugador:");
        JName.setToolTipText("");

        JTxt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTxt_nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxt_nameKeyTyped(evt);
            }
        });

        Inicio.setText("Tirar una carta");
        Inicio.setEnabled(false);
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_de_AccionesLayout = new javax.swing.GroupLayout(Panel_de_Acciones);
        Panel_de_Acciones.setLayout(Panel_de_AccionesLayout);
        Panel_de_AccionesLayout.setHorizontalGroup(
            Panel_de_AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_de_AccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_de_AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_de_AccionesLayout.createSequentialGroup()
                        .addComponent(jRonda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxt_round, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_de_AccionesLayout.createSequentialGroup()
                        .addComponent(JName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_de_AccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        Panel_de_AccionesLayout.setVerticalGroup(
            Panel_de_AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_de_AccionesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Panel_de_AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxt_round, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRonda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_AccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JName))
                .addGap(18, 18, 18)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_SecundariaLayout = new javax.swing.GroupLayout(Panel_Secundaria);
        Panel_Secundaria.setLayout(Panel_SecundariaLayout);
        Panel_SecundariaLayout.setHorizontalGroup(
            Panel_SecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SecundariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_de_Acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_SecundariaLayout.setVerticalGroup(
            Panel_SecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SecundariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_de_Acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        area.setBackground(new java.awt.Color(204, 204, 204));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jTextArea.setViewportView(textArea);

        javax.swing.GroupLayout areaLayout = new javax.swing.GroupLayout(area);
        area.setLayout(areaLayout);
        areaLayout.setHorizontalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );
        areaLayout.setVerticalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea)
                .addContainerGap())
        );

        JPanelPrincipal_enemiga.setBackground(new java.awt.Color(0, 0, 0));

        Imagen_Enemiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/SN.png"))); // NOI18N

        Nombre_Enemiga.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        Nombre_Enemiga.setForeground(new java.awt.Color(255, 255, 255));
        Nombre_Enemiga.setText("Carta enemiga");

        Score_Enemiga.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        Score_Enemiga.setForeground(new java.awt.Color(255, 255, 255));
        Score_Enemiga.setText("Score: 0");

        javax.swing.GroupLayout JPanelPrincipal_enemigaLayout = new javax.swing.GroupLayout(JPanelPrincipal_enemiga);
        JPanelPrincipal_enemiga.setLayout(JPanelPrincipal_enemigaLayout);
        JPanelPrincipal_enemigaLayout.setHorizontalGroup(
            JPanelPrincipal_enemigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPrincipal_enemigaLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Nombre_Enemiga)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelPrincipal_enemigaLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(JPanelPrincipal_enemigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelPrincipal_enemigaLayout.createSequentialGroup()
                        .addComponent(Imagen_Enemiga)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelPrincipal_enemigaLayout.createSequentialGroup()
                        .addComponent(Score_Enemiga)
                        .addGap(116, 116, 116))))
        );
        JPanelPrincipal_enemigaLayout.setVerticalGroup(
            JPanelPrincipal_enemigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPrincipal_enemigaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Nombre_Enemiga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imagen_Enemiga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Score_Enemiga)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_de_fondoLayout = new javax.swing.GroupLayout(Panel_de_fondo);
        Panel_de_fondo.setLayout(Panel_de_fondoLayout);
        Panel_de_fondoLayout.setHorizontalGroup(
            Panel_de_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_de_fondoLayout.createSequentialGroup()
                .addGroup(Panel_de_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_de_fondoLayout.createSequentialGroup()
                        .addComponent(area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(Panel_de_fondoLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(Panel_Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(JPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelPrincipal_enemiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel_de_fondoLayout.setVerticalGroup(
            Panel_de_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_de_fondoLayout.createSequentialGroup()
                .addComponent(area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(JPanelPrincipal_enemiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_de_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_de_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
       n=JTxt_name.getText();
       c="⁅"+n+"⁆"+" Tu carta es: ";
       //System.out.println(n);
       //System.out.println(carta[0]);
       num();
        /*
        Mostrando un numero random
       */
       numberPlay = (int)(rnd.nextDouble()*10);//(J1)El numero 10 es la cantidad de cartas almacenadas en el arreglo
       numberPlay1 = (int)(rnd.nextDouble()*10);//(J2)El numero 10 es la cantidad de cartas almacenadas en el arreglo
            //System.out.println(numberPlay);

       /*
        Mostrando los valores del arreglo en el JTextArea (textArea)
       */
       llenarcartas();
       resultado_consola();
            //System.out.println(carta[numberPlay].toString());
       String cadena = textArea.getText()+c+carta[numberPlay].toString();
       textArea.setText(cadena);//J1
       String cadena1 = textArea.getText()+"\n"+ce+carta[numberPlay1].toString()+"\n"+r+"\n\n";
       textArea.setText(cadena1);//J2
            //System.out.println(cadena);
        
       /*
        Motrando la imagen el el JLabel (ppt)
       */
       String rutaImagen = "src/cartas/"+carta[numberPlay].getImagen();
       ImageIcon imgc = new ImageIcon(rutaImagen);
       Icon icono = new ImageIcon(imgc.getImage());
       Imagen_Jugador.setIcon(icono);
       String rutaImagen2 = "src/cartas/"+carta[numberPlay1].getImagen();
       ImageIcon imgc1 = new ImageIcon(rutaImagen2);
       Icon icono1 = new ImageIcon(imgc1.getImage());
       Imagen_Enemiga.setIcon(icono1);
       resultado_pantalla();
    }//GEN-LAST:event_InicioMouseClicked

    private void JTxt_roundKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxt_roundKeyTyped
        char ValidarChar = evt.getKeyChar();
        if(Character.isLetter(ValidarChar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros...");
        }
    }//GEN-LAST:event_JTxt_roundKeyTyped

    private void JTxt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxt_nameKeyTyped
        char ValidarChar = evt.getKeyChar();
        if(Character.isDigit(ValidarChar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras...");
        }
    }//GEN-LAST:event_JTxt_nameKeyTyped

    private void JTxt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxt_nameKeyReleased
        if (JTxt_name.getText().length()!=0){
            si_no=true;
            Inicio.setEnabled(si_no);
        }else{
            si_no=false;
            Inicio.setEnabled(si_no);
        }
    }//GEN-LAST:event_JTxt_nameKeyReleased

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen_Enemiga;
    private javax.swing.JLabel Imagen_Jugador;
    private javax.swing.JButton Inicio;
    private javax.swing.JLabel JName;
    private javax.swing.JPanel JPanelPrincipal;
    private javax.swing.JPanel JPanelPrincipal_enemiga;
    private javax.swing.JTextField JTxt_name;
    private javax.swing.JTextField JTxt_round;
    private javax.swing.JLabel Nombre_Enemiga;
    private javax.swing.JLabel Nombre_Jugador;
    private javax.swing.JPanel Panel_Secundaria;
    private javax.swing.JPanel Panel_de_Acciones;
    private javax.swing.JPanel Panel_de_fondo;
    private javax.swing.JLabel Score_Enemiga;
    private javax.swing.JLabel Score_Jugador;
    private javax.swing.JPanel area;
    private javax.swing.JLabel jRonda;
    private javax.swing.JScrollPane jTextArea;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}

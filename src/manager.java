
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Toshiba
 */
public class manager extends javax.swing.JFrame {

    error err;
    boolean compilar = false;
    boolean insertar = false;
    /**
     * Creates new form Main
     */
    public manager() {
        initComponents();
//        Image icon = new ImageIcon(getClass().getResource("icon30px.png")).getImage();
//        setIconImage(icon);
        err = new error();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        comp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        link = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(253, 250, 250));

        jPanel2.setBackground(new java.awt.Color(164, 30, 30));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });

        comp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comp.setForeground(new java.awt.Color(216, 216, 216));
        comp.setText("Compilar");
        comp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("—");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(252, 250, 250));

        area.setBackground(new java.awt.Color(248, 248, 248));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        link.setBackground(new java.awt.Color(164, 30, 30));
        link.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        link.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(216, 216, 216));
        jLabel1.setText("Abrir");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comp)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(link)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comp)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed
    String path = "";
    
    private void compMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compMouseClicked
        // TODO add your handling code here:
        if(link.getText().equals("")){
       String nombre = JOptionPane.showInputDialog("Nombre del proyecto");
        path = "Proyectos\\" + nombre;
        if(nombre!=null && !nombre.equals("")){
        File archivo = new File(path);

//        link.setText(path);
        if (archivo.mkdirs()) {
            try {
                //guarda clase
                PrintWriter pw = new PrintWriter("archivo.txt");
                PrintWriter pw2 = new PrintWriter("Proyectos\\"+nombre+"\\archivo.txt");
                Scanner ss = new Scanner(area.getText());
                while (ss.hasNext()) {
                    String line = ss.nextLine();
                    pw.println(line);
                    pw2.println(line);
                }
                pw.close(); pw2.close();
                obten();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se pudo crear directorio");
        }}else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese un nombre ");
        }
        }else{
            try {
                //guarda clase
                PrintWriter pw = new PrintWriter("archivo.txt");
                PrintWriter pw2 = new PrintWriter(path+"\\archivo.txt");
                Scanner ss = new Scanner(area.getText());
                while (ss.hasNext()) {
                    String line = ss.nextLine();
                    pw.println(line);
                    pw2.println(line);
                   
                }
                pw.close(); pw2.close();
                obten();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_compMouseClicked
ArbolB a = new ArbolB();   ArbolBindex []indices; int cant = 0;
String folder = "";
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        FileDialog fd = new FileDialog(this, "Abrir proyecto");
                fd.setVisible(true); 
                String aux = fd.getFile();
                if(aux.equals("archivo.txt")){
                    link.setText(fd.getDirectory()+aux);
                    path = fd.getDirectory();
                    
                    try {
                        FileReader fr = new FileReader(fd.getDirectory()+aux);
                        Scanner sc = new Scanner(fr);
                        area.setText("");
                        while(sc.hasNext()){
                            area.setText(area.getText()+sc.nextLine()+"\n");
                        }
                        
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex);
                    }
                }else{
                    err.setmsg("Se esperaba [archivo.txt]");
                    err.setVisible(true);
                }
//                System.out.println(fd.getDirectory());
                
    }//GEN-LAST:event_jLabel1MouseClicked
    static void getdatos(LinkedList q1, LinkedList q2, LinkedList q3) throws FileNotFoundException {
        FileReader fr = new FileReader("nombre.txt");
        Scanner sc = new Scanner(fr);
        while (sc.hasNext()) {
            String a = sc.next();
            if (!a.contains("(3)") && !a.contains("�")) {
                q1.add(a);
            }
        }
        fr = new FileReader("matricula.txt");
        sc = new Scanner(fr);
        while (sc.hasNext()) {
            String a = sc.next();
            q2.add(a);
        }
        fr = new FileReader("boolean.txt");
        sc = new Scanner(fr);
        while (sc.hasNext()) {
            String a = sc.next();
            q3.add(a);
        }
    }
    
    int x, y;
    
    
    LinkedList<String> obten() throws FileNotFoundException {
        FileReader fr = new FileReader("archivo.txt");
        Scanner sc = new Scanner(fr);
        LinkedList<tokens> list = new LinkedList<tokens>();
        int fila = 0;

        while (sc.hasNext()) {
            fila++;
            String cad = sc.nextLine();
            tokens tok = new tokens();
            for (int i = 0; i < cad.length(); i++) {
                if (cad.charAt(i) == ' ') {
                    if (tok.token.equals("")) {
                        continue;
                    } else {
                        tok.fila = fila;
                        tok.x = tok.y - tok.token.length() + 1;
                        list.add(tok);
                        tok = new tokens();
                        continue;
                    }
                }
                tok.y = i;
                tok.token += cad.charAt(i);
//                  System.out.println(">>"+tok.token);
            }

            if (!tok.token.equals("")) {
                tok.fila = fila;
                tok.x = tok.y - tok.token.length() + 1;
                list.add(tok);
            }
        }

        String arr[] = {"Create", "Table"};
        String datos = "Text Numeric Bool";
        int apunt = 0;
        String nombretab = "";
        String tabname = "";
        boolean llavei = false;
        boolean nomtab = false;
        boolean var = false;
        boolean nomvar = false;
        boolean puntoycoma = false;
        boolean llavefin = false;
        boolean tipo = false;
        LinkedList<String> variables = new LinkedList<String>();
        LinkedList<String> tipos = new LinkedList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (apunt < 2) {
                if (arr[apunt] != null && list.get(i).token.equals(arr[apunt])) {
//                        System.out.println("vammos bien");
//                        System.out.println(arr[apunt]+" -- "+list.get(i).token);
                    apunt++;
                } else {
                    err.setmsg("No se creo " + arr[apunt]);
                    err.setVisible(true);
                    compilar = false;
                    return null;
                }
            } else {
                   //nomretab {
                //!((int) cad.charAt(j) <= 122 && (int) cad.charAt(j) >= 65)
                for (int j = 0; j < list.get(i).token.length(); j++) {

                    if (((int) list.get(i).token.charAt(j) <= 122 && (int) list.get(i).token.charAt(j) >= 65)) {
                        nombretab += list.get(i).token.charAt(j);

                    } else {
//                                System.out.println(list.get(i).token.charAt(j)+"<<");
                        //aqui salen las variables

                        if (!nombretab.equals("")) {
                            if (llavei == false) {
                                System.out.println("terminooo > " + nombretab);
                                tabname = nombretab;
                                nombretab = "";
                            } else {
                                if (nombretab.equals("Text") || nombretab.equals("Number") || nombretab.equals("Bool")) {
                                    System.out.println("tipo > " + nombretab);
                                    tipos.add(nombretab);
                                    nombretab = "";
                                    tipo = true;
                                    puntoycoma = false;
                                } else {
                                    if (tipo) {
                                        if (nombretab.equals("")) {
                                            err.setmsg("variable vacia");
                                            err.setVisible(true);compilar = false;
                                            return null;
                                        } else {
                                            if(variables.contains(nombretab)){
                                                err.setmsg("Variable ya existe");
                                                err.setVisible(true);compilar = false;
                                                return null;
                                            }else{
                                                variables.add(nombretab);
                                                nombretab = "";
                                                puntoycoma = false;
                                                tipo = false;
                                            }
                                            
                                        }

                                        nomvar = true;
                                        nombretab = "";
                                    } else {
                                        err.setmsg("falto tipo de variable");
                                        err.setVisible(true);compilar = false;
                                        return null;

                                    }
                                }
                            }

                        } else {
                            if (nomvar == false && puntoycoma == false) {
                                err.setmsg("se esperaba nombre de variable");
                                err.setVisible(true);compilar = false;
                                return null;
                            }
                        }
                        //^^^^^^^^^^
                        if (llavei == false) {
                            if (list.get(i).token.charAt(j) == '{') {
//                                    System.out.println("vamoss bien");
                                llavei = true;
                            } else {
                                err.setmsg("caracter invalido esperaba llave");
                                err.setVisible(true);compilar = false;
                                return null;

                            }
                        } else {
                            if (list.get(i).token.charAt(j) == ';') {
//                                            System.out.println("vamos bien");
                                puntoycoma = true;
                            } else {
                                System.out.println("pas");
                                if (list.get(i).token.charAt(j) == '}' && puntoycoma) {
                                    System.out.println("ya acabo");
                                    llavefin = true;

                                } else {
                                    if (llavei) {
                                        err.setmsg("se esperaba variables con punto y coma");
                                        err.setVisible(true);compilar = false;
                                        return null;
                                    }

                                }

                            }
                        }
                    }

                }
                if (!nombretab.equals("")) {
                    //se ingreso variable
                    if (llavei && (nombretab.equals("Text") || nombretab.equals("Number") || nombretab.equals("Bool"))) {
                        System.out.println("segundo termino >" + nombretab);
                        tipos.add(nombretab);
                        nombretab = "";
                        tipo = true;
                        puntoycoma = false;
                    } else {
                        if (llavei == false) {
                            System.out.println("nombretab " + nombretab);
                        } else {
                            if (tipo) {
                                if (nombretab.equals("")) {
                                    System.out.println("variable vacia");
                                    err.setmsg("variable vacia");
                                    err.setVisible(true);compilar = false;
                                    return null;
                                } else {
                                    if(variables.contains(nombretab)){
                                                err.setmsg("Variable ya existe");
                                                err.setVisible(true);compilar = false;
                                                return null;
                                            }else{
                                                variables.add(nombretab);
                                                nombretab = "";
                                                nomvar = true;
                                                nombretab = "";
                                                tipo = false;
                                            }
                                    
                                }
                            } else {
                                err.setmsg("falto tipo de variable");
                                err.setVisible(true);compilar = false;
                                return null;
                            }
                        }

                    }
                }
            }
        }
        if (variables.size() < 1) {
            System.out.println("no variables");
            err.setmsg("no variables");
            err.setVisible(true);compilar = false;
            return null;
        }
        for (int k = 0; k < variables.size(); k++) {
            System.out.println("[" + variables.get(k) + "]");
        }
        if (llavefin == false) {
            err.setmsg("no finalizo llave");err.setVisible(true);compilar = false; return null;
        } else {
            try{
                sc.close();fr.close();
            }catch(Exception e){
                System.out.println("");
            }
            genera(tabname, tipos, variables);compilar=true;
            return variables;
        }
//        return null;

    }

    void genera(String nombre, LinkedList tipos, LinkedList variables) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(path + "\\" + "persona" + ".java");
        compilar = true;
        err.setmsg( "Compilado correctamente, ejecute manager para trabajar sobre el arbol");
        err.setVisible(true);
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        if(link.getText().equals("")){
            link.setText(dir + "\\" + path + "\\" + "persona" + ".java");
        }
        pw.println("public class " + "persona" + " {");
        pw.println("    String aux=\"" + nombre + "\";");
        String n ="";
        for (int i = 0; i < path.length(); i++) {
            if(path.charAt(i)=='\\'){
                n+=" ";
            }else{
                n+=path.charAt(i);
            }
        }System.out.println(">>"+n);
        pw.println("    String path =\" "+n+"\";");
        pw.println("    int apunt=0;");
        String cad = "    String tipos[]={";
        for (int i = 0; i < variables.size(); i++) {
            String tipo = "";
            if (tipos.get(i).equals("Text")) {
                tipo = "String";
            } else if (tipos.get(i).equals("Number")) {
                tipo = "int";
            } else if (tipos.get(i).equals("Bool")) {
                tipo = "boolean";
            }
            pw.println("    " + tipo + " " + variables.get(i).toString() + ";");
            cad += "\"" + tipos.get(i).toString() + "\"";
            if (i < variables.size() - 1) {
                cad += ", ";
            }
        }
        cad += "};";
        pw.println(cad);
        pw.println("Object datos[] = new Object[tipos.length];");
        pw.println("persona (){");
        for (int i = 0; i < variables.size(); i++) {
            pw.print(variables.get(i) + " = ");
            if (tipos.get(i).equals("Text")) {
                pw.print("\"\";");
            } else if (tipos.get(i).equals("Number")) {
                pw.print("0;");
            } else if (tipos.get(i).equals("Bool")) {
                pw.print("false;");
            }
        }
//           pw.println("datos = new Object[tipos.length];");
        pw.println("}");
        pw.println("void insertar(){");
        for (int i = 0; i < variables.size(); i++) {
            if (tipos.get(i).equals("Text")) {
                pw.println(variables.get(i) + " = " + "datos[" + i + "].toString();");
            } else {
                if (tipos.get(i).equals("Number")) {
                    pw.println(variables.get(i) + " = " + "Integer.parseInt(datos[" + i + "].toString());");
                } else {
                    if (tipos.get(i).equals("Bool")) {
                        pw.println(variables.get(i) + " = " + "Boolean.parseBoolean(datos[" + i + "].toString());");
                    }
                }
            }
        }
        pw.println("}");
        pw.println("void ver(){");
        pw.print("System.out.println(");
        for (int i = 0; i < variables.size() - 1; i++) {
            pw.print(variables.get(i) + " + \" - \" + ");
        }
        pw.println(variables.get(variables.size() - 1) + ");");
        pw.println("}");
        pw.print("String ver2(){\n   return ");
        for (int i = 0; i < variables.size()-1; i++) {
            pw.print(variables.get(i)+ "+ \" - \" + ");
        }
        pw.print(variables.get(variables.size()-1)+";");
        pw.print("}");
        pw.println("}");
        pw.close();

        PrintWriter pw2 = new PrintWriter("src/persona.java");
        FileReader fr = new FileReader(path + "\\" + "persona" + ".java");
        Scanner sc = new Scanner(fr);
        while (sc.hasNext()) {
            pw2.println(sc.nextLine());
        }
        try {
            pw2.close();
            sc.close();fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        //vamos a actualizar la clase persona
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JLabel comp;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField link;
    // End of variables declaration//GEN-END:variables
}

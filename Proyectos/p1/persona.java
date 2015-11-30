public class persona {
    String aux="tab";
    int apunt=0;
    String apellido;
    String dir;
    int edad;
    int tel;
    String tipos[]={"Text", "Text", "Number", "Number"};
Object datos[] = new Object[tipos.length];
persona (){
apellido = "";dir = "";edad = 0;tel = 0;}
void insertar(){
apellido = datos[0].toString();
dir = datos[1].toString();
edad = Integer.parseInt(datos[2].toString());
tel = Integer.parseInt(datos[3].toString());
}
void ver(){
System.out.println(apellido + " - " + dir + " - " + edad + " - " + tel);
}
String ver2(){
   return apellido+ " - " + dir+ " - " + edad+ " - " + tel;}}

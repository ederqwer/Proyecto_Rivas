public class persona {
    String aux="tab";
    int apunt=0;
    String nombre;
    String direccion;
    int telefono;
    int edad;
    boolean status;
    String tipos[]={"Text", "Text", "Number", "Number", "Bool"};
Object datos[] = new Object[tipos.length];
persona (){
nombre = "";direccion = "";telefono = 0;edad = 0;status = false;}
void insertar(){
nombre = datos[0].toString();
direccion = datos[1].toString();
telefono = Integer.parseInt(datos[2].toString());
edad = Integer.parseInt(datos[3].toString());
status = Boolean.parseBoolean(datos[4].toString());
}
void ver(){
System.out.println(nombre + " - " + direccion + " - " + telefono + " - " + edad + " - " + status);
}
String ver2(){
   return nombre+ " - " + direccion+ " - " + telefono+ " - " + edad+ " - " + status;}}

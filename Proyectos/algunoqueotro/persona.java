public class persona {
    String aux="tab";
    String path =" E: Proyecto_Rivas Proyectos algunoqueotro ";
    int apunt=0;
    String nombre;
    String dir;
    int edad;
    int tel;
    int codigpostal;
    String tipos[]={"Text", "Text", "Number", "Number", "Number"};
Object datos[] = new Object[tipos.length];
persona (){
nombre = "";dir = "";edad = 0;tel = 0;codigpostal = 0;}
void insertar(){
nombre = datos[0].toString();
dir = datos[1].toString();
edad = Integer.parseInt(datos[2].toString());
tel = Integer.parseInt(datos[3].toString());
codigpostal = Integer.parseInt(datos[4].toString());
}
void ver(){
System.out.println(nombre + " - " + dir + " - " + edad + " - " + tel + " - " + codigpostal);
}
String ver2(){
   return nombre+ " - " + dir+ " - " + edad+ " - " + tel+ " - " + codigpostal;}}

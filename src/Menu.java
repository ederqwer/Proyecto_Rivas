
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {

    public static void main(String Args[]) throws FileNotFoundException, InterruptedException {
        Scanner l = new Scanner(System.in);
        LinkedList q1 = new LinkedList();
        LinkedList q2 = new LinkedList();
        LinkedList q3 = new LinkedList();
        LinkedList q4 = new LinkedList();
        getdatos(q1, q2, q3, q4);
        ArbolB a = new ArbolB();
        int op = 0, dat;
        String cadena = "prueba";
        int r = 1;String barra = "█";
        long seed = System.currentTimeMillis();
        long mod = System.nanoTime();
        double aux;
        
        
        System.out.println(" ______         __              ___       ____      \n" +
"/\\  _  \\       /\\ \\            /\\_ \\     /\\  _`\\    \n" +
"\\ \\ \\L\\ \\  _ __\\ \\ \\____    ___\\//\\ \\    \\ \\ \\L\\ \\  \n" +
" \\ \\  __ \\/\\`'__\\ \\ '__`\\  / __`\\\\ \\ \\    \\ \\  _ <' \n" +
"  \\ \\ \\/\\ \\ \\ \\/ \\ \\ \\L\\ \\/\\ \\L\\ \\\\_\\ \\_   \\ \\ \\L\\ \\\n" +
"   \\ \\_\\ \\_\\ \\_\\  \\ \\_,__/\\ \\____//\\____\\   \\ \\____/\n" +
"    \\/_/\\/_/\\/_/   \\/___/  \\/___/ \\/____/    \\/___/ \n");
        do {
            
            System.out.println("Menú");
            System.out.println("1. Insertar");
            System.out.println("2. Inorden");
            System.out.println("3. Buscar dato");
            System.out.println("4. Eliminar");
            System.out.println("5. Modificar");
            System.out.println("6. Salir");
            System.out.println("Elegir una opción");
            op = l.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Cantidad");
                    dat = l.nextInt();
                    
                    for (int i = 1; i <= dat; i++) {
                        seed = (seed * 2) % mod;
                        aux = (double) seed / mod;
                        int x = (int) (aux * 15);
                        seed = (seed * 4) % (mod);
                        aux = (double) seed / (mod);
                        int y = (int) (aux * 900);
                        seed = (seed * 6) % (mod);
                        aux = (double) seed / (mod);
                        int z = (int) (aux * 30);
                        seed = (seed * 2) % (mod);
                        aux = (double) seed / (mod);

                        int aa = (int) (aux * y);
                        String nombre = q1.get(aa + x).toString();
                        String nombre2 = q2.get(aa + 2).toString();
                        String apellido = q2.get(aa + x).toString();
                        String apellido2 = q1.get(aa + 2).toString();
                        String telefono = q3.get(aa + x).toString();
                        String matricula = q4.get(aa + x).toString();

                        persona p = new persona();
//                        p.nombre = nombre;
//                        p.nombre2 = nombre2;
//                        p.apellido = apellido;
//                        p.apellido2 = apellido2;
//                        p.telefono = telefono;
//                        p.matricula = matricula;
                        a.Insertar(i, p, a.raiz, null, 0);
                        
                        
                    }
                    System.out.print("Generando arbol ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(barra);
                        Thread.sleep(300);
                    }
                    System.out.println(" 100%");
                    break;
                case 2:
//                    a.inorden(a.raiz);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ingresar key");
                    dat = l.nextInt();
                    persona dd = null;
                    if ((dd = a.Buscar(a.raiz, dat)) != null) {
                        System.out.println("El dato ha sido encontrado!!");
                        dd.ver();
                    } else {
                        System.err.println("Dato no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Ingresar key");
                    dat = l.nextInt();
                    a.Eliminar(dat, a.raiz, null, 0);
                    System.out.print("Borrando ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(barra);
                        Thread.sleep(300);
                    }
                    System.out.println(" 100%");
                    break;
                case 5:
                    System.out.println("Ingresar key");
                    dat = l.nextInt();
                    persona p = a.Buscar(a.raiz, dat);
                    if (p != null) {
                        p.ver();
                        int opcion = 0;
                        do {
                            System.out.println("    Modifcar:");
                            System.out.println("    1.- Nombre 1 ");
                            System.out.println("    2.- Nombre 2");
                            System.out.println("    3.- Apellido 1");
                            System.out.println("    4.- Apellido 2");
                            System.out.println("    5.- Matricula");
                            System.out.println("    6.- Telefono");
                            System.out.println("    7.- Salir");
                            opcion = l.nextInt();
                            System.out.print("Ingresar: ");
                            switch (opcion) {
                                case 1:
//                                    p.nombre = l.next();
                                    break;
                                case 2:
//                                    p.nombre2 = l.next();
                                    break;
                                case 3:
//                                    p.apellido = l.next();
                                    break;
                                case 4:
//                                    p.apellido2 = l.next();
                                    break;
                                case 5:
//                                    p.matricula = l.next();
                                    break;
                                case 6:
//                                    p.telefono = l.next();
                                    break;
                                case 7:
                                    System.out.println("Saliendo...");
                                    break;
                                default:
                                    System.err.println("Opcion no valida, pruebe otra");
                                    opcion = 1;
                                    break;
                            }
                        } while (opcion > 0 && opcion < 7);
                    } else {
                        System.err.println("Dato no encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(barra);
                        Thread.sleep(300);
                    }
                    System.out.println(" 100% Universidad Autónoma De Tamaulipas");
                    break;
                default:
                    System.err.println("Opción no válida, elegir otra...");
                    op = 1;
            }
        } while (op > 0 && op < 6);
    }

    static void getdatos(LinkedList q1, LinkedList q2, LinkedList q3, LinkedList q4) throws FileNotFoundException {
        FileReader fr = new FileReader("nombre.txt");
        Scanner sc = new Scanner(fr);
        while (sc.hasNext()) {
            String a = sc.next();
            if (!a.contains("(3)") && !a.contains("�")) {
                q1.add(a);
            }
        }
        fr = new FileReader("telefono.txt");
        sc = new Scanner(fr);
        while (sc.hasNext()) {
            String a = sc.next();
            q2.add( a);
        }
        fr = new FileReader("boolean.txt");
        sc = new Scanner(fr);
        while (sc.hasNext()) {
            String a = sc.next();
            q3.add( a);
        }
    }
}

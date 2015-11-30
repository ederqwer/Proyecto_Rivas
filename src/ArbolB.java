
import java.io.PrintWriter;
import javax.swing.JTextArea;


public class ArbolB {

    Nodo raiz;
    int gm;
    int nivel = 0;

    ArbolB() {
        raiz = null;
        gm = 3;
    }

    ArbolB(int gm) {
        raiz = null;
        this.gm = gm;
    }

    public void Insertar(int key, persona reg, Nodo Arbol, Nodo padre, int index) {
        if (raiz == null) {
            raiz = new Nodo(gm);
            raiz.Agregar(key, reg);
        } else if (Arbol.hoja) {

            Arbol.Agregar(key, reg);
            if (Arbol.lleno) {
                Partir(Arbol, padre, index);
            }

        } else {
            boolean ban = true;
            int i = 0;
            while (ban && i <= Arbol.cont) {
                if (key <= Arbol.keys[i].key) {
                    Insertar(key,reg, Arbol.hijos[i], Arbol, i);
                    if (Arbol.lleno) {
                        Partir(Arbol, padre, index);
                    }
                    ban = false;
                } else if (i == Arbol.cont) {
                    Insertar(key,reg, Arbol.hijos[i + 1], Arbol, (i + 1));
                    if (Arbol.lleno) {
                        Partir(Arbol, padre, index);
                    }
                    ban = false;
                } else {
                    i++;
                }
            }
        }

    }

    public void Partir(Nodo Arbol, Nodo padre, int index) {
        if (padre == null) {
            Nodo aux = new Nodo(gm);
            aux.Agregar(Arbol.keys[(Arbol.cont) / 2].key,Arbol.keys[(Arbol.cont) / 2].info);
            aux.hoja = false;
            aux.hijos[0] = new Nodo(gm);
            aux.hijos[1] = new Nodo(gm);
            for (int i = 0; i < Arbol.cont / 2; i++) {
                aux.hijos[0].Agregar(Arbol.keys[i].key,Arbol.keys[i].info);
                aux.hijos[0].hijos[i] = Arbol.hijos[i];
                aux.hijos[1].Agregar(Arbol.keys[Arbol.cont / 2 + i + 1].key,Arbol.keys[Arbol.cont / 2 + i + 1].info);
                aux.hijos[1].hijos[i] = Arbol.hijos[Arbol.cont / 2 + i + 1];
                if (i == Arbol.cont / 2 - 1) {
                    aux.hijos[0].hijos[i + 1] = Arbol.hijos[i + 1];
                    aux.hijos[1].hijos[i + 1] = Arbol.hijos[Arbol.cont / 2 + i + 2];
                    if (Arbol.par) {
                        aux.hijos[1].Agregar(Arbol.keys[Arbol.cont / 2 + i + 2].key,Arbol.keys[Arbol.cont / 2 + i + 2].info);
                        aux.hijos[1].hijos[i + 2] = Arbol.hijos[Arbol.cont / 2 + i + 3];
                    }
                }
                if (aux.hijos[0].hijos[i] != null || aux.hijos[1].hijos[i] != null) {
                    aux.hijos[0].hoja = false;
                    aux.hijos[1].hoja = false;
                }
            }
            raiz = aux;
        } else {
            for (int i = padre.cont; i >= index; i--) {
                padre.keys[i + 1] = padre.keys[i];
                padre.hijos[i + 2] = padre.hijos[i + 1];
            }
            Nodo aux = Arbol;
            padre.keys[index] = aux.keys[(aux.cont) / 2];
            padre.cont++;
            if (padre.cont == padre.gm - 1) {
                padre.lleno = true;
            }
            padre.hijos[index] = new Nodo(gm);
            padre.hijos[index + 1] = new Nodo(gm);
            for (int i = 0; i < aux.cont / 2; i++) {
                padre.hijos[index].Agregar(aux.keys[i].key,aux.keys[i].info);
                padre.hijos[index].hijos[i] = aux.hijos[i];
                padre.hijos[index + 1].Agregar(aux.keys[aux.cont / 2 + i + 1].key, aux.keys[aux.cont / 2 + i + 1].info);
                padre.hijos[index + 1].hijos[i] = aux.hijos[aux.cont / 2 + i + 1];
                if (i == aux.cont / 2 - 1) {
                    padre.hijos[index].hijos[i + 1] = aux.hijos[i + 1];
                    padre.hijos[index + 1].hijos[i + 1] = aux.hijos[aux.cont / 2 + i + 2];
                    if (aux.par) {
                        padre.hijos[index + 1].Agregar(aux.keys[aux.cont / 2 + i + 2].key,aux.keys[aux.cont / 2 + i + 2].info);
                        padre.hijos[index + 1].hijos[i + 2] = aux.hijos[aux.cont / 2 + i + 3];
                    }
                }
                if (padre.hijos[index].hijos[i] != null || padre.hijos[index + 1].hijos[i] != null) {
                    padre.hijos[index].hoja = false;
                    padre.hijos[index + 1].hoja = false;
                }
            }
        }
    }

    public void Eliminar(int key, Nodo Arbol, Nodo padre, int index) {
        boolean ban = true;
        int i = 0;
        while (ban && i <= Arbol.cont) {
            if (key == Arbol.keys[i].key) {
                if (Arbol.hoja) {
                    Arbol.Quitar(key);
                    if (padre != null && Arbol.min > Arbol.cont + 1) {
                        reacomodo(Arbol, padre, index);
                    }
                } else {
                    Subir(Arbol.hijos[i], Arbol, i, Arbol, i);
                    if (Arbol.min > Arbol.cont + 1) {
                        reacomodo(Arbol, padre, index);
                    }
                }

                ban = false;
            } else if (key < Arbol.keys[i].key) {
                Eliminar(key, Arbol.hijos[i], Arbol, i);
                if (Arbol.min > Arbol.cont + 1) {
                    reacomodo(Arbol, padre, index);
                }
                ban = false;
            } else if (i == Arbol.cont) {
                Eliminar(key, Arbol.hijos[i + 1], Arbol, i + 1);
                if (Arbol.min > Arbol.cont + 1) {
                    reacomodo(Arbol, padre, index);
                }
                ban = false;
            } else {
                i++;
            }
        }
    }

   public void reacomodo(Nodo incompleto, Nodo padre, int index) {
        if (incompleto.cont == -1 && padre == null) {
            raiz = incompleto.hijos[0];

        } else {
            if (prestamoizq(padre, index)) {
                Rotacionder(padre, index);
            } else if (prestamoder(padre, index)) {
                Rotacionizq(padre, index);
            } else {
                if (index > 0 && padre != null) {
                    int mm = padre.keys[index - 1].key;
                    persona nn = padre.keys[index - 1].info;
                    padre.hijos[index - 1].Agregar(mm,nn, incompleto.hijos[0]);
                    int i = 0;
                    while (i <= incompleto.cont) {
                        int ss = incompleto.keys[i].key;
                        persona zz = incompleto.keys[i].info;
                        padre.hijos[index - 1].Agregar(ss,zz, incompleto.hijos[i + 1]);
                        i++;
                    }
                    padre.Recorrer2(padre.keys[index - 1].key);
                } else if (padre != null) {
                    int algo = padre.keys[index].key;
                    persona s = padre.keys[index].info;
                    padre.hijos[index + 1].Agregar(algo,s, incompleto.hijos[incompleto.cont+1]);
                    int i = incompleto.cont;
                    while (i >= 0) {
                        int su = incompleto.keys[i].key;
                        persona ta = incompleto.keys[i].info;
                        padre.hijos[index + 1].Agregar(su,ta, incompleto.hijos[i]);
                        i--;
                    }
                    padre.Recorrer(padre.keys[index].key);
                }
            }
        }
    }

    public boolean prestamoizq(Nodo padre, int index) {
        boolean ban = false;
        if (padre == null) {
            return ban;
        }
        if (index > 0) {
            if (padre.hijos[index - 1].cont + 1 > padre.hijos[index - 1].min) {
                ban = true;
            }
        }
        return ban;
    }

    public boolean prestamoder(Nodo padre, int index) {
        boolean ban = false;
        if (padre == null) {
            return ban;
        }
        if (index <= padre.cont) {
            if (padre.hijos[index + 1].cont + 1 > padre.hijos[index + 1].min) {
                ban = true;
            }
        }
        return ban;
    }

    public void Rotacionder(Nodo padre, int index) {
        registro aux = padre.hijos[index - 1].keys[padre.hijos[index - 1].cont];
        Nodo naux = padre.hijos[index - 1].hijos[padre.hijos[index - 1].cont + 1];
        padre.hijos[index - 1].cont--;
        padre.hijos[index].empujar(padre.keys[index - 1], naux);
        padre.keys[index - 1] = aux;
    }

    public void Rotacionizq(Nodo padre, int index) {
        registro aux = padre.hijos[index + 1].keys[0];
        Nodo naux = padre.hijos[index + 1].hijos[0];
        padre.hijos[index + 1].Recorrer(aux.key);
        padre.hijos[index].Agregar(padre.keys[index].key,padre.keys[index].info, naux);
        padre.keys[index] = aux;
    }

    public void Subir(Nodo Arbol, Nodo padre, int index, Nodo naux, int aux) {
        if (Arbol.hijos[Arbol.cont + 1] != null) {
            Subir(Arbol.hijos[Arbol.cont + 1], Arbol, Arbol.cont + 1, naux, aux);

        } else {
            naux.keys[aux].key= Arbol.keys[Arbol.cont].key;
            naux.keys[aux].info= Arbol.keys[Arbol.cont].info;
            Arbol.cont--;

        }
        if (Arbol.min > Arbol.cont + 1) {
            reacomodo(Arbol, padre, index);
        }
    }

    public persona Buscar(Nodo Arbol, int key) {
        persona encontrado = null;
        if (Arbol != null) {
            int i = 0;
            while (encontrado == null && i <= Arbol.cont) {
                if (key == Arbol.keys[i].key) {
                    encontrado = Arbol.keys[i].info;
                } else if (key < Arbol.keys[i].key) {
                    encontrado = Buscar(Arbol.hijos[i], key);
                } else if (i == Arbol.cont) {
                    encontrado = Buscar(Arbol.hijos[i + 1], key);
                }
                i++;
            }
        }
        return encontrado;
    }
    
    
    boolean modificar(int key, persona p){
        persona aux=Buscar(raiz, key);   
        if(aux!=null){
            for (int i = 0; i < aux.datos.length; i++) {
                aux.datos[i] = p.datos[i];
            }
            aux.insertar();
            
            return true;
        }return false;
    }
    public void inorden(Nodo Arbol, JTextArea m) {
        if (Arbol != null) {
            for (int i = 0; i <= Arbol.cont; i++) {
                nivel++;
                inorden(Arbol.hijos[i],m);
                nivel--;
                m.setText(m.getText()+"Nivel-"+nivel + "-[" + Arbol.keys[i].key + "] - "+Arbol.keys[i].info.ver2()+"\n");
                System.out.print("Nivel-"+nivel + "-[" + Arbol.keys[i].key + "] - ");Arbol.keys[i].info.ver();
                if (i == Arbol.cont) {
                    nivel++;
                    inorden(Arbol.hijos[i + 1],m);
                    nivel--;
                }
            }
        }
    }
    
    public void inorden(Nodo Arbol, PrintWriter m) {
        if (Arbol != null) {
            for (int i = 0; i <= Arbol.cont; i++) {
                nivel++;
                inorden(Arbol.hijos[i],m);
                nivel--;
                m.println(Arbol.keys[i].key + " - "+Arbol.keys[i].info.ver2());
//                System.out.print("Nivel-"+nivel + "-[" + Arbol.keys[i].key + "] - ");Arbol.keys[i].info.ver();
                if (i == Arbol.cont) {
                    nivel++;
                    inorden(Arbol.hijos[i + 1],m);
                    nivel--;
                }
            }
        }
    }
}

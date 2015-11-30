
public class Nodo {

    registro keys[];
    Nodo hijos[];
    int cont;
    int gm;
    int min;
    boolean hoja;
    boolean lleno;
    boolean par;

    Nodo(int gm) {
        this.gm = gm;
        keys = new registro[gm];
        for (int i = 0; i < gm; i++) {
            keys[i] = new registro();
        }
        hijos = new Nodo[gm + 1];
        cont = -1;
        hoja = true;
        lleno = false;
        for (int i = 0; i <= gm; i++) {
            hijos[i] = null;
        }
        if (gm % 2 == 0) {
            par = true;
            min = gm / 2 - 1;
        } else {
            par = false;
            min = gm / 2;
        }
    }

    public void Agregar(Comparable x, persona reg) {
        int i = cont;
        while (i >= 0 && keys[i].key.toString().compareTo(x.toString()) >0 ) {
            keys[i + 1].key = keys[i].key;
            keys[i + 1].info = keys[i].info;
            i--;
        }
        keys[i + 1].key = x;
        keys[i + 1].info = reg;
        cont++;
        if (cont == gm - 1) {
            lleno = true;
        }
    }

    public void Agregar(Comparable x,persona reg, Nodo aux) {
        int i = cont;
        while (i >= 0 && keys[i].key.toString().compareTo(x.toString()) >0) {
            keys[i + 1].key = keys[i].key;
            keys[i + 1].info = keys[i].info;
            hijos[i + 2] = hijos[i + 1];
            if (i == 0) {
                hijos[i + 1] = hijos[i];
            }
            i--;
        }
        keys[i + 1].key = x;
        keys[i + 1].info = reg;
        cont++;
        if (i + 1 == cont) {
            hijos[i + 2] = aux;
        } else {
            hijos[i + 1] = aux;
        }
        if (cont == gm - 1) {
            lleno = true;
        }
    }

    public void empujar(Comparable x,persona reg, Nodo aux) {
        int i = gm - 2;
        while (i >= 0) {
            keys[i + 1].key = keys[i].key;
            keys[i + 1].info = keys[i].info;
            hijos[i + 2] = hijos[i + 1];
            if (i == 0) {
                hijos[i + 1] = hijos[i];
            }
            i--;
        }
        keys[i + 1].key = x;
        keys[i + 1].info = reg;
        cont++;
        hijos[i + 1] = aux;

    }

    public void Quitar(Comparable x) {
        int i = 0;
        boolean ban = false;
        while (i <= cont && ban == false) {
            if ( x.toString().compareTo(keys[i].key.toString()) ==0) {
                ban = true;
                cont--;
            } else {
                i++;
            }
        }
        while (i <= cont) {
            keys[i].key = keys[i+1].key;
            keys[i].info = keys[i+1].info;
            i++;
        }
    }

    public void Recorrer(Comparable x) {
        int i = 0;
        boolean ban = false;
        while (i <= cont && ban == false) {
            System.out.println(keys[i].key+" - "+x);
            if (keys[i].key.toString() .compareTo(x.toString()) ==0) {
                ban = true;
            } else {
                i++;
            }
        }
        while (i <= cont) {
            keys[i + 1].key = keys[i].key;
            keys[i + 1].info = keys[i].info;
            hijos[i] = hijos[i + 1];
            if (i == cont) {
                hijos[i + 1] = hijos[i + 2];
            }
            i++;
        }
        cont--;
    }

    public void Recorrer2(Comparable x) {
        int i = 0;
        boolean ban = false;
        while (i <= cont && ban == false) {
            System.out.println(keys[i].key+" - "+x);
            if (keys[i].key.toString().compareTo(x.toString()) ==0) {
                ban = true;
            } else {
                i++;
            }
        }
        while (i <= cont) {
            keys[i + 1].key = keys[i].key;
            keys[i + 1].info = keys[i].info;
            hijos[i + 1] = hijos[i + 2];
            i++;
        }
        cont--;
    }

    public boolean Buscar(Comparable x) {
        boolean ban = false;
        int i = 0;
        while (ban == false && i <= cont) {
            if (x.compareTo(keys[i].key) == 0) {
                ban = true;
            } else {
                i++;
            }
        }
        return ban;
    }
}

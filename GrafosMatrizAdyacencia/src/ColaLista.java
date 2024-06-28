public class ColaLista {
    protected Nodo frente;
    protected Nodo fin;

    // Constructor: crea una cola vacía
    public ColaLista() {
        frente = fin = null;
    }

    // colaVacia: verifica si la cola está vacía
    public boolean colaVacia() {
        return frente == null;
    }
    // insertar: pone el elemento por el final
    public void insertar(Object elemento) {
        Nodo a = new Nodo(elemento);

        if (colaVacia()) {
            frente = a;
        } else {
            fin.siguiente = a;
        }

        fin = a;
    }

    // quitar: saca el elemento del frente
    public Object quitar() throws Exception {
        if (colaVacia()) {
            throw new Exception("Cola vacía");
        }
        Object aux = frente.elemento;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return aux;
    }

    // borrarCola: libera todos los nodos de la cola
    public void borrarCola() {
        for (; frente != null;){
            frente = frente.siguiente;
            // Vaciar la cola
        }
        System.gc();
    }

    // frenteCola: acceso al primer elemento de la cola
    public Object frenteCola()  {
        if (colaVacia()){
            System.out.println("Error: cola vacía");
        }


        return frente.elemento;
    }


}




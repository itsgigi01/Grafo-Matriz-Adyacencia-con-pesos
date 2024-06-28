import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vertice> letras = new ArrayList<Vertice>();
        RecorreAnchura RecorreGrafo=null;
        letras.add(new Vertice("A"));
        letras.add(new Vertice("B"));
        letras.add(new Vertice("C"));
        letras.add(new Vertice("D"));
        letras.add(new Vertice("H"));
        letras.add(new Vertice("R"));
        letras.add(new Vertice("T"));


        try {
            GrafoMatriz matrizAdyacencia = new GrafoMatriz(letras.size());
            borrarPantalla();
            System.out.println("  =====================  ");
            System.out.println("|  MATRIZ INICIALIZADA  |");
            System.out.println("  =====================  ");
            System.out.println();
            Iterator<Vertice> it = letras.iterator();
            while (it.hasNext()) {
                matrizAdyacencia.nuevoVertice(it.next().nomVertice());
            }

            matrizAdyacencia.mostrarMatriz();
            System.out.println("");
            System.out.println("  ======================  ");
            System.out.println("|  MATRIZ DE ADYACENCIA  |");
            System.out.println("  ====================== ");
            System.out.println("");
            matrizAdyacencia.nuevoArco("D", "B");
            //
            matrizAdyacencia.nuevoArco("D", "C");
            //
            matrizAdyacencia.nuevoArco("B", "H");
            //
            matrizAdyacencia.nuevoArco("C", "R");
            //
            matrizAdyacencia.nuevoArco("R", "H");
            //
            matrizAdyacencia.nuevoArco("H", "A");
            //
            matrizAdyacencia.nuevoArco("H", "T");
            //

            matrizAdyacencia.mostrarMatriz();
            System.out.println();
            System.out.println("  =====================  ");
            System.out.println("| RECORRIDO EN ANCHURA |");
            System.out.println("  =====================  ");
            System.out.println();

            RecorreGrafo.recorrerAnchura(matrizAdyacencia, "D");
            System.out.println();
            matrizAdyacencia.setPeso("D","B",4);
            matrizAdyacencia.setPeso("D","C",9);
            matrizAdyacencia.setPeso("B","H",5);
            matrizAdyacencia.setPeso("C","R",2);
            matrizAdyacencia.setPeso("R","H",3);
            matrizAdyacencia.setPeso("H","A",8);
            matrizAdyacencia.setPeso("H","T",2);
            System.out.println("  =======================================  ");
            System.out.println("| MATRIZ CON SUS PESOS CORRRESPONDIENTES  |");
            System.out.println("  =======================================  ");
            matrizAdyacencia.mostrarMatriz();



        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void borrarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
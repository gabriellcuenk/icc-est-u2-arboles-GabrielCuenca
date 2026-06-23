import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio4;
import structures.trees.Ejercicio3;


public class App {
    public static void main(String[] args) throws Exception {


        System.out.println("Ejercicio 1:");
        int[] numeros = {5,3,7,2,4,6,8};
        Ejercicio1 ejm = new Ejercicio1();
        ejm.insert(numeros);



        System.out.println("Ejercicio 2:");
        Ejercicio2<Integer> ejm2 = new Ejercicio2<Integer>();
        BinaryTree<Integer> arbol = new BinaryTree<>();
        BinaryTree<Integer> arbol2 = new BinaryTree<>();
        for(int numEjm : numeros){
            arbol.insert(numEjm);
            arbol2.insert(numEjm);
        }
        ejm2.invertTree(arbol2.getRoot());

        Ejercicio3<Integer> levels = new Ejercicio3<>();
        System.out.println("Ejercicio 3:");
        System.out.println("Niveles del arbol:");
        System.out.println(levels.listLevels(arbol.getRoot()));

        System.out.println("Ejercicio 4:");
        Ejercicio4<Integer> ejm4 = new Ejercicio4<Integer>();
        System.out.println("Profundidad máxima del arbol " + ejm4.maxDepth(arbol.getRoot()));

        
    }    
}

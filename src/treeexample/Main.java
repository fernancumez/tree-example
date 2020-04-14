
package treeexample;

public class Main {
   
    public static void main(String[] args) {
        ArbolBinario ab = new ArbolBinario();
        
        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);
        Nodo n4 = new Nodo(4);
        Nodo n5 = new Nodo(5);
        Nodo n6 = new Nodo(6);
        Nodo n7 = new Nodo(7);

        
        n1.setHijoIzq(n2);
        n1.setHijoDer(n3);
        
        n2.setHijoIzq(n4);
        n2.setHijoDer(n5);
        
        n5.setHijoIzq(n6);
        n5.setHijoDer(n7);
        
        ab.setRaiz(n1);       
        
        //Metodos en el arbol/recorridos
        System.out.print("PREORDEN: ");
        ab.preorden();
        System.out.println("");
        System.out.print("POSTORDEN: ");
        ab.postorden();
        System.out.println("");
        System.out.print("INORDEN: ");
        ab.inorden();
        System.out.println("\n");
        
        System.out.println(ab.buscar(3));
        System.out.println(ab.buscar(9));
    }
}

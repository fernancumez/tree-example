
package treeexample;

public class ArbolBinario {
    private Nodo raiz;  //Nos indica el comienzo del arbol

    public ArbolBinario() {
        this.raiz = null;
    }
    
    //Metodos publicos
    public void preorden(){
        preorden(this.raiz);
    }
    
    public void postorden(){
        postorden(this.raiz);
    }
    
    public void inorden(){
        inorden(this.raiz);
    }
    
    public String buscar(int nro){
        if(buscar(this.raiz, nro)) return "Numero: " + nro + " Encontrado";
        return "Numero: " + nro + " No encontrado";
    }
    
    private boolean buscar(Nodo n, int nro){
        if(n != null){
            if(n.getDato() == nro) return true;
            boolean ok1 = buscar(n.getHijoIzq(), nro);
            boolean ok2 = buscar(n.getHijoDer(), nro);
            
            if(ok1 || ok2) return true;
        }
        return false;
    }
    
    //Metodos privados
    private void preorden(Nodo n){
        if(n != null){
            System.out.print(" " + n.getDato());
            preorden(n.getHijoIzq());
            preorden(n.getHijoDer());
        }
    }
    
    private void postorden(Nodo n){
        if(n != null){
            postorden(n.getHijoIzq());
            postorden(n.getHijoDer());  
            System.out.print(" " + n.getDato());
        }
    }
    
    private void inorden(Nodo n){
        if(n != null){
            inorden(n.getHijoIzq());
            System.out.print(" " + n.getDato());
            inorden(n.getHijoDer());
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}

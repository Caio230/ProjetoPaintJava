package paint2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Editor1  {
    private List<Figura2D> figuras;
    
    public void Quadrado(String cor, int x, int y, int l1, int l2) throws ValoresInvalidosException{
        Quadrado1 quad = new Quadrado1(cor,x,y,l1,l2);
    }
    
    public Editor1(){
        figuras = new ArrayList();
    }
    
    public void addFigura(Figura2D f){
        
        figuras.add(f);
    
    }
    
    public void rmFigura(Figura2D f){
        figuras.remove(f);
    
    }
    
    public void salvarArquivoTexto(){}
    
    public void salvarFiguras(){}
    
    public void carregarFiguras(){}
    
    public String imprimirFiguras(){
        StringBuilder sb = new StringBuilder();
        for(Figura2D f : figuras){
            sb.append(f.toString());
        }
    return sb.toString();
    }
    
    public void ordenarFiguras(){
        Collections.sort(figuras);
    }
    
    
}

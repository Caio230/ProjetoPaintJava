package paint2;


public class Circulo extends Figura2D{
    
    protected int raio;
    
    public Circulo(String cor, int x, int y, int raio) throws ValoresInvalidosException{
        super(cor, x, y);
        this.raio = raio;
        if (raio < 0){
            throw new ValoresInvalidosException("Erro: Entrada Negativa");
        }
    }
    
    
     public int area(){
        return 3 * (raio * raio);
    }
    
    @Override
    public String toString(){
        
        StringBuffer imprimir = new StringBuffer();
                imprimir.append("Circulo" + '\n');
                imprimir.append("Cor:" + getCor() + '\n');
                imprimir.append("Area:" + area() + '\n');
                imprimir.append("Raio:" + this.raio + '\n');
        return imprimir.toString();
    }
}

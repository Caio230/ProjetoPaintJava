package paint2;


public class Elipse extends Figura2D {
    protected int a;
    protected int b;
    protected int cont;
    
    public Elipse(String cor, int x, int y, int a, int b) throws ValoresInvalidosException{
        super(cor, x, y);
        this.a = a;
        this.b = b;
        if (a < 0 || b < 0){
            throw new ValoresInvalidosException("Erro: Entrada Negativa");
        }
    }
    
    
     public int area(){
        return 3 * (a * b);
    }
    
    @Override
    public String toString(){
        
        StringBuffer imprimir = new StringBuffer();
                imprimir.append("Elipse" + '\n');
                imprimir.append("Cor:" + getCor() + '\n');
                imprimir.append("Area:" + area() + '\n');
                imprimir.append("Raio a :" + this.a + '\n');
                imprimir.append("Raio b :" + this.b + '\n' + '\n');
        return imprimir.toString();
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    }

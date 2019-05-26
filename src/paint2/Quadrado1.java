package paint2;
//Alunos : Caio Gabriel Bispo dos Santos, Obertran Oliveira Lima Júnior
public class Quadrado1 extends Figura2D   {
    private int l1;
    private int l2;
    private int cont;
    
    public Quadrado1(String cor, int x, int y, int l1, int l2) throws ValoresInvalidosException{
        super(cor, x, y);
        this.l1 = l1;
        this.l2 = l2;
        if (l1< 0 || l2 < 0){
            throw new ValoresInvalidosException("Erro: Entrada Negativa");
        }
    }
    
    public int area(){
        return l1*l2;
    }
    
    public double perimetro(){
        return l1 * 2 + l2 * 2;
    }
    @Override
    public String toString(){
        
        StringBuffer imprimir = new StringBuffer();
        if(getCor() != " "){
                imprimir.append("Quadrado" + '\n');
                imprimir.append("Cor:" + getCor() + '\n');
                imprimir.append("Area:" + area() + '\n');
                imprimir.append("Perimetro:" + perimetro() + '\n');
                imprimir.append("Lado1 :" + this.l1 + '\n');
                imprimir.append("Lado2 :" + this.l2 + '\n');
                imprimir.append("\n");
        }else{
                imprimir.append("QuadradoColorido" + '\n');
                imprimir.append("Cor:" + getCor() + '\n');
                imprimir.append("Area:" + area() + '\n');
                imprimir.append("Perimetro:" + perimetro() + '\n');
                imprimir.append("Lado1 :" + this.l1 + '\n');
                imprimir.append("Lado2 :" + this.l2 + '\n');
                imprimir.append("\n");
        }
        return imprimir.toString();
    }
    
    
    
    public boolean equals(Figura2D f){
        if(f instanceof Quadrado1){
            if(f.getCor() == getCor()){
                if(f.getX() == getX()){
                    if(f.getY() == getY()){
                        if(f.area() == area()){
                            return true;
                        }
                    }
                }
            }
        }
    return false;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getL1() {
        return l1;
    }

    public int getL2() {
        return l2;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    
    
    
}

package paint2;
//Alunos : Caio Gabriel Bispo dos Santos, Obertran Oliveira Lima Júnior

public abstract class Figura2D implements Comparable<Figura2D>
{
	
	private String cor;
	protected int x;
	protected int y;
	
    public abstract int area();  
    
    public Figura2D(String cor, int x, int y) throws ValoresInvalidosException{
        this.cor = cor;
        this.x = x;
        this.y = y;
        if(x <0 || y<0){
            throw new ValoresInvalidosException("Erro: Entrada Negativa");
        }
    }
    
   
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
        }

    public String toString(){
    	return "TODO";
    }
        
    
    
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
        
        @Override
    public int compareTo(Figura2D f) {
        
        if(getX() < f.getX())
            return -1;
        if(getX() > f.getX())
            return 1;
   
        return 0;
    }

    

   
    
        
        
    
}

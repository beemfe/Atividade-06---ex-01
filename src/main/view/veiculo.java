public abstract class Veiculo {  
  
    private double velocidade;  
    private String tipo;  
  
    public Veiculo(double velocidade, String tipo) {  
        this.velocidade = velocidade;  
        this.tipo = tipo;  
    }  
  
    public double getVelocidade() {  
        return velocidade;  
    }  
  
    public String getTipo() {  
        return tipo;  
    }  
}

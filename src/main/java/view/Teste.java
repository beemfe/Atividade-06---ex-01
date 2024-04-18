public class Teste { 
    public static void main(String[] args) {  
        Veiculo passeio1 = new VeiculoPasseio(1000);  
        Veiculo passeio2 = new VeiculoPasseio(1200);  
        Veiculo carga1 = new VeiculoCarga(100000);  
        Veiculo carga2 = new VeiculoCarga(120000);  
  
        System.out.println("Veículo Passeio 1:");  
        System.out.println("Velocidade: " + passeio1.getVelocidade());  
        System.out.println("Tipo: " + passeio1.getTipo());  
  
        System.out.println("Veículo Passeio 2:");  
        System.out.println("Velocidade: " + passeio2.getVelocidade());  
        System.out.println("Tipo: " + passeio2.getTipo());  
  
        System.out.println("Veículo Carga 1:");  
        System.out.println("Velocidade: " + carga1.getVelocidade());  
        System.out.println("Tipo: " + carga1.getTipo());  
  
        System.out.println("Veículo Carga 2:");  
        System.out.println("Velocidade: " + carga2.getVelocidade());  
        System.out.println("Tipo: " + carga2.getTipo());  
    }  
}

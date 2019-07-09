
package polimorfismo;

public class main extends soma{

    public static void main(String[] args) {
        int soma;
        
        soma s = new soma();  
        
        soma = s.soma(6, 4);
        System.out.println("Soma de Dois Números: " + soma);
              
        soma = s.soma(7, 1, 34);
        System.out.println("Soma de Três Números: " + soma);
        
        soma = s.soma(64, 9, 2, 9);
        System.out.println("Soma de Quatro Números: " + soma);
    }
}
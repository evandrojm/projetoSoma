
package polimorfismo;

public class main extends soma{

    public static void main(String[] args) {
        int soma;
        
        soma a = new soma();        
        soma = a.soma(6, 4);
        System.err.println("Soma de Dois Números: " + soma);
        soma b = new soma();        
        soma = b.soma(7, 1, 34);
        System.err.println("Soma de Três Números: " + soma);
        
        soma c = new soma();
        soma = c.soma(64, 9, 2, 8);
        System.err.println("Soma de Quatro Números: " + soma);
    }
}


package polimorfismo;

public class main extends soma{

    public static void main(String[] args) {
       
        int total;
        
        // Instanciar Soma 
        soma s = new soma();  
        
        total = s.soma(6, 4);
        System.out.println("Soma de Dois Números: " + total);
              
        total = s.soma(7, 1, 34);
        System.out.println("Soma de Três Números: " + total);
        
        total = s.soma(64, 9, 2, 9);
        System.out.println("Soma de Quatro Números: " + total);
    }
}

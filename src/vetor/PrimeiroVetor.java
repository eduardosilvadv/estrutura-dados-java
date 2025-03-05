package vetor;

public class PrimeiroVetor {
    private  int[] elementos; 
    private int tamanho;

   public  PrimeiroVetor (int capacidade){
    this.elementos = new int[capacidade];
    this.tamanho = 0;
   }
   public  void adicionar(int elemento){
    if (tamanho < elementos.length) {
        elementos[tamanho] = elemento;
        tamanho++;    
    }else{
        System.out.println("Vetor cheio!");
    } } 
   public void exibir(){
    System.out.println("Vetor ");
    for (int i = 0; i < tamanho; i++) {
        System.out.println(elementos[i] + " ");
        
    }

   }

    
}

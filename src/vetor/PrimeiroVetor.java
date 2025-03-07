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
   //adicionar  todos
    public void adicionarTodos(int... elementos){
        for (int elemento : elementos) {
            adicionar(elemento);
        }
    }
    //Remover pelo índice
    public void removerPorIndice(int indice){
        if(indice < 0 || indice >= tamanho){
            System.out.println("Índice inválido!");
            return;
        }
        for(int i = indice; i < tamanho-1; i++ ){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }






    //Pegar elementos
    public int getElemento(int indice){
        if (indice >= 0 && indice < tamanho){
            return elementos[indice];
        }
        throw new IndexOutOfBoundsException("Índice inválido "+ indice);
    }

    public int getTamanho(){
        return tamanho;
    }





   public void exibir(){
    System.out.println("Vetor ");
    for (int i = 0; i < tamanho; i++) {
        System.out.println(elementos[i] + " ");
        
    }

   }

    
}

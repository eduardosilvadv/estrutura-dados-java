import vetor.PrimeiroVetor;

public class App {
    public static void main(String[] args) throws Exception {
       PrimeiroVetor vetor = new PrimeiroVetor(5);
  
       vetor.exibir();
       int [] valores = {10,20,30,40};
       for (int valor : valores) {
        vetor.adicionarTodos(valor);
           
       }
      vetor.exibir();
      System.out.println("Indece 2 = " + vetor.getElemento(2));
      System.out.println("Tamanho vetor 1 = " + vetor.getTamanho());
      System.out.println("--------------------------");
      vetor.removerPorIndice(2);
      System.out.println("Indece 2 = " + vetor.getElemento(2));
      System.out.println("Tamanho vetor 2 = " + vetor.getTamanho());
      vetor.exibir();
       

    }
}

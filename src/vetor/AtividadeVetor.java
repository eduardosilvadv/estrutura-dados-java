package vetor;

public class AtividadeVetor {

    // Declaração dos vetores de tamanhos fixos
    private int[] estoques = new int[5];  // Vetor de int para estoques
    private double[] idades = new double[5];  // Vetor de double para idades
    private String[] notas = new String[5];  // Vetor de String para notas
    
    // Tamanho atual dos vetores
    private int tamanhoEstoques = 0;
    private int tamanhoIdades = 0;
    private int tamanhoNotas = 0;

    // Método para adicionar um elemento no vetor de estoques
    public void adicionarEstoque(int estoque) {
        if (tamanhoEstoques < estoques.length) {
            estoques[tamanhoEstoques] = estoque;
            tamanhoEstoques++;
        } else {
            System.out.println("Capacidade do vetor de estoques atingida.");
        }
    }

    // Método para adicionar um elemento no vetor de idades
    public void adicionarIdade(double idade) {
        if (tamanhoIdades < idades.length) {
            idades[tamanhoIdades] = idade;
            tamanhoIdades++;
        } else {
            System.out.println("Capacidade do vetor de idades atingida.");
        }
    }

    // Método para adicionar um elemento no vetor de notas
    public void adicionarNota(String nota) {
        if (tamanhoNotas < notas.length) {
            notas[tamanhoNotas] = nota;
            tamanhoNotas++;
        } else {
            System.out.println("Capacidade do vetor de notas atingida.");
        }
    }

    // Método para remover um elemento do vetor de estoques
    public void removerEstoque(int indice) {
        if (indice >= 0 && indice < tamanhoEstoques) {
            for (int i = indice; i < tamanhoEstoques - 1; i++) {
                estoques[i] = estoques[i + 1];
            }
            tamanhoEstoques--;
        } else {
            System.out.println("Índice inválido para estoques.");
        }
    }

    // Método para remover um elemento do vetor de idades
    public void removerIdade(int indice) {
        if (indice >= 0 && indice < tamanhoIdades) {
            for (int i = indice; i < tamanhoIdades - 1; i++) {
                idades[i] = idades[i + 1];
            }
            tamanhoIdades--;
        } else {
            System.out.println("Índice inválido para idades.");
        }
    }

    // Método para remover um elemento do vetor de notas
    public void removerNota(int indice) {
        if (indice >= 0 && indice < tamanhoNotas) {
            for (int i = indice; i < tamanhoNotas - 1; i++) {
                notas[i] = notas[i + 1];
            }
            tamanhoNotas--;
        } else {
            System.out.println("Índice inválido para notas.");
        }
    }

    // Método para exibir o vetor de estoques
    public void exibirEstoques() {
        System.out.print("Estoques: ");
        for (int i = 0; i < tamanhoEstoques; i++) {
            System.out.print(estoques[i] + " ");
        }
        System.out.println();
    }

    // Método para exibir o vetor de idades
    public void exibirIdades() {
        System.out.print("Idades: ");
        for (int i = 0; i < tamanhoIdades; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();
    }

    // Método para exibir o vetor de notas
    public void exibirNotas() {
        System.out.print("Notas: ");
        for (int i = 0; i < tamanhoNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Criando uma instância de VetorUtils
        AtividadeVetor atVetor = new AtividadeVetor();

        // Adicionando elementos aos vetores
        atVetor.adicionarEstoque(50);
        atVetor.adicionarEstoque(100);
        atVetor.adicionarEstoque(200);

        atVetor.adicionarIdade(22.5);
        atVetor.adicionarIdade(30.0);
        atVetor.adicionarIdade(25.5);

        atVetor.adicionarNota("A");
        atVetor.adicionarNota("B");
        atVetor.adicionarNota("C");

        // Exibindo os vetores após as adições
        System.out.println("Após adições:");
        atVetor.exibirEstoques();
        atVetor.exibirIdades();
        atVetor.exibirNotas();

        // Removendo elementos dos vetores
        atVetor.removerEstoque(1);  // Remover o estoque na posição 1
        atVetor.removerIdade(0);    // Remover a idade na posição 0
        atVetor.removerNota(2);     // Remover a nota na posição 2

        // Exibindo os vetores após as remoções
        System.out.println("Após remoções:");
        atVetor.exibirEstoques();
        atVetor.exibirIdades();
        atVetor.exibirNotas();
    }
}

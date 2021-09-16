public class AppPesquisa {
    public static void main(String[] args) {
        /*
         * final int TAM_VET = 10; int [] vet = new int[TAM_VET];
         * 
         * for (int i = 0; i < vet.length; i++) { vet[i] = (int) (Math.random() *
         * TAM_VET + 1); System.out.print(vet[i] + " "); } System.out.println();
         * 
         * VetorPesquisa pesquisa = new VetorPesquisa(vet);
         */

/*         VetorPesquisa pesquisa = new VetorPesquisa(20);

        pesquisa.gerarVetor();
        System.out.println(pesquisa);
        System.out.println(pesquisa.buscaSeq(7));
        System.out.println(pesquisa.buscaSeqRec(7));
        System.out.println(pesquisa.buscaSeqTodos(7));

        pesquisa.gerarVetorOrdenado();
        System.out.println(pesquisa);
        // System.out.println(pesquisa.buscaSeqOrdenada(12));
        System.out.println(pesquisa.buscaSeq(13));
        System.out.println("Comparações feitas: " + pesquisa.getContCompara());
        System.out.println(pesquisa.buscaSeqOrdenada(13));
        System.out.println("Comparações feitas: " + pesquisa.getContCompara()); */

        final int TAM_VETOR = 100000;
        int[] vetor = new int[TAM_VETOR];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] =  i * 2;
        }
        
        VetorPesquisa pesquisa = new VetorPesquisa(vetor);
        int chave = 91100;
        System.out.println(pesquisa.buscaSeq(chave));
        System.out.println("Comparações: " + pesquisa.getContCompara());

    }
}

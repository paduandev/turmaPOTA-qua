public class AppPesquisa {
    public static void main(String[] args) {
        final int TAM_VETOR = 100000;
        int[] vetor = new int[TAM_VETOR];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] =  i * 2;
        }
        
        VetorPesquisa pesquisa = new VetorPesquisa(vetor);
        int chave = 91101;
        System.out.println(pesquisa.pesquisaBinaria(chave));
        System.out.println("Comparações: " + pesquisa.getContCompara());

        System.out.println(pesquisa.pesquisaBinariaRec(chave));
        System.out.println("Comparações: " + pesquisa.getContCompara());

    }

}

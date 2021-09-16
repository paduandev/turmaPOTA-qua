
public class VetorPesquisa {
    private int[] v;
    private int contCompara;

    public VetorPesquisa(int[] vet) {
        v = vet;
    }

    public int getContCompara() {
        return contCompara;
    }

    public int pesquisaBinaria(int chave) {
        int inicio, fim, meio;

        contCompara = 0;
        inicio = 0;
        fim = v.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            contCompara++;
            if (chave == v[meio]) {
                return meio;
            }
            contCompara++;
            if (chave < v[meio]) {  // troca para '>' se o vetor estiver ordenado decrescente
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1; // return -meio; 
    }

    public int pesquisaBinariaRec(int chave) {
        contCompara = 0;
        return pesquisaBinariaRec(chave, 0, v.length-1);
    }

    private int pesquisaBinariaRec(int chave, int inicio, int fim) {
        // base : não achou
        if (inicio > fim) {
            return -1;
        }
        // base : achou
        int meio = (inicio + fim) / 2;
        contCompara++;
        if (chave == v[meio]) {
            return meio;
        }

        // geral
        contCompara++;
        if (chave < v[meio]) {
            return pesquisaBinariaRec(chave, inicio, meio - 1);
        } else {
            return pesquisaBinariaRec(chave, meio + 1, fim);
        }
    }

}

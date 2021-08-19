public class ExercicioVet {
    public static void main(String[] args) {
        int [] vetor = {89, 7, 12, 33, 54, 88, 90};

        System.out.println(maior(vetor, vetor.length));
    }

    private static int maior(int []v, int tam) {
        // base
        if(tam == 1) {
            return v[0];
        }
        // geral
        int maior = maior(v, tam-1);

        return (maior > v[tam-1]) ? maior : v[tam-1];
        
/*      if(maior > v[tam-1])
            return maior;
        else
            return v[tam-1]; */
    }

}

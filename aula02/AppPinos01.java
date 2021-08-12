
public class AppPinos01 {

    public static void main(String[] args) {
        System.out.println("==> " + pinosRec(5));
        System.out.println("==> " + pinosIt(5));
       
    }

    public static int pinosRec(int linhas) {
        // caso base ou ponto de parada
        // if(linhas == 1) return 1;

        if (linhas < 1) { //tratando casos especiais
            return 0;
        }
        
        // caso geral
        return linhas + pinosRec(linhas - 1);
    }

    public static int pinosIt(int linhas) {
        int totalPinos = 0;

        for (int linha = 1; linha <= linhas; linha++) {
            totalPinos += linha;
        }

        return totalPinos;
    }

}
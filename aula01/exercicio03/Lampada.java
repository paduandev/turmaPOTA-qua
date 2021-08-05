package exercicio03;

public class Lampada {
    private boolean estado;

    public Lampada() {
        estado = false;
    }

    public void acionarInterruptor() {
        estado = !estado;
    }

    public String exibir() {
        return (estado)?"On":"Off";
    }
}

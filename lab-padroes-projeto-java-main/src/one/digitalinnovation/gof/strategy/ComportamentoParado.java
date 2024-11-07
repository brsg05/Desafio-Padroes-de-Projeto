package one.digitalinnovation.gof.strategy;

public class ComportamentoParado implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Parou de se mover...");
    }
}

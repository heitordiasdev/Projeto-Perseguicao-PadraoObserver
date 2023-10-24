package principal;
import interfaces.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado implements Carro {
    private List<Carro> observadores = new ArrayList<>();

    @Override
    public void esquerda() {
        System.out.println("Carro roubado virou a esquerda...");
        notificarObservadores("virar a esquerda");
    }

    @Override
    public void direita() {
        System.out.println("Carro roubado virou a direita...");
        notificarObservadores("virar a direita");
    }

    @Override
    public void parar() {
        System.out.println("Carro roubado parou...");
        notificarObservadores("parar");
    }

    public void adicionarObservador(Carro observador) {
        observadores.add(observador);
    }

    private void notificarObservadores(String action) {
        for (Carro observador : observadores) {
            if (action.equals("virar a esquerda")) {
                observador.esquerda();
            } else if (action.equals("virar a direita")) {
                observador.direita();
            } else if (action.equals("parar")) {
                observador.parar();
            }
        }
    }
}
package principal;
import interfaces.Carro;
import principal.CarroRoubado;
import lombok.Data;
@Data

class Viatura implements Carro {
    private String nomeViatura;

    public Viatura(String nomeViatura) {
        this.nomeViatura = nomeViatura;
    }

    @Override
    public void esquerda() {
        System.out.println("Viatura virou a esquerda...");
    }

    @Override
    public void direita() {
        System.out.println("Viatura virou a direita...");
    }

    @Override
    public void parar() {
        System.out.println("Viatura parou...");
    }
}

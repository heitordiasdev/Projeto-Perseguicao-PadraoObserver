import principal.CarroRoubado;
import principal.Viatura;

public class App {
    public static void main(String[] args) {

        Viatura viatura = new Viatura("Viatura");
        CarroRoubado carroRoubado = new CarroRoubado();

        carroRoubado.adicionarObservador(viatura);

        carroRoubado.esquerda();
        carroRoubado.direita();
        carroRoubado.parar();
    }
}

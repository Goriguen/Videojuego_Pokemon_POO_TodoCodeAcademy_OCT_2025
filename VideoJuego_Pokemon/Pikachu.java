package VideoJuego_Pokemon;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(int num_pokedex, int pesoPokemon, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo) {
        super(num_pokedex, pesoPokemon, temporadaQueAparece, nombrePokemon, sexo, tipo);
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("¡PIKACHU: Ataque impactrueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("¡PIKACHU: Ataque Punio de Trueno!");
    }

    @Override
    public void atacarRayo() {
        System.out.println("¡PIKACHU: Ataque de Rayo!");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("¡PIKACHU: Ataque con Rayo de carga!");
    }

    public void fraseCelebre(){System.out.println("¡SOY PIKACHU, Y ESTA ES MI FRASE CÉLEBRE: Pika pika!");}

    @Override
    public void atacarPlacaje() {
        System.out.println("PIKACHU: Responde con Ataque Básico 1");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("PIKACHU: Responde con Ataque Básico 2");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("PIKACHU: Responde con Ataque Básico 3");
    }
}

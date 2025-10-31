package VideoJuego_Pokemon;

public class Charmander extends Pokemon implements IFuego{

    public Charmander(int num_pokedex, int pesoPokemon, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo) {
        super(num_pokedex, pesoPokemon, temporadaQueAparece, nombrePokemon, sexo, tipo);
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("¡CHARMANDER: Puño poderoso de fuego con flow!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("¡CHARMANDER: Ataque de ascuas!");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("¡CHARMANDER: Lanzallamas Potente!");
    }

    @Override
    public String atacarPlacaje() {
        return "CHARMANDER: Responde con Ataque Básico 1";
    }

    @Override
    public String atacarAraniazo() {
        return "CHARMANDER: Responde con Ataque Básico 2";
    }

    @Override
    public String atacarMordisco() {
        return "CHARMANDER: Responde con ataque Básico 3";
    }
}

package VideoJuego_Pokemon;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle(int num_pokedex, int pesoPokemon, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo) {
        super(num_pokedex, pesoPokemon, temporadaQueAparece, nombrePokemon, sexo, tipo);
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("¡SQUIRTLE: Ataque de HidroBomba!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("¡SQUIRTLE: Ataque con pistola de agua!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("¡SQUIRTLE: Ataque con Burbujas!");

    }

    @Override
    public void atacarHidropulso() {
        System.out.println("¡SQUIRTLE: Ataque de Hidropulso!");
    }

    @Override
    public String atacarPlacaje() {
        return "SQUIRTLE: Responde con Ataque Básico 1";
    }

    @Override
    public String atacarAraniazo() {
        return "SQUIRTLE: Responde con Ataque Básico 2";
    }

    @Override
    public String atacarMordisco() {
        return "SQUIRTLE: Responde con Ataque Básico 3";
    }
}

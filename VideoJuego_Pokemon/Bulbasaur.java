package VideoJuego_Pokemon;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur(int num_pokedex, int pesoPokemon, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo) {
        super(num_pokedex, pesoPokemon, temporadaQueAparece, nombrePokemon, sexo, tipo);
    }

    @Override
    public void atacarParalizar() {
        System.out.println("¡BULBASAUR: Te paralizo en el acto!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("¡BULBASAUR: Drenaje Fuerte!");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("¡BULBASAUR: Ataque filoso de hoja!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("¡BULBASAUR: Ataque con látigo de cepa!");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("BULBASAUR: Responde con Ataque Básico 1");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("BULBASAUR: Responde con Ataque Básico 2");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("BULBASAUR: Responde con Ataque Básico 3");
    }
}

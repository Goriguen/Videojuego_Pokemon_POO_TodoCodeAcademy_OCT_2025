package VideoJuego_Pokemon;

public class Bulbasur extends Pokemon implements IPlanta{

    public Bulbasur(int num_pokedex, int pesoPokemon, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo) {
        super(num_pokedex, pesoPokemon, temporadaQueAparece, nombrePokemon, sexo, tipo);
    }

    @Override
    public void atacarParalizar() {
        System.out.println("¡BULBASUR: Te paralizo en el acto!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("¡BULBASUR: Drenaje Fuerte!");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("¡BULBASUR: Ataque filoso de hoja!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("¡BULBASUR: Ataque con látigo de cepa!");
    }

    @Override
    public String atacarPlacaje() {
        return "BULBASUR: Responde con Ataque Básico 1";
    }

    @Override
    public String atacarAraniazo() {
        return "BULBASUR: Responde con Ataque Básico 2";
    }

    @Override
    public String atacarMordisco() {
        return "BULBASUR: Responde con Ataque Básico 3";
    }
}

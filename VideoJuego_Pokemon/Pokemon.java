package VideoJuego_Pokemon;

public abstract class Pokemon{

    protected int num_pokedex, pesoPokemon, temporadaQueAparece;
    protected String nombrePokemon, sexo, tipo;

    public Pokemon(int num_pokedex, int pesoPokemon, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo) {
        this.num_pokedex = num_pokedex;
        this.pesoPokemon = pesoPokemon;
        this.temporadaQueAparece = temporadaQueAparece;
        this.nombrePokemon = nombrePokemon;
        this.sexo = sexo;
        this.tipo = tipo;
    }

    public abstract String atacarPlacaje();
    public abstract String atacarAraniazo();
    public abstract String atacarMordisco();

}

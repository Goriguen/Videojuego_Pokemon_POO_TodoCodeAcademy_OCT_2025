package VideoJuego_Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class inicio {

    public static void main (String args[] ){

        System.out.println("¿Bienvenido entrenador(a) POKEMON!\n¿Estás Listo Para tu Próxima Aventura?\n\n ¡EMPECEMOS!\n\n");

        boolean salir = false;
        boolean ejecutarSimulacion = false;
        Scanner sc = new Scanner(System.in);
        Pokemon[] misPokemones = new Pokemon[4];
        String respuesta;

        while(!salir){
            System.out.println("¿Desea crear visualizar todos los ataques de los personajes?");
            respuesta = sc.nextLine();
            if(respuesta.equalsIgnoreCase("SI")) {
                ejecutarSimulacion = true;
                salir = true;
                ArrayList<String> nombresUsados = new ArrayList<>();

                for (int x = 0; x < misPokemones.length; x++) {
                    System.out.println("\n--- Creación del Pokémon #" + (x + 1) + " ---");

                    // 1. Pedir atributos al usuario (ejemplo para el nombre)
                    String nombreValido;
                    boolean nombreEsValido;
                    boolean nombreRepetido;
                    do {
                        nombreEsValido = false;
                        nombreRepetido = false;

                        System.out.print("Ingrese el nombre del Pokémon [Pikachu, Charmander, Bulbasaur, Squirtle]: ");
                        nombreValido = sc.nextLine();


                        // A. VALIDACIÓN DE NOMBRE (DEBE SER UNO DE LOS 4)

                        if (nombreValido.equalsIgnoreCase("Pikachu") ||
                                nombreValido.equalsIgnoreCase("Charmander") ||
                                nombreValido.equalsIgnoreCase("Bulbasaur") ||
                                nombreValido.equalsIgnoreCase("Squirtle")) {

                            nombreEsValido = true;


                            // B. VALIDACIÓN DE REPETICIÓN (No debe estar en la lista)

                            if (nombresUsados.contains(nombreValido)) {
                                nombreRepetido = true;
                                System.out.println("Error: El Pokémon '" + nombreValido + "' ya fue elegido. Elija otro.");
                            }
                        } else {
                            System.out.println("Error: Nombre de Pokémon no válido.");
                        }

                    } while (!nombreEsValido || nombreRepetido); // Repite si no es válido O si está repetido

                    // Registrar el nombre antes de usarlo para que no se repita en la próxima iteración
                    nombresUsados.add(nombreValido);

                    System.out.print("Ingrese el número Pokedex: ");
                    int numPokedex = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el peso: ");
                    int peso = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese la temporada en la que aparece: ");
                    int temporadaAparece = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el sexo del personaje: ");
                    String sexoPersonaje = sc.nextLine();
                    System.out.print("Ingrese el tipo del personaje: ");
                    String tipoPersonaje = sc.nextLine();

                    // Se usa 'nombreValido' en el constructor de la instancia:
                    if (nombreValido.equalsIgnoreCase("Pikachu")) {
                        misPokemones[x] = new Pikachu(numPokedex, peso, temporadaAparece, nombreValido, sexoPersonaje, tipoPersonaje);
                    } else if (nombreValido.equalsIgnoreCase("Charmander")) {
                        misPokemones[x] = new Charmander(numPokedex, peso, temporadaAparece, nombreValido, sexoPersonaje, tipoPersonaje);
                    } else if (nombreValido.equalsIgnoreCase("Bulbasur")) {
                        misPokemones[x] = new Bulbasur(numPokedex, peso, temporadaAparece, nombreValido, sexoPersonaje, tipoPersonaje);
                    } else if (nombreValido.equalsIgnoreCase("Squirtle")) {
                        misPokemones[x] = new Squirtle(numPokedex, peso, temporadaAparece, nombreValido, sexoPersonaje, tipoPersonaje);
                    }
                }
            }else if (respuesta.equalsIgnoreCase("NO")){
                System.out.println("Ha elegido salir del programa.");
                salir = true;
            } else {
                System.out.println("Respuesta no válida. Por favor, introduzca SI o NO.");
            }
        }


        if(ejecutarSimulacion){

            System.out.println("\n--- INICIANDO SIMULACIÓN DE ATAQUES ---");

            for(Pokemon p : misPokemones){
                p.atacarAraniazo();
                p.atacarMordisco();
                p.atacarPlacaje();

                if(p instanceof IElectrico){
                    IElectrico pokemonElectrico = (IElectrico)p;

                    pokemonElectrico.atacarImpactrueno();
                    pokemonElectrico.atacarPunioTrueno();
                    pokemonElectrico.atacarRayo();
                    pokemonElectrico.atacarRayoCarga();
                }else if(p instanceof IAgua){
                    IAgua pokemonAgua = (IAgua)p;

                    pokemonAgua.atacarBurbuja();
                    pokemonAgua.atacarHidroBomba();
                    pokemonAgua.atacarPistolaAgua();
                    pokemonAgua.atacarHidropulso();
                }else if(p instanceof IPlanta){
                    IPlanta pokemonPlanta = (IPlanta)p;

                    pokemonPlanta.atacarDrenaje();
                    pokemonPlanta.atacarHojaAfilada();
                    pokemonPlanta.atacarLatigoCepa();
                    pokemonPlanta.atacarParalizar();
                }else if (p instanceof IFuego pokemonFuego){

                    pokemonFuego.atacarAscuas();
                    pokemonFuego.atacarPunioFuego();
                    pokemonFuego.atacarLanzallamas();
                }
            }
        }

    }
}

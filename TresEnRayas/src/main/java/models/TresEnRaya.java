/**
 * 
 */
package models;

/**
 * @author Miguel A. Sastre, Vyavheslav khaydorov, Ingrid Dominguez
 *
 */
public class TresEnRaya {
	//Atributos
	final int MOV_TOTALES = 9; //Número de movimientos que se pueden hacer en una partida.
	final String JUGADOR1 = "JUGADOR 1"; //Nombre por defecto de los jugadores.
	final String JUGADOR2 = "JUGADOR 2";
	String [][] tablero; //Matriz con el tablero.
	int movimientos; //Variable para contar los movimientos.
	boolean turnoJ1; //Variable booleana para saber si es el turno del jugador 1.
	String nameJ1; //Variable donde guardaremos el nombre de los dos jugadores.
	String nameJ2;
	
	//Constructor
	public TresEnRaya(String nombreJ1, String nombreJ2) {
		this.tablero = new String[3][3];
		this.movimientos = 0;
		this.turnoJ1 = true;
		comprobarNombre(nombreJ1,nombreJ2);
	}
	
	//Método para el algoritmo de la CPU.
	public int[] algoritmoCpu(String signo) {
		int posicion[] = {-1,-1}; //Array donde guardaremos la posición.
		boolean exit = false; //Boolean para salir del for.
		
		for(int i = 0; i < tablero.length && !exit; i++) { //Recorremos las filas y las columnas del tablero.
			for(int j = 0; j < tablero.length && !exit; j++) {
				if(tablero[i][j] == null) { //Si la posición es null...
					tablero[i][j] = signo; //Asignamos el signo del jugador en esa posición.
					if(condicionVictoria(signo)) { //Comprovamos si la condición de victoria se cumple...
						posicion[0] = i;// Guardamos la posición en el array que hemos creado anteriormente.
						posicion[1] = j;
						exit = true; //Dejamos de recorrer el tablero.
					}
					tablero[i][j] = null; //Volvemos a dejar como null las posiciones que ha ido probando.
				}	
			}
		}
		return posicion; //Devolvemos el array donde habiamos guardado la posición final.
	}
	
	//Método para comprobar si la posición és válida.
	public boolean esPosicionValida(int [] posicion) {
		return (posicion[0] != -1) ? true:false;
	}
	
	//Método para comprobar si la posición está ocupada.
	public boolean posicionOcupada(int x, int y) {
		return tablero[x][y] != null;
	}
	
	//Método con todas las combinaciones que se pueden dar para ganar.
	public boolean condicionVictoria(String signoJugador) {
		boolean victoria = false;
		
		if(this.tablero[0][0] == signoJugador && this.tablero[0][1] == signoJugador && this.tablero[0][2] == signoJugador) // 1º Fila
			victoria = true;
		if(this.tablero[1][0] == signoJugador && this.tablero[1][1] == signoJugador && this.tablero[1][2] == signoJugador) // 2º Fila
			victoria = true;
		if(this.tablero[2][0] == signoJugador && this.tablero[2][1] == signoJugador && this.tablero[2][2] == signoJugador) // 3º Fila
			victoria = true;
		if(this.tablero[0][0] == signoJugador && this.tablero[1][0] == signoJugador && this.tablero[2][0] == signoJugador) // 1º Columna
			victoria = true;
		if(this.tablero[0][1] == signoJugador && this.tablero[1][1] == signoJugador && this.tablero[2][1] == signoJugador) // 2º Columna
			victoria = true;
		if(this.tablero[0][2] == signoJugador && this.tablero[1][2] == signoJugador && this.tablero[2][2] == signoJugador) // 3º Columna
			victoria = true;
		if(this.tablero[0][0] == signoJugador && this.tablero[1][1] == signoJugador && this.tablero[2][2] == signoJugador) // 1º Diagonal
			victoria = true;
		if(this.tablero[0][2] == signoJugador && this.tablero[1][1] == signoJugador && this.tablero[2][0] == signoJugador) // 2º Diagonal
			victoria = true;
		
		return victoria;
	}
	
	//Método para saber cuando ya no se pueden hacer más movimientos.
	public boolean quedanMovimientos() {
		return this.movimientos < this.MOV_TOTALES;
	}
	
	//Método para incrementar el número de movimientos.
	public void incrementarMovimientos() {
		this.movimientos += 1;
	}
	
	//Método para saber si pasa al siguiente turno.
	public void siguienteTurno() {
		this.turnoJ1 = (this.isTurnoJ1() == true) ? false : true;
	}
	
	//Método para comprobar el nombre de los jugadores.
	private void comprobarNombre(String j1, String j2) {
		//Si no han introducido ningún nombre, devolverá el nombre por defecto.
		this.nameJ1 = (j1.compareToIgnoreCase("") == 0) ? this.JUGADOR1 : j1;
		this.nameJ2 = (j2.compareToIgnoreCase("") == 0) ? this.JUGADOR2 : j2;
	}
	
	//Método que devuelve si es el turno del jugador 1 o no.
	public boolean isTurnoJ1() {
		return turnoJ1;
	}

	//Método que devuelve el nombre del jugador 1.
	public String getNameJ1() {
		return nameJ1;
	}

	//Método que devuelve el nombre del jugador 2.
	public String getNameJ2() {
		return nameJ2;
	}
	
	//Método para marcar la posición que selecciona el jugador que tiene el turno.
	public void marcarPosicion(int x, int y, String turno) {
		this.tablero[x][y] = turno;
	}
	
	//Método para asignar el signo correspondiente a cada turno.
	public String signoTurno() {
		return (this.isTurnoJ1() == true) ? "X" : "O"; 
	}
	
	//Método para planificar los movimientos del rival (CPU).
	public String signoContrario() {
		return (this.isTurnoJ1() == false) ? "X" : "O"; 
	}
	
	//Método que retorna el nombre del jugador que ha ganado.
	public String jugadorTurno() {
		return (this.isTurnoJ1() == true) ? this.nameJ1:this.nameJ2;
	}
	
	//Método para saber de quién es el turno.
	public String obtenerTurno() {
		String turno = ""; //Al inicial el juego la variable estará en blanco.
		
		if(this.isTurnoJ1() == true) { //Si es el turno del jugador 1, la variable guardará el nombre del primer jugador.
			turno += this.getNameJ1();
		}
		else {	//Si no, guardará el del segundo jugador.
			turno += this.getNameJ2();
		}
		
		//Devuelve el String indicando el jugador al que le toca.
		return turno + ",\n coloca ficha...";
	}
	
}

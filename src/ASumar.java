
public class ASumar {

	/**
	 * Guarda variable
	 */
    String valor_inicial;
	/**
	 * Metodo constructor
	 * @param string
	 */
    public ASumar(String string) {
        this.valor_inicial = string;
    }
    /**
     * Metodo que realiza la suma y devuelve el numero
     * @return
     */
	public String mostrar() {
        String numero = valor_inicial;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }  return numero;
}
	   public int total() {
	        int suma = 0;

	        for (int i = 0; i < valor_inicial.length(); i++) {
	            // Cadena de un dígito.
	            String digito = valor_inicial.substring(i, 1);
	            suma = suma + Integer.getInteger(digito);
	        }
	        return suma;

	    }
}

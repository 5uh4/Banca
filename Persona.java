package banca;

public class Persona {
// Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;
	private CuentaBancaria cuenta;

// Ctors
	/**
	 * Construye un objeto concreto: Persona.
	 * 
	 * @param nombre    Nombre de la persona.
	 * @param apellidos Apellidos de la persona.
	 * @param dni       DNI de la persona.
	 * @param sueldo    Sueldo de la persona.
	 * @param cuenta    La cuenta que se crea junto con la persona.
	 */
	public Persona(String nombre, String apellidos, String dni, double sueldo, CuentaBancaria cuenta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.cuenta = cuenta;
	}

// Getters y setters
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return los apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @return el dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return el sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @return la cuenta
	 */
	public CuentaBancaria getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta La cuenta a settear
	 */
	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}

// Metodos
	/**
	 * Añade el sueldo al saldo.
	 */
	public void cobrarSueldo() {
		this.sueldo = this.sueldo + cuenta.sumarSaldo(sueldo);
	}

	/**
	 * Resta la cantidad deseada al sueldo de la cuenta, si hay suficiente.
	 * 
	 * @param cantidad Cantidad a retirar.
	 * @return El saldo.
	 */
	public double sacarPasta(double cantidad) {
		if (cantidad < cuenta.getSaldo()) {
			this.sueldo = cuenta.restarCantidad(cantidad);
		} else
			System.out.println("Te has pasado.");
		return cuenta.getSaldo();
	}

	/**
	 * Permite recibir un aumento de saldo.
	 * 
	 * @param aumento Aumento recibido.
	 */
	public void subirSueldo(double aumento) {
		this.sueldo = this.sueldo + aumento;
	}

	@Override
	public String toString() {
		return "Persona [nombre = " + nombre + ", apellidos = " + apellidos + ", dni = " + dni + ", sueldo = " + sueldo
				+ ", saldo = " + cuenta.getSaldo() + "]";
	}

}

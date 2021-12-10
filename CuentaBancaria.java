package banca;

public class CuentaBancaria {

// Atributos
	private int numeroCuenta;
	private double saldo;
	private Persona titular;

// Ctors
	public CuentaBancaria(int numeroCuenta, double saldo, Persona titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}
// Getters & Setters

	/**
	 * @return numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @return titular
	 */
	public Persona getTitular() {
		return titular;
	}

// Metodos
	/**
	 * Se suma la cantidad deseada al saldo de la cuenta.
	 * 
	 * @param cantidad Cantidad que se desea sumar.
	 * @return Devuelve el saldo.
	 */
	public double sumarSaldo(double cantidad) {
		this.saldo = this.saldo + cantidad;
		return this.saldo;
	}

	/**
	 * Resta la cantidad de dinero deseada de la cuenta, si está disponible.
	 * 
	 * @param cantidad Cantidad de dinero que se desea retirar
	 * @return
	 */
	public double restarCantidad(double cantidad) {
		if (cantidad < this.saldo) {
			this.saldo = this.saldo - cantidad;
		} else {
			System.out.println("Error: No tienes tanto dinerito.");
		}
		return this.saldo;

	}

	@Override
	public String toString() {
		return "Cuenta Bancaria [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}

}

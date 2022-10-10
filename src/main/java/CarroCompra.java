public class CarroCompra {
	public static void main(String[] args) {
		CarroCompra carro1=new CarroCompra();
		carro1.mostrarTotal();
	}
	private int[][] productos=new int[2][5];
	public CarroCompra() {
		for (int i=0;i<5;i++){
			productos[0][i]=1;
			productos[1][i]=1000;
		}
	}
	private int CalcularTotal() {
		int total=0, subtotal=0;

		for (int i=0;i<5;i++){
			total+=subTotal(productos[0][i],productos[1][i]);
		}
		return total;
	}
	/**
	 * 
	 * @param cant
	 * @param precio
	 */
	private int subTotal(int cant, int precio) {
		Calculadora calc=new Calculadora(cant,precio);
		return calc.multiplicar();
	}
	public void mostrarTotal() {
		System.out.println("El total de la compra es: "+this.CalcularTotal());
	}
}
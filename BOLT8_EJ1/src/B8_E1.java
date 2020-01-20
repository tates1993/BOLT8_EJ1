public class B8_E1 {
	public static void main(String[] args) {
		Producto p = new Producto("Cola-Cao",1,3);
		
		String resultado="error";
		p.setPrecio(100);
		p.setUnidades(100);
		if (p.getPrecio==p.setPrecio) {
			resultado="";
		}
		System.out.println("El precio del producto " + p.getNombre() + " es de " + p.getPrecio() + " Euros");
		System.out.println("Hay " + p.getUnidades() + " en stock, valoradas es " + p.valorEnStock() + " Euros");
		System.out.println(resultado);
	}
}
package Prototipo;

public class Rectangulo extends Figura{

	public int ancho;
    public int alto;
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangulo(Rectangulo objetivo) {
        super(objetivo);
        if (objetivo != null) {
            this.ancho = objetivo.ancho;
            this.alto = objetivo.alto;
        }
    }
	
	
	@Override
    public Figura clone() {
        return new Rectangulo(this);
    }
	
	
	@Override
    public boolean equals(Object objeto) {
        if (!(objeto instanceof Rectangulo) || !super.equals(objeto)) return false;
        Rectangulo shape2 = (Rectangulo) objeto;
        return shape2.ancho == ancho && shape2.alto == alto;
    }

}

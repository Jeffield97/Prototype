package Prototipo;

public class Circulo extends Figura{

	public int radio;
	public Circulo() {
		// TODO Auto-generated constructor stub
	}
	
	public Circulo(Circulo objetivo) {
		super(objetivo);
		if(objetivo != null) {
			this.radio = objetivo.radio;
		}
	}
	
	@Override
    public Figura clone() {
        return new Circulo(this);
    }
	
	@Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circulo) || !super.equals(object2)) return false;
        Circulo shape2 = (Circulo) object2;
        return shape2.radio == radio;
    }

}

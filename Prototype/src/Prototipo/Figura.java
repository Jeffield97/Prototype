package Prototipo;
import java.util.Objects;
public abstract class Figura {

	public int x;
    public int y;
    public String color;
	
	public Figura() {
		
	}
	
	public Figura(Figura objetivo) {
		if (objetivo !=null) {
			this.x = objetivo.x;
			this.y = objetivo.y;
			this.color = objetivo.color;
		}
	}
	
	public abstract Figura clone();
	
	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Figura)) return false;
		Figura figura = (Figura) object;
		return figura.x == x && figura.y ==y && Objects.equals(figura.color, color);
	}

}

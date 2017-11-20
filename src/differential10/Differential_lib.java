package differential10;

import differential10.Differential_if;

public class Differential_lib implements Differential_if{

	private double a, h;
	
	public Differential_lib(double a, double h) {
		this.a = a;
		this.h = h;
	}

	@Override
	public double getRx() {
		// TODO Auto-generated method stub
		return 2 * this.a;
	}



	@Override
		public double getDx() {
		// TODO Auto-generated method stub
			return(Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;
		}
	
		private double d, e;
	
		public double geterror() {
			d = Math.abs(getRx() - getDx());
			e = d/getRx()*100;
			return(e);	
		}

}

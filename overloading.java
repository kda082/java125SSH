package javastudy;

public class overloading {

	
	public static void main(String[] args) {
		captiontv tt = new captiontv();
		System.out.println(tt.t.power);
	
	}

}

class tv{
	boolean power;
	int channel;
	
	
	tv(){
		this(false,1);
	}
	tv(boolean p,int c){
		this.power = p;
		this.channel = c;
	}

	public String toString() {
		return this.power + ","  + this.channel;
	}
	
}


class captiontv {
	tv t = new tv();
	 void caption() {
		System.out.println("¤¾¤·");
	}
}
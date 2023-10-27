package _21670310075_Albaraa_Basha;

public class _21670310075_3x8Decoder {

	private int x;
	private int y;
	private int z;

	public _21670310075_3x8Decoder(int x, int y, int z) {
		if((x==0||x==1) & (y==0 || y==1) & ( z==0 || z==1)) {
			this.x=x;
			this.y=y;
			this.z=z;
		}
		else
	        throw new IllegalArgumentException("Geçersiz değer. Lütfen yalnızca 0 veya 1 girin.");
	}
	
	private int NOT(int a) {
		if(a==1)
			return 0;
		return 1;
	}
	
	private boolean AND(int w, int a, int b, int c) {
		if(w==1 & a==1 & b==1 & c==1)
			return true;
		return false;
	}
	
	public String decode(int w) {
		if(AND(w,NOT(x),NOT(y),NOT(z)))
			return "10000000";
		else if(AND(w,NOT(x),NOT(y),z))
			return "01000000";
		else if(AND(w,NOT(x),y,NOT(z)))
			return "00100000";
		else if(AND(w,NOT(x),y,z))
			return "00010000";
		else if(AND(w,x,NOT(y),NOT(z)))
			return "00001000";
		else if(AND(w,x,NOT(y),z))
			return "00000100";
		else if(AND(w,x,y,NOT(z)))
			return "00000010";
		else if(AND(w,x,y,z))
			return "00000001";
	
		return "00000000";
	}
}

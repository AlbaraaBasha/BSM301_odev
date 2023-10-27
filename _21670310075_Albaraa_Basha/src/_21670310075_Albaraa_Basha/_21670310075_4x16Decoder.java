package _21670310075_Albaraa_Basha;

public class _21670310075_4x16Decoder {
	
	private int x;
	private int y;
	private int z;
	private int w;

	public _21670310075_4x16Decoder(int x, int y, int z, int w) {
		if((x==0||x==1 ) & (y==0 || y==1) & (z==0 || z==1 ) & ( w==0 || w==1)) {
			this.x=x;
			this.y=y;
			this.z=z;
			this.w=w;
		}
		else 
	        throw new IllegalArgumentException("Geçersiz değer. Lütfen yalnızca 0 veya 1 girin.");
	}
	
	private int NOT(int a) {
		if(a==1)
			return 0;
		return 1;
	}
	
	public String decode() {
		_21670310075_3x8Decoder D3to8_1 = new _21670310075_3x8Decoder(y,z,w);
		return D3to8_1.decode(NOT(x)) + D3to8_1.decode(x) ;
		
		
	}
	
}

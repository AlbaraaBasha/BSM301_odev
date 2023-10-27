package _21670310075_Albaraa_Basha;

public class _21670310075_SC {
	
	private String sequence;
	private String[] bit;

    public _21670310075_SC() {
        this.sequence = "0000";
    }

    public String getSequence() {
    	
    	bit= sequence.split("");
    	int bit0= Integer.parseInt(bit[0]);
		int bit1= Integer.parseInt(bit[1]);
		int bit2= Integer.parseInt(bit[2]);
		int bit3= Integer.parseInt(bit[3]);
    	 _21670310075_4x16Decoder sc = new _21670310075_4x16Decoder(bit0,bit1,bit2,bit3);
        String zaman= sc.decode();
        
    	 if(zaman.equals("1000000000000000"))
    	 return "T0";
    	 else if(zaman.equals("0100000000000000"))
    	     return "T1";
    	 else if(zaman.equals("0010000000000000"))
        	 return "T2";
    	 else if(zaman.equals("0001000000000000"))
        	 return "T3";
    	 else if(zaman.equals("0000100000000000"))
        	 return "T4";
    	 else if(zaman.equals("0000010000000000"))
        	 return "T5";
    	 else if(zaman.equals("0000001000000000"))
        	 return "T6";
    	 else if(zaman.equals("0000000100000000"))
        	 return "T7";
    	 else if(zaman.equals("0000000010000000"))
        	 return "T8";
    	 else if(zaman.equals("0000000001000000"))
        	 return "T9";
    	 else if(zaman.equals("0000000000100000"))
        	 return "T10";
    	 else if(zaman.equals("0000000000010000"))
        	 return "T11";
    	 else if(zaman.equals("0000000000001000"))
        	 return "T12";
    	 else if(zaman.equals("0000000000000100"))
        	 return "T13";
    	 else if(zaman.equals("0000000000000010"))
        	 return "T14";
    	 else if(zaman.equals("0000000000000001"))
        	 return "T15";
    	 
    	 
    	 return null;
    }

    public void INR() {
        int sayac = Integer.parseInt(sequence, 2);
        sayac = (sayac + 1) % 16; 
        sequence = String.format("%04d", Integer.parseInt(Integer.toBinaryString(sayac)));
    }
    
    public void silme() {
    	this.sequence = "0000";
    }
    

}

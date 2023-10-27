package _21670310075_Albaraa_Basha;

public class _21670310075_IR {
	private String[] bit;
	private String I;
	private String OPR;
	
	
	public String kodCOZ(String buyruk) {
		bit = buyruk.split("");
		I = bit[0];
		int bit14= Integer.parseInt(bit[1]);
		int bit13= Integer.parseInt(bit[2]);
		int bit12= Integer.parseInt(bit[3]);
		_21670310075_3x8Decoder D38 = new _21670310075_3x8Decoder(bit14,bit13,bit12);
		OPR= D38.decode(1);
		buyruk = buyruk.substring(4);
		  if (OPR.equals("00000001")) {
	            OPR = "D7";
	            if (I.equals("1"))
	                return "I=" + I + " " + OPR + " " + "IR(11-0)=" + buyruk + " buyruk= " + G_C_buyruk(buyruk);
	            else if (I.equals("0"))
	                return "I=" + I + " " + OPR + " " + "IR(11-0)=" + buyruk + " buyruk= " + yazac_buyruk(buyruk);
	        } else if (OPR.equals("10000000"))
	            OPR = "D0";
	        else if (OPR.equals("01000000"))
	            OPR = "D1";
	        else if (OPR.equals("00100000"))
	            OPR = "D2";
	        else if (OPR.equals("00010000"))
	            OPR = "D3";
	        else if (OPR.equals("00001000"))
	            OPR = "D4";
	        else if (OPR.equals("00000100"))
	            OPR = "D5";
	        else if (OPR.equals("00000010"))
	            OPR = "D6";
		  
		  if(!OPR.equals("D7"))
			 return "I=" + I + " " + OPR + " " + "IR(11-0)=" + buyruk + " buyruk= " + bellek_buyruk(OPR);
		  
		  return null;
		  
	    }

	    public String yazac_buyruk(String buyruk) {
	        if (buyruk.equals("100000000000"))
	            return "CLA";
	        else if (buyruk.equals("010000000000"))
	            return "CLE";
	        else if (buyruk.equals("001000000000"))
	            return "CMA";
	        else if (buyruk.equals("000100000000"))
	            return "CME";
	        else if (buyruk.equals("000010000000"))
	            return "CIR";
	        else if (buyruk.equals("000001000000"))
	            return "CIL";
	        else if (buyruk.equals("000000100000"))
	            return "INC";
	        else if (buyruk.equals("000000010000"))
	            return "SPA";
	        else if (buyruk.equals("000000001000"))
	            return "SNA";
	        else if (buyruk.equals("000000000100"))
	            return "SZA";
	        else if (buyruk.equals("000000000010"))
	            return "SZE";
	        else if (buyruk.equals("000000000001"))
	            return "HLT";

	        return null;
	    }

	    public String G_C_buyruk(String buyruk) {
	        if (buyruk.equals("100000000000"))
	            return "INP";
	        else if (buyruk.equals("010000000000"))
	            return "OUT";
	        else if (buyruk.equals("001000000000"))
	            return "SKI";
	        else if (buyruk.equals("000100000000"))
	            return "SKO";
	        else if (buyruk.equals("000010000000"))
	            return "ION";
	        else if (buyruk.equals("000001000000"))
	            return "IOF";

	        return null;
	    }

	    public String bellek_buyruk(String OPR) {
	        if (OPR.equals("D0"))
	            return "AND";
	        else if (OPR.equals("D1"))
	            return "ADD";
	        else if (OPR.equals("D2"))
	            return "LDA";
	        else if (OPR.equals("D3"))
	            return "STA";
	        else if (OPR.equals("D4"))
	            return "BUN";
	        else if (OPR.equals("D5"))
	            return "BSA";
	        else if (OPR.equals("D6"))
	            return "ISZ";

	        return null;
	    }
	}

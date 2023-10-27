package _21670310075_Albaraa_Basha;

public class _21670310075_Kontrol_Sinyalleri {
	
	public static void FETCH() {
		_21670310075_SC counter = new _21670310075_SC();     
		_21670310075_RAM ram = new _21670310075_RAM();        
		_21670310075_IR ir = new _21670310075_IR();
		
	 try {
      
         for(int i =0;i<=15;i++) {
        	 System.out.println(counter.getSequence()+" Zamanında "+ ir.kodCOZ(ram.getBuyruk(i)));
        	 counter.INR();
         Thread.sleep(1000); 
                 }
    } catch (InterruptedException e) {
         e.printStackTrace();
     }
	
	
	}

}

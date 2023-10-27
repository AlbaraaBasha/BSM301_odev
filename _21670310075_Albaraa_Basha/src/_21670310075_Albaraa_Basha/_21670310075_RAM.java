package _21670310075_Albaraa_Basha;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class _21670310075_RAM {

	private LinkedList<String> RAM = new LinkedList<>();
	private String line;

    public _21670310075_RAM() {
        File file = new File("RAM.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                RAM.add(line);
            }
            System.out.println("RAM.txt dosyası okundu.");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<String> getRAM() {
        return RAM;
    }
    
    public String print1() {
        return RAM.get(0);
    }
    public String getBuyruk(int i) {
        return RAM.get(i);
    }
    
    public void print() {
   	 for (String element : RAM) 
            System.out.println(element);
   }
}

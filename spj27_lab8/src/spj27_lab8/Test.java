package spj27_lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		String path = "data/recordList.txt";
		
		try {
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Yo mama");
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

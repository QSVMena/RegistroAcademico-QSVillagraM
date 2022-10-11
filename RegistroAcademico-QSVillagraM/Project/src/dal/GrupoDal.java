package dal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dol.Grupo;

public class GrupoDal {
	
	private String fileName;
	private String filePath;
	
	public void save(Grupo g) {
		File file= new File (filePath +"//"+ fileName);
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream (file));
			os.writeObject(g);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Grupo Open() {
		
		File file = new File(filePath);
		
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream(file));
			Grupo g = (Grupo)oi.readObject();
			oi.close();
			return g;
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
	}



}

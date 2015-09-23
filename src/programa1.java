import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import javax
import java.io.ObjectOutputStream;

public class programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream ficheiroSaida=null;
		ObjectOutputStream saida=null;
		int arrayId[] = {1,2,3,4,5};
		String arrayNomes[] = {"Ipod","Iphone","Ipad","Ipen","Iwine"};
		double arrayPrezos[] = {300.4,600.0,500.4,100.5,75.5};
		try {
			 ficheiroSaida = new FileOutputStream("productos.dat");
			 saida = new ObjectOutputStream(ficheiroSaida);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception erro){
		      System.out.println("Outro erro");
		      erro.printStackTrace();
		    }
		for (int i=0;i<arrayId.length;i++){
    		Producto uno = new Producto(arrayId[i],arrayNomes[i],arrayPrezos[i]);
    		escribe(uno,saida);
    	}
		try {
			saida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		leer();
		
	}
	
	
	 public static void escribe(Producto prod,ObjectOutputStream oos){
		    try{ 
		    	//oos.writeObject(prod);
		    	oos.writeUnshared(prod);
		      //saida.close();
		      
		    }
		    catch(IOException erro){
		      System.out.println("Erro E/S");
		    }
		    catch(Exception erro){
		      System.out.println("Outro erro");
		      erro.printStackTrace();
		    }
		  }//escribe

	 public static void leer(){
		    try{
		      FileInputStream ficheiroEntrada = new FileInputStream("productos.dat");
		      ObjectInputStream saida = new ObjectInputStream(ficheiroEntrada);
		      while(ficheiroEntrada.available()>0){
		    	  Producto produc = (Producto) saida.readObject();
			      System.out.println("Datos de producto: "+produc.getId()+", "+produc.getNome()+" , "+produc.getPrezo());
		      }
		      saida.close();
		    }
		    catch(IOException erro){
		      System.out.println("Erro E/S");
		    }
		    catch(Exception erro){
		      System.out.println("Outro erro");
		      erro.printStackTrace();
		    }
		  }//lePersoa
	 
}

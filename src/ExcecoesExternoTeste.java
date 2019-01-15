import java.io.IOException;

public class ExcecoesExternoTeste {

	public static void main(String[] args) {
		
		try {
			
			metodo1();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		

	}
	
	public static void metodo1() throws Exception{
		
		try {
			
			throw new Exception("Exceção do metodo2");
			
		}catch(IOException e) {
			

			
		}
		
	}
	


}

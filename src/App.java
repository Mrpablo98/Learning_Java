import javax.swing.*;
public class App {
    public static void main(String[] args) {
		
		String clave="contraseña";
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña");
			
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Contraseña incorrecta");
				
			}
		}

	}
}

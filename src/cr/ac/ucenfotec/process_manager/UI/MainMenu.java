package cr.ac.ucenfotec.process_manager.UI;

import cr.ac.ucenfotec.process_manager.Annotations.MongoAttr;
import cr.ac.ucenfotec.process_manager.ArchitectureComponents.MongoConnection;
import cr.ac.ucenfotec.process_manager.Classes.Usuario;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario newUser = new Usuario();
		newUser.set_id("116810122");
		newUser.set_fname("Gary");
		newUser.set_lname("Valverde");
		
		MongoConnection.GetInstance().Insert(newUser);
	}

}

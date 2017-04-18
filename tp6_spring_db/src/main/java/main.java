import com.m2i.formation.model.SpringJDBC;
import com.m2i.formation.business.Employe;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SpringJDBC springJDBC = new SpringJDBC();
		/*
		Employe employe = SpringJDBC.getEmployeById(2);
		System.out.println("Employé : " + employe.getLogin());
		System.out.println("ID : " + employe.getID());
		System.out.println("Nom : " + employe.getNom());
		System.out.println("Prénom : " + employe.getPrenom());
		System.out.println("Email : " + employe.getEmail());
		System.out.println("Role : " + employe.getRole());
		System.out.println("Mot de passe : " + employe.getPassword());
		*/
		//Employe ajout = new Employe(4, "Michel2", "Truc2", "Bidule2","Michel3", "Truc3", "Bidule3" ) ;
		//springJDBC.saveEmploye(ajout);
	System.out.println("Entrée ajout");
		Employe ajout = new Employe(7, "Michel3", "Truc4", "Bidule5","Michel6", "Truc7", "Bidule8" ) ;
		System.out.println("OK2");	
		springJDBC.saveEmployeJDBCTemplate(ajout);
		
		
		//Employe employe2 = SpringJDBC.getEmployeJDBCTemplate(2);
		
		
	}

}

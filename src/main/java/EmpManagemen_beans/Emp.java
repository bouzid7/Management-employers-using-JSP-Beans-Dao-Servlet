package EmpManagemen_beans;

public class Emp {

		private int id,matricule;  
		private String nom,prenom,gender,statut,email,dateN,service,ville;  
		
		
		//getters
		public int getId() {  
		    return id;  
		} 
		
		public int getMatricule() {  
		    return matricule;  
		}
		
		public String getNom() {  
		    return nom;  
		}
		
		
		public String getPrenom() {  
		    return prenom;  
		} 
		
		public String getEmail() {  
		    return email;  
		}
		
		public String getDateN() {  
		    return dateN;  
		}
		
		public String getService() {  
		    return service;  
		} 
		
		public String getVille() {  
		    return ville;  
		} 
		
		public String getGender() {  
		    return gender;  
		} 
		
		public String getStatut() {  
		    return statut;  
		} 
		
		
		
		//setters
		
		public void setId(int id) {  
		    this.id = id;  
		}  
		
		public void setMatricule(int matricule) {  
		    this.matricule = matricule;  
		}
		
		public void setNom(String nom) {  
		    this.nom = nom;  
		}  
		
		public void setPrenom(String prenom) {  
		    this.prenom = prenom;  
		}  
		
		public void setEmail(String email) {  
		    this.email = email;  
		}  
		
		public void setDateN(String date) {  
		    this.dateN = date;
		}
		
		public void setService(String service) {  
		    this.service = service;
		}
		
		public void setVille(String ville) {  
		    this.ville = ville;
		}
		
		public void setGender(String gender) {  
		    this.gender = gender;
		}
		
		public void setStatut(String statut) {  
		    this.statut = statut;
		}
		
		
		
	
	}
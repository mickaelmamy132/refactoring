package iut.bad;

public class Humain implements Consommation {

	protected String nom;
	protected String prenom;
	protected int age;
	
	@Override
	public String toString() {
		System.out.println(nom + prenom + age);
	    return nom + " " + prenom + " a " + age + " ans.";   
	}

	public void details() {
	    System.out.println(toString());
	}
	
	  /* (non-Javadoc)
	 * @see iut.bad.Consommation#manger()
	 */
	@Override
	public void manger() {
	        System.out.println(nom + " mange.");
	    }

	    /* (non-Javadoc)
		 * @see iut.bad.Consommation#boire()
		 */
	    @Override
		public void boire() {
	        System.out.println(nom + " boit.");
	    }
	    
	    public void ami(Humain h) {
	        ami(h, 100);
	    }

	    public void ami(Humain h, int jours) {
	        System.out.println(this.nom + " est ami avec " + h.nom + " depuis " + jours + " jours.");
	    }





}

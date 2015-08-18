import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

public class Colleague implements Referenceable {
	private String name;
	private String number;
	private String adress;
	
	public Colleague () {
	}
	
	public Colleague ( String name, String number, String adress) {
		this.name=name;
		this.number=number;
		this.adress=adress;
	}
	
	public String getName() { return name; }
	
	public void setName ( String name ) { this.name = name; }
	
	public String getNumber () { return number; }
	
	public void setNumber ( String number ) { this.number = number; }
	
	public String getAdress () { return adress; }
	
	public void setAdress ( String adress ) { this.adress = adress; }
	
	@Override
	public Reference getReference () throws NamingException {
		Reference reference = new Reference (Colleague.class.getName());
		
		reference.add(new StringRefAddr("name", this.name));
		reference.add(new StringRefAddr("number", this.number));
		reference.add(new StringRefAddr("adress", this. adress));
		
		return reference;
	}

}


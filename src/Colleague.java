import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

public class Colleague implements Referenceable {
	public static final String NAME = "name";
	public static final String NUMBER = "number";
	public static final String ADDRESS = "address";
	private String name;
	private String number;
	private String address;
	
	public Colleague () {
	}
	
	public Colleague ( String name, String number, String address) {
		this.name=name;
		this.number=number;
		this.address=address;
	}
	
	public String getName() { return name; }
	
	public void setName ( String name ) { this.name = name; }
	
	public String getNumber () { return number; }
	
	public void setNumber ( String number ) { this.number = number; }
	
	public String getAddress () { return address; }
	
	public void setAddress ( String address ) { this.address = address; }
	
	@Override
	public Reference getReference () throws NamingException {
		Reference reference = new Reference ( Colleague.class.getName(), ColleagueFactory.class.getName(), null );
		
		reference.add(new StringRefAddr(NAME, this.name));
		reference.add(new StringRefAddr(NUMBER, this.number));
		reference.add(new StringRefAddr(ADDRESS, this.address));
		
		return reference;
	}
	
	@Override
	public String toString() {
		return "Colleague {" +
				"name: '" + name + '\'' +
				", number: '" + number + '\'' +
				", address: '" + address +
				"'}";
	}

}


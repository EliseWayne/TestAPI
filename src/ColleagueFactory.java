import javax.naming.Context;
import javax.naming.Name;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;
import java.util.Enumeration;
import java.util.Hashtable;

public class ColleagueFactory implements ObjectFactory {
	@Override
	public Object getObjectInstance (Object obj, Name name, Context nameCtx, Hashtable<?,?> environment) throws Exception {
		if ( !(obj instanceof Reference) )
			return null;
		Reference reference = (Reference) obj;
		if ( !Colleague.class.getName().equals(reference.getClassName()) )
			return null;
		Colleague colleague = new Colleague();
		
		Enumeration<RefAddr> addresses = reference.getAll();
		
		while ( addresses.hasMoreElements() ) {
			RefAddr addr = addresses.nextElement();
			switch ( addr.getType() ) {
			case Colleague.NAME:
				colleague.setName( (String) addr.getContent() );
				break;
			case Colleague.NUMBER:
				colleague.setNumber( (String) addr.getContent() );
				break;
			case Colleague.ADDRESS:
				colleague.setAddress( (String) addr.getContent() );
				break;
			}
		}
		
		return colleague;
	}

}

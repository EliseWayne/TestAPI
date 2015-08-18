import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingException;
import java.util.Enumeration;
import java.util.Hashtable;
import com.sun.jndi.fscontext.RefFSContextFactory;


public class TestAPI {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		Hashtable<String, String> environment = new Hashtable<String, String>();
		environment.put(Context.INITIAL_CONTEXT_FACTORY, RefFSContextFactory.class.getName() );
		environment.put(Context.PROVIDER_URL, "file://C:/Users/Elisabeth/");
		
		
		Context context = new InitialContext (environment);
		
		context.rebind( "colleague Brian", new Colleague ( "Brian", "0601020304", "2, rue des Mimosas, Cagnes-sur-Mer") );
				
		Object colleagueBrian = context.lookup("colleague Brian");
		System.out.println(colleagueBrian.getClass().getName());
		System.out.println(colleagueBrian);
		
		
		//Test
		// Colleague colleagueBrian = new Colleague ("Brian", "0601020304", "2, rue des Mimosas, Cagnes-sur-Mer");
		// context.bind("colleague Brian",  colleagueBrian);
		
		//context.rebind( "colleague Laurent", new Colleague ("Laurent", "0601020305", "3, avenue des Glycines, Saint-Laurent-du-Var") );
		//Colleague colleagueLaurent = new Colleague ("Laurent", "0601020305", "3, avenue des Glycines, Saint-Laurent-du-Var");
		//context.bind("Colleague Laurent", colleagueLaurent);
		//Object colleagueLaurent = context.lookup("colleague Laurent");
		//System.out.println(colleagueLaurent.getClass().getName());
		//System.out.println(colleagueLaurent);
		
		// Colleague colleagueTobias = new Colleague ("Tobias", "0601020306", "4, chemin des Eucalyptus, Nice");
		// context.bind("Colleague Tobias", colleagueTobias);
		//Object colleagueTobias = context.lookup("colleague Tobias");
		//System.out.println(colleagueTobias.getClass().getName());
		//System.out.println("colleagueTobias");
			
		// Colleague colleagueIyad = new Colleague ("Iyad", "0601020307", "5, route des Tournesols, Villeneuve-Loubet");
		// context.bind("Colleague Iyad", colleagueIyad);
		
		// Colleague colleagueCode = new Colleague ("Code", "0601020308", "6, traverse des Tulipes, Cannes");
		// context.bind("Colleague Code", colleagueCode);
		

	}

}

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Hashtable;


public class TestAPI {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		Hashtable<String, String> environment = new Hashtable<String, String>();
		environment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
		environment.put(Context.PROVIDER_URL, "D:/");
		
		
		Context context = new InitialContext (environment);
		
		Colleague colleagueBrian = new Colleague ("Brian", "0601020304", "2, rue des Mimosas, Cagnes-sur-Mer");
		context.bind("colleague Brian",  colleagueBrian);
		Colleague colleagueLaurent = new Colleague ("Laurent", "0601020305", "3, avenue des Glycines, Saint-Laurent-du-Var");
		context.bind("Colleague Laurent", colleagueLaurent);
		Colleague colleagueTobias = new Colleague ("Tobias", "0601020306", "4, chemin des Eucalyptus, Nice");
		context.bind("Colleague Tobias", colleagueTobias);
		Colleague colleagueIyad = new Colleague ("Iyad", "0601020307", "5, route des Tournesols, Villeneuve-Loubet");
		context.bind("Colleague Iyad", colleagueIyad);
		Colleague colleagueCode = new Colleague ("Code", "0601020308", "6, traverse des Tulipes, Cannes");
		context.bind("Colleague Code", colleagueCode);
		

	}

}

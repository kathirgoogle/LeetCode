package EJB2;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ejbwork
 */
@Stateless
@LocalBean
public class ejbwork implements ejbworkLocal {

    /**
     * Default constructor. 
     */
    public ejbwork() {
        // TODO Auto-generated constructor stub
    	System.out.println(" Inside Enterprise Java Beans");
    }

}

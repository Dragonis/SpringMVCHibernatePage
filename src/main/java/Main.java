import com.springapp.mvc.model.Car;
import com.springapp.mvc.model.Motorbike;
import com.springapp.mvc.model.Refuelable;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.worldCountryEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dragonis on 16.08.2015.
 */
public class Main {

    public static void main(final String[] args) throws Exception {
        final Session session = HibernateUtil.getSession();
        try {
            System.out.println("querying all the managed entities...");
//            final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
//            for (Object key : metadataMap.keySet()) {
//                final ClassMetadata classMetadata = (ClassMetadata) metadataMap.get(key);
//                final String entityName = classMetadata.getEntityName();
//                final Query query = session.createQuery("from " + entityName);
//                System.out.println("executing: " + query.getQueryString());
//                for (Object o : query.list()) {
//                    System.out.println("  " + o);
//                }
//
//
//            }

            final Query query1 = session.createQuery("from worldCountryEntity ");
            List list1 = query1.list();
            for (Object aList1 : list1) {
                worldCountryEntity world = (worldCountryEntity) aList1;
                System.out.println(world.getName());
            }
//            session.save(new worldCountryEntity().setName("WojtekS"););

            zatankujPojazdyJezdzaceNaPaliwie();

        } finally {
            session.close();
        }
    }

    private static void zatankujPojazdyJezdzaceNaPaliwie() {
        List<Refuelable> vehicles = new ArrayList<Refuelable>();
        vehicles.add(new Car());
        vehicles.add(new Motorbike());
        for(Refuelable vehicle : vehicles)
        {
            System.out.println(vehicle.refuel());
        }
    }
}

package ext;
import dao.IDao;
public class DoaImpl2  implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double data=55;
        return data;
    }
}

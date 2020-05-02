import com.elgo.DAO_API;
import com.elgo.Personnel;
import com.elgo.PersonnelBuilder;
import com.elgo.PersonnelDAO;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PersonnelDAOTest {
    private static DAO_API<Personnel> personnelDAO_api;

    @Test
    public void personnelDAO() {
        personnelDAO_api = new PersonnelDAO();
        personnelDAO_api.save( new PersonnelBuilder("Lopy", "Douglas", 3).setDateDeNaissance(2020,9,19).getPersonnel());

        Personnel p4 = new PersonnelBuilder("DAVID", "Henry", 4).setDateDeNaissance(2000,7,4).getPersonnel();
        personnelDAO_api.save(p4);
        personnelDAO_api.update(p4, new String[]{"Jake", "Henry"});
        personnelDAO_api.delete(p4);
        personnelDAO_api.getAll().forEach(personnel -> personnel.print());

    }
}
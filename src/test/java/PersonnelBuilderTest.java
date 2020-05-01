import java.util.ArrayList;

import com.elgo.Personnel;
import com.elgo.PersonnelBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonnelBuilderTest {
    @Test
    public void createPersonnel() {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(06);
        a1.add(01);

        PersonnelBuilder pers = new PersonnelBuilder("DIEYE", "Gora", 1);
        Personnel pers1 = pers.setDateDeNaissance(2020,9,19).getPersonnel();
        Personnel pers2 = pers.setDateDeNaissance(1988, 8, 10).setNumTel(a1).getPersonnel();
        Personnel pers3 = new PersonnelBuilder("SILVER", "Bril", 3).setDateDeNaissance(1998,8,3).setNumTel(a1).getPersonnel();
        Personnel pers4 = new PersonnelBuilder("DAVID", "Henry", 4).setDateDeNaissance(2000,7,4).setNumTel(a1).getPersonnel();

        pers1.print();
        pers3.print();
    }
}
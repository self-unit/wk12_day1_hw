import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Harold Dempsey", 1119274, 18000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Harold Dempsey", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(1119274, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(18000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(19000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(180.00, databaseAdmin.payBonus(), 0.01);
    }
}

import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Pete Mitchel", 5829399, 34000.00, "Services Delivery");
    }

    @Test
    public void hasName() {
        assertEquals("Pete Mitchel", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(5829399, manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(34000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Services Delivery", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(39000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(340.00, manager.payBonus(), 0.01);
    }
}

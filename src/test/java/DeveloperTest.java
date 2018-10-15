import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Teres Jones", 2848778, 26000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Teres Jones", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(2848778, developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(26000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(3000.00);
        assertEquals(29000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(260.00, developer.payBonus(), 0.01);
    }
}

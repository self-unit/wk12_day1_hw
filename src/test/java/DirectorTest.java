import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Phillip Morris", 9275023, 120000.00, "Board of Directors", 2400000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Phillip Morris", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(9275023, director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(120000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Board of Directors", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(12000.00);
        assertEquals(132000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(2400.00, director.payBonus(), 0.01);
    }

    @Test
    public void getBudget() {
        assertEquals(2400000.00, director.getBudget(), 0.01);
    }

    @Test
    public void changeName() {
        director.setName("Eisenhower Dumkopf");
        assertEquals("Eisenhower Dumkopf", director.getName());
    }

    @Test
    public void cantInputNullChangeName() {
        director.setName("");
        assertEquals("Phillip Morris", director.getName());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    //1. can we test if the object created can be instantiated?
public void testIfIdIsLongNumber(){
        Student aStudent = new Student(0,"vanessa");
        assertNotNull(aStudent); //checking if NOT a null

        Student bStudent = null;
        assertNull(bStudent); //checking if NOT a null, so it fails when using "assertNotNull" because is IS a null
    }

    //2. Create the placeholders for the fields(in the class) then test

        @Test
        public void testIfFieldsAreSet(){
        Student c = new Student(1L, "c");
        assertEquals(1L, c.getId());

        Student d = new Student(40L,"d");
        assertEquals(40L, d.getId());
        assertEquals("d", d.getName());
    }

}

//test for nothing (null, 0)
//test for one (anything positive)
//test for many (anything negative)

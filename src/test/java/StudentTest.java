import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    //can we test if the object created can be instantiated?
public void testIfIdIsLongNumber(){
        Student aStudent = new Student(0,"vanessa");
        assertNotNull(aStudent); //checking if NOT a null

        Student bStudent = null;
        assertNull(bStudent);

    }
}

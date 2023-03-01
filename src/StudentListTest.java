import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class StudentListTest {
    private List<String> students = new ArrayList<String>();

    public void remove(String name) {
        students.remove(name);
    }

    public void add(String name) {
        students.add(name);
    }

    public void removeAll() {
        students.clear();
    }

    public int sizeOfStudent() {
        return students.size();
    }

    StudentListTest list = null;

    @Before
    public void setUp() throws Exception {
        list = new StudentListTest();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void testAdd() {
        list.add("Ali");
        list.add("Amal");
        list.add("Kamal");
        list.add("Amine");
        assertEquals("Ajout de 4 étudiants à la liste", 4, list.sizeOfStudent());
    }

    @Test
    public void testRemove() {
        list.add("Fatima");
        list.add("Amine");
        list.remove("Amine");
        assertEquals("Suppression d'un étudiant de la liste", 1, list.sizeOfStudent());
    }

    @Test
    public void testRemoveAll() {
        list.add("Ali");
        list.add("Amal");
        list.removeAll();
        assertEquals("Suppression de tous les étudiants de la liste", 0, list.sizeOfStudent());
    }
}

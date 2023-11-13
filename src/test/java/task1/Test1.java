package task1;

import org.junit.*;
import org.junit.Test;

public class Test1 {

    // Перед началом тестов

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass - This will be executed once before all tests in this class.");
    }
    // После каждого теста
    @Before
    public void setUp() {
        System.out.println("Before - This will be executed before each test.");
    }
    // Само тестирование, какого-то отдельного метода
    @Test
    public void testMethod1() {
        System.out.println("Test Method 1 - This is a sample test.");
    }
    // Само тестирование, какого-то отдельного метода
    @Test
    public void testMethod2() {
        System.out.println("Test Method 2 - This is another sample test.");
    }
    // Перед каждым тестом
    @After
    public void tearDown() {
        System.out.println("After - This will be executed after each test.");
    }
    // После всего пака тестирований. Закрывает что-либо и т.д.
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass - This will be executed once after all tests in this class.");
    }
}
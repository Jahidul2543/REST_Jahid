package RestAssuredCoreTest;

import org.testng.annotations.Test;

public class testThread {
    @Test
    public void testThread(){
        System.out.println("this is a test");
        System.out.println("Thread id"+Thread.currentThread().getId());
    }
    @Test
    public void testThread2(){
        System.out.println("this is a test");
        System.out.println("Thread id2"+Thread.currentThread().getId());
    }
    @Test
    public void testThread3(){
        System.out.println("this is a test");
        System.out.println("Thread id3"+Thread.currentThread().getId());
    }
    @Test
    public void testThread4(){
        System.out.println("this is a test");
        System.out.println("Thread id4"+Thread.currentThread().getId());
    }
    @Test
    public void testThread5(){
        System.out.println("this is a test");
        System.out.println("Thread id5"+Thread.currentThread().getId());
    }
}

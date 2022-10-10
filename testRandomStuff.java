/*
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * Oct 7, 2022
 * mac OS 12
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class testRandomStuff {
    
    @Test
    public void testHighest(){
        RandomStuff test = new RandomStuff();
        test.highest();//the method needs to be run in order to set the classes highest value

        assertTrue(test.getHighElement() >= test.getRandomArray(0));
        assertTrue(test.getHighElement() >= test.getRandomArray(1));
        assertTrue(test.getHighElement() >= test.getRandomArray(2));
        assertTrue(test.getHighElement() >= test.getRandomArray(3));
        assertTrue(test.getHighElement() >= test.getRandomArray(4));
        assertTrue(test.getHighElement() >= test.getRandomArray(5));
        assertTrue(test.getHighElement() >= test.getRandomArray(6));
        assertTrue(test.getHighElement() >= test.getRandomArray(7));
        assertTrue(test.getHighElement() >= test.getRandomArray(8));
        assertTrue(test.getHighElement() >= test.getRandomArray(9));
        
    }
  
    @Test
    public void testLowest(){
        RandomStuff test = new RandomStuff();

        test.lowest();//the method needs to be run in order to set the classes lowest value

        assertTrue(test.getLowElement() <= test.getRandomArray(0));
        assertTrue(test.getLowElement() <= test.getRandomArray(1));
        assertTrue(test.getLowElement() <= test.getRandomArray(2));
        assertTrue(test.getLowElement() <= test.getRandomArray(3));
        assertTrue(test.getLowElement() <= test.getRandomArray(4));
        assertTrue(test.getLowElement() <= test.getRandomArray(5));
        assertTrue(test.getLowElement() <= test.getRandomArray(6));
        assertTrue(test.getLowElement() <= test.getRandomArray(7));
        assertTrue(test.getLowElement() <= test.getRandomArray(8));
        assertTrue(test.getLowElement() <= test.getRandomArray(9));

    }
}

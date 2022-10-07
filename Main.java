/*
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * Oct 7, 2022
 * mac OS
 */
public class Main{
    private static RandomStuff random = new RandomStuff();
    public static void main(String[] args) throws Exception{
        System.out.println(random.getArryAsString() + "\n");
        System.out.println(random.getReveresedArryAsString() + "\n");
        System.out.println(random.firstAndLast() + "\n");
        System.out.println(random.getOddIndexesAsString());
        System.out.println(random.getOddElementsAsString() + "\n");
        System.out.println(random.highest() + "\n");
        System.out.println(random.lowest() + "\n");
        System.out.println(random.getAverageAsString() + "\n");
        System.out.println(random.getHighElement() + "\n");
    }
}
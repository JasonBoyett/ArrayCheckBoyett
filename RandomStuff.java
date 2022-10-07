/*
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * Oct 7, 2022
 * mac OS
 */
public class RandomStuff {
    private int range = 100;
    private int randomArray[] = new int[10];
    private int lowElement = 101;//this is set above the range of possible values so that a test will fail if this is not set
    private int highElement = -1;//this is set below the range of possible values so that a test will fail if this is not set
    
    public RandomStuff(){//the constructor populates the array of random numbers
        for(int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(Math.random()*range);
        }
    }

    public String getArryAsString(){//returns the random number array as a string
        String printThis = "List:\n";
        for(int i = 0; i < randomArray.length; i++) {
            printThis += randomArray[i] + "\n";
        }
        return printThis;
    }

    public String getReveresedArryAsString(){//returns the reversed array as a string
        String printThis = "Reversed:\n";
        for(int i = randomArray.length-1; i >= 0; i--) {
            printThis += randomArray[i] + "\n";
        }
        return printThis;
    }

    public String firstAndLast(){//returns the first and last element of the array as a string
        return  "First: " + randomArray[0] + " Last: " + randomArray[randomArray.length-1];
    }

    public String getOddIndexesAsString(){//returns the odd indexed elements of the array as a string
        String printThis = "Odd Indexes:\n";
        for(int i = 0; i < randomArray.length; i += 2) {
            printThis += randomArray[i] + "\n";
        }
        return printThis;
    }

    public String getOddElementsAsString() {//returns the odd values of the array as a string
        String printThis = "Odd Values:\n";
        for(int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] % 2 != 0){ 
                printThis += randomArray[i] + "\n";
            }
        }
        return printThis;
    }

    public String highest(){//returns a string that indicates the highest valued element and its index
        int high = 0;
        int highestIndex = 0;
        for(int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] > high){
                high = randomArray[i];
                highestIndex = i;
            }
        }
        this.highElement = high;
        return "The highest element is " + high + " at index " + highestIndex + "\n";
    }

    public String lowest(){//returns a string that indicates the lowest value in the array and its index
        int low = range;
        int lowestIndex = 0;
        for(int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] < low){
                low = randomArray[i];
                lowestIndex = i;
            }
        }
        
        this.lowElement = low;
        return "The lowest element is " + low + " at index " + lowestIndex + "\n";
    }

    public String getAverageAsString(){//returns a string contaning the average of the elements in the array
        double sum = 0;
        for(int i = 0; i <randomArray.length; i++) {
            sum += (double)randomArray[i];
        }
        return "The average of the list is " + sum / randomArray.length + "\n";
    }

    public int[] getRandomArray() {//getter for the array
        return randomArray;
    }

    public int getRandomArray(int index){//getter for a given index of the array
        return randomArray[index];
    }

    public int getLowElement() {//getter for the low element
        return this.lowElement;
    }

    public int getHighElement() {//getter for the high element
        return this.highElement;
    }
}

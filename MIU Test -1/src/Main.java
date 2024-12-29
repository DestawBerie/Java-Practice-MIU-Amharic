
/*This is the funciotn that used to test the removal of duplicated 
 * items from the array
 */

public class Main {

    public static void main(String[] args) {
        int[] sampleData = { 1, 3, 2, 4, 5, 6, 6, 7, 7, 8, 8, 9 };
        int[] result = RemoveDuplicate(sampleData);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    static int[] RemoveDuplicate(int[] givenArray) {
        if (givenArray == null || givenArray.length == 0) {
            // return givenArray;
        } else {
            int[] output = new int[givenArray.length];
            int counter = 0;

            boolean isDuplicate = false;
            for (int i = 0; i < givenArray.length; i++) {
                isDuplicate = false;
                for (int j = 0; j < output.length; j++) {
                    if (givenArray[i] == output[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate == false) {
                    output[counter] = givenArray[i];
                    counter++;
                }

            }
            if (counter == output.length) {
                return output;
            } else {
                int[] filteredOutput = new int[counter];
                for (int x = 0; x < filteredOutput.length; x++) {
                    filteredOutput[x] = output[x];
                }
                return filteredOutput;
            }
        }
        return givenArray;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public Permutation() {

    }


    /**
     * A method that takes an array of integers and will return a collection
     * of integer list containing all permutations of inNumbers
     * @param inNumbers to that its permute is needed
     * @return List of Integer-List containing all possible permutations
     */
    public ArrayList<ArrayList<Integer>> permute(final int[] inNumbers) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < inNumbers.length; i++) {
            ArrayList<ArrayList<Integer>> current = new ArrayList<>();

            for (ArrayList<Integer> resultItem : result) {
                final int numberOfLocation = resultItem.size() + 1;
                for (int location = 0; location < numberOfLocation; location++) {
                    resultItem.add(location, inNumbers[i]);
                    ArrayList<Integer> temp = new ArrayList<>(resultItem);
                    current.add(temp);
                    resultItem.remove(location);
                }
            }
            result = new ArrayList<>(current);
        }
        return result;
    }


    public List<String> permute(String str) {
        final ArrayList<String> result = new ArrayList<>();
        return permute("", str, result);
    }

    private List<String> permute(final String prefix, final String str, final ArrayList<String> inOutResult) {
        int length = str.length();
        if (length == 0) {
           inOutResult.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, length), inOutResult);
            }
        }
        return inOutResult;
    }
}

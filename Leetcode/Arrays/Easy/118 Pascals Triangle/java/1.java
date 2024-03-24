import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> results = new ArrayList<>(); // result will an array with each element as an array itself

    if (numRows == 0)
      return results;

    List<Integer> firstRow = new ArrayList<>();
    firstRow.add(1);
    results.add(firstRow); // first row is always 1

    if (numRows == 1)
      return results;

    // we will start setting values from the 2nd rows as first row vlaue is always
    // [1]
    for (int i = 1; i < numRows; i++) { // i represents the rows for the triangle
      List<Integer> prevRow = results.get(i - 1);

      // Start setting the values for row
      List<Integer> row = new ArrayList<>();
      row.add(1); // first row value is always 1

      // add the middle row values starting from 2nd row to the 2nd last row with
      // respect to i ie from 1 to i-1
      // for 2nd row this condition will be false and hence we only return first and
      // last row value [1,1]
      for (int j = 0; j < i - 1; j++) { // j represets the columns(values) for each row i
        row.add(prevRow.get(j) + prevRow.get(j + 1)); // we will add the previous row's jth and the next j+1 row's value
      }

      row.add(1); // last row value is also always 1

      // add the new middle rows to the final result
      results.add(row);
    }

    return results;

  }
}

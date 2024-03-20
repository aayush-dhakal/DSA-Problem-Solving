class Solution {
  public void setZeroes(int[][] matrix) {
    // keep track of all the rows and columns where 0 is present
    String[] row = new String[matrix.length]; // by default the array will have values as null
    String[] col = new String[matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          // if an element value is 0 then update the value of its respective row and col
          // as something other than null
          row[i] = "0";
          col[j] = "0";
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        // if the particular row or column of an element has a marker as non null then
        // that sinifies its respective row or column has element as 0 so we have to
        // update the matrix value as 0
        if (row[i] != null || col[j] != null) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
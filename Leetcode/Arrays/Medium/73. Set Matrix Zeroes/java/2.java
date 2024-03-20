// better space complexity

class SetMatrixZeroes {

  public void setZeroes(int[][] matrix) {
    boolean firstRow = false, firstCol = false;

    // Set markers in first row and first column
    for (int i = 0; i < matrix.length; i++)
      for (int j = 0; j < matrix[0].length; j++)
        if (matrix[i][j] == 0) {
          if (i == 0)
            firstRow = true;
          if (j == 0)
            firstCol = true;
          matrix[0][j] = 0; // setting first column element as 0 for respective jth column
          matrix[i][0] = 0; // setting first row element as 0 for respective ith row
        }

    // Replace inner matrix
    for (int i = 1; i < matrix.length; i++)
      for (int j = 1; j < matrix[0].length; j++)
        if (matrix[i][0] == 0 || matrix[0][j] == 0)
          matrix[i][j] = 0; // if there is 0 in first row or first column for respective ith and jth indexes
                            // then set its value as 0

    // Last remaining checks
    if (firstRow)
      for (int j = 0; j < matrix[0].length; j++)
        matrix[0][j] = 0; // if firstRow has 0 element as value then replace every row value with 0

    if (firstCol)
      for (int i = 0; i < matrix.length; i++)
        matrix[i][0] = 0; // if firstCol has 0 element as value then replace every column value with 0
  }
}
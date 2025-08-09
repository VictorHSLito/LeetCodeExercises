class NumMatrix {
    private int sumMatrix[][];

    public NumMatrix(int[][] matrix) {
        int ROWS = matrix.length; // Tamanho da quantidade de arrays totais 
        int COLS = matrix[0].length; // Tamanho de um único array

        sumMatrix = new int[ROWS + 1][COLS + 1];

        for (int i = 0; i < ROWS; i++) {
            int prefix = 0; // Variável que armazenará a soma dos elementos
            for (int j = 0; j < COLS; j++) {
                prefix += matrix[i][j]; // Pega o elemento atual e o soma
                int next = sumMatrix[i][j+1]; // Pega o elemento seguinte da próxima coluna
                sumMatrix[i+1][j+1] = prefix + next; // Soma o elemento atual e o seguinte e armazena embaixo do seguinte
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int bottomRight = sumMatrix[row2][col2];
        int above = sumMatrix[row1 - 1][col2];
        int left = sumMatrix[row2][col1 - 1];
        int topLeft = sumMatrix[row1-1][col1-1];

        return bottomRight - above - left + topLeft;
    }
}

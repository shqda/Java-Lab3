package org.suai.lab3.matrix;

import org.suai.lab3.exceptions.BadMatrixSizesException;


public class MirrorMatrixHor extends Matrix {

    public MirrorMatrixHor(int rows, int cols)  {
        super(rows, cols);
    }

    public int getActualRows() {
        return (rows + 1) / 2;
    }

    @Override
    public void setElement(int row, int column, int value) throws BadMatrixSizesException {
        checkBounds(row, column);
        data[row][column] = value;
        data[mapRow(row)][column] = value;
    }

    private int mapRow(int row) {
        return rows - 1 - row;
    }
}

package org.suai.lab3.matrix;

import org.suai.lab3.exceptions.BadMatrixSizesException;


public class MirrorMatrixHor extends Matrix {

    public MirrorMatrixHor(int rows, int cols)  {
        super((rows + 1) / 2, cols);
    }

    @Override
    public int getRows() {
        if (rows % 2 == 0) return rows * 2;
        return rows * 2 - 1;
    }

    @Override
    public int getElement(int row, int column) throws BadMatrixSizesException {
        checkBounds(row, column);
        return data[mapRow(row)][column];
    }

    @Override
    public void setElement(int row, int column, int value) throws BadMatrixSizesException {
        checkBounds(row, column);
        data[mapRow(row)][column] = value;
    }

    private int mapRow(int row) {
        if (row < rows) return row;
        return getRows() - 1 - row;
    }

}

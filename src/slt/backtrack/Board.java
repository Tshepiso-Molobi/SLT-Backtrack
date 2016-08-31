/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slt.backtrack;

//----------------------------FOR LIAM

class Board {

    //"Root" node of tree, i.e. partial sudoku game goes in here
    public Board(Integer[][] board) {
        this.board = board;
    }
    
    //Always 9x9
    //first array is x coord, second is y coord, i.e. row then column
    Integer[][] board;
    
    
    //Returns true if pos is available, false if it is invalid for a move.
    boolean checkPos(Move move) {
        //Check row
        for (int i=0; i<9; i++) {
            if (board[i][move.y] == move.num) return false;
        }
        //Check column
        for (int i=0; i<9; i++) {
            if (board[move.x][i] == move.num) return false;
        }
        //Check block
        int blockx = move.x/3;
        int blocky = move.y/2;
        for (int i=blockx*3; i<(blockx*3) + 3; i++) {
            for (int j=blocky*3; j<(blocky*3) + 3; j++) {
                if (board[i][j] == move.num) return false;
            }
        }
        return true;
    }
    
}

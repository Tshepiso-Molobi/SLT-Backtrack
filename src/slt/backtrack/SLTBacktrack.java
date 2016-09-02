/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slt.backtrack;

//-----------------------FOR SIBU AND TSHEPISO-------------------------

import java.util.ArrayList;



public class SLTBacktrack {

    //FOR SIBU
    //boolean backtrack(Board board){
        
    //}
    
    //FOR SIBU
    //boolean isFull(Board board){
        
    //}
    
    //FOR TSHEPISO
    ArrayList<Move> getMoves(Board board) {
        ArrayList<Move> moves = new ArrayList<Move>();
        Move move;
        for(int num=1;num<=9;num++){
            
            for(int i=0;i<9;i++){
                
                for(int j=0;j<9;j++){
                    
                    move = new Move(i,j,num);
                    if(Board.checkPos(move)){
                        moves.add(move);
                    }
                }
                
            }
            
        }
        
        return moves;
    }
    
    public static void main(String[] args) {
        
    }
    
}

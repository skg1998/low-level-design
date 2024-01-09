package tic_toc_tie.board;

import java.util.ArrayList;
import java.util.List;
import tic_toc_tie.enumeration.SymbolType;

public class Board {
	public int size;
	public SymbolType[][] board;
	
	public Board(int size){
		this.size = size;
		this.board = new SymbolType[size][size];
	}
	
	public boolean addSymbol(int row, int col, SymbolType symbolType) {
		if(board[row][col] != null) {
			return false;
		}
		
		board[row][col] = symbolType;
		return true;
	}
	
	public List<List<Integer>> getFreeCell(){
		List<List<Integer>> freeCells = new ArrayList<List<Integer>>();
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(board[i][j] == null) {
					List<Integer> rowCol = new ArrayList<Integer>();
					rowCol.add(i);
					rowCol.add(j);
					freeCells.add(rowCol);
				}
			}
		}
		
		return freeCells;
	}
}

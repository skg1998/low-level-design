package tic_toc_tie.utils;

import tic_toc_tie.enumeration.SymbolType;

public class Printboard {
	public static void printBoard(SymbolType[][] board) {
		int size = board.length;
		for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                   System.out.print(board[i][j].name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }

	}
}

package tic_toc_tie;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import tic_toc_tie.board.Board;
import tic_toc_tie.enumeration.SymbolType;
import tic_toc_tie.player.Player;
import tic_toc_tie.utils.Printboard;

public class TicTocTie {
	Deque<Player> players;
	Board gameBoard;
	
	TicTocTie(){
		initilize();
	}
	
	public void initilize() {
		System.out.println("INITILIZING TIC TOC TIE PLEASE WAIT...");
		//PLAYER
		this.players = new LinkedList<>();
		Player player1 = new Player("Topi", SymbolType.X);
		Player player2 = new Player("Rajabeta", SymbolType.O);
		this.players.add(player1);
		this.players.add(player2);
		
		//BOARD
		this.gameBoard = new Board(3);
	}
	
	public String start() {
		boolean noWinner = true;
		while(noWinner) {
			Player playerTurn = players.removeFirst();
			Printboard.printBoard(this.gameBoard.board);
			
			List<List<Integer>> freeCell = gameBoard.getFreeCell();
			if(freeCell.isEmpty()) {
				noWinner = false;
				continue;
			}
			
			System.out.print("Player: "+ playerTurn.getName() + " Enter row & col: ");
			try {
				Scanner scn = new Scanner(System.in);
				String s = scn.next();
				String[] values = s.split(",");
				int row = Integer.valueOf(values[0]);
				int col = Integer.valueOf(values[1]);
				
				boolean symbolAddedSuccesfully = gameBoard.addSymbol(row, col, playerTurn.getSymbolType());
				if(!symbolAddedSuccesfully) {
					System.out.println("Incorrect position choosen, try again");
					players.addFirst(playerTurn);
					continue;
				}
				
				players.addLast(playerTurn);
				boolean winner = isPlayerWin(row, col, playerTurn.getSymbolType());
				if(winner) {
					System.out.println("#### WINNER ####");
					Printboard.printBoard(this.gameBoard.board);
					return "Winner is: "+playerTurn.getName().toUpperCase();
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		return "No One won, game Tie";
	}

	private boolean isPlayerWin(int row, int col, SymbolType symbolType) {
		boolean rowMatch = true;
		boolean colMatch = true;
		boolean daigonal = true;
		boolean revDaiMatch = true;
		
		for(int i=0; i<gameBoard.size; i++) {
			if(gameBoard.board[row][i] == null || gameBoard.board[row][i] != symbolType) {
				rowMatch = false;
			}
		}
		
		for(int i=0; i<gameBoard.size; i++) {
			if(gameBoard.board[i][col] == null || gameBoard.board[i][col] != symbolType) {
				colMatch = false;
			}
		}
		
		for(int i=0, j=0; i<gameBoard.size; i++,j++) {
			if(gameBoard.board[i][j] == null || gameBoard.board[i][j] != symbolType) {
				daigonal = false;
			}
		}
		
		for(int i=0, j=gameBoard.size-1; i<gameBoard.size; i++,j--) {
			if(gameBoard.board[i][j] == null || gameBoard.board[i][j] != symbolType) {
				revDaiMatch = false;
			}
		}
		
		
		return rowMatch || colMatch || daigonal || revDaiMatch;
	}
}

package com.techlab.tictactoe;

public class ResultAnalyzer{
	private String[][] board;

	public ResultAnalyzer(String[][] board) {
		this.board = board;
	}
	
	public boolean horizontalChecker() {
		for (int i = 0; i < Board.getRows() ; i++) {
			if(board[i][0]!="-" && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
				return true;
			}
		}
		return false;
	}
	
	public boolean VerticalChecker() {
		for (int i = 0; i < Board.getColumns() ; i++) {
			if(board[0][i]!="-" && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
				return true;
			}
		}
		return false;
	}
	
	public boolean DiagonalChecker() {	
		if(board[0][0]!="-" && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
			return true;
		}
		if(board[0][2]!="-" && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
			return true;
		}
		return false;
	}
	
	public boolean isBoardFull() {
		for (int i = 0; i < Board.getRows(); i++) {
			for (int j = 0; j < Board.getColumns(); j++) {
				if(board[i][j]=="-") {
					return false;
				}
			}
		}
		return true;
	}
	

}

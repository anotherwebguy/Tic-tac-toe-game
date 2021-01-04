package com.techlab.tictactoe;

public class Board {
	private String[][] board;
	private static final int ROWS=3;
	private static final int COLUMNS=3;
	private String currentPlayersMove;

	
	
	public Board() {
		board = new String[ROWS][COLUMNS];
		this.initializeBoardWithNull();
	}
	
	public void initializeBoardWithNull() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				board[i][j]="-";
				
			}
			
		}
	}
	
	public static int getRows() {
		return ROWS;
	}

	public static int getColumns() {
		return COLUMNS;
	}

	public String getCurrentPlayersMove() {
		return currentPlayersMove;
	}

	public void setCurrentPlayersMove(Mark currentPlayersMove) {
		if(currentPlayersMove==Mark.X)
		    this.currentPlayersMove = "X";
		else
			this.currentPlayersMove = "0";
	}

	public String[][] getBoard() {
		return board;
	}
	
	public void playMove(int num) throws CellisAlreadyFilled {
		switch(num) {
		case 1:
			if(this.board[0][0]=="-") {
			     board[0][0]=currentPlayersMove;
			     break;
			}     
			else {
				throw new CellisAlreadyFilled("That cell is Already Filled");
			}	
		case 2:
			if(this.board[0][1]=="-") {
			     board[0][1]=currentPlayersMove;
			     break;
			}     
			else {
				throw new CellisAlreadyFilled("That cell is Already Filled");
			}	
		case 3:
			if(this.board[0][2]=="-") {
			     board[0][2]=currentPlayersMove;
			     break;
			}     
			else {
				throw new CellisAlreadyFilled("That cell is Already Filled");
			}	
		case 4:
			if(this.board[1][0]=="-") {
			     board[1][0]=currentPlayersMove;
			     break;
			}     
			else {
				throw new CellisAlreadyFilled("That cell is Already Filled");
			}	
		case 5:
			if(this.board[1][1]=="-") {
			     board[1][1]=currentPlayersMove;
			     break;
			}     
			else {
				throw new CellisAlreadyFilled("That cell is Already Filled");
			}	
		case 6:
			if(this.board[1][2]=="-") {
			     board[1][2]=currentPlayersMove;
			     break;
			}    
			else {
				throw new CellisAlreadyFilled("That cell is Already Filled");
			}	
		case 7:
			if(this.board[2][0]=="-") {
			     board[2][0]=currentPlayersMove;
			     break;
			}     
			else {
				throw new CellisAlreadyFilled("That cell is Already Filled");
			}	
		case 8:
			if(this.board[2][1]=="-") {
			     board[2][1]=currentPlayersMove;
			     break;
			}     
			else {
				throw new CellisAlreadyFilled("That cell is Already Filled");
			}	
		case 9:
			if(this.board[2][2]=="-") {
			     board[2][2]=currentPlayersMove;	
			     break;
			}     
			else {
				throw new CellisAlreadyFilled("That cell is Already Filled");
			}	
		}
		
	}

	public String printBoard() {
		String printBoard="";
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if(j==COLUMNS-1) {
					printBoard+=board[i][j];
				}
				else {
					printBoard+=board[i][j]+"|";
				}
				
			}
			if(i!=ROWS-1) {
			    printBoard+="\n-+-+-\n";
			}
			else {
				printBoard+="\n";
			}
		}
		return printBoard;
	}
	
	
	
	
	

}

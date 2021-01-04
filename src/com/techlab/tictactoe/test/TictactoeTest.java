package com.techlab.tictactoe.test;

import java.util.Scanner;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.CellisAlreadyFilled;
import com.techlab.tictactoe.Mark;
import com.techlab.tictactoe.Result;
import com.techlab.tictactoe.ResultAnalyzer;

public class TictactoeTest {

	public static void main(String[] args) throws CellisAlreadyFilled {
		// TODO Auto-generated method stub
		String player1,player2;
		Scanner sc = new Scanner(System.in);
		Board b = new Board();
		System.out.println("Enter Player1 name: ");
		player1=sc.nextLine();
		System.out.println("Enter Player2 name: ");
		player2=sc.nextLine();
		System.out.println(player1+" is assigned X and "+player2+" is assigned 0");
		do {
			System.out.println(b.printBoard());
			//For player1
			b.setCurrentPlayersMove(Mark.X);
			System.out.println(player1+" Enter cell no: ");
			int num1=sc.nextInt();
			b.playMove(num1);
			System.out.println(b.printBoard());
			ResultAnalyzer r1=new ResultAnalyzer(b.getBoard());
			if(r1.horizontalChecker() || r1.VerticalChecker() || r1.DiagonalChecker()) {
				System.out.println(player1+" "+Result.WINS);
				break;
			}
			else if(r1.isBoardFull()) {
				System.out.println(Result.DRAW);
				break;
			}
			System.out.println();
		
			
			//For player2
			b.setCurrentPlayersMove(Mark.Y);
			System.out.println(player2+" Enter cell no: ");
			int num2=sc.nextInt();
			b.playMove(num2);
			ResultAnalyzer r2=new ResultAnalyzer(b.getBoard());
			if(r2.horizontalChecker() || r2.VerticalChecker() || r2.DiagonalChecker()) {
				System.out.println(player2+" "+Result.WINS);
				break;
			}
			else if(r2.isBoardFull()) {
				System.out.println(Result.DRAW);
				break;
			}
			System.out.println();
	
		}while(true);
		
		System.out.println("End of the game");
	

	}

}

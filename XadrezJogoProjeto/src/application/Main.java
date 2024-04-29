package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPieces;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ChessMatch chessMatch=new ChessMatch();

        while (true){
            try {

                // deveria limpara a tela
               // UI.clearScreen();

                // imprime o tabuleiro na tela
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.println("posição origem : ");
                ChessPosition source = UI.readChessPosition(in);

                System.out.println();
                System.out.println("posição target: ");
                ChessPosition target = UI.readChessPosition(in);

                ChessPieces capturedPiece = chessMatch.performChessMove(source, target);


            }
            catch (ChessException | InputMismatchException e){
                System.out.println(e.getMessage());
                in.nextLine();
            }
        }


    }
}
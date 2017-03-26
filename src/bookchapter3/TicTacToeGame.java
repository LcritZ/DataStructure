package bookchapter3;

import java.util.Scanner;


public class TicTacToeGame {
		static int[] chessboard = new int[9];	 
		private  char role;
		public TicTacToeGame(char r) {
			role=r;
		}
		public static void	 printboard() {
			for(int i=0;i<3;i++){
				for (int j = 0; j < 3; j++) {					
					System.out.print(chessboard[i*3+j]+" ");					
				}
				System.out.println();
			}
		}
		public   void print() {
			System.out.print("请"+role+"输入:");
			for (int i = 0; i < 9; i++) {
				if (chessboard[i]==0) {
					System.out.print((i+1)+" ");
				}				
			}
			System.out.println("中的数:");
			
		}
		public static void start(TicTacToeGame t1,TicTacToeGame t2) {
			int flag=1;
			for (int i = 1; i <= 9; i++) {
				if (flag==1) {
					t1.play();
					flag=0;
					if (judge()) {
						//judge();
						return ;
					}
				}else {
					t2.play();
					flag=1;
					if (judge()) {
						//judge();
						return ;
					}
				}
				
			}
		}
		public  void play() {
			System.out.println();
			print();
			int lazi;				
			lazi=new Scanner(System.in).nextInt();
			if (chessboard[lazi-1]!=0) {				
					System.out.print(role+"重下");				
				
				//sc.close();
				play();
				return ;
			}else {
				if (role=='X') {					
					chessboard[lazi-1]=1;
				}else {
					chessboard[lazi-1]=2;
				}
			}
			//close();
					
			printboard();
		}
		public static boolean judgeX() {
			if (chessboard[0]==chessboard[1]&&chessboard[0]==chessboard[1]&&chessboard[1]==1) {
				return true;
			}else if (chessboard[0]==chessboard[3]&&chessboard[6]==chessboard[3]&&chessboard[3]==1) {
				return true;
			}else if (chessboard[0]==chessboard[4]&&chessboard[0]==chessboard[8]&&chessboard[8]==1) {
				return true;
			}else if (chessboard[5]==chessboard[2]&&chessboard[2]==chessboard[8]&&chessboard[2]==1) {
				return true;
			}else if (chessboard[6]==chessboard[7]&&chessboard[6]==chessboard[8]&&chessboard[6]==1) {
				return true;
			}else if (chessboard[6]==chessboard[4]&&chessboard[4]==chessboard[2]&&chessboard[4]==1) {
				return true;
			}else if (chessboard[4]==chessboard[3]&&chessboard[5]==chessboard[3]&&chessboard[3]==1) {
				return true;
			}else if (chessboard[1]==chessboard[4]&&chessboard[1]==chessboard[7]&&chessboard[1]==1) {
				return true;
			}else {
				return false;
			}
		}
		public static boolean judgeY() {
			if (chessboard[0]==chessboard[1]&&chessboard[2]==chessboard[1]&&chessboard[1]==2) {
				return true;
			}else if (chessboard[0]==chessboard[3]&&chessboard[6]==chessboard[3]&&chessboard[0]==2) {
				return true;
			}else if (chessboard[0]==chessboard[4]&&chessboard[0]==chessboard[8]&&chessboard[8]==2) {
				return true;
			}else if (chessboard[5]==chessboard[2]&&chessboard[2]==chessboard[8]&&chessboard[2]==2) {
				return true;
			}else if (chessboard[6]==chessboard[7]&&chessboard[6]==chessboard[8]&&chessboard[6]==2) {
				return true;
			}else if (chessboard[6]==chessboard[4]&&chessboard[4]==chessboard[2]&&chessboard[4]==2) {
				return true;
			}else if (chessboard[4]==chessboard[3]&&chessboard[5]==chessboard[3]&&chessboard[3]==2) {
				return true;
			}else if (chessboard[1]==chessboard[4]&&chessboard[1]==chessboard[7]&&chessboard[1]==2) {
				return true;
			}
			else {
				return false;
			}
		}
		public static boolean judge() {
			char winner;
			if (judgeX()) {
				winner='X';
				System.out.println(winner+"获胜");
				return true;
			}else if (judgeY()) {
				winner='O';
				System.out.println(winner+"获胜");
				return true;
			}else {
				System.out.println("无人获胜");
				return false;
			}
		}
	public static void main(String[] args) {
		TicTacToeGame Tx =new TicTacToeGame('X');
		TicTacToeGame To =new TicTacToeGame('O');
		printboard();
		start(Tx, To);
	}

}

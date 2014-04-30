package main;

public class Main {
	public static void main(String[] args) {
		DLL<DLL<Integer>> dll=new DLL<DLL<Integer>>();
		init();
	}
	
	public static void init(){
		AlgX.solveSudoku(new DLSudoku());
	}
	
	public static void algX(DLL<DLL<Integer>>dll){
		
	}
}
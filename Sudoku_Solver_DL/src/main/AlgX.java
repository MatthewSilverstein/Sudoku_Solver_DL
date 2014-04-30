package main;

import java.util.ArrayList;

import main.DLL.DLLNode;

public class AlgX {
	
	public static void solveSudoku(DLSudoku sudoku){
		DLL<DLL<Integer>> dll=sudoku.svc;
		ArrayList<ColSum> sums=initSums(dll);
			//Constraint is chosen, now try different symbols
	}
	
	public static boolean solveSudokuR(DLL<DLL<Integer>>dll,ArrayList<ColSum> sums,ArrayList<Integer>path){
		int minIndex=0;
		DLL<Integer>minCol=dll.head.value;
		DLLNode<DLL<Integer>>node=dll.head;
		for (int i=1;i<dll.size;i++){
			node=node.next;
			if (sums.get(i).sum<sums.get(minIndex).sum){
				minIndex=i;
				minCol=node.value;
			}
		}
		//Now loop through minCol
		ArrayList<DLLNode<Integer>>possibleSymbols=new ArrayList<DLLNode<Integer>>();
		ArrayList<Integer>possibleSymbolsIndices=new ArrayList<Integer>();
		DLLNode<Integer>symbol=minCol.head;
		for (int i=0;i<minCol.size;i++){
			if (symbol.value.equals(1)){
				possibleSymbols.add(symbol);
				possibleSymbolsIndices.add(i);
			}
			symbol=symbol.next;
		}
		
		for (int i=0;i<possibleSymbols.size();i++){
			int index=possibleSymbolsIndices.get(i);
			symbol=possibleSymbols.get(i);
			
		}
		
		
		return false;
	}
	
	public static ArrayList<ColSum> initSums(DLL<DLL<Integer>> dll){
		ArrayList<ColSum> sums=null;
		sums=new ArrayList<ColSum>();
		DLLNode<DLL<Integer>> node1=dll.head;
		for (int i=0;i<dll.size;i++){
			DLLNode<Integer>node2=node1.value.head;
			ColSum sum=new ColSum();
			for (int j=0;j<node1.value.size;j++){
				sum.add(node2.value);
				node2=node2.next;
			}
			sums.add(sum);
			node1=node1.next;
		}
		return sums;
	}
		
	public static class ColSum{
		int sum=0;
		int index=-1;
		public ColSum(){
			
		}
		
		public void add(int add){
			sum+=add;
		}
	}
}

package main;

import main.DLL.DLLNode;

public class DLSudoku {
	DLL<DLL<Integer>> svc=null;	//Symbol vs constraint
	public DLSudoku(){
		svc=new DLL<DLL<Integer>>();
		int[][] svc=new int[324][729];
		setRC(svc);
		setR(svc);
		setC(svc);
		setB(svc);
		this.svc=DLL.createDLL(svc);
		DLLNode<DLL<Integer>>node1=this.svc.head;
	}
	
	public DLSudoku(String s){
		int[][] svc=new int[324][729];
		setRC(svc);
		setR(svc);
		setC(svc);
		setB(svc);
		for (int i=0;i<s.length();i++){
			if (s.charAt(i)!=0){
				int index=i*9;
				for (int j=0;j<9;j++){
					svc[index+j]=new int[0];
				}
			}
		}
		this.svc=DLL.createDLL(svc);
	}
	
	public void setRC(int[][] svc){
		for (int r=0;r<9;r++){
			for (int c=0;c<9;c++){
				int index1=r*9+c;
				for (int n=0;n<9;n++){
					int index2=r*81+c*9+n;
					svc[index1][index2]=1;
				}
			}
		}
	}
	
	public void setR(int[][] svc){
		for (int r=0;r<9;r++){
			for (int n=0;n<9;n++){
				int index1=r*9+n+81;
				for (int c=0;c<9;c++){
					int index2=r*81+c*9+n;
					svc[index1][index2]=1;
				}
			}
		}
	}
	
	public void setC(int[][] svc){
		for (int c=0;c<9;c++){
			for (int n=0;n<9;n++){
				int index1=c*9+n+81*2;
				for (int r=0;r<9;r++){
					int index2=r*81+c*9+n;
					svc[index1][index2]=1;
				}
			}
		}
	}
	
	public void setB(int[][] svc){
		for (int br=0;br<3;br++){
			for (int bc=0;bc<3;bc++){
				for (int n=0;n<9;n++){
					int index1=(br*3+bc)*9+n+81*3;
					for (int r=0;r<3;r++){
						for (int c=0;c<3;c++){
							int index2=(r+br)*81+(c+bc)*9+n;
							svc[index1][index2]=1;
						}
					}
				}
			}
		}
	}
	
	public static DLSudoku blankSudoku(){
		DLSudoku sudoku=new DLSudoku();
		return sudoku;
	}
}

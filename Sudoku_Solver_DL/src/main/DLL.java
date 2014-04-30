package main;

public class DLL<S> {
	DLLNode<S>head=null;
	public int size=0;
	public DLL(){
	}
	
	public void add(S input){
		DLLNode<S> node=new DLLNode<S>(input);
		size++;
		if (head==null){
			head=node;
		}
		else{
			head.setPrevious(node);
		}
	}	
	
	public static DLL<DLL<Integer>> createDLL(int[][] svc){
		DLL<DLL<Integer>>dll=new DLL<DLL<Integer>>();
		for (int i=0;i<svc.length;i++){
			if (svc[i].length==0){
				continue;
			}
			DLL<Integer>dl=new DLL<Integer>();
			for (int j=0;j<svc[i].length;j++){
				dl.add(svc[i][j]);
			}
			dll.add(dl);
		}
		System.out.println("Size "+dll.size);
		System.out.println("Size "+dll.size);
		return dll;
	}
	
	static class DLLNode<S>{
		DLLNode<S> next=null,prev=null;
		S value=null;
		public DLLNode(S value){
			this.value=value;
		}
		
		public void setPrevious(DLLNode<S> node){
			node.next=this;
			node.prev=this.prev;
			this.prev=node;
			if (node.prev!=null){
				node.prev.next=node;
			}else{
				this.next=node;
			}
		}
	}
}

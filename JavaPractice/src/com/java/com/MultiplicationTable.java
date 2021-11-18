
public class MultiplicationTable {
	
	void print(int n,int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d*%d=%d",n,i,n*i).println();
		}
	}

	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		table.print(3,5,10);
	}

}

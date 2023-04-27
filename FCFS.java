import java.util.Scanner;
class FCFS{
	
	public static void main(String [] a){
		
		//variables
		int numProcess;
		Scanner sc=new Scanner(System.in);
		
		//get num of process
		System.out.print("[?]Enter number of process :");
		numProcess=sc.nextInt();
		
		//create arrays
		String ProcessID[]=new String[numProcess];
		int BT[] =new int[numProcess];
		int CT[]=new int[numProcess];
		int TAT[]=new int[numProcess];
		int WT[]=new int[numProcess];
		
		
		int previusProcessWaitingTime=0;
		//get inputs
		for(int i=0;i<numProcess;i++){
			System.out.println("----------------Process "+(i+1)+"----------------------");
			System.out.print("[?]Enter Process ID "+(i+1)+" :");
			ProcessID[i]=sc.next();
			sc.nextLine();
			System.out.println();
			System.out.print("[?]Enter BT For process "+(i+1)+" :");
			BT[i]=sc.nextInt();
			System.out.println();
			
			//calculations
			CT[i]=BT[i]+previusProcessWaitingTime;
			TAT[i]=BT[i];
			WT[i]=previusProcessWaitingTime;
			previusProcessWaitingTime=BT[i];
			
		}
		
		//print the table
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("|	ProcessID	|	BT	|	CT	|	TAT	|	WT	|");
		System.out.println("---------------------------------------------------------------------------------------------");
		for(int i=0;i<numProcess;i++){
			System.out.println("|	"+ProcessID[i]+"		|	"+BT[i]+"	|	"+CT[i]+"	|	"+TAT[i]+"	|	"+WT[i]+"	|");
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		//end table
		
		
		double sumWaitingTime=0;
		double sumTAT=0;
		for(int i=0;i<numProcess;i++){
			sumWaitingTime+=WT[i];
			sumTAT=TAT[i];
		}
		
		//calculate the avarage values
		System.out.println();
		System.out.println("[*]Avarage waiting time :"+(sumWaitingTime/numProcess));
		
		System.out.println("[*]Avarage TAT time :"+(sumTAT/numProcess));
		
		
	}
	
}
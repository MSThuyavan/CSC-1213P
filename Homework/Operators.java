class Operators{
    public static void main(String args[]){
	    //01.unaryOperator
        int a=50;
        int b=~a;
        System.out.println(b+"\n");
    
		//02.logicalOperators
		boolean q=true,k=false;
		boolean c=(q||k);
		System.out.println(c+"\n");
		
		//03.relationalOperator
		int d=30,e=40;
		boolean f=(d<e);
		System.out.println(f+"\n");
		
		//04.asignmentOperator
		long g=500L;//Simple assignment
		g+=50;//Compound assignment
		System.out.println(g+"\n");
		
		//05.ternaryOperator
		short i=46,j=112,max;
		max=(i>j)?i:j;
		System.out.println(max);
	}
}
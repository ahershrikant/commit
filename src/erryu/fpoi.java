package erryu;
class fpoi{
	int a=234;
	 fpoi(int k) {
		int	b=k%10;
		int	c=k/10;
		int d=c%10;
		int e=c/10;
		
		int g=b*100+d*10+e;		
			
		System.out.println(g);
		
	}
	 fpoi() {
		 
	int	b=a%10;
	int	c=a/10;
	int d=c%10;
	int e=c/10;
	
	int g=b*100+d*10+e;		
		
	System.out.println(g);
	}
	


	public static void main(String[] args) {
		fpoi f=new fpoi(245);
		fpoi s=new fpoi();
	
		

	}

}

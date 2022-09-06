package File10;
//null exception
class Exception4 {
	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException");
				
			}
			
		}
	}
	
	


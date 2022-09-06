package File10;
//classnotfound
public class Exception7 {
	public static void main(String[] args) {
		try {
			final String hi= "com.mysqljdbc.Driver";
			System.out.println("Loading MySqL JDBC driver");
			Class.forName(hi);
		}catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}

}

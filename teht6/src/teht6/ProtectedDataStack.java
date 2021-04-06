package teht6;

import java.util.Scanner;

public class ProtectedDataStack implements DataStack {

	protected DataStack dataStackToBeProtected;
	
	public ProtectedDataStack(DataStack ds) {
		dataStackToBeProtected=ds;
	}
	
	@Override
	public int get() {
		if(checkPassword())
			return dataStackToBeProtected.get();
		else
			return 0;
	}

	@Override
	public void add(int newValue) {
		if(checkPassword())
			dataStackToBeProtected.add(newValue);
	}

	public boolean checkPassword() {
		
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter password");

	    String pswd = myObj.nextLine();
		System.out.println(pswd);
		if(pswd.equals("salasana")) {
			System.out.println("Correct password");
			return true;
		}else {
			System.out.println("False password");
			return false;
		}
	}
}

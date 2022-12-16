package A;

public class B {

//	@Pattern(regexp = "^[a-zA-Z0-9]*$")
//	@Size(min=6,max=12)
//	private String password;
	
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{6,12}$")
	@Size(min=6,max=12)
	private String password;
	
}

package userExperience;

public class tester {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//String wxpName = "Jim\\Engage Just Total Brutal";
		String wxpName1 = "Jim" + "\\" + "Engage" + " Just" + " Total" + " Brutal" + ".wwks";
		System.out.println(wxpName1);
		wxpName1 = '"'+ wxpName1 + '"';
		System.out.println(wxpName1);
		RegReader reg = new RegReader();
		reg.setHitDir(wxpName1);
		System.out.println(reg.getHitDir());
		User brian = new User(wxpName1);
		
	}

}
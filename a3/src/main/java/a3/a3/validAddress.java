package a3.a3;

public class validAddress {

	public boolean isValid(String in) {
		boolean check = true;
		int l = in.length();
		for (int i = 0; i < l; i++) {
			if (!in.contains("@")&&!in.contains(".")) {
				check = false;
			}
		}
		return check;
	}
}
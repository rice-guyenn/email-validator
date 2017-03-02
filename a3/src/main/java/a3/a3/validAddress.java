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
	
	public boolean domainCheck(String in) {
		boolean check = true;
		String dom = "";
		for (int i = in.length()-3; i < in.length(); i++) {
			char c = in.charAt(i);
			dom = dom + String.valueOf(c);
		}
		if (dom.charAt(0)!='.') {
			check = false;
		} else {
			switch(dom.length()) {
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default: check = false;
				break;
			}
		}
		return check;
	}
}
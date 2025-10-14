package beans;

public class LoginBean {
	private String uid;
	private String passwd;
	
	// 가 입 된 회 원 으 로 가 정 함(아이디, 비밀번호 설정)
	
	final String _uid = "myuser";
	final String _passwd = "0000";
	
	// 로그인 체크 메서드
	public boolean checkUser() {
		if(uid.equals(_uid) && passwd.equals(_passwd)) {
			return true;
		}else{
			return false;
			
		}
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}

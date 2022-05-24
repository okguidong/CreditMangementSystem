package classProj;

import java.io.Serializable;

class MyException implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9085043003740572575L;
	
	public void kindbadcode(String x)throws Exception {//과목울 츄가할때 교양과 전공을 입력할때 다른 문자열을 입력한다면 오류룰 발생
		if(!(x.equals("교양")||x.equals("전공"))) {
			throw new Exception();
		}
		}
	public void indexover(int i) throws Exception {//list의 인덱스를 넘어가는 인덱스를 선택할때 오류로 처리
		if(i > ManagerMethods.list.size()) {
			throw new Exception();
		}
	}
}
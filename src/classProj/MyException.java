package classProj;

import java.io.Serializable;

class MyException implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9085043003740572575L;
	
	public void kindbadcode(String x)throws Exception {//����� ���Ҷ� ����� ������ �Է��Ҷ� �ٸ� ���ڿ��� �Է��Ѵٸ� ������ �߻�
		if(!(x.equals("����")||x.equals("����"))) {
			throw new Exception();
		}
		}
	public void indexover(int i) throws Exception {//list�� �ε����� �Ѿ�� �ε����� �����Ҷ� ������ ó��
		if(i > ManagerMethods.list.size()) {
			throw new Exception();
		}
	}
}
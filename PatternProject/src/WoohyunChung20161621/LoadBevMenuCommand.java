package WoohyunChung20161621;

public class LoadBevMenuCommand implements Command{

BevMenu bevMenu;
	
	public LoadBevMenuCommand(BevMenu bevMenu){
		this.bevMenu = bevMenu;
	}
	public void execute(){
		System.out.println("-- �߰� �ֹ��Ͻ� ������� ��ȣ�� �Է����ּ��� --\n");
		System.out.println("---------------------");		
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī���");
		System.out.println("3. �����ֽ�");
		System.out.println("4. ź������");
		System.out.println("5. ����");
		System.out.println("6. �ֹ����� ����");
		System.out.println("---------------------\n");
	}

}



package WoohyunChung20161621;

public class LoadToastMenuCommand implements Command {
	
	ToastMenu toastMenu;
	
	public LoadToastMenuCommand(ToastMenu toastMenu){
		this.toastMenu = toastMenu;
	}
	public void execute(){
		System.out.println("-- ������� �ƻ� �佺Ʈ�Դϴ�. �ֹ��Ͻ� �佺Ʈ�� �Է����ּ��� --\n");
		System.out.println("---------------------");
		System.out.println("���佺Ʈ");
		System.out.println("��ġ���佺Ʈ");
		System.out.println("�Ҵ��佺Ʈ");
		System.out.println("ġ���佺Ʈ");
		System.out.println("�𷰽��佺Ʈ");
		System.out.println("�������佺Ʈ");
		System.out.println("---------------------\n");
	}

}

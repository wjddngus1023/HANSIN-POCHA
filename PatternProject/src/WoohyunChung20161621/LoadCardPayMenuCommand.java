package WoohyunChung20161621;

public class LoadCardPayMenuCommand implements Command{
	
	CardPayMenu cardPayMenu;
	
	public LoadCardPayMenuCommand(CardPayMenu cardPayMenu){
		this.cardPayMenu = cardPayMenu;
	}
	public void execute(){
		System.out.println("-- ������ �����ϰڽ��ϴ�. --");
		System.out.println("-- ī�带 ������ �о�־� �ֽʽÿ�.  --\n");
		System.out.println("-- ������ �Ϸ�Ǿ����ϴ� �������� �����Ͻðڽ��ϱ�? --");
		System.out.println("---------------------");
		System.out.println("1. ��");
		System.out.println("2. �ƴϿ�");
		System.out.println("---------------------\n");
	}

}

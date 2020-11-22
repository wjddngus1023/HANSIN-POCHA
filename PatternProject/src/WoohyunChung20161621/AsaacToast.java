package WoohyunChung20161621;

import java.util.Scanner;

public class AsaacToast {

	public static void main(String[] args){
		
		Beverage DefaultDrink = new DefaultDrink(); // �⺻���� ����
		Toast toast = null;
					
		ToastMenu toastMenu = new ToastMenu();
		LoadToastMenuCommand loadToastMenu = new LoadToastMenuCommand(toastMenu);		
		BevMenu bevMenu = new BevMenu();
		LoadBevMenuCommand loadBevMenu = new LoadBevMenuCommand(bevMenu);
		CardPayMenu cardPayMenu = new CardPayMenu();
		LoadCardPayMenuCommand loadCardPayMenu = new LoadCardPayMenuCommand(cardPayMenu); // Ŀ�ǵ����
		
		loadToastMenu.execute();
		
		Scanner sc = new Scanner(System.in);
		String Toastname = sc.nextLine(); 
		
		ToastFactory.createToast(Toastname); // ���丮 �޼ҵ� ȣ�� 
		
		loadBevMenu.execute();
	
		String BeverageSelect = sc.nextLine();
		
		switch(BeverageSelect){
		case "1" : 
			DefaultDrink = new Americano(DefaultDrink);		
			break;
		case "2" :
			DefaultDrink = new CafeLatte(DefaultDrink);
			break;
		case "3" : 
			DefaultDrink = new Juice(DefaultDrink);
			break;
		case "4" : 
			DefaultDrink = new Coke(DefaultDrink);
			break;
		case "5" :
			DefaultDrink = new Beer(DefaultDrink);
			break;
		case "6" :
			DefaultDrink = new NoneDrink(DefaultDrink);
			break;
			default :
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���");
				break;
				}
		
		System.out.println("-- " + DefaultDrink.getDescription() + "�� �ֹ��޾ҽ��ϴ�. -- \n" + "-- ������ " + DefaultDrink.cost() + "���Դϴ�. --\n"); // �������
		
		loadCardPayMenu.execute();
		String receiptSelect = sc.nextLine();
		
		switch(receiptSelect){
		case "1" :
			System.out.println("================================");
			System.out.println("     " + Toastname + "        " + "1000" + " ��"); // ������ �佺Ʈ�� ������ �̾ƺ���
			System.out.println("     " + DefaultDrink.getDescription() + "        " + DefaultDrink.cost() + " ��");
			System.out.println("     �ֹ���ȣ : 1");
			System.out.println("================================\n");
			System.out.println("-- �ֹ��� �ּż� �����մϴ�. ó������ ���ư��÷��� -1�� �Է��ϼ��� --\n");
			break;
		case "2" :
			System.out.println("================");
			System.out.println("�ֹ���ȣ : 1");
			System.out.println("================");
			System.out.println("-- �ֹ��� �ּż� �����մϴ�. ó������ ���ư��÷��� -1�� �Է��ϼ��� --\n");
			break;
		}
		
		sc.close();
	}
	

	
	public int cost(){
		
		int total = 0;
			
		return total;
	}

}

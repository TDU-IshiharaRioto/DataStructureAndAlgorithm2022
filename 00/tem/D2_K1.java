public class D2_K1{
	public static void main(String[] args){
		SnackList snackList = new SnackList();
		Snack snack1 = new Snack("チョコレート",200);
		Snack snack2 = new Snack("クッキー",100);
		Snack snack3 = new Snack("キャンディー",300);
		snackList.add(snack1);
		snackList.add(snack2);
		snackList.add(snack3);
		print(snackList);
	}
	public static void print(SnackList snackList){
		Snack snack1 = snackList.get(0);
		Snack snack2 = snackList.get(1);
		Snack snack3 = snackList.get(2);
		
		String name1 = snack1.getName();
		int price1 = snack1.getPrice();
		String name2 = snack2.getName();
		int price2 = snack2.getPrice();
		String name3 = snack3.getName();
		int price3 = snack3.getPrice();
		
		System.out.println(name1 + " " + price1);
		System.out.println(name2 + " " + price2);
		System.out.println(name3 + " " + price3);
	}
}
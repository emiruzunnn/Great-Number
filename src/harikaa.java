import java.util.Scanner;

public class harikaa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		if (sayi < 0) {
			System.out.println("Lutfen pozitif bir sayi giriniz!!");
		}
		for (int i = 1; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		
		if (toplam == sayi) {
			System.out.println("Bu bir harika sayidir!!");
		}else {
			System.out.println("Bu bir harika sayi degildir!!");
		}

	}

}

package Kod;
import static java.lang.Math.*;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
	System.out.println("Witaj w kalkulatorze.");
	while(true)
	{
		double liczba1;
		double liczba2;
		double Obliczanie;
		int znak;
	System.out.println("Za pomoc¹ znaków wybierz dzia³anie jakie chcesz wykonaæ: ");
	System.out.println("(1): suma");
	System.out.println("(2): ró¿nica");
	System.out.println("(3): iloczyn");
	System.out.println("(4): iloraz");
	System.out.println("(5): reszta dzielenia");
	System.out.println("(6): x^n");
	System.out.println("(7): pierwiastek x stopnia z liczby:");
	System.out.println("(8): wyjscie z kalkulatora");
	Scanner odczyt= new Scanner(System.in);
	System.out.print("Wybierz operacje: ");
	znak = odczyt.nextInt();
		switch(znak)
		{
		case 1:
			System.out.println("Aby wykonaæ sumê...");
			System.out.print("Podaj pierwsz¹ liczbê: ");
			Scanner licz1= new Scanner(System.in);
			liczba1 = licz1.nextDouble();
			System.out.print("Podaj druga liczbê: ");
			Scanner licz2= new Scanner(System.in);
			liczba2 = licz2.nextDouble();
			Obliczanie=liczba1+liczba2;
			System.out.println("Suma tych liczb wynosi: " +Obliczanie);
			break;
		case 2:
			System.out.println("Aby wykonaæ ró¿nicê...");
			System.out.print("Podaj pierwsz¹ liczbê: ");
			Scanner licz1r= new Scanner(System.in);
			liczba1 = licz1r.nextDouble();
			System.out.print("Podaj druga liczbê: ");
			Scanner licz2r= new Scanner(System.in);
			liczba2 = licz2r.nextDouble();
			Obliczanie=liczba1-liczba2;
			System.out.println("Ró¿nica tych liczb wynosi: " +Obliczanie);
			break;
		case 3:
			System.out.println("Aby wykonaæ iloczyn...");
			System.out.print("Podaj pierwsz¹ liczbê: ");
			Scanner licz1m= new Scanner(System.in);
			liczba1 = licz1m.nextDouble();
			System.out.print("Podaj druga liczbê: ");
			Scanner licz2m= new Scanner(System.in);
			liczba2 = licz2m.nextDouble();
			Obliczanie=liczba1*liczba2;
			System.out.println("Iloczyn tych liczb wynosi: " +Obliczanie);
			break;
		case 4:
			System.out.println("Aby wykonaæ iloraz...");
			System.out.print("Podaj pierwsz¹ liczbê: ");
			Scanner licz1i= new Scanner(System.in);
			liczba1 = licz1i.nextDouble();
			System.out.print("Podaj druga liczbê: ");
			Scanner licz2i= new Scanner(System.in);
			liczba2 = licz2i.nextDouble();
			Obliczanie=liczba1/liczba2;
			if (liczba2==0)
				System.out.println("Nie dzieli siê przez 0!");
			else
			System.out.println("Iloraz tych liczb wynosi: " +Obliczanie);
			break;
		case 5:
			System.out.println("Abym pokaza³ resztê z dzielenia...");
			System.out.print("Podaj pierwsz¹ liczbê: ");
			Scanner licz1_r= new Scanner(System.in);
			liczba1 = licz1_r.nextDouble();
			System.out.print("Podaj druga liczbê: ");
			Scanner licz2_r= new Scanner(System.in);
			liczba2 = licz2_r.nextDouble();
			Obliczanie=liczba1%liczba2;
			System.out.println("Reszta z dzielenia tych liczb wynosi: " +Obliczanie);
			break;
		case 6:
			System.out.println("Abym podniós³ liczbê do potêgi...");
			System.out.print("Podaj liczbê któr¹ chcesz podnieœæ do potêgi: ");
			Scanner pot= new Scanner(System.in);
			liczba1=pot.nextDouble();
			System.out.print("Podaj wyk³adnik potêgi: ");
			Scanner wyk= new Scanner(System.in);
			liczba2=wyk.nextDouble();
			Obliczanie=pow(liczba1,liczba2);
			System.out.println("Wynikiem potêgowania jest liczba: " +Obliczanie);
		break;
		case 7:
			System.out.println("Abym wyliczy³ pierwiastek z liczby...");
			System.out.print("Podaj liczbê pod pierwiastkiem: ");
			Scanner liczbp= new Scanner(System.in);
			liczba1=liczbp.nextDouble();
			System.out.print("Podaj stopieñ pierwiastka: ");
			Scanner stopien= new Scanner(System.in);
			liczba2=stopien.nextDouble();
			Obliczanie=pow(liczba1,1.0/liczba2);
			System.out.println("Wynikiem pierwiastkowania jest liczba: " +Obliczanie);
		case 8:
			System.out.print("Postanowi³eœ wyjœæ z programu.");

			break;
		default:
			System.out.println("Nie wybrałeś żadnego równania.");
			break;
		}			
		if(znak==8)
			break;
	}

		
	}

}


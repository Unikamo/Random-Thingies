import java.util.Scanner;

class math{

	public static void main(String[] args)
	{
		Scanner maingetInput = new Scanner(System.in);
		
		System.out.println("French or English / Français ou anglais? (fr/en)");
		String mainansw = maingetInput.nextLine();
		
		switch (mainansw) {
			case "fr":
			case "français":
			case "francais":
				french();
				break;
			case "en":
			case "an":
			case "anglais":
			case "english":
				english();
				break;
			default:
				System.out.println("[ERROR] Enter something right / Entres une valeur correcte");
				break;
		}
	}
	
	
	public static void french()
	{
		Scanner frgetInput = new Scanner(System.in);
		String[] frdays = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
	
		System.out.println("Entrer le jour, mois et année (ex: 12,11,24 pour 12/11/2024)");
		String frinputNum = frgetInput.nextLine();

		String[] frnums = frinputNum.split(",");
		int[] frnumbers = new int[frnums.length];
		for (int i=0; i < frnums.length; i++) {
			frnumbers[i] = Integer.parseInt(frnums[i].trim());
		}

		System.out.printf("Le jour est %d, le mois est %d, et l'année est %d (%d/%d/%d)\n", frnumbers[0], frnumbers[1], frnumbers[2], frnumbers[0], frnumbers[1], frnumbers[2]);
		
		int frresult = (frnumbers[0] + (13 * (frnumbers[1] + 1) / 5) + 21 + 5 + 5 - 10  ) % 7;
		System.out.printf("Le jour est un %s (%d)\n", frdays[frresult], frresult);
	}


	public static void english()
	{
		Scanner getInput = new Scanner(System.in);
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
		System.out.println("Enter day, month, and year (eg: 12,11,24 for 12/11/2024)");
		String inputNum = getInput.nextLine();

		String[] nums = inputNum.split(",");
		
		int[] numbers = new int[nums.length];
		for (int i=0; i < nums.length; i++) {
			numbers[i] = Integer.parseInt(nums[i].trim());
		}

		System.out.printf("Day is %d, month is %d, and year is %d (%d/%d/%d)\n", numbers[0], numbers[1], numbers[2], numbers[0], numbers[1], numbers[2]);
		
		int result = (numbers[0] + (13 * (numbers[1] + 1) / 5) + 21 + 5 + 5 - 10  ) % 7;
		System.out.printf("The day is %s (%d)\n", days[result], result);
	}
}

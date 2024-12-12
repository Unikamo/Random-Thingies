def main():
	answ:str = input("French or English / Français ou anglais (fr/en) ");
	match (answ):
		case "en" | "anglais" | "english":
			english();
		case "fr" | "français" | "francais" | "french":
			french();
		case _:
			print("[ERROR] Enter something right / Entres une valeur correcte");
	

def english():
	day: int;
	month: int;
	year: int;
	result: int;
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];	

	day, month, year = map(int, input("Enter Day, Month, and Year (eg : 12,11,24 for 12/11/2024) ").split(","));
	print(f"Day is {day}, Month is {month}, Year is {year} ({day}/{month}/{year})");
	
	result: int = (day + (13 * (month + 1) // 5) + 21 + 5 + 5 - 10  ) % 7;
	print(f"Day is {days[int(result)]} ({result})");



def french():
	day: int;
	month: int;
	year: int;
	result: int;
	days = ["Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"];	

	day, month, year = map(int, input("Entrer le jour, mois, et année (ex : 12,11,24 pour 12/11/2024) ").split(","));
	print(f"Le jour est {day}, le mois est {month}, l'année est {year} ({day}/{month}/{year})");
	
	result: int = (day + (13 * (month + 1) // 5) + 21 + 5 + 5 - 10  ) % 7;
	print(f"Le jour est {days[int(result)]} ({result})");

if __name__ == "__main__":
	main();

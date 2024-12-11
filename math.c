#include <stdio.h>
#include <string.h>

int french(void)
{
	int day;
	int month;
	int year;
	char days[16][128] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};	

	printf("Entrer le jour, mois, et année (ex : 12,11,24 pour 12/11/2024) \n");
	scanf("%d, %d, %d", &day, &month, &year);
	printf("Le jour est %d, le mois est %d, l'année est %d (%d/%d/%d)\n", day, month, year, day, month, year);	

	int result = (day + (13 * (month + 1) / 5) + 21 + 5 + 5 - 10  ) % 7; // ... + century + century/4 + (2 first digits of year)/4 - 2*(2 first digits of year) 
	printf("Le jour est :  %d (%s)\n", result, days[result]);
	return 0;
}


int english(void)
{
	int day;
	int month;
	int year;
	char days[16][128] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};	

	printf("Enter Day, Month, and year (ex : 12,11,24 for 12/11/2024) \n");
	scanf("%d, %d, %d", &day, &month, &year);
	printf("Day is %d, Month is %d, Year is %d (%d/%d/%d)\n", day, month, year, day, month, year);	

	int result = (day + (13 * (month + 1) / 5) + 21 + 5 + 5 - 10  ) % 7; // ... + century + century/4 + (2 first digits of year)/4 - 2*(2 first digits of year) 
	printf("Day is %d (%s)\n", result, days[result]);
	return 0;
}


int main(int argc, char **argv)
{
	char answ[16];
	printf("French or English / Français ou Anglais? (fr/en)");
	scanf("%10s", &answ);
	if (strncmp(answ, "fr", 16) == 0 || strncmp(answ, "français", 16) == 0 || strncmp(answ, "francais", 16) == 0 || strncmp(answ, "french", 16) == 0) { french(); }
	else if (strncmp(answ, "en", 16) == 0 || strncmp(answ, "english", 16) == 0 || strncmp(answ, "anglais", 16) == 0){ english(); }
	else { printf("[ERROR] Enter something right / Entres une valeur correcte\n"); }
}

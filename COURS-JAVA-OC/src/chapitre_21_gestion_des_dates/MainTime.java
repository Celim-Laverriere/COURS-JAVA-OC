package chapitre_21_gestion_des_dates;


import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainTime {

	public static void main(String[] args) {
		
		/**** Gestion du temps humain ****/
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Date et heure courante : " + currentTime);
		
		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("Date courante : " + date1);
		
		Month mois = currentTime.getMonth();
		int jour = currentTime.getDayOfMonth();
		int heure = currentTime.getHour();
		
		System.out.println("Mois : " + mois + ", jour : " + jour + ", heure : " + heure);
		
		LocalDateTime date2 = currentTime.withDayOfMonth(25).withYear(2023).withMonth(12);
		System.err.println("Date modifier : " + date2);
		
		LocalDate date3 = LocalDate.of(2023, Month.DECEMBER, 25);
		System.out.println("Autre façon de faire : " + date3);
		
		LocalTime parsed = LocalTime.parse("20:15:30");
		System.out.println("Date parsée : " + parsed);

		System.out.println("\n********************************************************\n");
		
		//Le 25 Décembre 2018 a 13H37
				LocalDateTime ldt = LocalDateTime.of(2018, Month.DECEMBER, 25, 13, 37, 0);
				System.out.println("Date de référence : " + ldt);
				//Utilisation de l'objet ChronoUnit pour changer l'objet
				System.out.println("+1 semaine : " + ldt.plus(1, ChronoUnit.WEEKS));
				System.out.println("+2 mois : " + ldt.plus(2, ChronoUnit.MONTHS));
				System.out.println("+3 ans : " + ldt.plus(3, ChronoUnit.YEARS));
				System.out.println("+4 heures : " + ldt.plus(4, ChronoUnit.HOURS));
				System.out.println("-5 secondes : " + ldt.minus(5, ChronoUnit.SECONDS));
				System.out.println("-38 minutes : " + ldt.minusMinutes(38));
				
		
		/**** Duration et Period ****/
		LocalDateTime ltd = LocalDateTime.of(2018, Month.DECEMBER, 25, 13, 37, 0);
		LocalDateTime ltd2 = ltd.plus(3, ChronoUnit.YEARS);
		LocalDateTime ltd3 = ltd.minusMinutes(1337);
		
		Period p = Period.between(ldt.toLocalDate(), ltd2.toLocalDate());
		Duration d = Duration.between(ltd.toLocalTime(), ltd3.toLocalTime());
		System.out.println("Période : " + p);
		System.out.println("Durée : " + d.getSeconds());
		System.out.println("Ecart en jour : " + ChronoUnit.DAYS.between(ltd, ltd2));
				
				
		/**** TemporalAdjusters ****/
		LocalDate ltdA = LocalDate.of(2018, Month.DECEMBER, 25);
		
		LocalDate prochainSamedi = ltdA.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println(prochainSamedi);
		
		ltdA = ltdA.plus(1, ChronoUnit.MONTHS);
		
		LocalDate ltdABis = LocalDate.of(ltdA.getYear(), ltdA.getMonth(), 1);
		LocalDate troisiemeMardi = ltdABis.with(TemporalAdjusters.next(DayOfWeek.THURSDAY))
										  .with(TemporalAdjusters.next(DayOfWeek.THURSDAY))
										  .with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(troisiemeMardi);
				
				
		/**** Les objets ZoneId et ZoneDateTime ****/		
		Map<String, String> maps = ZoneId.SHORT_IDS;
		maps.values().stream().forEach((X) -> { System.out.println(X + " -- " + ZoneId.of(X).getRules());});
				
		System.out.println("");
		System.out.println("Fuseau horaire courant " + ZoneId.systemDefault());
		System.out.println("Règle appliquer aux heures : " + ZoneId.systemDefault().getRules());
		
		LocalDateTime ldtZ = LocalDateTime.parse("2019-01-01T01:33:00");
		List<ZoneId> lzi = Arrays.asList(ZoneId.of("Europe/Paris"), ZoneId.of("Asia/Tokyo"), ZoneId.of("America/Anchorage"));		
		
		lzi.stream().forEach((X) -> {System.out.println(X + " : \t " + ldtZ.atZone(X).toInstant());});
				
			
	}

}

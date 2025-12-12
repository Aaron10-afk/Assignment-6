public class Ticket {
	private double basePrice;
	private String dayOfWeek;
	private int age;
	private DayOfWeek day;

	public Ticket(String dayOfWeek, double basePrice, int age) {
		this.basePrice = basePrice;
		this.age = age;
		this.dayOfWeek = dayOfWeek.toLowerCase();
	}

	public double calculatePrice() {
		double price = basePrice;
		switch(dayOfWeek) {
		 	case "monday":
		 		day = DayOfWeek.MONDAY;
		 		break;
		 	case "tuesday":
		 		day = DayOfWeek.TUESDAY;
		 		break;
		 	case "wednesday":
		 		day = DayOfWeek.WEDNESDAY;
		 		break;
		 	case "thursday":
		 		day = DayOfWeek.THURSDAY;
		 		break;
		 	case "friday":
		 		day = DayOfWeek.FRIDAY;
		 		break;
		 	case "saturday":
		 		day = DayOfWeek.SATURDAY;
		 		break;
		 	case "sunday":
		 		day = DayOfWeek.SUNDAY;
		 		break;
		}
		price-= price*day.getDiscount();

		if (age <= 12) {  
            price *= 0.90; // 10% off for children
        } else if (age > 12 && age <= 18) {
            price *= 0.90; // 10% off for students
        } else if (age >= 65) {
            price *= 0.95; // 5% off for seniors
        }
		else {
			price *=1;
		}
		// Calculate ticket price based on day of week and age
		// Apply discounts for weekdays
		// Apply age-based discounts
		return price;
	}

	// Display the ticket details
	public void displayTicketDetails() {
		System.out.printf("Ticket Details: [Age: %d, Day: %s, Price: $%.2f]%n", age,
				dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1), calculatePrice());
	}

	@Override
	public String toString() {
		return String.format("Ticket [Day: %s, Age: %d, Price: $%.2f]",
				dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1), age, calculatePrice());
	}
}

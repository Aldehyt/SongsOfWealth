package privateEconomy.privSectorFlow;

import game.GAME;
import init.race.RACES;
import init.race.Race;
import privateEconomy.PrivateEconomyPOJO;
import settlement.stats.STATS;

import java.util.HashMap;
import java.util.Map;

public class PaymentIncome implements IInOut {

    // A Map that stores the payment information for each race
    Map<CharSequence, PaymentPerRace> dictionaryOfPaymentIncome = new HashMap<>();

    // A PrivateEconomyPOJO object that is used to calculate payments
    private final PrivateEconomyPOJO pojo;

    // Constructor that takes a PrivateEconomyPOJO object and adds all races to the payment dictionary
    public PaymentIncome(PrivateEconomyPOJO pojo) {
        this.pojo = pojo;
        addRacesToDictionary();
    }

    // Method that calculates the total payment for all races and prints the payment information for each race
    public double calcPayment() {
        double sumPaymentPerRace = 0;
        double paymentPerRace = 0;

        // Iterate through all PaymentPerRace objects in the dictionary and calculate the payment for each race
        for (PaymentPerRace raceMap : dictionaryOfPaymentIncome.values()) {
            paymentPerRace = raceMap.calcPayment();

            // Print the payment information for the race
            System.out.println(raceMap.raceName + " Are taxed by: " + raceMap.taxes + " and that race pays: " + paymentPerRace);

            // Add the payment for the race to the total payment for all races
            sumPaymentPerRace += paymentPerRace;
        }
        // Return the total payment for all races
        return sumPaymentPerRace;
    }

    // Inner class that represents the payment information for a single race


    // Private method that adds all races to the payment dictionary
    private void addRacesToDictionary() {
        double raceCount = 0;

        // Iterate through all races and add a PaymentPerRace object to the dictionary for each race
        for (Race race : RACES.all()) {

            // Get the name of the race
            CharSequence raceName = race.info.name;

            // Get the number of people in the race that live in the capital city
            raceCount = STATS.POP().POP.data(null).get(race);

            // Add a PaymentPerRace object to the dictionary for the race
            dictionaryOfPaymentIncome.put(race.info.name, new PaymentPerRace(raceName, raceCount, 0.1));
        }
    }

    public class PaymentPerRace {

        // The name of the race
        CharSequence raceName;

        // The number of people in the race that live in the capital city
        double raceCountInCapitol;

        // The tax rate for the race
        double taxes;

        // Constructor that takes the name of the race, the number of people in the race that live in the capital city, and the tax rate for the race
        public PaymentPerRace(CharSequence raceName, double raceCountInCapitol, double taxes) {
            this.raceName = raceName;
            this.raceCountInCapitol = raceCountInCapitol;
            this.taxes = taxes;
        }

        // Method that calculates the payment for the race based on the number of people in the race that live in the capital city, the total population of the capital city, the summarized price of all produced goods, and the tax rate for the race
        public double calcPayment() {
            double formula = 0;

            // Check if the number of people in the race that live in the capital city is not zero
            if (raceCountInCapitol != 0) {

                // Calculate the payment using the formula
                formula = (raceCountInCapitol / GAME.player().capitol().population.total().get()) * pojo.getSummarizedPriceOfAllProducedGoods() * taxes;
            }
            // Return the payment for the race
            return formula;
        }
    }

    @Override
    public double results() {
        return calcPayment();
    }
}

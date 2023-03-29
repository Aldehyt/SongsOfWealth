package privateEconomy.privSectorFlow;

import game.GAME;
import init.race.RACES;
import init.race.Race;
import privateEconomy.PrivateEconomyPOJO;
import settlement.stats.STATS;

import java.util.HashMap;
import java.util.Map;

public class Payment implements IInOut {

    // A Map that stores the payment information for each race
    Map<CharSequence, PaymentPerRace> dictionaryOfPaymentIncome = new HashMap<>();

    // A PrivateEconomyPOJO object that is used to calculate payments
    private final PrivateEconomyPOJO pojo;

    // Constructor that takes a PrivateEconomyPOJO object and adds all races to the payment dictionary
    public Payment(PrivateEconomyPOJO pojo) {
        this.pojo = pojo;
        addRacesToDictionary();
    }

    // Method that calculates the total payment for all races and prints the payment information for each race
    public double calcPayment() {
        double sumPaymentPerRace = 0;
        double paymentPerRace;

        // Iterate through all PaymentPerRace objects in the dictionary and calculate the payment for each race
        for (PaymentPerRace raceMap : dictionaryOfPaymentIncome.values()) {
            paymentPerRace = raceMap.calcPayment();

            // Print the payment information for the race
            System.out.println("[Log purpose] - : The " + raceMap.raceName + " race got payout of " + paymentPerRace + " credits of this season");

            // Add the payment for the race to the total payment for all races
            sumPaymentPerRace += paymentPerRace;

        }
        pojo.setPayouts(pojo.getPayouts() + sumPaymentPerRace);


        // Update player non-private credits value
        GAME.player().credits().purchases.IN.inc((int) -pojo.getPayouts());

        // Return the total payment for all races
        return pojo.getPayouts();
    }

    // Inner class that represents the payment information for a single race


    // Private method that adds all races to the payment dictionary
    private void addRacesToDictionary() {
        double raceCount;

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
        double wages;

        // Constructor that takes the name of the race, the number of people in the race that live in the capital city, and the tax rate for the race
        public PaymentPerRace(CharSequence raceName, double raceCountInCapitol, double wages) {
            this.raceName = raceName;
            this.raceCountInCapitol = raceCountInCapitol;
            this.wages = wages;
        }

        // Method that calculates the payment for the race based on the number of people in the race that live in the capital city, the total population of the capital city, the summarized price of all produced goods, and the tax rate for the race
        public double calcPayment() {
            double formula = 0;

            // Check if the number of people in the race that live in the capital city is not zero
            if (raceCountInCapitol != 0) {

                // Calculate the payment using the formula
                formula = (raceCountInCapitol / GAME.player().capitol().population.total().get()) * pojo.getSummarizedPriceOfAllProducedGoods() * wages;

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

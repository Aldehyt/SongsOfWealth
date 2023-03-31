package privateEconomy.privSectorFlow;

import game.GAME;
import init.race.RACES;
import init.race.Race;
import privateEconomy.PriceOfProducedGoods;
import settlement.stats.STATS;

import java.util.HashMap;
import java.util.Map;

public class Payment implements IInOutSourceOfWealth {


    Map<CharSequence, PayoffPerRace> dictionaryOfPaymentPerRace = new HashMap<>();

    private double summaryPayoff;
    private final PriceOfProducedGoods priceOfProducedGoods;
    public Payment(PriceOfProducedGoods priceOfProducedGoods) {
        this.priceOfProducedGoods = priceOfProducedGoods;

//        addPayoffPerRaceToDict();
    }

    public void sumPayoffsOfAllRaces() {
        double payoffPerRace;
        for (PayoffPerRace race : dictionaryOfPaymentPerRace.values()) {
            race.calculatePayoffForRacePopulation();
            payoffPerRace = race.resultsOfPayoffCalc;
            System.out.println("[Log purpose] - : The " + race.raceName + " race got payout of " + payoffPerRace + " credits of this season");
            summaryPayoff += payoffPerRace;
        }
    }

    public void addPayoffPerRaceToDict() {
        double raceCount;
        for (Race race : RACES.all()) {
            CharSequence raceName = race.key;
            raceCount = STATS.POP().POP.data(null).get(race);
            dictionaryOfPaymentPerRace.put(race.key, new PayoffPerRace(raceName, raceCount, 0.1, priceOfProducedGoods));
        }
    }

    @Override
    public double results() {
        return summaryPayoff;
    }

    public class PayoffPerRace {
        double resultsOfPayoffCalc;
        CharSequence raceName;
        double raceCountInCapitol;
        double wages;
        private final PriceOfProducedGoods priceOfProducedGoods;

        public PayoffPerRace(CharSequence raceName, double raceCountInCapitol, double wages, PriceOfProducedGoods priceOfProducedGoods) {
            this.raceName = raceName;
            this.raceCountInCapitol = raceCountInCapitol;
            this.wages = wages;
            this.priceOfProducedGoods = priceOfProducedGoods;

        }

        public void calculatePayoffForRacePopulation() {
            if (raceCountInCapitol != 0) {
                resultsOfPayoffCalc = (raceCountInCapitol / GAME.player().capitol().population.total().get()) * priceOfProducedGoods.results() * wages;
            }

        }
    }

}

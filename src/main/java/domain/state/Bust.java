package domain.state;

import domain.card.Hand;

public final class Bust extends Finished {
    Bust(Hand hand) {
        super(hand);
    }

    @Override
    public double getProfit() {
        return -1;
    }
}

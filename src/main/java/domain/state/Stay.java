package domain.state;

import domain.card.Hand;

public final class Stay extends Finished {
    Stay(Hand hand) {
        super(hand);
    }

    @Override
    public double getProfit() {
        return 1;
    }
}

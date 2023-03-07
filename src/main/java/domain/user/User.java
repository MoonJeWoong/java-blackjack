package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    protected static final int BLACKJACK = 21;

    private final List<Card> cards;
    protected final Score score;

    public User(List<Card> firstTurnCards) {
        cards = new ArrayList<>(firstTurnCards);
        score = new Score(firstTurnCards);
    }

    public void receiveCard(Card card) {
        cards.add(card);
        score.calculate(cards);
        checkBustByScore();
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getScore() {
        return score.getScore();
    }

    public abstract boolean isUserStatus(UserStatus status);

    protected abstract void checkBustByScore();

    public abstract String getName();
}

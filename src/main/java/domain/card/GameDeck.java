package domain.card;

import java.util.ArrayList;
import java.util.List;

public class GameDeck {
    private final List<Card> cards;

    public GameDeck(DeckGenerator deckGenerator) {
        cards = deckGenerator.generate();
    }

    public Card drawCard() {
        if (isEmpty()) {
            throw new IllegalStateException("[ERROR] 뽑을 카드가 더 이상 존재하지 않습니다.");
        }
        return cards.remove(0);
    }

    public List<Card> drawForFirstTurn() {
        List<Card> firstTurnCards = new ArrayList<>();
        firstTurnCards.add(drawCard());
        firstTurnCards.add(drawCard());

        return firstTurnCards;
    }

    private boolean isEmpty() {
        return cards.isEmpty();
    }
}

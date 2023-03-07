package domain.user;

import domain.card.Card;

import java.util.List;
import java.util.Objects;

public class Player extends User {
    private final Name name;
    private PlayerStatus status = PlayerStatus.NORMAL;

    public Player(Name name, List<Card> firstTurnCards) {
        super(firstTurnCards);
        this.name = name;
    }

    @Override
    protected void checkBustByScore() {
        if (score.getScore() > BLACKJACK) {
            status = PlayerStatus.BUST;
        }
    }

    @Override
    public boolean isUserStatus(UserStatus status) {
        return this.status.equals(status);
    }

    @Override
    public String getName() {
        return name.getName();
    }
}

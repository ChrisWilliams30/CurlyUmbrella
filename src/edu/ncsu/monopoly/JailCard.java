package edu.ncsu.monopoly;


public class JailCard extends Card {
    int type;
    
    public JailCard(int cardType) {
        type = cardType;
    }

    @Override
    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
            JailCell jail = (JailCell)(GameMaster.instance().getGameBoard().queryCell("Jail"));
            GameMaster.instance().sendToJail(currentPlayer);
    }

    @Override
    public int getCardType() {
        return type;
    }

    @Override
    public String getLabel() {
        return "Go to Jail immediately without collecting" +
            " $200 when passing the GO cell";
    }
}

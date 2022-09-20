package ATMStates;


import Models.ATM;
import Models.ATMCard;

public class IdleState extends ATMState {
  public IdleState() {
    System.out.println("IDLE STATE");
  }

  @Override
  public void insertCard(ATM atm, ATMCard atmCard) {
    System.out.println("Card is inserted");
    atm.setCurrentATMState(new HasCardState());
  }

}

package Models;

import ATMStates.ATMState;
import ATMStates.IdleState;

public class ATM {
    private final static ATM atm = new ATM();
    int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;
    ATMState currentATMState;

    public ATM() {
    }


    public static ATM getATMObject() {
        atm.setCurrentATMState(new IdleState());
        return atm;
    }
    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }
    public void deductAmount(Integer denomination, int value) {
        switch (denomination)  {
            case 2000:
                noOfTwoThousandNotes-=value;
                atmBalance -= value * 2000;
                break;
            case 500:
                noOfFiveHundredNotes-=value;
                atmBalance -= value * 500;
                break;
            case 100:
                noOfOneHundredNotes-=value;
                atmBalance -= value * 100;
                break;
            default:
                break;
        }
    }
    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);
    }


}

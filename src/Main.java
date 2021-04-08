public class Main {
    public static void main(String[] args) {
        long primaryBalance = 300;
        long transaction = 1_300;
        int bonusCalculationNumber = 100;
        long updatedBalance = primaryBalance + transaction;

        if(transaction >= 1_000) {
            long finalBonus = transaction / bonusCalculationNumber;
            System.out.println("Your current balance is "  + updatedBalance + " Bonuses added: " + finalBonus);

        }
        else {
            System.out.println("Your current balance is " + updatedBalance + "You don't have any bonuses " );

        }

    }

}

public class Account {


    int swiftCode = 1234;
    int cards = 1;

    public void AskNewCard() {
        cards += 1;
    }

    public void getCards() {
        System.out.println(cards);
    }

}

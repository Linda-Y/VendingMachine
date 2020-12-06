package Se.Lexicon.Linda;

public enum Currency {

    NOMONEY(0),ONEKRONA(1),TWOKRONA(2),FIVEKRONA(5),

    TENKRONA(10),TOWENTY(20),FIFTYKRONA(50),

    ONEHANDREDKRONA(100),TOWHANDREDKRONS(200),

    FIVEHANDREDKRONA(500),ONETHOUSNDES(1000);


    private int currencyAmount;

    Currency(int Amount)

    {  this.currencyAmount=Amount;    }

    public int getCurrencyAmount()
    {
        System.out.println(currencyAmount);

        return currencyAmount;
    }

   /*
   private double balance=0;
   void reset Balance(){
        this.balance=0;
    }
    void double getBalance()
    {return this.balance;}*/

}

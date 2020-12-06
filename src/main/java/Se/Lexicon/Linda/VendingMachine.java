package Se.Lexicon.Linda;



    public interface VendingMachine {

        void addCurrency(int Price);
         Product request(int price ,int itemNumber);
         int endSession();
        String getDescription (int itemNumber);
        double getBalance ();
        String [] getProducts ();


}






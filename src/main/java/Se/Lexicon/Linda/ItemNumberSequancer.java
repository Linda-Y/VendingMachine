package Se.Lexicon.Linda;

public class ItemNumberSequancer {


    private static int itemNumber;

    public static int getnextItemNumber() {

        itemNumber=itemNumber+1;

        return ItemNumberSequancer.itemNumber;
    }



}

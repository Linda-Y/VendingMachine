package Se.Lexicon.Linda;


public abstract class Product {


    private  int itemNumber;
    private String itemName;
    private double price;
    private double calories;
    private String allergens;
     abstract String examine();

    public Product(int itemNumber, String itemName, double price, double calories, String allergens) {
        this.itemNumber = ItemNumberSequancer.getnextItemNumber();
        this.itemName = itemName;
        this.price = price;
        this.calories = calories;
        this.allergens = allergens;
    }

/*

    @Override
    public int getProductNumber() {
        return super.getProductNumber();
    }

   */

    public int getItemNumber() {
        return itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }








    abstract String examine()

    {
        String ProductInf = "Product Information :\n " + " Number  " + itemNumber+ " \n Name " + getItemName() + "\n Price " + getPrice() + "\n Callories " + getCalories() + "\n Allergens " + getAllergens();
        return ProductInf;
    }


    public String use(){
        return ""; }


    class Drinks extends Product
    {

        private String co2;

        private double capacity;

        public Drinks(int itemNumber, String itemName, double price, double calories, String allergens, String co2, double capacity)

        {
            super(itemNumber, itemName, price, calories, allergens);

            this.co2 = co2;

            this.capacity = capacity;
        }

        public String getCo2() {
            return co2;
        }

        public void setCo2(String co2) {
            this.co2 = co2;
        }

        public double getCapacity() {
            return capacity;
        }

        public void setCapacity(double capacity) {
            this.capacity = capacity;
        }

        @Override
        public String examine() {
            return null;
        }
    }




        class Food extends Product

    {
        private double weight;

        public Food(int itemNumber, String itemName, double price, double calories, String allergens, double weight)
        {

            super(itemNumber, itemName, price, calories, allergens);

            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public String examine() {
            return null;
        }
    }




    class Sweets extends Product
    {
        private String containGelatin ;

        @Override
        public String examine() {
            return null;
        }

        public Sweets(int itemNumber, String itemName, double price, double calories, String containGelatin) {

            super(itemNumber, itemName, price, calories, allergens);

            this.containGelatin=containGelatin;
        }

        public String getContainGelatin() {
            return containGelatin;
        }

        public void setContainGelatin(String containGelatin) {
            this.containGelatin = containGelatin;
        }
    }





   /* @Override
    public String toString() {
        return "Product{" +
                "itemNumber=" + itemNumber +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", allergens='" + allergens + '\'' +
                '}';
    }

public Product()
{
    System.out.println(toString());*/


}

class Item {
    int id;
    String name;
    double price;

    //TODO add variable.
    char danok;

    //TODO constructor
    public Item(int id, String name, double price, char danok)	{
        this.id=id;
        this.name=name;
        this.price=price;
        this.danok=danok;
    }

    //TODO setters and getters

    public void setId(int id){ this.id=id;}
    public void setName(String name){ this.name=name; }
    public void setPrice(double price) { this.price=price; }
    public void setDanok(char danok) { this.danok=danok;}

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public char getDanok() { return danok; }

    public double taxReturn () {
        //TODO
        return price*0.15;
    }
}

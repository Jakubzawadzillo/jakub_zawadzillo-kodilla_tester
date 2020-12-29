public class Notebook
{
    String weight;
    int price;
    int year;



    public Notebook(String weight, int price, int year)
    {
        this.weight=weight;
        this.price=price;
        this.year=year;
    }

    public void chceckPrice()
    {
        if (this.price < 600)
        {
            System.out.println("This notebook is very cheap!");
        }


        else if (this.price >600 && this.price < 1000)
        {
            System.out.println("The price is good");
        }

        else
        {
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight()
    {
        String convert1= this.weight.replace("g", "");
        int convert2= Integer.parseInt(convert1);

        if (convert2 < 1100)
        {
            System.out.println("This notebook is ultralight");
        }
        else if (convert2 > 1100 && convert2 < 1900)
        {
            System.out.println("This notebook's weight is medium");
        }
        else
        {
            System.out.println("This notebook is heavy");
        }
    }

    public void priceAndYear()
    {
        if(this.price > 3000 && this.year > 2019)
        {
            System.out.println("Its a notebook from " + this.year + " and it costs " + this.price + " it may be worth it..."  );
        }

        else if (this.price > 3000 && this.year < 2019)
        {
            System.out.println("Its a notebook from" + this.year + " and it costs "+ this.price + " consider it!");
        }

        else
        {
            System.out.println("it may be worth it, hovever consider it");
        }



    }

}

public class FirstClass {
    public static void main(String[] args)
    {
        Notebook notebook= new Notebook("600g",1000, 2020);
        Notebook heavyNotebook= new Notebook("2000g", 2000, 2018);
        Notebook oldNotebook= new Notebook("1200g", 500, 2011);
        Notebook macBook= new Notebook("500g",4000, 2020 );
        Notebook hpBook= new Notebook("700g", 3200, 2019);
        Notebook vaioBook= new Notebook("2700g", 3000, 2009);
        Notebook toschibaBook= new Notebook("3200g", 3000, 2007);
        Notebook dellBook= new Notebook("2200g", 4200, 2020);
        Notebook lenovoBook= new Notebook("3000g", 4200, 2020);


        displayNotebookParameters(notebook);
        displayNotebookParameters(heavyNotebook);
        displayNotebookParameters(oldNotebook);
        displayNotebookParameters(macBook);
        displayNotebookParameters(hpBook);
        displayNotebookParameters(vaioBook);
        displayNotebookParameters(toschibaBook);
        displayNotebookParameters(dellBook);
        displayNotebookParameters(lenovoBook);
    }

    public static void displayNotebookParameters(Notebook notebook)
    {
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.chceckPrice();
        notebook.priceAndYear();
    }

}
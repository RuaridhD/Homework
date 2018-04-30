public class Printer {

    private int sheets_left;

    public Printer(int sheets_left){
        this.sheets_left = sheets_left;
    }

    public int print(int pages, int copies){
        if (this.sheets_left > (pages * copies)){
            return sheets_left -= (pages * copies);
        }
        return sheets_left;
    }
}

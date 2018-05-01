public class Printer {

    private int sheets_left;
    private int toner_volume;

    public Printer(int sheets_left, int toner_volume){
        this.sheets_left = sheets_left;
        this.toner_volume = toner_volume;
    }

    public int print(int pages, int copies){
        if (this.sheets_left > (pages * copies) && (this.toner_volume > (pages * copies))){
            return (sheets_left -= (pages * copies));
        }
        return sheets_left;
    }

    public int fill(){
        return this.sheets_left = 50;
    }


}

public class People {
    public int  males,females;
   
    public double total() {
        return males + females;
    }
    public double male_percentage(){
        return 100*males / total();
    }
    public double female_percentage(){
        return 100*females / total();
    }
 
 
}

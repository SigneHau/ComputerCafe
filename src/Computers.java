public class Computers {
    private boolean[] availability;

    public Computers(){
        availability = new boolean[5];
        for (int i = 0; i < availability.length; i++){
            availability[i] = true; //All computers are initially available
        }
    }
}

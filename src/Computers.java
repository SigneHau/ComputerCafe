import java.util.ArrayList;

public class Computers {
    private boolean[] availability;

    public Computers(){
        availability = new boolean[5];
        for (int i = 0; i < availability.length; i++){
            availability[i] = true; //All computers are initially available
        }
    }

    //Metode som returnerer en arrayliste af typen Integer, som viser hvilke der er frie.
    public ArrayList<Integer> getAvailable(){
        ArrayList<Integer>list = new ArrayList<>();

//Løber gennem forloop, for at se om den er ledig eller ej.
        for (int i = 0;i<availability.length;i++){
            if(availability[i]){
                list.add(i);
            }
        }
        return list;
    }
}

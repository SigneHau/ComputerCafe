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

    public void BookComputer(int index){
        availability[index]= false; //Sætter computeren til optaget
        System.out.println("You have chosen the computer number " + index + ".");
    }

    public void UnBookComputer(int index){
        availability[index]= true; //Sætter computeren til fri
        System.out.println("You have now unbooked the computer.");
    }
}

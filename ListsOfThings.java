import java.util.ArrayList;

public class ListsOfThings{
    private ArrayList<String> list;

    public ListsOfThings(ArrayList<String> list){
        this.list = list;
    }
    public void addToList(String thing){
        list.add(thing);
    }
    public void removeThing(String thing){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(thing)){
                list.remove(i);
                i--;
            }
        }
    }
    public void sortList(){
        for(int i = 0; i < list.size(); i++){
            int lowestIndex = 0;
            for(int j = i; j < list.size(); j++){
                if(list.get(j).substring(0,1).compareTo(list.get(lowestIndex)) < 0){
                    lowestIndex = j;
                }
                String temp = list.get(i);
                list.set(i, list.get(lowestIndex));
                list.set(lowestIndex, temp);
            }
        }
    }
    public String formattedList(){
        String printedList = "";
        printedList += list.get(0);
        for(int i = 1; i < list.size(); i++){
            printedList += "\n" + list.get(i);
        }
        return printedList;
    }
}
import java.util.ArrayList;

public class Calendar {
    private ArrayList<Event> schedule;

    public Calendar(){
        schedule = new ArrayList<Event>();
    }
    public void addToCalendar(int hours, String name, int duration){
        schedule.add(0, new Event(hours, name, duration)); 
    }
    public void removeFromCalendar(int hours, String name, int duration){
        for(int i = 0; i < schedule.size(); i++){
            Event currentEvent = schedule.get(i);
            if(currentEvent.getName().equals(name) && currentEvent.getHours() == hours && currentEvent.getDuration() == duration){
                schedule.remove(i);
                break;
            }
        }
    }
}  
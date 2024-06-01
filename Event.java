public class Event {
    private int hour; 
    private String name; 
    private int duration;
    
    public Event(int hour, String name, int duration){
        this.hour = hour;
        this.name = name;
        this.duration = duration;
    }
    
    public int getHours(){
        return hour;
    }
    public String getName(){
        return name;
    }
    public int getDuration(){
        return duration;
    }
}
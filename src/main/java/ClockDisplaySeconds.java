package src.main.java;

public class ClockDisplaySeconds
{
    //Extend ClockDisplaySeconds to include a seconds field.
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    //Update all methods and parameters to accomodate this change
    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay1();
    }
    public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime1(hour, minute, second);
    }
    public void timeTick1(){
        seconds.increment();
        
        if(seconds.getValue() == 0){
            minutes.increment();
        }
        if(minutes.getValue() == 0){
            hours.increment();
        }
        updateDisplay1();
    }
    public void setTime1(int hour, int minute, int second){
        seconds.setValue(second);
        minutes.setValue(minute);
        hours.setValue(hour);
        updateDisplay1();
    }
    public String getTime1(){
        return display;
    }
    public void updateDisplay1(){
        String output = " ";
        output = hours.getDisplayValue() + ":";
        output = output + minutes.getDisplayValue() + ":";
        output = output + seconds.getDisplayValue();
        display = output;
    }
}

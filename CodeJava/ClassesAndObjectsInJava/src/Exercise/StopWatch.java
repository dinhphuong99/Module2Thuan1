package Exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StopWatch {
    private LocalDateTime startTime, endTime;

    public StopWatch(){
        this.startTime = LocalDateTime.now();
        this.endTime = LocalDateTime.now();
    }

    public void start(){
        this.startTime = LocalDateTime.now();
    }

    public LocalDateTime getStartTime(){
        return startTime;
    }

    public void end(){
        this.endTime = LocalDateTime.now();
    }

    public LocalDateTime getEndTime(){
        return this.endTime;
    }

    public long getElapsedTime(LocalDateTime startTime, LocalDateTime endTime){
        long mili = ((endTime.getHour() - startTime.getHour())*3600 + (endTime.getMinute() - startTime.getMinute())*60 +
                endTime.getSecond() - startTime.getSecond())*1000;
        return mili;
    }

}

/*
public class StopWatch {
    private Date startTime, endTime;
    private double start;
    private double end;

    Date date = new Date();

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date startTime() {
        Date time = date;
        return time;
    }

    public void start() {
        this.startTime = startTime();
        this.start = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = startTime();
        this.end = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return (end - start);
    }
}
 */
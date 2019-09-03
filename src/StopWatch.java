public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime(){
        return this.startTime;
    }

    public long getEndTime(){
        return this.endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public  void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}

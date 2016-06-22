public class Logger {

    /** Initialize your data structure here. */
    HashMap<String, Integer> map;
    public Logger() {
        map=new HashMap<>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false. The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message)){
            map.put(message, timestamp+10);
            return true;
        }
        if(map.get(message)>timestamp)
            return false;
            
        map.put(message, timestamp+10);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
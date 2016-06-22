// public class Logger {

//     /** Initialize your data structure here. */
//     HashMap<String, Integer> map;
//     public Logger() {
//         map=new HashMap<>();
//     }
    
//     /** Returns true if the message should be printed in the given timestamp, otherwise returns false. The timestamp is in seconds granularity. */
//     public boolean shouldPrintMessage(int timestamp, String message) {
//         if(!map.containsKey(message)){
//             map.put(message, timestamp+10);
//             return true;
//         }
//         if(map.get(message)>timestamp)
//             return false;
            
//         map.put(message, timestamp+10);
//         return true;
//     }
// }

// /**
//  * Your Logger object will be instantiated and called as such:
//  * Logger obj = new Logger();
//  * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
//  */
import java.util.concurrent.*;

public class Logger {
    ConcurrentHashMap<String, Integer> lastPrintTime;

    /** Initialize your data structure here. */
    public Logger() {
        lastPrintTime = new ConcurrentHashMap<String, Integer>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false. The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        Integer last = lastPrintTime.get(message);

        return last == null && lastPrintTime.putIfAbsent(message, timestamp) == null
                || last != null && timestamp - last >= 10 && lastPrintTime.replace(message, last, timestamp);

    }
}
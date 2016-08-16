public class RandomizedSet {
    HashMap<Integer, Integer> map;
    HashMap<Integer, Integer> rmap;
    int size=0;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map=new HashMap<>();
        rmap=new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val, size);
            rmap.put(size, val);
            
            size++;
            
            return true;
        }else{
            return false;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int k=map.get(val);
            size--;
            rmap.put(k,rmap.get(size));
            map.put(rmap.get(size),k);
            rmap.remove(size);
            map.remove(val);
            
            return true;
        }else
            return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        System.out.print(size);
        int rand=(int)(Math.random()*(size));
        System.out.print(rand);
        return rmap.get(rand);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
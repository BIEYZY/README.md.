package simulation;

/*
 * Replica simulates a data replica in
 * a distributed system.
 */
public class Replica {

    // Shared data value
    private int data = 0;

    /*
     * Synchronized write ensures thread safety.
     * This simulates controlled access to replicated data.
     */
    public synchronized void write(int value) {
        data = value;
        System.out.println("[" + TimeUtil.now() +
                "] Replica stored value " + value);
    }

    // Read operation
    public int read() {
        return data;
    }
}
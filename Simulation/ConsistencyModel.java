package simulation;

/*
 * ConsistencyModel defines how writes
 * are applied to replicated data.
 */
public interface ConsistencyModel {

    // Write operation under a consistency rule
    void write(int value);
}
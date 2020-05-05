package algorithems;

import java.util.Collection;

public interface IAlgo<T> {
    public T getVariable(Collection<T> coll, T var);
}
package generic;

public interface Repository<T, ID> {
    void save(T t);
    T findById(ID id);
}

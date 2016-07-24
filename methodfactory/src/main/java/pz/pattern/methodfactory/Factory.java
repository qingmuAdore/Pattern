package pz.pattern.methodfactory;

public interface Factory {
    <T extends Product> T createProduct(Class<T> cls);
}

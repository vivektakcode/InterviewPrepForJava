package CollectionsFramework;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Iterable implements java.lang.Iterable {


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        java.lang.Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return java.lang.Iterable.super.spliterator();
    }



}

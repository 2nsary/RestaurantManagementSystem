package application.util;

import java.util.ArrayList;
import java.util.List;

public class DataManager<PhantomEntity> {

    private List<PhantomEntity> items = new ArrayList<>();

    public void addItem(PhantomEntity item) {
        items.add(item);
    }

    public List<PhantomEntity> getItems() {
        return items;
    }

    public void removeItem(PhantomEntity item) {
        items.remove(item);
    }
}
package rs.elfak.mosis.tim1.myplaces;

import java.util.ArrayList;

public class MyPlacesData {

    private ArrayList<MyPlace> myPlaces;

    private MyPlacesData() {
        this.myPlaces = new ArrayList<MyPlace>();
        myPlaces.add(new MyPlace("Tvrdjava"));
        myPlaces.add(new MyPlace("Cair"));
        myPlaces.add(new MyPlace("Park Svetog Save"));
        myPlaces.add(new MyPlace("Trg Kralja Milana"));
        myPlaces.add(new MyPlace("Bubanj"));
    }

    private static class SingletonHolder {
        public static final MyPlacesData instance = new MyPlacesData();
    }

    public static MyPlacesData getInstance() {
        return  SingletonHolder.instance;
    }

    public ArrayList<MyPlace> getMyPlaces() {
        return myPlaces;
    }

    public void addNewPlace(MyPlace place) {
        myPlaces.add(place);
    }

    public MyPlace getPlace(int index) {
        return myPlaces.get(index);
    }

    public void deletePlace(int index) {
        myPlaces.remove(index);
    }
}

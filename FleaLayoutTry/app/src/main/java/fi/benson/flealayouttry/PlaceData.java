package fi.benson.flealayouttry;

import java.util.ArrayList;

/**
 * Created by megha on 15-03-06.
 */
public class PlaceData {

  public static String[] placeNameArray = {"Kengät", "T-paita", "Vanhoja leluja", "Tietokone", "Miesten takki", "Laskettelusukset"};
  public static String[] placePriceArray = {"20€", "5€", "Tarjoa!", "25€", "40€", "80€"};
  public static String[] imageNameArray = {"Shoes", "tshirt", "toy", "computer", "jacket", "skis"};

  //public static String[] placeNameArray = {"Bora Bora", "Canada", "Dubai", "Hong Kong", "Iceland", "India", "Kenya", "London", "Switzerland", "Sydney"};

  public static ArrayList<Place> placeList() {
    ArrayList<Place> list = new ArrayList<>();
    for (int i = 0; i < placeNameArray.length; i++) {
      Place place = new Place();
      place.name = placeNameArray[i]+" "+ placePriceArray[i];
      place.imageName = imageNameArray[i].replaceAll("\\s+", "").toLowerCase();
      if (i == 2 || i == 5) {
        place.isFav = true;
      }
      list.add(place);
    }
    return (list);
  }

  public static Place getItem(String _id) {
    for (Place place : placeList()) {
      if (place.id.equals(_id)) {
        return place;
      }
    }
    return null;
  }
}

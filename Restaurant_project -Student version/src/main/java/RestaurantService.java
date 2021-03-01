import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName){
//        return null;
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
        Restaurant newRestaurant = new Restaurant(restaurantName);
        if (restaurantName == null)
            return null;
        for (Restaurant restaurant : newRestaurant) {
            if (restaurant.getName().equals(restaurantName)) {
                return restaurant;
            }
        }
        return null;
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurant(List<Restaurant>  restaurants) {
        this.restaurants = restaurants;
    }
}

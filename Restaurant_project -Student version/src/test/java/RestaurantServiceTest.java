import org.junit.jupiter.api.*;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;


class RestaurantServiceTest {

    RestaurantService service = new RestaurantService();
    Restaurant restaurant;
    //REFACTOR ALL THE REPEATED LINES OF CODE
    @BeforeEach
    public void BeforeEachTest(){
        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        restaurant = service.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);

    }


    //>>>>>>>>>>>>>>>>>>>>>>SEARCHING<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @Test
    public void searching_for_existing_restaurant_should_return_expected_restaurant_object() throws restaurantNotFoundException {
        //WRITE UNIT TEST CASE HERE
        int existingRestaurant = service.findRestaurantByName().size();
        service.getRestaurants("Amelie's cafe");
        assertEquals("Amelia's Cafe", existingRestaurant);
//        assertNotNull(existingRestaurant);


    }
    @Test
    public void searching_for_existing_restaurant_should_return_expected_restaurant_object_Failure_Scenario() throws restaurantNotFoundException {
        //WRITE UNIT TEST CASE HERE
        int existingRestaurant = service.findRestaurantByName().size();
        service.getRestaurants("Amelie's cafe Wrong Input");
        assertEquals("Amelia's Cafe", existingRestaurant); // returns False
        assertNotEquals("Amelia's Cafe",existingRestaurant ); //returns true
//        assertNotNull(existingRestaurant);


    }

    //You may watch the video by Muthukumaran on how to write exceptions in Course 3: Testing and Version control: Optional content
    @Test
    public void searching_for_non_existing_restaurant_should_throw_exception() throws restaurantNotFoundException {
        //WRITE UNIT TEST CASE HERE
//        int existingRestaurantNotFound = service.findRestaurantByName().size();
//        assertEquals("Restaurant Not Found", existingRestaurantNotFound);
//        assertNull(existingRestaurantNotFound);
//        service.getRestaurants("Restaurant Not Found");
        assertThrows(restaurantNotFoundException.class,()-> service.getRestaurants("Restaurant Not Found"));
    }
    //<<<<<<<<<<<<<<<<<<<<SEARCHING>>>>>>>>>>>>>>>>>>>>>>>>>>




    //>>>>>>>>>>>>>>>>>>>>>>ADMIN: ADDING & REMOVING RESTAURANTS<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @Test
    public void remove_restaurant_should_reduce_list_of_restaurants_size_by_1() throws restaurantNotFoundException {
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant = service.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);

        int initialNumberOfRestaurants = service.getRestaurants().size();
        service.removeRestaurant("Amelie's cafe");
        assertEquals(initialNumberOfRestaurants-1, service.getRestaurants().size());
    }

    @Test
    public void remove_restaurant_should_reduce_list_of_restaurants_size_by_1_Failure_Scenario() throws restaurantNotFoundException {
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant = service.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);

        int initialNumberOfRestaurants = service.getRestaurants().size();
        service.removeRestaurant("Amelia Cafe Wrong Input");
        assertEquals(initialNumberOfRestaurants-1, service.getRestaurants().size());
        assertNotEquals(initialNumberOfRestaurants-1, service.getRestaurants().size());

    }

    @Test
    public void removing_restaurant_that_does_not_exist_should_throw_exception() throws restaurantNotFoundException {
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant = service.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);

        assertThrows(restaurantNotFoundException.class,()->service.removeRestaurant("Pantry d'or"));
    }

    @Test
    public void add_restaurant_should_increase_list_of_restaurants_size_by_1(){
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant = service.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);

        int initialNumberOfRestaurants = service.getRestaurants().size();
        service.addRestaurant("Pumpkin Tales","Chennai",LocalTime.parse("12:00:00"),LocalTime.parse("23:00:00"));
        assertEquals(initialNumberOfRestaurants + 1,service.getRestaurants().size());
    }
    //<<<<<<<<<<<<<<<<<<<<ADMIN: ADDING & REMOVING RESTAURANTS>>>>>>>>>>>>>>>>>>>>>>>>>>

    @Test
    public void add_restaurant_should_increase_list_of_restaurants_size_by_1_Failure_Scenario(){
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant = service.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);
        displayCost
        int initialNumberOfRestaurants = service.getRestaurants().size();
        service.addRestaurant("Invalid","Invalid",LocalTime.parse("26:00:00"),LocalTime.parse("27:00:00"));
        System.out.println("Invalid Input")
        assertEquals(initialNumberOfRestaurants + 1,service.getRestaurants().size()); //return flase
        assertNotEquals(initialNumberOfRestaurants + 1,service.getRestaurants().size()); // Not Equals So return true
    }
}
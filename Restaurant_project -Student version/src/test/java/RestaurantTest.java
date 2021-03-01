import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    Restaurant restaurant;
    //REFACTOR ALL THE REPEATED LINES OF CODE
    @BeforeEach
    public void BeforeEachFunction(){
        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);
    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>OPEN/CLOSED<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //-------FOR THE 2 TESTS BELOW, YOU MAY USE THE CONCEPT OF MOCKING, IF YOU RUN INTO ANY TROUBLE
    @Test
    public void is_restaurant_open_should_return_true_if_time_is_between_opening_and_closing_time(){
        //WRITE UNIT TEST CASE HERE
//        restaurant = new Restaurant();

        int isRestaurantOpened = restaurant.isRestaurantOpen().size();
        restaurant.isRestaurantOpen("Restaurant is Open");
        assertEquals("Restaurant is Open",restaurant.isRestaurantOpen().size());

    }

    @Test
    public void is_restaurant_open_should_return_true_if_time_is_between_opening_and_closing_time(){
        //WRITE UNIT TEST CASE HERE
//        restaurant = new Restaurant();

        int isRestaurantOpened = restaurant.isRestaurantOpen().size();
        restaurant.isRestaurantOpen("Restaurant is Open");
        assertEquals("Restaurant is Open",restaurant.isRestaurantOpen().size());

    }



    @Test
    public void is_restaurant_open_should_return_true_if_time_is_between_opening_and_closing_time_Failure_Scenario(){
        //WRITE UNIT TEST CASE HERE
//        restaurant = new Restaurant();

        int isRestaurantOpened = restaurant.isRestaurantOpen().size();
        restaurant.isRestaurantOpen("Invalid Input");
        assertEquals("Invalid Input",restaurant.isRestaurantOpen().size());
        System.out.println("Enter proper timing in proper format 23:00:00")

    }

    @Test
    public void is_restaurant_open_should_return_false_if_time_is_outside_opening_and_closing_time(){
        //WRITE UNIT TEST CASE HERE
//        restaurant = new Restaurant();
        int isRestaurantClosed = restaurant.isRestaurantOpen().size();
        restaurant.isRestaurantOpen("Restaurant is Closed");
        assertEquals("Restaurant is Closed",restaurant.isRestaurantOpen().size());

    }
    @Test
    public void is_restaurant_open_should_return_false_if_time_is_outside_opening_and_closing_time_Failure_Scenario(){
        //WRITE UNIT TEST CASE HERE
//        restaurant = new Restaurant();
        int isRestaurantClosed = restaurant.isRestaurantOpen().size();
        restaurant.isRestaurantOpen("Out of Scope");
        assertEquals("Out of Scope",restaurant.isRestaurantOpen().size());


    }
    @Test
    public void is_totalPrice_Is_displayed_properly_Added_To_The_Menu_Success_Senario(){
        //WRITE UNIT TEST CASE HERE
//        restaurant = new Restaurant();
        int isTotalPriceDisplayed = restaurant.getTotalPrice().size();
        restaurant.getTotalPrice("Correct Amount Displayed", isTotalPriceDisplayed);
        assertEquals(isTotalPriceDisplayed,restaurant.getTotalPrice().size());


    }

    @Test
    public void is_totalPrice_Is_displayed_properly_Added_To_The_Menu_Success_Senario_Correct_Sum(){
        //WRITE UNIT TEST CASE HERE
//        restaurant = new Restaurant();
        int isTotalPriceDisplayedSummationCorrect = restaurant.displayCost(totalPrice).size();
        restaurant.displayCost("Correct Sum Amount Displayed", isTotalPriceDisplayed);
        assertEquals(isTotalPriceDisplayed,restaurant.getTotalPrice().size());


    }
    @Test
    public void is_totalPrice_Is_displayed_properly_Added_To_The_Menu_Failure_Senario(){
        //WRITE UNIT TEST CASE HERE
//        restaurant = new Restaurant();
        int isTotalNotPriceDisplayed = restaurant.getTotalPriceWrongMethodCalled().size();
        restaurant.getTotalPriceWrongMethodCalled("InCorrect Amount Displayed", isTotalNotPriceDisplayed);
        System.out.println("Method Does not exists");
        assertEquals(isTotalNotPriceDisplayed,restaurant.getTotalPriceWrongMethodCalled().size());


    }
    @Test
    public void is_totalPrice_Is_displayed_properly_Added_To_The_Menu_Failure_Senario_Summation_Incorrect(){
        //WRITE UNIT TEST CASE HERE
//        restaurant = new Restaurant();
        int isTotalPriceDisplayedSumIncorrect = restaurant.displayCost(totalPrice).size();
        restaurant.displayCost("InCorrect Amount Displayed due to Wrong Summation", isTotalPriceDisplayedSummationCorrect);
        assertEquals(isTotalPriceDisplayedSumIncorrect,restaurant.displayCost(totalPrice).size());


    }

    //<<<<<<<<<<<<<<<<<<<<<<<<<OPEN/CLOSED>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @Test
    public void adding_item_to_menu_should_increase_menu_size_by_1(){
        //Refactoring Repititive Code
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);

        int initialMenuSize = restaurant.getMenu().size();
        restaurant.addToMenu("Sizzling brownie",319);
        assertEquals(initialMenuSize+1,restaurant.getMenu().size());
    }
    @Test
    public void adding_item_to_menu_should_increase_menu_size_by_1_Failure_Scenario(){
        //Refactoring Repititive Code
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);

        int initialMenuSize = restaurant.getMenu().size();
        restaurant.addToMenu("Sizzling brownie",319);
        assertEquals(initialMenuSize-1,restaurant.getMenu().size());
        System.out.println("Will decrease Instead of adding");
    }

    @Test
    public void removing_item_from_menu_should_decrease_menu_size_by_1() throws itemNotFoundException {
        //Refactoring Repititive Code
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);

        int initialMenuSize = restaurant.getMenu().size();
        restaurant.removeFromMenu("Vegetable lasagne");
        assertEquals(initialMenuSize-1,restaurant.getMenu().size());
    }


    @Test
    public void removing_item_from_menu_should_decrease_menu_size_by_1() throws itemNotFoundException_Failure_Scenario {
        //Refactoring Repititive Code
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);

        int initialMenuSize = restaurant.getMenu().size();
        restaurant.removeFromMenu("Vegetable lasagne");
        assertEquals(initialMenuSize+1,restaurant.getMenu().size());
        System.out.println("Will Add instead of removal");
    }
    @Test
    public void removing_item_that_does_not_exist_should_throw_exception() {
        //Refactoring Repititive Code
//        LocalTime openingTime = LocalTime.parse("10:30:00");
//        LocalTime closingTime = LocalTime.parse("22:00:00");
//        restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
//        restaurant.addToMenu("Sweet corn soup",119);
//        restaurant.addToMenu("Vegetable lasagne", 269);

        assertThrows(itemNotFoundException.class,
                ()->restaurant.removeFromMenu("French fries"));
    }
    //<<<<<<<<<<<<<<<<<<<<<<<MENU>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
}
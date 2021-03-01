import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    public LocalTime openingTime;
    public LocalTime closingTime;
    private List<Item> menu = new ArrayList<Item>();
    public calendar = Calendar.getInstance();
    public time = calendar.time;
    public currentTime: String = SimpleDateFormat("HH:mm").format(time);

    public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public boolean isRestaurantOpen() {
//        return true;
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
        if(currentTime.compareTo(openingTime) >= 0 currentTime.compareTo(closingTime) < 0){
           System.out.println("Restaurant is Open");
        }
        else{
            System.out.println("Restaurant is Closed!");
        }


    }

    public LocalTime getCurrentTime(){ return  LocalTime.now(); }

    public List<Item> getMenu() {
       // return null;
        //DELETE ABOVE RETURN STATEMENT AND WRITE CODE HERE
        return item;
    }

    public void setMenu(List<Item> item) {
        this.item = item;
    }

    private Item findItemByName(String itemName){
        for(Item item: menu) {
            if(item.getName().equals(itemName))
                return item;
        }
        return null;
    }

    public void addToMenu(String name, int price) {
        Item newItem = new Item(name,price);
        menu.add(newItem);
    }
    
    public void removeFromMenu(String itemName) throws itemNotFoundException {

        Item itemToBeRemoved = findItemByName(itemName);
        if (itemToBeRemoved == null)
            throw new itemNotFoundException(itemName);

        menu.remove(itemToBeRemoved);
    }
    public void displayDetails(){
        System.out.println("Restaurant:"+ name + "\n"
                +"Location:"+ location + "\n"
                +"Opening time:"+ openingTime +"\n"
                +"Closing time:"+ closingTime +"\n"
                +"Menu:"+"\n"+getMenu());

    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
         this.name = name;
    }

}

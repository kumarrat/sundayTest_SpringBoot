package com.geekster.Restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    List<Restaurant> restaurantList;

    //Add a Restaurant
    @PostMapping("restaurant")
    public String addRestaurant(@RequestBody Restaurant myRestaurant)
    {
        restaurantList.add(myRestaurant);
        return "restaurant added";
    }
    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurant(){
        return restaurantList;
    }

    //Update Restaurant
    @PutMapping("restaurant/id/{id}/status")
    public String setRestaurantById(@PathVariable Integer id)
    {
        for(Restaurant restaurant : restaurantList)
        {
            if(restaurant.getRestaurantId().equals(id))
            {
                return "restaurant" + " " + id + " " + "updated";
            }
        }

        return "Invalid id";
    }

    @DeleteMapping("restaurant/id/{id}")
    public String removeRestaurantStatusId(@PathVariable Integer id)
    {

        for(Restaurant restaurant : restaurantList)
        {
            if(restaurant.getRestaurantId().equals(id))
            {
                restaurantList.remove(restaurant);
            }
        }
        return "Invalid id";
    }

}

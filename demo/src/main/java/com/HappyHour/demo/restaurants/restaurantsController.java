package com.HappyHour.demo.restaurants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "api/restaurants")
public class restaurantsController {

    @GetMapping
    public List<restaurants> getRestaurants() {
        ArrayList<restaurants> restaurantList = new ArrayList<restaurants>();
        restaurants restaurants = new restaurants(1, "Babylon", "Nashville", "Free coffee");
        restaurantList.add(restaurants);
        return restaurantList;
    }



    @PostMapping(path = "restaurants")
    public void addRestaurants(){

    }

}

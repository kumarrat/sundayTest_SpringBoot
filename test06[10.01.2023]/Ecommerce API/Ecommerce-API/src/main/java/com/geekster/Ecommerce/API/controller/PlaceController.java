package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.Address;
import com.geekster.Ecommerce.API.model.Place;
import com.geekster.Ecommerce.API.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaceController {
    @Autowired
    PlaceService placeService;

    @PostMapping("place")
    public String addPlace(@RequestBody Place newPlace)
    {
        return PlaceService.savePlace(newPlace);
    }

    @GetMapping("places")
    public List<Place> getPlace()
    {
        return placeService.getPlace();
    }

    @GetMapping("place/{placeId}/address")
    public Address getAddressByPlaceId(@PathVariable Integer placeId)
    {
        return placeService.getAddressByPlaceId(placeId);

    }

}

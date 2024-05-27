package com.example.backend.Controller;

import com.example.backend.Repository.ItemRepository;
import com.example.backend.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/api/items")
    public List <Item> getItems(){
        List<Item> items = itemRepository.findAll();
        return items;
    }
}

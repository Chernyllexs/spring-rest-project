package com.chernyllexs.shop.controllers;

import com.chernyllexs.shop.models.ShopDto;
import com.chernyllexs.shop.services.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopServiceImpl shopService;

    @DeleteMapping("/{id}")
    public void deleteShop(@PathVariable Long id) {
        shopService.deleteShopById(id);
    }

    @PatchMapping("/{id}")
    public void updateShop(@PathVariable Long id, @RequestBody ShopDto shopDto) {
        shopService.updateShopById(id, shopDto);
    }

    @PostMapping("/add")
    public void addShop(@RequestBody ShopDto shopDto) {
        shopService.addShop(shopDto);
    }

    @GetMapping
    public List<ShopDto> getShops() {
        return shopService.getAllShops();
    }

    @GetMapping("/{id}")
    public ShopDto getShop(@PathVariable Long id) {
        return shopService.getShopById(id);
    }

    @PutMapping("/{id}")
    public void rewriteShop(@PathVariable Long id, @RequestBody ShopDto shopDto) {
        shopService.rewriteShop(id, shopDto);
    }
}

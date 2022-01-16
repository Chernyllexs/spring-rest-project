package com.chernyllexs.shop.controllers;

import com.chernyllexs.shop.models.PurchasesDto;
import com.chernyllexs.shop.services.PurchasesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchasesController {

    @Autowired
    private PurchasesServiceImpl purchasesService;

    @DeleteMapping("/{id}")
    public void deletePurchase(@PathVariable Long id) {
        purchasesService.deletePurchasesById(id);
    }

    @PatchMapping("/{id}")
    public void updatePurchase(@PathVariable Long id, @RequestBody PurchasesDto purchasesDto) {
        purchasesService.updatePurchasesById(id, purchasesDto);
    }

    @PostMapping("/add")
    public void addPurchase(@RequestBody PurchasesDto purchasesDto) {
        purchasesService.addPurchases(purchasesDto);
    }

    @GetMapping
    public List<PurchasesDto> getPurchases() {
        return purchasesService.getAllPurchases();
    }

    @GetMapping("/{id}")
    public PurchasesDto getPurchase(@PathVariable Long id) {
        return purchasesService.getPurchasesById(id);
    }

    @PutMapping("/{id}")
    public void rewritePurchases(@PathVariable Long id, @RequestBody PurchasesDto purchasesDto) {
        purchasesService.rewritePurchases(id, purchasesDto);
    }
}

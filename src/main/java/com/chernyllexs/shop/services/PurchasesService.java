package com.chernyllexs.shop.services;

import com.chernyllexs.shop.models.PurchasesDto;

import java.util.List;

public interface PurchasesService {
    void deletePurchasesById(Long id);

    void updatePurchasesById(Long id, PurchasesDto updatedPurchasesDto);

    void addPurchases(PurchasesDto newPurchasesDto);

    List<PurchasesDto> getAllPurchases();

    PurchasesDto getPurchasesById(Long id);

    void rewritePurchases(Long id, PurchasesDto newPurchasesDto);

    List<String> getDifferentMonths();

    List<String> getSurnameAndShop();

    List<String> getOrderDetails();

    List<String> getOrderDetailsA();
}

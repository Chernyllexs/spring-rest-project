package com.chernyllexs.shop.services;

import com.chernyllexs.shop.entity.PurchasesEntity;
import com.chernyllexs.shop.models.PurchasesDto;
import com.chernyllexs.shop.repository.PurchaseRepository;
import com.chernyllexs.shop.utill.exception.PurchasesNotFoundException;
import com.chernyllexs.shop.utill.mapper.PurchasesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchasesServiceImpl implements PurchasesService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private PurchasesMapper purchasesMapper;

    @Override
    public void deletePurchasesById(Long id) {
        purchaseRepository.deleteById(id);
    }

    @Override
    public void updatePurchasesById(Long id, PurchasesDto updatedPurchasesDto) {

    }

    @Override
    public void addPurchases(PurchasesDto newPurchasesDto) {
        purchaseRepository.save(purchasesMapper.convertToEntity(newPurchasesDto));
    }

    @Override
    public List<PurchasesDto> getAllPurchases() {
        Iterable<PurchasesEntity> iterable = purchaseRepository.findAll();
        ArrayList<PurchasesDto> purchasesDto = new ArrayList<>();
        for (PurchasesEntity purchasesEntity : iterable) {
            purchasesDto.add(purchasesMapper.convertToDto(purchasesEntity));
        }
        return purchasesDto;
    }

    @Override
    public PurchasesDto getPurchasesById(Long id) {
        PurchasesEntity purchasesEntity = purchaseRepository.findById(id).orElseThrow(() -> new PurchasesNotFoundException("Purchase not found: id = " + id));
        return purchasesMapper.convertToDto(purchasesEntity);
    }

    @Override
    public void rewritePurchases(Long id, PurchasesDto newPurchasesDto) {

    }

    @Override
    public List<String> getDifferentMonths() {
        return purchaseRepository.getDifferentMonths();
    }

    @Override
    public List<String> getSurnameAndShop() {
        return purchaseRepository.getSurnameAndShop();
    }

    @Override
    public List<String> getOrderDetails() {
        return purchaseRepository.getOrderDetails();
    }

    @Override
    public List<String> getOrderDetailsA() {
        return purchaseRepository.getOrderDetailsA();
    }
}

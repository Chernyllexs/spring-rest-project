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
        PurchasesDto purchasesById = getPurchasesById(id);
        if (updatedPurchasesDto.getOrderAmount() != null)
            purchasesById.setOrderAmount(updatedPurchasesDto.getOrderAmount());
        if (updatedPurchasesDto.getOrderBook() != null)
            purchasesById.setOrderBook(updatedPurchasesDto.getOrderBook());
        if (updatedPurchasesDto.getOrderBook() != null)
            purchasesById.setOrderCustomerEntity(updatedPurchasesDto.getOrderCustomerEntity());
        if (updatedPurchasesDto.getOrderCustomerEntity() != null)
            purchasesById.setPurchaseId(updatedPurchasesDto.getPurchaseId());
        if (updatedPurchasesDto.getPurchaseId() != null)
            purchasesById.setOrderSeller(updatedPurchasesDto.getOrderSeller());
        if (updatedPurchasesDto.getOrderSeller() != null)
            purchasesById.setOrderDate(updatedPurchasesDto.getOrderDate());
        purchaseRepository.save(purchasesMapper.convertToEntity(purchasesById));
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
        PurchasesDto purchasesById = getPurchasesById(id);
        purchasesById.setOrderAmount(newPurchasesDto.getOrderAmount());
        purchasesById.setOrderBook(newPurchasesDto.getOrderBook());
        purchasesById.setOrderCustomerEntity(newPurchasesDto.getOrderCustomerEntity());
        purchasesById.setPurchaseId(newPurchasesDto.getPurchaseId());
        purchasesById.setOrderSeller(newPurchasesDto.getOrderSeller());
        purchasesById.setOrderDate(newPurchasesDto.getOrderDate());
        purchaseRepository.save(purchasesMapper.convertToEntity(purchasesById));
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

    @Override
    public List<String> getOrderDetailsB() {
        return purchaseRepository.getOrderDetailsB();
    }

    @Override
    public List<String> getOrderDetailsC() {
        return purchaseRepository.getOrderDetailsC();
    }

    @Override
    public List<String> getOrderDetailsD() {
        return purchaseRepository.getOrderDetailsD();
    }
}

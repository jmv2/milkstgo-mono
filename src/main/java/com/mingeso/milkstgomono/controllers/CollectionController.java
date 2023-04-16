package com.mingeso.milkstgomono.controllers;

import com.mingeso.milkstgomono.entities.CollectionEntity;
import com.mingeso.milkstgomono.services.CollectionService;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/acopio")
public class CollectionController {
    @Autowired
    CollectionService collectionService;

    @GetMapping("/delete-all")
    public String deleteAllCollections() {
        collectionService.deleteAllCollections();
        return "redirect:/";
    }

    @GetMapping("/importar")
    public String importForm() {
        return "collection";
    }

    @PostMapping("/importar")
    public String importMilkCollection(@RequestParam("collectionExcelFile") MultipartFile file) throws IOException {

        Workbook workbook = new XSSFWorkbook(file.getInputStream());
        Sheet sheet = workbook.getSheet("Hoja1");
        List<CollectionEntity> collectionEntityList = new ArrayList<CollectionEntity>();

        int rowCount = sheet.getLastRowNum() - sheet.getTopRow();

        for (int i = 1; i < rowCount; i++) {
           Row row = sheet.getRow(i);
           Date dateCollection = row.getCell(0).getDateCellValue();
           String turn = row.getCell(1).getStringCellValue();
           Double codProviderNum = row.getCell(2).getNumericCellValue();
           String codProvider = codProviderNum.toString();
           double milkAmount = row.getCell(3).getNumericCellValue();

           CollectionEntity collectionEntity = new CollectionEntity();

           collectionEntity.setDateCollection(dateCollection);
           collectionEntity.setTurn(turn);
           collectionEntity.setCodProvider(codProvider);
           collectionEntity.setMilkAmount(milkAmount);

           collectionEntityList.add(collectionEntity);

        }
        collectionService.saveAll(collectionEntityList);

        return "redirect:/";
    }

}

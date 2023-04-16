package com.mingeso.milkstgomono.controllers;

import com.mingeso.milkstgomono.entities.LabAnalisysEntity;
import com.mingeso.milkstgomono.services.LabAnalisysService;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/lab")
public class LabAnalisysController {
    @Autowired
    LabAnalisysService labAnalisysService;

    @GetMapping("/analisis")
    public String importPercents() {
        return "labanalisys";
    }
    @PostMapping("/analisis")
    public String importLabAnalysis(@RequestParam("labAnalisysExcelFile") MultipartFile file) throws IOException {

        Workbook workbook = new XSSFWorkbook(file.getInputStream());
        Sheet sheet = workbook.getSheet("Hoja1");
        List<LabAnalisysEntity> labAnalisysEntityList = new ArrayList<LabAnalisysEntity>();

        int rowCount = sheet.getLastRowNum() - sheet.getTopRow();

        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            //Double codProviderNum = row.getCell(0).getNumericCellValue();
            //String codProvider = codProviderNum.toString();
            String codProvider = row.getCell(0).getStringCellValue();
            double butterfat = row.getCell(1).getNumericCellValue();
            double totalSolid = row.getCell(2).getNumericCellValue();

            LabAnalisysEntity labAnalisysEntity = new LabAnalisysEntity();

            labAnalisysEntity.setCodProvider(codProvider);
            labAnalisysEntity.setButterfat(butterfat);
            labAnalisysEntity.setTotalSolid(totalSolid);

            labAnalisysEntityList.add(labAnalisysEntity);

        }
        labAnalisysService.saveAll(labAnalisysEntityList);

        return "redirect:/";
    }

    @GetMapping("/delete-all")
    public String deleteAllLabAnalisys(){
        labAnalisysService.deleteAllLabAnalisys();
        return "redirect:/";
    }
}

package com.salted_fish.fishing.Controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import com.salted_fish.fishing.Dto.SubCateListDetail;
import com.salted_fish.fishing.Entity.CateList;
import com.salted_fish.fishing.Entity.CateObjForHome;
import com.salted_fish.fishing.Entity.SubCateList;
import com.salted_fish.fishing.Service.GetCateService;
import com.salted_fish.fishing.Utils.JsonUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CateResourceController {

    @Autowired
    private GetCateService cateService;

    private Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @GetMapping(value = "/getInitCates")
    @ResponseBody
    public JsonUtil<?> getAllInitCates(@RequestParam(value = "cateId", required = false) Integer cateId) {

        logger.info("get into getAllCates at " + new Date());

        try {
            List<CateList> cateList = cateService.getAllCates();
            if (cateId == null) {
                cateId = cateList.get(0).getCate_Id();
            }
            List<SubCateList> subCateList = cateService.getSubcateLists(cateId);
            CateObjForHome result = new CateObjForHome(cateList, subCateList);
            return new JsonUtil<>(result, "200", "load data successful");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new JsonUtil<>(null, "201", "load data failed");
        }
    }

    @GetMapping(value = "/getSubCatesList")
    @ResponseBody
    public JsonUtil<?> getSubCatesListDetail(@RequestParam(value = "cateId") int cateId,
            @RequestParam(value = "subCateId") int subCateId) {

        logger.info("get into getSubCatesList at " + new Date());

        try {
            SubCateListDetail result = cateService.getSubCateListDetail(cateId, subCateId);
            return new JsonUtil<>(result, "200", "load data successful");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new JsonUtil<>(null, "201", "load data failed");
        }
    }
}
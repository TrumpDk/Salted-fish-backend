package com.salted_fish.fishing.Controller;

import java.util.Date;
import java.util.List;

import com.salted_fish.fishing.Dto.PageHelperDto;
import com.salted_fish.fishing.Entity.Commodity;
import com.salted_fish.fishing.Service.CommodityService;
import com.salted_fish.fishing.Utils.JsonUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private CommodityService commodityService;

    private Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @PostMapping("/loadHomeData")
    public JsonUtil<?> loadLimitedData(@RequestBody PageHelperDto pageHelperDto) {

        logger.info("get into loadHomeData at " + new Date());
        
        try {
            List<Commodity> result = commodityService.selectLimitedCommodity(pageHelperDto.getStartIndex(), pageHelperDto.getPageSize());
            return new JsonUtil<>(result, "200", "load data successful");
        } catch(Exception e) {
            logger.error(e.getMessage());
            return new JsonUtil<>(null, "201", "load data failed");
        }
    }
}
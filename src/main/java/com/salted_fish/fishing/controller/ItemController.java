package com.salted_fish.fishing.Controller;

import java.util.Date;

import com.salted_fish.fishing.Dto.ItemDetailDto;
import com.salted_fish.fishing.Service.ItemDetailService;
import com.salted_fish.fishing.Utils.JsonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class ItemController {

    private Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    ItemDetailService idetaiService;

    @GetMapping("/getItemDetail")
    @ResponseBody
    public JsonUtil<?> getItemDetail(@RequestParam(value = "id") int id) {

        logger.info("get into getItemDetail at " + new Date());

        try {
            ItemDetailDto result = idetaiService.getItemDetailObjById(id);
            return new JsonUtil<>(result, "200", "load data successful");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new JsonUtil<>(null, "201", "load data failed");
        }
    }
}
package com.salted_fish.fishing.ServiceImpl;

import com.salted_fish.fishing.Dto.ItemDetailDto;
import com.salted_fish.fishing.Mapper.ItemDetailObjMapper;
import com.salted_fish.fishing.Service.ItemDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ItemDetailService")
public class ItemDetailServiceImpl implements ItemDetailService {

    @Autowired
    ItemDetailObjMapper itemDetailObjMapper;

    @Override
    public ItemDetailDto getItemDetailObjById(int id) {
        return itemDetailObjMapper.getItemDetailByItemId(id);
    }

}
package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.FoodMapper;
import com.neusoft.elmboot.po.Food;
import com.neusoft.elmboot.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Resource
    private FoodMapper foodMapper;
    @Override
    public List<Food> selectFoodList() {
        return foodMapper.selectFoodList();
    }
}

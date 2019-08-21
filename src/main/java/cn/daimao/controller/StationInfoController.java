package cn.daimao.controller;

import cn.daimao.pojo.Temp;
import cn.daimao.service.StationInfoService;

import com.thoughtworks.xstream.io.json.JsonWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("daimao")
public class StationInfoController {
    @Autowired
    private StationInfoService stationInfoService;

    @RequestMapping("search")
    @ResponseBody
    public Map<String,String> getData(String stn,String wban){
        List<Temp>listTemp =stationInfoService.getTemp(stn,wban);
        //System.out.println(listTemp);
        //System.out.println(stn+"nmsl"+wban);
        Map<String,String> map = new HashMap<>();
        String temp = JSON.toJSONString(listTemp);
        map.put("temp",temp);
        return map;
    }
}

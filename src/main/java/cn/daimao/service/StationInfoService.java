package cn.daimao.service;
import cn.daimao.mapper.WeatherMapper;
import cn.daimao.pojo.Temp;
import cn.daimao.pojo.Weather2016;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StationInfoService {
    @Autowired
    private WeatherMapper weatherMapper;
    private static Map<String, List<Weather2016>> map=null;

/*    public List<Weather2016> getData(String stn, String wban) {
*//*        if(map==null) {
            map= new HashMap<>();
        }
        String key = stn+wban;
        if(!map.containsKey(key)) {

            //List<Weather2016> list = weatherMapper.getData(stn,wban);
            //map.put(key, list);
        }
        return map.get(key);
    }*/

    public List<Temp> getTemp(String stn, String wban) {
        List<Weather2016> list =weatherMapper.getData(stn,wban);
        List<Temp> tempList =new ArrayList<>();
        for(Weather2016 w :list){
            Temp t = new Temp();
            if(stn.equals(w.getStn())&wban.equals(w.getWban())){
            t.setStn(stn);
            t.setWban(wban);
            t.setDewp(w.getDewp());
            t.setMax(w.getMax());
            t.setMin(w.getMin());
            t.setTemp(w.getTemp());
            tempList.add(t);
            }
        }
        System.out.println(tempList);
        return tempList;
    }
}

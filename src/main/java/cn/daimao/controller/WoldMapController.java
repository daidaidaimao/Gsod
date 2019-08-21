package cn.daimao.controller;


import cn.daimao.pojo.CountryStation;
import cn.daimao.pojo.Station;
import cn.daimao.service.WorldMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("daimao")
public class WoldMapController {
    @Autowired
    private WorldMapService worldMapService;

/*    @RequestMapping("worldMap")
    public List<Station> getWorldMap(){
        List<Station> list =worldMapService.getWorldMap();
        System.out.println(list);
        return list;
    }*/
    @RequestMapping("worldMap2")
    public List<Station> getWorldMap2(){
        List<CountryStation> list =worldMapService.getSource();
        Iterator<CountryStation> it = list.iterator();

        List<Station> list1 = new ArrayList<>();
        while(it.hasNext()){
            Station s = new Station();
            CountryStation c = it.next();
            //System.out.println(c);
            //System.out.println(c);
            String name = c.getStn()+"-"+c.getWban();
            String value[] ={c.getLongitude()+"",c.getLatitude()+""};
            s.setName(name);
            s.setValue(value);
            list1.add(s);
        }
        //System.out.println(list1);
        return list1;
    }
}

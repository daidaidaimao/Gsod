package cn.daimao.service;

import cn.daimao.mapper.WorldMapMapper;
import cn.daimao.pojo.CountryStation;
import cn.daimao.pojo.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class WorldMapService {

    @Autowired
    private WorldMapMapper worldMapMapper;

/*    public List<Station> getWorldMap() {
        List<CountryStation> list = worldMapMapper.getWorldMap();
        Iterator<CountryStation> it = list.iterator();
        Station s = new Station();
        List<Station> list1 = new ArrayList<>();
        while(it.hasNext()){
            CountryStation c = it.next();
            //System.out.println(c);
            String name = c.getStn()+"-"+c.getWban();
            String value[] ={c.getLongitude()+"",c.getLatitude()+""};
            s.setName(name);
            s.setValue(value);
            list1.add(s);
        }
        //System.out.println(list1);
        return list1;
    }*/

    public List<CountryStation> getSource(){
        return worldMapMapper.getWorldMap();
    }


}

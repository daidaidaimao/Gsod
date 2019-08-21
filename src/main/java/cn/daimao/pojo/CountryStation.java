package cn.daimao.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CountryStation {
    private String stn;//站点编号：stn-wban
    private String wban;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String stationName;

}

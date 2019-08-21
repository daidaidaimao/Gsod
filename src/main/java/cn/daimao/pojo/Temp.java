package cn.daimao.pojo;

import lombok.Data;

@Data
public class Temp {
    private String stn;
    private String wban;
    private Double temp;
    private Double dewp;
    private Double max;
    private Double min;
    private Double range;
}

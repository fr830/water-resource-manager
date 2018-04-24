package com.breeze.waterresourcemanager.common.entity;

/**
 * Created by yinyong on 2018/4/22.
 * 自动站监测数据具体数据字段bean
 */
public class MonitorData {
    /**
     * 监测数据类型
     */
    private String dataType;
    /**
     * 监测数值
     */
    private String value;
    /**
     * 数据标识
     */
    private String flag;
    /**
     * 加标回收：加标前水样测试数据时间
     * 平行样测试：第1次测量数据时间
     */
    private double waterTime;
    /**
     * 加标回收：加标前水样测试值，单位为mg/L
     * 平行样测试：第1次水样测试值，单位为mg/L
     */
    private double water;


    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public double getWaterTime() {
        return waterTime;
    }

    public void setWaterTime(double waterTime) {
        this.waterTime = waterTime;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }
}

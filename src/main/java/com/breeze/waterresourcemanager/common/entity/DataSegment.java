package com.breeze.waterresourcemanager.common.entity;

/**
 * Created by yinyong on 2018/4/24.
 * 自动站监测数据==>>数据段bean
 */
public class DataSegment {
    // 请求编码,格式YYYYMMDDhhmmssSSS,用来唯一标识一次命令交互
    private String requestId;
    // 系统编号ST
    private String systemId;
    // 命令编号CN
    private String commandId;
    // 访问密码PW
    private String password;
    // 站点编号MN,编码规则：“A”+6位行政区域代码+ “_”+4位序列编号
    private String stationId;
    // 应答标志A=数据是否应答;Bit：1-应答，0-不应答
    private String responseFlag;
    // 数据区CP=&&数据区&&
    private DataRegion dataRegion;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getResponseFlag() {
        return responseFlag;
    }

    public void setResponseFlag(String responseFlag) {
        this.responseFlag = responseFlag;
    }

    public DataRegion getDataRegion() {
        return dataRegion;
    }

    public void setDataRegion(DataRegion dataRegion) {
        this.dataRegion = dataRegion;
    }
}

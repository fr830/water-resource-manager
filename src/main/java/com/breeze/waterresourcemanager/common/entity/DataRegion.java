package com.breeze.waterresourcemanager.common.entity;

import com.breeze.waterresourcemanager.common.enums.ExecuteResultStatusCode;
import com.breeze.waterresourcemanager.common.enums.ResponseStatusCode;

import java.util.List;

/**
 * Created by yinyong on 2018/4/22.
 * 自动站监测数据==>>数据区bean
 */
public class DataRegion {
    // 系统时间,YYYYMMDDhhmmss
    private String systemTime;
    // 执行结果回应代码
    private ExecuteResultStatusCode exeRtn;
    // 请求应答结果
    private ResponseStatusCode qnRtn;
    // 监测时间,YYYYMMDDhhmmss
    private String dataTime;
    // 自动站监测数据具体数据字段bean,含xxx-Rtd(监测值)、xxx-Flag(监测数据标识)、
    // xxx-WaterTime(水样测试时间)、xxx-Water(水样值),“xxx”是监测指标编码
    private List<MonitorData> monitorDataList;
    // 开始时间,YYYYMMDDhhmmss
    private String beginTime;
    // 截止时间,YYYYMMDDhhmmss
    private String endTime;
    // 流程时间,单位为秒
    private String time;
    // 监测因子编码
    private String polId;
    // 经度
    private double lng;
    // 纬度
    private double lat;
    // 电压（伏）
    private double volt;
    // 温度(摄氏度)
    private double temp;
    // 湿度(%)
    private double hum;
    // 泵X 0为关闭，1为打开
    private int pumpX;
    // 阀X 0为关闭，1为打开
    private int valveX;
    // 新密码
    private String newPW;
    // 系统运行模式 0：手动模式；1：间歇模式（整点）；2：连续模式；3:应急模式
    private int runMode;
    // 系统采水泵状态 水泵状态（1：只用泵一 2：只用泵二 3：双泵交替）
    private int pumpState;
    // 系统当前任务 0：停机；1：待机；2：调试（手动）3：水样采集；4：沉砂；5：进样6：仪表测试分析；7：反吹；8：清洗；9：除藻
    private int systemTask;
    // 系统控制阀数量
    private int valveCount;
    // 系统控制阀状态 状态列表： ValveStateList=0|1 (依次标注每个控制阀的状态，0表示关，1表示开)
    private int valveStateList;
    // 沉砂池清洗时间 单位为秒
    private int sandCleanTime;
    // 水样静置时间 单位为秒
    private int sandWaitTime;
    // 等待仪表测量时间 单位为秒
    private int measureWaitTime;
    // 清洗外管路时间 单位为秒
    private int cleanOutPipeTime;
    // 清洗内管路时间 单位为秒
    private int cleanInPipeTime;
    // 反吹时间 单位为秒
    private int airCleanTime;
    // 反吹间隔 单位为秒
    private int airCleanInterval;
    // 清洗时间 单位为秒
    private int wcleanTime;
    // 清洗间隔 单位为秒
    private int wcleanInterval;
    // 除藻选择 0为停止除藻；1为启动除藻
    private int algClean;
    // 系统报警 0为无报警；1为断电报警；2为采样管路欠压（源水泵故障）3为进样管路欠压（进样泵/增加泵故障）
    private int systemAlarm;
    // 留样瓶编号 取值范围为 0<n≤99
    private int vaseNo;
    // 操作用户 操作设置反控命令用户名
    private String user;
    // 本地IP地址 操作设置反控命令电脑IP
    private String localIP;
    // 实时数据间隔 单位为分钟
    private int rtdInterval;
    // 测试间隔 单位为小时，取值 0<n≤24 之间
    private int runInterval;
    // 周期标定间隔 单位为分钟
    private int cycInterval;
    // 沉沙时间  单位为秒
    private int sandTime;
    // 采样模式 0:维护模式 1：间隔采样 2：加密采样 3：连续采样 4：手工采样 5：应急采样
    private int cmode;
    // 留样周期 hhmmss
    private int ltime;
    // 留样模式 0：手工留样 1：超标留样 2：周期留样
    private int lmode;
    // 超时时间 单位为秒，默认为10秒
    private int overTime = 10;
    // 重发次数 默认为3次
    private int reCount = 3;
    // 运行模式 采样器运维模式（等比、等时、手动）
    private int lRmode;
    // 现场端信息 xxx-Info ==>> “xxx”是现场端信息编码
    private List<String> info;
    // 现场端信息编码
    private String infoId;

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public ExecuteResultStatusCode getExeRtn() {
        return exeRtn;
    }

    public void setExeRtn(ExecuteResultStatusCode exeRtn) {
        this.exeRtn = exeRtn;
    }

    public ResponseStatusCode getQnRtn() {
        return qnRtn;
    }

    public void setQnRtn(ResponseStatusCode qnRtn) {
        qnRtn = qnRtn;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public List<MonitorData> getMonitorDataList() {
        return monitorDataList;
    }

    public void setMonitorDataList(List<MonitorData> monitorDataList) {
        this.monitorDataList = monitorDataList;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPolId() {
        return polId;
    }

    public void setPolId(String polId) {
        this.polId = polId;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getVolt() {
        return volt;
    }

    public void setVolt(double volt) {
        this.volt = volt;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHum() {
        return hum;
    }

    public void setHum(double hum) {
        this.hum = hum;
    }

    public int getPumpX() {
        return pumpX;
    }

    public void setPumpX(int pumpX) {
        this.pumpX = pumpX;
    }

    public int getValveX() {
        return valveX;
    }

    public void setValveX(int valveX) {
        this.valveX = valveX;
    }

    public String getNewPW() {
        return newPW;
    }

    public void setNewPW(String newPW) {
        this.newPW = newPW;
    }

    public int getRunMode() {
        return runMode;
    }

    public void setRunMode(int runMode) {
        this.runMode = runMode;
    }

    public int getPumpState() {
        return pumpState;
    }

    public void setPumpState(int pumpState) {
        this.pumpState = pumpState;
    }

    public int getSystemTask() {
        return systemTask;
    }

    public void setSystemTask(int systemTask) {
        this.systemTask = systemTask;
    }

    public int getValveCount() {
        return valveCount;
    }

    public void setValveCount(int valveCount) {
        this.valveCount = valveCount;
    }

    public int getValveStateList() {
        return valveStateList;
    }

    public void setValveStateList(int valveStateList) {
        this.valveStateList = valveStateList;
    }

    public int getSandCleanTime() {
        return sandCleanTime;
    }

    public void setSandCleanTime(int sandCleanTime) {
        this.sandCleanTime = sandCleanTime;
    }

    public int getSandWaitTime() {
        return sandWaitTime;
    }

    public void setSandWaitTime(int sandWaitTime) {
        this.sandWaitTime = sandWaitTime;
    }

    public int getMeasureWaitTime() {
        return measureWaitTime;
    }

    public void setMeasureWaitTime(int measureWaitTime) {
        this.measureWaitTime = measureWaitTime;
    }

    public int getCleanOutPipeTime() {
        return cleanOutPipeTime;
    }

    public void setCleanOutPipeTime(int cleanOutPipeTime) {
        this.cleanOutPipeTime = cleanOutPipeTime;
    }

    public int getCleanInPipeTime() {
        return cleanInPipeTime;
    }

    public void setCleanInPipeTime(int cleanInPipeTime) {
        this.cleanInPipeTime = cleanInPipeTime;
    }

    public int getAirCleanTime() {
        return airCleanTime;
    }

    public void setAirCleanTime(int airCleanTime) {
        this.airCleanTime = airCleanTime;
    }

    public int getAirCleanInterval() {
        return airCleanInterval;
    }

    public void setAirCleanInterval(int airCleanInterval) {
        this.airCleanInterval = airCleanInterval;
    }

    public int getWcleanTime() {
        return wcleanTime;
    }

    public void setWcleanTime(int wcleanTime) {
        this.wcleanTime = wcleanTime;
    }

    public int getWcleanInterval() {
        return wcleanInterval;
    }

    public void setWcleanInterval(int wcleanInterval) {
        this.wcleanInterval = wcleanInterval;
    }

    public int getAlgClean() {
        return algClean;
    }

    public void setAlgClean(int algClean) {
        this.algClean = algClean;
    }

    public int getSystemAlarm() {
        return systemAlarm;
    }

    public void setSystemAlarm(int systemAlarm) {
        this.systemAlarm = systemAlarm;
    }

    public int getVaseNo() {
        return vaseNo;
    }

    public void setVaseNo(int vaseNo) {
        this.vaseNo = vaseNo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLocalIP() {
        return localIP;
    }

    public void setLocalIP(String localIP) {
        this.localIP = localIP;
    }

    public int getRtdInterval() {
        return rtdInterval;
    }

    public void setRtdInterval(int rtdInterval) {
        this.rtdInterval = rtdInterval;
    }

    public int getRunInterval() {
        return runInterval;
    }

    public void setRunInterval(int runInterval) {
        this.runInterval = runInterval;
    }

    public int getCycInterval() {
        return cycInterval;
    }

    public void setCycInterval(int cycInterval) {
        this.cycInterval = cycInterval;
    }

    public int getSandTime() {
        return sandTime;
    }

    public void setSandTime(int sandTime) {
        this.sandTime = sandTime;
    }

    public int getCmode() {
        return cmode;
    }

    public void setCmode(int cmode) {
        this.cmode = cmode;
    }

    public int getLtime() {
        return ltime;
    }

    public void setLtime(int ltime) {
        this.ltime = ltime;
    }

    public int getLmode() {
        return lmode;
    }

    public void setLmode(int lmode) {
        this.lmode = lmode;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public int getReCount() {
        return reCount;
    }

    public void setReCount(int reCount) {
        this.reCount = reCount;
    }

    public int getlRmode() {
        return lRmode;
    }

    public void setlRmode(int lRmode) {
        this.lRmode = lRmode;
    }

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }
}

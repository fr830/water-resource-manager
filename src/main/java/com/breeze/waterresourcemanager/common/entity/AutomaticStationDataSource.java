package com.breeze.waterresourcemanager.common.entity;

/**
 * Created by yinyong on 2018/4/24.
 * 自动站监测数据Bean
 */
public class AutomaticStationDataSource {
    // 数据段长度,数据段的ASCII字符数，如：长255，则写为“0255”,4位
    private int dataSegmentLength;
    // 数据段,变长的数据，建议数据段长度在8192以内
    private DataSegment dataSegment;
    // CRC校验码,数据段的校验结果,十六进制整数,接收到数据后，需要重新计算CRC码，如果不一致则说明传输有误
    private String crc;

    public int getDataSegmentLength() {
        return dataSegmentLength;
    }

    public void setDataSegmentLength(int dataSegmentLength) {
        this.dataSegmentLength = dataSegmentLength;
    }

    public DataSegment getDataSegment() {
        return dataSegment;
    }

    public void setDataSegment(DataSegment dataSegment) {
        this.dataSegment = dataSegment;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }
}

package com.breeze.waterresourcemanager.common.enums;

/**
 * Created by yinyong on 2018/4/22.
 * 执行结果状态码
 */
public enum ExecuteResultStatusCode {
    /**
     * 执行成功
     */
    OK(1),
    /**
     * 执行失败，但不知道原因
     */
    ERROR_OTHER(2),
    /**
     * 条件错误
     */
    ERROR_ARGS(3),
    /**
     * 通讯超时
     */
    ERROR_TIMEOUT(4),
    /**
     * 系统繁忙不能执行
     */
    SYSTEM_BUSY(5),
    /**
     * 系统故障
     */
    ERROR_SYSTEM(6),
    /**
     * 没有数据
     */
    ERROR_NULL_DATA(100);

    //  定义私有变量
    private int nCode;

    //  构造函数，枚举类型只能为私有
    private ExecuteResultStatusCode(int _nCode) {
        this.nCode = _nCode;
    }

    @Override
    public String toString() {
        return String.valueOf(this.nCode);
    }
}

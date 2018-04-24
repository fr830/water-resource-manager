package com.breeze.waterresourcemanager.common.enums;

/**
 * Created by yinyong on 2018/4/22.
 * 请求应答结果
 */
public enum ResponseStatusCode {
    /**
     * 准备执行请求
     */
    PRE_EXECUTE(1),
    /**
     * 请求被拒绝
     */
    REQUEST_REFUSED(2),
    /**
     * PW 错误（访问密码）
     */
    ERROR_PW(3),
    /**
     * MN 错误(站点唯一标识)
     */
    ERROR_MN(4),
    /**
     * ST 错误 （系统编码）
     */
    ERROR_ST(5),
    /**
     * Flag 错误 (应答标志)
     */
    ERROR_FLAG(6),
    /**
     * QN 错误 （请求编码）
     */
    ERROR_QN(7),
    /**
     * CN 错误（命令编码）
     */
    ERROR_CN(8),
    /**
     * 系统繁忙不能执行
     */
    SYSTEM_BUSY(9),
    /**
     * 未知错误
     */
    ERROR_OTHER(100);

    //  定义私有变量
    private int nCode;

    //  构造函数，枚举类型只能为私有
    private ResponseStatusCode(int _nCode) {
        this.nCode = _nCode;
    }

    @Override
    public String toString() {
        return String.valueOf(this.nCode);
    }

}

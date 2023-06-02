package com.aliyun.openservices.log.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author xizongzheng.xzz
 */
public class MetricQueryCacheConfig {
    @JSONField(name = "enable")
    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}

        MetricQueryCacheConfig that = (MetricQueryCacheConfig)o;

        return enable == that.enable;
    }

    @Override
    public int hashCode() {
        return (enable ? 1 : 0);
    }
}
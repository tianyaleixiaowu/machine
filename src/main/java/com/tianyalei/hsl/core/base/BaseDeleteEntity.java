package com.tianyalei.hsl.core.base;

import javax.persistence.MappedSuperclass;

/**
 * @author wuweifeng wrote on 2018/11/12.
 */
@MappedSuperclass
public class BaseDeleteEntity extends BaseEntity {
    private boolean deleteFlag = false;

    @Override
    public String toString() {
        return "BaseDeleteEntity{" +
                "deleteFlag=" + deleteFlag +
                '}';
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}

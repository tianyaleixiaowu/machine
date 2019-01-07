package com.tianyalei.hsl.core.operation;


import com.tianyalei.hsl.core.base.BaseEntity;

import javax.persistence.Entity;

/**
 * 管理员操作日志
 * @author wuweifeng wrote on 2018/11/1.
 */
@Entity
public class OperationLog extends BaseEntity {
    private String operationType;
    private String keyword;
    private String title;
    private String content;
    private Boolean isSucceed;

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getSucceed() {
        return isSucceed;
    }

    public void setSucceed(Boolean succeed) {
        isSucceed = succeed;
    }
}

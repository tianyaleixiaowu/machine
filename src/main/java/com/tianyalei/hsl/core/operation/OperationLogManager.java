package com.tianyalei.hsl.core.operation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 操作日志
 * @author wuweifeng wrote on 2018/11/1.
 */
@Service
public class OperationLogManager {
    @Resource
    private OperationLogRepository operationLogRepository;

    public OperationLog operationLog(OperationLog mOperationLog) {
        return operationLogRepository.save(mOperationLog);
    }

}

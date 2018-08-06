package com.alen.Test;

import com.alen.exception.BizException;

public class ExceptionHandle {
    public  void A() {
        throw new BizException(0,"测试一个运行时异常");
    }
}

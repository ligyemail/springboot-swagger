package com.swag.entity;

/**
 * @author leo
 * @ClassName JsonResult
 * @Description
 */
public class JsonResult {
    private String status = null;
    private Object result = null;
    private Integer decode = 0;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "status='" + status + '\'' +
                ", result=" + result +
                '}';
    }
}

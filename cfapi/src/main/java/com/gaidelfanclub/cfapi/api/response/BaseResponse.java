package com.gaidelfanclub.cfapi.api.response;

public class BaseResponse<T> {

    private String status;
    private String comment;
    private T result;

    public T getResult() {
        return result;
    }

}

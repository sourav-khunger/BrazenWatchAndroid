package com.doozycod.brazenwatch;

public interface TaskCompletionListener<T, U> {

    void onSuccess(T t);

    void onError(U u);
}

package com.ileiju.ticketverify.interfaces;

public interface StatusCallback {
    void success(String result);

    void result(int status, String result);
}

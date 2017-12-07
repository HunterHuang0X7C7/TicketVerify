package com.ileiju.ticketverify.listener;

import java.util.List;

/**
 */
public interface OnPermissionListener {

    /**
     *同意
     */
    void onGranted();

    /**
     * 拒绝
     */
    void onDenied(List<String> permissions);
}

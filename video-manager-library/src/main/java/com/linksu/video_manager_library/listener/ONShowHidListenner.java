package com.linksu.video_manager_library.listener;

/**
 * ================================================
 * 作    者：linksus
 * 版    本：1.0
 * 创建日期：7/24 0024
 * 描    述：
 * 修订历史：
 * ================================================
 */
public interface ONShowHidListenner {
    void onShow();

    void onHid();

    void onThumbPause();//手动暂停

    void onStart();//开始播放
}

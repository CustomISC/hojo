package com.customisc.hojo.entities;

import java.io.Serializable;

public class Camera implements Serializable {
    private static final long serialVersionUID = -3837361587400158910L;
    private String name;
    private String rtspUrl;
    private String secondaryRtspUrl;

    public Camera(String name, String rtspUrl) {
        this.name = name;
        this.rtspUrl = rtspUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRtspUrl(String rtspUrl) {
        this.rtspUrl = rtspUrl;
    }

    public void setSecondaryRtspUrl(String secondaryRtspUrl) {
        this.secondaryRtspUrl = secondaryRtspUrl;
    }

    public String getName() {
        return name;
    }

    public String getRtspUrl() {
        return rtspUrl;
    }

    /**
     * The optional high-resolution stream url, used when the camera is displayed fullscreen.
     * Returns null if not configured.
     */
    public String getSecondaryRtspUrl() {
        return secondaryRtspUrl;
    }
}

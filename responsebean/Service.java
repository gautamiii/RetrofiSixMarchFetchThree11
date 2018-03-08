
package com.example.gautam.retrofisixmarchfetch.responsebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Service {

    @SerializedName("serviceid")
    @Expose
    private String serviceid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("thumbnails")
    @Expose
    private String thumbnails;
    @SerializedName("servicetypeid")
    @Expose
    private String servicetypeid;

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(String thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getServicetypeid() {
        return servicetypeid;
    }

    public void setServicetypeid(String servicetypeid) {
        this.servicetypeid = servicetypeid;
    }


}

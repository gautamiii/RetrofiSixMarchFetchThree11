
package com.example.gautam.retrofisixmarchfetch.responsebean;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Responsebean {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("services")
    @Expose
    private List<Service> services = null;
    @SerializedName("servicetypes")
    @Expose
    private List<Servicetype> servicetypes = null;
    @SerializedName("sliders")
    @Expose
    private List<Slider> sliders = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Servicetype> getServicetypes() {
        return servicetypes;
    }

    public void setServicetypes(List<Servicetype> servicetypes) {
        this.servicetypes = servicetypes;
    }

    public List<Slider> getSliders() {
        return sliders;
    }

    public void setSliders(List<Slider> sliders) {
        this.sliders = sliders;
    }

}

package me.kikorose.demo.models;


import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Index {

@NotNull
@Min(1)
    private long id;
@NotNull
@Size(min=20, max=100)
    private String description;
@NotNull
@Size(min=20, max=100)
    private String ruled;
@NotNull
@Size(min=20, max=100)
    private String cable;
@NotNull
@Size(min=20, max=100)
    private String wifi;


    public long getId() {
        return id;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRuled() {
        return ruled;
    }

    public void setRuled(String ruled) {
        this.ruled = ruled;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public String getPrivateBathroom() {
        return privateBathroom;
    }

    public void setPrivateBathroom(String privateBathroom) {
        this.privateBathroom = privateBathroom;
    }

    private String privateBathroom;
}

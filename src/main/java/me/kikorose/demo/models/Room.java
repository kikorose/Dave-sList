package me.kikorose.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Room {

//    @NotNull
//    @Min(1)
   @Id
  @GeneratedValue(strategy=GenerationType.AUTO)  //this stuff is necessary for databate to ork
    private long id;


//    @NotNull
    private Boolean isRented;

//    @NotNull
//    @Size(min=20, max=100)
      private String description;

//    @NotNull
//    @Size(min=20, max=100)
    private String ruled;

//    @NotNull
//    @Size(min=20, max=100)
    private String cable;

//    @NotNull
//    @Size(min=20, max=100)
    private String wifi;


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

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(Boolean isRented) {
        this.isRented = isRented;
    }


}


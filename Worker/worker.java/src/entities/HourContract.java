package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    // Defaul Constructor
    public HourContract(){

    }

    public HourContract(Date date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    // Getters and Setters
    public Date getDate(){
        return date;
    }

    public Double getValuePerHour(){
        return valuePerHour;
    }

    public Integer getHours(){
        return hours;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }

    public void setHours(Integer hours){
        this.hours = hours;
    }

}
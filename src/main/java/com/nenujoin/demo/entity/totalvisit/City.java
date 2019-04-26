package com.nenujoin.demo.entity.totalvisit;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 17:31 2019/4/16
 */
public class City {
    private Integer id;
    private Integer year;
    private String cityName;
    private Integer visitCount;
    private Integer returnCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    public Integer getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(Integer returnCount) {
        this.returnCount = returnCount;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", year=" + year +
                ", cityName='" + cityName + '\'' +
                ", visitCount=" + visitCount +
                ", returnCount=" + returnCount +
                '}';
    }
}


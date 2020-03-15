package com.compario.compario;

import java.util.Date;

/**
 * Created by Soham on 1/10/2020.
 */

public class SearchDataModel {
    String from;
    String to;
    Date date;
    SearchDataModel(){
        from="";
        to="";
        date=new Date();
    }
    public void setFrom(String fr){
        this.from=fr;
    }
    public String getFrom(){
        return this.from;
    }
    public void setTo(String to1){
        this.to=to1;
    }
    public String getTo(){
        return this.to;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public Date getDate(){
        return this.date;
    }
}

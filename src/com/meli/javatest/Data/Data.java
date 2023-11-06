package com.meli.javatest.Data;

import java.util.Calendar;
import java.util.Date;

public class Data {
    public int dia, mes, ano;

    public Data(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        this.dia = c.get(Calendar.DAY_OF_MONTH);
        this.mes = c.get(Calendar.MONTH);
        this.ano = c.get(Calendar.YEAR);
    }

    public String ImprimirData(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}

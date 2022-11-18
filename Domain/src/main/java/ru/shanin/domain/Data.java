package ru.shanin.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.jetbrains.annotations.Nullable;

public class Data {

    private final String fn;
    private final String sn;
    private final String phn;
    private final int age;

    public Data(String fn, String sn, String phn) {
        this.fn = fn;
        this.sn = sn;
        this.phn = phn;
        this.age = (int) (Math.random() * 900 + 100);
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.toJson(this);
    }

    public String getFn() {
        return fn;
    }

    public String getSn() {
        return sn;
    }

    public String getPhn() {
        return phn;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Data guest = (Data) obj;
        return
                fn.equals(guest.getFn())
                        && sn.equals(guest.getSn())
                        && phn.equals(guest.getPhn())
                        && (age == guest.getAge());
    }
}

package ru.shanin.domain.entity.comparators;

import java.util.Comparator;

import ru.shanin.domain.entity.Data;

public class ByFnSn implements Comparator<Data> {

    @Override
    public int compare(Data d1, Data d2) {
        String fn1 = d1.getFn();
        String fn2 = d2.getFn();
        String sn1 = d1.getSn();
        String sn2 = d2.getSn();
        int result;
        result = fn1.compareTo(fn2);
        if (result != 0) return result;
        else return sn1.compareTo(sn2);
    }
}
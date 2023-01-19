package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
     <T extends Settlement> double sumSettlementPrice(List<T> settlementList){
        return settlementList.stream().mapToDouble(i->i.getPrice()).sum();
    }
    <T extends Settlement> double avgSettlementArea(List<T> settlementList){
        return settlementList.stream().mapToDouble(i->i.getArea()).average().getAsDouble();
    }

    <T extends Settlement> List<T> filterSettlement(List<T> settlementList , int r, int h){
        return settlementList.stream().filter(i->(i.getNumberOfRoom()==r && i.getNumberOfHalls()==h)).collect(Collectors.toList());
    }

}

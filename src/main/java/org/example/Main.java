package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        House h1 = new House(3,3,2,1);
        House h2 = new House(4,4,1,1);
        House h3 = new House(5,5,3,2);

        Villa v1 = new Villa(4,8,3,2);
        Villa v2 = new Villa(4,8,3,2);
        Villa v3 = new Villa(4,8,3,2);

        Summerhouse s1= new Summerhouse(123,51,5,2);
        Summerhouse s2= new Summerhouse(123,51,6,2);
        Summerhouse s3= new Summerhouse(123,51,5,1);


        List<Settlement> settlementList = List.of(h1,h2,h3,v1,v2,v3,s1,s2,s3);
        List<House> houseList = List.of(h1,h2,h3);
        List<Villa> villaList = List.of(v1,v2,v3);
        List<Summerhouse>summerhouseList = List.of(s1,s2,s3);


        Service service = new Service();

        System.out.println(service.sumSettlementPrice(houseList));
        System.out.println(service.sumSettlementPrice(villaList));
        System.out.println(service.sumSettlementPrice(summerhouseList));
        System.out.println(service.sumSettlementPrice(settlementList));

        System.out.println(service.avgSettlementArea(houseList));
        System.out.println(service.avgSettlementArea(villaList));
        System.out.println(service.avgSettlementArea(summerhouseList));
        System.out.println(service.avgSettlementArea(settlementList));

        System.out.println(service.filterSettlement(settlementList,3,2));









    }
}

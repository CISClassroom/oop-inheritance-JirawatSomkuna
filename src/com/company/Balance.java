package com.company;

public class Balance {
    public double money_fixed = 10000;
    public double money_saving = 200;
    public void fixed_bl(){
        System.out.println("ยอดคงเหลือในบัญชีเงินฝากของคุณ " + money_fixed + " บาท");
    }
    public void saving_bl(){
        System.out.println("ยอดคงเหลือในบัญชีเงินฝากของคุณ " + money_saving + " บาท");
    }
}

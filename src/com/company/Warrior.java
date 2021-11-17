package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(20);
        setHealth(100);
        setSuperAbilityType("Ghost");
        System.out.println("Warrior "+getHealth()+"hp "+getDamage()+"урон  Суперспособность: "+getSuperAbilityType());
    }
}
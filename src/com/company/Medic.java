package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(0);
        setHealth(100);
        setSuperAbilityType("Cure");
        System.out.println("Medic "+getHealth()+"hp "+getDamage()+"урон  Суперспособность: "+getSuperAbilityType());
    }
}
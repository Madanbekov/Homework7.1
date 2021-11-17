package com.company;

class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(15);
        setHealth(100);
        setSuperAbilityType("Hypnotizing");
        System.out.println("Magic "+getHealth()+"hp "+getDamage()+"урон  Суперспособность: "+getSuperAbilityType());
    }
}
package com.ravi.abstractclass;

public abstract class Bank {
void deposit()
{
	System.out.println("you can dep 10 lakhs");
}
void withdraw()
{
	System.out.println("you can withdraw 5 lakhs");
}
abstract void loan();
abstract void interest();
}

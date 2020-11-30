public class Account{

private String name;
private double balance;
private int pin;

public Account(String name, double balance, int pin){
this.name = name;
this.balance = balance;
this.pin = pin;
}

public void setName(String name){
this.name = name;
}

public String getName(){
return name;
}

public void setBalance(double balance){
this.balance = balance;
}

public double getBalance(){
return balance;
}

public void setPin(int pin){
this.pin = pin;
}

public int getPin(){
return pin;
}

}










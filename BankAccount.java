/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;


public class BankAccount {
    private int accNumber;
    private double balance;
    private String cusName;
    private String email;
    private int phNum;
    
    public void setAccNumber(int accNumber)
    {
        this.accNumber=accNumber;
    }
    public int getAccNumber()
    {
        return accNumber;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setCusName(String cusName)
    {
        this.cusName=cusName;
    }
    public String cusName()
    {
        return cusName;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setPhNum(int phNum)
    {
        this.phNum=phNum;
    }
    public int getPhNum()
    {
        return phNum;
    }
    public void depositFunds(double fund)
    {
        balance+=fund;
        System.out.println(balance);
    }
    public void withdrawFunds(double fund)
    {
        if(fund<balance)
        {
        balance-=fund;
        System.out.println(balance);
        }
    }
}

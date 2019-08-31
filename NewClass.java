/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;


public class NewClass {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount();
        ba.setAccNumber(1234567);
        ba.setBalance(30000);
        ba.setCusName("sneha");
        ba.setEmail("ksr@gmail.com");
        ba.setPhNum(1234);
        
        ba.depositFunds(10000);
        ba.withdrawFunds(20000);
    }
    
}

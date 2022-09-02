/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author pwn233
 */
public class CustomerFactory {
    public static Customer createCustomer(String type) {
        if(type.equalsIgnoreCase("Delinquent"))
        {
            return new DelinquentCustomer();
        }
        else if(type.equalsIgnoreCase("Mountain"))
        {
            return new MountainCustomer();
        }
        else if(type.equalsIgnoreCase("Regular"))
        {
            return new RegularCustomer();
        }
        else 
        {
            return null;
        }
        
    }
}
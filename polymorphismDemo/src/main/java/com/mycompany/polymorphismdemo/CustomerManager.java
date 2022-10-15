package com.mycompany.polymorphismdemo;

public class CustomerManager {
    private BaseLogger logger;
    
    public CustomerManager(BaseLogger Logger){
        this.logger = logger;
    }
    
    public void add(){
        System.out.println("Musteri eklendi");
        this.logger.log("log mesaji");
    }
}

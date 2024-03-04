package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean extraCheese=false;
    private Boolean extraToppings=false;
    private Boolean takeaway=false;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            this.price += 80;
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings) {
            if (isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
            extraToppings = true;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway) {
            this.price += 20;
            takeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        bill="Base Price Of The Pizza: ";
        if(this.isVeg){
            bill+="300\n";
        }
        else{
            bill+="400\n";
        }
        if(extraCheese){
            bill+="Extra Cheese Added: 80\n";
        }
        if(extraToppings){
            bill+="Extra Toppings Added: ";
            if(isVeg){
                bill+="70\n";
            }
            else{
                bill+="120\n";
            }
        }
        if(takeaway){
            bill+="Paperbag Added: 20\n";
        }
        bill+="Total Price: "+this.price;
        return this.bill;
    }
}

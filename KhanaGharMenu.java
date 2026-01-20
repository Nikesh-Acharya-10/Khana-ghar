//class to make a templet for menue card for khana ghar
class Khanaghar{
    public String itemName;
    public double price;
    public String Category;
    public boolean isvegetrian;
    public boolean isavailable;
//constructor is created to initilite value
    Khanaghar(String itemName,double price,String Category,boolean isvegetrian,boolean isavailable){
        this.itemName=itemName;
        this.price=price;
        this.Category=Category;
        this.isvegetrian=isvegetrian;
        this.isavailable=isavailable;
    }
//tostring() is used to  return value and used to get a string representation of an object 
    public String toString(){
        return "i)"+this.itemName+"("+this.price+")";

    }

}
public class KhanaGharMenu
{
    //main meathod
    public static void main(String[] args){
        // stored the menur information in object 
        Khanaghar m1 = new Khanaghar("Dhalbhat set",120,"khana set",true,true);
        Khanaghar m2 = new Khanaghar("chicken khana",180,"khana set",false,true);
        Khanaghar m3 = new Khanaghar("mutton khana",220,"khana set",false,false);
        Khanaghar m4 = new Khanaghar(" veg chowmein",80,"chowmein",true,true);
        Khanaghar m5 = new Khanaghar("chicken Momo",120,"MOMO",false,true);
        Khanaghar m6 = new Khanaghar("veg Momo",45,"MOMO",false,true);
        Khanaghar m7 = new Khanaghar("buff Momo",150,"MOMO",false,false);
        Khanaghar m8 = new Khanaghar(" Milk Tea",30,"Chiya-Nasta",true,true);
        Khanaghar m9 = new Khanaghar("lemon tea",20,"Chiya-Nasta",true,true);

        //array is defined and stored to display the value in shorter form 
        Khanaghar[] menu={m1,m2,m3,m4,m5,m6,m7,m8,m9};
        System.out.println("Khana Ghar");
        System.out.println("=================================================================================================");
        System.out.println("=================================================================================================");
//this loop is used to display all the items in menu
        for(Khanaghar m : menu){
            System.out.println(m);
        }
        
        System.out.println("=================================================================================================");
        System.out.println("Veg Items");
        System.out.println("=================================================================================================");
        
        //this loop is used to dislpaly veg items only
        for (Khanaghar m : menu){
            if(m.isvegetrian){
                System.out.println(m);
            }
        }
        
        System.out.println("=================================================================================================");
        System.out.println("Non-Veg Items");
        System.out.println("=================================================================================================");
        
        //this loop is used to display non-veg items
        for (Khanaghar m : menu){
            if(!m.isvegetrian){
                System.out.println(m);
            }
        }
        
        System.out.println("=================================================================================================");
        System.out.println("Non-Veg Items Price geater than 100 and which are available");
        System.out.println("=================================================================================================");
        
        //this loop is used to display the items in menu that are aviailable and price greater than 100
        for (Khanaghar m : menu){
            if(m.price>100 && m.isavailable){
                System.out.println(m);
            }
        }

        System.out.println("=================================================================================================");
        System.out.println("Veg Items Price are less than 50 and which are available");
        System.out.println("=================================================================================================");
        
        //this loop is used to display the items in menu that are aviailable and price less than 50
        for (Khanaghar m : menu){
            if(m.price>50 && m.isavailable){
                System.out.println(m);
            }
        }
        System.out.println("=================================================================================================");
        System.out.println("=================================================================================================");

    }
}
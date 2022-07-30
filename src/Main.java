
public class Main {
    public static void main(String[] args) {
        Pet hamster=new Pet();
        Pet carrot=new Pet("Carrot","Chuky");
        Pet cat=new Pet("Cat","Kandela",2,99,new String[]{"Eating","Sleeping","Creating a mess"});
        Human Samin=new Human("Samin","Alakbarov",1982);
        Human Lala=new Human("Lala","Alakbarova",2003) ;
        Human Eren=new Human("Eren","Alakbarov",2029,Lala,Samin);
        String sl[][]={{"Monday","Tuesday","Wednesday","Thursday","Friday"},{"Playing piano","Doing math","Yoga","Reading book","Watching AOT"}};
        byte iq=100;
        Human Mikasa=new Human("Mikasa","Alakbarova",2031,iq,cat,Lala,Samin,sl);
        Human nobody=new Human();
        System.out.println(carrot);
        carrot.eat();
        carrot.foul();
        carrot.respond();
        Mikasa.greetPet();
        Mikasa.describePet();
        System.out.println(cat);
        System.out.println(carrot);
        System.out.println(hamster);
        System.out.println(Samin);
        System.out.println(Lala);
        System.out.println(Eren);
        System.out.println(Mikasa);
        System.out.println(nobody);
    }

}
import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human children[];
    private Pet pet;

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Family(Human mother,Human father) {
        this.mother=mother;
        this.father = father;
        Human children[];
    }


    public void addChild(Human a){

        Human childrenn[]=new Human[children.length+1];
        for(int i=0;i<children.length;i++){
            childrenn[i]=children[i];
        }
        childrenn[children.length]=a;
        this.children=childrenn;
        a.setFamily(this);

    }
    public boolean deleteChild(int a){
        boolean result=true;
        if(a>children.length-1||a<0){
            result=false;
        }
        Human childrenn[]=new Human[children.length-1];
        int count=0;

        if(result){
            while(count<children.length-1){
                if (count!=a){
                    childrenn[count]=children[count];
                    count+=1;
                }}}
        if(result){
            children[a].setFamily(null);
        }
        this.children=childrenn;
        return result;
    }
    public int countFamily(){
        return 2+children.length+1;
    }


}
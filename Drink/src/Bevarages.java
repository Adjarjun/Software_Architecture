public abstract class Bevarages {

    private boolean wantsExtras;

    void addExtras(){

    }

    void boilWater(){
        System.out.println("Boiling water");

    }

    void pourInCup(){
        System.out.println("Pouring into cup");

    }

    final void  finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }

    }



    void setWantsExtras(boolean wantsExtras){
this.wantsExtras=wantsExtras;
    }




    void brew(){

    }



    void addCondiments(){

    }


}

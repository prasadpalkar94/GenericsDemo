public class GenericsMax <E extends Comparable<E>>{
    E firstNo;
    E secondNo;
    E thirdNo;

    public GenericsMax(E first, E second, E third){
        this.firstNo=first;
        this.secondNo=second;
        this.thirdNo=third;
    }

    public E maxValue(){
        return getMax(firstNo,secondNo,thirdNo);
    }

    public <E extends Comparable<E>> E getMax(E firstNo, E secondNo, E thirdNo) {
    E maximum = firstNo;
    if (secondNo.compareTo(maximum)>0){
        maximum=secondNo;
    }
    if(thirdNo.compareTo(maximum)>0){
        maximum=thirdNo;
    }
    return maximum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Generics!!");
    }

}

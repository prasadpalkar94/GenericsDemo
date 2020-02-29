import java.util.Arrays;
import java.util.Collections;

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

    public static <E extends Comparable<E>> E getMax(E firstNo, E secondNo, E thirdNo , E... anyNo) {
    E maximum = firstNo;
    if (secondNo.compareTo(maximum)>0){
        maximum=secondNo;
    }
    if(thirdNo.compareTo(maximum)>0){
        maximum=thirdNo;
    }

    if(anyNo.length!=0){
        Arrays.sort(anyNo, Collections.reverseOrder());
        if(maximum.compareTo(anyNo[0])<0){
            maximum=anyNo[0];
        }
    }
    printmax(maximum);
    return maximum;
    }

    public <E extends Comparable<E>> E printmax(E maximum){
        System.out.println("Maximum is:"+maximum);
    }
}

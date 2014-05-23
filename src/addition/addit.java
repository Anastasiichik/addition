package addition;
/**
 * @author Anastasia
 */
public class addit {
    private final int value;   
    
    public addit(int a){
          value = a;          
    }    
    public addit add(addit a1){
        return new addit (value+a1.getValue());
    }
    public int getValue(){
        return value;
    }
    @Override
     public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null)
        return false;
        if (getClass() != obj.getClass())
        return false;
        addit other = (addit) obj;
        if (value != other.value)
        return false;        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.value;
        return hash;
    }
    
}

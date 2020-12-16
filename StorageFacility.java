import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private final HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.facility.putIfAbsent(unit, new ArrayList<>());
        this.facility.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.facility.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        if(this.facility.get(storageUnit).size() == 1){
            this.facility.remove(storageUnit);
        } else {
            this.facility.get(storageUnit).remove(item);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> unitList = new ArrayList<>();
        for(String key : this.facility.keySet()){
            if(!this.facility.get(key).isEmpty()){
                unitList.add(key);
            }
        }
        return unitList;
    }
}

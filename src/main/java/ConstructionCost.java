public class ConstructionCost {
    private int stdCost,abvStdCost,highStdCost,highStdAutoCost;
    ConstructionCost(){
        stdCost = 1200;
        abvStdCost = 1500;
        highStdCost = 1800;
        highStdAutoCost = 2500;
    }
    public float standardHouseCost(float area){
        return area*stdCost;
    }
    public float aboveStandardHouseCost(float area){
        return area*abvStdCost;
    }
    public float highStandardHouseCost(float area,boolean b){
        if(b==true){
            return area*highStdAutoCost;
        }
        else{
            return area*highStdCost;
        }
    }
}

public class BarWidthDeterminer {

    public static double getBarWidth(JavaGraphs javaGraph){

        int gap = javaGraph.gap;

        int drawHeight = javaGraph.getDrawHeight();
        int barCount = javaGraph.getBarCount();

        return ((((double) drawHeight-3*gap)/barCount)-gap);
    }
    
}
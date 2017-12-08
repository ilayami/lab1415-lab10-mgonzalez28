package hw;

import java.util.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

public class Main {

  public static void main(final String[] args) {
    final static String NE = "Nebraska";
    final static String IA = "Iowa";
    final static String CO = "Colorado";
    final static String KS = "Kansas";
    final static String MO = "Missouri";
    final static String WY = "Wyoming";
    final static String SD = "South Dakota";
    
    final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
    myMap.addVertex(NE);
    myMap.addVertex(IA);
    myMap.addVertex(CO);
    myMap.addVertex(KS);
    myMap.addVertex(MO);
    myMap.addVertex(WY);
    myMap.addVertex(SD);
    
    myMap.addEdge(NE, IA);
    myMap.addEdge(NE, CO);
    myMap.addEdge(NE, KS);
    myMap.addEdge(NE, MO);
    myMap.addEdge(NE, WY);
    myMap.addEdge(NE, SD);
    myMap.addEdge(IA, MO);
    myMap.addEdge(MO, KS);
    myMap.addEdge(KS, CO);
    myMap.addEdge(CO, WY);
    myMap.addEdge(WY, SD);
    myMap.addEdge(SD, IA);
    
    System.out.println(myMap);
    
    
    
    
   
    
  }
}

package hw;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;

public class Main {
  static final String NE = countryCodes.NE;
  static final String IA = countryCodes.IA;
  static final String CO = countryCodes.CO;
  static final String KS = countryCodes.KS;
  static final String MO = countryCodes.MO;
  static final String WY = countryCodes.WY;
  static final String SD = countryCodes.SD;

  public static void main(final String[] args) {

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

    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, NE);
    while (bf.hasNext()) {
      final String country = bf.next();
      System.out.println("Bread first search starting @ NE " + country);
    }

    final Iterator<String> bf2 = new BreadthFirstIterator<>(myMap, CO);
    while (bf2.hasNext()) {
      final String country = bf2.next();
      System.out.println("Bread first search starting @ CO " + country);
    }

    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, NE);
    while (cf.hasNext()) {
      final String country = cf.next();
      System.out.println("Closest first starting @ NE " + country);
    }

    final Iterator<String> CF = new ClosestFirstIterator<>(myMap, CO);
    while (CF.hasNext()) {
      final String country = CF.next();
      System.out.println("Closest first starting @ CO " + country);
    }

    final Iterator<String> df = new DepthFirstIterator<>(myMap, NE);
    while (df.hasNext()) {
      final String country = df.next();
      System.out.println("Depth first search starting @ NE " + country);
    }

    final Iterator<String> DF = new DepthFirstIterator<>(myMap, CO);
    while (DF.hasNext()) {
      final String country = DF.next();
      System.out.println("Depth first search starting @ CO " + country);
    }

    final Iterator<String> rw = new RandomWalkIterator<>(myMap, NE, false, 12);
    while (rw.hasNext()) {
      final String country = rw.next();
      System.out.println("Random walk starting at NE " + country);
    }

    final Iterator<String> RW = new RandomWalkIterator<>(myMap, CO, false, 12);
    while (RW.hasNext()) {
      final String country = RW.next();
      System.out.println("Random walk starting at CO " + country);
    }

    GreedyColoring map = new GreedyColoring(myMap);
    System.out.println(map.getColoring());
  }
}

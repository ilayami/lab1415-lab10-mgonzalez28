package hw;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;

public class Main {
  static final String NE = "Nebraska";
  static final String IA = "Iowa";
  static final String CO = "Colorado";
  static final String KS = "Kansas";
  static final String MO = "Missouri";
  static final String WY = "Wyoming";
  static final String SD = "South Dakota";

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
      System.out.println(country);
    }

    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, NE);
    while (cf.hasNext()) {
      final String country = cf.next();
      System.out.println(country);
    }

    final Iterator<String> df = new DepthFirstIterator<>(myMap, NE);
    while (df.hasNext()) {
      final String country = df.next();
      System.out.println(country);
    }

    final Iterator<String> rw = new RandomWalkIterator<>(myMap, NE); // , false, 12);
    while (rw.hasNext()) {
      final String country = rw.next();
      System.out.println(country);
    }
  }
}

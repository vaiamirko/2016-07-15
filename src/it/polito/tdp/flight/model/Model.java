package it.polito.tdp.flight.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.flight.db.FlightDAO;

public class Model {

Graph<Airport,DefaultWeightedEdge> grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
Map<Integer,Airport> mappaAirport ;


public void creaGrafo(int distanza) {
	FlightDAO dao = new FlightDAO();
	
	mappaAirport = new HashMap<Integer, Airport>();
	
	
	//aggiungo tutti i vertici delgrafo
	
	Graphs.addAllVertices(grafo,dao.getAllAirports() );
	
	for(Airport a : grafo.vertexSet()) {
		mappaAirport.put(a.getAirportId(), a);
	}
	
	//ora devo pensare agl archi....
	
	
	
	
	
	
}
	
	
	
}

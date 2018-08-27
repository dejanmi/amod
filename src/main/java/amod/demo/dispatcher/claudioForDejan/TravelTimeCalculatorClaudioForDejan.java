package amod.demo.dispatcher.claudioForDejan;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.matsim.api.core.v01.network.Link;

import ch.ethz.idsc.amodeus.virtualnetwork.VirtualLink;

public enum TravelTimeCalculatorClaudioForDejan {
    ;
    
    // TODO Dejan make this as you need it
    /*package*/ public static Map<VirtualLink<Link>,Double> computeTravelTimes(Collection<VirtualLink<Link>> vLinks){
        
        double speed = 20; //[m/s]
        Map<VirtualLink<Link>,Double> tTimes = new HashMap<>();
        
        for(VirtualLink<Link> vLink : vLinks){
            tTimes.put(vLink, vLink.getDistance()/speed);
        }
        
        return tTimes;
        
        
    }

}
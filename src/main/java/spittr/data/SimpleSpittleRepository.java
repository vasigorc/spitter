package spittr.data;

import spittr.Spittle;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("simple")
public class SimpleSpittleRepository implements SpittleRepository {

 private Map<Integer,Spittle> spittles = new HashMap<Integer, Spittle>();
 private static int counter;

  public List<Spittle> findRecentSpittles() {
    return new ArrayList<Spittle>(spittles.values());
  }

  public List<Spittle> findSpittles(long max, int count) {
    return new ArrayList<Spittle>(spittles.values());
  }

  public Spittle findOne(long id) {
    return spittles.get(id);
  }

  public void save(Spittle spittle) {
    spittles.put(counter++,spittle);
  }


  
}

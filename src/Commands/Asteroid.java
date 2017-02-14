package Commands;

import java.awt.geom.Point2D;

/**
 * Created by magik on 2/5/2017. Modified by David R., 2/12/2017
 * <p>
 * The Asteroid class describes an immutable data object that _should_
 * be roughly isomorphic to what will be sent by the SpaceRock satellite code.
 * It implements {@code AsteroidData} which should help interface between
 * disparate code bases.
 */
public class Asteroid implements AsteroidData {

    public final Point2D location;
    public final long id;
    public final double size;


    public Asteroid(Point2D location, long id, double size) {
        this.location = location;
        this.id = id;
        this.size = size;
    }


    @Override
    public String toString() {
        return "Asteroid{" +
               "location=" + location +
               ", id=" + id +
               ", size=" + size +
               '}';
    }


    @Override
    public Point2D getLoc() {
        return location;
    }


    @Override
    public double getSize() {
        return size;
    }


    @Override
    public long getID() {
        return id;
    }
}

package JavaClasses;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public enum MusicGenre implements Serializable {
    RAP,
    HIP_HOP,
    BLUES,
    POP,
    MATH_ROCK;

    public static List<String> toListString(){

        LinkedList<String> list = new LinkedList<String>();
        list.add("PROGRESSIVE_ROCK");
        list.add("HIP_HOP");
        list.add("PSYCHEDELIC_CLOUD_RAP");
        list.add("SOUL");
        list.add("POST_PUNK");

        return list;
    }

}
// Get Maze Path

import java.io.*;
import java.util.*;

public class GetMazePath {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc = sc.nextInt();

        System.out.println(getMazePaths(0, 0, nr - 1, nc - 1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column

    // Pro Active Approach
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        ArrayList<String> myPath = new ArrayList<>();
        if (sc + 1 <= dc) {

            ArrayList<String> hPath = getMazePaths(sr, sc + 1, dr, dc);
            for (String path : hPath) {
                myPath.add("h" + path);
            }
        }
        if (sr + 1 <= dr) {

            ArrayList<String> vPath = getMazePaths(sr + 1, sc, dr, dc);
            for (String path : vPath) {
                myPath.add("v" + path);
            }
        }
        return myPath;
    }


    // Re - Active Approach
    // public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    //     if (sr > dr || sc > dc) {
    //         ArrayList<String> base = new ArrayList<>();
    //         return base;
    //     }

    //     if (sr == dr && sc == dc) {
    //         ArrayList<String> base = new ArrayList<>();
    //         base.add("");
    //         return base;
    //     }

    //     ArrayList<String> hPath = getMazePaths(sr, sc + 1, dr, dc);
    //     ArrayList<String> vPath = getMazePaths(sr + 1, sc, dr, dc);

    //     ArrayList<String> res = new ArrayList<>();
    //     for (String path : hPath) {
    //         res.add('h' + path);
    //     }
    //     for (String path : vPath) {
    //         res.add('v' + path);
    //     }

    //     return res;
    // }

}
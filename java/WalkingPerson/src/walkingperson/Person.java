/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkingperson;

/**
 *
 * @author weber_000
 */
public class Person {
    
    private int x;
    private int y;
    private int dir;
    
    public Person() {
        this.x = 0;
        this.y = 0;
        this.dir = 0;
    }
    
    public Person(int x,int y) {
        this.x = x;
        this.y = y;
        this.dir = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void parsePath(String path) {
        
        for(int i=0; i< path.length(); i++) {
            if(path.charAt(i) == 'R') {
                dir = ((dir-1)+4)%4;
                System.out.println("Turned Right");
            }
            if(path.charAt(i) == 'L') {
                dir = (dir+1)%4;
                System.out.println("Turned Left");
            }
            if(path.charAt(i) == 'F') {
                if(dir == 0) {
                    x += 1;
                } else if(dir == 1) {
                    y += 1;
                } else if(dir == 2) {
                    x -= 1;
                } else if(dir == 3) {
                    y -= 1;
                }
                System.out.println("Position is ("+x+","+y+").");
            }
            if(path.charAt(i) == 'B') {
                if(dir == 0) {
                    x -= 1;
                } else if(dir == 1) {
                    y -= 1;
                } else if(dir == 2) {
                    x += 1;
                } else if(dir == 3) {
                    y += 1;
                }
                System.out.println("Position is ("+x+","+y+").");
            }

        }
    }

    void clearPath() {
        this.x = 0;
        this.y = 0;
        this.dir = 0;
    }
     
}

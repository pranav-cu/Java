package com.chitkara.Day44;

public class TowerHanoi {
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {

        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }

// Move n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, source, auxiliary, destination);

// Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);

// Move n-1 disks from auxiliary to destination
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // Change this value for different inputs
        towerOfHanoi(numberOfDisks, 'A', 'C', 'B');
    }
}

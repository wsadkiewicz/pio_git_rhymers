package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    private static final int COUNTER = 15;
    private static final int RHYMERS = 3;
    private static final int BOUND = 20;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        
        DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
        
        for (int i = 1; i < COUNTER; i++)
            for (int j = 0; j < RHYMERS; j++)
                rhymers[j].countIn(i);
        
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < COUNTER; i++)
            rhymers[RHYMERS].countIn(rn.nextInt(BOUND));

        
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].isEmpty())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
        
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[RHYMERS]).reportRejected());
        
    }

    public static int getCOUNTER() {
        return COUNTER;
    }

    public static int getRHYMERS() {
        return RHYMERS;
    }

    public static int getBOUND() {
        return BOUND;
    }
}
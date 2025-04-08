package edu.kis.vh.nursery;

public class FirstInFirstOutRhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!isEmpty())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.isEmpty())
            countIn(temp.countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}

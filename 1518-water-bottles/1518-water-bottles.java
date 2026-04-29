class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int countExchange=numBottles;
        int remainder=0;
        int newBottles;
        while(numBottles>=numExchange){
            newBottles=numBottles/numExchange;
            remainder=numBottles%numExchange;
            countExchange+=newBottles;
            numBottles/=numExchange;
            numBottles+=remainder;
            

        }
        return countExchange;
    }
}
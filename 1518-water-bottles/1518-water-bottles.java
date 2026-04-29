class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int countExchange=numBottles;
        int remainder=0;
        while(numBottles>=numExchange){
            remainder=numBottles%numExchange;
            numBottles=numBottles/numExchange;
            countExchange+=numBottles;
            numBottles+=remainder;
            

        }
        return countExchange;
    }
}
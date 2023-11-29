class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> result=new Stack<>();
        int sum=0;
        for(String op:operations){
            if(op.equals("C")){
                if(!result.isEmpty()){
                sum -=result.pop();
            }
        }
            else if(op.equals("D")){
                if(!result.isEmpty()){
                int doubleScore=result.peek()*2;
                sum+=doubleScore;
                result.push(doubleScore);
            }
            }
            else if(op.equals("+")){
                int lastvalue=result.pop();
                int secondLastValue=result.peek();
                int newScore=secondLastValue+lastvalue;
                sum+=newScore;
                result.push(lastvalue);
                result.push(newScore);
            }
            else{
                int score=Integer.parseInt(op);
                sum+=score;
                result.push(score);
            }
        }
        
        return sum;
    }
}
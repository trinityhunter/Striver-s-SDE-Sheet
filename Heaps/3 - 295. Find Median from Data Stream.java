class MedianFinder {

    PriorityQueue<Integer> pq1;

    PriorityQueue<Integer> pq2;

    public MedianFinder(){

        pq1 = new PriorityQueue<>(Collections.reverseOrder());
        
        pq2 = new PriorityQueue<>();

    }
    
    public void addNum(int num){

        if(pq1.isEmpty() || pq1.peek()>num){
            pq1.add(num);
        }
        else{
            pq2.add(num);
        }

        if(pq1.size()>pq2.size()+1){
            pq2.add(pq1.peek());
            pq1.remove();
        }

        if(pq2.size()>pq1.size()+1){
            pq1.add(pq2.peek());
            pq2.remove();
        }

    }
    
    public double findMedian(){

        double ans;

        if(pq1.size()>pq2.size()){
            ans = pq1.peek();
        }
        else if(pq2.size()>pq1.size()){
            ans = pq2.peek();
        }
        else{
            ans = (pq1.peek()+pq2.peek())/2.0;
        }

        return ans;

    }

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

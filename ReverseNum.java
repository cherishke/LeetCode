class ReverseNum {
    public int reverse(int x) {
		System.out.println(x);
        int result=0;
        
        	
	        int abs=Math.abs(x);	        
	        result=getReverse(abs);
            if(result>=Integer.MAX_VALUE||result<=Integer.MIN_VALUE){
                return 0;
            }else{
                if(x>=0){
		    	    return result;
		        }else{
	                return 0-result;  
	            }
            }
	        
        
    }
    
    public int getReverse(int abs){
        int temp=abs;
        int everynum=0;
        List<Integer> arr=new ArrayList<>();
        
        while(temp>=10){
            everynum=temp%10;
            temp=temp/10;
            arr.add(everynum);
        }
        arr.add(temp);
        int resultabs=0;
        int i=0,j=0;
        for(i=arr.size()-1,j=0;i>=0;i--,j++){
            resultabs=(int) ((arr.get(i))*(Math.pow(10,j))+resultabs);
        }
        return resultabs;
    }
}
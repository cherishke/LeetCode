class Minimum_Number_ballons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> (a[1] - b[1]));
        int start=0,end=0;
        int flag=0;
        start=points[0][0];
        end=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>start){
                start=points[i][0];
                if(start>end){
                    flag++;
                }
                if(points[i][1]<end){
                    end=points[i][1];
                }
            }
        }
        return flag;
    }
    public static void main(String[] args)
	{
		Minimum_Number_ballons test=new Minimum_Number_ballons();
		int[][] points={{10,16},{2,5},{1,6},{7,12}};
		System.out.println(test.findMinArrowShots(points));
		
		
	}
}
public class minEditDistance {

    public static int minEditdis(String a,String b){
        int alength=a.length();
        int blength=b.length();
        int[][] distance=new int[alength][blength];
        for(int i=0;i<alength;i++){
            distance[i][0]=i;
        }
        for(int j=0;j<blength;j++){
            distance[0][j]=j;
        }
        int flag=1;
        for(int i=1;i<alength;i++)
            for(int j=1;j<blength;j++){
            if(a.charAt(i)==b.charAt(i)){
                flag=0;
            }
            distance[i][j]=Math.min(Math.min(distance[i-1][j]+1,distance[i][j-1]+1),distance[i-1][j-1]+flag);
            flag=1;
        }
        for(int i=0;i<alength;i++){
            for(int j=0;j<blength;j++){
                System.out.print(distance[i][j]+" ");
            }
            System.out.println();
        }


        return distance[alength-1][blength-1];
    }

    public static void main(String[] args){
        String a="aueht";
        String b="aught";
        System.out.println(minEditdis(a,b));
    }
}

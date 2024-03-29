public class test1 {

    public static void main(String[] args) {
        int chessArr1[] [] =new int [11][11];
        chessArr1[1][2]=1;
        chessArr1[2][3]=2;
        System.out.println("原始二维数组");
        for (int [] row : chessArr1){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        int sum =0;
        for (int i = 0; i < chessArr1[0].length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if(chessArr1[i][j] !=0){
                    sum++;
                }
            }

        }
        //System.out.println(sum);
        int sparseArr[][] =new int [sum+1][3];
        sparseArr[0][0]=11;
        sparseArr[0][1]=11;
        sparseArr[0][2]=sum;

        int count =0;
        for (int i = 0; i < chessArr1[0].length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if(chessArr1[i][j] !=0){
                    count++;
                    sparseArr[count][0]=i;
                    sparseArr[count][1]=j;
                    sparseArr[count][2]=chessArr1[i][j];
                }
            }
        }

        System.out.println("得到的稀疏数组");
        for (int i =0;i<sparseArr.length;i++){
            System.out.printf("%d\t%d\t%d\t",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
            System.out.println();
        }

        //恢复原始数组
        int chessArr2[][]=new int[sparseArr[0][0]] [sparseArr[0][1]];
        for(int i=1;i<sparseArr.length;i++){
            chessArr2[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
        }
        for(int [] row : chessArr2){
            for(int data :row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }



    }
}

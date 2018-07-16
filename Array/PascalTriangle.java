//Array #118 easy
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int index = 1;

        ArrayList<Integer> temp = new ArrayList<Integer>(index);



        while (index<=numRows){
            temp = new ArrayList<Integer>(index);
            for (int i=0;i<index;i++){
                if(index==1){
                    temp.add(1);
                }else if(index == 2){
                    temp.add(1);

                }else{
                    if(i==0 || i==index-1){
                        temp.add(1);

                    }else{

                        temp.add(ans.get(index-2).get(i)+ans.get(index-2).get(i-1));
                    }
                }
            }
            index++;
            ans.add(temp);
        }
        return ans;
    }
}
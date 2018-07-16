// Array easy #119
class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        // can improve runtime by just calculate half
        // can improve by use arr and then change to Arraylist
        //Arrays.asList(arr);

        List<Integer> ans = new ArrayList<Integer>();
        int index = 0;

        while(index<=rowIndex){
            for(int i=0;i<=index;i++){
                if(index==0){
                    ans.add(1);
                }else{
                    if(i==0 || i==index){
                        ans.add(1);
                    }else{
                        ans.add(ans.get(i)+ans.get(i-1));
                    }

                }
            }
            for (int j=0;j<ans.size();j++){
            }

            for(int i=0;i<index;i++){
                ans.remove(0);

            }

            index++;

        }

        return ans;


    }
}
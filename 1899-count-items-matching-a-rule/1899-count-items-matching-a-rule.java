class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
      /*  int col = -1;
        if (ruleKey.equals("type"))
            col = 0;
        else if (ruleKey.equals("color"))
            col = 1;
        else
            col = 2;

        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(col).equals(ruleValue)) {
                count++;
            }
        }
        return count;*/
         int c=0;
        switch(ruleKey)
        {
            case "type":
                for(List x:items)
                {
                        if(x.get(0).equals(ruleValue))
                        c++;
                }
            break;
            case "color":
                for(List x:items)
                {
                        if(x.get(1).equals(ruleValue))
                        c++;
                }
            break;
            case "name":
                for(List x:items)
                {
                        if(x.get(2).equals(ruleValue))
                        c++;
                }
                break;
        } 
        return c;
    }
}
class Solution {
    public int strStr(String haystack, String needle) {
       
       for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;

            }
        }
            return -1;
        }}

//             if(heystach.chaeAt(i)==needle.charAt(0)){
//                 int j=0;
//                 int k=i;
               
//                 while(j<needle.length() && k<haystack.length() &&needle.charAt(j)== haystack.charAt(k)){
//                     j++;
//                     k++;
//                     if(j==needle.length()){
//                     return i;
//                     }
//                 }
//             }
//         }
//         return -1;
// }}
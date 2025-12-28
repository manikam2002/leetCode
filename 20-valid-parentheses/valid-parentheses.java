class Solution {
    public boolean isValid(String s) {
        Stack<Character> box= new Stack<>();
        for(int i=0;i< s.length();i++){
            char c= s.charAt(i);

         if(c=='('||c=='{'||c=='[') {
            box.push(c); 
         } 


         else if(c==')'){
            if(!box.isEmpty() && box.peek()=='('){
            box.pop();
         }
         else{
         return false;}
         } 
        


        else if(c=='}'){
            if(!box.isEmpty() && box.peek()=='{'){
            box.pop();
         }
         else{
         return false;}
        }
        

        
        else if(c==']'){
            if(!box.isEmpty() && box.peek()=='['){
            box.pop();
         }
         else{
         return false;}

        
        }
    }
    return box.isEmpty();
    }
}
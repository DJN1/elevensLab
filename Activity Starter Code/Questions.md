Questions:
* 2.1- Deck is the list of cards
* 2.2 - 6
* 2.3-
    * 3.a- `String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};`
    * 3.b- `String[] suits = {"hearts", "spades", "diamonds", "clubs"};`
    * 3.c- `int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};`
* 2.4- No, because it runs through all of them anyway.
* 3.1- ```public static String flip() {
            int num = (int) (Math.rand() * 3);
            if(num == 3)
            return "tails";
            else
            return "heads";
            }```
* 3.2- ```public static boolean arePermutations(int[] a, int[] b){
           for(int i = 0; i < a.length; i++){
               boolean test1 = false;
               for(int k = 0; k < b.length; k++){
                   if(a[i] == b[k]){
                       test1 = true;
                   }
               }
               if(test1){
                   return true;
               }
           }
           return false;
       }```
* 3.3- 1,2,3,4
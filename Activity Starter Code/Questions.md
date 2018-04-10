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
* 6.1- 5 + 6;
* 6.2- Because you always add an even number for number cards and an odd number for facecards
* 6.3- No
* 7.1- Deck, Cards, BoardSize, Ranks, Suits, pointValues
* 7.2- shuffle deck, deal cards, While there are cards or there are matches: combine
* 7.3-  Yes
* 7.4- 
    * 4.a- In the constructor
    * 4.b- ```anotherPlayIsPossible()```
    * 4.c- J, 6, 2, A, 4
    * 4.d- for(Integer : cIndexes) { System.out.print(Integer + " ");
    * 4.e- containsPairSum11 because it needs all fields possible
* 8.1- A board with X cards, Goal is to add card values to specified number, Game is won by clearing all cards.
* 8.2- Polymorphism
* 8.3- ```isLegal()```, ```anotherPlayIsPossible()```; yes because it checks for matches and for legality of move, depending on the game
* 9.1- Because the size depends on the length of the cards, not the method.
* 9.2- Because it doesnt change as the game changes, the method is the same.
* 9.3- Yes, polymorphism

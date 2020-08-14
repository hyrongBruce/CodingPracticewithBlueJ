 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          if(number == 0) return 0;
          int product = 1;
          for(;number>0;number--){
              product*= number;
            }
          return product;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] strArr = phrase.split(" ");
          String resultStr = "";
          for(String str: strArr){
            resultStr+= str.charAt(0);
            }
            
          return resultStr.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char[] charArr = word.toCharArray();
          for(int i=0;i<charArr.length;i++){
            if((charArr[i] >= 97 && charArr[i] <= 119) || (charArr[i] >= 65 && charArr[i] <= 87)){
                charArr[i]= (char)(charArr[i]+3);
            }else if((charArr[i] > 119 && charArr[i]  < 123) || (charArr[i]  > 87 && charArr[i]  < 91)){
                charArr[i]= (char)(charArr[i]+3-26);
            }
            }
            String result = new String(charArr);
          return result;
      }
}

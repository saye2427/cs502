class ParseString {

  public static void main(String[] args) {

     String s = "CS502";

     char[] strNum = new char[s.length()];

     int strNumIdx = 0;

     for (int i=0; i<s.length(); i++) {
        if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

           strNum[strNumIdx] = s.charAt(i);
           strNumIdx++;

        }
     }

     String strNumNew = new String(strNum);

     System.out.println("parse string is:" + strNumNew.trim()); ///trim eliminates any leading or trailing spaces present in a string

     int num = Integer.parseInt(strNumNew.trim()) + 2; //changes 502 to an int, and then adds 2, yielding 504

     System.out.println(num);
      

  }

}

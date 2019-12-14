class TwoDArray {

  public static void main(String[] args) {

     int[][] table = {{10,20,30},{20,30,40},{30,40,50}};

     for (int row=0; row<table.length; row++)
       for (int col=0; col<table[row].length; col++)
         System.out.println("row=" + row + " col=" + col + " value=" + table[row][col]);

  }

}

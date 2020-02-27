public class BIN_TODECIM_M {


  public static int bin_to_dec(int bin) {
      int decim =0;
      int n =0;
      // int bin =111;
      while (true) {
          if (bin == 0) {
              break;
          } else{
              int last_digit = bin % 10;
                    decim += last_digit*Math.pow(2, n);
                    bin = bin/10;
                    n++;

      }
  }
          return decim;

}




    public static void main(String[] args) {
      int decimap_input = 1000;
        System.out.println("Decimal of " + decimap_input + "is: "+bin_to_dec(decimap_input));
    }


}

package chapter1;

public class BeerSong
{   public static  void main(String[] args)
    {
        int beernumber =99;
        String word =("bottles");

        while (beernumber>0){
            if(beernumber==1){
                word="单数的瓶子";
            }

            System.out.println(beernumber+" "+word+" of beer on the wall");
            System.out.println(beernumber+" "+word +"of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around");
            beernumber=beernumber-1;
            if (beernumber>0){
                System.out.println(beernumber+" " +word+"of beer on the wall");
            }else{
                System.out.println("No more bottles of beer on the wall");

            }
        }

    }

    }


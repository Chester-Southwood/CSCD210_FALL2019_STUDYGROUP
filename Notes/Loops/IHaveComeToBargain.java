public class IHaveComeToBargain
{
     public static void main(String []args)
     {
      comeToBargain();
     }
     
   public static void comeToBargain()
   {
       boolean winBargain = false;
       String[] quoteArr = new String[] {"You've come to die. Your world is now my world. Like all worlds.", "You've come to die. Your world is now my... What is this? Illusion?\nNo, this is real.\nGood.", "What is happening?\nSince you gave Kaecilius power from your dimension, I brought some power from mine. This is time. Endless, looped time!\nYou dare?", "You cannot do this for ever.\nActually, I can. This is how things are now! You and me. Trapped in this moment. Endlessly.\nThen you will spend eternity dying!\nYes, but everyone on Earth will live.\nBut you will suffer!\nPain's an old friend.", "End this! You will never win.\nNo. But I can lose. Again. And again. And again. Forever. That makes you my prisoner.\nNo! Stop! Make this stop! Set me free!\nNo! I've come to bargain!\nWhat do you want?\nTake your zealots from the Earth. End your assault on my world. Never come back. Do it and I'll break the loop.\nFine!"};
       do
       {
       	int randomIndex = (int)(Math.random() * quoteArr.length); 
           if(randomIndex != quoteArr.length - 1)
           {
               System.out.println("Dormammu, I've come to bargain!");
           }
           else
           {
               winBargain = true;
           }
           System.out.printf("%s\n\n",quoteArr[randomIndex]);
       }while(!winBargain);
}
}
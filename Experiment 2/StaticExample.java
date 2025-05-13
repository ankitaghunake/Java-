class StaticExample{
   static int count;
   static{
   count=10;
   System.out.println("Static block executed.Initialize from :"+count);
   }
   static void displayCount(){
      System.out.println("count: "+count);   
   }
   public static void main(String[] args) {
      displayCount();
      count+=5;
      System.out.println("Updated Count: "+count);
     
   }
}
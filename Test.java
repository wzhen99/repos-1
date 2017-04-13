class Test {
    private String message = "hi!";
    
    void callMessage(){
      System.out.println(message);
    }
    
    public static main(){
      Test t = new Test();
      t.callMessage();
    }
}

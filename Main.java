public class Main {

  static {
    System.load("/Users/ruslanhladchenko/Documents/projects/java-native/src/main/java/libMyLibrary.dylib");
  }

  public static void main(String[] args) {
    MyNativeClass nativeClass = new MyNativeClass();
    nativeClass.myNativeMethod();
  }


}
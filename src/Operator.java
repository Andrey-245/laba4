public class Operator extends Reporter{

   public static void  TakeVideo(){
       System.out.println("Появился оператор ");

       class VideoCamera{

           public void Operate(){
               System.out.println("Камера зажужжала и оператор начал видеосъемку");
           }

       }
       VideoCamera videoCamera = new VideoCamera();
       videoCamera.Operate();
   }

}

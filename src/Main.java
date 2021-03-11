import java.util.Random;
import java.util.Scanner;



public class Main {


    private static ManyShorty Pchpa = new ManyShorty();
    public static PoliceShorty Simon = new PoliceShorty();

    public static void main(String[] args) {

        Operator operator = new Operator();


        Operator.TakeVideo();
        try {
            ShortyPoliceBoss.Request();
        } catch (AriphmeticErrorException e) {
            e.printStackTrace();
        }

        System.out.println("Босс полицейских приказывает полицейскому Simon приступить к работе");
        Scanner console = new Scanner(System.in);
        System.out.println("Нажмите enter для подтверждения");
        String str = console.nextLine();

        int z = 0;
        int y = 1;
        Random random = new Random();
        int x = random.nextBoolean() ? z:y;

        if(x == 1) {
            Pchpa = new Zevaki();
            System.out.println("Коротышка Пчпа просто тусуется, его нужно побить");

        }
        else{
            Pchpa = new Reporter();

            System.out.println("Коротышка Пчпа - репортер, его нельзя бить, он фотает коротышек в желтой машине.");

        }

            try {
                Simon.beat(Pchpa);
                System.out.println("Коротышке больно он кричит.");

                ManyShorty zevaka = new ManyShorty(){
                    public void  run(){
                        System.out.println("Коротышка убегает.");
                    }
                };
                zevaka.run();
            } catch (NonBeatShortyException Pchpa) {
                Simon.push(Pchpa);
                System.out.println("Полицейский теснит репортера Пчпу, но не бьет его дубинкой.");


            }
            finally {
                System.out.println("===============================================================");
            }



        Street HowPhoto = new Street(new PhotoCamera(0));

        Shorty unnamed1 = new Shorty(TypeOfLocation.STREET, new PhotoCamera((int) (Math.random() * 20)), "unnamed1");
        Shorty unnamed2 = new Shorty(TypeOfLocation.STREET, new PhotoCamera((int) (Math.random() * 20)), "unnamed2");
        Shorty unnamed3 = new Shorty(TypeOfLocation.STREET, new PhotoCamera((int) (Math.random() * 20)), "unnamed3");
        //Shorty unnamed4 = new Shorty(TypeOfLocation.STREET, new PhotoCamera((int) (Math.random() * 0)), "unnamed3");

        Shorty Miga = new Shorty(TypeOfLocation.YELLOW_CAR, new PhotoCamera(0), "Miga");
        Shorty Kozlic = new Shorty(TypeOfLocation.YELLOW_CAR, new PhotoCamera(0), "Kozlic");
        Shorty Gylio = new Shorty(TypeOfLocation.YELLOW_CAR, new PhotoCamera(0), "Gylio");
       // Shorty Neznaika = new Shorty(TypeOfLocation.YELLOW_CAR, new PhotoCamera(0), "Neznaika");
        PhotoCamera PhotoCamera = Photograph. takephoto((int)(Math.random() * 20), HowPhoto, "street", "Miga", (int) (Math.random() * 20) );

        unnamed1.takePhoto((int)(Math.random() * 20), HowPhoto, "street", "Miga", (int) (Math.random() * 20) );

        unnamed2.takePhoto((int)(Math.random() * 20), HowPhoto, "street", "Kozlic", (int) (Math.random() * 15));

        unnamed3.takePhoto((int)(Math.random() * 20), HowPhoto, "street", "Gylio", (int) (Math.random() * 10) );

       // unnamed4.takePhoto((int)(Math.random() * 0), HowPhoto, "street", "Neznaika", (int) (Math.random() * 0));

    }
}

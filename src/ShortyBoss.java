import org.omg.CORBA.PUBLIC_MEMBER;

abstract class ShortyBoss {
    private String name;
    private TypeOfLocation location;
    private PhotoCamera howPhotoCamera;


    public static void Shout() {

    }


    public ShortyBoss(TypeOfLocation street, PhotoCamera PhotoCamera, String name) {

    }

    public ShortyBoss() {

    }

    public void takePhoto(int i, Street  HowPhoto, String location, String name, int howPhoto) {
        System.out.println(name + " вышел из желтой машины " +  "на " + location + ", репортер сфотографировал его " + howPhoto + " раз.");


    }


    @Override
    public String toString() {
        return "Shorty{" +
                "name='" + name + '\''  +
                ", location=" + location +
                ", HowPhoto=" + howPhotoCamera +
                '}';
    }





}
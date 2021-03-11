public class Photograph extends Reporter{
    void PushOnButton(){
        
    }

    public Photograph(TypeOfLocation street, PhotoCamera PhotoCamera, String name) {
        super(street, PhotoCamera, name);
    }

    public Photograph() {
        super();
    }

    public static PhotoCamera takephoto(int i, Street howPhoto, String street, String miga, int i1) {

        return PhotoCamera.takephoto((int)(Math.random() * 20), howPhoto, "street", "Miga", (int) (Math.random() * 20) );
    }
}

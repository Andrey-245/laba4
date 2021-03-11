import java.util.Objects;

public class PhotoCamera extends Photograph {
Street howPhoto;
    PhotoCamera(int HowPhoto) {
        super();

    }

    public PhotoCamera(Street howPhoto) {
        this.howPhoto = howPhoto;
    }

    public static PhotoCamera takephoto(int i, Street howPhoto, String street, String miga, int i1) {

        return null;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "howPhoto=" + howPhoto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoCamera PhotoCamera = (PhotoCamera) o;
        return Objects.equals(howPhoto, PhotoCamera.howPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(howPhoto);
    }
}
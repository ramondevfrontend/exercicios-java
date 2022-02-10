package BootcampSportheca;

public class Meuobj {

    Integer num;

    public Meuobj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}

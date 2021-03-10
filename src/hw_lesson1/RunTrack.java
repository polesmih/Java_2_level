package hw_lesson1;

public class RunTrack extends Barrier {
    private int length;

    public RunTrack (String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println(super.getName() + " длина: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Пробежал успешно");
            return true;
        } else {
            System.out.print("Пробежал неудачно. ");
            return false;
        }
    }

}

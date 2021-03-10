package hw_lesson1;

import java.util.Random;

public class SubjectApp {
    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] members = new Actions[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        members[0] = new Human("Иван", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        members[2] = new Cat("Мур", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        members[1] = new Robot("QPT-125", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRunTrack;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRunTrack = rand.nextBoolean();
            if (isRunTrack) {
                barriers[i] = new RunTrack("Беговая дорожка №" + i, distance);
            } else {
                barriers[i] = new Wall("Стена №" + i + " ", distance);
            }
        }

        for (int i = 0; i < members.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(members[i]);

                if (!result) {
                    break;
                }
            }

            if (!result) {
                //System.out.println("Успех!!");
            //} else {
                System.out.println("Участник дальше не идет...");
            }
        }
    }
    }


package Lesson_2.Homework_final;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Participants participants = new Participants();
        Obstacles obstacles = new Obstacles();

        A_Human human = new A_Human("Ваня", 300, 1.5);
        A_Cat cat = new A_Cat("Олик", 600, 1.2);
        A_Robot robot = new A_Robot("ВАЛЛ-И", 1_000, 2);

        A_Treadmill treadmill_1 = new A_Treadmill(500, human.name, human.maxRunDistance);
        A_Treadmill treadmill_2 = new A_Treadmill(500, cat.name, cat.maxRunDistance);
        A_Treadmill treadmill_3 = new A_Treadmill(500, robot.name, robot.maxRunDistance);
        A_Wall wall_1 = new A_Wall(1.3, human.name, human.maxJumpLength);
        A_Wall wall_2 = new A_Wall(1.3, cat.name, cat.maxJumpLength);
        A_Wall wall_3 = new A_Wall(1.3, robot.name, robot.maxJumpLength);

        Participants[] arrParticipants = {
                human, cat, robot
        };
        Obstacles[] arrObstacles = {
                treadmill_1, wall_1, treadmill_2, wall_2, treadmill_3, wall_3
        };

        for (int i = 0; i < arrParticipants.length; i++) {
            participants.action_run((Action) arrParticipants[i]);

            for (int j = arrObstacles.length-1; j < arrObstacles.length; j++) {
                if(i == 0){
                    arrObstacles[0].getLength();
                    if(arrObstacles[0].getLengthBool() == 0){
                        System.out.println("Эстафета не пройдена");
                        break;
                    }
                    arrObstacles[1].getHeight();
                    if(arrObstacles[1].getHeightBool() == 0){
                        System.out.println("Эстафета не пройдена");
                        break;
                    }
                }
                if(i == 1){
                    arrObstacles[2].getLength();
                    if(arrObstacles[2].getLengthBool() == 0){
                        System.out.println("Эстафета не пройдена");
                        break;
                    }
                    arrObstacles[3].getHeight();
                    if(arrObstacles[3].getHeightBool() == 0){
                        System.out.println("Эстафета не пройдена");
                        break;
                    }
                }
                if(i == 2){
                    arrObstacles[4].getLength();
                    if(arrObstacles[4].getLengthBool() == 0){
                        System.out.println("Эстафета не пройдена");
                        break;
                    }
                    arrObstacles[5].getHeight();
                    if(arrObstacles[5].getHeightBool() == 0){
                        System.out.println("Эстафета не пройдена");
                        break;
                    }
                }

            }
            System.out.println("------------------");
        }
    }
}
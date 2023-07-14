package Lesson_2.Homework_final;

public class Participants{
    public String name;
    public int maxRunDistance;
    public double maxJumpLength;

    private Action currentParticipant;

    public Participants(String name, int maxRunDistance, double maxJumpLength) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpLength = maxJumpLength;
    }
    public Participants() {
    }

    public void action_run(Action participant){
        currentParticipant = participant;
        participant.run();
    }
    public void action_jump(Action participant){
        currentParticipant = participant;
        participant.jump();
    }
    public void action_stand() {
        if (currentParticipant != null) {
            currentParticipant.stand();
            currentParticipant = null;
        } else {
            System.out.println("Никто не двигается");
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public double getMaxJumpLength() {
        return maxJumpLength;
    }

}

public class Medic extends Hero{
    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность PHYSICAL");
    }
    public void increaseExperience(){
        int numOfTreatment = (getHealPoints()*10)/100;
        healPoints+=numOfTreatment;
        System.out.println("number of treatment units: " + healPoints);

    }
}

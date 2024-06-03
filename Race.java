public class Race {

    private String raceName;
    private int[] statBonus;

    public Race(String name, int[] b1){
        raceName = name;
        statBonus = b1;
    }

    public int[] getStatBonus() {
        return statBonus;
    }
}

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate (20_000);
        System.out.println(miles);
    }
}
ghhhh
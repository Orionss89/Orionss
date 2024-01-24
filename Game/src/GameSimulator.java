public class GameSimulator {
    public static void main(String[] args) {
        AttackCharacter character1 = new AttackCharacter("Joe", 100, 100, 100, 0.2);
        AttackCharacter character2 = new AttackCharacter("Martha", 100, 100, 100, 0.4);
        DefenseCharacter character3 = new DefenseCharacter("Kris", 100, 100, 100, 0.2);
        AttackCharacter character4 = new AttackCharacter("Matt", 100, 100, 100, 0.2);
        AttackCharacter character5 = new AttackCharacter("Martha", 100, 100, 100, 0.2);
        DefenseCharacter character6 = new DefenseCharacter("Belly", 100, 100, 100, 0.2);

        Team team1 = new Team("TeamOne", character2, character3, character1);
        Team team2 = new Team("TeamTwo", character5, character6, character4);
        BattleSimulator.fight(team1, team2);
    }
}
package oop;

public class PoisonKinoko extends Kinoko {
    private int poisonAttackAmount;

    public PoisonKinoko(char suffix) {
        super(suffix);
        poisonAttackAmount = 5;
    }

    @Override
    void attack(Hero hero) {
        // a. 우선 보통 공격
        super.attack(hero);

        // b. 독 공격의 남은 횟수가 0이 아니면 다음을 수행
        if (poisonAttackAmount > 0) {
            System.out.println("추가로 독 포자를 살포했다");
            // d. 용사의 HP의 1/5에 해당하는 포인트
            int point = hero.getHp() / 5;

            // 용사의 HP로부터 감소
            int damage = hero.getHp() - point;
            hero.setHp(damage);
            // ~포인트의 데미지 라고 표시
            System.out.println(damage + "포인트의 데미지");

            poisonAttackAmount--;
//            poisonAttackAmount = poisonAttackAmount - 1;
//            poisonAttackAmount -= 1;
        }
    }
}

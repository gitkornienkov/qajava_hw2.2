public class Main {
    public static void main(String[] args) {

        int cash = 100; //Сумма на счету до пополнения
        int pay = 1499; //Сумма пополнения
        int bal = cash + pay; // Баланс с пополнением
        int bonus = 1; // Константа
        int bonusCash; //Пока ХЗ, забыл что хотел в эту переменную сделатью
        int balanceWithBonus; //Итоговый баланс с бонусами

        if (pay < 1000) {    // Условие начисления бонусов
            System.out.println("Согласно условиям акции бонусные рубли не начисляются.");
            System.out.println("Ваш баланс: " + bal + " рублей(я).");
        } else {
            bonusCash = pay / 100; //Расчет бонусных рублей
            balanceWithBonus = bal + bonusCash; //Расчет баланса после пополнения с бонусами
            System.out.println("Поздравляем, Вы выполнили условия акции!");
            System.out.println("Начислено бонусных рублей: " + bonusCash + " рублей(я).");
            System.out.println("Ваш баланс: " + balanceWithBonus + " рублей(я).");
        }
    }
}
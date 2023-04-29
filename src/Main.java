public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age < 18) {
            System.out.println("Возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }
        if (age >= 18) {
            System.out.println("Возраст человека равен " + age + ", он совершеннолетний.");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int degrees = 5;
        if (degrees < 5) {
            System.out.println("На улице температура ниже " + degrees + " градусов, нужно надеть шапку.");
        }
        if (degrees >= 5) {
            System.out.println("На улице температура воздуха выше " + degrees + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Скорость " + speed + " км/ч, то придется заплатить штраф.");
        }
        if (speed <= 60) {
            System.out.println("Скорость " + speed + " км/ч, можно ездить спокойно.");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 16;
        boolean sleepTime = age < 2;
        if (sleepTime) {
            System.out.println("Возраст человека - " + age + " год, ему пора спать.");
        }
        boolean kindergarten = age >= 2 && age <= 6;
        if (kindergarten) {
            System.out.println("Возраст человека - " + age + " года, ему нужно ходить в детский сад.");
        }
        boolean schoolYears = age >= 7 && age < 18;
        if (schoolYears) {
            System.out.println("Возраст человека - " + age + " лет, ему нужно ходить в школу.");
        }
        boolean universityYears = age > 18 && age <= 24;
        if (universityYears) {
            System.out.println("Возраст человека - " + age + " год, его место в университете.");
        }
        boolean workingHours = age > 24;
        if (workingHours) {
            System.out.println("Возраст человека - " + age + " лет, ему пора ходить на работу.");
        }
        int ageMan = 66;
        int ageWoman = 61;
        boolean pension = ageMan >= 65;
        boolean pension1 = ageWoman >= 60;
        if (pension1) {
            System.out.println("Возраст женщины - " + ageWoman + " год, ей пора на пенсию.");
        }
        if (pension) {
            System.out.println("Возраст мужчины " + ageMan + " лет, ему пора на пенсию.");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int childrenIsAge = 12;
        boolean little = childrenIsAge < 5;
        boolean average = childrenIsAge > 5 && childrenIsAge < 14;
        boolean older = childrenIsAge > 14;
        if (little){
            System.out.println("Возраст ребенка - " + childrenIsAge + " года, он не может кататься на аттракционе.");
        }
        if (average) {
            System.out.println("Возраст ребенка - " + childrenIsAge + " лет, он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (older) {
            System.out.println("Возраст ребенка - " + childrenIsAge + " лет, он может кататься без сопровождения взрослого.");

        }
        }


    public static void task6 () {
        System.out.println("Задача 6");
        int carCapacity = 102;
        int seating = 60;
        int standingPlaces = carCapacity - seating; //колличество мест

        int soldSeat = 60;
        int soldStand = 40;
        if(soldSeat<seating){
           System.out.println("Есть еще " + (seating - soldSeat) + " сидячих мест(а).");
    }else{
            System.out.println("Нет сидячих мест!");
    }
        if(soldStand<standingPlaces) {
            System.out.println("Есть еще " + (standingPlaces - soldStand) + " стоячих мест(а).");
    }else{
            System.out.println("Нет стоячих мест!");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 10;
        int two = 10;
        int three = 10;
        if (one > two) {
            if (one >= three) {
                System.out.println(one + " самое большее число.");
            } else {
                System.out.println(three + " самое большее число.");
        }
        } else if (two > one){
            if (two >= three){
                System.out.println(two + " самое большее число.");
            }else{
                System.out.println(three + " самое большее число.");
        }
        } else {
            if(one > three) {
                System.out.println(one + " самое большее число.");
            } else if(three>one){
                System.out.println(three + " самое большее число.");
            }else {
                System.out.println("Все числа равны.");
            }
            }
    }
   }



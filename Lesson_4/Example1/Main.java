package Lesson_4.Example1;

public class Main {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        Integer sum = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj()); // нужно кастить
        System.out.println("sum = " + sum);

        intBox1.setObj("55");
        System.out.println(intBox1.getObj());

        Integer sum2 = 0;
        if(intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer){
            sum2 = ((Integer) intBox1.getObj()) + ((Integer) intBox2.getObj()); // Клас каст эксепшн
        }
        System.out.println("sum2 = " + sum2);

        GenBox<Integer> gen1 = new GenBox(30);
        GenBox<Integer> gen2 = new GenBox(20);
        Integer sum3 = gen1.getObj() + gen2.getObj(); // Больше не нужно кастить
        System.out.println("sum3 = " + sum3);

        //gen1.setObj("10"); // ошибка компиляции, т.к. в GenBox задан тип Integer - исправить легко


    }
}

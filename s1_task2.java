// Задача: Вывести все простые числа от 1 до 1000

public class s1_task2 {
        public static void main(String[] args) {
            System.out.println("Список простых чисел от 1 до 1000:");
            for (int i=1; i<1001; i++) {
                int count = 0;
                for (int j=1; j<=i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count <= 2) {
                    System.out.println(i);
                }
            }
        }
    }


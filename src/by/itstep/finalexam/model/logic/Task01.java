package by.itstep.finalexam.model.logic;

/* Task 01. The Best Result [лучший результат]
 *
 *  Современный школьник настоящий герой, его школьные будни наполнены заботами,
 *  уроками и оценками. Он изо всех сил старается, но, как и любой человек,
 *  он время от времени допускает ошибки и получает не самые лучшие оценки.
 *  Иногда школьнику приходится проходить особые испытания –
 *  показывать свой дневник родителям.
 *
 *  И так, представьте ситуацию, когда родители просят показать оценки
 *  за некий период, который состоит из последовательности 7 дней.
 *  Оценки – это целые числа от 2 до 5 включительно – по одной оценке на каждый
 *  день. Школьник хочет выбрать такой непрерывный отрезок своих оценок, чтобы
 *  в этом отрезке не было оценок 2 и 3, а количество оценок 5 было МАКСИМАЛЬНЫМ.
 *  Помогите школьнику найти этот особенный период, когда его школьный свет
 *  преобладает над тьмой, и его оценки сияют наиболее ярко!
 *
 *  Необходимо спроектировать нажёжный и эффективный алгоритм, который
 *  возвращает количество пятерок в выбранном школьнике отрезке дней,
 *  удовлетворяющем всем вышеописанным условиям.
 *  Если такого отрезка не существует, программа должна возвратить -1.
 *
 *  Примечание
 *  1) Не забудьте про "защиту от дурака": если оценки заданы некорректно,
 *  то нужно возвратить -1.
 *  2) Да, может быть период, где только одни четвёрки.
 *
 *  Формат входных данных [input]
 *  На вход метод получает массивы целочисленных значений - оценки школьника.
 *
 *  Формат выходных данных [output]
 *  Метод должен возвратить целое число - максимальное количество пятёрок
 *  в выбранном школьником отрезке, удовлетворяющим всем условиям, или -1,
 *  если данные заданы некорректно.
 *
 *  [ input 1]: 5 5 4 5 4 5 4 5 4
 *  [output 1]: 4
 *
 *  [ input 2]: 3 4 4 4 4 5 4 5
 *  [output 2]: 2
 *
 *  [ input 3]: 5 3 4 5 3 5 5 4 5 4 4 4 4 3 5 5
 *  [output 3]: 3
 *
 *  [ input 4]: 4 4 4 4 4 4 4
 *  [output 4]: 0
 *
 *  [ input 5]: 4 5 4 2 5 4 5
 *  [output 5]: -1
 *
 *  [ input 6]: 5 5 5 5 5 3 5 5 5 5
 *  [output 6]: -1
 */

public class Task01 {
    public static final int MIN_MARK = 2;       // or worst mark
    public static final int MAX_MARK = 5;       // or best mark
    public static final int DAY_NUMBER = 7;     // or range of days

    public static int findBestMarkNumber(int[] marks) {
        return 0;
    }
}
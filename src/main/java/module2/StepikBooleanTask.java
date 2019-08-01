package module2;

public class StepikBooleanTask {
//topic 2.1 https://stepik.org/lesson/12759/step/6?unit=3107

    /**
     * Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false.
     *
     * Воспользуйтесь шаблоном кода, который предлагает система. Ввод-вывод будет сделан за вас. Вам надо только проанализировать переданные в метод booleanExpression значения (a, b, c, d) и вернуть результат. Попробуйте составить формулу с использованием булевых операторов. Если не получается, вернитесь к этому заданию после просмотра степов про условные операторы и циклы.
     *
     * При записи сложных выражений рекомендуется использовать скобки, чтобы не запутаться в порядке применения операторов.
     *
     * В качестве примера уже указано заведомо некорректное решение задачи. Исправьте его.
     *
     * Совет тем, у кого не проходит какой-то из тестов. В данной задаче возможно всего 16 комбинаций значений входных параметров. Их можно выписать на бумажку, посчитать для них правильные ответы и сравнить с тем, что выдает ваше решение. Попробуйте самостоятельно проделать это, найти ошибку и исправить решение.
     *
     *
     */
    public static void main(String[] args) throws Exception {

        boolean ffff = booleanExpression(false, false, false, false);
        boolean ffft = booleanExpression(false, false, false, true);
        boolean fftf = booleanExpression(false, false, true, false);
        boolean fftt  = booleanExpression(false, false, true, true); //Searching for this

        boolean ftff = booleanExpression(false, true, false, false);
        boolean ftft = booleanExpression(false, true, false, true); //Searching for this
        boolean fttf = booleanExpression(false, true, true, false); //Searching for this
        boolean fttt = booleanExpression(false, true, true, true);

        boolean tfff = booleanExpression(true, false, false, false);
        boolean tfft = booleanExpression(true, false, false, true); //Searching for this
        boolean tftf = booleanExpression(true, false, true, false); //Searching for this
        boolean tftt = booleanExpression(true, false, true, true);

        boolean ttff = booleanExpression(true, true, false, false); //Searching for this
        boolean ttft = booleanExpression(true, true, false, true);
        boolean tttf = booleanExpression(true, true, true, false);
        boolean tttt = booleanExpression(true, true, true, true);

        System.out.println("ffff " + ffff);
        System.out.println("ffft " + ffft);
        System.out.println("fftf " + fftf);
        System.out.println("fftt " + fftt + " <- ");

        System.out.println("ftff " + ftff);
        System.out.println("ftft " + ftft + " <- ");
        System.out.println("fttf " + fttf + " <- ");
        System.out.println("fttt " + fttt);

        System.out.println("tfff " + tfff);
        System.out.println("tfft " + tfft + " <- ");
        System.out.println("tftf " + tftf + " <- ");
        System.out.println("tftt " + tftt);

        System.out.println("ttff " + ttff + " <- ");
        System.out.println("ttft " + ttft);
        System.out.println("tttf " + tttf);
        System.out.println("tttt " + tttt);


        boolean allCorrectAreTrue = fftt & ftft & fttf & tfft & tftf & ttff;

        boolean allIncorrectAreTrue = ffff | ffft | fftf | ftff | fttt |  tfff | tftt | ttft | tttf | tttt;

        boolean correctAnswerCondition = allCorrectAreTrue & !allIncorrectAreTrue;

        if (correctAnswerCondition) {
            System.out.println(" You have found the correct answer!!! :) ");
        } else {
            System.out.println(" Correct answer still to be found... :( ");
        }

    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        /*
        Ваш код решения заключается в изменении того, что будете возвращать! Изменяйте возвращаемое значение
        до тех пор, пока метод выше не поздравит Вас с корректно найденным сочетанием.
        ВАЖНО!!!
        В моём примере после return - НЕПРАВИЛЬНЫЙ вариант! Ищите свой, правильный :)
        */
        //return (a & b) ^ (b & c) ^ (c & d) ^ (a & c) ^ (a & d) ^ (b & d);
        //return a^b                ?c^d:a^c&&b^d;

        return ((a ^ b) &(c ^ d)) | ((a ^ c) &(b ^ d));













        //return (a | b | c | d) & !(a & b & c & d) & !(a ^ b ^ c ^ d); http://www.cyberforum.ru/java-j2se/thread1805703.html#post13181946
        //return a ? (b ? c ? false : d ? false : true : c ? d ? false : true : d ? true : false) : (b ? c ? d ? false : true : d ? true : false : c ? d ? true : false : false);
        //return (a ^ b) &(c ^ d)|(a ^ c) &(b ^ d);
        //return a^b?c^d:a^c&&b^d;
    }

    }

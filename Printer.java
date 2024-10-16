/* Задание 1. Удаление нечетных строк
Дан LinkedList с несколькими элементами. В методе removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
которых нечетная. Используйте LinkedList и стандартные методы.
 */
/* import java.util.LinkedList;

class LLTasks {
    public static void removeOddLengthStrings(LinkedList<String> ll) {
        int i = 0;
        for (i = 0; i < ll.size(); i++) {
            if (ll.get(i).length()%2 > 0)
                ll.remove(i);
        }
// Напишите свое решение ниже
}
}

public class Printer {
    public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    if (args.length == 0) {
    // При отправке кода на Выполнение, вы можете варьировать эти параметры
        ll.add("apple");
        ll.add("banana");
        ll.add("pear");
        ll.add("grape");
    } else {
        for (String arg : args) {
            ll.add(arg);
        }
    }
    LLTasks answer = new LLTasks();
    System.out.println(ll);
    answer.removeOddLengthStrings(ll);
    System.out.println(ll);
}
}
 */

/* Задача 2. Реализация стека
Реализуйте MyStack с использованием LinkedList с методами:
● push(String element) - добавляет элемент на вершину стека
● pop() - возвращает элемент с вершины и удаляет его
● peek() - возвращает элемент с вершины, не удаляя
● getElements() - возвращает все элементы стека */

/* mport java.util.LinkedList;

class MyStack {
    // Напишите свое решение ниже
    private LinkedList <String> stack = new LinkedList<>();
 
    public void push(String element) {
        stack.push(element);
    // Напишите свое решение ниже
    }
    public String pop() {
        return stack.removeFirst();
    // Напишите свое решение ниже
    }
    public String peek() {
        return stack.peekFirst();
    // Напишите свое решение ниже
    }
    public LinkedList<String> getElements() {
        return new LinkedList<>(stack);
    // Напишите свое решение ниже
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {
public static void main(String[] args) {
    MyStack stack = new MyStack();
    if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете     варьировать эти параметры
        stack.push("apple");
        stack.push("banana");
        stack.push("pear");
        stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }
    System.out.println(stack.getElements());
    System.out.println(stack.pop());
    System.out.println(stack.getElements());
    System.out.println(stack.peek());
    }
}
 */

//  Задача 3. Количество вхождений слова
//  Реализуйте метод countOccurrences в классе ListUtils, который
//  принимает LinkedList<String> и строку, и возвращает количество
//  вхождений строки в список.
 
/* import java.util.LinkedList;
class ListUtils {
    public static int countOccurrences(LinkedList<String> list, String value) {
        int count = 0;
        for (String s : list) {
            if (s.equals(value)) {
                count++;
        }
    }
    return count;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();    
    String value;
    if (args.length < 2) {
    // При отправке кода на Выполнение, вы можете     варьировать эти параметры
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("pear");
        list.add("banana");
        value = "apple";
        }
    else {
        for (int i = 0; i < args.length - 1; i++) {
            list.add(args[i]);
            }
            value = args[args.length - 1];
        }
    ListUtils utils = new ListUtils();
    System.out.println("Occurrences of \"" + value + "\": " + utils.countOccurrences(list, value));
    }
}
         */

/* 
         Задача 4. Сдвиг очереди
         Реализуйте метод rotateDeque в классе DequeTasks, который принимает
         Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
         позиций. Если n отрицательное, повернуть влево. */
        
import java.util.Deque;
import java.util.LinkedList;
class DequeTasks {
    public static void rotateDeque(Deque<Integer> deque, int n)
         {
         // Напишите свое решение ниже
         }
}
         // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {Deque<Integer> deque = new LinkedList<>();
        int n;
        if (args.length < 1) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            n = 2;
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(Integer.parseInt(args[i]));
            }
            n = Integer.parseInt(args[args.length - 1]);
        }
        DequeTasks.rotateDeque(deque, n);
    }
    
}
            
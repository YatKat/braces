package validation;

//        Релізувати метод
//        ```boolean checkBrackets(String data);```
//        який буде перевіряти на валідність закриті і відкриті дужки *(* і *)*
//        true - тільки якщо відкриті і закриті дужки розташовані в валідному порядку
//        написати максимум unit tests.

public class Validation {

    public static boolean checkBrackets(String data) {
        int count = 0;

        if(data == null){
            return true;
        }

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '(') {
                count++;
            } else if (data.charAt(i) == ')') {
                count--;
            }
            if(count < 0){
                return false;
            }
        }
        return count == 0;
    }
}

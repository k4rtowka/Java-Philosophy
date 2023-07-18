# Философия Java
### Глава 4 "Управляющие конструкции"
#### Упражнение 1
* Изменить метод __test()__ так, чтобы он получал два дополнительных аргумента __begin__ и __end__, а значение __target__ проверялось на принадлежность к диапазону.
###### Фрагмент кода
```java
static int test(int testval, int target){
    if(testval > target)
        return 1;
    else if(testval < target)
        return -1;
    else
        return 0;
}
```

package org.example;

import java.util.ArrayList;
import java.util.List;

public class  Main {

public static void main(String[] args) {
    //این درسته چون integer زیر کلاس number هست
    Box<Number> numberBox = new Box<>();
    numberBox.setItem(10); // Integer is a Number

    Box<? extends Number> wildcardBox = numberBox;
    //در این حالت فقط اجازه خواندن دارد و نمیتوان نوشتن و چیزی set کرد
    //و برای حل این مشکل از super استفاده می کنیم
//اشتباه چون انتساب نمیشه کرد مقداری بهش set کرد در extends
    // The following line will cause a compilation error:
    wildcardBox.setItem(5.5); // Double is also a Number
    wildcardBox.setItem(10);
    Box<? super Number> box = new Box<>();
    box.setItem(10);      // Integer
    box.setItem(3.14);
    //در اینجا مشکلی نیست چون داره مقدار ایتم set میکنه
    //ولی خود box نمیتونه از نوع integer باشه
    //چون اینتیجر زیر کلاس نامبر است
    List<Box<? super Integer>> list = new ArrayList<>();
    list.add(new Box<Number>()); // This is valid
    list.add(new Box<Object>());
      // This would also be valid
    //این درسته چون نامبر و ابجکت سوپر کلاس های اینتیجر هستن
//دو خط بالا درسته چون object ,number سوپر کلاس integer
   // The following line will cause a compilation error:
     Box<Integer> intBox = list.get(0);
     //اینجا مشخص نیست inbox از نوع integer باشه مبهم هست
    Box<? super Integer> intBox1 = list.get(0);


    // The following line will cause a compilation error:
    Integer intBox3 = intBox.getItem();
    //نوع داده فقط ابجکت برمیگردونه نه اینتیجر
}
}


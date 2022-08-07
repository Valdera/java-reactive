package com.rp.sec01;

import com.rp.sec01.assignment.FileService;
import courseutil.Util;

public class Lec09AssignmentDemo {
    public static void main(String[] args) {
        FileService.read("file02.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.write("file03.txt", "This is file 3")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.delete("file03.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }
}

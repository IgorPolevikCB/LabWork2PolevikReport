package com.example.labwork2polevik;
import com.example.labwork2polevik.Task1.Author;

import org.junit.Test;

public class TestT1 {
    @Test
    public void TestTaskOne(){
        Author a1 = new Author("Igor Polevik", "igorpolevik@gmail.com");
        System.out.println(a1);

        a1.setName("Mark");
        a1.setEmail("markBooks@gmail.com");
        System.out.println(a1);
        System.out.println("name: " + a1.getName());
        System.out.println("email: " + a1.getEmail());

    }
}

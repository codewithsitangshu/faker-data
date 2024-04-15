package org.codewithsitangshu.application;

import org.codewithsitangshu.data.Content;

public class UseContent {

    public static void main(String[] args) {

        Content content = new Content();

        System.out.println("Sentence is: " + content.getSentence());
        System.out.println("Paragraph is: " + content.getParagraph());

    }
}


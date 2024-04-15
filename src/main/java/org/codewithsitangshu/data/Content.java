package org.codewithsitangshu.data;

public class Content extends Data {

    private String sentence;
    private String paragraph;

    public String getSentence() {
        setSentence();
        return this.sentence;
    }

    private void setSentence() {
        this.sentence = faker.lorem().sentence();
    }

    public String getParagraph() {
        setParagraph();
        return this.paragraph;
    }

    private void setParagraph() {
        this.paragraph = faker.lorem().paragraph();
    }
}


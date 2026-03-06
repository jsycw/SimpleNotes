package com.astrapay.dto;
import javax.validation.constraints.NotBlank;

public class NoteRequest {
    @NotBlank(message = "Note content cannot be blank")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

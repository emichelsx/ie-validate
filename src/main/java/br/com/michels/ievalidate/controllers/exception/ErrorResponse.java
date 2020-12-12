package br.com.michels.ievalidate.controllers.exception;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class ErrorResponse
{
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }

    private String message;
    private List<String> details;

}

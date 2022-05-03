package com.codesoom.assignment.errors.message;

//TODO:다국어 처리 고민
public enum ErrorMessage {
    EMAIL_IS_EMPTY("email은 공백이 허용되지 않습니다"),
    NAME_IS_EMPTY("이름은 공백이 허용되지 않습니다"),
    PASSWORD_LENGTH_PREFIX("비밀번호는"),
    PASSWORD_LENGTH_BELOW_SUFFIX("자 이하 이여야합니다"),
    PASSWORD_LENGTH_MORE_THAN_SUFFIX("자 이상 이어햐합니다");

    private final String errorMsg;

    ErrorMessage(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getErrorMsg(Object... arg) {
        return String.format(errorMsg, arg);
    }
}

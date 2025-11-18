package components;

public enum Languages {
    RU("ru", "Войти"),
    KZ("kz", "Кіру");

    public final String code;   // значение for=
    public final String label;  // текст для проверки

    Languages(String code, String label) {
        this.code = code;
        this.label = label;
    }
}

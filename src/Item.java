public class Item {

    private String name;
    private String code;
    private int codeNumber;

    public Item(String code, String name) {
        setName(name);
        setCode(code);

    }

    public Item(int codeNumber, String name) {
        this.name = name;
        this.codeNumber = codeNumber;
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void show() {
        System.out.println("Name: " + name);
//        System.out.println("Code: " + code);
    }
}

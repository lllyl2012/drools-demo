package top.lllyl2012;

public class Person {
    private String identity;
    private Integer count;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void sub(){
        count = count - 20;
    }
}

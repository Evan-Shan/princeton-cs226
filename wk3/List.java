package week3;

public interface List<k> {
    public void addLast(k x);

    public k getLast();

    public k get(int x);

    public int size();

    public k removeLast();

    default public void print(){
        for (int i = 0; i < size(); i ++){
            System.out.println(get(i));
        }
    }
}

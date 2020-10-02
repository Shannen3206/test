public class M {
    int a;
    protected :
    int b;
    public :
    void show(){
        cout << a<<b;
    }
}
class D: protected M{
    int i;
    protected:
        int j;
    public void show(){
        M::show();cout<<i<<j<<endl;
        }
        }

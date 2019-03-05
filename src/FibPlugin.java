import java.io.Serializable;

public class FibPlugin implements Plugin, Serializable {
    public int n;

    public FibPlugin(int p)
    {
        this.n=p;
    }
    
    public Object compute()
    {
       int a, b, c;
       a = 1;
       b = 1;
       c = 1;
       for(int i=0; i<n-2; i++)
       {
          c = a + b;
	  a = b;
	  b = c;
       }
       return new Integer(c);
    }
}

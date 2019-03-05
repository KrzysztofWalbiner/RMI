import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AppClient {


    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());

        try {
            Registry registry = LocateRegistry.getRegistry(args[0]);
            AppContainer client = (AppContainer) registry.lookup(args[1]);
            Plugin pl = new FibPlugin(Integer.parseInt(args[2]));
            System.out.println("Wynik:"+client.run(pl));



        } catch (RemoteException | NotBoundException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

}

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        List<Client> arrayList = new  ArrayList<>();
        arrayList.add(new Client("Nick", new Date(randomDate())));
        arrayList.add(new Client("Gim", new Date(randomDate())));
        arrayList.add(new Client("Billy", new Date(randomDate())));
        arrayList.add(new Client("Van", new Date(randomDate())));
        arrayList.add(new Client("Sam", new Date(randomDate())));
        arrayList.add(new Client("Semen", new Date(randomDate())));
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    public static long randomDate(){
        Date startDate = new Date(1);
        Date endDate = new Date();
        return ThreadLocalRandom.current().nextLong(startDate.getTime(),endDate.getTime());
    }
}
class Client implements Comparable<Client>{
    private String name;
    private Date date;

    public Client(String name, Date date){
        this.name = name;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm");
        return "Client{" +
                "name='" + name + '\'' +
                ", date=" + simpleDateFormat.format(date) +
                "}\n";
    }

    @Override
    public int compareTo(Client o) {
//        if(this.date.after(o.getDate()))
//            return 1;
//        else if (this.date.before(o.getDate()))
//            return -1;
//        else
//            return 0;
        return this.date.compareTo(o.getDate());
    }
}
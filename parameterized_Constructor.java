import java.util.Scanner;
 class Player_record
{
    int player_id;
    String player_name;
    int player_run;

    public Player_record()
    {
        player_id = 18;
        player_name="Virat Kohli";
        player_run = 28000;

    }
    public Player_record(int player_id, String player_name, int player_run)
    {
        this.player_id = player_id;
        this.player_name = player_name;
        this.player_run = player_run;
    }

    public void show()
    {
        System.out.println("Player Id = "+player_id);
        System.out.println("Player Name = "+player_name);
        System.out.println("Player run = "+player_run);
        System.out.println();
    }
    public static void main(String[] args)
    {
    System.out.println("****Default Player Information****");
    Player_record obj = new Player_record();
    obj.show();
    Player_record obj1 = new Player_record(7,"Dhoni",1000);
    obj1.show();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("How many player you want to enter");
    int lim = sc.nextInt();
    Player_record obj2[] = new Player_record[10];
    for(int i=0; i<lim;i++)
    {
        obj2[i] = new Player_record();
    }
    
    for(int j=0; j<lim;j++)
    {
        obj2[j].show();
    }
    }
}

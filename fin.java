import java.util.Scanner;
import java.util.Random;
import java.awt.Desktop;
import java.io.*;
import java.net.*;
import java.time.*;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

class colour{
    String CYANB="\u001B[46m";
   
    String BLUE="\u001B[34m";
    static String RED="\u001B[31m";
    static String PURPLE="\u001B[35m";
    static String GREEN="\u001B[32m";
    
    final static String YELLOW = "\u001B[33m";
    

   
    String WHITEB="\u001B[47m";
    String YELLOWB="\u001B[43m";
    String BLUEB="\u001B[44m";
    String GREENB="\u001B[42m";
      final static String RESET = "\u001B[0m";
}

 class tos {
	tos (String tell) 
	{
        Scanner cin= new Scanner(System.in);
		String say=tell;

		try {
			System.setProperty(
				"freetts.voices",
				"com.sun.speech.freetts.en.us"
					+ ".cmu_us_kal.KevinVoiceDirectory");

			Central.registerEngineCentral(
				"com.sun.speech.freetts"
				+ ".jsapi.FreeTTSEngineCentral");

			Synthesizer synthesizer
				= Central.createSynthesizer(
					new SynthesizerModeDesc(Locale.US));

			synthesizer.allocate();
			synthesizer.resume();
			synthesizer.speakPlainText(
				say, null);
			synthesizer.waitEngineState(
				Synthesizer.QUEUE_EMPTY);
			synthesizer.deallocate();
          
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class url {
	
    url (String sc)
			throws Exception
             {  
        String inputstring=new String();
        //     System.out.println("ENTER THE TAB YOU WANT TO OPEN");
        //     Scanner sc=new Scanner(System.in);
             inputstring=sc;
             sc= sc.toLowerCase();
             sc=sc.trim();
             sc = sc.replaceAll("( )+", "");
             

              if(inputstring.equals("opengoogle")){
		Desktop desk = Desktop.getDesktop();
		// now we enter our URL that we want to open in our
	 	// default browser
	 	desk.browse(new URI("http://www.google.com"));
	 }

     if(inputstring.equals("openmails")){
		Desktop desk = Desktop.getDesktop();
		// now we enter our URL that we want to open in our
	 	// default browser
	 	desk.browse(new URI("https://www.google.com/gmail/about/"));}

     if(inputstring.equals("openlms")){
        Desktop desk = Desktop.getDesktop();
        desk.browse(new URI("https://lms.nirmauni.ac.in/login/index.php"));
	 }

     if(inputstring.equals("shownews")){
		Desktop desk = Desktop.getDesktop();
		// now we enter our URL that we want to open in our
	 	// default browser
	 	desk.browse(new URI("https://m.timesofindia.com"));
	 }

     if(inputstring.equals("opennetflix")){
		Desktop desk = Desktop.getDesktop();
		// now we enter our URL that we want to open in our
	 	// default browser
	 	desk.browse(new URI("https://www.netflix.com/browse"));
	 }

     if(inputstring.equals("showweather")){
		Desktop desk = Desktop.getDesktop();
		// now we enter our URL that we want to open in our
	 	// default browser
	 	desk.browse(new URI("https://weather.com/en-IN/weather/today/l/23.13,72.54"));
	 }
    
    

}
}
   
class calendar extends colour {
   calendar() {
   // System.out.println(CYANB);
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue(),
        today = date.getDayOfMonth();
        date = date.minusDays(today - 1);

        System.out.println("       "+PURPLE+date.getMonth()+"("+(date.getYear())+BLUE+")\nMon Tue Wed Thu Fri Sat Sun"+RESET);
        
    for (int i = 1; i < date.getDayOfWeek().getValue(); i++)
    
     System.out.print("    ");
     
     
    
     while (date.getMonthValue() == month){
     
          System.out.print(String.format("%3d", date.getDayOfMonth()));
         
                   System.out.print(date.getDayOfMonth()==today?GREENB+"":" "+RESET);
           
      date = date.plusDays(1);
            System.out.print(date.getDayOfWeek().getValue()==1?"\n":"");
            
        }
    }
}

abstract class facts extends colour{
    abstract void call();
}

class randfact1 extends facts{
    void call(){
        System.out.println(PURPLE+"It is impossible for most people to lick their own elbow. (try it!)"+RESET);
      //  new tos("It is impossible for most people to lick their own elbow. (try it!)");
    } 
}

class randfact2 extends facts{
    void call(){
        System.out.println(PURPLE+"A crocodile cannot stick its tongue out."+RESET);
      //  new tos("A crocodile cannot stick its tongue out.");
    } 
}

class randfact3 extends facts{
    void call(){
        System.out.println(PURPLE+"It is physically impossible for pigs to look up into the sky"+RESET);
       // new tos("It is physically impossible for pigs to look up into the sky");
    } 
}

class randfact4 extends facts{
    void call(){
        System.out.println(PURPLE+"If you sneeze too hard, you could fracture a rib."+RESET);
       // new tos("If you sneeze too hard, you could fracture a rib.");
    } 
}

class randfact5 extends facts{
    void call(){
        System.out.println(PURPLE+"Wearing headphones for just an hour could increase the bacteria in your ear by 700 times."+RESET);
      //  new tos("Wearing headphones for just an hour could increase the bacteria in your ear by 700 times.");
    } 
}

class randfact6 extends facts{
    void call(){
        System.out.println(PURPLE+"Some lipsticks contain fish scales."+RESET);
      //  new tos("Some lipsticks contain fish scales.");
    } 
}

class randfact7 extends facts{
    void call(){
        System.out.println(PURPLE+"There are 293 ways to make change for a dollar."+RESET);
       // new tos("There are 293 ways to make change for a dollar.");
    } 
}

class randomfacts{
    randomfacts(){

        //facts fact[]=new facts[10];
                randfact1 f1=new randfact1();
                randfact2 f2=new randfact2();
                randfact3 f3=new randfact3();
                randfact4 f4=new randfact4();
                randfact5 f5=new randfact5();
                randfact6 f6=new randfact6();
                randfact7 f7=new randfact7();

        int min=1;
        int max=7;
        Random rand=new Random();
        int rand_i=rand.nextInt(max)+min;
      //  System.out.println(rand_i);

        if (rand_i==1){
                facts f;
                f=f1;
                f.call();
        }

        else if (rand_i==3){
            facts f;
            f=f3;
            f.call();
    }

else if (rand_i==2){
    facts f;
    f=f2;
    f.call();
}

else if (rand_i==4){
    facts f;
    f=f4;
    f.call();
}

else if (rand_i==5){
    facts f;
    f=f5;
    f.call();
}

else if (rand_i==6){
    facts f;
    f=f6;
    f.call();
}

else{
    facts f;
    f=f7;
    f.call();
}


    }
}

class cls {
    cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
public class fin extends colour{
    public static void main(String args[]) throws Exception{
        long start = System.currentTimeMillis();
      //  System.out.println("HEllo wolrd");
   
      new cls();
      System.out.println( RED+"Enter your good name :"+ RESET);
        String s= "";
        Scanner cin= new Scanner(System.in);
        String name=cin.nextLine();
        System.out.println(PURPLE+"Good Morning! "+GREEN+name+RESET);

        Date current_Date=new Date();
        System.out.println(current_Date);
        while(!s.equals("exit")){
        
            System.out.println(GREEN);
            System.out.print(name+YELLOW+" --> "+RESET); s=cin.nextLine();
           s= s.toLowerCase();
           s=s.trim();
           s = s.replaceAll("( )+", "");
          
        
         //   System.out.println("S :"+s);
            
            if (s.equals("hi")) {
           // tos ts=new tos("Hellooo");
              
          //   Thread.sleep(4000);
                
            }


       else    if (s.equals("tellmeafact"))
            {
         
          randomfacts rf =new randomfacts();
            
            }

          else  if (s.equals("opengoogle"))
            {
       //  tos ts= new tos("Opening google..");
                new url("opengoogle");
            
            }
         else   if (s.equals("opennetflix"))
            {
         
                url u = new url("opennetflix");
            
            }
        else    if (s.equals("openmails"))
            {
         
                url u = new url("openmails");
            
            }
          else  if (s.equals("shownews"))
            {
         
                url u = new url("shownews");
            
            }
        else    if (s.equals("showweather"))
            {
         
                url u = new url("showweather");
            
            }

    

          else  if (s.equals("showcalendar"))
            {
         
               calendar ca = new calendar();
               System.out.println("");
            
            }
         else   if (s.equals("chatwithfriend")) {

                server1 se = new server1(8085);
                
            }

         else   if (s.equals("clickpicture")) {

               new doit(0);
                
            }
          else  if (s.equals("sendliveimage")) {
            System.out.println("Ask your friend to start server..");
          Thread.sleep(5000);

                        new doit(1);
                
            }
            else  if (s.equals("playgame")) {
            Game gm=new Game();
                    
                }

                else  if (s.equals("texttospeech")) {
                    System.out.println("Enter text :");
                    String y;
                    y= cin.nextLine();
                            new tos(y);
                        }

                        else  if (s.equals("settimer")) {
                          new timer();
                                    
                                }
                                else  if (s.equals("playmusic")) {
                                   new music();
                                            
                                        }
                                        else  if (s.equals("openlms")) {
                                            new url("openlms");
                                                     
                                                 }

        
       else if (s.equals("exit")) {
        System.out.println("");
            System.out.println(RED+"Have a nice day ..! Bye"+RESET);
            long end = System.currentTimeMillis();
            int diff=(int) ((end-start)/1000);
        //    new tos("Have a nice day ..! Bye");
System.out.println( GREEN+" Your current ScreenTime was recorded to be ::" +YELLOW+diff+" seconds"+RESET);
            System.exit(0);
            
        }
        else{
            System.out.println(RED+"Sorry? Didn't get that."+RESET);
        }
    
    }



}
}
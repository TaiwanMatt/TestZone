import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.experitest.client.Client;

public class Test2 {
	private   String host = "localhost";
    private   int port = 8889;
    private   String projectBaseDirectory = "C:\\Users\\VOD-Testing\\workspace\\project2";
    protected   Client client = null;
    @Before
    public   void setUp(){
        /*client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "C:\\Users\\VOD-Testing\\Desktop\\Report", "Untitled");*/
    }

    @Test
    public   void test1(){
    	
        System.out.println(System.getProperty("output"));
       /* client.setDevice("adb:Olsen");
        client.launch("com.experitest.ExperiBank/.LoginActivity", true, true);
        client.elementSendText("NATIVE", "xpath=//*[@id='usernameTextField']", 0, "company");
	client.sleep(2000);
        client.elementSendText("NATIVE", "xpath=//*[@id='passwordTextField']", 0, "company");
        client.click("NATIVE", "xpath=//*[@id='loginButton']", 0, 1);
        client.sleep(2000);
	client.report("fail", false);
	client.report(client.capture("Capture"), "error", false);
        client.click("NATIVE", "xpath=//*[@id='logoutButton']", 0, 1);*/
    }

    @After
    public   void tearDown(){
        // Generates a report of the test case.
        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
//    	System.out.print(4);
    	
        /*client.generateReport(false);
        // Releases the client so that other clients can approach the agent in the near future. 
        client.releaseClient();*/

    }
}

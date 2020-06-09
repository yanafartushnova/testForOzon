package users;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import setup.Screenshot;

public class TestListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult result){
        Screenshot.makeScreen();
    }
}


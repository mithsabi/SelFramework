package SelPackage;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenersDemo extends TestListenerAdapter {
	  private int m_count = 0;
	 
	  @Override
	  public void onTestFailure(ITestResult tr) {
	    log("Listener found that Test got Failed");
	  }
	 
	  @Override
	  public void onTestSkipped(ITestResult tr) {
	    log("Listener found that Test got Skipped");
	  }
	 
	  @Override
	  public void onTestSuccess(ITestResult tr) {
	    log("Listener found that Test got passed \r\n");
	  }
	 
	  private void log(String string) {
	    System.out.print(string);
	    if (++m_count % 40 == 0) {
	      System.out.println("");
	    }
	  }
	}


// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.status;

import java.io.PrintStream;

// Referenced classes of package ch.qos.logback.core.status:
//			OnPrintStreamStatusListenerBase, Status

public class OnErrorConsoleStatusListener extends OnPrintStreamStatusListenerBase
{

	public OnErrorConsoleStatusListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void OnPrintStreamStatusListenerBase()>
	//    2    4:return          
	}

	public volatile void addStatusEvent(Status status)
	{
		super.addStatusEvent(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void OnPrintStreamStatusListenerBase.addStatusEvent(Status)>
	//    3    5:return          
	}

	protected PrintStream getPrintStream()
	{
		return System.err;
	//    0    0:getstatic       #21  <Field PrintStream System.err>
	//    1    3:areturn         
	}

	public volatile long getRetrospective()
	{
		return super.getRetrospective();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method long OnPrintStreamStatusListenerBase.getRetrospective()>
	//    2    4:lreturn         
	}

	public volatile boolean isStarted()
	{
		return super.isStarted();
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method boolean OnPrintStreamStatusListenerBase.isStarted()>
	//    2    4:ireturn         
	}

	public volatile void setRetrospective(long l)
	{
		super.setRetrospective(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #33  <Method void OnPrintStreamStatusListenerBase.setRetrospective(long)>
	//    3    5:return          
	}

	public volatile void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void OnPrintStreamStatusListenerBase.start()>
	//    2    4:return          
	}

	public volatile void stop()
	{
		super.stop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void OnPrintStreamStatusListenerBase.stop()>
	//    2    4:return          
	}
}

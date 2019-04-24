// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import java.io.PrintStream;

// Referenced classes of package ch.qos.logback.core.status:
//			OnPrintStreamStatusListenerBase, StatusManager, Status

public class OnConsoleStatusListener extends OnPrintStreamStatusListenerBase
{

	public OnConsoleStatusListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void OnPrintStreamStatusListenerBase()>
	//    2    4:return          
	}

	public static void addNewInstanceToContext(Context context)
	{
		OnConsoleStatusListener onconsolestatuslistener = new OnConsoleStatusListener();
	//    0    0:new             #2   <Class OnConsoleStatusListener>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void OnConsoleStatusListener()>
	//    3    7:astore_1        
		onconsolestatuslistener.setContext(context);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #15  <Method void setContext(Context)>
		if(context.getStatusManager().addUniquely(((StatusListener) (onconsolestatuslistener)), ((Object) (context))))
	//*   7   13:aload_0         
	//*   8   14:invokeinterface #21  <Method StatusManager Context.getStatusManager()>
	//*   9   19:aload_1         
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #27  <Method boolean StatusManager.addUniquely(StatusListener, Object)>
	//*  12   26:ifeq            33
			onconsolestatuslistener.start();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #30  <Method void start()>
	//   15   33:return          
	}

	public volatile void addStatusEvent(Status status)
	{
		super.addStatusEvent(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void OnPrintStreamStatusListenerBase.addStatusEvent(Status)>
	//    3    5:return          
	}

	protected PrintStream getPrintStream()
	{
		return System.out;
	//    0    0:getstatic       #42  <Field PrintStream System.out>
	//    1    3:areturn         
	}

	public volatile long getRetrospective()
	{
		return super.getRetrospective();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method long OnPrintStreamStatusListenerBase.getRetrospective()>
	//    2    4:lreturn         
	}

	public volatile boolean isStarted()
	{
		return super.isStarted();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method boolean OnPrintStreamStatusListenerBase.isStarted()>
	//    2    4:ireturn         
	}

	public volatile void setRetrospective(long l)
	{
		super.setRetrospective(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #54  <Method void OnPrintStreamStatusListenerBase.setRetrospective(long)>
	//    3    5:return          
	}

	public volatile void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void OnPrintStreamStatusListenerBase.start()>
	//    2    4:return          
	}

	public volatile void stop()
	{
		super.stop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void OnPrintStreamStatusListenerBase.stop()>
	//    2    4:return          
	}
}

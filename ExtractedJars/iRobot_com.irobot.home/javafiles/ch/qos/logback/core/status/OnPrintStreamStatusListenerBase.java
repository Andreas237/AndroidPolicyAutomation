// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.StatusPrinter;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.status:
//			StatusListener, StatusManager, Status

abstract class OnPrintStreamStatusListenerBase extends ContextAwareBase
	implements LifeCycle, StatusListener
{

	OnPrintStreamStatusListenerBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ContextAwareBase()>
		isStarted = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean isStarted>
		retrospective = 300L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #11  <Long 300L>
	//    7   13:putfield        #23  <Field long retrospective>
	//    8   16:return          
	}

	private void print(Status status)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void StringBuilder()>
	//    3    7:astore_2        
		StatusPrinter.buildStr(stringbuilder, "", status);
	//    4    8:aload_2         
	//    5    9:ldc1            #31  <String "">
	//    6   11:aload_1         
	//    7   12:invokestatic    #37  <Method void StatusPrinter.buildStr(StringBuilder, String, Status)>
		getPrintStream().print(((Object) (stringbuilder)));
	//    8   15:aload_0         
	//    9   16:invokevirtual   #41  <Method PrintStream getPrintStream()>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #46  <Method void PrintStream.print(Object)>
	//   12   23:return          
	}

	private void retrospectivePrint()
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field Context context>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		long l = System.currentTimeMillis();
	//    4    8:invokestatic    #57  <Method long System.currentTimeMillis()>
	//    5   11:lstore_1        
		Iterator iterator = context.getStatusManager().getCopyOfStatusList().iterator();
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field Context context>
	//    8   16:invokeinterface #63  <Method StatusManager Context.getStatusManager()>
	//    9   21:invokeinterface #69  <Method List StatusManager.getCopyOfStatusList()>
	//   10   26:invokeinterface #75  <Method Iterator List.iterator()>
	//   11   31:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   32:aload_3         
	//   13   33:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//   14   38:ifeq            81
			Status status = (Status)iterator.next();
	//   15   41:aload_3         
	//   16   42:invokeinterface #85  <Method Object Iterator.next()>
	//   17   47:checkcast       #87  <Class Status>
	//   18   50:astore          4
			if(l - status.getDate().longValue() < retrospective)
	//*  19   52:lload_1         
	//*  20   53:aload           4
	//*  21   55:invokeinterface #91  <Method Long Status.getDate()>
	//*  22   60:invokevirtual   #96  <Method long Long.longValue()>
	//*  23   63:lsub            
	//*  24   64:aload_0         
	//*  25   65:getfield        #23  <Field long retrospective>
	//*  26   68:lcmp            
	//*  27   69:ifge            32
				print(status);
	//   28   72:aload_0         
	//   29   73:aload           4
	//   30   75:invokespecial   #98  <Method void print(Status)>
		} while(true);
	//   31   78:goto            32
	//   32   81:return          
	}

	public void addStatusEvent(Status status)
	{
		if(!isStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean isStarted>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			print(status);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #98  <Method void print(Status)>
			return;
	//    7   13:return          
		}
	}

	protected abstract PrintStream getPrintStream();

	public long getRetrospective()
	{
		return retrospective;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long retrospective>
	//    2    4:lreturn         
	}

	public boolean isStarted()
	{
		return isStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field boolean isStarted>
	//    2    4:ireturn         
	}

	public void setRetrospective(long l)
	{
		retrospective = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #23  <Field long retrospective>
	//    3    5:return          
	}

	public void start()
	{
		isStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #21  <Field boolean isStarted>
		if(retrospective > 0L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #23  <Field long retrospective>
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifle            18
			retrospectivePrint();
	//    8   14:aload_0         
	//    9   15:invokespecial   #105 <Method void retrospectivePrint()>
	//   10   18:return          
	}

	public void stop()
	{
		isStarted = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #21  <Field boolean isStarted>
	//    3    5:return          
	}

	static final long DEFAULT_RETROSPECTIVE = 300L;
	boolean isStarted;
	long retrospective;
}

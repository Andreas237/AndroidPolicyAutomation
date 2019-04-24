// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.util.Duration;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package ch.qos.logback.core.sift:
//			Discriminator, AppenderTracker, AppenderFactory

public abstract class SiftingAppenderBase extends AppenderBase
{

	public SiftingAppenderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AppenderBase()>
		timeout = new Duration(0x1b7740L);
	//    2    4:aload_0         
	//    3    5:new             #24  <Class Duration>
	//    4    8:dup             
	//    5    9:ldc2w           #25  <Long 0x1b7740L>
	//    6   12:invokespecial   #29  <Method void Duration(long)>
	//    7   15:putfield        #31  <Field Duration timeout>
		maxAppenderCount = 0x7fffffff;
	//    8   18:aload_0         
	//    9   19:ldc1            #32  <Int 0x7fffffff>
	//   10   21:putfield        #34  <Field int maxAppenderCount>
	//   11   24:return          
	}

	protected void append(Object obj)
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #41  <Method boolean isStarted()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		String s = discriminator.getDiscriminatingValue(obj);
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field Discriminator discriminator>
	//    6   12:aload_1         
	//    7   13:invokeinterface #49  <Method String Discriminator.getDiscriminatingValue(Object)>
	//    8   18:astore          4
		long l = getTimestamp(obj);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:invokevirtual   #53  <Method long getTimestamp(Object)>
	//   12   25:lstore_2        
		Appender appender = (Appender)appenderTracker.getOrCreate(s, l);
	//   13   26:aload_0         
	//   14   27:getfield        #55  <Field AppenderTracker appenderTracker>
	//   15   30:aload           4
	//   16   32:lload_2         
	//   17   33:invokevirtual   #61  <Method Object AppenderTracker.getOrCreate(String, long)>
	//   18   36:checkcast       #63  <Class Appender>
	//   19   39:astore          5
		if(eventMarksEndOfLife(obj))
	//*  20   41:aload_0         
	//*  21   42:aload_1         
	//*  22   43:invokevirtual   #67  <Method boolean eventMarksEndOfLife(Object)>
	//*  23   46:ifeq            58
			appenderTracker.endOfLife(s);
	//   24   49:aload_0         
	//   25   50:getfield        #55  <Field AppenderTracker appenderTracker>
	//   26   53:aload           4
	//   27   55:invokevirtual   #71  <Method void AppenderTracker.endOfLife(String)>
		appenderTracker.removeStaleComponents(l);
	//   28   58:aload_0         
	//   29   59:getfield        #55  <Field AppenderTracker appenderTracker>
	//   30   62:lload_2         
	//   31   63:invokevirtual   #74  <Method void AppenderTracker.removeStaleComponents(long)>
		appender.doAppend(obj);
	//   32   66:aload           5
	//   33   68:aload_1         
	//   34   69:invokeinterface #77  <Method void Appender.doAppend(Object)>
	//   35   74:return          
	}

	protected abstract boolean eventMarksEndOfLife(Object obj);

	public AppenderTracker getAppenderTracker()
	{
		return appenderTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field AppenderTracker appenderTracker>
	//    2    4:areturn         
	}

	public Discriminator getDiscriminator()
	{
		return discriminator;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Discriminator discriminator>
	//    2    4:areturn         
	}

	public String getDiscriminatorKey()
	{
		if(discriminator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Discriminator discriminator>
	//*   2    4:ifnull          17
			return discriminator.getKey();
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field Discriminator discriminator>
	//    5   11:invokeinterface #90  <Method String Discriminator.getKey()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public int getMaxAppenderCount()
	{
		return maxAppenderCount;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int maxAppenderCount>
	//    2    4:ireturn         
	}

	public Duration getTimeout()
	{
		return timeout;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Duration timeout>
	//    2    4:areturn         
	}

	protected abstract long getTimestamp(Object obj);

	public void setAppenderFactory(AppenderFactory appenderfactory)
	{
		appenderFactory = appenderfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field AppenderFactory appenderFactory>
	//    3    5:return          
	}

	public void setDiscriminator(Discriminator discriminator1)
	{
		discriminator = discriminator1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field Discriminator discriminator>
	//    3    5:return          
	}

	public void setMaxAppenderCount(int i)
	{
		maxAppenderCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int maxAppenderCount>
	//    3    5:return          
	}

	public void setTimeout(Duration duration)
	{
		timeout = duration;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field Duration timeout>
	//    3    5:return          
	}

	public void start()
	{
		int i;
		if(discriminator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Discriminator discriminator>
	//*   2    4:ifnonnull       18
		{
			addError("Missing discriminator. Aborting");
	//    3    7:aload_0         
	//    4    8:ldc1            #109 <String "Missing discriminator. Aborting">
	//    5   10:invokevirtual   #112 <Method void addError(String)>
			i = 1;
	//    6   13:iconst_1        
	//    7   14:istore_1        
		} else
	//*   8   15:goto            20
		{
			i = 0;
	//    9   18:iconst_0        
	//   10   19:istore_1        
		}
		int j = i;
	//   11   20:iload_1         
	//   12   21:istore_2        
		if(!discriminator.isStarted())
	//*  13   22:aload_0         
	//*  14   23:getfield        #43  <Field Discriminator discriminator>
	//*  15   26:invokeinterface #113 <Method boolean Discriminator.isStarted()>
	//*  16   31:ifne            44
		{
			addError("Discriminator has not started successfully. Aborting");
	//   17   34:aload_0         
	//   18   35:ldc1            #115 <String "Discriminator has not started successfully. Aborting">
	//   19   37:invokevirtual   #112 <Method void addError(String)>
			j = i + 1;
	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:istore_2        
		}
		if(appenderFactory == null)
	//*  24   44:aload_0         
	//*  25   45:getfield        #98  <Field AppenderFactory appenderFactory>
	//*  26   48:ifnonnull       64
		{
			addError("AppenderFactory has not been set. Aborting");
	//   27   51:aload_0         
	//   28   52:ldc1            #117 <String "AppenderFactory has not been set. Aborting">
	//   29   54:invokevirtual   #112 <Method void addError(String)>
			j++;
	//   30   57:iload_2         
	//   31   58:iconst_1        
	//   32   59:iadd            
	//   33   60:istore_2        
		} else
	//*  34   61:goto            108
		{
			appenderTracker = new AppenderTracker(context, appenderFactory);
	//   35   64:aload_0         
	//   36   65:new             #57  <Class AppenderTracker>
	//   37   68:dup             
	//   38   69:aload_0         
	//   39   70:getfield        #121 <Field ch.qos.logback.core.Context context>
	//   40   73:aload_0         
	//   41   74:getfield        #98  <Field AppenderFactory appenderFactory>
	//   42   77:invokespecial   #124 <Method void AppenderTracker(ch.qos.logback.core.Context, AppenderFactory)>
	//   43   80:putfield        #55  <Field AppenderTracker appenderTracker>
			appenderTracker.setMaxComponents(maxAppenderCount);
	//   44   83:aload_0         
	//   45   84:getfield        #55  <Field AppenderTracker appenderTracker>
	//   46   87:aload_0         
	//   47   88:getfield        #34  <Field int maxAppenderCount>
	//   48   91:invokevirtual   #127 <Method void AppenderTracker.setMaxComponents(int)>
			appenderTracker.setTimeout(timeout.getMilliseconds());
	//   49   94:aload_0         
	//   50   95:getfield        #55  <Field AppenderTracker appenderTracker>
	//   51   98:aload_0         
	//   52   99:getfield        #31  <Field Duration timeout>
	//   53  102:invokevirtual   #131 <Method long Duration.getMilliseconds()>
	//   54  105:invokevirtual   #133 <Method void AppenderTracker.setTimeout(long)>
		}
		if(j == 0)
	//*  55  108:iload_2         
	//*  56  109:ifne            116
			super.start();
	//   57  112:aload_0         
	//   58  113:invokespecial   #135 <Method void AppenderBase.start()>
	//   59  116:return          
	}

	public void stop()
	{
		for(Iterator iterator = appenderTracker.allComponents().iterator(); iterator.hasNext(); ((Appender)iterator.next()).stop());
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field AppenderTracker appenderTracker>
	//    2    4:invokevirtual   #140 <Method Collection AppenderTracker.allComponents()>
	//    3    7:invokeinterface #146 <Method Iterator Collection.iterator()>
	//    4   12:astore_1        
	//    5   13:aload_1         
	//    6   14:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            39
	//    8   22:aload_1         
	//    9   23:invokeinterface #155 <Method Object Iterator.next()>
	//   10   28:checkcast       #63  <Class Appender>
	//   11   31:invokeinterface #157 <Method void Appender.stop()>
	//*  12   36:goto            13
	//   13   39:return          
	}

	AppenderFactory appenderFactory;
	protected AppenderTracker appenderTracker;
	Discriminator discriminator;
	int maxAppenderCount;
	Duration timeout;
}

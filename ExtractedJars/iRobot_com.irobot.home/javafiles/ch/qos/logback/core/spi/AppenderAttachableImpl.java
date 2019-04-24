// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;

import ch.qos.logback.core.Appender;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package ch.qos.logback.core.spi:
//			AppenderAttachable

public class AppenderAttachableImpl
	implements AppenderAttachable
{

	public AppenderAttachableImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class CopyOnWriteArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void CopyOnWriteArrayList()>
	//    6   12:putfield        #31  <Field CopyOnWriteArrayList appenderList>
	//    7   15:return          
	}

	public void addAppender(Appender appender)
	{
		if(appender == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Null argument disallowed");
	//    2    4:new             #35  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #37  <String "Null argument disallowed">
	//    5   10:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			appenderList.addIfAbsent(((Object) (appender)));
	//    7   14:aload_0         
	//    8   15:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #44  <Method boolean CopyOnWriteArrayList.addIfAbsent(Object)>
	//   11   22:pop             
			return;
	//   12   23:return          
		}
	}

	public int appendLoopOnAppenders(Object obj)
	{
		Iterator iterator = appenderList.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//    2    4:invokevirtual   #52  <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_3        
		int i;
		for(i = 0; iterator.hasNext(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:aload_3         
	//*   7   11:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*   8   16:ifeq            41
			((Appender)iterator.next()).doAppend(obj);
	//    9   19:aload_3         
	//   10   20:invokeinterface #62  <Method Object Iterator.next()>
	//   11   25:checkcast       #64  <Class Appender>
	//   12   28:aload_1         
	//   13   29:invokeinterface #68  <Method void Appender.doAppend(Object)>

	//   14   34:iload_2         
	//   15   35:iconst_1        
	//   16   36:iadd            
	//   17   37:istore_2        
	//*  18   38:goto            10
		return i;
	//   19   41:iload_2         
	//   20   42:ireturn         
	}

	public void detachAndStopAllAppenders()
	{
		for(Iterator iterator = appenderList.iterator(); iterator.hasNext(); ((Appender)iterator.next()).stop());
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//    2    4:invokevirtual   #52  <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            34
	//    7   17:aload_1         
	//    8   18:invokeinterface #62  <Method Object Iterator.next()>
	//    9   23:checkcast       #64  <Class Appender>
	//   10   26:invokeinterface #73  <Method void Appender.stop()>
	//*  11   31:goto            8
		appenderList.clear();
	//   12   34:aload_0         
	//   13   35:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//   14   38:invokevirtual   #76  <Method void CopyOnWriteArrayList.clear()>
	//   15   41:return          
	}

	public boolean detachAppender(Appender appender)
	{
		if(appender == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return appenderList.remove(((Object) (appender)));
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #81  <Method boolean CopyOnWriteArrayList.remove(Object)>
	//    8   14:ireturn         
	}

	public boolean detachAppender(String s)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		Iterator iterator = appenderList.iterator();
	//    6    8:aload_0         
	//    7    9:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//    8   12:invokevirtual   #52  <Method Iterator CopyOnWriteArrayList.iterator()>
	//    9   15:astore          4
		boolean flag;
		do
		{
			flag = flag1;
	//   10   17:iload_3         
	//   11   18:istore_2        
			if(!iterator.hasNext())
				break;
	//   12   19:aload           4
	//   13   21:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   14   26:ifeq            65
			Appender appender = (Appender)iterator.next();
	//   15   29:aload           4
	//   16   31:invokeinterface #62  <Method Object Iterator.next()>
	//   17   36:checkcast       #64  <Class Appender>
	//   18   39:astore          5
			if(!s.equals(((Object) (appender.getName()))))
				continue;
	//   19   41:aload_1         
	//   20   42:aload           5
	//   21   44:invokeinterface #87  <Method String Appender.getName()>
	//   22   49:invokevirtual   #92  <Method boolean String.equals(Object)>
	//   23   52:ifeq            17
			flag = appenderList.remove(((Object) (appender)));
	//   24   55:aload_0         
	//   25   56:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//   26   59:aload           5
	//   27   61:invokevirtual   #81  <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   28   64:istore_2        
			break;
		} while(true);
		return flag;
	//   29   65:iload_2         
	//   30   66:ireturn         
	}

	public Appender getAppender(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		for(Iterator iterator = appenderList.iterator(); iterator.hasNext();)
	//*   4    6:aload_0         
	//*   5    7:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//*   6   10:invokevirtual   #52  <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   7   13:astore_2        
	//*   8   14:aload_2         
	//*   9   15:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            48
		{
			Appender appender = (Appender)iterator.next();
	//   11   23:aload_2         
	//   12   24:invokeinterface #62  <Method Object Iterator.next()>
	//   13   29:checkcast       #64  <Class Appender>
	//   14   32:astore_3        
			if(s.equals(((Object) (appender.getName()))))
	//*  15   33:aload_1         
	//*  16   34:aload_3         
	//*  17   35:invokeinterface #87  <Method String Appender.getName()>
	//*  18   40:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  19   43:ifeq            14
				return appender;
	//   20   46:aload_3         
	//   21   47:areturn         
		}

		return null;
	//   22   48:aconst_null     
	//   23   49:areturn         
	}

	public boolean isAttached(Appender appender)
	{
		if(appender == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		for(Iterator iterator = appenderList.iterator(); iterator.hasNext();)
	//*   4    6:aload_0         
	//*   5    7:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//*   6   10:invokevirtual   #52  <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   7   13:astore_2        
	//*   8   14:aload_2         
	//*   9   15:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            38
			if((Appender)iterator.next() == appender)
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #62  <Method Object Iterator.next()>
	//*  13   29:checkcast       #64  <Class Appender>
	//*  14   32:aload_1         
	//*  15   33:if_acmpne       14
				return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         

		return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
	}

	public Iterator iteratorForAppenders()
	{
		return appenderList.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field CopyOnWriteArrayList appenderList>
	//    2    4:invokevirtual   #52  <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:areturn         
	}

	static final long START = System.currentTimeMillis();
	private final CopyOnWriteArrayList appenderList = new CopyOnWriteArrayList();

	static 
	{
	//    0    0:invokestatic    #20  <Method long System.currentTimeMillis()>
	//    1    3:putstatic       #22  <Field long START>
	//*   2    6:return          
	}
}

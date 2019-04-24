// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.spi.LogbackLock;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import java.util.*;

public class BasicStatusManager
	implements StatusManager
{

	public BasicStatusManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		count = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #29  <Field int count>
	//    5    9:aload_0         
	//    6   10:new             #31  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #32  <Method void ArrayList()>
	//    9   17:putfield        #34  <Field List statusList>
	//   10   20:aload_0         
	//   11   21:new             #36  <Class CyclicBuffer>
	//   12   24:dup             
	//   13   25:sipush          150
	//   14   28:invokespecial   #39  <Method void CyclicBuffer(int)>
	//   15   31:putfield        #41  <Field CyclicBuffer tailBuffer>
	//   16   34:aload_0         
	//   17   35:new             #43  <Class LogbackLock>
	//   18   38:dup             
	//   19   39:invokespecial   #44  <Method void LogbackLock()>
	//   20   42:putfield        #46  <Field LogbackLock statusListLock>
		level = 0;
	//   21   45:aload_0         
	//   22   46:iconst_0        
	//   23   47:putfield        #48  <Field int level>
	//   24   50:aload_0         
	//   25   51:new             #31  <Class ArrayList>
	//   26   54:dup             
	//   27   55:invokespecial   #32  <Method void ArrayList()>
	//   28   58:putfield        #50  <Field List statusListenerList>
	//   29   61:aload_0         
	//   30   62:new             #43  <Class LogbackLock>
	//   31   65:dup             
	//   32   66:invokespecial   #44  <Method void LogbackLock()>
	//   33   69:putfield        #52  <Field LogbackLock statusListenerListLock>
	//   34   72:return          
	}

	private void fireStatusAddEvent(Status status)
	{
		LogbackLock logbacklock = statusListenerListLock;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field LogbackLock statusListenerListLock>
	//    2    4:astore_2        
		logbacklock;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		for(Iterator iterator = statusListenerList.iterator(); iterator.hasNext(); ((StatusListener)iterator.next()).addStatusEvent(status));
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field List statusListenerList>
	//    7   11:invokeinterface #61  <Method Iterator List.iterator()>
	//    8   16:astore_3        
	//    9   17:aload_3         
	//   10   18:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            44
	//   12   26:aload_3         
	//   13   27:invokeinterface #71  <Method Object Iterator.next()>
	//   14   32:checkcast       #73  <Class StatusListener>
	//   15   35:aload_1         
	//   16   36:invokeinterface #76  <Method void StatusListener.addStatusEvent(Status)>
	//*  17   41:goto            17
		logbacklock;
	//   18   44:aload_2         
		JVM INSTR monitorexit ;
	//   19   45:monitorexit     
		return;
	//   20   46:return          
		status;
	//   21   47:astore_1        
		logbacklock;
	//   22   48:aload_2         
		JVM INSTR monitorexit ;
	//   23   49:monitorexit     
		throw status;
	//   24   50:aload_1         
	//   25   51:athrow          
	}

	public void add(Status status)
	{
		fireStatusAddEvent(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void fireStatusAddEvent(Status)>
		count = count + 1;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field int count>
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:putfield        #29  <Field int count>
		if(status.getLevel() > level)
	//*   9   15:aload_1         
	//*  10   16:invokeinterface #85  <Method int Status.getLevel()>
	//*  11   21:aload_0         
	//*  12   22:getfield        #48  <Field int level>
	//*  13   25:icmple          38
			level = status.getLevel();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokeinterface #85  <Method int Status.getLevel()>
	//   17   35:putfield        #48  <Field int level>
		LogbackLock logbacklock = statusListLock;
	//   18   38:aload_0         
	//   19   39:getfield        #46  <Field LogbackLock statusListLock>
	//   20   42:astore_2        
		logbacklock;
	//   21   43:aload_2         
		JVM INSTR monitorenter ;
	//   22   44:monitorenter    
		if(statusList.size() < 150)
	//*  23   45:aload_0         
	//*  24   46:getfield        #34  <Field List statusList>
	//*  25   49:invokeinterface #88  <Method int List.size()>
	//*  26   54:sipush          150
	//*  27   57:icmpge          74
		{
			statusList.add(((Object) (status)));
	//   28   60:aload_0         
	//   29   61:getfield        #34  <Field List statusList>
	//   30   64:aload_1         
	//   31   65:invokeinterface #91  <Method boolean List.add(Object)>
	//   32   70:pop             
			break MISSING_BLOCK_LABEL_82;
	//   33   71:goto            82
		}
		tailBuffer.add(((Object) (status)));
	//   34   74:aload_0         
	//   35   75:getfield        #41  <Field CyclicBuffer tailBuffer>
	//   36   78:aload_1         
	//   37   79:invokevirtual   #94  <Method void CyclicBuffer.add(Object)>
		logbacklock;
	//   38   82:aload_2         
		JVM INSTR monitorexit ;
	//   39   83:monitorexit     
		return;
	//   40   84:return          
		status;
	//   41   85:astore_1        
		logbacklock;
	//   42   86:aload_2         
		JVM INSTR monitorexit ;
	//   43   87:monitorexit     
		throw status;
	//   44   88:aload_1         
	//   45   89:athrow          
	}

	public void add(StatusListener statuslistener)
	{
		synchronized(statusListenerListLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field LogbackLock statusListenerListLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			statusListenerList.add(((Object) (statuslistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field List statusListenerList>
	//    7   11:aload_1         
	//    8   12:invokeinterface #91  <Method boolean List.add(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		statuslistener;
	//   13   21:astore_1        
		logbacklock;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw statuslistener;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public boolean addUniquely(StatusListener statuslistener, Object obj)
	{
		for(Iterator iterator = getCopyOfStatusListenerList().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #101 <Method List getCopyOfStatusListenerList()>
	//*   2    4:invokeinterface #61  <Method Iterator List.iterator()>
	//*   3    9:astore          4
	//*   4   11:aload           4
	//*   5   13:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            92
		{
			StatusListener statuslistener1 = (StatusListener)iterator.next();
	//    7   21:aload           4
	//    8   23:invokeinterface #71  <Method Object Iterator.next()>
	//    9   28:checkcast       #73  <Class StatusListener>
	//   10   31:astore_3        
			if(((Object) (statuslistener1)).getClass().isInstance(((Object) (statuslistener))))
	//*  11   32:aload_3         
	//*  12   33:invokevirtual   #105 <Method Class Object.getClass()>
	//*  13   36:aload_1         
	//*  14   37:invokevirtual   #110 <Method boolean Class.isInstance(Object)>
	//*  15   40:ifeq            11
			{
				statuslistener = ((StatusListener) (new StringBuilder()));
	//   16   43:new             #112 <Class StringBuilder>
	//   17   46:dup             
	//   18   47:invokespecial   #113 <Method void StringBuilder()>
	//   19   50:astore_1        
				((StringBuilder) (statuslistener)).append("A previous listener of type [");
	//   20   51:aload_1         
	//   21   52:ldc1            #115 <String "A previous listener of type [">
	//   22   54:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   23   57:pop             
				((StringBuilder) (statuslistener)).append(((Object) (((Object) (statuslistener1)).getClass())));
	//   24   58:aload_1         
	//   25   59:aload_3         
	//   26   60:invokevirtual   #105 <Method Class Object.getClass()>
	//   27   63:invokevirtual   #122 <Method StringBuilder StringBuilder.append(Object)>
	//   28   66:pop             
				((StringBuilder) (statuslistener)).append("] has been already registered. Skipping double registration.");
	//   29   67:aload_1         
	//   30   68:ldc1            #124 <String "] has been already registered. Skipping double registration.">
	//   31   70:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   32   73:pop             
				add(((Status) (new WarnStatus(((StringBuilder) (statuslistener)).toString(), obj))));
	//   33   74:aload_0         
	//   34   75:new             #126 <Class WarnStatus>
	//   35   78:dup             
	//   36   79:aload_1         
	//   37   80:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   38   83:aload_2         
	//   39   84:invokespecial   #133 <Method void WarnStatus(String, Object)>
	//   40   87:invokevirtual   #135 <Method void add(Status)>
				return false;
	//   41   90:iconst_0        
	//   42   91:ireturn         
			}
		}

		add(statuslistener);
	//   43   92:aload_0         
	//   44   93:aload_1         
	//   45   94:invokevirtual   #137 <Method void add(StatusListener)>
		return true;
	//   46   97:iconst_1        
	//   47   98:ireturn         
	}

	public void clear()
	{
		synchronized(statusListLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field LogbackLock statusListLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			count = 0;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #29  <Field int count>
			statusList.clear();
	//    8   12:aload_0         
	//    9   13:getfield        #34  <Field List statusList>
	//   10   16:invokeinterface #140 <Method void List.clear()>
			tailBuffer.clear();
	//   11   21:aload_0         
	//   12   22:getfield        #41  <Field CyclicBuffer tailBuffer>
	//   13   25:invokevirtual   #141 <Method void CyclicBuffer.clear()>
		}
	//   14   28:aload_1         
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		exception;
	//   17   31:astore_2        
		logbacklock;
	//   18   32:aload_1         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw exception;
	//   20   34:aload_2         
	//   21   35:athrow          
	}

	public List getCopyOfStatusList()
	{
		ArrayList arraylist;
		synchronized(statusListLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field LogbackLock statusListLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			arraylist = new ArrayList(((java.util.Collection) (statusList)));
	//    5    7:new             #31  <Class ArrayList>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #34  <Field List statusList>
	//    9   15:invokespecial   #145 <Method void ArrayList(java.util.Collection)>
	//   10   18:astore_2        
			((List) (arraylist)).addAll(((java.util.Collection) (tailBuffer.asList())));
	//   11   19:aload_2         
	//   12   20:aload_0         
	//   13   21:getfield        #41  <Field CyclicBuffer tailBuffer>
	//   14   24:invokevirtual   #148 <Method List CyclicBuffer.asList()>
	//   15   27:invokeinterface #152 <Method boolean List.addAll(java.util.Collection)>
	//   16   32:pop             
		}
	//   17   33:aload_1         
	//   18   34:monitorexit     
		return ((List) (arraylist));
	//   19   35:aload_2         
	//   20   36:areturn         
		exception;
	//   21   37:astore_2        
		logbacklock;
	//   22   38:aload_1         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		throw exception;
	//   24   40:aload_2         
	//   25   41:athrow          
	}

	public List getCopyOfStatusListenerList()
	{
		ArrayList arraylist;
		synchronized(statusListenerListLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field LogbackLock statusListenerListLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			arraylist = new ArrayList(((java.util.Collection) (statusListenerList)));
	//    5    7:new             #31  <Class ArrayList>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #50  <Field List statusListenerList>
	//    9   15:invokespecial   #145 <Method void ArrayList(java.util.Collection)>
	//   10   18:astore_2        
		}
	//   11   19:aload_1         
	//   12   20:monitorexit     
		return ((List) (arraylist));
	//   13   21:aload_2         
	//   14   22:areturn         
		exception;
	//   15   23:astore_2        
		logbacklock;
	//   16   24:aload_1         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		throw exception;
	//   18   26:aload_2         
	//   19   27:athrow          
	}

	public int getCount()
	{
		return count;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int count>
	//    2    4:ireturn         
	}

	public int getLevel()
	{
		return level;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int level>
	//    2    4:ireturn         
	}

	public void remove(StatusListener statuslistener)
	{
		synchronized(statusListenerListLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field LogbackLock statusListenerListLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			statusListenerList.remove(((Object) (statuslistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field List statusListenerList>
	//    7   11:aload_1         
	//    8   12:invokeinterface #159 <Method boolean List.remove(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		statuslistener;
	//   13   21:astore_1        
		logbacklock;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw statuslistener;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public static final int MAX_HEADER_COUNT = 150;
	public static final int TAIL_SIZE = 150;
	int count;
	int level;
	protected final List statusList = new ArrayList();
	protected final LogbackLock statusListLock = new LogbackLock();
	protected final List statusListenerList = new ArrayList();
	protected final LogbackLock statusListenerListLock = new LogbackLock();
	protected final CyclicBuffer tailBuffer = new CyclicBuffer(150);
}

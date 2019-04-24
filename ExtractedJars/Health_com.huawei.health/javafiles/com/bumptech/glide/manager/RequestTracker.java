// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;
import java.util.*;

public class RequestTracker
{

	public RequestTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void WeakHashMap()>
	//    6   12:invokestatic    #25  <Method Set Collections.newSetFromMap(java.util.Map)>
	//    7   15:putfield        #27  <Field Set requests>
	//    8   18:aload_0         
	//    9   19:new             #29  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #30  <Method void ArrayList()>
	//   12   26:putfield        #32  <Field List pendingRequests>
	//   13   29:return          
	}

	void addRequest(Request request)
	{
		requests.add(((Object) (request)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Set requests>
	//    2    4:aload_1         
	//    3    5:invokeinterface #41  <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public boolean clearRemoveAndRecycle(Request request)
	{
		if(request == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		boolean flag = requests.remove(((Object) (request)));
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field Set requests>
	//    6   10:aload_1         
	//    7   11:invokeinterface #46  <Method boolean Set.remove(Object)>
	//    8   16:istore_2        
		if(pendingRequests.remove(((Object) (request))) || flag)
	//*   9   17:aload_0         
	//*  10   18:getfield        #32  <Field List pendingRequests>
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #49  <Method boolean List.remove(Object)>
	//*  13   27:ifne            34
	//*  14   30:iload_2         
	//*  15   31:ifeq            39
			flag = true;
	//   16   34:iconst_1        
	//   17   35:istore_2        
		else
	//*  18   36:goto            41
			flag = false;
	//   19   39:iconst_0        
	//   20   40:istore_2        
		if(flag)
	//*  21   41:iload_2         
	//*  22   42:ifeq            57
		{
			request.clear();
	//   23   45:aload_1         
	//   24   46:invokeinterface #54  <Method void Request.clear()>
			request.recycle();
	//   25   51:aload_1         
	//   26   52:invokeinterface #57  <Method void Request.recycle()>
		}
		return flag;
	//   27   57:iload_2         
	//   28   58:ireturn         
	}

	public void clearRequests()
	{
		for(Iterator iterator = Util.getSnapshot(((java.util.Collection) (requests))).iterator(); iterator.hasNext(); clearRemoveAndRecycle((Request)iterator.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Set requests>
	//    2    4:invokestatic    #64  <Method List Util.getSnapshot(java.util.Collection)>
	//    3    7:invokeinterface #68  <Method Iterator List.iterator()>
	//    4   12:astore_1        
	//    5   13:aload_1         
	//    6   14:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            39
	//    8   22:aload_0         
	//    9   23:aload_1         
	//   10   24:invokeinterface #78  <Method Object Iterator.next()>
	//   11   29:checkcast       #51  <Class Request>
	//   12   32:invokevirtual   #80  <Method boolean clearRemoveAndRecycle(Request)>
	//   13   35:pop             
	//*  14   36:goto            13
		pendingRequests.clear();
	//   15   39:aload_0         
	//   16   40:getfield        #32  <Field List pendingRequests>
	//   17   43:invokeinterface #81  <Method void List.clear()>
	//   18   48:return          
	}

	public boolean isPaused()
	{
		return isPaused;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean isPaused>
	//    2    4:ireturn         
	}

	public void pauseRequests()
	{
		isPaused = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #83  <Field boolean isPaused>
		Iterator iterator = Util.getSnapshot(((java.util.Collection) (requests))).iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field Set requests>
	//    5    9:invokestatic    #64  <Method List Util.getSnapshot(java.util.Collection)>
	//    6   12:invokeinterface #68  <Method Iterator List.iterator()>
	//    7   17:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_1         
	//    9   19:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            66
			Request request = (Request)iterator.next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #78  <Method Object Iterator.next()>
	//   13   33:checkcast       #51  <Class Request>
	//   14   36:astore_2        
			if(request.isRunning())
	//*  15   37:aload_2         
	//*  16   38:invokeinterface #87  <Method boolean Request.isRunning()>
	//*  17   43:ifeq            63
			{
				request.pause();
	//   18   46:aload_2         
	//   19   47:invokeinterface #90  <Method void Request.pause()>
				pendingRequests.add(((Object) (request)));
	//   20   52:aload_0         
	//   21   53:getfield        #32  <Field List pendingRequests>
	//   22   56:aload_2         
	//   23   57:invokeinterface #91  <Method boolean List.add(Object)>
	//   24   62:pop             
			}
		} while(true);
	//   25   63:goto            18
	//   26   66:return          
	}

	public void restartRequests()
	{
		Iterator iterator = Util.getSnapshot(((java.util.Collection) (requests))).iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Set requests>
	//    2    4:invokestatic    #64  <Method List Util.getSnapshot(java.util.Collection)>
	//    3    7:invokeinterface #68  <Method Iterator List.iterator()>
	//    4   12:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   13:aload_1         
	//    6   14:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            86
			Request request = (Request)iterator.next();
	//    8   22:aload_1         
	//    9   23:invokeinterface #78  <Method Object Iterator.next()>
	//   10   28:checkcast       #51  <Class Request>
	//   11   31:astore_2        
			if(!request.isComplete() && !request.isCancelled())
	//*  12   32:aload_2         
	//*  13   33:invokeinterface #95  <Method boolean Request.isComplete()>
	//*  14   38:ifne            83
	//*  15   41:aload_2         
	//*  16   42:invokeinterface #98  <Method boolean Request.isCancelled()>
	//*  17   47:ifne            83
			{
				request.pause();
	//   18   50:aload_2         
	//   19   51:invokeinterface #90  <Method void Request.pause()>
				if(!isPaused)
	//*  20   56:aload_0         
	//*  21   57:getfield        #83  <Field boolean isPaused>
	//*  22   60:ifne            72
					request.begin();
	//   23   63:aload_2         
	//   24   64:invokeinterface #101 <Method void Request.begin()>
				else
	//*  25   69:goto            83
					pendingRequests.add(((Object) (request)));
	//   26   72:aload_0         
	//   27   73:getfield        #32  <Field List pendingRequests>
	//   28   76:aload_2         
	//   29   77:invokeinterface #91  <Method boolean List.add(Object)>
	//   30   82:pop             
			}
		} while(true);
	//   31   83:goto            13
	//   32   86:return          
	}

	public void resumeRequests()
	{
		isPaused = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #83  <Field boolean isPaused>
		Iterator iterator = Util.getSnapshot(((java.util.Collection) (requests))).iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field Set requests>
	//    5    9:invokestatic    #64  <Method List Util.getSnapshot(java.util.Collection)>
	//    6   12:invokeinterface #68  <Method Iterator List.iterator()>
	//    7   17:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_1         
	//    9   19:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            73
			Request request = (Request)iterator.next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #78  <Method Object Iterator.next()>
	//   13   33:checkcast       #51  <Class Request>
	//   14   36:astore_2        
			if(!request.isComplete() && !request.isCancelled() && !request.isRunning())
	//*  15   37:aload_2         
	//*  16   38:invokeinterface #95  <Method boolean Request.isComplete()>
	//*  17   43:ifne            70
	//*  18   46:aload_2         
	//*  19   47:invokeinterface #98  <Method boolean Request.isCancelled()>
	//*  20   52:ifne            70
	//*  21   55:aload_2         
	//*  22   56:invokeinterface #87  <Method boolean Request.isRunning()>
	//*  23   61:ifne            70
				request.begin();
	//   24   64:aload_2         
	//   25   65:invokeinterface #101 <Method void Request.begin()>
		} while(true);
	//   26   70:goto            18
		pendingRequests.clear();
	//   27   73:aload_0         
	//   28   74:getfield        #32  <Field List pendingRequests>
	//   29   77:invokeinterface #81  <Method void List.clear()>
	//   30   82:return          
	}

	public void runRequest(Request request)
	{
		requests.add(((Object) (request)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Set requests>
	//    2    4:aload_1         
	//    3    5:invokeinterface #41  <Method boolean Set.add(Object)>
	//    4   10:pop             
		if(!isPaused)
	//*   5   11:aload_0         
	//*   6   12:getfield        #83  <Field boolean isPaused>
	//*   7   15:ifne            25
		{
			request.begin();
	//    8   18:aload_1         
	//    9   19:invokeinterface #101 <Method void Request.begin()>
			return;
	//   10   24:return          
		} else
		{
			pendingRequests.add(((Object) (request)));
	//   11   25:aload_0         
	//   12   26:getfield        #32  <Field List pendingRequests>
	//   13   29:aload_1         
	//   14   30:invokeinterface #91  <Method boolean List.add(Object)>
	//   15   35:pop             
			return;
	//   16   36:return          
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append(super.toString()).append("{numRequests=").append(requests.size()).append(", isPaused=").append(isPaused).append("}").toString();
	//    0    0:new             #107 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #110 <Method String Object.toString()>
	//    5   11:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #116 <String "{numRequests=">
	//    7   16:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #27  <Field Set requests>
	//   10   23:invokeinterface #120 <Method int Set.size()>
	//   11   28:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   12   31:ldc1            #125 <String ", isPaused=">
	//   13   33:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   14   36:aload_0         
	//   15   37:getfield        #83  <Field boolean isPaused>
	//   16   40:invokevirtual   #128 <Method StringBuilder StringBuilder.append(boolean)>
	//   17   43:ldc1            #130 <String "}">
	//   18   45:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   19   48:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   20   51:areturn         
	}

	private boolean isPaused;
	private final List pendingRequests = new ArrayList();
	private final Set requests = Collections.newSetFromMap(((java.util.Map) (new WeakHashMap())));
}

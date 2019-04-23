// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;
import java.util.*;

public class RequestTracker
{

	public RequestTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void WeakHashMap()>
	//    6   12:invokestatic    #29  <Method Set Collections.newSetFromMap(java.util.Map)>
	//    7   15:putfield        #31  <Field Set requests>
	//    8   18:aload_0         
	//    9   19:new             #33  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #34  <Method void ArrayList()>
	//   12   26:putfield        #36  <Field List pendingRequests>
	//   13   29:return          
	}

	private boolean clearRemoveAndMaybeRecycle(Request request, boolean flag)
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(request == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       9
			return true;
	//    4    7:iconst_1        
	//    5    8:ireturn         
		boolean flag3 = requests.remove(((Object) (request)));
	//    6    9:aload_0         
	//    7   10:getfield        #31  <Field Set requests>
	//    8   13:aload_1         
	//    9   14:invokeinterface #46  <Method boolean Set.remove(Object)>
	//   10   19:istore          5
		boolean flag1 = flag2;
	//   11   21:iload           4
	//   12   23:istore_3        
		if(!pendingRequests.remove(((Object) (request))))
	//*  13   24:aload_0         
	//*  14   25:getfield        #36  <Field List pendingRequests>
	//*  15   28:aload_1         
	//*  16   29:invokeinterface #49  <Method boolean List.remove(Object)>
	//*  17   34:ifne            50
			if(flag3)
	//*  18   37:iload           5
	//*  19   39:ifeq            48
				flag1 = flag2;
	//   20   42:iload           4
	//   21   44:istore_3        
			else
	//*  22   45:goto            50
				flag1 = false;
	//   23   48:iconst_0        
	//   24   49:istore_3        
		if(flag1)
	//*  25   50:iload_3         
	//*  26   51:ifeq            70
		{
			request.clear();
	//   27   54:aload_1         
	//   28   55:invokeinterface #54  <Method void Request.clear()>
			if(flag)
	//*  29   60:iload_2         
	//*  30   61:ifeq            70
				request.recycle();
	//   31   64:aload_1         
	//   32   65:invokeinterface #57  <Method void Request.recycle()>
		}
		return flag1;
	//   33   70:iload_3         
	//   34   71:ireturn         
	}

	void addRequest(Request request)
	{
		requests.add(((Object) (request)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Set requests>
	//    2    4:aload_1         
	//    3    5:invokeinterface #64  <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public boolean clearRemoveAndRecycle(Request request)
	{
		return clearRemoveAndMaybeRecycle(request, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #69  <Method boolean clearRemoveAndMaybeRecycle(Request, boolean)>
	//    4    6:ireturn         
	}

	public void clearRequests()
	{
		for(Iterator iterator = Util.getSnapshot(((java.util.Collection) (requests))).iterator(); iterator.hasNext(); clearRemoveAndMaybeRecycle((Request)iterator.next(), false));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Set requests>
	//    2    4:invokestatic    #76  <Method List Util.getSnapshot(java.util.Collection)>
	//    3    7:invokeinterface #80  <Method Iterator List.iterator()>
	//    4   12:astore_1        
	//    5   13:aload_1         
	//    6   14:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            40
	//    8   22:aload_0         
	//    9   23:aload_1         
	//   10   24:invokeinterface #90  <Method Object Iterator.next()>
	//   11   29:checkcast       #51  <Class Request>
	//   12   32:iconst_0        
	//   13   33:invokespecial   #69  <Method boolean clearRemoveAndMaybeRecycle(Request, boolean)>
	//   14   36:pop             
	//*  15   37:goto            13
		pendingRequests.clear();
	//   16   40:aload_0         
	//   17   41:getfield        #36  <Field List pendingRequests>
	//   18   44:invokeinterface #91  <Method void List.clear()>
	//   19   49:return          
	}

	public boolean isPaused()
	{
		return isPaused;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field boolean isPaused>
	//    2    4:ireturn         
	}

	public void pauseAllRequests()
	{
		isPaused = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #93  <Field boolean isPaused>
		Iterator iterator = Util.getSnapshot(((java.util.Collection) (requests))).iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field Set requests>
	//    5    9:invokestatic    #76  <Method List Util.getSnapshot(java.util.Collection)>
	//    6   12:invokeinterface #80  <Method Iterator List.iterator()>
	//    7   17:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_1         
	//    9   19:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            75
			Request request = (Request)iterator.next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #90  <Method Object Iterator.next()>
	//   13   33:checkcast       #51  <Class Request>
	//   14   36:astore_2        
			if(request.isRunning() || request.isComplete())
	//*  15   37:aload_2         
	//*  16   38:invokeinterface #97  <Method boolean Request.isRunning()>
	//*  17   43:ifne            55
	//*  18   46:aload_2         
	//*  19   47:invokeinterface #100 <Method boolean Request.isComplete()>
	//*  20   52:ifeq            18
			{
				request.clear();
	//   21   55:aload_2         
	//   22   56:invokeinterface #54  <Method void Request.clear()>
				pendingRequests.add(((Object) (request)));
	//   23   61:aload_0         
	//   24   62:getfield        #36  <Field List pendingRequests>
	//   25   65:aload_2         
	//   26   66:invokeinterface #101 <Method boolean List.add(Object)>
	//   27   71:pop             
			}
		} while(true);
	//   28   72:goto            18
	//   29   75:return          
	}

	public void pauseRequests()
	{
		isPaused = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #93  <Field boolean isPaused>
		Iterator iterator = Util.getSnapshot(((java.util.Collection) (requests))).iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field Set requests>
	//    5    9:invokestatic    #76  <Method List Util.getSnapshot(java.util.Collection)>
	//    6   12:invokeinterface #80  <Method Iterator List.iterator()>
	//    7   17:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_1         
	//    9   19:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            66
			Request request = (Request)iterator.next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #90  <Method Object Iterator.next()>
	//   13   33:checkcast       #51  <Class Request>
	//   14   36:astore_2        
			if(request.isRunning())
	//*  15   37:aload_2         
	//*  16   38:invokeinterface #97  <Method boolean Request.isRunning()>
	//*  17   43:ifeq            18
			{
				request.clear();
	//   18   46:aload_2         
	//   19   47:invokeinterface #54  <Method void Request.clear()>
				pendingRequests.add(((Object) (request)));
	//   20   52:aload_0         
	//   21   53:getfield        #36  <Field List pendingRequests>
	//   22   56:aload_2         
	//   23   57:invokeinterface #101 <Method boolean List.add(Object)>
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
	//    1    1:getfield        #31  <Field Set requests>
	//    2    4:invokestatic    #76  <Method List Util.getSnapshot(java.util.Collection)>
	//    3    7:invokeinterface #80  <Method Iterator List.iterator()>
	//    4   12:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   13:aload_1         
	//    6   14:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            86
			Request request = (Request)iterator.next();
	//    8   22:aload_1         
	//    9   23:invokeinterface #90  <Method Object Iterator.next()>
	//   10   28:checkcast       #51  <Class Request>
	//   11   31:astore_2        
			if(!request.isComplete() && !request.isCleared())
	//*  12   32:aload_2         
	//*  13   33:invokeinterface #100 <Method boolean Request.isComplete()>
	//*  14   38:ifne            13
	//*  15   41:aload_2         
	//*  16   42:invokeinterface #106 <Method boolean Request.isCleared()>
	//*  17   47:ifne            13
			{
				request.clear();
	//   18   50:aload_2         
	//   19   51:invokeinterface #54  <Method void Request.clear()>
				if(!isPaused)
	//*  20   56:aload_0         
	//*  21   57:getfield        #93  <Field boolean isPaused>
	//*  22   60:ifne            72
					request.begin();
	//   23   63:aload_2         
	//   24   64:invokeinterface #109 <Method void Request.begin()>
				else
	//*  25   69:goto            13
					pendingRequests.add(((Object) (request)));
	//   26   72:aload_0         
	//   27   73:getfield        #36  <Field List pendingRequests>
	//   28   76:aload_2         
	//   29   77:invokeinterface #101 <Method boolean List.add(Object)>
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
	//    2    2:putfield        #93  <Field boolean isPaused>
		Iterator iterator = Util.getSnapshot(((java.util.Collection) (requests))).iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field Set requests>
	//    5    9:invokestatic    #76  <Method List Util.getSnapshot(java.util.Collection)>
	//    6   12:invokeinterface #80  <Method Iterator List.iterator()>
	//    7   17:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_1         
	//    9   19:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            64
			Request request = (Request)iterator.next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #90  <Method Object Iterator.next()>
	//   13   33:checkcast       #51  <Class Request>
	//   14   36:astore_2        
			if(!request.isComplete() && !request.isRunning())
	//*  15   37:aload_2         
	//*  16   38:invokeinterface #100 <Method boolean Request.isComplete()>
	//*  17   43:ifne            18
	//*  18   46:aload_2         
	//*  19   47:invokeinterface #97  <Method boolean Request.isRunning()>
	//*  20   52:ifne            18
				request.begin();
	//   21   55:aload_2         
	//   22   56:invokeinterface #109 <Method void Request.begin()>
		} while(true);
	//   23   61:goto            18
		pendingRequests.clear();
	//   24   64:aload_0         
	//   25   65:getfield        #36  <Field List pendingRequests>
	//   26   68:invokeinterface #91  <Method void List.clear()>
	//   27   73:return          
	}

	public void runRequest(Request request)
	{
		requests.add(((Object) (request)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Set requests>
	//    2    4:aload_1         
	//    3    5:invokeinterface #64  <Method boolean Set.add(Object)>
	//    4   10:pop             
		if(!isPaused)
	//*   5   11:aload_0         
	//*   6   12:getfield        #93  <Field boolean isPaused>
	//*   7   15:ifne            25
		{
			request.begin();
	//    8   18:aload_1         
	//    9   19:invokeinterface #109 <Method void Request.begin()>
			return;
	//   10   24:return          
		}
		request.clear();
	//   11   25:aload_1         
	//   12   26:invokeinterface #54  <Method void Request.clear()>
		if(Log.isLoggable("RequestTracker", 2))
	//*  13   31:ldc1            #8   <String "RequestTracker">
	//*  14   33:iconst_2        
	//*  15   34:invokestatic    #118 <Method boolean Log.isLoggable(String, int)>
	//*  16   37:ifeq            48
			Log.v("RequestTracker", "Paused, delaying request");
	//   17   40:ldc1            #8   <String "RequestTracker">
	//   18   42:ldc1            #120 <String "Paused, delaying request">
	//   19   44:invokestatic    #124 <Method int Log.v(String, String)>
	//   20   47:pop             
		pendingRequests.add(((Object) (request)));
	//   21   48:aload_0         
	//   22   49:getfield        #36  <Field List pendingRequests>
	//   23   52:aload_1         
	//   24   53:invokeinterface #101 <Method boolean List.add(Object)>
	//   25   58:pop             
	//   26   59:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #128 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #129 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(super.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokespecial   #131 <Method String Object.toString()>
	//    7   13:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("{numRequests=");
	//    9   17:aload_1         
	//   10   18:ldc1            #137 <String "{numRequests=">
	//   11   20:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(requests.size());
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #31  <Field Set requests>
	//   16   29:invokeinterface #141 <Method int Set.size()>
	//   17   34:invokevirtual   #144 <Method StringBuilder StringBuilder.append(int)>
	//   18   37:pop             
		stringbuilder.append(", isPaused=");
	//   19   38:aload_1         
	//   20   39:ldc1            #146 <String ", isPaused=">
	//   21   41:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		stringbuilder.append(isPaused);
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #93  <Field boolean isPaused>
	//   26   50:invokevirtual   #149 <Method StringBuilder StringBuilder.append(boolean)>
	//   27   53:pop             
		stringbuilder.append("}");
	//   28   54:aload_1         
	//   29   55:ldc1            #151 <String "}">
	//   30   57:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		return stringbuilder.toString();
	//   32   61:aload_1         
	//   33   62:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   34   65:areturn         
	}

	private static final String TAG = "RequestTracker";
	private boolean isPaused;
	private final List pendingRequests = new ArrayList();
	private final Set requests = Collections.newSetFromMap(((java.util.Map) (new WeakHashMap())));
}

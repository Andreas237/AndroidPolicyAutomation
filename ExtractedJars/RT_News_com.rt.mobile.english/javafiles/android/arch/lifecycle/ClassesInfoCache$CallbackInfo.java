// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.util.*;

// Referenced classes of package android.arch.lifecycle:
//			ClassesInfoCache, LifecycleOwner

static class ClassesInfoCache$CallbackInfo
{

	private static void invokeMethodsForEvent(List list, LifecycleOwner lifecycleowner, Lifecycle.Event event, Object obj)
	{
		if(list != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          45
		{
			for(int i = list.size() - 1; i >= 0; i--)
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #82  <Method int List.size()>
	//*   4   10:iconst_1        
	//*   5   11:isub            
	//*   6   12:istore          4
	//*   7   14:iload           4
	//*   8   16:iflt            45
				((ce)list.get(i)).invokeCallback(lifecycleowner, event, obj);
	//    9   19:aload_0         
	//   10   20:iload           4
	//   11   22:invokeinterface #85  <Method Object List.get(int)>
	//   12   27:checkcast       #87  <Class ClassesInfoCache$MethodReference>
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:aload_3         
	//   16   33:invokevirtual   #91  <Method void ClassesInfoCache$MethodReference.invokeCallback(LifecycleOwner, Lifecycle$Event, Object)>

	//   17   36:iload           4
	//   18   38:iconst_1        
	//   19   39:isub            
	//   20   40:istore          4
		}
	//*  21   42:goto            14
	//   22   45:return          
	}

	void invokeCallbacks(LifecycleOwner lifecycleowner, Lifecycle.Event event, Object obj)
	{
		invokeMethodsForEvent((List)mEventToHandlers.get(((Object) (event))), lifecycleowner, event, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map mEventToHandlers>
	//    2    4:aload_2         
	//    3    5:invokeinterface #57  <Method Object Map.get(Object)>
	//    4   10:checkcast       #59  <Class List>
	//    5   13:aload_1         
	//    6   14:aload_2         
	//    7   15:aload_3         
	//    8   16:invokestatic    #95  <Method void invokeMethodsForEvent(List, LifecycleOwner, Lifecycle$Event, Object)>
		invokeMethodsForEvent((List)mEventToHandlers.get(((Object) (Lifecycle.Event.ON_ANY))), lifecycleowner, event, obj);
	//    9   19:aload_0         
	//   10   20:getfield        #24  <Field Map mEventToHandlers>
	//   11   23:getstatic       #99  <Field Lifecycle$Event Lifecycle$Event.ON_ANY>
	//   12   26:invokeinterface #57  <Method Object Map.get(Object)>
	//   13   31:checkcast       #59  <Class List>
	//   14   34:aload_1         
	//   15   35:aload_2         
	//   16   36:aload_3         
	//   17   37:invokestatic    #95  <Method void invokeMethodsForEvent(List, LifecycleOwner, Lifecycle$Event, Object)>
	//   18   40:return          
	}

	final Map mEventToHandlers = new HashMap();
	final Map mHandlerToEvent;

	ClassesInfoCache$CallbackInfo(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mHandlerToEvent = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Map mHandlerToEvent>
	//    5    9:aload_0         
	//    6   10:new             #21  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #22  <Method void HashMap()>
	//    9   17:putfield        #24  <Field Map mEventToHandlers>
		java.util.Map.Entry entry;
		for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ((List) (map)).add(entry.getKey()))
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #30  <Method Set Map.entrySet()>
	//*  12   26:invokeinterface #36  <Method Iterator Set.iterator()>
	//*  13   31:astore_3        
	//*  14   32:aload_3         
	//*  15   33:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            123
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   17   41:aload_3         
	//   18   42:invokeinterface #46  <Method Object Iterator.next()>
	//   19   47:checkcast       #48  <Class java.util.Map$Entry>
	//   20   50:astore          4
			Lifecycle.Event event = (Lifecycle.Event)entry.getValue();
	//   21   52:aload           4
	//   22   54:invokeinterface #51  <Method Object java.util.Map$Entry.getValue()>
	//   23   59:checkcast       #53  <Class Lifecycle$Event>
	//   24   62:astore          5
			List list = (List)mEventToHandlers.get(((Object) (event)));
	//   25   64:aload_0         
	//   26   65:getfield        #24  <Field Map mEventToHandlers>
	//   27   68:aload           5
	//   28   70:invokeinterface #57  <Method Object Map.get(Object)>
	//   29   75:checkcast       #59  <Class List>
	//   30   78:astore_2        
			map = ((Map) (list));
	//   31   79:aload_2         
	//   32   80:astore_1        
			if(list == null)
	//*  33   81:aload_2         
	//*  34   82:ifnonnull       106
			{
				map = ((Map) (new ArrayList()));
	//   35   85:new             #61  <Class ArrayList>
	//   36   88:dup             
	//   37   89:invokespecial   #62  <Method void ArrayList()>
	//   38   92:astore_1        
				mEventToHandlers.put(((Object) (event)), ((Object) (map)));
	//   39   93:aload_0         
	//   40   94:getfield        #24  <Field Map mEventToHandlers>
	//   41   97:aload           5
	//   42   99:aload_1         
	//   43  100:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//   44  105:pop             
			}
		}

	//   45  106:aload_1         
	//   46  107:aload           4
	//   47  109:invokeinterface #69  <Method Object java.util.Map$Entry.getKey()>
	//   48  114:invokeinterface #73  <Method boolean List.add(Object)>
	//   49  119:pop             
	//*  50  120:goto            32
	//   51  123:return          
	}
}

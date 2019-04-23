// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import com.facebook.FacebookSdk;
import com.facebook.internal.AttributionIdentifiers;
import java.util.*;

// Referenced classes of package com.facebook.appevents:
//			SessionEventsState, AppEventsLogger, PersistedEvents, AccessTokenAppIdPair, 
//			AppEvent

class AppEventCollection
{

	public AppEventCollection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void HashMap()>
	//    6   12:putfield        #16  <Field HashMap stateMap>
	//    7   15:return          
	}

	private SessionEventsState getSessionEventsState(AccessTokenAppIdPair accesstokenappidpair)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SessionEventsState sessioneventsstate = (SessionEventsState)stateMap.get(((Object) (accesstokenappidpair)));
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field HashMap stateMap>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #23  <Method Object HashMap.get(Object)>
	//    6   10:checkcast       #25  <Class SessionEventsState>
	//    7   13:astore_3        
		Object obj;
		obj = ((Object) (sessioneventsstate));
	//    8   14:aload_3         
	//    9   15:astore_2        
		if(sessioneventsstate != null)
			break MISSING_BLOCK_LABEL_40;
	//   10   16:aload_3         
	//   11   17:ifnonnull       40
		obj = ((Object) (FacebookSdk.getApplicationContext()));
	//   12   20:invokestatic    #31  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   13   23:astore_2        
		obj = ((Object) (new SessionEventsState(AttributionIdentifiers.getAttributionIdentifiers(((android.content.Context) (obj))), AppEventsLogger.getAnonymousAppDeviceGUID(((android.content.Context) (obj))))));
	//   14   24:new             #25  <Class SessionEventsState>
	//   15   27:dup             
	//   16   28:aload_2         
	//   17   29:invokestatic    #37  <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(android.content.Context)>
	//   18   32:aload_2         
	//   19   33:invokestatic    #43  <Method String AppEventsLogger.getAnonymousAppDeviceGUID(android.content.Context)>
	//   20   36:invokespecial   #46  <Method void SessionEventsState(AttributionIdentifiers, String)>
	//   21   39:astore_2        
		stateMap.put(((Object) (accesstokenappidpair)), obj);
	//   22   40:aload_0         
	//   23   41:getfield        #16  <Field HashMap stateMap>
	//   24   44:aload_1         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #50  <Method Object HashMap.put(Object, Object)>
	//   27   49:pop             
		this;
	//   28   50:aload_0         
		JVM INSTR monitorexit ;
	//   29   51:monitorexit     
		return ((SessionEventsState) (obj));
	//   30   52:aload_2         
	//   31   53:areturn         
		accesstokenappidpair;
	//   32   54:astore_1        
	//*  33   55:aload_0         
		throw accesstokenappidpair;
	//   34   56:monitorexit     
	//   35   57:aload_1         
	//   36   58:athrow          
	}

	public void addEvent(AccessTokenAppIdPair accesstokenappidpair, AppEvent appevent)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		getSessionEventsState(accesstokenappidpair).addEvent(appevent);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #54  <Method SessionEventsState getSessionEventsState(AccessTokenAppIdPair)>
	//    5    7:aload_2         
	//    6    8:invokevirtual   #57  <Method void SessionEventsState.addEvent(AppEvent)>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		accesstokenappidpair;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw accesstokenappidpair;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void addPersistedEvents(PersistedEvents persistedevents)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(persistedevents == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
	//*   4    6:aload_0         
			return;
	//    5    7:monitorexit     
	//    6    8:return          
		for(Iterator iterator = persistedevents.keySet().iterator(); iterator.hasNext();)
	//*   7    9:aload_1         
	//*   8   10:invokevirtual   #65  <Method Set PersistedEvents.keySet()>
	//*   9   13:invokeinterface #71  <Method Iterator Set.iterator()>
	//*  10   18:astore_2        
	//*  11   19:aload_2         
	//*  12   20:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*  13   25:ifeq            86
		{
			Object obj = ((Object) ((AccessTokenAppIdPair)iterator.next()));
	//   14   28:aload_2         
	//   15   29:invokeinterface #81  <Method Object Iterator.next()>
	//   16   34:checkcast       #83  <Class AccessTokenAppIdPair>
	//   17   37:astore          4
			SessionEventsState sessioneventsstate = getSessionEventsState(((AccessTokenAppIdPair) (obj)));
	//   18   39:aload_0         
	//   19   40:aload           4
	//   20   42:invokespecial   #54  <Method SessionEventsState getSessionEventsState(AccessTokenAppIdPair)>
	//   21   45:astore_3        
			obj = ((Object) (persistedevents.get(((AccessTokenAppIdPair) (obj))).iterator()));
	//   22   46:aload_1         
	//   23   47:aload           4
	//   24   49:invokevirtual   #86  <Method List PersistedEvents.get(AccessTokenAppIdPair)>
	//   25   52:invokeinterface #89  <Method Iterator List.iterator()>
	//   26   57:astore          4
			while(((Iterator) (obj)).hasNext()) 
	//*  27   59:aload           4
	//*  28   61:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*  29   66:ifeq            19
				sessioneventsstate.addEvent((AppEvent)((Iterator) (obj)).next());
	//   30   69:aload_3         
	//   31   70:aload           4
	//   32   72:invokeinterface #81  <Method Object Iterator.next()>
	//   33   77:checkcast       #91  <Class AppEvent>
	//   34   80:invokevirtual   #57  <Method void SessionEventsState.addEvent(AppEvent)>
		}

	//*  35   83:goto            59
		this;
	//   36   86:aload_0         
		JVM INSTR monitorexit ;
	//   37   87:monitorexit     
		return;
	//   38   88:return          
		persistedevents;
	//   39   89:astore_1        
	//*  40   90:aload_0         
		throw persistedevents;
	//   41   91:monitorexit     
	//   42   92:aload_1         
	//   43   93:athrow          
	}

	public SessionEventsState get(AccessTokenAppIdPair accesstokenappidpair)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		accesstokenappidpair = ((AccessTokenAppIdPair) ((SessionEventsState)stateMap.get(((Object) (accesstokenappidpair)))));
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field HashMap stateMap>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #23  <Method Object HashMap.get(Object)>
	//    6   10:checkcast       #25  <Class SessionEventsState>
	//    7   13:astore_1        
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return ((SessionEventsState) (accesstokenappidpair));
	//   10   16:aload_1         
	//   11   17:areturn         
		accesstokenappidpair;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw accesstokenappidpair;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public int getEventCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		Iterator iterator = stateMap.values().iterator();
	//    4    4:aload_0         
	//    5    5:getfield        #16  <Field HashMap stateMap>
	//    6    8:invokevirtual   #97  <Method Collection HashMap.values()>
	//    7   11:invokeinterface #100 <Method Iterator Collection.iterator()>
	//    8   16:astore_3        
_L1:
		int j;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_46;
	//    9   17:aload_3         
	//   10   18:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            46
		j = ((SessionEventsState)iterator.next()).getAccumulatedEventCount();
	//   12   26:aload_3         
	//   13   27:invokeinterface #81  <Method Object Iterator.next()>
	//   14   32:checkcast       #25  <Class SessionEventsState>
	//   15   35:invokevirtual   #103 <Method int SessionEventsState.getAccumulatedEventCount()>
	//   16   38:istore_2        
		i += j;
	//   17   39:iload_1         
	//   18   40:iload_2         
	//   19   41:iadd            
	//   20   42:istore_1        
		  goto _L1
	//*  21   43:goto            17
		this;
	//   22   46:aload_0         
		JVM INSTR monitorexit ;
	//   23   47:monitorexit     
		return i;
	//   24   48:iload_1         
	//   25   49:ireturn         
		Exception exception;
		exception;
	//   26   50:astore_3        
	//*  27   51:aload_0         
		throw exception;
	//   28   52:monitorexit     
	//   29   53:aload_3         
	//   30   54:athrow          
	}

	public Set keySet()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Set set = stateMap.keySet();
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field HashMap stateMap>
	//    4    6:invokevirtual   #104 <Method Set HashMap.keySet()>
	//    5    9:astore_1        
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return set;
	//    8   12:aload_1         
	//    9   13:areturn         
		Exception exception;
		exception;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	private final HashMap stateMap = new HashMap();
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.facebook.appevents:
//			AccessTokenAppIdPair

class PersistedEvents
	implements Serializable
{
	static class SerializationProxyV1
		implements Serializable
	{

		private Object readResolve()
		{
			return ((Object) (new PersistedEvents(proxyEvents)));
		//    0    0:new             #8   <Class PersistedEvents>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field HashMap proxyEvents>
		//    4    8:invokespecial   #32  <Method void PersistedEvents(HashMap)>
		//    5   11:areturn         
		}

		private static final long serialVersionUID = 0xb1aac909L;
		private final HashMap proxyEvents;

		private SerializationProxyV1(HashMap hashmap)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			proxyEvents = hashmap;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field HashMap proxyEvents>
		//    5    9:return          
		}

	}


	public PersistedEvents()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		events = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void HashMap()>
	//    6   12:putfield        #27  <Field HashMap events>
	//    7   15:return          
	}

	public PersistedEvents(HashMap hashmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		events = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void HashMap()>
	//    6   12:putfield        #27  <Field HashMap events>
		events.putAll(((java.util.Map) (hashmap)));
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field HashMap events>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #33  <Method void HashMap.putAll(java.util.Map)>
	//   11   23:return          
	}

	private Object writeReplace()
	{
		return ((Object) (new SerializationProxyV1(events)));
	//    0    0:new             #10  <Class PersistedEvents$SerializationProxyV1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field HashMap events>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #40  <Method void PersistedEvents$SerializationProxyV1(HashMap, PersistedEvents$1)>
	//    6   12:areturn         
	}

	public void addEvents(AccessTokenAppIdPair accesstokenappidpair, List list)
	{
		if(!events.containsKey(((Object) (accesstokenappidpair))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field HashMap events>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #46  <Method boolean HashMap.containsKey(Object)>
	//*   4    8:ifne            22
		{
			events.put(((Object) (accesstokenappidpair)), ((Object) (list)));
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field HashMap events>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #50  <Method Object HashMap.put(Object, Object)>
	//   10   20:pop             
			return;
	//   11   21:return          
		} else
		{
			((List)events.get(((Object) (accesstokenappidpair)))).addAll(((java.util.Collection) (list)));
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field HashMap events>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #54  <Method Object HashMap.get(Object)>
	//   16   30:checkcast       #56  <Class List>
	//   17   33:aload_2         
	//   18   34:invokeinterface #60  <Method boolean List.addAll(java.util.Collection)>
	//   19   39:pop             
			return;
	//   20   40:return          
		}
	}

	public boolean containsKey(AccessTokenAppIdPair accesstokenappidpair)
	{
		return events.containsKey(((Object) (accesstokenappidpair)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field HashMap events>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method boolean HashMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public List get(AccessTokenAppIdPair accesstokenappidpair)
	{
		return (List)events.get(((Object) (accesstokenappidpair)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field HashMap events>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #56  <Class List>
	//    5   11:areturn         
	}

	public Set keySet()
	{
		return events.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field HashMap events>
	//    2    4:invokevirtual   #68  <Method Set HashMap.keySet()>
	//    3    7:areturn         
	}

	private static final long serialVersionUID = 0xb1aac909L;
	private HashMap events;
}

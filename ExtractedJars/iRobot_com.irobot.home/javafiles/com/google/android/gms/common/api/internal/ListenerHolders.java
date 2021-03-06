// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			ListenerHolder

public class ListenerHolders
{

	public ListenerHolders()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void WeakHashMap()>
	//    6   12:invokestatic    #21  <Method Set Collections.newSetFromMap(java.util.Map)>
	//    7   15:putfield        #23  <Field Set zajn>
	//    8   18:return          
	}

	public static ListenerHolder createListenerHolder(Object obj, Looper looper, String s)
	{
		Preconditions.checkNotNull(obj, "Listener must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "Listener must not be null">
	//    2    3:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (looper)), "Looper must not be null");
	//    4    7:aload_1         
	//    5    8:ldc1            #36  <String "Looper must not be null">
	//    6   10:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		Preconditions.checkNotNull(((Object) (s)), "Listener type must not be null");
	//    8   14:aload_2         
	//    9   15:ldc1            #38  <String "Listener type must not be null">
	//   10   17:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   11   20:pop             
		return new ListenerHolder(looper, obj, s);
	//   12   21:new             #40  <Class ListenerHolder>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:aload_0         
	//   16   27:aload_2         
	//   17   28:invokespecial   #43  <Method void ListenerHolder(Looper, Object, String)>
	//   18   31:areturn         
	}

	public static ListenerHolder.ListenerKey createListenerKey(Object obj, String s)
	{
		Preconditions.checkNotNull(obj, "Listener must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "Listener must not be null">
	//    2    3:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (s)), "Listener type must not be null");
	//    4    7:aload_1         
	//    5    8:ldc1            #38  <String "Listener type must not be null">
	//    6   10:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		Preconditions.checkNotEmpty(s, "Listener type must not be empty");
	//    8   14:aload_1         
	//    9   15:ldc1            #50  <String "Listener type must not be empty">
	//   10   17:invokestatic    #54  <Method String Preconditions.checkNotEmpty(String, Object)>
	//   11   20:pop             
		return new ListenerHolder.ListenerKey(obj, s);
	//   12   21:new             #56  <Class ListenerHolder$ListenerKey>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokespecial   #59  <Method void ListenerHolder$ListenerKey(Object, String)>
	//   17   30:areturn         
	}

	public final void release()
	{
		for(Iterator iterator = zajn.iterator(); iterator.hasNext(); ((ListenerHolder)iterator.next()).clear());
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Set zajn>
	//    2    4:invokeinterface #67  <Method Iterator Set.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            34
	//    7   19:aload_1         
	//    8   20:invokeinterface #77  <Method Object Iterator.next()>
	//    9   25:checkcast       #40  <Class ListenerHolder>
	//   10   28:invokevirtual   #80  <Method void ListenerHolder.clear()>
	//*  11   31:goto            10
		zajn.clear();
	//   12   34:aload_0         
	//   13   35:getfield        #23  <Field Set zajn>
	//   14   38:invokeinterface #81  <Method void Set.clear()>
	//   15   43:return          
	}

	public final ListenerHolder zaa(Object obj, Looper looper, String s)
	{
		obj = ((Object) (createListenerHolder(obj, looper, s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #84  <Method ListenerHolder createListenerHolder(Object, Looper, String)>
	//    4    6:astore_1        
		zajn.add(obj);
	//    5    7:aload_0         
	//    6    8:getfield        #23  <Field Set zajn>
	//    7   11:aload_1         
	//    8   12:invokeinterface #88  <Method boolean Set.add(Object)>
	//    9   17:pop             
		return ((ListenerHolder) (obj));
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	private final Set zajn = Collections.newSetFromMap(((java.util.Map) (new WeakHashMap())));
}

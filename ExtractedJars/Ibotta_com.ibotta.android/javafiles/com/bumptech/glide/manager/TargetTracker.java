// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.*;

// Referenced classes of package com.bumptech.glide.manager:
//			LifecycleListener

public final class TargetTracker
	implements LifecycleListener
{

	public TargetTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void WeakHashMap()>
	//    6   12:invokestatic    #22  <Method Set Collections.newSetFromMap(java.util.Map)>
	//    7   15:putfield        #24  <Field Set targets>
	//    8   18:return          
	}

	public void clear()
	{
		targets.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Set targets>
	//    2    4:invokeinterface #30  <Method void Set.clear()>
	//    3    9:return          
	}

	public List getAll()
	{
		return Util.getSnapshot(((java.util.Collection) (targets)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Set targets>
	//    2    4:invokestatic    #39  <Method List Util.getSnapshot(java.util.Collection)>
	//    3    7:areturn         
	}

	public void onDestroy()
	{
		for(Iterator iterator = Util.getSnapshot(((java.util.Collection) (targets))).iterator(); iterator.hasNext(); ((Target)iterator.next()).onDestroy());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Set targets>
	//    2    4:invokestatic    #39  <Method List Util.getSnapshot(java.util.Collection)>
	//    3    7:invokeinterface #49  <Method Iterator List.iterator()>
	//    4   12:astore_1        
	//    5   13:aload_1         
	//    6   14:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            39
	//    8   22:aload_1         
	//    9   23:invokeinterface #59  <Method Object Iterator.next()>
	//   10   28:checkcast       #61  <Class Target>
	//   11   31:invokeinterface #63  <Method void Target.onDestroy()>
	//*  12   36:goto            13
	//   13   39:return          
	}

	public void onStart()
	{
		for(Iterator iterator = Util.getSnapshot(((java.util.Collection) (targets))).iterator(); iterator.hasNext(); ((Target)iterator.next()).onStart());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Set targets>
	//    2    4:invokestatic    #39  <Method List Util.getSnapshot(java.util.Collection)>
	//    3    7:invokeinterface #49  <Method Iterator List.iterator()>
	//    4   12:astore_1        
	//    5   13:aload_1         
	//    6   14:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            39
	//    8   22:aload_1         
	//    9   23:invokeinterface #59  <Method Object Iterator.next()>
	//   10   28:checkcast       #61  <Class Target>
	//   11   31:invokeinterface #66  <Method void Target.onStart()>
	//*  12   36:goto            13
	//   13   39:return          
	}

	public void onStop()
	{
		for(Iterator iterator = Util.getSnapshot(((java.util.Collection) (targets))).iterator(); iterator.hasNext(); ((Target)iterator.next()).onStop());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Set targets>
	//    2    4:invokestatic    #39  <Method List Util.getSnapshot(java.util.Collection)>
	//    3    7:invokeinterface #49  <Method Iterator List.iterator()>
	//    4   12:astore_1        
	//    5   13:aload_1         
	//    6   14:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            39
	//    8   22:aload_1         
	//    9   23:invokeinterface #59  <Method Object Iterator.next()>
	//   10   28:checkcast       #61  <Class Target>
	//   11   31:invokeinterface #69  <Method void Target.onStop()>
	//*  12   36:goto            13
	//   13   39:return          
	}

	public void track(Target target)
	{
		targets.add(((Object) (target)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Set targets>
	//    2    4:aload_1         
	//    3    5:invokeinterface #75  <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void untrack(Target target)
	{
		targets.remove(((Object) (target)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Set targets>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private final Set targets = Collections.newSetFromMap(((java.util.Map) (new WeakHashMap())));
}

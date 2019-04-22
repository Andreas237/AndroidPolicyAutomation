// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import java.util.*;
import java.util.concurrent.Executor;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJob

static final class EngineJob$ResourceCallbacksAndExecutors
	implements Iterable
{

	private static EngineJob.ResourceCallbackAndExecutor defaultCallbackAndExecutor(ResourceCallback resourcecallback)
	{
		return new EngineJob.ResourceCallbackAndExecutor(resourcecallback, Executors.directExecutor());
	//    0    0:new             #34  <Class EngineJob$ResourceCallbackAndExecutor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #40  <Method Executor Executors.directExecutor()>
	//    4    8:invokespecial   #43  <Method void EngineJob$ResourceCallbackAndExecutor(ResourceCallback, Executor)>
	//    5   11:areturn         
	}

	void add(ResourceCallback resourcecallback, Executor executor)
	{
		callbacksAndExecutors.add(((Object) (new EngineJob.ResourceCallbackAndExecutor(resourcecallback, executor))));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List callbacksAndExecutors>
	//    2    4:new             #34  <Class EngineJob$ResourceCallbackAndExecutor>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #43  <Method void EngineJob$ResourceCallbackAndExecutor(ResourceCallback, Executor)>
	//    7   13:invokeinterface #49  <Method boolean List.add(Object)>
	//    8   18:pop             
	//    9   19:return          
	}

	void clear()
	{
		callbacksAndExecutors.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List callbacksAndExecutors>
	//    2    4:invokeinterface #52  <Method void List.clear()>
	//    3    9:return          
	}

	boolean contains(ResourceCallback resourcecallback)
	{
		return callbacksAndExecutors.contains(((Object) (defaultCallbackAndExecutor(resourcecallback))));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List callbacksAndExecutors>
	//    2    4:aload_1         
	//    3    5:invokestatic    #56  <Method EngineJob$ResourceCallbackAndExecutor defaultCallbackAndExecutor(ResourceCallback)>
	//    4    8:invokeinterface #58  <Method boolean List.contains(Object)>
	//    5   13:ireturn         
	}

	EngineJob$ResourceCallbacksAndExecutors copy()
	{
		return new EngineJob$ResourceCallbacksAndExecutors(((List) (new ArrayList(((java.util.Collection) (callbacksAndExecutors))))));
	//    0    0:new             #2   <Class EngineJob$ResourceCallbacksAndExecutors>
	//    1    3:dup             
	//    2    4:new             #17  <Class ArrayList>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field List callbacksAndExecutors>
	//    6   12:invokespecial   #63  <Method void ArrayList(java.util.Collection)>
	//    7   15:invokespecial   #23  <Method void EngineJob$ResourceCallbacksAndExecutors(List)>
	//    8   18:areturn         
	}

	boolean isEmpty()
	{
		return callbacksAndExecutors.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List callbacksAndExecutors>
	//    2    4:invokeinterface #67  <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public Iterator iterator()
	{
		return callbacksAndExecutors.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List callbacksAndExecutors>
	//    2    4:invokeinterface #72  <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	void remove(ResourceCallback resourcecallback)
	{
		callbacksAndExecutors.remove(((Object) (defaultCallbackAndExecutor(resourcecallback))));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List callbacksAndExecutors>
	//    2    4:aload_1         
	//    3    5:invokestatic    #56  <Method EngineJob$ResourceCallbackAndExecutor defaultCallbackAndExecutor(ResourceCallback)>
	//    4    8:invokeinterface #78  <Method boolean List.remove(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	int size()
	{
		return callbacksAndExecutors.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List callbacksAndExecutors>
	//    2    4:invokeinterface #82  <Method int List.size()>
	//    3    9:ireturn         
	}

	private final List callbacksAndExecutors;

	EngineJob$ResourceCallbacksAndExecutors()
	{
		this(((List) (new ArrayList(2))));
	//    0    0:aload_0         
	//    1    1:new             #17  <Class ArrayList>
	//    2    4:dup             
	//    3    5:iconst_2        
	//    4    6:invokespecial   #20  <Method void ArrayList(int)>
	//    5    9:invokespecial   #23  <Method void EngineJob$ResourceCallbacksAndExecutors(List)>
	//    6   12:return          
	}

	EngineJob$ResourceCallbacksAndExecutors(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		callbacksAndExecutors = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field List callbacksAndExecutors>
	//    5    9:return          
	}
}

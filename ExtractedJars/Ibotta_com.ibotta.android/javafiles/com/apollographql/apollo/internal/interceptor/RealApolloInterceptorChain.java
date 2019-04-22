// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import java.util.*;
import java.util.concurrent.Executor;

public final class RealApolloInterceptorChain
	implements ApolloInterceptorChain
{

	public RealApolloInterceptorChain(List list)
	{
		this(list, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #17  <Method void RealApolloInterceptorChain(List, int)>
	//    4    6:return          
	}

	private RealApolloInterceptorChain(List list, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		if(i <= list.size())
	//*   2    4:iload_2         
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #30  <Method int List.size()>
	//*   5   11:icmpgt          40
		{
			interceptors = ((List) (new ArrayList((Collection)Utils.checkNotNull(((Object) (list)), "interceptors == null"))));
	//    6   14:aload_0         
	//    7   15:new             #32  <Class ArrayList>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:ldc1            #34  <String "interceptors == null">
	//   11   22:invokestatic    #40  <Method Object Utils.checkNotNull(Object, Object)>
	//   12   25:checkcast       #42  <Class Collection>
	//   13   28:invokespecial   #45  <Method void ArrayList(Collection)>
	//   14   31:putfield        #47  <Field List interceptors>
			interceptorIndex = i;
	//   15   34:aload_0         
	//   16   35:iload_2         
	//   17   36:putfield        #49  <Field int interceptorIndex>
			return;
	//   18   39:return          
		} else
		{
			throw new IllegalArgumentException();
	//   19   40:new             #51  <Class IllegalArgumentException>
	//   20   43:dup             
	//   21   44:invokespecial   #52  <Method void IllegalArgumentException()>
	//   22   47:athrow          
		}
	}

	public void dispose()
	{
		for(Iterator iterator = interceptors.iterator(); iterator.hasNext(); ((ApolloInterceptor)iterator.next()).dispose());
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List interceptors>
	//    2    4:invokeinterface #58  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #68  <Method Object Iterator.next()>
	//    9   25:checkcast       #70  <Class ApolloInterceptor>
	//   10   28:invokeinterface #72  <Method void ApolloInterceptor.dispose()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	public void proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest interceptorrequest, Executor executor, com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack callback)
	{
		if(interceptorIndex < interceptors.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int interceptorIndex>
	//*   2    4:aload_0         
	//*   3    5:getfield        #47  <Field List interceptors>
	//*   4    8:invokeinterface #30  <Method int List.size()>
	//*   5   13:icmpge          58
		{
			((ApolloInterceptor)interceptors.get(interceptorIndex)).interceptAsync(interceptorrequest, ((ApolloInterceptorChain) (new RealApolloInterceptorChain(interceptors, interceptorIndex + 1))), executor, callback);
	//    6   16:aload_0         
	//    7   17:getfield        #47  <Field List interceptors>
	//    8   20:aload_0         
	//    9   21:getfield        #49  <Field int interceptorIndex>
	//   10   24:invokeinterface #78  <Method Object List.get(int)>
	//   11   29:checkcast       #70  <Class ApolloInterceptor>
	//   12   32:aload_1         
	//   13   33:new             #2   <Class RealApolloInterceptorChain>
	//   14   36:dup             
	//   15   37:aload_0         
	//   16   38:getfield        #47  <Field List interceptors>
	//   17   41:aload_0         
	//   18   42:getfield        #49  <Field int interceptorIndex>
	//   19   45:iconst_1        
	//   20   46:iadd            
	//   21   47:invokespecial   #17  <Method void RealApolloInterceptorChain(List, int)>
	//   22   50:aload_2         
	//   23   51:aload_3         
	//   24   52:invokeinterface #82  <Method void ApolloInterceptor.interceptAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, ApolloInterceptorChain, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
			return;
	//   25   57:return          
		} else
		{
			throw new IllegalStateException();
	//   26   58:new             #84  <Class IllegalStateException>
	//   27   61:dup             
	//   28   62:invokespecial   #85  <Method void IllegalStateException()>
	//   29   65:athrow          
		}
	}

	private final int interceptorIndex;
	private final List interceptors;
}

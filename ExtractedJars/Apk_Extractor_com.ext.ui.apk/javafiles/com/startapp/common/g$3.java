// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.common;

import com.startapp.common.a.g;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.startapp.common:
//			g

static final class g$3
	implements RejectedExecutionHandler
{

	public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
	{
		g.a(g.a(), 6, (new StringBuilder()).append("ThreadPoolExecutor rejected execution! ").append(((Object) (threadpoolexecutor))).toString());
	//    0    0:invokestatic    #19  <Method String g.a()>
	//    1    3:bipush          6
	//    2    5:new             #21  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #22  <Method void StringBuilder()>
	//    5   12:ldc1            #24  <String "ThreadPoolExecutor rejected execution! ">
	//    6   14:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_2         
	//    8   18:invokevirtual   #31  <Method StringBuilder StringBuilder.append(Object)>
	//    9   21:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   10   24:invokestatic    #39  <Method void g.a(String, int, String)>
	//   11   27:return          
	}

	g$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}

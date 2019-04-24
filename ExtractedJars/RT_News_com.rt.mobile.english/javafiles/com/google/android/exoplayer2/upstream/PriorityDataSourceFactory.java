// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.PriorityTaskManager;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			PriorityDataSource, DataSource

public final class PriorityDataSourceFactory
	implements DataSource.Factory
{

	public PriorityDataSourceFactory(DataSource.Factory factory, PriorityTaskManager prioritytaskmanager, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		upstreamFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field DataSource$Factory upstreamFactory>
		priorityTaskManager = prioritytaskmanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field PriorityTaskManager priorityTaskManager>
		priority = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int priority>
	//   11   19:return          
	}

	public volatile DataSource createDataSource()
	{
		return ((DataSource) (createDataSource()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method PriorityDataSource createDataSource()>
	//    2    4:areturn         
	}

	public PriorityDataSource createDataSource()
	{
		return new PriorityDataSource(upstreamFactory.createDataSource(), priorityTaskManager, priority);
	//    0    0:new             #31  <Class PriorityDataSource>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field DataSource$Factory upstreamFactory>
	//    4    8:invokeinterface #33  <Method DataSource DataSource$Factory.createDataSource()>
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field PriorityTaskManager priorityTaskManager>
	//    7   17:aload_0         
	//    8   18:getfield        #23  <Field int priority>
	//    9   21:invokespecial   #36  <Method void PriorityDataSource(DataSource, PriorityTaskManager, int)>
	//   10   24:areturn         
	}

	private final int priority;
	private final PriorityTaskManager priorityTaskManager;
	private final DataSource.Factory upstreamFactory;
}

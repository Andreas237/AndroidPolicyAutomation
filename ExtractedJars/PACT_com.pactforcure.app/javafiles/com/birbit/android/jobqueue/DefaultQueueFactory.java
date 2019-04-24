// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.cachedQueue.CachedJobQueue;
import com.birbit.android.jobqueue.config.Configuration;
import com.birbit.android.jobqueue.inMemoryQueue.SimpleInMemoryPriorityQueue;
import com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue;

// Referenced classes of package com.birbit.android.jobqueue:
//			QueueFactory, JobQueue

public class DefaultQueueFactory
	implements QueueFactory
{

	public DefaultQueueFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		jobSerializer = ((com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue.JobSerializer) (new com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue.JavaSerializer()));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue$JavaSerializer>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue$JavaSerializer()>
	//    6   12:putfield        #17  <Field com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue$JobSerializer jobSerializer>
	//    7   15:return          
	}

	public DefaultQueueFactory(com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue.JobSerializer jobserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		jobSerializer = jobserializer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue$JobSerializer jobSerializer>
	//    5    9:return          
	}

	public JobQueue createNonPersistent(Configuration configuration, long l)
	{
		return ((JobQueue) (new CachedJobQueue(((JobQueue) (new SimpleInMemoryPriorityQueue(configuration, l))))));
	//    0    0:new             #23  <Class CachedJobQueue>
	//    1    3:dup             
	//    2    4:new             #25  <Class SimpleInMemoryPriorityQueue>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:lload_2         
	//    6   10:invokespecial   #28  <Method void SimpleInMemoryPriorityQueue(Configuration, long)>
	//    7   13:invokespecial   #31  <Method void CachedJobQueue(JobQueue)>
	//    8   16:areturn         
	}

	public JobQueue createPersistentQueue(Configuration configuration, long l)
	{
		return ((JobQueue) (new CachedJobQueue(((JobQueue) (new SqliteJobQueue(configuration, l, jobSerializer))))));
	//    0    0:new             #23  <Class CachedJobQueue>
	//    1    3:dup             
	//    2    4:new             #34  <Class SqliteJobQueue>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:lload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue$JobSerializer jobSerializer>
	//    8   14:invokespecial   #37  <Method void SqliteJobQueue(Configuration, long, com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue$JobSerializer)>
	//    9   17:invokespecial   #31  <Method void CachedJobQueue(JobQueue)>
	//   10   20:areturn         
	}

	com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue.JobSerializer jobSerializer;
}

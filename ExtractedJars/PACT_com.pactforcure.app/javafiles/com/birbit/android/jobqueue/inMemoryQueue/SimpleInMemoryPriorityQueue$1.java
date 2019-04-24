// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.inMemoryQueue;

import com.birbit.android.jobqueue.Job;
import com.birbit.android.jobqueue.JobHolder;
import java.util.Comparator;

// Referenced classes of package com.birbit.android.jobqueue.inMemoryQueue:
//			SimpleInMemoryPriorityQueue

class SimpleInMemoryPriorityQueue$1
	implements Comparator
{

	private int compareInt(int i, int j)
	{
		if(i > j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          7
			return -1;
	//    3    5:iconst_m1       
	//    4    6:ireturn         
		return j <= i ? 0 : 1;
	//    5    7:iload_2         
	//    6    8:iload_1         
	//    7    9:icmple          14
	//    8   12:iconst_1        
	//    9   13:ireturn         
	//   10   14:iconst_0        
	//   11   15:ireturn         
	}

	private int compareLong(long l, long l1)
	{
		if(l > l1)
	//*   0    0:lload_1         
	//*   1    1:lload_3         
	//*   2    2:lcmp            
	//*   3    3:ifle            8
			return -1;
	//    4    6:iconst_m1       
	//    5    7:ireturn         
		return l1 <= l ? 0 : 1;
	//    6    8:lload_3         
	//    7    9:lload_1         
	//    8   10:lcmp            
	//    9   11:ifle            16
	//   10   14:iconst_1        
	//   11   15:ireturn         
	//   12   16:iconst_0        
	//   13   17:ireturn         
	}

	public int compare(JobHolder jobholder, JobHolder jobholder1)
	{
		int i;
		if(jobholder.getJob().getId().equals(((Object) (jobholder1.getJob().getId()))))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #31  <Method Job JobHolder.getJob()>
	//*   2    4:invokevirtual   #37  <Method String Job.getId()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #31  <Method Job JobHolder.getJob()>
	//*   5   11:invokevirtual   #37  <Method String Job.getId()>
	//*   6   14:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*   7   17:ifeq            24
		{
			i = 0;
	//    8   20:iconst_0        
	//    9   21:istore_3        
		} else
	//*  10   22:iload_3         
	//*  11   23:ireturn         
		{
			int j = compareInt(jobholder.getPriority(), jobholder1.getPriority());
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #47  <Method int JobHolder.getPriority()>
	//   15   29:aload_2         
	//   16   30:invokevirtual   #47  <Method int JobHolder.getPriority()>
	//   17   33:invokespecial   #49  <Method int compareInt(int, int)>
	//   18   36:istore          4
			i = j;
	//   19   38:iload           4
	//   20   40:istore_3        
			if(j == 0)
	//*  21   41:iload           4
	//*  22   43:ifne            22
			{
				int k = -compareLong(jobholder.getCreatedNs(), jobholder1.getCreatedNs());
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:invokevirtual   #53  <Method long JobHolder.getCreatedNs()>
	//   26   51:aload_2         
	//   27   52:invokevirtual   #53  <Method long JobHolder.getCreatedNs()>
	//   28   55:invokespecial   #55  <Method int compareLong(long, long)>
	//   29   58:ineg            
	//   30   59:istore          4
				i = k;
	//   31   61:iload           4
	//   32   63:istore_3        
				if(k == 0)
	//*  33   64:iload           4
	//*  34   66:ifne            22
					return -compareLong(jobholder.getInsertionOrder().longValue(), jobholder1.getInsertionOrder().longValue());
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:invokevirtual   #59  <Method Long JobHolder.getInsertionOrder()>
	//   38   74:invokevirtual   #64  <Method long Long.longValue()>
	//   39   77:aload_2         
	//   40   78:invokevirtual   #59  <Method Long JobHolder.getInsertionOrder()>
	//   41   81:invokevirtual   #64  <Method long Long.longValue()>
	//   42   84:invokespecial   #55  <Method int compareLong(long, long)>
	//   43   87:ineg            
	//   44   88:ireturn         
			}
		}
		return i;
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((JobHolder)obj, (JobHolder)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class JobHolder>
	//    3    5:aload_2         
	//    4    6:checkcast       #27  <Class JobHolder>
	//    5    9:invokevirtual   #67  <Method int compare(JobHolder, JobHolder)>
	//    6   12:ireturn         
	}

	final SimpleInMemoryPriorityQueue this$0;

	SimpleInMemoryPriorityQueue$1()
	{
		this$0 = SimpleInMemoryPriorityQueue.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SimpleInMemoryPriorityQueue this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}

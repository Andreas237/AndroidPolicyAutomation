// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import android.content.Context;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.birbit.android.jobqueue:
//			Job, RetryConstraint

public class JobHolder
{
	public static class Builder
	{

		public JobHolder build()
		{
			if(job == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #77  <Field Job job>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("must provide a job");
		//    3    7:new             #79  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #81  <String "must provide a job">
		//    6   13:invokespecial   #84  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			int i = providedFlags & 0x7ff;
		//    8   17:aload_0         
		//    9   18:getfield        #72  <Field int providedFlags>
		//   10   21:sipush          2047
		//   11   24:iand            
		//   12   25:istore_1        
			if(i != 2047)
		//*  13   26:iload_1         
		//*  14   27:sipush          2047
		//*  15   30:icmpeq          64
				throw new IllegalArgumentException((new StringBuilder()).append("must provide all required fields. your result:").append(Long.toBinaryString(i)).toString());
		//   16   33:new             #79  <Class IllegalArgumentException>
		//   17   36:dup             
		//   18   37:new             #86  <Class StringBuilder>
		//   19   40:dup             
		//   20   41:invokespecial   #87  <Method void StringBuilder()>
		//   21   44:ldc1            #89  <String "must provide all required fields. your result:">
		//   22   46:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
		//   23   49:iload_1         
		//   24   50:i2l             
		//   25   51:invokestatic    #99  <Method String Long.toBinaryString(long)>
		//   26   54:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
		//   27   57:invokevirtual   #103 <Method String StringBuilder.toString()>
		//   28   60:invokespecial   #84  <Method void IllegalArgumentException(String)>
		//   29   63:athrow          
			JobHolder jobholder = new JobHolder(id, persistent, priority, groupId, runCount, job, createdNs, delayUntilNs, runningSessionId, tags, requiredNetworkType, deadlineNs, cancelOnDeadline);
		//   30   64:new             #6   <Class JobHolder>
		//   31   67:dup             
		//   32   68:aload_0         
		//   33   69:getfield        #105 <Field String id>
		//   34   72:aload_0         
		//   35   73:getfield        #107 <Field boolean persistent>
		//   36   76:aload_0         
		//   37   77:getfield        #109 <Field int priority>
		//   38   80:aload_0         
		//   39   81:getfield        #111 <Field String groupId>
		//   40   84:aload_0         
		//   41   85:getfield        #60  <Field int runCount>
		//   42   88:aload_0         
		//   43   89:getfield        #77  <Field Job job>
		//   44   92:aload_0         
		//   45   93:getfield        #113 <Field long createdNs>
		//   46   96:aload_0         
		//   47   97:getfield        #64  <Field long delayUntilNs>
		//   48  100:aload_0         
		//   49  101:getfield        #115 <Field long runningSessionId>
		//   50  104:aload_0         
		//   51  105:getfield        #117 <Field Set tags>
		//   52  108:aload_0         
		//   53  109:getfield        #119 <Field int requiredNetworkType>
		//   54  112:aload_0         
		//   55  113:getfield        #68  <Field long deadlineNs>
		//   56  116:aload_0         
		//   57  117:getfield        #70  <Field boolean cancelOnDeadline>
		//   58  120:aconst_null     
		//   59  121:invokespecial   #122 <Method void JobHolder(String, boolean, int, String, int, Job, long, long, long, Set, int, long, boolean, JobHolder$1)>
		//   60  124:astore_2        
			if(insertionOrder != null)
		//*  61  125:aload_0         
		//*  62  126:getfield        #124 <Field Long insertionOrder>
		//*  63  129:ifnull          143
				jobholder.setInsertionOrder(insertionOrder.longValue());
		//   64  132:aload_2         
		//   65  133:aload_0         
		//   66  134:getfield        #124 <Field Long insertionOrder>
		//   67  137:invokevirtual   #128 <Method long Long.longValue()>
		//   68  140:invokevirtual   #132 <Method void JobHolder.setInsertionOrder(long)>
			job.updateFromJobHolder(jobholder);
		//   69  143:aload_0         
		//   70  144:getfield        #77  <Field Job job>
		//   71  147:aload_2         
		//   72  148:invokevirtual   #138 <Method void Job.updateFromJobHolder(JobHolder)>
			return jobholder;
		//   73  151:aload_2         
		//   74  152:areturn         
		}

		public Builder createdNs(long l)
		{
			createdNs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #113 <Field long createdNs>
			providedFlags = providedFlags | 0x20;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:bipush          32
		//    7   12:ior             
		//    8   13:putfield        #72  <Field int providedFlags>
			return this;
		//    9   16:aload_0         
		//   10   17:areturn         
		}

		public Builder deadline(long l, boolean flag)
		{
			deadlineNs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #68  <Field long deadlineNs>
			cancelOnDeadline = flag;
		//    3    5:aload_0         
		//    4    6:iload_3         
		//    5    7:putfield        #70  <Field boolean cancelOnDeadline>
			providedFlags = providedFlags | 0x80;
		//    6   10:aload_0         
		//    7   11:aload_0         
		//    8   12:getfield        #72  <Field int providedFlags>
		//    9   15:sipush          128
		//   10   18:ior             
		//   11   19:putfield        #72  <Field int providedFlags>
			return this;
		//   12   22:aload_0         
		//   13   23:areturn         
		}

		public Builder delayUntilNs(long l)
		{
			delayUntilNs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #64  <Field long delayUntilNs>
			providedFlags = providedFlags | 0x40;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:bipush          64
		//    7   12:ior             
		//    8   13:putfield        #72  <Field int providedFlags>
			return this;
		//    9   16:aload_0         
		//   10   17:areturn         
		}

		public Builder groupId(String s)
		{
			groupId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #111 <Field String groupId>
			providedFlags = providedFlags | 8;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:bipush          8
		//    7   12:ior             
		//    8   13:putfield        #72  <Field int providedFlags>
			return this;
		//    9   16:aload_0         
		//   10   17:areturn         
		}

		public Builder id(String s)
		{
			id = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #105 <Field String id>
			providedFlags = providedFlags | 4;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:iconst_4        
		//    7   11:ior             
		//    8   12:putfield        #72  <Field int providedFlags>
			return this;
		//    9   15:aload_0         
		//   10   16:areturn         
		}

		public Builder insertionOrder(long l)
		{
			insertionOrder = Long.valueOf(l);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:invokestatic    #146 <Method Long Long.valueOf(long)>
		//    3    5:putfield        #124 <Field Long insertionOrder>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder job(Job job1)
		{
			job = job1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #77  <Field Job job>
			providedFlags = providedFlags | 0x10;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:bipush          16
		//    7   12:ior             
		//    8   13:putfield        #72  <Field int providedFlags>
			return this;
		//    9   16:aload_0         
		//   10   17:areturn         
		}

		public Builder persistent(boolean flag)
		{
			persistent = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #107 <Field boolean persistent>
			providedFlags = providedFlags | 2;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:iconst_2        
		//    7   11:ior             
		//    8   12:putfield        #72  <Field int providedFlags>
			return this;
		//    9   15:aload_0         
		//   10   16:areturn         
		}

		public Builder priority(int i)
		{
			priority = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #109 <Field int priority>
			providedFlags = providedFlags | 1;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:iconst_1        
		//    7   11:ior             
		//    8   12:putfield        #72  <Field int providedFlags>
			return this;
		//    9   15:aload_0         
		//   10   16:areturn         
		}

		public Builder requiredNetworkType(int i)
		{
			requiredNetworkType = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #119 <Field int requiredNetworkType>
			providedFlags = providedFlags | 0x400;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:sipush          1024
		//    7   13:ior             
		//    8   14:putfield        #72  <Field int providedFlags>
			return this;
		//    9   17:aload_0         
		//   10   18:areturn         
		}

		public Builder runCount(int i)
		{
			runCount = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #60  <Field int runCount>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder runningSessionId(long l)
		{
			runningSessionId = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #115 <Field long runningSessionId>
			providedFlags = providedFlags | 0x100;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:sipush          256
		//    7   13:ior             
		//    8   14:putfield        #72  <Field int providedFlags>
			return this;
		//    9   17:aload_0         
		//   10   18:areturn         
		}

		public Builder tags(Set set)
		{
			tags = set;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #117 <Field Set tags>
			providedFlags = providedFlags | 0x200;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #72  <Field int providedFlags>
		//    6   10:sipush          512
		//    7   13:ior             
		//    8   14:putfield        #72  <Field int providedFlags>
			return this;
		//    9   17:aload_0         
		//   10   18:areturn         
		}

		private static final int FLAG_CREATED_NS = 32;
		private static final int FLAG_DEADLINE = 128;
		private static final int FLAG_DELAY_UNTIL = 64;
		private static final int FLAG_GROUP_ID = 8;
		private static final int FLAG_ID = 4;
		private static final int FLAG_JOB = 16;
		private static final int FLAG_PERSISTENT = 2;
		private static final int FLAG_PRIORITY = 1;
		private static final int FLAG_REQ_NETWORK = 1024;
		private static final int FLAG_RUNNING_SESSION_ID = 256;
		private static final int FLAG_TAGS = 512;
		private static final int REQUIRED_FLAGS = 2047;
		private boolean cancelOnDeadline;
		private long createdNs;
		private long deadlineNs;
		private long delayUntilNs;
		private String groupId;
		private String id;
		private Long insertionOrder;
		private Job job;
		private boolean persistent;
		private int priority;
		private int providedFlags;
		private int requiredNetworkType;
		private int runCount;
		private long runningSessionId;
		private Set tags;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #58  <Method void Object()>
			runCount = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #60  <Field int runCount>
			delayUntilNs = 0x0L;
		//    5    9:aload_0         
		//    6   10:ldc2w           #61  <Long 0x0L>
		//    7   13:putfield        #64  <Field long delayUntilNs>
			deadlineNs = 0xffffffffL;
		//    8   16:aload_0         
		//    9   17:ldc2w           #65  <Long 0xffffffffL>
		//   10   20:putfield        #68  <Field long deadlineNs>
			cancelOnDeadline = false;
		//   11   23:aload_0         
		//   12   24:iconst_0        
		//   13   25:putfield        #70  <Field boolean cancelOnDeadline>
			providedFlags = 0;
		//   14   28:aload_0         
		//   15   29:iconst_0        
		//   16   30:putfield        #72  <Field int providedFlags>
		//   17   33:return          
		}
	}


	private JobHolder(String s, boolean flag, int i, String s1, int j, Job job1, long l, long l1, long l2, Set set, int k, 
			long l3, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field String id>
		persistent = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #61  <Field boolean persistent>
		priority = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #63  <Field int priority>
		groupId = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #65  <Field String groupId>
		runCount = j;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #67  <Field int runCount>
		createdNs = l;
	//   17   31:aload_0         
	//   18   32:lload           7
	//   19   34:putfield        #69  <Field long createdNs>
		delayUntilNs = l1;
	//   20   37:aload_0         
	//   21   38:lload           9
	//   22   40:putfield        #71  <Field long delayUntilNs>
		job = job1;
	//   23   43:aload_0         
	//   24   44:aload           6
	//   25   46:putfield        #73  <Field Job job>
		runningSessionId = l2;
	//   26   49:aload_0         
	//   27   50:lload           11
	//   28   52:putfield        #75  <Field long runningSessionId>
		requiredNetworkType = k;
	//   29   55:aload_0         
	//   30   56:iload           14
	//   31   58:putfield        #77  <Field int requiredNetworkType>
		tags = set;
	//   32   61:aload_0         
	//   33   62:aload           13
	//   34   64:putfield        #79  <Field Set tags>
		deadlineNs = l3;
	//   35   67:aload_0         
	//   36   68:lload           15
	//   37   70:putfield        #81  <Field long deadlineNs>
		cancelOnDeadline = flag1;
	//   38   73:aload_0         
	//   39   74:iload           17
	//   40   76:putfield        #83  <Field boolean cancelOnDeadline>
	//   41   79:return          
	}

	JobHolder(String s, boolean flag, int i, String s1, int j, Job job1, long l, long l1, long l2, Set set, int k, 
			long l3, boolean flag1, _cls1 _pcls1)
	{
		this(s, flag, i, s1, j, job1, l, l1, l2, set, k, l3, flag1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:lload           7
	//    8   12:lload           9
	//    9   14:lload           11
	//   10   16:aload           13
	//   11   18:iload           14
	//   12   20:lload           15
	//   13   22:iload           17
	//   14   24:invokespecial   #89  <Method void JobHolder(String, boolean, int, String, int, Job, long, long, long, Set, int, long, boolean)>
	//   15   27:return          
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof JobHolder))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class JobHolder>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			obj = ((Object) ((JobHolder)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class JobHolder>
	//    7   13:astore_1        
			return id.equals(((Object) (((JobHolder) (obj)).id)));
	//    8   14:aload_0         
	//    9   15:getfield        #59  <Field String id>
	//   10   18:aload_1         
	//   11   19:getfield        #59  <Field String id>
	//   12   22:invokevirtual   #95  <Method boolean String.equals(Object)>
	//   13   25:ireturn         
		}
	}

	public long getCreatedNs()
	{
		return createdNs;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field long createdNs>
	//    2    4:lreturn         
	}

	public long getDeadlineNs()
	{
		return deadlineNs;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field long deadlineNs>
	//    2    4:lreturn         
	}

	public long getDelayUntilNs()
	{
		return delayUntilNs;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field long delayUntilNs>
	//    2    4:lreturn         
	}

	public String getGroupId()
	{
		return groupId;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String groupId>
	//    2    4:areturn         
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String id>
	//    2    4:areturn         
	}

	public Long getInsertionOrder()
	{
		return insertionOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Long insertionOrder>
	//    2    4:areturn         
	}

	public Job getJob()
	{
		return job;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Job job>
	//    2    4:areturn         
	}

	public int getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int priority>
	//    2    4:ireturn         
	}

	public int getRequiredNetworkType()
	{
		return requiredNetworkType;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int requiredNetworkType>
	//    2    4:ireturn         
	}

	public RetryConstraint getRetryConstraint()
	{
		return retryConstraint;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field RetryConstraint retryConstraint>
	//    2    4:areturn         
	}

	public int getRunCount()
	{
		return runCount;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int runCount>
	//    2    4:ireturn         
	}

	public long getRunningSessionId()
	{
		return runningSessionId;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field long runningSessionId>
	//    2    4:lreturn         
	}

	public final String getSingleInstanceId()
	{
label0:
		{
			if(tags == null)
				break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Set tags>
	//    2    4:ifnull          47
			Iterator iterator = tags.iterator();
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field Set tags>
	//    5   11:invokeinterface #126 <Method Iterator Set.iterator()>
	//    6   16:astore_1        
			String s;
			do
			{
				if(!iterator.hasNext())
					break label0;
	//    7   17:aload_1         
	//    8   18:invokeinterface #132 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            47
				s = (String)iterator.next();
	//   10   26:aload_1         
	//   11   27:invokeinterface #136 <Method Object Iterator.next()>
	//   12   32:checkcast       #93  <Class String>
	//   13   35:astore_2        
			} while(!s.startsWith("job-single-id:"));
	//   14   36:aload_2         
	//   15   37:ldc1            #138 <String "job-single-id:">
	//   16   39:invokevirtual   #142 <Method boolean String.startsWith(String)>
	//   17   42:ifeq            17
			return s;
	//   18   45:aload_2         
	//   19   46:areturn         
		}
		return null;
	//   20   47:aconst_null     
	//   21   48:areturn         
	}

	public Set getTags()
	{
		return tags;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Set tags>
	//    2    4:areturn         
	}

	Throwable getThrowable()
	{
		return throwable;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field Throwable throwable>
	//    2    4:areturn         
	}

	public boolean hasDeadline()
	{
		return deadlineNs != 0xffffffffL;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field long deadlineNs>
	//    2    4:ldc2w           #151 <Long 0xffffffffL>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean hasDelay()
	{
		return delayUntilNs != 0x0L;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field long delayUntilNs>
	//    2    4:ldc2w           #154 <Long 0x0L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean hasTags()
	{
		return tags != null && tags.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Set tags>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field Set tags>
	//    5   11:invokeinterface #159 <Method int Set.size()>
	//    6   16:ifle            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public int hashCode()
	{
		return id.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String id>
	//    2    4:invokevirtual   #162 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public boolean isCancelled()
	{
		return cancelled;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field boolean cancelled>
	//    2    4:ireturn         
	}

	public boolean isCancelledSingleId()
	{
		return cancelledSingleId;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field boolean cancelledSingleId>
	//    2    4:ireturn         
	}

	public void markAsCancelled()
	{
		cancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #165 <Field boolean cancelled>
		job.cancelled = true;
	//    3    5:aload_0         
	//    4    6:getfield        #73  <Field Job job>
	//    5    9:iconst_1        
	//    6   10:putfield        #172 <Field boolean Job.cancelled>
	//    7   13:return          
	}

	public void markAsCancelledSingleId()
	{
		cancelledSingleId = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #168 <Field boolean cancelledSingleId>
		markAsCancelled();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #175 <Method void markAsCancelled()>
	//    5    9:return          
	}

	public void onCancel(int i)
	{
		job.onCancel(i, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Job job>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #149 <Field Throwable throwable>
	//    5    9:invokevirtual   #180 <Method void Job.onCancel(int, Throwable)>
	//    6   12:return          
	}

	int safeRun(int i, Timer timer)
	{
		return job.safeRun(this, i, timer);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Job job>
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #185 <Method int Job.safeRun(JobHolder, int, Timer)>
	//    6   10:ireturn         
	}

	public void setApplicationContext(Context context)
	{
		job.setApplicationContext(context);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Job job>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #189 <Method void Job.setApplicationContext(Context)>
	//    4    8:return          
	}

	public void setDeadlineIsReached(boolean flag)
	{
		job.setDeadlineReached(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Job job>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #194 <Method void Job.setDeadlineReached(boolean)>
	//    4    8:return          
	}

	public void setDelayUntilNs(long l)
	{
		delayUntilNs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #71  <Field long delayUntilNs>
	//    3    5:return          
	}

	public void setInsertionOrder(long l)
	{
		insertionOrder = Long.valueOf(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #203 <Method Long Long.valueOf(long)>
	//    3    5:putfield        #108 <Field Long insertionOrder>
	//    4    8:return          
	}

	public void setPriority(int i)
	{
		priority = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field int priority>
		job.priority = priority;
	//    3    5:aload_0         
	//    4    6:getfield        #73  <Field Job job>
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field int priority>
	//    7   13:putfield        #205 <Field int Job.priority>
	//    8   16:return          
	}

	public void setRunCount(int i)
	{
		runCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field int runCount>
	//    3    5:return          
	}

	public void setRunningSessionId(long l)
	{
		runningSessionId = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #75  <Field long runningSessionId>
	//    3    5:return          
	}

	void setThrowable(Throwable throwable1)
	{
		throwable = throwable1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #149 <Field Throwable throwable>
	//    3    5:return          
	}

	public boolean shouldCancelOnDeadline()
	{
		return cancelOnDeadline;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean cancelOnDeadline>
	//    2    4:ireturn         
	}

	public static final int RUN_RESULT_FAIL_FOR_CANCEL = 3;
	public static final int RUN_RESULT_FAIL_RUN_LIMIT = 2;
	public static final int RUN_RESULT_FAIL_SHOULD_RE_RUN = 5;
	public static final int RUN_RESULT_FAIL_SINGLE_ID = 6;
	public static final int RUN_RESULT_HIT_DEADLINE = 7;
	public static final int RUN_RESULT_SUCCESS = 1;
	public static final int RUN_RESULT_TRY_AGAIN = 4;
	private boolean cancelOnDeadline;
	private volatile boolean cancelled;
	private volatile boolean cancelledSingleId;
	private long createdNs;
	private long deadlineNs;
	private long delayUntilNs;
	public final String groupId;
	public final String id;
	private Long insertionOrder;
	final transient Job job;
	public final boolean persistent;
	private int priority;
	int requiredNetworkType;
	RetryConstraint retryConstraint;
	private int runCount;
	private long runningSessionId;
	protected final Set tags;
	private Throwable throwable;
}

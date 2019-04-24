// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.util.Set;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobHolder, Job

public static class JobHolder$Builder
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
		JobHolder jobholder = new JobHolder(id, persistent, priority, groupId, runCount, job, createdNs, delayUntilNs, runningSessionId, tags, requiredNetworkType, deadlineNs, cancelOnDeadline, ((JobHolder._cls1) (null)));
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

	public JobHolder$Builder createdNs(long l)
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

	public JobHolder$Builder deadline(long l, boolean flag)
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

	public JobHolder$Builder delayUntilNs(long l)
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

	public JobHolder$Builder groupId(String s)
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

	public JobHolder$Builder id(String s)
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

	public JobHolder$Builder insertionOrder(long l)
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

	public JobHolder$Builder job(Job job1)
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

	public JobHolder$Builder persistent(boolean flag)
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

	public JobHolder$Builder priority(int i)
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

	public JobHolder$Builder requiredNetworkType(int i)
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

	public JobHolder$Builder runCount(int i)
	{
		runCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int runCount>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JobHolder$Builder runningSessionId(long l)
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

	public JobHolder$Builder tags(Set set)
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

	public JobHolder$Builder()
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.util.Collections;
import java.util.HashSet;

public class Params
{

	public Params(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		requiredNetworkType = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #33  <Field int requiredNetworkType>
		groupId = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #35  <Field String groupId>
		singleId = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #37  <Field String singleId>
		persistent = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #39  <Field boolean persistent>
		deadlineMs = 0L;
	//   14   24:aload_0         
	//   15   25:lconst_0        
	//   16   26:putfield        #41  <Field long deadlineMs>
		priority = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #43  <Field int priority>
	//   20   34:return          
	}

	public transient Params addTags(String as[])
	{
		if(tags == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field HashSet tags>
	//*   2    4:ifnonnull       18
			tags = new HashSet();
	//    3    7:aload_0         
	//    4    8:new             #50  <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #51  <Method void HashSet()>
	//    7   15:putfield        #48  <Field HashSet tags>
		Collections.addAll(((java.util.Collection) (tags)), ((Object []) (as)));
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field HashSet tags>
	//   10   22:aload_1         
	//   11   23:invokestatic    #57  <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public Params clearTags()
	{
		tags = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #48  <Field HashSet tags>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Params delayInMs(long l)
	{
		delayMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #63  <Field long delayMs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Boolean getCancelOnDeadline()
	{
		return cancelOnDeadline;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Boolean cancelOnDeadline>
	//    2    4:areturn         
	}

	public long getDeadlineMs()
	{
		return deadlineMs;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long deadlineMs>
	//    2    4:lreturn         
	}

	public long getDelayMs()
	{
		return delayMs;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field long delayMs>
	//    2    4:lreturn         
	}

	public String getGroupId()
	{
		return groupId;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String groupId>
	//    2    4:areturn         
	}

	public int getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int priority>
	//    2    4:ireturn         
	}

	public String getSingleId()
	{
		return singleId;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String singleId>
	//    2    4:areturn         
	}

	public HashSet getTags()
	{
		return tags;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field HashSet tags>
	//    2    4:areturn         
	}

	public Params groupBy(String s)
	{
		groupId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String groupId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public boolean isNetworkRequired()
	{
		return requiredNetworkType >= 1;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int requiredNetworkType>
	//    2    4:iconst_1        
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isPersistent()
	{
		return persistent;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean persistent>
	//    2    4:ireturn         
	}

	public boolean isUnmeteredNetworkRequired()
	{
		return requiredNetworkType >= 2;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int requiredNetworkType>
	//    2    4:iconst_2        
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public Params overrideDeadlineToCancelInMs(long l)
	{
		if(Boolean.FALSE.equals(((Object) (cancelOnDeadline))))
	//*   0    0:getstatic       #93  <Field Boolean Boolean.FALSE>
	//*   1    3:aload_0         
	//*   2    4:getfield        #68  <Field Boolean cancelOnDeadline>
	//*   3    7:invokevirtual   #97  <Method boolean Boolean.equals(Object)>
	//*   4   10:ifeq            23
		{
			throw new IllegalArgumentException("cannot set deadline to cancel and run. You need to pick one");
	//    5   13:new             #99  <Class IllegalArgumentException>
	//    6   16:dup             
	//    7   17:ldc1            #101 <String "cannot set deadline to cancel and run. You need to pick one">
	//    8   19:invokespecial   #104 <Method void IllegalArgumentException(String)>
	//    9   22:athrow          
		} else
		{
			deadlineMs = l;
	//   10   23:aload_0         
	//   11   24:lload_1         
	//   12   25:putfield        #41  <Field long deadlineMs>
			cancelOnDeadline = Boolean.valueOf(true);
	//   13   28:aload_0         
	//   14   29:iconst_1        
	//   15   30:invokestatic    #108 <Method Boolean Boolean.valueOf(boolean)>
	//   16   33:putfield        #68  <Field Boolean cancelOnDeadline>
			return this;
	//   17   36:aload_0         
	//   18   37:areturn         
		}
	}

	public Params overrideDeadlineToRunInMs(long l)
	{
		if(Boolean.TRUE.equals(((Object) (cancelOnDeadline))))
	//*   0    0:getstatic       #112 <Field Boolean Boolean.TRUE>
	//*   1    3:aload_0         
	//*   2    4:getfield        #68  <Field Boolean cancelOnDeadline>
	//*   3    7:invokevirtual   #97  <Method boolean Boolean.equals(Object)>
	//*   4   10:ifeq            23
		{
			throw new IllegalArgumentException("cannot set deadline to cancel and run. You need to pick one");
	//    5   13:new             #99  <Class IllegalArgumentException>
	//    6   16:dup             
	//    7   17:ldc1            #101 <String "cannot set deadline to cancel and run. You need to pick one">
	//    8   19:invokespecial   #104 <Method void IllegalArgumentException(String)>
	//    9   22:athrow          
		} else
		{
			deadlineMs = l;
	//   10   23:aload_0         
	//   11   24:lload_1         
	//   12   25:putfield        #41  <Field long deadlineMs>
			cancelOnDeadline = Boolean.valueOf(false);
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:invokestatic    #108 <Method Boolean Boolean.valueOf(boolean)>
	//   16   33:putfield        #68  <Field Boolean cancelOnDeadline>
			return this;
	//   17   36:aload_0         
	//   18   37:areturn         
		}
	}

	public Params persist()
	{
		persistent = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #39  <Field boolean persistent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient Params removeTags(String as[])
	{
		if(tags != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field HashSet tags>
	//*   2    4:ifnonnull       9
	//*   3    7:aload_0         
	//*   4    8:areturn         
		{
			int j = as.length;
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:istore_3        
			int i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
			while(i < j) 
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          7
			{
				String s = as[i];
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:aaload          
	//   16   22:astore          4
				tags.remove(((Object) (s)));
	//   17   24:aload_0         
	//   18   25:getfield        #48  <Field HashSet tags>
	//   19   28:aload           4
	//   20   30:invokevirtual   #117 <Method boolean HashSet.remove(Object)>
	//   21   33:pop             
				i++;
	//   22   34:iload_2         
	//   23   35:iconst_1        
	//   24   36:iadd            
	//   25   37:istore_2        
			}
		}
		return this;
	//*  26   38:goto            14
	}

	public Params requireNetwork()
	{
		if(requiredNetworkType != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int requiredNetworkType>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          13
			requiredNetworkType = 1;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #33  <Field int requiredNetworkType>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public Params requireUnmeteredNetwork()
	{
		requiredNetworkType = 2;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:putfield        #33  <Field int requiredNetworkType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Params setDelayMs(long l)
	{
		delayMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #63  <Field long delayMs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Params setGroupId(String s)
	{
		groupId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String groupId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Params setPersistent(boolean flag)
	{
		persistent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean persistent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Params setRequiresNetwork(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            18
		{
			if(requiredNetworkType == 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field int requiredNetworkType>
	//*   4    8:ifne            16
				requiredNetworkType = 1;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #33  <Field int requiredNetworkType>
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			requiredNetworkType = 0;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #33  <Field int requiredNetworkType>
			return this;
	//   13   23:aload_0         
	//   14   24:areturn         
		}
	}

	public Params setRequiresUnmeteredNetwork(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			requiredNetworkType = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #33  <Field int requiredNetworkType>
		else
	//*   5    9:aload_0         
	//*   6   10:areturn         
		if(requiredNetworkType != 1)
	//*   7   11:aload_0         
	//*   8   12:getfield        #33  <Field int requiredNetworkType>
	//*   9   15:iconst_1        
	//*  10   16:icmpeq          9
		{
			requiredNetworkType = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #33  <Field int requiredNetworkType>
			return this;
	//   14   24:aload_0         
	//   15   25:areturn         
		}
		return this;
	}

	public Params setSingleId(String s)
	{
		singleId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String singleId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public boolean shouldCancelOnDeadline()
	{
		return Boolean.TRUE.equals(((Object) (cancelOnDeadline)));
	//    0    0:getstatic       #112 <Field Boolean Boolean.TRUE>
	//    1    3:aload_0         
	//    2    4:getfield        #68  <Field Boolean cancelOnDeadline>
	//    3    7:invokevirtual   #97  <Method boolean Boolean.equals(Object)>
	//    4   10:ireturn         
	}

	public Params singleInstanceBy(String s)
	{
		singleId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String singleId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final long FOREVER = 0xffffffffL;
	public static final long NEVER = 0x0L;
	private Boolean cancelOnDeadline;
	private long deadlineMs;
	private long delayMs;
	private String groupId;
	private boolean persistent;
	private int priority;
	int requiredNetworkType;
	private String singleId;
	private HashSet tags;
}

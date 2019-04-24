// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.inMemoryQueue;

import com.birbit.android.jobqueue.*;
import com.birbit.android.jobqueue.config.Configuration;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class SimpleInMemoryPriorityQueue
	implements JobQueue
{

	public SimpleInMemoryPriorityQueue(Configuration configuration, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class TreeSet>
	//    4    8:dup             
	//    5    9:new             #8   <Class SimpleInMemoryPriorityQueue$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #31  <Method void SimpleInMemoryPriorityQueue$1(SimpleInMemoryPriorityQueue)>
	//    9   17:invokespecial   #34  <Method void TreeSet(Comparator)>
	//   10   20:putfield        #36  <Field TreeSet jobs>
	//   11   23:aload_0         
	//   12   24:new             #38  <Class HashMap>
	//   13   27:dup             
	//   14   28:invokespecial   #39  <Method void HashMap()>
	//   15   31:putfield        #41  <Field Map idCache>
	//   16   34:aload_0         
	//   17   35:new             #43  <Class AtomicLong>
	//   18   38:dup             
	//   19   39:lconst_0        
	//   20   40:invokespecial   #46  <Method void AtomicLong(long)>
	//   21   43:putfield        #48  <Field AtomicLong insertionOrderCounter>
	//   22   46:aload_0         
	//   23   47:new             #50  <Class ArrayList>
	//   24   50:dup             
	//   25   51:invokespecial   #51  <Method void ArrayList()>
	//   26   54:putfield        #53  <Field List reusedList>
		sessionId = l;
	//   27   57:aload_0         
	//   28   58:lload_2         
	//   29   59:putfield        #55  <Field long sessionId>
	//   30   62:return          
	}

	private static boolean matches(JobHolder jobholder, Constraint constraint, boolean flag)
	{
		boolean flag1;
		if(constraint.getNowInNs() >= jobholder.getDeadlineNs() || flag && jobholder.hasDeadline())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #64  <Method long Constraint.getNowInNs()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #69  <Method long JobHolder.getDeadlineNs()>
	//*   4    8:lcmp            
	//*   5    9:ifge            23
	//*   6   12:iload_2         
	//*   7   13:ifeq            42
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #73  <Method boolean JobHolder.hasDeadline()>
	//*  10   20:ifeq            42
			flag1 = true;
	//   11   23:iconst_1        
	//   12   24:istore_3        
		else
	//*  13   25:iload_3         
	//*  14   26:ifne            47
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #77  <Method int Constraint.getMaxNetworkType()>
	//*  17   33:aload_0         
	//*  18   34:invokevirtual   #80  <Method int JobHolder.getRequiredNetworkType()>
	//*  19   37:icmpge          47
	//*  20   40:iconst_0        
	//*  21   41:ireturn         
			flag1 = false;
	//   22   42:iconst_0        
	//   23   43:istore_3        
		while(!flag1 && constraint.getMaxNetworkType() < jobholder.getRequiredNetworkType() || constraint.getTimeLimit() != null && jobholder.getDelayUntilNs() > constraint.getTimeLimit().longValue() || jobholder.getGroupId() != null && constraint.getExcludeGroups().contains(((Object) (jobholder.getGroupId()))) || constraint.getExcludeJobIds().contains(((Object) (jobholder.getId()))) || constraint.getTagConstraint() != null && (jobholder.getTags() == null || constraint.getTags().isEmpty() || !constraint.getTagConstraint().matches(((java.util.Collection) (constraint.getTags())), jobholder.getTags()))) 
			return false;
	//   24   44:goto            25
	//   25   47:aload_1         
	//   26   48:invokevirtual   #84  <Method Long Constraint.getTimeLimit()>
	//   27   51:ifnull          69
	//   28   54:aload_0         
	//   29   55:invokevirtual   #87  <Method long JobHolder.getDelayUntilNs()>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #84  <Method Long Constraint.getTimeLimit()>
	//   32   62:invokevirtual   #92  <Method long Long.longValue()>
	//   33   65:lcmp            
	//   34   66:ifgt            40
	//   35   69:aload_0         
	//   36   70:invokevirtual   #96  <Method String JobHolder.getGroupId()>
	//   37   73:ifnull          92
	//   38   76:aload_1         
	//   39   77:invokevirtual   #100 <Method List Constraint.getExcludeGroups()>
	//   40   80:aload_0         
	//   41   81:invokevirtual   #96  <Method String JobHolder.getGroupId()>
	//   42   84:invokeinterface #106 <Method boolean List.contains(Object)>
	//   43   89:ifne            40
	//   44   92:aload_1         
	//   45   93:invokevirtual   #109 <Method List Constraint.getExcludeJobIds()>
	//   46   96:aload_0         
	//   47   97:invokevirtual   #112 <Method String JobHolder.getId()>
	//   48  100:invokeinterface #106 <Method boolean List.contains(Object)>
	//   49  105:ifne            40
	//   50  108:aload_1         
	//   51  109:invokevirtual   #116 <Method TagConstraint Constraint.getTagConstraint()>
	//   52  112:ifnull          152
	//   53  115:aload_0         
	//   54  116:invokevirtual   #120 <Method Set JobHolder.getTags()>
	//   55  119:ifnull          40
	//   56  122:aload_1         
	//   57  123:invokevirtual   #121 <Method Set Constraint.getTags()>
	//   58  126:invokeinterface #126 <Method boolean Set.isEmpty()>
	//   59  131:ifne            40
	//   60  134:aload_1         
	//   61  135:invokevirtual   #116 <Method TagConstraint Constraint.getTagConstraint()>
	//   62  138:aload_1         
	//   63  139:invokevirtual   #121 <Method Set Constraint.getTags()>
	//   64  142:aload_0         
	//   65  143:invokevirtual   #120 <Method Set JobHolder.getTags()>
	//   66  146:invokevirtual   #131 <Method boolean TagConstraint.matches(java.util.Collection, Set)>
	//   67  149:ifeq            40
		return true;
	//   68  152:iconst_1        
	//   69  153:ireturn         
	}

	public void clear()
	{
		jobs.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TreeSet jobs>
	//    2    4:invokevirtual   #134 <Method void TreeSet.clear()>
		idCache.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Map idCache>
	//    5   11:invokeinterface #137 <Method void Map.clear()>
	//    6   16:return          
	}

	public int count()
	{
		return jobs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TreeSet jobs>
	//    2    4:invokevirtual   #141 <Method int TreeSet.size()>
	//    3    7:ireturn         
	}

	public int countReadyJobs(Constraint constraint)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		reusedList.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #53  <Field List reusedList>
	//    4    6:invokeinterface #145 <Method void List.clear()>
		Iterator iterator = jobs.iterator();
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field TreeSet jobs>
	//    7   15:invokevirtual   #149 <Method Iterator TreeSet.iterator()>
	//    8   18:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   20:aload           4
	//   10   22:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            106
			JobHolder jobholder = (JobHolder)iterator.next();
	//   12   30:aload           4
	//   13   32:invokeinterface #158 <Method Object Iterator.next()>
	//   14   37:checkcast       #66  <Class JobHolder>
	//   15   40:astore          5
			String s = jobholder.getGroupId();
	//   16   42:aload           5
	//   17   44:invokevirtual   #96  <Method String JobHolder.getGroupId()>
	//   18   47:astore          6
			if((s == null || !reusedList.contains(((Object) (s)))) && matches(jobholder, constraint, false))
	//*  19   49:aload           6
	//*  20   51:ifnull          68
	//*  21   54:aload_0         
	//*  22   55:getfield        #53  <Field List reusedList>
	//*  23   58:aload           6
	//*  24   60:invokeinterface #106 <Method boolean List.contains(Object)>
	//*  25   65:ifne            20
	//*  26   68:aload           5
	//*  27   70:aload_1         
	//*  28   71:iconst_0        
	//*  29   72:invokestatic    #160 <Method boolean matches(JobHolder, Constraint, boolean)>
	//*  30   75:ifeq            20
			{
				int j = i + 1;
	//   31   78:iload_2         
	//   32   79:iconst_1        
	//   33   80:iadd            
	//   34   81:istore_3        
				i = j;
	//   35   82:iload_3         
	//   36   83:istore_2        
				if(s != null)
	//*  37   84:aload           6
	//*  38   86:ifnull          20
				{
					reusedList.add(((Object) (s)));
	//   39   89:aload_0         
	//   40   90:getfield        #53  <Field List reusedList>
	//   41   93:aload           6
	//   42   95:invokeinterface #163 <Method boolean List.add(Object)>
	//   43  100:pop             
					i = j;
	//   44  101:iload_3         
	//   45  102:istore_2        
				}
			}
		} while(true);
	//   46  103:goto            20
		reusedList.clear();
	//   47  106:aload_0         
	//   48  107:getfield        #53  <Field List reusedList>
	//   49  110:invokeinterface #145 <Method void List.clear()>
		return i;
	//   50  115:iload_2         
	//   51  116:ireturn         
	}

	public JobHolder findJobById(String s)
	{
		return (JobHolder)idCache.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Map idCache>
	//    2    4:aload_1         
	//    3    5:invokeinterface #170 <Method Object Map.get(Object)>
	//    4   10:checkcast       #66  <Class JobHolder>
	//    5   13:areturn         
	}

	public Set findJobs(Constraint constraint)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #174 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #175 <Method void HashSet()>
	//    3    7:astore_2        
		Iterator iterator = jobs.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field TreeSet jobs>
	//    6   12:invokevirtual   #149 <Method Iterator TreeSet.iterator()>
	//    7   15:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   16:aload_3         
	//    9   17:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            58
			JobHolder jobholder = (JobHolder)iterator.next();
	//   11   25:aload_3         
	//   12   26:invokeinterface #158 <Method Object Iterator.next()>
	//   13   31:checkcast       #66  <Class JobHolder>
	//   14   34:astore          4
			if(matches(jobholder, constraint, false))
	//*  15   36:aload           4
	//*  16   38:aload_1         
	//*  17   39:iconst_0        
	//*  18   40:invokestatic    #160 <Method boolean matches(JobHolder, Constraint, boolean)>
	//*  19   43:ifeq            16
				((Set) (hashset)).add(((Object) (jobholder)));
	//   20   46:aload_2         
	//   21   47:aload           4
	//   22   49:invokeinterface #176 <Method boolean Set.add(Object)>
	//   23   54:pop             
		} while(true);
	//   24   55:goto            16
		return ((Set) (hashset));
	//   25   58:aload_2         
	//   26   59:areturn         
	}

	public Long getNextJobDelayUntilNs(Constraint constraint)
	{
		Long long1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Iterator iterator = jobs.iterator();
	//    2    3:aload_0         
	//    3    4:getfield        #36  <Field TreeSet jobs>
	//    4    7:invokevirtual   #149 <Method Iterator TreeSet.iterator()>
	//    5   10:astore          7
		do
			if(iterator.hasNext())
	//*   6   12:aload           7
	//*   7   14:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*   8   19:ifeq            145
			{
				JobHolder jobholder = (JobHolder)iterator.next();
	//    9   22:aload           7
	//   10   24:invokeinterface #158 <Method Object Iterator.next()>
	//   11   29:checkcast       #66  <Class JobHolder>
	//   12   32:astore          8
				if(matches(jobholder, constraint, true))
	//*  13   34:aload           8
	//*  14   36:aload_1         
	//*  15   37:iconst_1        
	//*  16   38:invokestatic    #160 <Method boolean matches(JobHolder, Constraint, boolean)>
	//*  17   41:ifeq            12
				{
					boolean flag;
					boolean flag1;
					long l;
					if(jobholder.hasDelay() && matches(jobholder, constraint, false))
	//*  18   44:aload           8
	//*  19   46:invokevirtual   #184 <Method boolean JobHolder.hasDelay()>
	//*  20   49:ifeq            116
	//*  21   52:aload           8
	//*  22   54:aload_1         
	//*  23   55:iconst_0        
	//*  24   56:invokestatic    #160 <Method boolean matches(JobHolder, Constraint, boolean)>
	//*  25   59:ifeq            116
						flag = true;
	//   26   62:iconst_1        
	//   27   63:istore_2        
					else
	//*  28   64:aload           8
	//*  29   66:invokevirtual   #73  <Method boolean JobHolder.hasDeadline()>
	//*  30   69:istore_3        
	//*  31   70:iload_3         
	//*  32   71:iload_2         
	//*  33   72:icmpne          121
	//*  34   75:aload           8
	//*  35   77:invokevirtual   #69  <Method long JobHolder.getDeadlineNs()>
	//*  36   80:aload           8
	//*  37   82:invokevirtual   #87  <Method long JobHolder.getDelayUntilNs()>
	//*  38   85:invokestatic    #190 <Method long Math.min(long, long)>
	//*  39   88:lstore          4
	//*  40   90:aload           6
	//*  41   92:ifnull          106
	//*  42   95:lload           4
	//*  43   97:aload           6
	//*  44   99:invokevirtual   #92  <Method long Long.longValue()>
	//*  45  102:lcmp            
	//*  46  103:ifge            12
	//*  47  106:lload           4
	//*  48  108:invokestatic    #194 <Method Long Long.valueOf(long)>
	//*  49  111:astore          6
	//*  50  113:goto            12
						flag = false;
	//   51  116:iconst_0        
	//   52  117:istore_2        
					flag1 = jobholder.hasDeadline();
					if(flag1 == flag)
						l = Math.min(jobholder.getDeadlineNs(), jobholder.getDelayUntilNs());
					else
	//*  53  118:goto            64
					if(flag1)
	//*  54  121:iload_3         
	//*  55  122:ifeq            135
						l = jobholder.getDeadlineNs();
	//   56  125:aload           8
	//   57  127:invokevirtual   #69  <Method long JobHolder.getDeadlineNs()>
	//   58  130:lstore          4
					else
	//*  59  132:goto            90
						l = jobholder.getDelayUntilNs();
	//   60  135:aload           8
	//   61  137:invokevirtual   #87  <Method long JobHolder.getDelayUntilNs()>
	//   62  140:lstore          4
					if(long1 == null || l < long1.longValue())
						long1 = Long.valueOf(l);
				}
			} else
	//*  63  142:goto            90
			{
				return long1;
	//   64  145:aload           6
	//   65  147:areturn         
			}
		while(true);
	}

	public boolean insert(JobHolder jobholder)
	{
		jobholder.setInsertionOrder(insertionOrderCounter.incrementAndGet());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field AtomicLong insertionOrderCounter>
	//    3    5:invokevirtual   #199 <Method long AtomicLong.incrementAndGet()>
	//    4    8:invokevirtual   #202 <Method void JobHolder.setInsertionOrder(long)>
		if((JobHolder)idCache.get(((Object) (jobholder.getId()))) != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #41  <Field Map idCache>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #112 <Method String JobHolder.getId()>
	//*   9   19:invokeinterface #170 <Method Object Map.get(Object)>
	//*  10   24:checkcast       #66  <Class JobHolder>
	//*  11   27:ifnull          40
		{
			throw new IllegalArgumentException("cannot add a job with the same id twice");
	//   12   30:new             #204 <Class IllegalArgumentException>
	//   13   33:dup             
	//   14   34:ldc1            #206 <String "cannot add a job with the same id twice">
	//   15   36:invokespecial   #209 <Method void IllegalArgumentException(String)>
	//   16   39:athrow          
		} else
		{
			idCache.put(((Object) (jobholder.getId())), ((Object) (jobholder)));
	//   17   40:aload_0         
	//   18   41:getfield        #41  <Field Map idCache>
	//   19   44:aload_1         
	//   20   45:invokevirtual   #112 <Method String JobHolder.getId()>
	//   21   48:aload_1         
	//   22   49:invokeinterface #213 <Method Object Map.put(Object, Object)>
	//   23   54:pop             
			jobs.add(((Object) (jobholder)));
	//   24   55:aload_0         
	//   25   56:getfield        #36  <Field TreeSet jobs>
	//   26   59:aload_1         
	//   27   60:invokevirtual   #214 <Method boolean TreeSet.add(Object)>
	//   28   63:pop             
			return true;
	//   29   64:iconst_1        
	//   30   65:ireturn         
		}
	}

	public boolean insertOrReplace(JobHolder jobholder)
	{
		if(jobholder.getInsertionOrder() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #218 <Method Long JobHolder.getInsertionOrder()>
	//*   2    4:ifnonnull       13
			return insert(jobholder);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #220 <Method boolean insert(JobHolder)>
	//    6   12:ireturn         
		JobHolder jobholder1 = (JobHolder)idCache.get(((Object) (jobholder.getId())));
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field Map idCache>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #112 <Method String JobHolder.getId()>
	//   11   21:invokeinterface #170 <Method Object Map.get(Object)>
	//   12   26:checkcast       #66  <Class JobHolder>
	//   13   29:astore_2        
		if(jobholder1 != null)
	//*  14   30:aload_2         
	//*  15   31:ifnull          39
			remove(jobholder1);
	//   16   34:aload_0         
	//   17   35:aload_2         
	//   18   36:invokevirtual   #224 <Method void remove(JobHolder)>
		idCache.put(((Object) (jobholder.getId())), ((Object) (jobholder)));
	//   19   39:aload_0         
	//   20   40:getfield        #41  <Field Map idCache>
	//   21   43:aload_1         
	//   22   44:invokevirtual   #112 <Method String JobHolder.getId()>
	//   23   47:aload_1         
	//   24   48:invokeinterface #213 <Method Object Map.put(Object, Object)>
	//   25   53:pop             
		jobs.add(((Object) (jobholder)));
	//   26   54:aload_0         
	//   27   55:getfield        #36  <Field TreeSet jobs>
	//   28   58:aload_1         
	//   29   59:invokevirtual   #214 <Method boolean TreeSet.add(Object)>
	//   30   62:pop             
		return true;
	//   31   63:iconst_1        
	//   32   64:ireturn         
	}

	public JobHolder nextJobAndIncRunCount(Constraint constraint)
	{
		for(Iterator iterator = jobs.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field TreeSet jobs>
	//*   2    4:invokevirtual   #149 <Method Iterator TreeSet.iterator()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            61
		{
			JobHolder jobholder = (JobHolder)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #158 <Method Object Iterator.next()>
	//    9   23:checkcast       #66  <Class JobHolder>
	//   10   26:astore_3        
			if(matches(jobholder, constraint, false))
	//*  11   27:aload_3         
	//*  12   28:aload_1         
	//*  13   29:iconst_0        
	//*  14   30:invokestatic    #160 <Method boolean matches(JobHolder, Constraint, boolean)>
	//*  15   33:ifeq            8
			{
				remove(jobholder);
	//   16   36:aload_0         
	//   17   37:aload_3         
	//   18   38:invokevirtual   #224 <Method void remove(JobHolder)>
				jobholder.setRunCount(jobholder.getRunCount() + 1);
	//   19   41:aload_3         
	//   20   42:aload_3         
	//   21   43:invokevirtual   #229 <Method int JobHolder.getRunCount()>
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:invokevirtual   #233 <Method void JobHolder.setRunCount(int)>
				jobholder.setRunningSessionId(sessionId);
	//   25   51:aload_3         
	//   26   52:aload_0         
	//   27   53:getfield        #55  <Field long sessionId>
	//   28   56:invokevirtual   #236 <Method void JobHolder.setRunningSessionId(long)>
				return jobholder;
	//   29   59:aload_3         
	//   30   60:areturn         
			}
		}

		return null;
	//   31   61:aconst_null     
	//   32   62:areturn         
	}

	public void onJobCancelled(JobHolder jobholder)
	{
		remove(jobholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #224 <Method void remove(JobHolder)>
	//    3    5:return          
	}

	public void remove(JobHolder jobholder)
	{
		idCache.remove(((Object) (jobholder.getId())));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Map idCache>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method String JobHolder.getId()>
	//    4    8:invokeinterface #239 <Method Object Map.remove(Object)>
	//    5   13:pop             
		jobs.remove(((Object) (jobholder)));
	//    6   14:aload_0         
	//    7   15:getfield        #36  <Field TreeSet jobs>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #241 <Method boolean TreeSet.remove(Object)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void substitute(JobHolder jobholder, JobHolder jobholder1)
	{
		remove(jobholder1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #224 <Method void remove(JobHolder)>
		insert(jobholder);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #220 <Method boolean insert(JobHolder)>
	//    6   10:pop             
	//    7   11:return          
	}

	private final Map idCache = new HashMap();
	private final AtomicLong insertionOrderCounter = new AtomicLong(0L);
	private final TreeSet jobs = new TreeSet(new Comparator() {

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

		private int compareLong(long l1, long l2)
		{
			if(l1 > l2)
		//*   0    0:lload_1         
		//*   1    1:lload_3         
		//*   2    2:lcmp            
		//*   3    3:ifle            8
				return -1;
		//    4    6:iconst_m1       
		//    5    7:ireturn         
			return l2 <= l1 ? 0 : 1;
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
);
	private final List reusedList = new ArrayList();
	private final long sessionId;
}

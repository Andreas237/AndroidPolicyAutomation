// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.cachedQueue;

import com.birbit.android.jobqueue.*;
import java.util.Set;

public class CachedJobQueue
	implements JobQueue
{

	public CachedJobQueue(JobQueue jobqueue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		_flddelegate = jobqueue;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field JobQueue _flddelegate>
	//    5    9:return          
	}

	private void invalidateCache()
	{
		cachedCount = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #21  <Field Integer cachedCount>
	//    3    5:return          
	}

	private boolean isEmpty()
	{
		return cachedCount != null && cachedCount.intValue() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Integer cachedCount>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Integer cachedCount>
	//    5   11:invokevirtual   #29  <Method int Integer.intValue()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void clear()
	{
		invalidateCache();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void invalidateCache()>
		_flddelegate.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field JobQueue _flddelegate>
	//    4    8:invokeinterface #34  <Method void JobQueue.clear()>
	//    5   13:return          
	}

	public int count()
	{
		if(cachedCount == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Integer cachedCount>
	//*   2    4:ifnonnull       23
			cachedCount = Integer.valueOf(_flddelegate.count());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field JobQueue _flddelegate>
	//    6   12:invokeinterface #37  <Method int JobQueue.count()>
	//    7   17:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//    8   20:putfield        #21  <Field Integer cachedCount>
		return cachedCount.intValue();
	//    9   23:aload_0         
	//   10   24:getfield        #21  <Field Integer cachedCount>
	//   11   27:invokevirtual   #29  <Method int Integer.intValue()>
	//   12   30:ireturn         
	}

	public int countReadyJobs(Constraint constraint)
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #46  <Method boolean isEmpty()>
	//*   2    4:ifeq            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _flddelegate.countReadyJobs(constraint);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field JobQueue _flddelegate>
	//    7   13:aload_1         
	//    8   14:invokeinterface #48  <Method int JobQueue.countReadyJobs(Constraint)>
	//    9   19:ireturn         
	}

	public JobHolder findJobById(String s)
	{
		return _flddelegate.findJobById(s);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JobQueue _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #54  <Method JobHolder JobQueue.findJobById(String)>
	//    4   10:areturn         
	}

	public Set findJobs(Constraint constraint)
	{
		return _flddelegate.findJobs(constraint);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JobQueue _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #59  <Method Set JobQueue.findJobs(Constraint)>
	//    4   10:areturn         
	}

	public Long getNextJobDelayUntilNs(Constraint constraint)
	{
		return _flddelegate.getNextJobDelayUntilNs(constraint);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JobQueue _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #65  <Method Long JobQueue.getNextJobDelayUntilNs(Constraint)>
	//    4   10:areturn         
	}

	public boolean insert(JobHolder jobholder)
	{
		invalidateCache();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void invalidateCache()>
		return _flddelegate.insert(jobholder);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field JobQueue _flddelegate>
	//    4    8:aload_1         
	//    5    9:invokeinterface #69  <Method boolean JobQueue.insert(JobHolder)>
	//    6   14:ireturn         
	}

	public boolean insertOrReplace(JobHolder jobholder)
	{
		invalidateCache();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void invalidateCache()>
		return _flddelegate.insertOrReplace(jobholder);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field JobQueue _flddelegate>
	//    4    8:aload_1         
	//    5    9:invokeinterface #72  <Method boolean JobQueue.insertOrReplace(JobHolder)>
	//    6   14:ireturn         
	}

	public JobHolder nextJobAndIncRunCount(Constraint constraint)
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #46  <Method boolean isEmpty()>
	//*   2    4:ifeq            11
		{
			constraint = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		} else
	//*   5    9:aload_1         
	//*   6   10:areturn         
		{
			JobHolder jobholder = _flddelegate.nextJobAndIncRunCount(constraint);
	//    7   11:aload_0         
	//    8   12:getfield        #17  <Field JobQueue _flddelegate>
	//    9   15:aload_1         
	//   10   16:invokeinterface #76  <Method JobHolder JobQueue.nextJobAndIncRunCount(Constraint)>
	//   11   21:astore_2        
			constraint = ((Constraint) (jobholder));
	//   12   22:aload_2         
	//   13   23:astore_1        
			if(jobholder != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          9
			{
				constraint = ((Constraint) (jobholder));
	//   16   28:aload_2         
	//   17   29:astore_1        
				if(cachedCount != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #21  <Field Integer cachedCount>
	//*  20   34:ifnull          9
				{
					cachedCount = Integer.valueOf(cachedCount.intValue() - 1);
	//   21   37:aload_0         
	//   22   38:aload_0         
	//   23   39:getfield        #21  <Field Integer cachedCount>
	//   24   42:invokevirtual   #29  <Method int Integer.intValue()>
	//   25   45:iconst_1        
	//   26   46:isub            
	//   27   47:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   28   50:putfield        #21  <Field Integer cachedCount>
					return jobholder;
	//   29   53:aload_2         
	//   30   54:areturn         
				}
			}
		}
		return ((JobHolder) (constraint));
	}

	public void onJobCancelled(JobHolder jobholder)
	{
		invalidateCache();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void invalidateCache()>
		_flddelegate.onJobCancelled(jobholder);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field JobQueue _flddelegate>
	//    4    8:aload_1         
	//    5    9:invokeinterface #80  <Method void JobQueue.onJobCancelled(JobHolder)>
	//    6   14:return          
	}

	public void remove(JobHolder jobholder)
	{
		invalidateCache();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void invalidateCache()>
		_flddelegate.remove(jobholder);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field JobQueue _flddelegate>
	//    4    8:aload_1         
	//    5    9:invokeinterface #83  <Method void JobQueue.remove(JobHolder)>
	//    6   14:return          
	}

	public void substitute(JobHolder jobholder, JobHolder jobholder1)
	{
		invalidateCache();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void invalidateCache()>
		_flddelegate.substitute(jobholder, jobholder1);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field JobQueue _flddelegate>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #87  <Method void JobQueue.substitute(JobHolder, JobHolder)>
	//    7   15:return          
	}

	private Integer cachedCount;
	private JobQueue _flddelegate;
}

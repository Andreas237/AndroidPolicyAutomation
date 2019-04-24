// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.*;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobHolder, Job, JobManagerThread, JobQueue, 
//			CancelResult, CallbackManager, ConsumerManager, Constraint, 
//			TagConstraint

class CancelHandler
{

	CancelHandler(TagConstraint tagconstraint, String as[], CancelResult.AsyncCancelCallback asynccancelcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		tagConstraint = tagconstraint;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field TagConstraint tagConstraint>
		tags = as;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String[] tags>
	//    8   14:aload_0         
	//    9   15:new             #28  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #29  <Method void ArrayList()>
	//   12   22:putfield        #31  <Field Collection cancelled>
	//   13   25:aload_0         
	//   14   26:new             #28  <Class ArrayList>
	//   15   29:dup             
	//   16   30:invokespecial   #29  <Method void ArrayList()>
	//   17   33:putfield        #33  <Field Collection failedToCancel>
		callback = asynccancelcallback;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #35  <Field CancelResult$AsyncCancelCallback callback>
	//   21   41:return          
	}

	void commit(JobManagerThread jobmanagerthread)
	{
		Iterator iterator = cancelled.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Collection cancelled>
	//    2    4:invokeinterface #46  <Method Iterator Collection.iterator()>
	//    3    9:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   10:aload_2         
	//    5   11:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            73
			JobHolder jobholder = (JobHolder)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #56  <Method Object Iterator.next()>
	//    9   25:checkcast       #58  <Class JobHolder>
	//   10   28:astore_3        
			try
			{
				jobholder.onCancel(3);
	//   11   29:aload_3         
	//   12   30:iconst_3        
	//   13   31:invokevirtual   #62  <Method void JobHolder.onCancel(int)>
			}
	//*  14   34:aload_3         
	//*  15   35:invokevirtual   #66  <Method Job JobHolder.getJob()>
	//*  16   38:invokevirtual   #71  <Method boolean Job.isPersistent()>
	//*  17   41:ifeq            10
	//*  18   44:aload_1         
	//*  19   45:getfield        #77  <Field JobQueue JobManagerThread.persistentJobQueue>
	//*  20   48:aload_3         
	//*  21   49:invokeinterface #83  <Method void JobQueue.remove(JobHolder)>
	//*  22   54:goto            10
			catch(Throwable throwable)
	//*  23   57:astore          4
			{
				JqLog.e(throwable, "job's on cancel has thrown an exception. Ignoring...", new Object[0]);
	//   24   59:aload           4
	//   25   61:ldc1            #85  <String "job's on cancel has thrown an exception. Ignoring...">
	//   26   63:iconst_0        
	//   27   64:anewarray       Object[]
	//   28   67:invokestatic    #91  <Method void JqLog.e(Throwable, String, Object[])>
			}
			if(jobholder.getJob().isPersistent())
				jobmanagerthread.persistentJobQueue.remove(jobholder);
		} while(true);
	//*  29   70:goto            34
		if(callback != null)
	//*  30   73:aload_0         
	//*  31   74:getfield        #35  <Field CancelResult$AsyncCancelCallback callback>
	//*  32   77:ifnull          224
		{
			Object obj = ((Object) (new ArrayList(cancelled.size())));
	//   33   80:new             #28  <Class ArrayList>
	//   34   83:dup             
	//   35   84:aload_0         
	//   36   85:getfield        #31  <Field Collection cancelled>
	//   37   88:invokeinterface #95  <Method int Collection.size()>
	//   38   93:invokespecial   #97  <Method void ArrayList(int)>
	//   39   96:astore_2        
			ArrayList arraylist = new ArrayList(failedToCancel.size());
	//   40   97:new             #28  <Class ArrayList>
	//   41  100:dup             
	//   42  101:aload_0         
	//   43  102:getfield        #33  <Field Collection failedToCancel>
	//   44  105:invokeinterface #95  <Method int Collection.size()>
	//   45  110:invokespecial   #97  <Method void ArrayList(int)>
	//   46  113:astore_3        
			for(Iterator iterator2 = cancelled.iterator(); iterator2.hasNext(); ((Collection) (obj)).add(((Object) (((JobHolder)iterator2.next()).getJob()))));
	//   47  114:aload_0         
	//   48  115:getfield        #31  <Field Collection cancelled>
	//   49  118:invokeinterface #46  <Method Iterator Collection.iterator()>
	//   50  123:astore          4
	//   51  125:aload           4
	//   52  127:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//   53  132:ifeq            158
	//   54  135:aload_2         
	//   55  136:aload           4
	//   56  138:invokeinterface #56  <Method Object Iterator.next()>
	//   57  143:checkcast       #58  <Class JobHolder>
	//   58  146:invokevirtual   #66  <Method Job JobHolder.getJob()>
	//   59  149:invokeinterface #101 <Method boolean Collection.add(Object)>
	//   60  154:pop             
	//*  61  155:goto            125
			for(Iterator iterator3 = failedToCancel.iterator(); iterator3.hasNext(); ((Collection) (arraylist)).add(((Object) (((JobHolder)iterator3.next()).getJob()))));
	//   62  158:aload_0         
	//   63  159:getfield        #33  <Field Collection failedToCancel>
	//   64  162:invokeinterface #46  <Method Iterator Collection.iterator()>
	//   65  167:astore          4
	//   66  169:aload           4
	//   67  171:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//   68  176:ifeq            202
	//   69  179:aload_3         
	//   70  180:aload           4
	//   71  182:invokeinterface #56  <Method Object Iterator.next()>
	//   72  187:checkcast       #58  <Class JobHolder>
	//   73  190:invokevirtual   #66  <Method Job JobHolder.getJob()>
	//   74  193:invokeinterface #101 <Method boolean Collection.add(Object)>
	//   75  198:pop             
	//*  76  199:goto            169
			obj = ((Object) (new CancelResult(((Collection) (obj)), ((Collection) (arraylist)))));
	//   77  202:new             #103 <Class CancelResult>
	//   78  205:dup             
	//   79  206:aload_2         
	//   80  207:aload_3         
	//   81  208:invokespecial   #106 <Method void CancelResult(Collection, Collection)>
	//   82  211:astore_2        
			jobmanagerthread.callbackManager.notifyCancelResult(((CancelResult) (obj)), callback);
	//   83  212:aload_1         
	//   84  213:getfield        #110 <Field CallbackManager JobManagerThread.callbackManager>
	//   85  216:aload_2         
	//   86  217:aload_0         
	//   87  218:getfield        #35  <Field CancelResult$AsyncCancelCallback callback>
	//   88  221:invokevirtual   #116 <Method void CallbackManager.notifyCancelResult(CancelResult, CancelResult$AsyncCancelCallback)>
		}
		JobHolder jobholder1;
		for(Iterator iterator1 = cancelled.iterator(); iterator1.hasNext(); jobmanagerthread.callbackManager.notifyOnCancel(jobholder1.getJob(), true, jobholder1.getThrowable()))
	//*  89  224:aload_0         
	//*  90  225:getfield        #31  <Field Collection cancelled>
	//*  91  228:invokeinterface #46  <Method Iterator Collection.iterator()>
	//*  92  233:astore_2        
	//*  93  234:aload_2         
	//*  94  235:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*  95  240:ifeq            272
			jobholder1 = (JobHolder)iterator1.next();
	//   96  243:aload_2         
	//   97  244:invokeinterface #56  <Method Object Iterator.next()>
	//   98  249:checkcast       #58  <Class JobHolder>
	//   99  252:astore_3        

	//  100  253:aload_1         
	//  101  254:getfield        #110 <Field CallbackManager JobManagerThread.callbackManager>
	//  102  257:aload_3         
	//  103  258:invokevirtual   #66  <Method Job JobHolder.getJob()>
	//  104  261:iconst_1        
	//  105  262:aload_3         
	//  106  263:invokevirtual   #120 <Method Throwable JobHolder.getThrowable()>
	//  107  266:invokevirtual   #124 <Method void CallbackManager.notifyOnCancel(Job, boolean, Throwable)>
	//* 108  269:goto            234
	//  109  272:return          
	}

	boolean isDone()
	{
		return running.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field Set running>
	//    2    4:invokeinterface #132 <Method boolean Set.isEmpty()>
	//    3    9:ireturn         
	}

	void onJobRun(JobHolder jobholder, int i)
	{
label0:
		{
			if(running.remove(((Object) (jobholder.getId()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field Set running>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #138 <Method String JobHolder.getId()>
	//*   4    8:invokeinterface #140 <Method boolean Set.remove(Object)>
	//*   5   13:ifeq            32
			{
				if(i != 3)
					break label0;
	//    6   16:iload_2         
	//    7   17:iconst_3        
	//    8   18:icmpne          33
				cancelled.add(((Object) (jobholder)));
	//    9   21:aload_0         
	//   10   22:getfield        #31  <Field Collection cancelled>
	//   11   25:aload_1         
	//   12   26:invokeinterface #101 <Method boolean Collection.add(Object)>
	//   13   31:pop             
			}
			return;
	//   14   32:return          
		}
		failedToCancel.add(((Object) (jobholder)));
	//   15   33:aload_0         
	//   16   34:getfield        #33  <Field Collection failedToCancel>
	//   17   37:aload_1         
	//   18   38:invokeinterface #101 <Method boolean Collection.add(Object)>
	//   19   43:pop             
	//   20   44:return          
	}

	void query(JobManagerThread jobmanagerthread, ConsumerManager consumermanager)
	{
		running = consumermanager.markJobsCancelled(tagConstraint, tags);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field TagConstraint tagConstraint>
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field String[] tags>
	//    6   10:invokevirtual   #148 <Method Set ConsumerManager.markJobsCancelled(TagConstraint, String[])>
	//    7   13:putfield        #127 <Field Set running>
		consumermanager = ((ConsumerManager) (jobmanagerthread.queryConstraint));
	//    8   16:aload_1         
	//    9   17:getfield        #152 <Field Constraint JobManagerThread.queryConstraint>
	//   10   20:astore_2        
		((Constraint) (consumermanager)).clear();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #157 <Method void Constraint.clear()>
		((Constraint) (consumermanager)).setNowInNs(jobmanagerthread.timer.nanoTime());
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:getfield        #161 <Field Timer JobManagerThread.timer>
	//   16   30:invokeinterface #167 <Method long Timer.nanoTime()>
	//   17   35:invokevirtual   #171 <Method void Constraint.setNowInNs(long)>
		((Constraint) (consumermanager)).setTagConstraint(tagConstraint);
	//   18   38:aload_2         
	//   19   39:aload_0         
	//   20   40:getfield        #24  <Field TagConstraint tagConstraint>
	//   21   43:invokevirtual   #175 <Method void Constraint.setTagConstraint(TagConstraint)>
		((Constraint) (consumermanager)).setExcludeJobIds(((Collection) (running)));
	//   22   46:aload_2         
	//   23   47:aload_0         
	//   24   48:getfield        #127 <Field Set running>
	//   25   51:invokevirtual   #179 <Method void Constraint.setExcludeJobIds(Collection)>
		((Constraint) (consumermanager)).setTags(tags);
	//   26   54:aload_2         
	//   27   55:aload_0         
	//   28   56:getfield        #26  <Field String[] tags>
	//   29   59:invokevirtual   #183 <Method void Constraint.setTags(String[])>
		((Constraint) (consumermanager)).setExcludeRunning(true);
	//   30   62:aload_2         
	//   31   63:iconst_1        
	//   32   64:invokevirtual   #187 <Method void Constraint.setExcludeRunning(boolean)>
		((Constraint) (consumermanager)).setMaxNetworkType(2);
	//   33   67:aload_2         
	//   34   68:iconst_2        
	//   35   69:invokevirtual   #190 <Method void Constraint.setMaxNetworkType(int)>
		Object obj = ((Object) (jobmanagerthread.nonPersistentJobQueue.findJobs(((Constraint) (consumermanager)))));
	//   36   72:aload_1         
	//   37   73:getfield        #193 <Field JobQueue JobManagerThread.nonPersistentJobQueue>
	//   38   76:aload_2         
	//   39   77:invokeinterface #197 <Method Set JobQueue.findJobs(Constraint)>
	//   40   82:astore_3        
		consumermanager = ((ConsumerManager) (jobmanagerthread.persistentJobQueue.findJobs(((Constraint) (consumermanager)))));
	//   41   83:aload_1         
	//   42   84:getfield        #77  <Field JobQueue JobManagerThread.persistentJobQueue>
	//   43   87:aload_2         
	//   44   88:invokeinterface #197 <Method Set JobQueue.findJobs(Constraint)>
	//   45   93:astore_2        
		JobHolder jobholder1;
		for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); jobmanagerthread.nonPersistentJobQueue.onJobCancelled(jobholder1))
	//*  46   94:aload_3         
	//*  47   95:invokeinterface #198 <Method Iterator Set.iterator()>
	//*  48  100:astore_3        
	//*  49  101:aload_3         
	//*  50  102:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*  51  107:ifeq            152
		{
			jobholder1 = (JobHolder)((Iterator) (obj)).next();
	//   52  110:aload_3         
	//   53  111:invokeinterface #56  <Method Object Iterator.next()>
	//   54  116:checkcast       #58  <Class JobHolder>
	//   55  119:astore          4
			jobholder1.markAsCancelled();
	//   56  121:aload           4
	//   57  123:invokevirtual   #201 <Method void JobHolder.markAsCancelled()>
			cancelled.add(((Object) (jobholder1)));
	//   58  126:aload_0         
	//   59  127:getfield        #31  <Field Collection cancelled>
	//   60  130:aload           4
	//   61  132:invokeinterface #101 <Method boolean Collection.add(Object)>
	//   62  137:pop             
		}

	//   63  138:aload_1         
	//   64  139:getfield        #193 <Field JobQueue JobManagerThread.nonPersistentJobQueue>
	//   65  142:aload           4
	//   66  144:invokeinterface #204 <Method void JobQueue.onJobCancelled(JobHolder)>
	//*  67  149:goto            101
		JobHolder jobholder;
		for(consumermanager = ((ConsumerManager) (((Set) (consumermanager)).iterator())); ((Iterator) (consumermanager)).hasNext(); jobmanagerthread.persistentJobQueue.onJobCancelled(jobholder))
	//*  68  152:aload_2         
	//*  69  153:invokeinterface #198 <Method Iterator Set.iterator()>
	//*  70  158:astore_2        
	//*  71  159:aload_2         
	//*  72  160:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*  73  165:ifeq            206
		{
			jobholder = (JobHolder)((Iterator) (consumermanager)).next();
	//   74  168:aload_2         
	//   75  169:invokeinterface #56  <Method Object Iterator.next()>
	//   76  174:checkcast       #58  <Class JobHolder>
	//   77  177:astore_3        
			jobholder.markAsCancelled();
	//   78  178:aload_3         
	//   79  179:invokevirtual   #201 <Method void JobHolder.markAsCancelled()>
			cancelled.add(((Object) (jobholder)));
	//   80  182:aload_0         
	//   81  183:getfield        #31  <Field Collection cancelled>
	//   82  186:aload_3         
	//   83  187:invokeinterface #101 <Method boolean Collection.add(Object)>
	//   84  192:pop             
		}

	//   85  193:aload_1         
	//   86  194:getfield        #77  <Field JobQueue JobManagerThread.persistentJobQueue>
	//   87  197:aload_3         
	//   88  198:invokeinterface #204 <Method void JobQueue.onJobCancelled(JobHolder)>
	//*  89  203:goto            159
	//   90  206:return          
	}

	private final CancelResult.AsyncCancelCallback callback;
	private final Collection cancelled = new ArrayList();
	private final Collection failedToCancel = new ArrayList();
	private Set running;
	private final TagConstraint tagConstraint;
	private final String tags[];
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import android.content.Context;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.scheduling.SchedulerConstraint;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class BatchingScheduler extends Scheduler
{
	private static class ConstraintWrapper
	{

		final SchedulerConstraint constraint;
		final Long deadlineNs;
		final long delayUntilNs;

		public ConstraintWrapper(long l, Long long1, SchedulerConstraint schedulerconstraint)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			delayUntilNs = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #21  <Field long delayUntilNs>
			deadlineNs = long1;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #23  <Field Long deadlineNs>
			constraint = schedulerconstraint;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #25  <Field SchedulerConstraint constraint>
		//   11   20:return          
		}
	}


	public BatchingScheduler(Scheduler scheduler, Timer timer1)
	{
		this(scheduler, timer1, DEFAULT_BATCHING_PERIOD_IN_MS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #36  <Field long DEFAULT_BATCHING_PERIOD_IN_MS>
	//    4    6:invokespecial   #42  <Method void BatchingScheduler(Scheduler, Timer, long)>
	//    5    9:return          
	}

	public BatchingScheduler(Scheduler scheduler, Timer timer1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Scheduler()>
		constraints = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ArrayList()>
	//    6   12:putfield        #49  <Field List constraints>
		_flddelegate = scheduler;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #51  <Field Scheduler _flddelegate>
		timer = timer1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #53  <Field Timer timer>
		batchingDurationInMs = l;
	//   13   25:aload_0         
	//   14   26:lload_3         
	//   15   27:putfield        #55  <Field long batchingDurationInMs>
		batchingDurationInNs = TimeUnit.MILLISECONDS.toNanos(l);
	//   16   30:aload_0         
	//   17   31:getstatic       #58  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   18   34:lload_3         
	//   19   35:invokevirtual   #61  <Method long TimeUnit.toNanos(long)>
	//   20   38:putfield        #63  <Field long batchingDurationInNs>
	//   21   41:return          
	}

	private boolean addToConstraints(SchedulerConstraint schedulerconstraint)
	{
		long l;
label0:
		{
			l = timer.nanoTime();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Timer timer>
	//    2    4:invokeinterface #77  <Method long Timer.nanoTime()>
	//    3    9:lstore_2        
			long l1 = TimeUnit.MILLISECONDS.toNanos(schedulerconstraint.getDelayInMs());
	//    4   10:getstatic       #58  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #82  <Method long SchedulerConstraint.getDelayInMs()>
	//    7   17:invokevirtual   #61  <Method long TimeUnit.toNanos(long)>
	//    8   20:lstore          4
			Long long1;
			if(schedulerconstraint.getOverrideDeadlineInMs() == null)
	//*   9   22:aload_1         
	//*  10   23:invokevirtual   #86  <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//*  11   26:ifnonnull       91
				long1 = null;
	//   12   29:aconst_null     
	//   13   30:astore          8
			else
	//*  14   32:aload_0         
	//*  15   33:getfield        #49  <Field List constraints>
	//*  16   36:astore          9
	//*  17   38:aload           9
	//*  18   40:monitorenter    
	//*  19   41:aload_0         
	//*  20   42:getfield        #49  <Field List constraints>
	//*  21   45:invokeinterface #92  <Method Iterator List.iterator()>
	//*  22   50:astore          10
	//*  23   52:aload           10
	//*  24   54:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//*  25   59:ifeq            114
	//*  26   62:aload_0         
	//*  27   63:aload           10
	//*  28   65:invokeinterface #102 <Method Object Iterator.next()>
	//*  29   70:checkcast       #8   <Class BatchingScheduler$ConstraintWrapper>
	//*  30   73:aload_1         
	//*  31   74:lload           4
	//*  32   76:lload_2         
	//*  33   77:ladd            
	//*  34   78:aload           8
	//*  35   80:invokespecial   #106 <Method boolean covers(BatchingScheduler$ConstraintWrapper, SchedulerConstraint, long, Long)>
	//*  36   83:ifeq            52
	//*  37   86:aload           9
	//*  38   88:monitorexit     
	//*  39   89:iconst_0        
	//*  40   90:ireturn         
				long1 = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(schedulerconstraint.getOverrideDeadlineInMs().longValue()) + l);
	//   41   91:getstatic       #58  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   42   94:aload_1         
	//   43   95:invokevirtual   #86  <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//   44   98:invokevirtual   #111 <Method long Long.longValue()>
	//   45  101:invokevirtual   #61  <Method long TimeUnit.toNanos(long)>
	//   46  104:lload_2         
	//   47  105:ladd            
	//   48  106:invokestatic    #115 <Method Long Long.valueOf(long)>
	//   49  109:astore          8
			synchronized(constraints)
			{
				Iterator iterator = constraints.iterator();
				do
					if(!iterator.hasNext())
						break label0;
				while(!covers((ConstraintWrapper)iterator.next(), schedulerconstraint, l1 + l, long1));
			}
			return false;
		}
	//*  50  111:goto            32
		long l2;
		l2 = (1L + schedulerconstraint.getDelayInMs() / batchingDurationInMs) * batchingDurationInMs;
	//   51  114:lconst_1        
	//   52  115:aload_1         
	//   53  116:invokevirtual   #82  <Method long SchedulerConstraint.getDelayInMs()>
	//   54  119:aload_0         
	//   55  120:getfield        #55  <Field long batchingDurationInMs>
	//   56  123:ldiv            
	//   57  124:ladd            
	//   58  125:aload_0         
	//   59  126:getfield        #55  <Field long batchingDurationInMs>
	//   60  129:lmul            
	//   61  130:lstore          4
		schedulerconstraint.setDelayInMs(l2);
	//   62  132:aload_1         
	//   63  133:lload           4
	//   64  135:invokevirtual   #119 <Method void SchedulerConstraint.setDelayInMs(long)>
		Long long2 = null;
	//   65  138:aconst_null     
	//   66  139:astore          8
		List list1;
		if(schedulerconstraint.getOverrideDeadlineInMs() != null)
	//*  67  141:aload_1         
	//*  68  142:invokevirtual   #86  <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//*  69  145:ifnull          178
		{
			long2 = Long.valueOf((1L + schedulerconstraint.getOverrideDeadlineInMs().longValue() / batchingDurationInMs) * batchingDurationInMs);
	//   70  148:lconst_1        
	//   71  149:aload_1         
	//   72  150:invokevirtual   #86  <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//   73  153:invokevirtual   #111 <Method long Long.longValue()>
	//   74  156:aload_0         
	//   75  157:getfield        #55  <Field long batchingDurationInMs>
	//   76  160:ldiv            
	//   77  161:ladd            
	//   78  162:aload_0         
	//   79  163:getfield        #55  <Field long batchingDurationInMs>
	//   80  166:lmul            
	//   81  167:invokestatic    #115 <Method Long Long.valueOf(long)>
	//   82  170:astore          8
			schedulerconstraint.setOverrideDeadlineInMs(long2);
	//   83  172:aload_1         
	//   84  173:aload           8
	//   85  175:invokevirtual   #123 <Method void SchedulerConstraint.setOverrideDeadlineInMs(Long)>
		}
		list1 = constraints;
	//   86  178:aload_0         
	//   87  179:getfield        #49  <Field List constraints>
	//   88  182:astore          10
		l2 = TimeUnit.MILLISECONDS.toNanos(l2);
	//   89  184:getstatic       #58  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   90  187:lload           4
	//   91  189:invokevirtual   #61  <Method long TimeUnit.toNanos(long)>
	//   92  192:lstore          4
		if(long2 != null) goto _L2; else goto _L1
	//   93  194:aload           8
	//   94  196:ifnonnull       235
_L1:
		long2 = null;
	//   95  199:aconst_null     
	//   96  200:astore          8
_L4:
		list1.add(((Object) (new ConstraintWrapper(l2 + l, long2, schedulerconstraint))));
	//   97  202:aload           10
	//   98  204:new             #8   <Class BatchingScheduler$ConstraintWrapper>
	//   99  207:dup             
	//  100  208:lload           4
	//  101  210:lload_2         
	//  102  211:ladd            
	//  103  212:aload           8
	//  104  214:aload_1         
	//  105  215:invokespecial   #126 <Method void BatchingScheduler$ConstraintWrapper(long, Long, SchedulerConstraint)>
	//  106  218:invokeinterface #130 <Method boolean List.add(Object)>
	//  107  223:pop             
		list;
	//  108  224:aload           9
		JVM INSTR monitorexit ;
	//  109  226:monitorexit     
		return true;
	//  110  227:iconst_1        
	//  111  228:ireturn         
		schedulerconstraint;
	//  112  229:astore_1        
		list;
	//  113  230:aload           9
		JVM INSTR monitorexit ;
	//  114  232:monitorexit     
		throw schedulerconstraint;
	//  115  233:aload_1         
	//  116  234:athrow          
_L2:
		long l3 = TimeUnit.MILLISECONDS.toNanos(long2.longValue());
	//  117  235:getstatic       #58  <Field TimeUnit TimeUnit.MILLISECONDS>
	//  118  238:aload           8
	//  119  240:invokevirtual   #111 <Method long Long.longValue()>
	//  120  243:invokevirtual   #61  <Method long TimeUnit.toNanos(long)>
	//  121  246:lstore          6
		long2 = Long.valueOf(l3 + l);
	//  122  248:lload           6
	//  123  250:lload_2         
	//  124  251:ladd            
	//  125  252:invokestatic    #115 <Method Long Long.valueOf(long)>
	//  126  255:astore          8
		if(true) goto _L4; else goto _L3
	//  127  257:goto            202
_L3:
	}

	private boolean covers(ConstraintWrapper constraintwrapper, SchedulerConstraint schedulerconstraint, long l, Long long1)
	{
		if(constraintwrapper.constraint.getNetworkStatus() == schedulerconstraint.getNetworkStatus()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:getfield        #134 <Field SchedulerConstraint BatchingScheduler$ConstraintWrapper.constraint>
	//    2    4:invokevirtual   #138 <Method int SchedulerConstraint.getNetworkStatus()>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #138 <Method int SchedulerConstraint.getNetworkStatus()>
	//    5   11:icmpeq          16
_L1:
		return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
_L2:
		if(long1 == null)
			break; /* Loop/switch isn't completed */
	//    8   16:aload           5
	//    9   18:ifnull          84
		if(constraintwrapper.deadlineNs == null)
			continue; /* Loop/switch isn't completed */
	//   10   21:aload_1         
	//   11   22:getfield        #142 <Field Long BatchingScheduler$ConstraintWrapper.deadlineNs>
	//   12   25:ifnull          14
		long l1 = constraintwrapper.deadlineNs.longValue() - long1.longValue();
	//   13   28:aload_1         
	//   14   29:getfield        #142 <Field Long BatchingScheduler$ConstraintWrapper.deadlineNs>
	//   15   32:invokevirtual   #111 <Method long Long.longValue()>
	//   16   35:aload           5
	//   17   37:invokevirtual   #111 <Method long Long.longValue()>
	//   18   40:lsub            
	//   19   41:lstore          6
		if(l1 < 1L || l1 > batchingDurationInNs)
			continue; /* Loop/switch isn't completed */
	//   20   43:lload           6
	//   21   45:lconst_1        
	//   22   46:lcmp            
	//   23   47:iflt            14
	//   24   50:lload           6
	//   25   52:aload_0         
	//   26   53:getfield        #63  <Field long batchingDurationInNs>
	//   27   56:lcmp            
	//   28   57:ifgt            14
_L4:
		l = constraintwrapper.delayUntilNs - l;
	//   29   60:aload_1         
	//   30   61:getfield        #145 <Field long BatchingScheduler$ConstraintWrapper.delayUntilNs>
	//   31   64:lload_3         
	//   32   65:lsub            
	//   33   66:lstore_3        
		if(l > 0L && l <= batchingDurationInNs)
	//*  34   67:lload_3         
	//*  35   68:lconst_0        
	//*  36   69:lcmp            
	//*  37   70:ifle            14
	//*  38   73:lload_3         
	//*  39   74:aload_0         
	//*  40   75:getfield        #63  <Field long batchingDurationInNs>
	//*  41   78:lcmp            
	//*  42   79:ifgt            14
			return true;
	//   43   82:iconst_1        
	//   44   83:ireturn         
		if(true) goto _L1; else goto _L3
_L3:
		if(constraintwrapper.deadlineNs != null)
	//*  45   84:aload_1         
	//*  46   85:getfield        #142 <Field Long BatchingScheduler$ConstraintWrapper.deadlineNs>
	//*  47   88:ifnull          60
			return false;
	//   48   91:iconst_0        
	//   49   92:ireturn         
		  goto _L4
		if(true) goto _L1; else goto _L5
_L5:
	}

	private void removeFromConstraints(SchedulerConstraint schedulerconstraint)
	{
		List list = constraints;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field List constraints>
	//    2    4:astore_3        
		list;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i = constraints.size() - 1;
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field List constraints>
	//    7   11:invokeinterface #148 <Method int List.size()>
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:istore_2        
_L2:
		if(i < 0)
			break MISSING_BLOCK_LABEL_66;
	//   11   19:iload_2         
	//   12   20:iflt            66
		if(((ConstraintWrapper)constraints.get(i)).constraint.getUuid().equals(((Object) (schedulerconstraint.getUuid()))))
	//*  13   23:aload_0         
	//*  14   24:getfield        #49  <Field List constraints>
	//*  15   27:iload_2         
	//*  16   28:invokeinterface #152 <Method Object List.get(int)>
	//*  17   33:checkcast       #8   <Class BatchingScheduler$ConstraintWrapper>
	//*  18   36:getfield        #134 <Field SchedulerConstraint BatchingScheduler$ConstraintWrapper.constraint>
	//*  19   39:invokevirtual   #156 <Method String SchedulerConstraint.getUuid()>
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #156 <Method String SchedulerConstraint.getUuid()>
	//*  22   46:invokevirtual   #161 <Method boolean String.equals(Object)>
	//*  23   49:ifeq            74
			constraints.remove(i);
	//   24   52:aload_0         
	//   25   53:getfield        #49  <Field List constraints>
	//   26   56:iload_2         
	//   27   57:invokeinterface #164 <Method Object List.remove(int)>
	//   28   62:pop             
		break MISSING_BLOCK_LABEL_74;
	//   29   63:goto            74
		list;
	//   30   66:aload_3         
		JVM INSTR monitorexit ;
	//   31   67:monitorexit     
		return;
	//   32   68:return          
		schedulerconstraint;
	//   33   69:astore_1        
		list;
	//   34   70:aload_3         
		JVM INSTR monitorexit ;
	//   35   71:monitorexit     
		throw schedulerconstraint;
	//   36   72:aload_1         
	//   37   73:athrow          
		i--;
	//   38   74:iload_2         
	//   39   75:iconst_1        
	//   40   76:isub            
	//   41   77:istore_2        
		if(true) goto _L2; else goto _L1
	//   42   78:goto            19
_L1:
	}

	public void cancelAll()
	{
		synchronized(constraints)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field List constraints>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			constraints.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field List constraints>
	//    7   11:invokeinterface #168 <Method void List.clear()>
		}
	//    8   16:aload_1         
	//    9   17:monitorexit     
		_flddelegate.cancelAll();
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field Scheduler _flddelegate>
	//   12   22:invokevirtual   #170 <Method void Scheduler.cancelAll()>
		return;
	//   13   25:return          
		exception;
	//   14   26:astore_2        
		list;
	//   15   27:aload_1         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		throw exception;
	//   17   29:aload_2         
	//   18   30:athrow          
	}

	public void init(Context context, com.birbit.android.jobqueue.scheduling.Scheduler.Callback callback)
	{
		super.init(context, callback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #174 <Method void Scheduler.init(Context, com.birbit.android.jobqueue.scheduling.Scheduler$Callback)>
		_flddelegate.init(context, new com.birbit.android.jobqueue.scheduling.Scheduler.Callback() {

			public boolean start(SchedulerConstraint schedulerconstraint)
			{
				removeFromConstraints(schedulerconstraint);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BatchingScheduler this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #27  <Method void BatchingScheduler.access$000(BatchingScheduler, SchedulerConstraint)>
				return BatchingScheduler.this.start(schedulerconstraint);
			//    4    8:aload_0         
			//    5    9:getfield        #17  <Field BatchingScheduler this$0>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #29  <Method boolean BatchingScheduler.start(SchedulerConstraint)>
			//    8   16:ireturn         
			}

			public boolean stop(SchedulerConstraint schedulerconstraint)
			{
				return BatchingScheduler.this.stop(schedulerconstraint);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BatchingScheduler this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #32  <Method boolean BatchingScheduler.stop(SchedulerConstraint)>
			//    4    8:ireturn         
			}

			final BatchingScheduler this$0;

			
			{
				this$0 = BatchingScheduler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BatchingScheduler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    4    6:aload_0         
	//    5    7:getfield        #51  <Field Scheduler _flddelegate>
	//    6   10:aload_1         
	//    7   11:new             #6   <Class BatchingScheduler$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #177 <Method void BatchingScheduler$1(BatchingScheduler)>
	//   11   19:invokevirtual   #174 <Method void Scheduler.init(Context, com.birbit.android.jobqueue.scheduling.Scheduler$Callback)>
	//   12   22:return          
	}

	public void onFinished(SchedulerConstraint schedulerconstraint, boolean flag)
	{
		removeFromConstraints(schedulerconstraint);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void removeFromConstraints(SchedulerConstraint)>
		_flddelegate.onFinished(schedulerconstraint, false);
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field Scheduler _flddelegate>
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #181 <Method void Scheduler.onFinished(SchedulerConstraint, boolean)>
		if(flag)
	//*   8   14:iload_2         
	//*   9   15:ifeq            23
			request(schedulerconstraint);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #184 <Method void request(SchedulerConstraint)>
	//   13   23:return          
	}

	public void request(SchedulerConstraint schedulerconstraint)
	{
		if(addToConstraints(schedulerconstraint))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #186 <Method boolean addToConstraints(SchedulerConstraint)>
	//*   3    5:ifeq            16
			_flddelegate.request(schedulerconstraint);
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field Scheduler _flddelegate>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #187 <Method void Scheduler.request(SchedulerConstraint)>
	//    8   16:return          
	}

	public static final long DEFAULT_BATCHING_PERIOD_IN_MS;
	final long batchingDurationInMs;
	final long batchingDurationInNs;
	private final List constraints;
	private final Scheduler _flddelegate;
	private final Timer timer;

	static 
	{
		DEFAULT_BATCHING_PERIOD_IN_MS = TimeUnit.SECONDS.toMillis(900L);
	//    0    0:getstatic       #28  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:ldc2w           #29  <Long 900L>
	//    2    6:invokevirtual   #34  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #36  <Field long DEFAULT_BATCHING_PERIOD_IN_MS>
	//*   4   12:return          
	}


/*
	static void access$000(BatchingScheduler batchingscheduler, SchedulerConstraint schedulerconstraint)
	{
		batchingscheduler.removeFromConstraints(schedulerconstraint);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void removeFromConstraints(SchedulerConstraint)>
		return;
	//    3    5:return          
	}

*/
}

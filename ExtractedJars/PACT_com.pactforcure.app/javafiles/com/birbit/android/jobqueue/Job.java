// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import android.content.Context;
import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.timer.Timer;
import java.io.*;
import java.util.*;

// Referenced classes of package com.birbit.android.jobqueue:
//			Params, JobHolder, RetryConstraint

public abstract class Job
	implements Serializable
{

	protected Job(Params params)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		id = UUID.randomUUID().toString();
	//    2    4:aload_0         
	//    3    5:invokestatic    #46  <Method UUID UUID.randomUUID()>
	//    4    8:invokevirtual   #50  <Method String UUID.toString()>
	//    5   11:putfield        #52  <Field String id>
		requiredNetworkType = params.requiredNetworkType;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:getfield        #56  <Field int Params.requiredNetworkType>
	//    9   19:putfield        #57  <Field int requiredNetworkType>
		persistent = params.isPersistent();
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #61  <Method boolean Params.isPersistent()>
	//   13   27:putfield        #63  <Field boolean persistent>
		groupId = params.getGroupId();
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #66  <Method String Params.getGroupId()>
	//   17   35:putfield        #68  <Field String groupId>
		priority = params.getPriority();
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokevirtual   #72  <Method int Params.getPriority()>
	//   21   43:putfield        #74  <Field int priority>
		delayInMs = Math.max(0L, params.getDelayMs());
	//   22   46:aload_0         
	//   23   47:lconst_0        
	//   24   48:aload_1         
	//   25   49:invokevirtual   #78  <Method long Params.getDelayMs()>
	//   26   52:invokestatic    #84  <Method long Math.max(long, long)>
	//   27   55:putfield        #86  <Field long delayInMs>
		deadlineInMs = Math.max(0L, params.getDeadlineMs());
	//   28   58:aload_0         
	//   29   59:lconst_0        
	//   30   60:aload_1         
	//   31   61:invokevirtual   #89  <Method long Params.getDeadlineMs()>
	//   32   64:invokestatic    #84  <Method long Math.max(long, long)>
	//   33   67:putfield        #91  <Field long deadlineInMs>
		cancelOnDeadline = params.shouldCancelOnDeadline();
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:invokevirtual   #94  <Method boolean Params.shouldCancelOnDeadline()>
	//   37   75:putfield        #96  <Field boolean cancelOnDeadline>
		String s = params.getSingleId();
	//   38   78:aload_1         
	//   39   79:invokevirtual   #99  <Method String Params.getSingleId()>
	//   40   82:astore_2        
		if(params.getTags() != null || s != null)
	//*  41   83:aload_1         
	//*  42   84:invokevirtual   #103 <Method HashSet Params.getTags()>
	//*  43   87:ifnonnull       94
	//*  44   90:aload_2         
	//*  45   91:ifnull          144
		{
			if(params.getTags() != null)
	//*  46   94:aload_1         
	//*  47   95:invokevirtual   #103 <Method HashSet Params.getTags()>
	//*  48   98:ifnull          212
				params = ((Params) (params.getTags()));
	//   49  101:aload_1         
	//   50  102:invokevirtual   #103 <Method HashSet Params.getTags()>
	//   51  105:astore_1        
			else
	//*  52  106:aload_2         
	//*  53  107:ifnull          136
	//*  54  110:aload_0         
	//*  55  111:aload_2         
	//*  56  112:invokespecial   #107 <Method String createTagForSingleId(String)>
	//*  57  115:astore_2        
	//*  58  116:aload_1         
	//*  59  117:aload_2         
	//*  60  118:invokeinterface #113 <Method boolean Set.add(Object)>
	//*  61  123:pop             
	//*  62  124:aload_0         
	//*  63  125:getfield        #68  <Field String groupId>
	//*  64  128:ifnonnull       136
	//*  65  131:aload_0         
	//*  66  132:aload_2         
	//*  67  133:putfield        #68  <Field String groupId>
	//*  68  136:aload_0         
	//*  69  137:aload_1         
	//*  70  138:invokestatic    #119 <Method Set Collections.unmodifiableSet(Set)>
	//*  71  141:putfield        #121 <Field Set readonlyTags>
	//*  72  144:aload_0         
	//*  73  145:getfield        #91  <Field long deadlineInMs>
	//*  74  148:lconst_0        
	//*  75  149:lcmp            
	//*  76  150:ifle            223
	//*  77  153:aload_0         
	//*  78  154:getfield        #91  <Field long deadlineInMs>
	//*  79  157:aload_0         
	//*  80  158:getfield        #86  <Field long delayInMs>
	//*  81  161:lcmp            
	//*  82  162:ifge            223
	//*  83  165:new             #123 <Class IllegalArgumentException>
	//*  84  168:dup             
	//*  85  169:new             #125 <Class StringBuilder>
	//*  86  172:dup             
	//*  87  173:invokespecial   #126 <Method void StringBuilder()>
	//*  88  176:ldc1            #128 <String "deadline cannot be less than the delay. It does not make sense. deadline:">
	//*  89  178:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//*  90  181:aload_0         
	//*  91  182:getfield        #91  <Field long deadlineInMs>
	//*  92  185:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//*  93  188:ldc1            #137 <String ",">
	//*  94  190:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//*  95  193:ldc1            #139 <String "delay:">
	//*  96  195:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//*  97  198:aload_0         
	//*  98  199:getfield        #86  <Field long delayInMs>
	//*  99  202:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//* 100  205:invokevirtual   #140 <Method String StringBuilder.toString()>
	//* 101  208:invokespecial   #143 <Method void IllegalArgumentException(String)>
	//* 102  211:athrow          
				params = ((Params) (new HashSet()));
	//  103  212:new             #145 <Class HashSet>
	//  104  215:dup             
	//  105  216:invokespecial   #146 <Method void HashSet()>
	//  106  219:astore_1        
			if(s != null)
			{
				s = createTagForSingleId(s);
				((Set) (params)).add(((Object) (s)));
				if(groupId == null)
					groupId = s;
			}
			readonlyTags = Collections.unmodifiableSet(((Set) (params)));
		}
		if(deadlineInMs > 0L && deadlineInMs < delayInMs)
			throw new IllegalArgumentException((new StringBuilder()).append("deadline cannot be less than the delay. It does not make sense. deadline:").append(deadlineInMs).append(",").append("delay:").append(delayInMs).toString());
		else
	//* 107  220:goto            106
			return;
	//  108  223:return          
	}

	private String createTagForSingleId(String s)
	{
		return (new StringBuilder()).append("job-single-id:").append(s).toString();
	//    0    0:new             #125 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void StringBuilder()>
	//    3    7:ldc1            #13  <String "job-single-id:">
	//    4    9:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #140 <Method String StringBuilder.toString()>
	//    8   19:areturn         
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		if(!sealed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field boolean sealed>
	//*   2    4:ifne            17
			throw new IllegalStateException("A job cannot be serialized w/o first being added into a job manager.");
	//    3    7:new             #155 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #157 <String "A job cannot be serialized w/o first being added into a job manager.">
	//    6   13:invokespecial   #158 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	public void assertNotCancelled()
	{
		if(cancelled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field boolean cancelled>
	//*   2    4:ifeq            17
			throw new RuntimeException("job is cancelled");
	//    3    7:new             #164 <Class RuntimeException>
	//    4   10:dup             
	//    5   11:ldc1            #166 <String "job is cancelled">
	//    6   13:invokespecial   #167 <Method void RuntimeException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	public Context getApplicationContext()
	{
		return applicationContext;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field Context applicationContext>
	//    2    4:areturn         
	}

	public final int getCurrentRunCount()
	{
		return currentRunCount;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field int currentRunCount>
	//    2    4:ireturn         
	}

	long getDeadlineInMs()
	{
		return deadlineInMs;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field long deadlineInMs>
	//    2    4:lreturn         
	}

	public final long getDelayInMs()
	{
		return delayInMs;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field long delayInMs>
	//    2    4:lreturn         
	}

	public final String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String id>
	//    2    4:areturn         
	}

	public final int getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int priority>
	//    2    4:ireturn         
	}

	protected int getRetryLimit()
	{
		return 20;
	//    0    0:bipush          20
	//    1    2:ireturn         
	}

	public final String getRunGroupId()
	{
		return groupId;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String groupId>
	//    2    4:areturn         
	}

	public final String getSingleInstanceId()
	{
label0:
		{
			if(readonlyTags == null)
				break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Set readonlyTags>
	//    2    4:ifnull          47
			Iterator iterator = readonlyTags.iterator();
	//    3    7:aload_0         
	//    4    8:getfield        #121 <Field Set readonlyTags>
	//    5   11:invokeinterface #184 <Method Iterator Set.iterator()>
	//    6   16:astore_1        
			String s;
			do
			{
				if(!iterator.hasNext())
					break label0;
	//    7   17:aload_1         
	//    8   18:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            47
				s = (String)iterator.next();
	//   10   26:aload_1         
	//   11   27:invokeinterface #193 <Method Object Iterator.next()>
	//   12   32:checkcast       #195 <Class String>
	//   13   35:astore_2        
			} while(!s.startsWith("job-single-id:"));
	//   14   36:aload_2         
	//   15   37:ldc1            #13  <String "job-single-id:">
	//   16   39:invokevirtual   #199 <Method boolean String.startsWith(String)>
	//   17   42:ifeq            17
			return s;
	//   18   45:aload_2         
	//   19   46:areturn         
		}
		return null;
	//   20   47:aconst_null     
	//   21   48:areturn         
	}

	public final Set getTags()
	{
		return readonlyTags;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Set readonlyTags>
	//    2    4:areturn         
	}

	public final boolean isCancelled()
	{
		return cancelled;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field boolean cancelled>
	//    2    4:ireturn         
	}

	public boolean isDeadlineReached()
	{
		return isDeadlineReached;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field boolean isDeadlineReached>
	//    2    4:ireturn         
	}

	public final boolean isPersistent()
	{
		return persistent;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean persistent>
	//    2    4:ireturn         
	}

	public abstract void onAdded();

	protected abstract void onCancel(int i, Throwable throwable);

	public abstract void onRun()
		throws Throwable;

	public final boolean requiresNetwork()
	{
		return requiredNetworkType >= 1;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int requiredNetworkType>
	//    2    4:iconst_1        
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean requiresUnmeteredNetwork()
	{
		return requiredNetworkType >= 2;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int requiredNetworkType>
	//    2    4:iconst_2        
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	final int safeRun(JobHolder jobholder, int i, Timer timer)
	{
		boolean flag;
		boolean flag4;
		boolean flag7;
		Object obj;
		currentRunCount = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #174 <Field int currentRunCount>
		if(JqLog.isDebugEnabled())
	//*   3    5:invokestatic    #222 <Method boolean JqLog.isDebugEnabled()>
	//*   4    8:ifeq            30
			JqLog.d("running job %s", new Object[] {
				((Object)this).getClass().getSimpleName()
			});
	//    5   11:ldc1            #224 <String "running job %s">
	//    6   13:iconst_1        
	//    7   14:anewarray       Object[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:invokevirtual   #228 <Method Class Object.getClass()>
	//   12   23:invokevirtual   #233 <Method String Class.getSimpleName()>
	//   13   26:aastore         
	//   14   27:invokestatic    #237 <Method void JqLog.d(String, Object[])>
		flag7 = false;
	//   15   30:iconst_0        
	//   16   31:istore          9
		flag = false;
	//   17   33:iconst_0        
	//   18   34:istore          4
		obj = null;
	//   19   36:aconst_null     
	//   20   37:astore          10
		flag4 = false;
	//   21   39:iconst_0        
	//   22   40:istore          7
		onRun();
	//   23   42:aload_0         
	//   24   43:invokevirtual   #239 <Method void onRun()>
		boolean flag2;
		boolean flag3;
		boolean flag6;
		Object obj1;
		flag2 = flag4;
	//   25   46:iload           7
	//   26   48:istore          5
		flag3 = flag;
	//   27   50:iload           4
	//   28   52:istore          6
		flag6 = flag7;
	//   29   54:iload           9
	//   30   56:istore          8
		obj1 = ((Object) (obj));
	//   31   58:aload           10
	//   32   60:astore          11
		if(!JqLog.isDebugEnabled())
			break MISSING_BLOCK_LABEL_97;
	//   33   62:invokestatic    #222 <Method boolean JqLog.isDebugEnabled()>
	//   34   65:ifeq            97
		JqLog.d("finished job %s", new Object[] {
			this
		});
	//   35   68:ldc1            #241 <String "finished job %s">
	//   36   70:iconst_1        
	//   37   71:anewarray       Object[]
	//   38   74:dup             
	//   39   75:iconst_0        
	//   40   76:aload_0         
	//   41   77:aastore         
	//   42   78:invokestatic    #237 <Method void JqLog.d(String, Object[])>
		obj1 = ((Object) (obj));
	//   43   81:aload           10
	//   44   83:astore          11
		flag6 = flag7;
	//   45   85:iload           9
	//   46   87:istore          8
		flag3 = flag;
	//   47   89:iload           4
	//   48   91:istore          6
		flag2 = flag4;
	//   49   93:iload           7
	//   50   95:istore          5
_L2:
		boolean flag1;
		boolean flag5;
		boolean flag8;
		Throwable throwable;
		Throwable throwable1;
		if(!flag3)
	//*  51   97:iload           6
	//*  52   99:ifne            353
			flag8 = true;
	//   53  102:iconst_1        
	//   54  103:istore          9
		else
	//*  55  105:ldc1            #243 <String "safeRunResult for %s : %s. re run:%s. cancelled: %s">
	//*  56  107:iconst_4        
	//*  57  108:anewarray       Object[]
	//*  58  111:dup             
	//*  59  112:iconst_0        
	//*  60  113:aload_0         
	//*  61  114:aastore         
	//*  62  115:dup             
	//*  63  116:iconst_1        
	//*  64  117:iload           9
	//*  65  119:invokestatic    #249 <Method Boolean Boolean.valueOf(boolean)>
	//*  66  122:aastore         
	//*  67  123:dup             
	//*  68  124:iconst_2        
	//*  69  125:iload           8
	//*  70  127:invokestatic    #249 <Method Boolean Boolean.valueOf(boolean)>
	//*  71  130:aastore         
	//*  72  131:dup             
	//*  73  132:iconst_3        
	//*  74  133:aload_0         
	//*  75  134:getfield        #162 <Field boolean cancelled>
	//*  76  137:invokestatic    #249 <Method Boolean Boolean.valueOf(boolean)>
	//*  77  140:aastore         
	//*  78  141:invokestatic    #237 <Method void JqLog.d(String, Object[])>
	//*  79  144:iload           6
	//*  80  146:ifne            359
	//*  81  149:iconst_1        
	//*  82  150:ireturn         
	//*  83  151:astore          12
	//*  84  153:iconst_1        
	//*  85  154:istore          7
	//*  86  156:aload           12
	//*  87  158:astore          10
	//*  88  160:aload           12
	//*  89  162:ldc1            #251 <String "error while executing job %s">
	//*  90  164:iconst_1        
	//*  91  165:anewarray       Object[]
	//*  92  168:dup             
	//*  93  169:iconst_0        
	//*  94  170:aload_0         
	//*  95  171:aastore         
	//*  96  172:invokestatic    #255 <Method void JqLog.e(Throwable, String, Object[])>
	//*  97  175:aload_1         
	//*  98  176:invokevirtual   #258 <Method boolean JobHolder.shouldCancelOnDeadline()>
	//*  99  179:ifeq            310
	//* 100  182:aload_1         
	//* 101  183:invokevirtual   #261 <Method long JobHolder.getDeadlineNs()>
	//* 102  186:aload_3         
	//* 103  187:invokeinterface #266 <Method long Timer.nanoTime()>
	//* 104  192:lcmp            
	//* 105  193:ifgt            310
	//* 106  196:iconst_1        
	//* 107  197:istore          4
	//* 108  199:iload_2         
	//* 109  200:aload_0         
	//* 110  201:invokevirtual   #268 <Method int getRetryLimit()>
	//* 111  204:icmpge          316
	//* 112  207:iload           4
	//* 113  209:ifne            316
	//* 114  212:iconst_1        
	//* 115  213:istore          9
	//* 116  215:iload           4
	//* 117  217:istore          5
	//* 118  219:iload           7
	//* 119  221:istore          6
	//* 120  223:iload           9
	//* 121  225:istore          8
	//* 122  227:aload           10
	//* 123  229:astore          11
	//* 124  231:iload           9
	//* 125  233:ifeq            97
	//* 126  236:iload           4
	//* 127  238:istore          5
	//* 128  240:iload           7
	//* 129  242:istore          6
	//* 130  244:iload           9
	//* 131  246:istore          8
	//* 132  248:aload           10
	//* 133  250:astore          11
	//* 134  252:aload_0         
	//* 135  253:getfield        #162 <Field boolean cancelled>
	//* 136  256:ifne            97
	//* 137  259:aload_0         
	//* 138  260:aload           12
	//* 139  262:iload_2         
	//* 140  263:aload_0         
	//* 141  264:invokevirtual   #268 <Method int getRetryLimit()>
	//* 142  267:invokevirtual   #272 <Method RetryConstraint shouldReRunOnThrowable(Throwable, int, int)>
	//* 143  270:astore          11
	//* 144  272:aload           11
	//* 145  274:astore_3        
	//* 146  275:aload           11
	//* 147  277:ifnonnull       284
	//* 148  280:getstatic       #278 <Field RetryConstraint RetryConstraint.RETRY>
	//* 149  283:astore_3        
	//* 150  284:aload_1         
	//* 151  285:aload_3         
	//* 152  286:putfield        #281 <Field RetryConstraint JobHolder.retryConstraint>
	//* 153  289:aload_3         
	//* 154  290:invokevirtual   #284 <Method boolean RetryConstraint.shouldRetry()>
	//* 155  293:istore          8
	//* 156  295:iload           4
	//* 157  297:istore          5
	//* 158  299:iload           7
	//* 159  301:istore          6
	//* 160  303:aload           10
	//* 161  305:astore          11
	//* 162  307:goto            97
	//* 163  310:iconst_0        
	//* 164  311:istore          4
	//* 165  313:goto            199
	//* 166  316:iconst_0        
	//* 167  317:istore          9
	//* 168  319:goto            215
	//* 169  322:astore_3        
	//* 170  323:aload_3         
	//* 171  324:ldc2            #286 <String "shouldReRunOnThrowable did throw an exception">
	//* 172  327:iconst_0        
	//* 173  328:anewarray       Object[]
	//* 174  331:invokestatic    #255 <Method void JqLog.e(Throwable, String, Object[])>
	//* 175  334:iload           4
	//* 176  336:istore          5
	//* 177  338:iload           7
	//* 178  340:istore          6
	//* 179  342:iload           9
	//* 180  344:istore          8
	//* 181  346:aload           10
	//* 182  348:astore          11
	//* 183  350:goto            97
			flag8 = false;
	//  184  353:iconst_0        
	//  185  354:istore          9
		JqLog.d("safeRunResult for %s : %s. re run:%s. cancelled: %s", new Object[] {
			this, Boolean.valueOf(flag8), Boolean.valueOf(flag6), Boolean.valueOf(cancelled)
		});
		if(!flag3)
			return 1;
		break MISSING_BLOCK_LABEL_359;
	//  186  356:goto            105
		throwable1;
		flag5 = true;
		throwable = throwable1;
		JqLog.e(throwable1, "error while executing job %s", new Object[] {
			this
		});
		if(jobholder.shouldCancelOnDeadline() && jobholder.getDeadlineNs() <= timer.nanoTime())
			flag1 = true;
		else
			flag1 = false;
		if(i < getRetryLimit() && !flag1)
			flag8 = true;
		else
			flag8 = false;
		flag2 = flag1;
		flag3 = flag5;
		flag6 = flag8;
		obj1 = ((Object) (throwable));
		if(!flag8) goto _L2; else goto _L1
_L1:
		flag2 = flag1;
		flag3 = flag5;
		flag6 = flag8;
		obj1 = ((Object) (throwable));
		if(cancelled) goto _L2; else goto _L3
_L3:
		obj1 = ((Object) (shouldReRunOnThrowable(throwable1, i, getRetryLimit())));
		timer = ((Timer) (obj1));
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_284;
		timer = ((Timer) (RetryConstraint.RETRY));
		jobholder.retryConstraint = ((RetryConstraint) (timer));
		flag6 = ((RetryConstraint) (timer)).shouldRetry();
		flag2 = flag1;
		flag3 = flag5;
		obj1 = ((Object) (throwable));
		  goto _L2
		timer;
		JqLog.e(((Throwable) (timer)), "shouldReRunOnThrowable did throw an exception", new Object[0]);
		flag2 = flag1;
		flag3 = flag5;
		flag6 = flag8;
		obj1 = ((Object) (throwable));
		  goto _L2
		if(jobholder.isCancelledSingleId())
	//* 187  359:aload_1         
	//* 188  360:invokevirtual   #289 <Method boolean JobHolder.isCancelledSingleId()>
	//* 189  363:ifeq            369
			return 6;
	//  190  366:bipush          6
	//  191  368:ireturn         
		if(jobholder.isCancelled())
	//* 192  369:aload_1         
	//* 193  370:invokevirtual   #291 <Method boolean JobHolder.isCancelled()>
	//* 194  373:ifeq            378
			return 3;
	//  195  376:iconst_3        
	//  196  377:ireturn         
		if(flag6)
	//* 197  378:iload           8
	//* 198  380:ifeq            385
			return 4;
	//  199  383:iconst_4        
	//  200  384:ireturn         
		if(flag2)
	//* 201  385:iload           5
	//* 202  387:ifeq            393
			return 7;
	//  203  390:bipush          7
	//  204  392:ireturn         
		if(i < getRetryLimit())
	//* 205  393:iload_2         
	//* 206  394:aload_0         
	//* 207  395:invokevirtual   #268 <Method int getRetryLimit()>
	//* 208  398:icmpge          409
		{
			jobholder.setThrowable(((Throwable) (obj1)));
	//  209  401:aload_1         
	//  210  402:aload           11
	//  211  404:invokevirtual   #295 <Method void JobHolder.setThrowable(Throwable)>
			return 5;
	//  212  407:iconst_5        
	//  213  408:ireturn         
		} else
		{
			jobholder.setThrowable(((Throwable) (obj1)));
	//  214  409:aload_1         
	//  215  410:aload           11
	//  216  412:invokevirtual   #295 <Method void JobHolder.setThrowable(Throwable)>
			return 2;
	//  217  415:iconst_2        
	//  218  416:ireturn         
		}
	}

	void setApplicationContext(Context context)
	{
		applicationContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #171 <Field Context applicationContext>
	//    3    5:return          
	}

	void setDeadlineReached(boolean flag)
	{
		isDeadlineReached = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #207 <Field boolean isDeadlineReached>
	//    3    5:return          
	}

	boolean shouldCancelOnDeadline()
	{
		return cancelOnDeadline;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field boolean cancelOnDeadline>
	//    2    4:ireturn         
	}

	protected abstract RetryConstraint shouldReRunOnThrowable(Throwable throwable, int i, int j);

	final void updateFromJobHolder(JobHolder jobholder)
	{
		if(sealed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field boolean sealed>
	//*   2    4:ifeq            18
		{
			throw new IllegalStateException("Cannot set a Job from JobHolder after it is sealed.");
	//    3    7:new             #155 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #304 <String "Cannot set a Job from JobHolder after it is sealed.">
	//    6   14:invokespecial   #158 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			id = jobholder.id;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:getfield        #305 <Field String JobHolder.id>
	//   11   23:putfield        #52  <Field String id>
			groupId = jobholder.groupId;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:getfield        #306 <Field String JobHolder.groupId>
	//   15   31:putfield        #68  <Field String groupId>
			priority = jobholder.getPriority();
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #307 <Method int JobHolder.getPriority()>
	//   19   39:putfield        #74  <Field int priority>
			persistent = jobholder.persistent;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:getfield        #308 <Field boolean JobHolder.persistent>
	//   23   47:putfield        #63  <Field boolean persistent>
			readonlyTags = jobholder.tags;
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:getfield        #311 <Field Set JobHolder.tags>
	//   27   55:putfield        #121 <Field Set readonlyTags>
			requiredNetworkType = jobholder.requiredNetworkType;
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:getfield        #312 <Field int JobHolder.requiredNetworkType>
	//   31   63:putfield        #57  <Field int requiredNetworkType>
			sealed = true;
	//   32   66:aload_0         
	//   33   67:iconst_1        
	//   34   68:putfield        #153 <Field boolean sealed>
			return;
	//   35   71:return          
		}
	}

	public static final int DEFAULT_RETRY_LIMIT = 20;
	static final String SINGLE_ID_TAG_PREFIX = "job-single-id:";
	private static final long serialVersionUID = 3L;
	private transient Context applicationContext;
	private transient boolean cancelOnDeadline;
	volatile transient boolean cancelled;
	private transient int currentRunCount;
	private transient long deadlineInMs;
	private transient long delayInMs;
	private transient String groupId;
	private transient String id;
	private volatile transient boolean isDeadlineReached;
	private transient boolean persistent;
	transient int priority;
	private transient Set readonlyTags;
	transient int requiredNetworkType;
	private volatile transient boolean sealed;
}

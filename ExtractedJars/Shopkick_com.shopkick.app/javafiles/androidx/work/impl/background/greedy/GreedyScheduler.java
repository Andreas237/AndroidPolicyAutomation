// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.impl.*;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.*;

public class GreedyScheduler
	implements Scheduler, WorkConstraintsCallback, ExecutionListener
{

	public GreedyScheduler(Context context, WorkManagerImpl workmanagerimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mConstrainedWorkSpecs = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ArrayList()>
	//    6   12:putfield        #49  <Field List mConstrainedWorkSpecs>
		mWorkManagerImpl = workmanagerimpl;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #51  <Field WorkManagerImpl mWorkManagerImpl>
		mWorkConstraintsTracker = new WorkConstraintsTracker(context, ((WorkConstraintsCallback) (this)));
	//   10   20:aload_0         
	//   11   21:new             #53  <Class WorkConstraintsTracker>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokespecial   #56  <Method void WorkConstraintsTracker(Context, WorkConstraintsCallback)>
	//   16   30:putfield        #58  <Field WorkConstraintsTracker mWorkConstraintsTracker>
		mLock = new Object();
	//   17   33:aload_0         
	//   18   34:new             #4   <Class Object>
	//   19   37:dup             
	//   20   38:invokespecial   #44  <Method void Object()>
	//   21   41:putfield        #60  <Field Object mLock>
	//   22   44:return          
	}

	public GreedyScheduler(WorkManagerImpl workmanagerimpl, WorkConstraintsTracker workconstraintstracker)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mConstrainedWorkSpecs = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ArrayList()>
	//    6   12:putfield        #49  <Field List mConstrainedWorkSpecs>
		mWorkManagerImpl = workmanagerimpl;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #51  <Field WorkManagerImpl mWorkManagerImpl>
		mWorkConstraintsTracker = workconstraintstracker;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #58  <Field WorkConstraintsTracker mWorkConstraintsTracker>
		mLock = new Object();
	//   13   25:aload_0         
	//   14   26:new             #4   <Class Object>
	//   15   29:dup             
	//   16   30:invokespecial   #44  <Method void Object()>
	//   17   33:putfield        #60  <Field Object mLock>
	//   18   36:return          
	}

	private void registerExecutionListenerIfNeeded()
	{
		if(!mRegisteredExecutionListener)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field boolean mRegisteredExecutionListener>
	//*   2    4:ifne            23
		{
			mWorkManagerImpl.getProcessor().addExecutionListener(((ExecutionListener) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field WorkManagerImpl mWorkManagerImpl>
	//    5   11:invokevirtual   #72  <Method Processor WorkManagerImpl.getProcessor()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #78  <Method void Processor.addExecutionListener(ExecutionListener)>
			mRegisteredExecutionListener = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #66  <Field boolean mRegisteredExecutionListener>
		}
	//   11   23:return          
	}

	private void removeConstraintTrackingFor(String s)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Object mLock>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int j = mConstrainedWorkSpecs.size();
	//    5    9:aload_0         
	//    6   10:getfield        #49  <Field List mConstrainedWorkSpecs>
	//    7   13:invokeinterface #87  <Method int List.size()>
	//    8   18:istore_3        
		int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_100;
	//   11   21:iload_2         
	//   12   22:iload_3         
	//   13   23:icmpge          100
		if(!((WorkSpec)mConstrainedWorkSpecs.get(i)).id.equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_110;
	//   14   26:aload_0         
	//   15   27:getfield        #49  <Field List mConstrainedWorkSpecs>
	//   16   30:iload_2         
	//   17   31:invokeinterface #91  <Method Object List.get(int)>
	//   18   36:checkcast       #93  <Class WorkSpec>
	//   19   39:getfield        #96  <Field String WorkSpec.id>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #102 <Method boolean String.equals(Object)>
	//   22   46:ifeq            110
		Logger.get().debug(TAG, String.format("Stopping tracking for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   23   49:invokestatic    #105 <Method Logger Logger.get()>
	//   24   52:getstatic       #39  <Field String TAG>
	//   25   55:ldc1            #107 <String "Stopping tracking for %s">
	//   26   57:iconst_1        
	//   27   58:anewarray       Object[]
	//   28   61:dup             
	//   29   62:iconst_0        
	//   30   63:aload_1         
	//   31   64:aastore         
	//   32   65:invokestatic    #111 <Method String String.format(String, Object[])>
	//   33   68:iconst_0        
	//   34   69:anewarray       Throwable[]
	//   35   72:invokevirtual   #117 <Method void Logger.debug(String, String, Throwable[])>
		mConstrainedWorkSpecs.remove(i);
	//   36   75:aload_0         
	//   37   76:getfield        #49  <Field List mConstrainedWorkSpecs>
	//   38   79:iload_2         
	//   39   80:invokeinterface #120 <Method Object List.remove(int)>
	//   40   85:pop             
		mWorkConstraintsTracker.replace(mConstrainedWorkSpecs);
	//   41   86:aload_0         
	//   42   87:getfield        #58  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//   43   90:aload_0         
	//   44   91:getfield        #49  <Field List mConstrainedWorkSpecs>
	//   45   94:invokevirtual   #124 <Method void WorkConstraintsTracker.replace(List)>
	//*  46   97:goto            100
		obj;
	//   47  100:aload           4
		JVM INSTR monitorexit ;
	//   48  102:monitorexit     
		return;
	//   49  103:return          
		s;
	//   50  104:astore_1        
		obj;
	//   51  105:aload           4
		JVM INSTR monitorexit ;
	//   52  107:monitorexit     
		throw s;
	//   53  108:aload_1         
	//   54  109:athrow          
		i++;
	//   55  110:iload_2         
	//   56  111:iconst_1        
	//   57  112:iadd            
	//   58  113:istore_2        
		if(true) goto _L2; else goto _L1
	//   59  114:goto            21
_L1:
	}

	public void cancel(String s)
	{
		registerExecutionListenerIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method void registerExecutionListenerIfNeeded()>
		Logger.get().debug(TAG, String.format("Cancelling work ID %s", new Object[] {
			s
		}), new Throwable[0]);
	//    2    4:invokestatic    #105 <Method Logger Logger.get()>
	//    3    7:getstatic       #39  <Field String TAG>
	//    4   10:ldc1            #130 <String "Cancelling work ID %s">
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_1         
	//   10   19:aastore         
	//   11   20:invokestatic    #111 <Method String String.format(String, Object[])>
	//   12   23:iconst_0        
	//   13   24:anewarray       Throwable[]
	//   14   27:invokevirtual   #117 <Method void Logger.debug(String, String, Throwable[])>
		mWorkManagerImpl.stopWork(s);
	//   15   30:aload_0         
	//   16   31:getfield        #51  <Field WorkManagerImpl mWorkManagerImpl>
	//   17   34:aload_1         
	//   18   35:invokevirtual   #133 <Method void WorkManagerImpl.stopWork(String)>
	//   19   38:return          
	}

	public void onAllConstraintsMet(List list)
	{
		String s;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); mWorkManagerImpl.startWork(s))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #138 <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            64
		{
			s = (String)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #148 <Method Object Iterator.next()>
	//    8   22:checkcast       #98  <Class String>
	//    9   25:astore_2        
			Logger.get().debug(TAG, String.format("Constraints met: Scheduling work ID %s", new Object[] {
				s
			}), new Throwable[0]);
	//   10   26:invokestatic    #105 <Method Logger Logger.get()>
	//   11   29:getstatic       #39  <Field String TAG>
	//   12   32:ldc1            #150 <String "Constraints met: Scheduling work ID %s">
	//   13   34:iconst_1        
	//   14   35:anewarray       Object[]
	//   15   38:dup             
	//   16   39:iconst_0        
	//   17   40:aload_2         
	//   18   41:aastore         
	//   19   42:invokestatic    #111 <Method String String.format(String, Object[])>
	//   20   45:iconst_0        
	//   21   46:anewarray       Throwable[]
	//   22   49:invokevirtual   #117 <Method void Logger.debug(String, String, Throwable[])>
		}

	//   23   52:aload_0         
	//   24   53:getfield        #51  <Field WorkManagerImpl mWorkManagerImpl>
	//   25   56:aload_2         
	//   26   57:invokevirtual   #154 <Method com.google.common.util.concurrent.ListenableFuture WorkManagerImpl.startWork(String)>
	//   27   60:pop             
	//*  28   61:goto            7
	//   29   64:return          
	}

	public void onAllConstraintsNotMet(List list)
	{
		String s;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); mWorkManagerImpl.stopWork(s))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #138 <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #144 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            63
		{
			s = (String)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #148 <Method Object Iterator.next()>
	//    8   22:checkcast       #98  <Class String>
	//    9   25:astore_2        
			Logger.get().debug(TAG, String.format("Constraints not met: Cancelling work ID %s", new Object[] {
				s
			}), new Throwable[0]);
	//   10   26:invokestatic    #105 <Method Logger Logger.get()>
	//   11   29:getstatic       #39  <Field String TAG>
	//   12   32:ldc1            #159 <String "Constraints not met: Cancelling work ID %s">
	//   13   34:iconst_1        
	//   14   35:anewarray       Object[]
	//   15   38:dup             
	//   16   39:iconst_0        
	//   17   40:aload_2         
	//   18   41:aastore         
	//   19   42:invokestatic    #111 <Method String String.format(String, Object[])>
	//   20   45:iconst_0        
	//   21   46:anewarray       Throwable[]
	//   22   49:invokevirtual   #117 <Method void Logger.debug(String, String, Throwable[])>
		}

	//   23   52:aload_0         
	//   24   53:getfield        #51  <Field WorkManagerImpl mWorkManagerImpl>
	//   25   56:aload_2         
	//   26   57:invokevirtual   #133 <Method void WorkManagerImpl.stopWork(String)>
	//*  27   60:goto            7
	//   28   63:return          
	}

	public void onExecuted(String s, boolean flag)
	{
		removeConstraintTrackingFor(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method void removeConstraintTrackingFor(String)>
	//    3    5:return          
	}

	public transient void schedule(WorkSpec aworkspec[])
	{
		registerExecutionListenerIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method void registerExecutionListenerIfNeeded()>
		ArrayList arraylist = new ArrayList();
	//    2    4:new             #46  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #47  <Method void ArrayList()>
	//    5   11:astore          4
		ArrayList arraylist1 = new ArrayList();
	//    6   13:new             #46  <Class ArrayList>
	//    7   16:dup             
	//    8   17:invokespecial   #47  <Method void ArrayList()>
	//    9   20:astore          5
		int j = aworkspec.length;
	//   10   22:aload_1         
	//   11   23:arraylength     
	//   12   24:istore_3        
		for(int i = 0; i < j; i++)
	//*  13   25:iconst_0        
	//*  14   26:istore_2        
	//*  15   27:iload_2         
	//*  16   28:iload_3         
	//*  17   29:icmpge          147
		{
			WorkSpec workspec = aworkspec[i];
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:aaload          
	//   21   35:astore          6
			if(workspec.state != androidx.work.WorkInfo.State.ENQUEUED || workspec.isPeriodic() || workspec.initialDelay != 0L || workspec.isBackedOff())
				continue;
	//   22   37:aload           6
	//   23   39:getfield        #169 <Field androidx.work.WorkInfo$State WorkSpec.state>
	//   24   42:getstatic       #174 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//   25   45:if_acmpne       140
	//   26   48:aload           6
	//   27   50:invokevirtual   #177 <Method boolean WorkSpec.isPeriodic()>
	//   28   53:ifne            140
	//   29   56:aload           6
	//   30   58:getfield        #181 <Field long WorkSpec.initialDelay>
	//   31   61:lconst_0        
	//   32   62:lcmp            
	//   33   63:ifne            140
	//   34   66:aload           6
	//   35   68:invokevirtual   #184 <Method boolean WorkSpec.isBackedOff()>
	//   36   71:ifne            140
			if(workspec.hasConstraints())
	//*  37   74:aload           6
	//*  38   76:invokevirtual   #187 <Method boolean WorkSpec.hasConstraints()>
	//*  39   79:ifeq            127
			{
				if(android.os.Build.VERSION.SDK_INT < 24 || !workspec.constraints.hasContentUriTriggers())
	//*  40   82:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   85:bipush          24
	//*  42   87:icmplt          101
	//*  43   90:aload           6
	//*  44   92:getfield        #197 <Field Constraints WorkSpec.constraints>
	//*  45   95:invokevirtual   #202 <Method boolean Constraints.hasContentUriTriggers()>
	//*  46   98:ifne            140
				{
					((List) (arraylist)).add(((Object) (workspec)));
	//   47  101:aload           4
	//   48  103:aload           6
	//   49  105:invokeinterface #205 <Method boolean List.add(Object)>
	//   50  110:pop             
					((List) (arraylist1)).add(((Object) (workspec.id)));
	//   51  111:aload           5
	//   52  113:aload           6
	//   53  115:getfield        #96  <Field String WorkSpec.id>
	//   54  118:invokeinterface #205 <Method boolean List.add(Object)>
	//   55  123:pop             
				}
			} else
	//*  56  124:goto            140
			{
				mWorkManagerImpl.startWork(workspec.id);
	//   57  127:aload_0         
	//   58  128:getfield        #51  <Field WorkManagerImpl mWorkManagerImpl>
	//   59  131:aload           6
	//   60  133:getfield        #96  <Field String WorkSpec.id>
	//   61  136:invokevirtual   #154 <Method com.google.common.util.concurrent.ListenableFuture WorkManagerImpl.startWork(String)>
	//   62  139:pop             
			}
		}

	//   63  140:iload_2         
	//   64  141:iconst_1        
	//   65  142:iadd            
	//   66  143:istore_2        
	//*  67  144:goto            27
		synchronized(mLock)
	//*  68  147:aload_0         
	//*  69  148:getfield        #60  <Field Object mLock>
	//*  70  151:astore_1        
	//*  71  152:aload_1         
	//*  72  153:monitorenter    
		{
			if(!((List) (arraylist)).isEmpty())
	//*  73  154:aload           4
	//*  74  156:invokeinterface #208 <Method boolean List.isEmpty()>
	//*  75  161:ifne            219
			{
				Logger.get().debug(TAG, String.format("Starting tracking for [%s]", new Object[] {
					TextUtils.join(",", ((Iterable) (arraylist1)))
				}), new Throwable[0]);
	//   76  164:invokestatic    #105 <Method Logger Logger.get()>
	//   77  167:getstatic       #39  <Field String TAG>
	//   78  170:ldc1            #210 <String "Starting tracking for [%s]">
	//   79  172:iconst_1        
	//   80  173:anewarray       Object[]
	//   81  176:dup             
	//   82  177:iconst_0        
	//   83  178:ldc1            #212 <String ",">
	//   84  180:aload           5
	//   85  182:invokestatic    #218 <Method String TextUtils.join(CharSequence, Iterable)>
	//   86  185:aastore         
	//   87  186:invokestatic    #111 <Method String String.format(String, Object[])>
	//   88  189:iconst_0        
	//   89  190:anewarray       Throwable[]
	//   90  193:invokevirtual   #117 <Method void Logger.debug(String, String, Throwable[])>
				mConstrainedWorkSpecs.addAll(((java.util.Collection) (arraylist)));
	//   91  196:aload_0         
	//   92  197:getfield        #49  <Field List mConstrainedWorkSpecs>
	//   93  200:aload           4
	//   94  202:invokeinterface #222 <Method boolean List.addAll(java.util.Collection)>
	//   95  207:pop             
				mWorkConstraintsTracker.replace(mConstrainedWorkSpecs);
	//   96  208:aload_0         
	//   97  209:getfield        #58  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//   98  212:aload_0         
	//   99  213:getfield        #49  <Field List mConstrainedWorkSpecs>
	//  100  216:invokevirtual   #124 <Method void WorkConstraintsTracker.replace(List)>
			}
		}
	//  101  219:aload_1         
	//  102  220:monitorexit     
		return;
	//  103  221:return          
		exception;
	//  104  222:astore          4
		aworkspec;
	//  105  224:aload_1         
		JVM INSTR monitorexit ;
	//  106  225:monitorexit     
		throw exception;
	//  107  226:aload           4
	//  108  228:athrow          
	}

	private static final String TAG = Logger.tagWithPrefix("GreedyScheduler");
	private List mConstrainedWorkSpecs;
	private final Object mLock;
	private boolean mRegisteredExecutionListener;
	private WorkConstraintsTracker mWorkConstraintsTracker;
	private WorkManagerImpl mWorkManagerImpl;

	static 
	{
	//    0    0:ldc1            #31  <String "GreedyScheduler">
	//    1    2:invokestatic    #37  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #39  <Field String TAG>
	//*   3    8:return          
	}
}

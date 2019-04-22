// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.*;
import androidx.work.impl.*;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.*;

public class GreedyScheduler
	implements ExecutionListener, Scheduler, WorkConstraintsCallback
{

	public GreedyScheduler(Context context, WorkManagerImpl workmanagerimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mConstrainedWorkSpecs = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void ArrayList()>
	//    6   12:putfield        #35  <Field List mConstrainedWorkSpecs>
		mWorkManagerImpl = workmanagerimpl;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #37  <Field WorkManagerImpl mWorkManagerImpl>
		mWorkConstraintsTracker = new WorkConstraintsTracker(context, ((WorkConstraintsCallback) (this)));
	//   10   20:aload_0         
	//   11   21:new             #39  <Class WorkConstraintsTracker>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokespecial   #42  <Method void WorkConstraintsTracker(Context, WorkConstraintsCallback)>
	//   16   30:putfield        #44  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//   17   33:aload_0         
	//   18   34:new             #4   <Class Object>
	//   19   37:dup             
	//   20   38:invokespecial   #30  <Method void Object()>
	//   21   41:putfield        #46  <Field Object mLock>
	//   22   44:return          
	}

	private void registerExecutionListenerIfNeeded()
	{
		if(!mRegisteredExecutionListener)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mRegisteredExecutionListener>
	//*   2    4:ifne            23
		{
			mWorkManagerImpl.getProcessor().addExecutionListener(((ExecutionListener) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field WorkManagerImpl mWorkManagerImpl>
	//    5   11:invokevirtual   #56  <Method Processor WorkManagerImpl.getProcessor()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #62  <Method void Processor.addExecutionListener(ExecutionListener)>
			mRegisteredExecutionListener = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #50  <Field boolean mRegisteredExecutionListener>
		}
	//   11   23:return          
	}

	private void removeConstraintTrackingFor(String s)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Object mLock>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int j = mConstrainedWorkSpecs.size();
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field List mConstrainedWorkSpecs>
	//    7   13:invokeinterface #71  <Method int List.size()>
	//    8   18:istore_3        
		int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_96;
	//   11   21:iload_2         
	//   12   22:iload_3         
	//   13   23:icmpge          96
		if(!((WorkSpec)mConstrainedWorkSpecs.get(i)).id.equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_106;
	//   14   26:aload_0         
	//   15   27:getfield        #35  <Field List mConstrainedWorkSpecs>
	//   16   30:iload_2         
	//   17   31:invokeinterface #75  <Method Object List.get(int)>
	//   18   36:checkcast       #77  <Class WorkSpec>
	//   19   39:getfield        #81  <Field String WorkSpec.id>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #87  <Method boolean String.equals(Object)>
	//   22   46:ifeq            106
		Logger.debug("GreedyScheduler", String.format("Stopping tracking for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   23   49:ldc1            #89  <String "GreedyScheduler">
	//   24   51:ldc1            #91  <String "Stopping tracking for %s">
	//   25   53:iconst_1        
	//   26   54:anewarray       Object[]
	//   27   57:dup             
	//   28   58:iconst_0        
	//   29   59:aload_1         
	//   30   60:aastore         
	//   31   61:invokestatic    #95  <Method String String.format(String, Object[])>
	//   32   64:iconst_0        
	//   33   65:anewarray       Throwable[]
	//   34   68:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
		mConstrainedWorkSpecs.remove(i);
	//   35   71:aload_0         
	//   36   72:getfield        #35  <Field List mConstrainedWorkSpecs>
	//   37   75:iload_2         
	//   38   76:invokeinterface #106 <Method Object List.remove(int)>
	//   39   81:pop             
		mWorkConstraintsTracker.replace(mConstrainedWorkSpecs);
	//   40   82:aload_0         
	//   41   83:getfield        #44  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//   42   86:aload_0         
	//   43   87:getfield        #35  <Field List mConstrainedWorkSpecs>
	//   44   90:invokevirtual   #110 <Method void WorkConstraintsTracker.replace(List)>
	//*  45   93:goto            96
		obj;
	//   46   96:aload           4
		JVM INSTR monitorexit ;
	//   47   98:monitorexit     
		return;
	//   48   99:return          
		s;
	//   49  100:astore_1        
		obj;
	//   50  101:aload           4
		JVM INSTR monitorexit ;
	//   51  103:monitorexit     
		throw s;
	//   52  104:aload_1         
	//   53  105:athrow          
		i++;
	//   54  106:iload_2         
	//   55  107:iconst_1        
	//   56  108:iadd            
	//   57  109:istore_2        
		if(true) goto _L2; else goto _L1
	//   58  110:goto            21
_L1:
	}

	public void cancel(String s)
	{
		registerExecutionListenerIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void registerExecutionListenerIfNeeded()>
		Logger.debug("GreedyScheduler", String.format("Cancelling work ID %s", new Object[] {
			s
		}), new Throwable[0]);
	//    2    4:ldc1            #89  <String "GreedyScheduler">
	//    3    6:ldc1            #116 <String "Cancelling work ID %s">
	//    4    8:iconst_1        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:invokestatic    #95  <Method String String.format(String, Object[])>
	//   11   19:iconst_0        
	//   12   20:anewarray       Throwable[]
	//   13   23:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
		mWorkManagerImpl.stopWork(s);
	//   14   26:aload_0         
	//   15   27:getfield        #37  <Field WorkManagerImpl mWorkManagerImpl>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #119 <Method void WorkManagerImpl.stopWork(String)>
	//   18   34:return          
	}

	public void onAllConstraintsMet(List list)
	{
		String s;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); mWorkManagerImpl.startWork(s))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #124 <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            59
		{
			s = (String)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #134 <Method Object Iterator.next()>
	//    8   22:checkcast       #83  <Class String>
	//    9   25:astore_2        
			Logger.debug("GreedyScheduler", String.format("Constraints met: Scheduling work ID %s", new Object[] {
				s
			}), new Throwable[0]);
	//   10   26:ldc1            #89  <String "GreedyScheduler">
	//   11   28:ldc1            #136 <String "Constraints met: Scheduling work ID %s">
	//   12   30:iconst_1        
	//   13   31:anewarray       Object[]
	//   14   34:dup             
	//   15   35:iconst_0        
	//   16   36:aload_2         
	//   17   37:aastore         
	//   18   38:invokestatic    #95  <Method String String.format(String, Object[])>
	//   19   41:iconst_0        
	//   20   42:anewarray       Throwable[]
	//   21   45:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
		}

	//   22   48:aload_0         
	//   23   49:getfield        #37  <Field WorkManagerImpl mWorkManagerImpl>
	//   24   52:aload_2         
	//   25   53:invokevirtual   #139 <Method void WorkManagerImpl.startWork(String)>
	//*  26   56:goto            7
	//   27   59:return          
	}

	public void onAllConstraintsNotMet(List list)
	{
		String s;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); mWorkManagerImpl.stopWork(s))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #124 <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            59
		{
			s = (String)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #134 <Method Object Iterator.next()>
	//    8   22:checkcast       #83  <Class String>
	//    9   25:astore_2        
			Logger.debug("GreedyScheduler", String.format("Constraints not met: Cancelling work ID %s", new Object[] {
				s
			}), new Throwable[0]);
	//   10   26:ldc1            #89  <String "GreedyScheduler">
	//   11   28:ldc1            #144 <String "Constraints not met: Cancelling work ID %s">
	//   12   30:iconst_1        
	//   13   31:anewarray       Object[]
	//   14   34:dup             
	//   15   35:iconst_0        
	//   16   36:aload_2         
	//   17   37:aastore         
	//   18   38:invokestatic    #95  <Method String String.format(String, Object[])>
	//   19   41:iconst_0        
	//   20   42:anewarray       Throwable[]
	//   21   45:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
		}

	//   22   48:aload_0         
	//   23   49:getfield        #37  <Field WorkManagerImpl mWorkManagerImpl>
	//   24   52:aload_2         
	//   25   53:invokevirtual   #119 <Method void WorkManagerImpl.stopWork(String)>
	//*  26   56:goto            7
	//   27   59:return          
	}

	public void onExecuted(String s, boolean flag)
	{
		removeConstraintTrackingFor(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void removeConstraintTrackingFor(String)>
	//    3    5:return          
	}

	public transient void schedule(WorkSpec aworkspec[])
	{
		registerExecutionListenerIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void registerExecutionListenerIfNeeded()>
		ArrayList arraylist = new ArrayList();
	//    2    4:new             #32  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #33  <Method void ArrayList()>
	//    5   11:astore          4
		ArrayList arraylist1 = new ArrayList();
	//    6   13:new             #32  <Class ArrayList>
	//    7   16:dup             
	//    8   17:invokespecial   #33  <Method void ArrayList()>
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
	//*  17   29:icmpge          146
		{
			WorkSpec workspec = aworkspec[i];
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:aaload          
	//   21   35:astore          6
			if(workspec.state != State.ENQUEUED || workspec.isPeriodic() || workspec.initialDelay != 0L || workspec.isBackedOff())
				continue;
	//   22   37:aload           6
	//   23   39:getfield        #154 <Field State WorkSpec.state>
	//   24   42:getstatic       #159 <Field State State.ENQUEUED>
	//   25   45:if_acmpne       139
	//   26   48:aload           6
	//   27   50:invokevirtual   #162 <Method boolean WorkSpec.isPeriodic()>
	//   28   53:ifne            139
	//   29   56:aload           6
	//   30   58:getfield        #166 <Field long WorkSpec.initialDelay>
	//   31   61:lconst_0        
	//   32   62:lcmp            
	//   33   63:ifne            139
	//   34   66:aload           6
	//   35   68:invokevirtual   #169 <Method boolean WorkSpec.isBackedOff()>
	//   36   71:ifne            139
			if(workspec.hasConstraints())
	//*  37   74:aload           6
	//*  38   76:invokevirtual   #172 <Method boolean WorkSpec.hasConstraints()>
	//*  39   79:ifeq            127
			{
				if(android.os.Build.VERSION.SDK_INT < 24 || !workspec.constraints.hasContentUriTriggers())
	//*  40   82:getstatic       #178 <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   85:bipush          24
	//*  42   87:icmplt          101
	//*  43   90:aload           6
	//*  44   92:getfield        #182 <Field Constraints WorkSpec.constraints>
	//*  45   95:invokevirtual   #187 <Method boolean Constraints.hasContentUriTriggers()>
	//*  46   98:ifne            139
				{
					((List) (arraylist)).add(((Object) (workspec)));
	//   47  101:aload           4
	//   48  103:aload           6
	//   49  105:invokeinterface #190 <Method boolean List.add(Object)>
	//   50  110:pop             
					((List) (arraylist1)).add(((Object) (workspec.id)));
	//   51  111:aload           5
	//   52  113:aload           6
	//   53  115:getfield        #81  <Field String WorkSpec.id>
	//   54  118:invokeinterface #190 <Method boolean List.add(Object)>
	//   55  123:pop             
				}
			} else
	//*  56  124:goto            139
			{
				mWorkManagerImpl.startWork(workspec.id);
	//   57  127:aload_0         
	//   58  128:getfield        #37  <Field WorkManagerImpl mWorkManagerImpl>
	//   59  131:aload           6
	//   60  133:getfield        #81  <Field String WorkSpec.id>
	//   61  136:invokevirtual   #139 <Method void WorkManagerImpl.startWork(String)>
			}
		}

	//   62  139:iload_2         
	//   63  140:iconst_1        
	//   64  141:iadd            
	//   65  142:istore_2        
	//*  66  143:goto            27
		synchronized(mLock)
	//*  67  146:aload_0         
	//*  68  147:getfield        #46  <Field Object mLock>
	//*  69  150:astore_1        
	//*  70  151:aload_1         
	//*  71  152:monitorenter    
		{
			if(!((List) (arraylist)).isEmpty())
	//*  72  153:aload           4
	//*  73  155:invokeinterface #193 <Method boolean List.isEmpty()>
	//*  74  160:ifne            214
			{
				Logger.debug("GreedyScheduler", String.format("Starting tracking for [%s]", new Object[] {
					TextUtils.join(",", ((Iterable) (arraylist1)))
				}), new Throwable[0]);
	//   75  163:ldc1            #89  <String "GreedyScheduler">
	//   76  165:ldc1            #195 <String "Starting tracking for [%s]">
	//   77  167:iconst_1        
	//   78  168:anewarray       Object[]
	//   79  171:dup             
	//   80  172:iconst_0        
	//   81  173:ldc1            #197 <String ",">
	//   82  175:aload           5
	//   83  177:invokestatic    #203 <Method String TextUtils.join(CharSequence, Iterable)>
	//   84  180:aastore         
	//   85  181:invokestatic    #95  <Method String String.format(String, Object[])>
	//   86  184:iconst_0        
	//   87  185:anewarray       Throwable[]
	//   88  188:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
				mConstrainedWorkSpecs.addAll(((java.util.Collection) (arraylist)));
	//   89  191:aload_0         
	//   90  192:getfield        #35  <Field List mConstrainedWorkSpecs>
	//   91  195:aload           4
	//   92  197:invokeinterface #207 <Method boolean List.addAll(java.util.Collection)>
	//   93  202:pop             
				mWorkConstraintsTracker.replace(mConstrainedWorkSpecs);
	//   94  203:aload_0         
	//   95  204:getfield        #44  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//   96  207:aload_0         
	//   97  208:getfield        #35  <Field List mConstrainedWorkSpecs>
	//   98  211:invokevirtual   #110 <Method void WorkConstraintsTracker.replace(List)>
			}
		}
	//   99  214:aload_1         
	//  100  215:monitorexit     
		return;
	//  101  216:return          
		exception;
	//  102  217:astore          4
		aworkspec;
	//  103  219:aload_1         
		JVM INSTR monitorexit ;
	//  104  220:monitorexit     
		throw exception;
	//  105  221:aload           4
	//  106  223:athrow          
	}

	private List mConstrainedWorkSpecs;
	private final Object mLock = new Object();
	private boolean mRegisteredExecutionListener;
	private WorkConstraintsTracker mWorkConstraintsTracker;
	private WorkManagerImpl mWorkManagerImpl;
}

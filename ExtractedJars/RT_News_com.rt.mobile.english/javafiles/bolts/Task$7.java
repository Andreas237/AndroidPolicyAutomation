// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package bolts:
//			Continuation, Task, AggregateException

static final class Task$7
	implements Continuation
{

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method Void then(Task)>
	//    3    5:areturn         
	}

	public Void then(Task task)
	{
		if(task.isFaulted())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #50  <Method boolean Task.isFaulted()>
	//*   2    4:ifeq            36
			synchronized(val$errorLock)
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field Object val$errorLock>
	//*   5   11:astore_2        
	//*   6   12:aload_2         
	//*   7   13:monitorenter    
			{
				val$causes.add(((Object) (task.getError())));
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field ArrayList val$causes>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #54  <Method Exception Task.getError()>
	//   12   22:invokevirtual   #60  <Method boolean ArrayList.add(Object)>
	//   13   25:pop             
			}
	//   14   26:aload_2         
	//   15   27:monitorexit     
		break MISSING_BLOCK_LABEL_36;
	//   16   28:goto            36
		task;
	//   17   31:astore_1        
		obj;
	//   18   32:aload_2         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw task;
	//   20   34:aload_1         
	//   21   35:athrow          
		if(task.isCancelled())
	//*  22   36:aload_1         
	//*  23   37:invokevirtual   #63  <Method boolean Task.isCancelled()>
	//*  24   40:ifeq            51
			val$isCancelled.set(true);
	//   25   43:aload_0         
	//   26   44:getfield        #30  <Field AtomicBoolean val$isCancelled>
	//   27   47:iconst_1        
	//   28   48:invokevirtual   #69  <Method void AtomicBoolean.set(boolean)>
		if(val$count.decrementAndGet() == 0)
	//*  29   51:aload_0         
	//*  30   52:getfield        #32  <Field AtomicInteger val$count>
	//*  31   55:invokevirtual   #75  <Method int AtomicInteger.decrementAndGet()>
	//*  32   58:ifne            173
		{
			if(val$causes.size() != 0)
	//*  33   61:aload_0         
	//*  34   62:getfield        #28  <Field ArrayList val$causes>
	//*  35   65:invokevirtual   #78  <Method int ArrayList.size()>
	//*  36   68:ifeq            146
				if(val$causes.size() == 1)
	//*  37   71:aload_0         
	//*  38   72:getfield        #28  <Field ArrayList val$causes>
	//*  39   75:invokevirtual   #78  <Method int ArrayList.size()>
	//*  40   78:iconst_1        
	//*  41   79:icmpne          102
				{
					val$allFinished.setError((Exception)val$causes.get(0));
	//   42   82:aload_0         
	//   43   83:getfield        #34  <Field Task$TaskCompletionSource val$allFinished>
	//   44   86:aload_0         
	//   45   87:getfield        #28  <Field ArrayList val$causes>
	//   46   90:iconst_0        
	//   47   91:invokevirtual   #82  <Method Object ArrayList.get(int)>
	//   48   94:checkcast       #42  <Class Exception>
	//   49   97:invokevirtual   #88  <Method void Task$TaskCompletionSource.setError(Exception)>
					return null;
	//   50  100:aconst_null     
	//   51  101:areturn         
				} else
				{
					task = ((Task) (new AggregateException(String.format("There were %d exceptions.", new Object[] {
						Integer.valueOf(val$causes.size())
					}), ((java.util.List) (val$causes)))));
	//   52  102:new             #90  <Class AggregateException>
	//   53  105:dup             
	//   54  106:ldc1            #92  <String "There were %d exceptions.">
	//   55  108:iconst_1        
	//   56  109:anewarray       Object[]
	//   57  112:dup             
	//   58  113:iconst_0        
	//   59  114:aload_0         
	//   60  115:getfield        #28  <Field ArrayList val$causes>
	//   61  118:invokevirtual   #78  <Method int ArrayList.size()>
	//   62  121:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//   63  124:aastore         
	//   64  125:invokestatic    #104 <Method String String.format(String, Object[])>
	//   65  128:aload_0         
	//   66  129:getfield        #28  <Field ArrayList val$causes>
	//   67  132:invokespecial   #107 <Method void AggregateException(String, java.util.List)>
	//   68  135:astore_1        
					val$allFinished.setError(((Exception) (task)));
	//   69  136:aload_0         
	//   70  137:getfield        #34  <Field Task$TaskCompletionSource val$allFinished>
	//   71  140:aload_1         
	//   72  141:invokevirtual   #88  <Method void Task$TaskCompletionSource.setError(Exception)>
					return null;
	//   73  144:aconst_null     
	//   74  145:areturn         
				}
			if(val$isCancelled.get())
	//*  75  146:aload_0         
	//*  76  147:getfield        #30  <Field AtomicBoolean val$isCancelled>
	//*  77  150:invokevirtual   #109 <Method boolean AtomicBoolean.get()>
	//*  78  153:ifeq            165
			{
				val$allFinished.setCancelled();
	//   79  156:aload_0         
	//   80  157:getfield        #34  <Field Task$TaskCompletionSource val$allFinished>
	//   81  160:invokevirtual   #112 <Method void Task$TaskCompletionSource.setCancelled()>
				return null;
	//   82  163:aconst_null     
	//   83  164:areturn         
			}
			val$allFinished.setResult(((Object) (null)));
	//   84  165:aload_0         
	//   85  166:getfield        #34  <Field Task$TaskCompletionSource val$allFinished>
	//   86  169:aconst_null     
	//   87  170:invokevirtual   #116 <Method void Task$TaskCompletionSource.setResult(Object)>
		}
		return null;
	//   88  173:aconst_null     
	//   89  174:areturn         
	}

	final skCompletionSource val$allFinished;
	final ArrayList val$causes;
	final AtomicInteger val$count;
	final Object val$errorLock;
	final AtomicBoolean val$isCancelled;

	Task$7(Object obj, ArrayList arraylist, AtomicBoolean atomicboolean, AtomicInteger atomicinteger, skCompletionSource skcompletionsource)
	{
		val$errorLock = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Object val$errorLock>
		val$causes = arraylist;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field ArrayList val$causes>
		val$isCancelled = atomicboolean;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field AtomicBoolean val$isCancelled>
		val$count = atomicinteger;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field AtomicInteger val$count>
		val$allFinished = skcompletionsource;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field Task$TaskCompletionSource val$allFinished>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #37  <Method void Object()>
	//   17   31:return          
	}
}

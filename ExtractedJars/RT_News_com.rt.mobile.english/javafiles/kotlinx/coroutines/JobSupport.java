// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import java.util.*;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.*;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.internal.ConcurrentKt;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectInstance;

// Referenced classes of package kotlinx.coroutines:
//			Job, ChildJob, ParentJob, JobSupportKt, 
//			Incomplete, CompletedExceptionally, ChildHandle, NonDisposableHandle, 
//			JobNode, CompletionHandlerException, JobCancellationException, ChildHandleNode, 
//			Empty, NodeList, JobCancellingNode, InvokeOnCancelling, 
//			InvokeOnCompletion, InactiveNodeList, CompletionHandlerBase, ResumeAwaitOnCompletion, 
//			AbstractContinuation, DisposableHandle, YieldKt, CancellableContinuationImpl, 
//			CancellableContinuation, ResumeOnCompletion, CancellableContinuationKt, DebugKt, 
//			SelectJoinOnCompletion, SelectAwaitOnCompletion

public class JobSupport
	implements Job, ChildJob, ParentJob, SelectClause0
{

	public JobSupport(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #213 <Method void Object()>
		Empty empty;
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            15
			empty = JobSupportKt.access$getEMPTY_ACTIVE$p();
	//    4    8:invokestatic    #219 <Method Empty JobSupportKt.access$getEMPTY_ACTIVE$p()>
	//    5   11:astore_2        
		else
	//*   6   12:goto            19
			empty = JobSupportKt.access$getEMPTY_NEW$p();
	//    7   15:invokestatic    #222 <Method Empty JobSupportKt.access$getEMPTY_NEW$p()>
	//    8   18:astore_2        
		_state = ((Object) (empty));
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #224 <Field Object _state>
	//   12   24:return          
	}

	private final boolean addLastAtomic(Object obj, NodeList nodelist, JobNode jobnode)
	{
		jobnode = ((JobNode) ((LockFreeLinkedListNode)jobnode));
	//    0    0:aload_3         
	//    1    1:checkcast       #235 <Class LockFreeLinkedListNode>
	//    2    4:astore_3        
	/* block-local class not found */
	class addLastAtomic..inlined.addLastIf._cls1 {}

		obj = ((Object) ((kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp)new addLastAtomic..inlined.addLastIf._cls1(((LockFreeLinkedListNode) (jobnode)), ((LockFreeLinkedListNode) (jobnode)), this, obj)));
	//    3    5:new             #237 <Class JobSupport$addLastAtomic$$inlined$addLastIf$1>
	//    4    8:dup             
	//    5    9:aload_3         
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokespecial   #240 <Method void JobSupport$addLastAtomic$$inlined$addLastIf$1(LockFreeLinkedListNode, LockFreeLinkedListNode, JobSupport, Object)>
	//   10   16:checkcast       #242 <Class kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp>
	//   11   19:astore_1        
		do
		{
			Object obj1 = ((LockFreeLinkedListNode) (nodelist)).getPrev();
	//   12   20:aload_2         
	//   13   21:invokevirtual   #245 <Method Object LockFreeLinkedListNode.getPrev()>
	//   14   24:astore          4
			if(obj1 == null)
	//*  15   26:aload           4
	//*  16   28:ifnonnull       41
				throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//   17   31:new             #247 <Class TypeCastException>
	//   18   34:dup             
	//   19   35:ldc1            #249 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   20   37:invokespecial   #252 <Method void TypeCastException(String)>
	//   21   40:athrow          
			switch(((LockFreeLinkedListNode)obj1).tryCondAddNext(((LockFreeLinkedListNode) (jobnode)), ((LockFreeLinkedListNode) (nodelist)), ((kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) (obj))))
	//*  22   41:aload           4
	//*  23   43:checkcast       #235 <Class LockFreeLinkedListNode>
	//*  24   46:aload_3         
	//*  25   47:aload_2         
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #256 <Method int LockFreeLinkedListNode.tryCondAddNext(LockFreeLinkedListNode, LockFreeLinkedListNode, kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp)>
			{
	//*  28   52:tableswitch     1 2: default 76
	//	               1 81
	//	               2 79
	//*  29   76:goto            20
			case 2: // '\002'
				return false;
	//   30   79:iconst_0        
	//   31   80:ireturn         

			case 1: // '\001'
				return true;
	//   32   81:iconst_1        
	//   33   82:ireturn         
			}
		} while(true);
	}

	private final boolean cancelImpl(Object obj)
	{
		if(getOnCancelComplete$kotlinx_coroutines_core() && cancelMakeCompleting(obj))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #261 <Method boolean getOnCancelComplete$kotlinx_coroutines_core()>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #263 <Method boolean cancelMakeCompleting(Object)>
	//*   6   12:ifeq            17
			return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
		else
			return makeCancelling(obj);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #265 <Method boolean makeCancelling(Object)>
	//   12   22:ireturn         
	}

	private final boolean cancelMakeCompleting(Object obj)
	{
		do
		{
			Object obj1 = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_2        
			if(!(obj1 instanceof Incomplete))
				break;
	//    3    5:aload_2         
	//    4    6:instanceof      #269 <Class Incomplete>
	//    5    9:ifeq            101
	/* block-local class not found */
	class Finishing {}

			if((obj1 instanceof Finishing) && ((Finishing)obj1).isCompleting)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #18  <Class JobSupport$Finishing>
	//*   8   16:ifeq            31
	//*   9   19:aload_2         
	//*  10   20:checkcast       #18  <Class JobSupport$Finishing>
	//*  11   23:getfield        #273 <Field boolean JobSupport$Finishing.isCompleting>
	//*  12   26:ifeq            31
				return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
			switch(tryMakeCompleting(obj1, ((Object) (new CompletedExceptionally(createCauseException(obj)))), 0))
	//*  15   31:aload_0         
	//*  16   32:aload_2         
	//*  17   33:new             #275 <Class CompletedExceptionally>
	//*  18   36:dup             
	//*  19   37:aload_0         
	//*  20   38:aload_1         
	//*  21   39:invokespecial   #277 <Method Throwable createCauseException(Object)>
	//*  22   42:invokespecial   #280 <Method void CompletedExceptionally(Throwable)>
	//*  23   45:iconst_0        
	//*  24   46:invokespecial   #283 <Method int tryMakeCompleting(Object, Object, int)>
			{
	//*  25   49:tableswitch     0 3: default 80
	//	               0 99
	//	               1 97
	//	               2 97
	//	               3 0
			default:
				throw (Throwable)new IllegalStateException(((Object) ("unexpected result")).toString());
	//   26   80:new             #285 <Class IllegalStateException>
	//   27   83:dup             
	//   28   84:ldc2            #287 <String "unexpected result">
	//   29   87:invokevirtual   #290 <Method String Object.toString()>
	//   30   90:invokespecial   #291 <Method void IllegalStateException(String)>
	//   31   93:checkcast       #293 <Class Throwable>
	//   32   96:athrow          

			case 1: // '\001'
			case 2: // '\002'
				return true;
	//   33   97:iconst_1        
	//   34   98:ireturn         

			case 0: // '\0'
				return false;
	//   35   99:iconst_0        
	//   36  100:ireturn         

			case 3: // '\003'
				break;
			}
		} while(true);
		return false;
	//   37  101:iconst_0        
	//   38  102:ireturn         
	}

	private final boolean cancelParent(Throwable throwable)
	{
		if(throwable instanceof CancellationException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #296 <Class CancellationException>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(!getCancelsParent())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #298 <Method boolean getCancelsParent()>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		ChildHandle childhandle = parentHandle;
	//   10   18:aload_0         
	//   11   19:getfield        #300 <Field ChildHandle parentHandle>
	//   12   22:astore_2        
		return childhandle != null && childhandle.childCancelled(throwable);
	//   13   23:aload_2         
	//   14   24:ifnull          40
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokeinterface #304 <Method boolean ChildHandle.childCancelled(Throwable)>
	//   18   34:iconst_1        
	//   19   35:icmpne          40
	//   20   38:iconst_1        
	//   21   39:ireturn         
	//   22   40:iconst_0        
	//   23   41:ireturn         
	}

	private final void completeStateFinalization(Incomplete incomplete, Object obj, int i, boolean flag)
	{
		Object obj1 = ((Object) (parentHandle));
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field ChildHandle parentHandle>
	//    2    4:astore          6
		if(obj1 != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          28
		{
			((ChildHandle) (obj1)).dispose();
	//    5   11:aload           6
	//    6   13:invokeinterface #308 <Method void ChildHandle.dispose()>
			parentHandle = (ChildHandle)NonDisposableHandle.INSTANCE;
	//    7   18:aload_0         
	//    8   19:getstatic       #314 <Field NonDisposableHandle NonDisposableHandle.INSTANCE>
	//    9   22:checkcast       #302 <Class ChildHandle>
	//   10   25:putfield        #300 <Field ChildHandle parentHandle>
		}
		boolean flag1 = obj instanceof CompletedExceptionally;
	//   11   28:aload_2         
	//   12   29:instanceof      #275 <Class CompletedExceptionally>
	//   13   32:istore          5
		Object obj2 = null;
	//   14   34:aconst_null     
	//   15   35:astore          7
		if(!flag1)
	//*  16   37:iload           5
	//*  17   39:ifne            48
			obj1 = null;
	//   18   42:aconst_null     
	//   19   43:astore          6
		else
	//*  20   45:goto            51
			obj1 = obj;
	//   21   48:aload_2         
	//   22   49:astore          6
		CompletedExceptionally completedexceptionally = (CompletedExceptionally)obj1;
	//   23   51:aload           6
	//   24   53:checkcast       #275 <Class CompletedExceptionally>
	//   25   56:astore          8
		obj1 = ((Object) (obj2));
	//   26   58:aload           7
	//   27   60:astore          6
		if(completedexceptionally != null)
	//*  28   62:aload           8
	//*  29   64:ifnull          74
			obj1 = ((Object) (completedexceptionally.cause));
	//   30   67:aload           8
	//   31   69:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   32   72:astore          6
		if(!isCancelling(incomplete))
	//*  33   74:aload_0         
	//*  34   75:aload_1         
	//*  35   76:invokespecial   #319 <Method boolean isCancelling(Incomplete)>
	//*  36   79:ifne            88
			onCancellation(((Throwable) (obj1)));
	//   37   82:aload_0         
	//   38   83:aload           6
	//   39   85:invokevirtual   #321 <Method void onCancellation(Throwable)>
		if(incomplete instanceof JobNode)
	//*  40   88:aload_1         
	//*  41   89:instanceof      #323 <Class JobNode>
	//*  42   92:ifeq            174
		{
			try
			{
				((JobNode)incomplete).invoke(((Throwable) (obj1)));
	//   43   95:aload_1         
	//   44   96:checkcast       #323 <Class JobNode>
	//   45   99:aload           6
	//   46  101:invokevirtual   #326 <Method void JobNode.invoke(Throwable)>
			}
	//*  47  104:goto            192
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//*  48  107:astore          6
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   49  109:new             #328 <Class StringBuilder>
	//   50  112:dup             
	//   51  113:invokespecial   #329 <Method void StringBuilder()>
	//   52  116:astore          7
				stringbuilder.append("Exception in completion handler ");
	//   53  118:aload           7
	//   54  120:ldc2            #331 <String "Exception in completion handler ">
	//   55  123:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   56  126:pop             
				stringbuilder.append(((Object) (incomplete)));
	//   57  127:aload           7
	//   58  129:aload_1         
	//   59  130:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   60  133:pop             
				stringbuilder.append(" for ");
	//   61  134:aload           7
	//   62  136:ldc2            #340 <String " for ">
	//   63  139:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   64  142:pop             
				stringbuilder.append(((Object) (this)));
	//   65  143:aload           7
	//   66  145:aload_0         
	//   67  146:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   68  149:pop             
				handleOnCompletionException$kotlinx_coroutines_core((Throwable)new CompletionHandlerException(stringbuilder.toString(), ((Throwable) (obj1))));
	//   69  150:aload_0         
	//   70  151:new             #342 <Class CompletionHandlerException>
	//   71  154:dup             
	//   72  155:aload           7
	//   73  157:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   74  160:aload           6
	//   75  162:invokespecial   #346 <Method void CompletionHandlerException(String, Throwable)>
	//   76  165:checkcast       #293 <Class Throwable>
	//   77  168:invokevirtual   #348 <Method void handleOnCompletionException$kotlinx_coroutines_core(Throwable)>
			}
		} else
	//*  78  171:goto            192
		{
			incomplete = ((Incomplete) (incomplete.getList()));
	//   79  174:aload_1         
	//   80  175:invokeinterface #352 <Method NodeList Incomplete.getList()>
	//   81  180:astore_1        
			if(incomplete != null)
	//*  82  181:aload_1         
	//*  83  182:ifnull          192
				notifyCompletion(((NodeList) (incomplete)), ((Throwable) (obj1)));
	//   84  185:aload_0         
	//   85  186:aload_1         
	//   86  187:aload           6
	//   87  189:invokespecial   #355 <Method void notifyCompletion(NodeList, Throwable)>
		}
		onCompletionInternal$kotlinx_coroutines_core(obj, i, flag);
	//   88  192:aload_0         
	//   89  193:aload_2         
	//   90  194:iload_3         
	//   91  195:iload           4
	//   92  197:invokevirtual   #358 <Method void onCompletionInternal$kotlinx_coroutines_core(Object, int, boolean)>
	//   93  200:return          
	}

	private final void continueCompleting(Finishing finishing, ChildHandleNode childhandlenode, Object obj)
	{
		boolean flag;
		if(getState$kotlinx_coroutines_core() == finishing)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       14
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore          4
		else
	//*   6   11:goto            17
			flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          4
		if(!flag)
	//*   9   17:iload           4
	//*  10   19:ifne            39
			throw (Throwable)new IllegalArgumentException(((Object) ("Failed requirement.")).toString());
	//   11   22:new             #360 <Class IllegalArgumentException>
	//   12   25:dup             
	//   13   26:ldc2            #362 <String "Failed requirement.">
	//   14   29:invokevirtual   #290 <Method String Object.toString()>
	//   15   32:invokespecial   #363 <Method void IllegalArgumentException(String)>
	//   16   35:checkcast       #293 <Class Throwable>
	//   17   38:athrow          
		childhandlenode = nextChild((LockFreeLinkedListNode)childhandlenode);
	//   18   39:aload_0         
	//   19   40:aload_2         
	//   20   41:checkcast       #235 <Class LockFreeLinkedListNode>
	//   21   44:invokespecial   #366 <Method ChildHandleNode nextChild(LockFreeLinkedListNode)>
	//   22   47:astore_2        
		if(childhandlenode != null && tryWaitForChild(finishing, childhandlenode, obj))
	//*  23   48:aload_2         
	//*  24   49:ifnull          63
	//*  25   52:aload_0         
	//*  26   53:aload_1         
	//*  27   54:aload_2         
	//*  28   55:aload_3         
	//*  29   56:invokespecial   #369 <Method boolean tryWaitForChild(JobSupport$Finishing, ChildHandleNode, Object)>
	//*  30   59:ifeq            63
			return;
	//   31   62:return          
		if(tryFinalizeFinishingState(finishing, obj, 0))
	//*  32   63:aload_0         
	//*  33   64:aload_1         
	//*  34   65:aload_3         
	//*  35   66:iconst_0        
	//*  36   67:invokespecial   #372 <Method boolean tryFinalizeFinishingState(JobSupport$Finishing, Object, int)>
	//*  37   70:ifeq            74
			return;
	//   38   73:return          
		else
			return;
	//   39   74:return          
	}

	private final Throwable createCauseException(Object obj)
	{
		boolean flag;
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			flag = obj instanceof Throwable;
	//    2    4:aload_1         
	//    3    5:instanceof      #293 <Class Throwable>
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		if(flag)
	//*   8   14:iload_2         
	//*   9   15:ifeq            35
		{
			if(obj == null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          27
	//*  12   22:aload_1         
	//*  13   23:checkcast       #293 <Class Throwable>
	//*  14   26:areturn         
				obj = ((Object) (createJobCancellationException()));
	//   15   27:aload_0         
	//   16   28:invokespecial   #375 <Method JobCancellationException createJobCancellationException()>
	//   17   31:astore_1        
			return (Throwable)obj;
		}
	//*  18   32:goto            22
		if(obj == null)
	//*  19   35:aload_1         
	//*  20   36:ifnonnull       50
			throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
	//   21   39:new             #247 <Class TypeCastException>
	//   22   42:dup             
	//   23   43:ldc2            #377 <String "null cannot be cast to non-null type kotlinx.coroutines.ParentJob">
	//   24   46:invokespecial   #252 <Method void TypeCastException(String)>
	//   25   49:athrow          
		else
			return ((ParentJob)obj).getChildJobCancellationCause();
	//   26   50:aload_1         
	//   27   51:checkcast       #10  <Class ParentJob>
	//   28   54:invokeinterface #380 <Method Throwable ParentJob.getChildJobCancellationCause()>
	//   29   59:areturn         
	}

	private final JobCancellationException createJobCancellationException()
	{
		return new JobCancellationException("Job was cancelled", ((Throwable) (null)), (Job)this);
	//    0    0:new             #382 <Class JobCancellationException>
	//    1    3:dup             
	//    2    4:ldc2            #384 <String "Job was cancelled">
	//    3    7:aconst_null     
	//    4    8:aload_0         
	//    5    9:checkcast       #6   <Class Job>
	//    6   12:invokespecial   #387 <Method void JobCancellationException(String, Throwable, Job)>
	//    7   15:areturn         
	}

	private final ChildHandleNode firstChild(Incomplete incomplete)
	{
		boolean flag = incomplete instanceof ChildHandleNode;
	//    0    0:aload_1         
	//    1    1:instanceof      #390 <Class ChildHandleNode>
	//    2    4:istore_2        
		Object obj1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		Object obj;
		if(!flag)
	//*   5    8:iload_2         
	//*   6    9:ifne            17
			obj = null;
	//    7   12:aconst_null     
	//    8   13:astore_3        
		else
	//*   9   14:goto            19
			obj = ((Object) (incomplete));
	//   10   17:aload_1         
	//   11   18:astore_3        
		obj = ((Object) ((ChildHandleNode)obj));
	//   12   19:aload_3         
	//   13   20:checkcast       #390 <Class ChildHandleNode>
	//   14   23:astore_3        
		if(obj != null)
	//*  15   24:aload_3         
	//*  16   25:ifnull          30
			return ((ChildHandleNode) (obj));
	//   17   28:aload_3         
	//   18   29:areturn         
		obj = ((Object) (incomplete.getList()));
	//   19   30:aload_1         
	//   20   31:invokeinterface #352 <Method NodeList Incomplete.getList()>
	//   21   36:astore_3        
		incomplete = ((Incomplete) (obj1));
	//   22   37:aload           4
	//   23   39:astore_1        
		if(obj != null)
	//*  24   40:aload_3         
	//*  25   41:ifnull          53
			incomplete = ((Incomplete) (nextChild((LockFreeLinkedListNode)obj)));
	//   26   44:aload_0         
	//   27   45:aload_3         
	//   28   46:checkcast       #235 <Class LockFreeLinkedListNode>
	//   29   49:invokespecial   #366 <Method ChildHandleNode nextChild(LockFreeLinkedListNode)>
	//   30   52:astore_1        
		return ((ChildHandleNode) (incomplete));
	//   31   53:aload_1         
	//   32   54:areturn         
	}

	private final Throwable getExceptionOrNull(Object obj)
	{
		boolean flag = obj instanceof CompletedExceptionally;
	//    0    0:aload_1         
	//    1    1:instanceof      #275 <Class CompletedExceptionally>
	//    2    4:istore_2        
		Object obj1 = null;
	//    3    5:aconst_null     
	//    4    6:astore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			obj = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
		CompletedExceptionally completedexceptionally = (CompletedExceptionally)obj;
	//    9   13:aload_1         
	//   10   14:checkcast       #275 <Class CompletedExceptionally>
	//   11   17:astore          4
		obj = ((Object) (obj1));
	//   12   19:aload_3         
	//   13   20:astore_1        
		if(completedexceptionally != null)
	//*  14   21:aload           4
	//*  15   23:ifnull          32
			obj = ((Object) (completedexceptionally.cause));
	//   16   26:aload           4
	//   17   28:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   18   31:astore_1        
		return ((Throwable) (obj));
	//   19   32:aload_1         
	//   20   33:areturn         
	}

	private final Throwable getFinalRootCause(Finishing finishing, List list)
	{
label0:
		{
			if(list.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #396 <Method boolean List.isEmpty()>
	//*   2    6:ifeq            26
				if(finishing.isCancelling())
	//*   3    9:aload_1         
	//*   4   10:invokevirtual   #398 <Method boolean JobSupport$Finishing.isCancelling()>
	//*   5   13:ifeq            24
					return (Throwable)createJobCancellationException();
	//    6   16:aload_0         
	//    7   17:invokespecial   #375 <Method JobCancellationException createJobCancellationException()>
	//    8   20:checkcast       #293 <Class Throwable>
	//    9   23:areturn         
				else
					return null;
	//   10   24:aconst_null     
	//   11   25:areturn         
			for(Iterator iterator = ((Iterable)list).iterator(); iterator.hasNext();)
	//*  12   26:aload_2         
	//*  13   27:checkcast       #400 <Class Iterable>
	//*  14   30:invokeinterface #404 <Method Iterator Iterable.iterator()>
	//*  15   35:astore          4
	//*  16   37:aload           4
	//*  17   39:invokeinterface #409 <Method boolean Iterator.hasNext()>
	//*  18   44:ifeq            79
			{
				finishing = ((Finishing) (iterator.next()));
	//   19   47:aload           4
	//   20   49:invokeinterface #412 <Method Object Iterator.next()>
	//   21   54:astore_1        
				boolean flag;
				if(!((Throwable)finishing instanceof CancellationException))
	//*  22   55:aload_1         
	//*  23   56:checkcast       #293 <Class Throwable>
	//*  24   59:instanceof      #296 <Class CancellationException>
	//*  25   62:ifne            70
					flag = true;
	//   26   65:iconst_1        
	//   27   66:istore_3        
				else
	//*  28   67:goto            72
					flag = false;
	//   29   70:iconst_0        
	//   30   71:istore_3        
				if(flag)
	//*  31   72:iload_3         
	//*  32   73:ifeq            37
					break label0;
	//   33   76:goto            81
			}

			finishing = null;
	//   34   79:aconst_null     
	//   35   80:astore_1        
		}
		finishing = ((Finishing) ((Throwable)finishing));
	//   36   81:aload_1         
	//   37   82:checkcast       #293 <Class Throwable>
	//   38   85:astore_1        
		if(finishing != null)
	//*  39   86:aload_1         
	//*  40   87:ifnull          92
			return ((Throwable) (finishing));
	//   41   90:aload_1         
	//   42   91:areturn         
		else
			return (Throwable)list.get(0);
	//   43   92:aload_2         
	//   44   93:iconst_0        
	//   45   94:invokeinterface #416 <Method Object List.get(int)>
	//   46   99:checkcast       #293 <Class Throwable>
	//   47  102:areturn         
	}

	private final NodeList getOrPromoteCancellingList(Incomplete incomplete)
	{
		NodeList nodelist = incomplete.getList();
	//    0    0:aload_1         
	//    1    1:invokeinterface #352 <Method NodeList Incomplete.getList()>
	//    2    6:astore_2        
		if(nodelist != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          13
			return nodelist;
	//    5   11:aload_2         
	//    6   12:areturn         
		if(incomplete instanceof Empty)
	//*   7   13:aload_1         
	//*   8   14:instanceof      #420 <Class Empty>
	//*   9   17:ifeq            28
			return new NodeList();
	//   10   20:new             #422 <Class NodeList>
	//   11   23:dup             
	//   12   24:invokespecial   #423 <Method void NodeList()>
	//   13   27:areturn         
		if(incomplete instanceof JobNode)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #323 <Class JobNode>
	//*  16   32:ifeq            45
		{
			promoteSingleToNodeList((JobNode)incomplete);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:checkcast       #323 <Class JobNode>
	//   20   40:invokespecial   #426 <Method void promoteSingleToNodeList(JobNode)>
			return null;
	//   21   43:aconst_null     
	//   22   44:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   45:new             #328 <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #329 <Method void StringBuilder()>
	//   26   52:astore_2        
			stringbuilder.append("State should have list: ");
	//   27   53:aload_2         
	//   28   54:ldc2            #428 <String "State should have list: ">
	//   29   57:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
			stringbuilder.append(((Object) (incomplete)));
	//   31   61:aload_2         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   34   66:pop             
			throw (Throwable)new IllegalStateException(((Object) (stringbuilder.toString())).toString());
	//   35   67:new             #285 <Class IllegalStateException>
	//   36   70:dup             
	//   37   71:aload_2         
	//   38   72:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   39   75:invokevirtual   #290 <Method String Object.toString()>
	//   40   78:invokespecial   #291 <Method void IllegalStateException(String)>
	//   41   81:checkcast       #293 <Class Throwable>
	//   42   84:athrow          
		}
	}

	private final boolean isCancelling(Incomplete incomplete)
	{
		return (incomplete instanceof Finishing) && ((Finishing)incomplete).isCancelling();
	//    0    0:aload_1         
	//    1    1:instanceof      #18  <Class JobSupport$Finishing>
	//    2    4:ifeq            19
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class JobSupport$Finishing>
	//    5   11:invokevirtual   #398 <Method boolean JobSupport$Finishing.isCancelling()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private final boolean joinInternal()
	{
		Object obj;
		do
		{
			obj = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_1        
			if(!(obj instanceof Incomplete))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #269 <Class Incomplete>
	//*   5    9:ifne            14
				return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		} while(startInternal(obj) < 0);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #431 <Method int startInternal(Object)>
	//   11   19:iflt            0
		return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	private final Void loopOnState(Function1 function1)
	{
		do
			function1.invoke(getState$kotlinx_coroutines_core());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    3    5:invokeinterface #437 <Method Object Function1.invoke(Object)>
	//    4   10:pop             
		while(true);
	//    5   11:goto            0
	}

	private final boolean makeCancelling(Object obj)
	{
		Throwable throwable = (Throwable)null;
	//    0    0:aconst_null     
	//    1    1:checkcast       #293 <Class Throwable>
	//    2    4:astore_3        
_L5:
		Object obj1 = getState$kotlinx_coroutines_core();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    5    9:astore          5
		if(!(obj1 instanceof Finishing)) goto _L2; else goto _L1
	//    6   11:aload           5
	//    7   13:instanceof      #18  <Class JobSupport$Finishing>
	//    8   16:ifeq            123
_L1:
		obj1;
	//    9   19:aload           5
		JVM INSTR monitorenter ;
	//   10   21:monitorenter    
		boolean flag = ((Finishing)obj1).isSealed();
	//   11   22:aload           5
	//   12   24:checkcast       #18  <Class JobSupport$Finishing>
	//   13   27:invokevirtual   #441 <Method boolean JobSupport$Finishing.isSealed()>
	//   14   30:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_40;
	//   15   31:iload_2         
	//   16   32:ifeq            40
		obj1;
	//   17   35:aload           5
		JVM INSTR monitorexit ;
	//   18   37:monitorexit     
		return false;
	//   19   38:iconst_0        
	//   20   39:ireturn         
		flag = ((Finishing)obj1).isCancelling();
	//   21   40:aload           5
	//   22   42:checkcast       #18  <Class JobSupport$Finishing>
	//   23   45:invokevirtual   #398 <Method boolean JobSupport$Finishing.isCancelling()>
	//   24   48:istore_2        
		if(obj == null && flag) goto _L4; else goto _L3
	//   25   49:aload_1         
	//   26   50:ifnonnull       294
	//   27   53:iload_2         
	//   28   54:ifne            75
	//*  29   57:goto            294
_L7:
		throwable = createCauseException(obj);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokespecial   #277 <Method Throwable createCauseException(Object)>
	//   33   65:astore_3        
_L6:
		((Finishing)obj1).addExceptionLocked(throwable);
	//   34   66:aload           5
	//   35   68:checkcast       #18  <Class JobSupport$Finishing>
	//   36   71:aload_3         
	//   37   72:invokevirtual   #444 <Method void JobSupport$Finishing.addExceptionLocked(Throwable)>
_L4:
		obj = ((Object) (((Finishing)obj1).rootCause));
	//   38   75:aload           5
	//   39   77:checkcast       #18  <Class JobSupport$Finishing>
	//   40   80:getfield        #446 <Field Throwable JobSupport$Finishing.rootCause>
	//   41   83:astore_1        
		if(!(flag ^ true))
	//*  42   84:iload_2         
	//*  43   85:iconst_1        
	//*  44   86:ixor            
	//*  45   87:ifeq            93
	//*  46   90:goto            95
			obj = null;
	//   47   93:aconst_null     
	//   48   94:astore_1        
		obj1;
	//   49   95:aload           5
		JVM INSTR monitorexit ;
	//   50   97:monitorexit     
		if(obj != null)
	//*  51   98:aload_1         
	//*  52   99:ifnull          115
			notifyCancelling(((Finishing)obj1).getList(), ((Throwable) (obj)));
	//   53  102:aload_0         
	//   54  103:aload           5
	//   55  105:checkcast       #18  <Class JobSupport$Finishing>
	//   56  108:invokevirtual   #447 <Method NodeList JobSupport$Finishing.getList()>
	//   57  111:aload_1         
	//   58  112:invokespecial   #449 <Method void notifyCancelling(NodeList, Throwable)>
		return true;
	//   59  115:iconst_1        
	//   60  116:ireturn         
		obj;
	//   61  117:astore_1        
	//*  62  118:aload           5
		throw obj;
	//   63  120:monitorexit     
	//   64  121:aload_1         
	//   65  122:athrow          
_L2:
		if(obj1 instanceof Incomplete)
	//*  66  123:aload           5
	//*  67  125:instanceof      #269 <Class Incomplete>
	//*  68  128:ifeq            292
		{
			Throwable throwable1;
			if(throwable != null)
	//*  69  131:aload_3         
	//*  70  132:ifnull          141
				throwable1 = throwable;
	//   71  135:aload_3         
	//   72  136:astore          4
			else
	//*  73  138:goto            148
				throwable1 = createCauseException(obj);
	//   74  141:aload_0         
	//   75  142:aload_1         
	//   76  143:invokespecial   #277 <Method Throwable createCauseException(Object)>
	//   77  146:astore          4
			Incomplete incomplete = (Incomplete)obj1;
	//   78  148:aload           5
	//   79  150:checkcast       #269 <Class Incomplete>
	//   80  153:astore          6
			if(incomplete.isActive())
	//*  81  155:aload           6
	//*  82  157:invokeinterface #451 <Method boolean Incomplete.isActive()>
	//*  83  162:ifeq            181
			{
				throwable = throwable1;
	//   84  165:aload           4
	//   85  167:astore_3        
				if(tryMakeCancelling(incomplete, throwable1))
	//*  86  168:aload_0         
	//*  87  169:aload           6
	//*  88  171:aload           4
	//*  89  173:invokespecial   #454 <Method boolean tryMakeCancelling(Incomplete, Throwable)>
	//*  90  176:ifeq            5
					return true;
	//   91  179:iconst_1        
	//   92  180:ireturn         
			} else
			{
				throwable = throwable1;
	//   93  181:aload           4
	//   94  183:astore_3        
				switch(tryMakeCompleting(obj1, ((Object) (new CompletedExceptionally(throwable1))), 0))
	//*  95  184:aload_0         
	//*  96  185:aload           5
	//*  97  187:new             #275 <Class CompletedExceptionally>
	//*  98  190:dup             
	//*  99  191:aload           4
	//* 100  193:invokespecial   #280 <Method void CompletedExceptionally(Throwable)>
	//* 101  196:iconst_0        
	//* 102  197:invokespecial   #283 <Method int tryMakeCompleting(Object, Object, int)>
				{
	//* 103  200:tableswitch     0 3: default 232
	//	               0 251
	//	               1 249
	//	               2 249
	//	               3 5
				default:
					throw (Throwable)new IllegalStateException(((Object) ("unexpected result")).toString());
	//  104  232:new             #285 <Class IllegalStateException>
	//  105  235:dup             
	//  106  236:ldc2            #287 <String "unexpected result">
	//  107  239:invokevirtual   #290 <Method String Object.toString()>
	//  108  242:invokespecial   #291 <Method void IllegalStateException(String)>
	//  109  245:checkcast       #293 <Class Throwable>
	//  110  248:athrow          

				case 1: // '\001'
				case 2: // '\002'
					return true;
	//  111  249:iconst_1        
	//  112  250:ireturn         

				case 0: // '\0'
					obj = ((Object) (new StringBuilder()));
	//  113  251:new             #328 <Class StringBuilder>
	//  114  254:dup             
	//  115  255:invokespecial   #329 <Method void StringBuilder()>
	//  116  258:astore_1        
					((StringBuilder) (obj)).append("Cannot happen in ");
	//  117  259:aload_1         
	//  118  260:ldc2            #456 <String "Cannot happen in ">
	//  119  263:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//  120  266:pop             
					((StringBuilder) (obj)).append(obj1);
	//  121  267:aload_1         
	//  122  268:aload           5
	//  123  270:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//  124  273:pop             
					throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (obj)).toString())).toString());
	//  125  274:new             #285 <Class IllegalStateException>
	//  126  277:dup             
	//  127  278:aload_1         
	//  128  279:invokevirtual   #343 <Method String StringBuilder.toString()>
	//  129  282:invokevirtual   #290 <Method String Object.toString()>
	//  130  285:invokespecial   #291 <Method void IllegalStateException(String)>
	//  131  288:checkcast       #293 <Class Throwable>
	//  132  291:athrow          

				case 3: // '\003'
					break;
				}
			}
		} else
		{
			return false;
	//  133  292:iconst_0        
	//  134  293:ireturn         
		}
		  goto _L5
_L3:
		if(throwable == null) goto _L7; else goto _L6
	//  135  294:aload_3         
	//  136  295:ifnull          60
	//* 137  298:goto            66
	}

	private final JobNode makeNode(Function1 function1, boolean flag)
	{
		boolean flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		Object obj1 = null;
	//    4    5:aconst_null     
	//    5    6:astore          6
		Object obj = null;
	//    6    8:aconst_null     
	//    7    9:astore          5
		if(flag)
	//*   8   11:iload_2         
	//*   9   12:ifeq            102
		{
			if(function1 instanceof JobCancellingNode)
	//*  10   15:aload_1         
	//*  11   16:instanceof      #459 <Class JobCancellingNode>
	//*  12   19:ifne            25
	//*  13   22:goto            28
				obj = ((Object) (function1));
	//   14   25:aload_1         
	//   15   26:astore          5
			obj = ((Object) ((JobCancellingNode)obj));
	//   16   28:aload           5
	//   17   30:checkcast       #459 <Class JobCancellingNode>
	//   18   33:astore          5
			if(obj != null)
	//*  19   35:aload           5
	//*  20   37:ifnull          86
			{
				if(((JobCancellingNode) (obj)).job == (JobSupport)this)
	//*  21   40:aload           5
	//*  22   42:getfield        #462 <Field Job JobCancellingNode.job>
	//*  23   45:aload_0         
	//*  24   46:checkcast       #2   <Class JobSupport>
	//*  25   49:if_acmpne       54
					flag1 = true;
	//   26   52:iconst_1        
	//   27   53:istore_3        
				if(!flag1)
	//*  28   54:iload_3         
	//*  29   55:ifne            75
					throw (Throwable)new IllegalArgumentException(((Object) ("Failed requirement.")).toString());
	//   30   58:new             #360 <Class IllegalArgumentException>
	//   31   61:dup             
	//   32   62:ldc2            #362 <String "Failed requirement.">
	//   33   65:invokevirtual   #290 <Method String Object.toString()>
	//   34   68:invokespecial   #363 <Method void IllegalArgumentException(String)>
	//   35   71:checkcast       #293 <Class Throwable>
	//   36   74:athrow          
				if(obj != null)
	//*  37   75:aload           5
	//*  38   77:ifnull          86
					return (JobNode)obj;
	//   39   80:aload           5
	//   40   82:checkcast       #323 <Class JobNode>
	//   41   85:areturn         
			}
			return (JobNode)new InvokeOnCancelling((Job)this, function1);
	//   42   86:new             #464 <Class InvokeOnCancelling>
	//   43   89:dup             
	//   44   90:aload_0         
	//   45   91:checkcast       #6   <Class Job>
	//   46   94:aload_1         
	//   47   95:invokespecial   #467 <Method void InvokeOnCancelling(Job, Function1)>
	//   48   98:checkcast       #323 <Class JobNode>
	//   49  101:areturn         
		}
		if(!(function1 instanceof JobNode))
	//*  50  102:aload_1         
	//*  51  103:instanceof      #323 <Class JobNode>
	//*  52  106:ifne            116
			obj = ((Object) (obj1));
	//   53  109:aload           6
	//   54  111:astore          5
		else
	//*  55  113:goto            119
			obj = ((Object) (function1));
	//   56  116:aload_1         
	//   57  117:astore          5
		obj = ((Object) ((JobNode)obj));
	//   58  119:aload           5
	//   59  121:checkcast       #323 <Class JobNode>
	//   60  124:astore          5
		if(obj != null)
	//*  61  126:aload           5
	//*  62  128:ifnull          188
		{
			boolean flag2 = flag3;
	//   63  131:iload           4
	//   64  133:istore_3        
			if(((JobNode) (obj)).job == (JobSupport)this)
	//*  65  134:aload           5
	//*  66  136:getfield        #468 <Field Job JobNode.job>
	//*  67  139:aload_0         
	//*  68  140:checkcast       #2   <Class JobSupport>
	//*  69  143:if_acmpne       159
			{
				flag2 = flag3;
	//   70  146:iload           4
	//   71  148:istore_3        
				if(!(obj instanceof JobCancellingNode))
	//*  72  149:aload           5
	//*  73  151:instanceof      #459 <Class JobCancellingNode>
	//*  74  154:ifne            159
					flag2 = true;
	//   75  157:iconst_1        
	//   76  158:istore_3        
			}
			if(!flag2)
	//*  77  159:iload_3         
	//*  78  160:ifne            180
				throw (Throwable)new IllegalArgumentException(((Object) ("Failed requirement.")).toString());
	//   79  163:new             #360 <Class IllegalArgumentException>
	//   80  166:dup             
	//   81  167:ldc2            #362 <String "Failed requirement.">
	//   82  170:invokevirtual   #290 <Method String Object.toString()>
	//   83  173:invokespecial   #363 <Method void IllegalArgumentException(String)>
	//   84  176:checkcast       #293 <Class Throwable>
	//   85  179:athrow          
			if(obj != null)
	//*  86  180:aload           5
	//*  87  182:ifnull          188
				return ((JobNode) (obj));
	//   88  185:aload           5
	//   89  187:areturn         
		}
		return (JobNode)new InvokeOnCompletion((Job)this, function1);
	//   90  188:new             #470 <Class InvokeOnCompletion>
	//   91  191:dup             
	//   92  192:aload_0         
	//   93  193:checkcast       #6   <Class Job>
	//   94  196:aload_1         
	//   95  197:invokespecial   #471 <Method void InvokeOnCompletion(Job, Function1)>
	//   96  200:checkcast       #323 <Class JobNode>
	//   97  203:areturn         
	}

	private final ChildHandleNode nextChild(LockFreeLinkedListNode lockfreelinkedlistnode)
	{
		LockFreeLinkedListNode lockfreelinkedlistnode1;
		do
		{
			lockfreelinkedlistnode1 = lockfreelinkedlistnode;
	//    0    0:aload_1         
	//    1    1:astore_2        
			if(!lockfreelinkedlistnode.isRemoved())
				break;
	//    2    2:aload_1         
	//    3    3:invokevirtual   #475 <Method boolean LockFreeLinkedListNode.isRemoved()>
	//    4    6:ifeq            17
			lockfreelinkedlistnode = lockfreelinkedlistnode.getPrevNode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #479 <Method LockFreeLinkedListNode LockFreeLinkedListNode.getPrevNode()>
	//    7   13:astore_1        
		} while(true);
	//    8   14:goto            0
		do
		{
			do
			{
				lockfreelinkedlistnode = lockfreelinkedlistnode1.getNextNode();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #482 <Method LockFreeLinkedListNode LockFreeLinkedListNode.getNextNode()>
	//   11   21:astore_1        
				if(!lockfreelinkedlistnode.isRemoved())
					break;
	//   12   22:aload_1         
	//   13   23:invokevirtual   #475 <Method boolean LockFreeLinkedListNode.isRemoved()>
	//   14   26:ifeq            34
				lockfreelinkedlistnode1 = lockfreelinkedlistnode;
	//   15   29:aload_1         
	//   16   30:astore_2        
			} while(true);
	//   17   31:goto            17
			if(lockfreelinkedlistnode instanceof ChildHandleNode)
	//*  18   34:aload_1         
	//*  19   35:instanceof      #390 <Class ChildHandleNode>
	//*  20   38:ifeq            46
				return (ChildHandleNode)lockfreelinkedlistnode;
	//   21   41:aload_1         
	//   22   42:checkcast       #390 <Class ChildHandleNode>
	//   23   45:areturn         
			lockfreelinkedlistnode1 = lockfreelinkedlistnode;
	//   24   46:aload_1         
	//   25   47:astore_2        
		} while(!(lockfreelinkedlistnode instanceof NodeList));
	//   26   48:aload_1         
	//   27   49:instanceof      #422 <Class NodeList>
	//   28   52:ifeq            17
		return null;
	//   29   55:aconst_null     
	//   30   56:areturn         
	}

	private final void notifyCancelling(NodeList nodelist, Throwable throwable)
	{
		Object obj;
		Object obj1;
		onCancellation(throwable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #321 <Method void onCancellation(Throwable)>
		obj1 = ((Object) ((Throwable)null));
	//    3    5:aconst_null     
	//    4    6:checkcast       #293 <Class Throwable>
	//    5    9:astore          4
		obj = ((LockFreeLinkedListHead) (nodelist)).getNext();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #487 <Method Object LockFreeLinkedListHead.getNext()>
	//    8   15:astore_3        
		if(obj == null)
	//*   9   16:aload_3         
	//*  10   17:ifnonnull       30
			throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//   11   20:new             #247 <Class TypeCastException>
	//   12   23:dup             
	//   13   24:ldc1            #249 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   14   26:invokespecial   #252 <Method void TypeCastException(String)>
	//   15   29:athrow          
		obj = ((Object) ((LockFreeLinkedListNode)obj));
	//   16   30:aload_3         
	//   17   31:checkcast       #235 <Class LockFreeLinkedListNode>
	//   18   34:astore_3        
_L3:
		if(!(Intrinsics.areEqual(obj, ((Object) ((LockFreeLinkedListHead)nodelist))) ^ true)) goto _L2; else goto _L1
	//   19   35:aload_3         
	//   20   36:aload_1         
	//   21   37:checkcast       #484 <Class LockFreeLinkedListHead>
	//   22   40:invokestatic    #493 <Method boolean Intrinsics.areEqual(Object, Object)>
	//   23   43:iconst_1        
	//   24   44:ixor            
	//   25   45:ifeq            189
_L1:
		Object obj2;
		obj2 = obj1;
	//   26   48:aload           4
	//   27   50:astore          5
		if(!(obj instanceof JobCancellingNode))
			break MISSING_BLOCK_LABEL_177;
	//   28   52:aload_3         
	//   29   53:instanceof      #459 <Class JobCancellingNode>
	//   30   56:ifeq            177
		obj2 = ((Object) ((JobNode)obj));
	//   31   59:aload_3         
	//   32   60:checkcast       #323 <Class JobNode>
	//   33   63:astore          5
		((JobNode) (obj2)).invoke(throwable);
	//   34   65:aload           5
	//   35   67:aload_2         
	//   36   68:invokevirtual   #326 <Method void JobNode.invoke(Throwable)>
		obj2 = obj1;
	//   37   71:aload           4
	//   38   73:astore          5
		break MISSING_BLOCK_LABEL_177;
	//   39   75:goto            177
		Throwable throwable1;
		throwable1;
	//   40   78:astore          6
		if(obj1 != null)
	//*  41   80:aload           4
	//*  42   82:ifnull          104
		{
			ExceptionsKt.addSuppressed(((Throwable) (obj1)), throwable1);
	//   43   85:aload           4
	//   44   87:aload           6
	//   45   89:invokestatic    #499 <Method void ExceptionsKt.addSuppressed(Throwable, Throwable)>
			if(obj1 != null)
	//*  46   92:aload           4
	//*  47   94:ifnull          104
			{
				obj2 = obj1;
	//   48   97:aload           4
	//   49   99:astore          5
				break MISSING_BLOCK_LABEL_177;
	//   50  101:goto            177
			}
		}
		obj1 = ((Object) ((JobSupport)this));
	//   51  104:aload_0         
	//   52  105:checkcast       #2   <Class JobSupport>
	//   53  108:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   54  110:new             #328 <Class StringBuilder>
	//   55  113:dup             
	//   56  114:invokespecial   #329 <Method void StringBuilder()>
	//   57  117:astore          7
		stringbuilder.append("Exception in completion handler ");
	//   58  119:aload           7
	//   59  121:ldc2            #331 <String "Exception in completion handler ">
	//   60  124:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   61  127:pop             
		stringbuilder.append(obj2);
	//   62  128:aload           7
	//   63  130:aload           5
	//   64  132:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   65  135:pop             
		stringbuilder.append(" for ");
	//   66  136:aload           7
	//   67  138:ldc2            #340 <String " for ">
	//   68  141:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   69  144:pop             
		stringbuilder.append(obj1);
	//   70  145:aload           7
	//   71  147:aload           4
	//   72  149:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   73  152:pop             
		obj2 = ((Object) ((Throwable)new CompletionHandlerException(stringbuilder.toString(), throwable1)));
	//   74  153:new             #342 <Class CompletionHandlerException>
	//   75  156:dup             
	//   76  157:aload           7
	//   77  159:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   78  162:aload           6
	//   79  164:invokespecial   #346 <Method void CompletionHandlerException(String, Throwable)>
	//   80  167:checkcast       #293 <Class Throwable>
	//   81  170:astore          5
		obj1 = ((Object) (Unit.INSTANCE));
	//   82  172:getstatic       #504 <Field Unit Unit.INSTANCE>
	//   83  175:astore          4
		obj = ((Object) (((LockFreeLinkedListNode) (obj)).getNextNode()));
	//   84  177:aload_3         
	//   85  178:invokevirtual   #482 <Method LockFreeLinkedListNode LockFreeLinkedListNode.getNextNode()>
	//   86  181:astore_3        
		obj1 = obj2;
	//   87  182:aload           5
	//   88  184:astore          4
		  goto _L3
	//*  89  186:goto            35
_L2:
		if(obj1 != null)
	//*  90  189:aload           4
	//*  91  191:ifnull          200
			handleOnCompletionException$kotlinx_coroutines_core(((Throwable) (obj1)));
	//   92  194:aload_0         
	//   93  195:aload           4
	//   94  197:invokevirtual   #348 <Method void handleOnCompletionException$kotlinx_coroutines_core(Throwable)>
		cancelParent(throwable);
	//   95  200:aload_0         
	//   96  201:aload_2         
	//   97  202:invokespecial   #506 <Method boolean cancelParent(Throwable)>
	//   98  205:pop             
		return;
	//   99  206:return          
	}

	private final void notifyCompletion(NodeList nodelist, Throwable throwable)
	{
		Object obj;
		Object obj1;
		obj1 = ((Object) ((Throwable)null));
	//    0    0:aconst_null     
	//    1    1:checkcast       #293 <Class Throwable>
	//    2    4:astore          4
		obj = ((LockFreeLinkedListHead) (nodelist)).getNext();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #487 <Method Object LockFreeLinkedListHead.getNext()>
	//    5   10:astore_3        
		if(obj == null)
	//*   6   11:aload_3         
	//*   7   12:ifnonnull       25
			throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//    8   15:new             #247 <Class TypeCastException>
	//    9   18:dup             
	//   10   19:ldc1            #249 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   11   21:invokespecial   #252 <Method void TypeCastException(String)>
	//   12   24:athrow          
		obj = ((Object) ((LockFreeLinkedListNode)obj));
	//   13   25:aload_3         
	//   14   26:checkcast       #235 <Class LockFreeLinkedListNode>
	//   15   29:astore_3        
_L3:
		if(!(Intrinsics.areEqual(obj, ((Object) ((LockFreeLinkedListHead)nodelist))) ^ true)) goto _L2; else goto _L1
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:checkcast       #484 <Class LockFreeLinkedListHead>
	//   19   35:invokestatic    #493 <Method boolean Intrinsics.areEqual(Object, Object)>
	//   20   38:iconst_1        
	//   21   39:ixor            
	//   22   40:ifeq            184
_L1:
		Object obj2;
		obj2 = obj1;
	//   23   43:aload           4
	//   24   45:astore          5
		if(!(obj instanceof JobNode))
			break MISSING_BLOCK_LABEL_172;
	//   25   47:aload_3         
	//   26   48:instanceof      #323 <Class JobNode>
	//   27   51:ifeq            172
		obj2 = ((Object) ((JobNode)obj));
	//   28   54:aload_3         
	//   29   55:checkcast       #323 <Class JobNode>
	//   30   58:astore          5
		((JobNode) (obj2)).invoke(throwable);
	//   31   60:aload           5
	//   32   62:aload_2         
	//   33   63:invokevirtual   #326 <Method void JobNode.invoke(Throwable)>
		obj2 = obj1;
	//   34   66:aload           4
	//   35   68:astore          5
		break MISSING_BLOCK_LABEL_172;
	//   36   70:goto            172
		Throwable throwable1;
		throwable1;
	//   37   73:astore          6
		if(obj1 != null)
	//*  38   75:aload           4
	//*  39   77:ifnull          99
		{
			ExceptionsKt.addSuppressed(((Throwable) (obj1)), throwable1);
	//   40   80:aload           4
	//   41   82:aload           6
	//   42   84:invokestatic    #499 <Method void ExceptionsKt.addSuppressed(Throwable, Throwable)>
			if(obj1 != null)
	//*  43   87:aload           4
	//*  44   89:ifnull          99
			{
				obj2 = obj1;
	//   45   92:aload           4
	//   46   94:astore          5
				break MISSING_BLOCK_LABEL_172;
	//   47   96:goto            172
			}
		}
		obj1 = ((Object) ((JobSupport)this));
	//   48   99:aload_0         
	//   49  100:checkcast       #2   <Class JobSupport>
	//   50  103:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   51  105:new             #328 <Class StringBuilder>
	//   52  108:dup             
	//   53  109:invokespecial   #329 <Method void StringBuilder()>
	//   54  112:astore          7
		stringbuilder.append("Exception in completion handler ");
	//   55  114:aload           7
	//   56  116:ldc2            #331 <String "Exception in completion handler ">
	//   57  119:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   58  122:pop             
		stringbuilder.append(obj2);
	//   59  123:aload           7
	//   60  125:aload           5
	//   61  127:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   62  130:pop             
		stringbuilder.append(" for ");
	//   63  131:aload           7
	//   64  133:ldc2            #340 <String " for ">
	//   65  136:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   66  139:pop             
		stringbuilder.append(obj1);
	//   67  140:aload           7
	//   68  142:aload           4
	//   69  144:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   70  147:pop             
		obj2 = ((Object) ((Throwable)new CompletionHandlerException(stringbuilder.toString(), throwable1)));
	//   71  148:new             #342 <Class CompletionHandlerException>
	//   72  151:dup             
	//   73  152:aload           7
	//   74  154:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   75  157:aload           6
	//   76  159:invokespecial   #346 <Method void CompletionHandlerException(String, Throwable)>
	//   77  162:checkcast       #293 <Class Throwable>
	//   78  165:astore          5
		obj1 = ((Object) (Unit.INSTANCE));
	//   79  167:getstatic       #504 <Field Unit Unit.INSTANCE>
	//   80  170:astore          4
		obj = ((Object) (((LockFreeLinkedListNode) (obj)).getNextNode()));
	//   81  172:aload_3         
	//   82  173:invokevirtual   #482 <Method LockFreeLinkedListNode LockFreeLinkedListNode.getNextNode()>
	//   83  176:astore_3        
		obj1 = obj2;
	//   84  177:aload           5
	//   85  179:astore          4
		  goto _L3
	//*  86  181:goto            30
_L2:
		if(obj1 != null)
	//*  87  184:aload           4
	//*  88  186:ifnull          195
			handleOnCompletionException$kotlinx_coroutines_core(((Throwable) (obj1)));
	//   89  189:aload_0         
	//   90  190:aload           4
	//   91  192:invokevirtual   #348 <Method void handleOnCompletionException$kotlinx_coroutines_core(Throwable)>
		return;
	//   92  195:return          
	}

	private final void notifyHandlers(NodeList nodelist, Throwable throwable)
	{
		Object obj;
		Object obj1;
		obj1 = ((Object) ((Throwable)null));
	//    0    0:aconst_null     
	//    1    1:checkcast       #293 <Class Throwable>
	//    2    4:astore          4
		obj = ((LockFreeLinkedListHead) (nodelist)).getNext();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #487 <Method Object LockFreeLinkedListHead.getNext()>
	//    5   10:astore_3        
		if(obj == null)
	//*   6   11:aload_3         
	//*   7   12:ifnonnull       25
			throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//    8   15:new             #247 <Class TypeCastException>
	//    9   18:dup             
	//   10   19:ldc1            #249 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   11   21:invokespecial   #252 <Method void TypeCastException(String)>
	//   12   24:athrow          
		obj = ((Object) ((LockFreeLinkedListNode)obj));
	//   13   25:aload_3         
	//   14   26:checkcast       #235 <Class LockFreeLinkedListNode>
	//   15   29:astore_3        
_L3:
		if(!(Intrinsics.areEqual(obj, ((Object) ((LockFreeLinkedListHead)nodelist))) ^ true)) goto _L2; else goto _L1
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:checkcast       #484 <Class LockFreeLinkedListHead>
	//   19   35:invokestatic    #493 <Method boolean Intrinsics.areEqual(Object, Object)>
	//   20   38:iconst_1        
	//   21   39:ixor            
	//   22   40:ifeq            191
_L1:
		Object obj2;
		Intrinsics.reifiedOperationMarker(3, "T");
	//   23   43:iconst_3        
	//   24   44:ldc2            #507 <String "T">
	//   25   47:invokestatic    #511 <Method void Intrinsics.reifiedOperationMarker(int, String)>
		obj2 = obj1;
	//   26   50:aload           4
	//   27   52:astore          5
		if(!(obj instanceof LockFreeLinkedListNode))
			break MISSING_BLOCK_LABEL_179;
	//   28   54:aload_3         
	//   29   55:instanceof      #235 <Class LockFreeLinkedListNode>
	//   30   58:ifeq            179
		obj2 = ((Object) ((JobNode)obj));
	//   31   61:aload_3         
	//   32   62:checkcast       #323 <Class JobNode>
	//   33   65:astore          5
		((JobNode) (obj2)).invoke(throwable);
	//   34   67:aload           5
	//   35   69:aload_2         
	//   36   70:invokevirtual   #326 <Method void JobNode.invoke(Throwable)>
		obj2 = obj1;
	//   37   73:aload           4
	//   38   75:astore          5
		break MISSING_BLOCK_LABEL_179;
	//   39   77:goto            179
		Throwable throwable1;
		throwable1;
	//   40   80:astore          6
		if(obj1 != null)
	//*  41   82:aload           4
	//*  42   84:ifnull          106
		{
			ExceptionsKt.addSuppressed(((Throwable) (obj1)), throwable1);
	//   43   87:aload           4
	//   44   89:aload           6
	//   45   91:invokestatic    #499 <Method void ExceptionsKt.addSuppressed(Throwable, Throwable)>
			if(obj1 != null)
	//*  46   94:aload           4
	//*  47   96:ifnull          106
			{
				obj2 = obj1;
	//   48   99:aload           4
	//   49  101:astore          5
				break MISSING_BLOCK_LABEL_179;
	//   50  103:goto            179
			}
		}
		obj1 = ((Object) ((JobSupport)this));
	//   51  106:aload_0         
	//   52  107:checkcast       #2   <Class JobSupport>
	//   53  110:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   54  112:new             #328 <Class StringBuilder>
	//   55  115:dup             
	//   56  116:invokespecial   #329 <Method void StringBuilder()>
	//   57  119:astore          7
		stringbuilder.append("Exception in completion handler ");
	//   58  121:aload           7
	//   59  123:ldc2            #331 <String "Exception in completion handler ">
	//   60  126:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   61  129:pop             
		stringbuilder.append(obj2);
	//   62  130:aload           7
	//   63  132:aload           5
	//   64  134:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   65  137:pop             
		stringbuilder.append(" for ");
	//   66  138:aload           7
	//   67  140:ldc2            #340 <String " for ">
	//   68  143:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   69  146:pop             
		stringbuilder.append(obj1);
	//   70  147:aload           7
	//   71  149:aload           4
	//   72  151:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   73  154:pop             
		obj2 = ((Object) ((Throwable)new CompletionHandlerException(stringbuilder.toString(), throwable1)));
	//   74  155:new             #342 <Class CompletionHandlerException>
	//   75  158:dup             
	//   76  159:aload           7
	//   77  161:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   78  164:aload           6
	//   79  166:invokespecial   #346 <Method void CompletionHandlerException(String, Throwable)>
	//   80  169:checkcast       #293 <Class Throwable>
	//   81  172:astore          5
		obj1 = ((Object) (Unit.INSTANCE));
	//   82  174:getstatic       #504 <Field Unit Unit.INSTANCE>
	//   83  177:astore          4
		obj = ((Object) (((LockFreeLinkedListNode) (obj)).getNextNode()));
	//   84  179:aload_3         
	//   85  180:invokevirtual   #482 <Method LockFreeLinkedListNode LockFreeLinkedListNode.getNextNode()>
	//   86  183:astore_3        
		obj1 = obj2;
	//   87  184:aload           5
	//   88  186:astore          4
		  goto _L3
	//*  89  188:goto            30
_L2:
		if(obj1 != null)
	//*  90  191:aload           4
	//*  91  193:ifnull          202
			handleOnCompletionException$kotlinx_coroutines_core(((Throwable) (obj1)));
	//   92  196:aload_0         
	//   93  197:aload           4
	//   94  199:invokevirtual   #348 <Method void handleOnCompletionException$kotlinx_coroutines_core(Throwable)>
		return;
	//   95  202:return          
	}

	private final void promoteEmptyToNodeList(Empty empty)
	{
		Object obj = ((Object) (new NodeList()));
	//    0    0:new             #422 <Class NodeList>
	//    1    3:dup             
	//    2    4:invokespecial   #423 <Method void NodeList()>
	//    3    7:astore_2        
		if(empty.isActive())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #514 <Method boolean Empty.isActive()>
	//*   6   12:ifeq            23
			obj = ((Object) ((Incomplete)obj));
	//    7   15:aload_2         
	//    8   16:checkcast       #269 <Class Incomplete>
	//    9   19:astore_2        
		else
	//*  10   20:goto            35
			obj = ((Object) ((Incomplete)new InactiveNodeList(((NodeList) (obj)))));
	//   11   23:new             #516 <Class InactiveNodeList>
	//   12   26:dup             
	//   13   27:aload_2         
	//   14   28:invokespecial   #519 <Method void InactiveNodeList(NodeList)>
	//   15   31:checkcast       #269 <Class Incomplete>
	//   16   34:astore_2        
		_state$FU.compareAndSet(((Object) (this)), ((Object) (empty)), obj);
	//   17   35:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//   22   44:pop             
	//   23   45:return          
	}

	private final void promoteSingleToNodeList(JobNode jobnode)
	{
		jobnode.addOneIfEmpty((LockFreeLinkedListNode)new NodeList());
	//    0    0:aload_1         
	//    1    1:new             #422 <Class NodeList>
	//    2    4:dup             
	//    3    5:invokespecial   #423 <Method void NodeList()>
	//    4    8:checkcast       #235 <Class LockFreeLinkedListNode>
	//    5   11:invokevirtual   #527 <Method boolean JobNode.addOneIfEmpty(LockFreeLinkedListNode)>
	//    6   14:pop             
		LockFreeLinkedListNode lockfreelinkedlistnode = jobnode.getNextNode();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #528 <Method LockFreeLinkedListNode JobNode.getNextNode()>
	//    9   19:astore_2        
		_state$FU.compareAndSet(((Object) (this)), ((Object) (jobnode)), ((Object) (lockfreelinkedlistnode)));
	//   10   20:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//   15   29:pop             
	//   16   30:return          
	}

	private final int startInternal(Object obj)
	{
		if(obj instanceof Empty)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #420 <Class Empty>
	//*   2    4:ifeq            41
		{
			if(((Empty)obj).isActive())
	//*   3    7:aload_1         
	//*   4    8:checkcast       #420 <Class Empty>
	//*   5   11:invokevirtual   #514 <Method boolean Empty.isActive()>
	//*   6   14:ifeq            19
				return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
			if(!_state$FU.compareAndSet(((Object) (this)), obj, ((Object) (JobSupportKt.access$getEMPTY_ACTIVE$p()))))
	//*   9   19:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:invokestatic    #219 <Method Empty JobSupportKt.access$getEMPTY_ACTIVE$p()>
	//*  13   27:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//*  14   30:ifne            35
			{
				return -1;
	//   15   33:iconst_m1       
	//   16   34:ireturn         
			} else
			{
				onStartInternal$kotlinx_coroutines_core();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #531 <Method void onStartInternal$kotlinx_coroutines_core()>
				return 1;
	//   19   39:iconst_1        
	//   20   40:ireturn         
			}
		}
		if(obj instanceof InactiveNodeList)
	//*  21   41:aload_1         
	//*  22   42:instanceof      #516 <Class InactiveNodeList>
	//*  23   45:ifeq            74
		{
			if(!_state$FU.compareAndSet(((Object) (this)), obj, ((Object) (((InactiveNodeList)obj).getList()))))
	//*  24   48:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//*  25   51:aload_0         
	//*  26   52:aload_1         
	//*  27   53:aload_1         
	//*  28   54:checkcast       #516 <Class InactiveNodeList>
	//*  29   57:invokevirtual   #532 <Method NodeList InactiveNodeList.getList()>
	//*  30   60:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//*  31   63:ifne            68
			{
				return -1;
	//   32   66:iconst_m1       
	//   33   67:ireturn         
			} else
			{
				onStartInternal$kotlinx_coroutines_core();
	//   34   68:aload_0         
	//   35   69:invokevirtual   #531 <Method void onStartInternal$kotlinx_coroutines_core()>
				return 1;
	//   36   72:iconst_1        
	//   37   73:ireturn         
			}
		} else
		{
			return 0;
	//   38   74:iconst_0        
	//   39   75:ireturn         
		}
	}

	private final String stateString(Object obj)
	{
		if(obj instanceof Finishing)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class JobSupport$Finishing>
	//*   2    4:ifeq            38
		{
			obj = ((Object) ((Finishing)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class JobSupport$Finishing>
	//    5   11:astore_1        
			if(((Finishing) (obj)).isCancelling())
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #398 <Method boolean JobSupport$Finishing.isCancelling()>
	//*   8   16:ifeq            23
				return "Cancelling";
	//    9   19:ldc2            #535 <String "Cancelling">
	//   10   22:areturn         
			if(((Finishing) (obj)).isCompleting)
	//*  11   23:aload_1         
	//*  12   24:getfield        #273 <Field boolean JobSupport$Finishing.isCompleting>
	//*  13   27:ifeq            34
				return "Completing";
	//   14   30:ldc2            #537 <String "Completing">
	//   15   33:areturn         
			else
				return "Active";
	//   16   34:ldc2            #539 <String "Active">
	//   17   37:areturn         
		}
		if(obj instanceof Incomplete)
	//*  18   38:aload_1         
	//*  19   39:instanceof      #269 <Class Incomplete>
	//*  20   42:ifeq            65
			if(((Incomplete)obj).isActive())
	//*  21   45:aload_1         
	//*  22   46:checkcast       #269 <Class Incomplete>
	//*  23   49:invokeinterface #451 <Method boolean Incomplete.isActive()>
	//*  24   54:ifeq            61
				return "Active";
	//   25   57:ldc2            #539 <String "Active">
	//   26   60:areturn         
			else
				return "New";
	//   27   61:ldc2            #541 <String "New">
	//   28   64:areturn         
		if(obj instanceof CompletedExceptionally)
	//*  29   65:aload_1         
	//*  30   66:instanceof      #275 <Class CompletedExceptionally>
	//*  31   69:ifeq            76
			return "Cancelled";
	//   32   72:ldc2            #543 <String "Cancelled">
	//   33   75:areturn         
		else
			return "Completed";
	//   34   76:ldc2            #545 <String "Completed">
	//   35   79:areturn         
	}

	private final boolean suppressExceptions(Throwable throwable, List list)
	{
		int i = list.size();
	//    0    0:aload_2         
	//    1    1:invokeinterface #550 <Method int List.size()>
	//    2    6:istore_3        
		boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore          4
		if(i <= 1)
	//*   5   10:iload_3         
	//*   6   11:iconst_1        
	//*   7   12:icmpgt          17
			return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
		Set set = ConcurrentKt.identitySet(list.size());
	//   10   17:aload_2         
	//   11   18:invokeinterface #550 <Method int List.size()>
	//   12   23:invokestatic    #556 <Method Set ConcurrentKt.identitySet(int)>
	//   13   26:astore          5
		list = ((List) (list.iterator()));
	//   14   28:aload_2         
	//   15   29:invokeinterface #557 <Method Iterator List.iterator()>
	//   16   34:astore_2        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   17   35:aload_2         
	//   18   36:invokeinterface #409 <Method boolean Iterator.hasNext()>
	//   19   41:ifeq            93
			Throwable throwable1 = (Throwable)((Iterator) (list)).next();
	//   20   44:aload_2         
	//   21   45:invokeinterface #412 <Method Object Iterator.next()>
	//   22   50:checkcast       #293 <Class Throwable>
	//   23   53:astore          6
			if(throwable1 != throwable && !(throwable1 instanceof CancellationException) && set.add(((Object) (throwable1))))
	//*  24   55:aload           6
	//*  25   57:aload_1         
	//*  26   58:if_acmpeq       35
	//*  27   61:aload           6
	//*  28   63:instanceof      #296 <Class CancellationException>
	//*  29   66:ifne            35
	//*  30   69:aload           5
	//*  31   71:aload           6
	//*  32   73:invokeinterface #562 <Method boolean Set.add(Object)>
	//*  33   78:ifeq            35
			{
				ExceptionsKt.addSuppressed(throwable, throwable1);
	//   34   81:aload_1         
	//   35   82:aload           6
	//   36   84:invokestatic    #499 <Method void ExceptionsKt.addSuppressed(Throwable, Throwable)>
				flag = true;
	//   37   87:iconst_1        
	//   38   88:istore          4
			}
		} while(true);
	//   39   90:goto            35
		return flag;
	//   40   93:iload           4
	//   41   95:ireturn         
	}

	private final CancellationException toCancellationException(Throwable throwable, String s)
	{
		Object obj;
		if(!(throwable instanceof CancellationException))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #296 <Class CancellationException>
	//*   2    4:ifne            12
			obj = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
		else
	//*   5    9:goto            14
			obj = ((Object) (throwable));
	//    6   12:aload_1         
	//    7   13:astore_3        
		obj = ((Object) ((CancellationException)obj));
	//    8   14:aload_3         
	//    9   15:checkcast       #296 <Class CancellationException>
	//   10   18:astore_3        
		if(obj != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          25
			return ((CancellationException) (obj));
	//   13   23:aload_3         
	//   14   24:areturn         
		else
			return (CancellationException)new JobCancellationException(s, throwable, (Job)this);
	//   15   25:new             #382 <Class JobCancellationException>
	//   16   28:dup             
	//   17   29:aload_2         
	//   18   30:aload_1         
	//   19   31:aload_0         
	//   20   32:checkcast       #6   <Class Job>
	//   21   35:invokespecial   #387 <Method void JobCancellationException(String, Throwable, Job)>
	//   22   38:checkcast       #296 <Class CancellationException>
	//   23   41:areturn         
	}

	private final boolean tryFinalizeFinishingState(Finishing finishing, Object obj, int i)
	{
		boolean flag3;
		Object obj1;
		boolean flag1 = obj instanceof Incomplete;
	//    0    0:aload_2         
	//    1    1:instanceof      #269 <Class Incomplete>
	//    2    4:istore          5
		flag3 = false;
	//    3    6:iconst_0        
	//    4    7:istore          6
		boolean flag;
		if(!flag1)
	//*   5    9:iload           5
	//*   6   11:ifne            20
			flag = true;
	//    7   14:iconst_1        
	//    8   15:istore          4
		else
	//*   9   17:goto            23
			flag = false;
	//   10   20:iconst_0        
	//   11   21:istore          4
		if(!flag)
	//*  12   23:iload           4
	//*  13   25:ifne            45
			throw (Throwable)new IllegalArgumentException(((Object) ("Failed requirement.")).toString());
	//   14   28:new             #360 <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:ldc2            #362 <String "Failed requirement.">
	//   17   35:invokevirtual   #290 <Method String Object.toString()>
	//   18   38:invokespecial   #363 <Method void IllegalArgumentException(String)>
	//   19   41:checkcast       #293 <Class Throwable>
	//   20   44:athrow          
		if(getState$kotlinx_coroutines_core() == finishing)
	//*  21   45:aload_0         
	//*  22   46:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//*  23   49:aload_1         
	//*  24   50:if_acmpne       59
			flag = true;
	//   25   53:iconst_1        
	//   26   54:istore          4
		else
	//*  27   56:goto            62
			flag = false;
	//   28   59:iconst_0        
	//   29   60:istore          4
		if(!flag)
	//*  30   62:iload           4
	//*  31   64:ifne            84
			throw (Throwable)new IllegalArgumentException(((Object) ("Failed requirement.")).toString());
	//   32   67:new             #360 <Class IllegalArgumentException>
	//   33   70:dup             
	//   34   71:ldc2            #362 <String "Failed requirement.">
	//   35   74:invokevirtual   #290 <Method String Object.toString()>
	//   36   77:invokespecial   #363 <Method void IllegalArgumentException(String)>
	//   37   80:checkcast       #293 <Class Throwable>
	//   38   83:athrow          
		if(!(finishing.isSealed() ^ true))
	//*  39   84:aload_1         
	//*  40   85:invokevirtual   #441 <Method boolean JobSupport$Finishing.isSealed()>
	//*  41   88:iconst_1        
	//*  42   89:ixor            
	//*  43   90:ifne            110
			throw (Throwable)new IllegalArgumentException(((Object) ("Failed requirement.")).toString());
	//   44   93:new             #360 <Class IllegalArgumentException>
	//   45   96:dup             
	//   46   97:ldc2            #362 <String "Failed requirement.">
	//   47  100:invokevirtual   #290 <Method String Object.toString()>
	//   48  103:invokespecial   #363 <Method void IllegalArgumentException(String)>
	//   49  106:checkcast       #293 <Class Throwable>
	//   50  109:athrow          
		if(!finishing.isCompleting)
	//*  51  110:aload_1         
	//*  52  111:getfield        #273 <Field boolean JobSupport$Finishing.isCompleting>
	//*  53  114:ifne            134
			throw (Throwable)new IllegalArgumentException(((Object) ("Failed requirement.")).toString());
	//   54  117:new             #360 <Class IllegalArgumentException>
	//   55  120:dup             
	//   56  121:ldc2            #362 <String "Failed requirement.">
	//   57  124:invokevirtual   #290 <Method String Object.toString()>
	//   58  127:invokespecial   #363 <Method void IllegalArgumentException(String)>
	//   59  130:checkcast       #293 <Class Throwable>
	//   60  133:athrow          
		flag1 = obj instanceof CompletedExceptionally;
	//   61  134:aload_2         
	//   62  135:instanceof      #275 <Class CompletedExceptionally>
	//   63  138:istore          5
		Object obj2 = null;
	//   64  140:aconst_null     
	//   65  141:astore          8
		if(!flag1)
	//*  66  143:iload           5
	//*  67  145:ifne            154
			obj1 = null;
	//   68  148:aconst_null     
	//   69  149:astore          7
		else
	//*  70  151:goto            157
			obj1 = obj;
	//   71  154:aload_2         
	//   72  155:astore          7
		CompletedExceptionally completedexceptionally = (CompletedExceptionally)obj1;
	//   73  157:aload           7
	//   74  159:checkcast       #275 <Class CompletedExceptionally>
	//   75  162:astore          9
		obj1 = ((Object) (obj2));
	//   76  164:aload           8
	//   77  166:astore          7
		if(completedexceptionally != null)
	//*  78  168:aload           9
	//*  79  170:ifnull          180
			obj1 = ((Object) (completedexceptionally.cause));
	//   80  173:aload           9
	//   81  175:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   82  178:astore          7
		finishing;
	//   83  180:aload_1         
		JVM INSTR monitorenter ;
	//   84  181:monitorenter    
		Throwable throwable;
		Object obj3;
		obj3 = ((Object) (finishing.sealLocked(((Throwable) (obj1)))));
	//   85  182:aload_1         
	//   86  183:aload           7
	//   87  185:invokevirtual   #568 <Method List JobSupport$Finishing.sealLocked(Throwable)>
	//   88  188:astore          9
		throwable = getFinalRootCause(finishing, ((List) (obj3)));
	//   89  190:aload_0         
	//   90  191:aload_1         
	//   91  192:aload           9
	//   92  194:invokespecial   #570 <Method Throwable getFinalRootCause(JobSupport$Finishing, List)>
	//   93  197:astore          8
		boolean flag2;
		flag2 = flag3;
	//   94  199:iload           6
	//   95  201:istore          5
		if(throwable == null)
			break MISSING_BLOCK_LABEL_239;
	//   96  203:aload           8
	//   97  205:ifnull          239
		if(suppressExceptions(throwable, ((List) (obj3))))
			break MISSING_BLOCK_LABEL_236;
	//   98  208:aload_0         
	//   99  209:aload           8
	//  100  211:aload           9
	//  101  213:invokespecial   #572 <Method boolean suppressExceptions(Throwable, List)>
	//  102  216:ifne            236
		obj3 = ((Object) (finishing.rootCause));
	//  103  219:aload_1         
	//  104  220:getfield        #446 <Field Throwable JobSupport$Finishing.rootCause>
	//  105  223:astore          9
		flag2 = flag3;
	//  106  225:iload           6
	//  107  227:istore          5
		if(throwable == obj3)
			break MISSING_BLOCK_LABEL_239;
	//  108  229:aload           8
	//  109  231:aload           9
	//  110  233:if_acmpeq       239
		flag2 = true;
	//  111  236:iconst_1        
	//  112  237:istore          5
	//* 113  239:aload_1         
	//* 114  240:monitorexit     
		if(throwable != null && throwable != obj1)
	//* 115  241:aload           8
	//* 116  243:ifnonnull       249
	//* 117  246:goto            269
	//* 118  249:aload           8
	//* 119  251:aload           7
	//* 120  253:if_acmpne       259
	//* 121  256:goto            269
			obj = ((Object) (new CompletedExceptionally(throwable)));
	//  122  259:new             #275 <Class CompletedExceptionally>
	//  123  262:dup             
	//  124  263:aload           8
	//  125  265:invokespecial   #280 <Method void CompletedExceptionally(Throwable)>
	//  126  268:astore_2        
		if(throwable != null && !cancelParent(throwable))
	//* 127  269:aload           8
	//* 128  271:ifnull          289
	//* 129  274:aload_0         
	//* 130  275:aload           8
	//* 131  277:invokespecial   #506 <Method boolean cancelParent(Throwable)>
	//* 132  280:ifne            289
			handleJobException(throwable);
	//  133  283:aload_0         
	//  134  284:aload           8
	//  135  286:invokevirtual   #574 <Method void handleJobException(Throwable)>
		if(!_state$FU.compareAndSet(((Object) (this)), ((Object) (finishing)), obj))
	//* 136  289:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//* 137  292:aload_0         
	//* 138  293:aload_1         
	//* 139  294:aload_2         
	//* 140  295:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//* 141  298:ifne            380
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  142  301:new             #328 <Class StringBuilder>
	//  143  304:dup             
	//  144  305:invokespecial   #329 <Method void StringBuilder()>
	//  145  308:astore          7
			stringbuilder.append("Unexpected state: ");
	//  146  310:aload           7
	//  147  312:ldc2            #576 <String "Unexpected state: ">
	//  148  315:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//  149  318:pop             
			stringbuilder.append(_state);
	//  150  319:aload           7
	//  151  321:aload_0         
	//  152  322:getfield        #224 <Field Object _state>
	//  153  325:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//  154  328:pop             
			stringbuilder.append(", expected: ");
	//  155  329:aload           7
	//  156  331:ldc2            #578 <String ", expected: ">
	//  157  334:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//  158  337:pop             
			stringbuilder.append(((Object) (finishing)));
	//  159  338:aload           7
	//  160  340:aload_1         
	//  161  341:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//  162  344:pop             
			stringbuilder.append(", update: ");
	//  163  345:aload           7
	//  164  347:ldc2            #580 <String ", update: ">
	//  165  350:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//  166  353:pop             
			stringbuilder.append(obj);
	//  167  354:aload           7
	//  168  356:aload_2         
	//  169  357:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//  170  360:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (stringbuilder.toString())).toString());
	//  171  361:new             #360 <Class IllegalArgumentException>
	//  172  364:dup             
	//  173  365:aload           7
	//  174  367:invokevirtual   #343 <Method String StringBuilder.toString()>
	//  175  370:invokevirtual   #290 <Method String Object.toString()>
	//  176  373:invokespecial   #363 <Method void IllegalArgumentException(String)>
	//  177  376:checkcast       #293 <Class Throwable>
	//  178  379:athrow          
		} else
		{
			completeStateFinalization((Incomplete)finishing, obj, i, flag2);
	//  179  380:aload_0         
	//  180  381:aload_1         
	//  181  382:checkcast       #269 <Class Incomplete>
	//  182  385:aload_2         
	//  183  386:iload_3         
	//  184  387:iload           5
	//  185  389:invokespecial   #582 <Method void completeStateFinalization(Incomplete, Object, int, boolean)>
			return true;
	//  186  392:iconst_1        
	//  187  393:ireturn         
		}
		obj;
	//  188  394:astore_2        
	//* 189  395:aload_1         
		throw obj;
	//  190  396:monitorexit     
	//  191  397:aload_2         
	//  192  398:athrow          
	}

	private final boolean tryFinalizeSimpleState(Incomplete incomplete, Object obj, int i)
	{
		boolean flag;
		if(!(incomplete instanceof Empty) && !(incomplete instanceof JobNode))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #420 <Class Empty>
	//*   2    4:ifne            23
	//*   3    7:aload_1         
	//*   4    8:instanceof      #323 <Class JobNode>
	//*   5   11:ifeq            17
	//*   6   14:goto            23
			flag = false;
	//    7   17:iconst_0        
	//    8   18:istore          4
		else
	//*   9   20:goto            26
			flag = true;
	//   10   23:iconst_1        
	//   11   24:istore          4
		if(!flag)
	//*  12   26:iload           4
	//*  13   28:ifne            48
			throw (Throwable)new IllegalStateException(((Object) ("Check failed.")).toString());
	//   14   31:new             #285 <Class IllegalStateException>
	//   15   34:dup             
	//   16   35:ldc2            #585 <String "Check failed.">
	//   17   38:invokevirtual   #290 <Method String Object.toString()>
	//   18   41:invokespecial   #291 <Method void IllegalStateException(String)>
	//   19   44:checkcast       #293 <Class Throwable>
	//   20   47:athrow          
		if(!(obj instanceof CompletedExceptionally))
	//*  21   48:aload_2         
	//*  22   49:instanceof      #275 <Class CompletedExceptionally>
	//*  23   52:ifne            61
			flag = true;
	//   24   55:iconst_1        
	//   25   56:istore          4
		else
	//*  26   58:goto            64
			flag = false;
	//   27   61:iconst_0        
	//   28   62:istore          4
		if(!flag)
	//*  29   64:iload           4
	//*  30   66:ifne            86
			throw (Throwable)new IllegalStateException(((Object) ("Check failed.")).toString());
	//   31   69:new             #285 <Class IllegalStateException>
	//   32   72:dup             
	//   33   73:ldc2            #585 <String "Check failed.">
	//   34   76:invokevirtual   #290 <Method String Object.toString()>
	//   35   79:invokespecial   #291 <Method void IllegalStateException(String)>
	//   36   82:checkcast       #293 <Class Throwable>
	//   37   85:athrow          
		if(!_state$FU.compareAndSet(((Object) (this)), ((Object) (incomplete)), obj))
	//*  38   86:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//*  39   89:aload_0         
	//*  40   90:aload_1         
	//*  41   91:aload_2         
	//*  42   92:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//*  43   95:ifne            100
		{
			return false;
	//   44   98:iconst_0        
	//   45   99:ireturn         
		} else
		{
			completeStateFinalization(incomplete, obj, i, false);
	//   46  100:aload_0         
	//   47  101:aload_1         
	//   48  102:aload_2         
	//   49  103:iload_3         
	//   50  104:iconst_0        
	//   51  105:invokespecial   #582 <Method void completeStateFinalization(Incomplete, Object, int, boolean)>
			return true;
	//   52  108:iconst_1        
	//   53  109:ireturn         
		}
	}

	private final boolean tryMakeCancelling(Incomplete incomplete, Throwable throwable)
	{
		boolean flag;
		if(!(incomplete instanceof Finishing))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class JobSupport$Finishing>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		if(!flag)
	//*   8   14:iload_3         
	//*   9   15:ifne            35
			throw (Throwable)new IllegalStateException(((Object) ("Check failed.")).toString());
	//   10   18:new             #285 <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:ldc2            #585 <String "Check failed.">
	//   13   25:invokevirtual   #290 <Method String Object.toString()>
	//   14   28:invokespecial   #291 <Method void IllegalStateException(String)>
	//   15   31:checkcast       #293 <Class Throwable>
	//   16   34:athrow          
		if(!incomplete.isActive())
	//*  17   35:aload_1         
	//*  18   36:invokeinterface #451 <Method boolean Incomplete.isActive()>
	//*  19   41:ifne            61
			throw (Throwable)new IllegalStateException(((Object) ("Check failed.")).toString());
	//   20   44:new             #285 <Class IllegalStateException>
	//   21   47:dup             
	//   22   48:ldc2            #585 <String "Check failed.">
	//   23   51:invokevirtual   #290 <Method String Object.toString()>
	//   24   54:invokespecial   #291 <Method void IllegalStateException(String)>
	//   25   57:checkcast       #293 <Class Throwable>
	//   26   60:athrow          
		NodeList nodelist = getOrPromoteCancellingList(incomplete);
	//   27   61:aload_0         
	//   28   62:aload_1         
	//   29   63:invokespecial   #587 <Method NodeList getOrPromoteCancellingList(Incomplete)>
	//   30   66:astore          4
		if(nodelist != null)
	//*  31   68:aload           4
	//*  32   70:ifnull          110
		{
			Finishing finishing = new Finishing(nodelist, false, throwable);
	//   33   73:new             #18  <Class JobSupport$Finishing>
	//   34   76:dup             
	//   35   77:aload           4
	//   36   79:iconst_0        
	//   37   80:aload_2         
	//   38   81:invokespecial   #590 <Method void JobSupport$Finishing(NodeList, boolean, Throwable)>
	//   39   84:astore          5
			if(!_state$FU.compareAndSet(((Object) (this)), ((Object) (incomplete)), ((Object) (finishing))))
	//*  40   86:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//*  41   89:aload_0         
	//*  42   90:aload_1         
	//*  43   91:aload           5
	//*  44   93:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//*  45   96:ifne            101
			{
				return false;
	//   46   99:iconst_0        
	//   47  100:ireturn         
			} else
			{
				notifyCancelling(nodelist, throwable);
	//   48  101:aload_0         
	//   49  102:aload           4
	//   50  104:aload_2         
	//   51  105:invokespecial   #449 <Method void notifyCancelling(NodeList, Throwable)>
				return true;
	//   52  108:iconst_1        
	//   53  109:ireturn         
			}
		} else
		{
			return false;
	//   54  110:iconst_0        
	//   55  111:ireturn         
		}
	}

	private final int tryMakeCompleting(Object obj, Object obj1, int i)
	{
		Object obj2;
		Incomplete incomplete;
		NodeList nodelist;
		if(!(obj instanceof Incomplete))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #269 <Class Incomplete>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(((obj instanceof Empty) || (obj instanceof JobNode)) && !(obj instanceof ChildHandleNode) && !(obj1 instanceof CompletedExceptionally))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #420 <Class Empty>
	//*   7   13:ifne            23
	//*   8   16:aload_1         
	//*   9   17:instanceof      #323 <Class JobNode>
	//*  10   20:ifeq            54
	//*  11   23:aload_1         
	//*  12   24:instanceof      #390 <Class ChildHandleNode>
	//*  13   27:ifne            54
	//*  14   30:aload_2         
	//*  15   31:instanceof      #275 <Class CompletedExceptionally>
	//*  16   34:ifne            54
			return tryFinalizeSimpleState((Incomplete)obj, obj1, i) ? 1 : 3;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:checkcast       #269 <Class Incomplete>
	//   20   42:aload_2         
	//   21   43:iload_3         
	//   22   44:invokespecial   #592 <Method boolean tryFinalizeSimpleState(Incomplete, Object, int)>
	//   23   47:ifne            52
	//   24   50:iconst_3        
	//   25   51:ireturn         
	//   26   52:iconst_1        
	//   27   53:ireturn         
		incomplete = (Incomplete)obj;
	//   28   54:aload_1         
	//   29   55:checkcast       #269 <Class Incomplete>
	//   30   58:astore          6
		nodelist = getOrPromoteCancellingList(incomplete);
	//   31   60:aload_0         
	//   32   61:aload           6
	//   33   63:invokespecial   #587 <Method NodeList getOrPromoteCancellingList(Incomplete)>
	//   34   66:astore          7
		if(nodelist == null)
			break MISSING_BLOCK_LABEL_321;
	//   35   68:aload           7
	//   36   70:ifnull          321
		if(!(obj instanceof Finishing))
	//*  37   73:aload_1         
	//*  38   74:instanceof      #18  <Class JobSupport$Finishing>
	//*  39   77:ifne            86
			obj2 = null;
	//   40   80:aconst_null     
	//   41   81:astore          5
		else
	//*  42   83:goto            89
			obj2 = obj;
	//   43   86:aload_1         
	//   44   87:astore          5
		obj2 = ((Object) ((Finishing)obj2));
	//   45   89:aload           5
	//   46   91:checkcast       #18  <Class JobSupport$Finishing>
	//   47   94:astore          5
		if(obj2 == null)
	//*  48   96:aload           5
	//*  49   98:ifnull          104
	//*  50  101:goto            117
			obj2 = ((Object) (new Finishing(nodelist, false, ((Throwable) (null)))));
	//   51  104:new             #18  <Class JobSupport$Finishing>
	//   52  107:dup             
	//   53  108:aload           7
	//   54  110:iconst_0        
	//   55  111:aconst_null     
	//   56  112:invokespecial   #590 <Method void JobSupport$Finishing(NodeList, boolean, Throwable)>
	//   57  115:astore          5
		Object obj3 = ((Object) ((Throwable)null));
	//   58  117:aconst_null     
	//   59  118:checkcast       #293 <Class Throwable>
	//   60  121:astore          8
		obj2;
	//   61  123:aload           5
		JVM INSTR monitorenter ;
	//   62  125:monitorenter    
		boolean flag = ((Finishing) (obj2)).isCompleting;
	//   63  126:aload           5
	//   64  128:getfield        #273 <Field boolean JobSupport$Finishing.isCompleting>
	//   65  131:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_143;
	//   66  133:iload           4
	//   67  135:ifeq            143
		obj2;
	//   68  138:aload           5
		JVM INSTR monitorexit ;
	//   69  140:monitorexit     
		return 0;
	//   70  141:iconst_0        
	//   71  142:ireturn         
		obj2.isCompleting = true;
	//   72  143:aload           5
	//   73  145:iconst_1        
	//   74  146:putfield        #273 <Field boolean JobSupport$Finishing.isCompleting>
		if(obj2 == obj)
			break MISSING_BLOCK_LABEL_177;
	//   75  149:aload           5
	//   76  151:aload_1         
	//   77  152:if_acmpeq       177
		flag = _state$FU.compareAndSet(((Object) (this)), obj, obj2);
	//   78  155:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//   79  158:aload_0         
	//   80  159:aload_1         
	//   81  160:aload           5
	//   82  162:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//   83  165:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_177;
	//   84  167:iload           4
	//   85  169:ifne            177
		obj2;
	//   86  172:aload           5
		JVM INSTR monitorexit ;
	//   87  174:monitorexit     
		return 3;
	//   88  175:iconst_3        
	//   89  176:ireturn         
		if(!(((Finishing) (obj2)).isSealed() ^ true))
	//*  90  177:aload           5
	//*  91  179:invokevirtual   #441 <Method boolean JobSupport$Finishing.isSealed()>
	//*  92  182:iconst_1        
	//*  93  183:ixor            
	//*  94  184:ifne            204
			throw (Throwable)new IllegalArgumentException(((Object) ("Failed requirement.")).toString());
	//   95  187:new             #360 <Class IllegalArgumentException>
	//   96  190:dup             
	//   97  191:ldc2            #362 <String "Failed requirement.">
	//   98  194:invokevirtual   #290 <Method String Object.toString()>
	//   99  197:invokespecial   #363 <Method void IllegalArgumentException(String)>
	//  100  200:checkcast       #293 <Class Throwable>
	//  101  203:athrow          
		flag = ((Finishing) (obj2)).isCancelling();
	//  102  204:aload           5
	//  103  206:invokevirtual   #398 <Method boolean JobSupport$Finishing.isCancelling()>
	//  104  209:istore          4
		if(!(obj1 instanceof CompletedExceptionally))
	//* 105  211:aload_2         
	//* 106  212:instanceof      #275 <Class CompletedExceptionally>
	//* 107  215:ifne            323
			obj = null;
	//  108  218:aconst_null     
	//  109  219:astore_1        
		else
	//* 110  220:goto            223
	//* 111  223:aload_1         
	//* 112  224:checkcast       #275 <Class CompletedExceptionally>
	//* 113  227:astore_1        
	//* 114  228:aload_1         
	//* 115  229:ifnull          241
	//* 116  232:aload           5
	//* 117  234:aload_1         
	//* 118  235:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//* 119  238:invokevirtual   #444 <Method void JobSupport$Finishing.addExceptionLocked(Throwable)>
	//* 120  241:aload           5
	//* 121  243:getfield        #446 <Field Throwable JobSupport$Finishing.rootCause>
	//* 122  246:astore_1        
	//* 123  247:iload           4
	//* 124  249:iconst_1        
	//* 125  250:ixor            
	//* 126  251:ifeq            328
	//* 127  254:goto            257
	//* 128  257:getstatic       #504 <Field Unit Unit.INSTANCE>
	//* 129  260:astore          8
	//* 130  262:aload           5
	//* 131  264:monitorexit     
	//* 132  265:aload_1         
	//* 133  266:ifnull          276
	//* 134  269:aload_0         
	//* 135  270:aload           7
	//* 136  272:aload_1         
	//* 137  273:invokespecial   #449 <Method void notifyCancelling(NodeList, Throwable)>
	//* 138  276:aload_0         
	//* 139  277:aload           6
	//* 140  279:invokespecial   #594 <Method ChildHandleNode firstChild(Incomplete)>
	//* 141  282:astore_1        
	//* 142  283:aload_1         
	//* 143  284:ifnull          300
	//* 144  287:aload_0         
	//* 145  288:aload           5
	//* 146  290:aload_1         
	//* 147  291:aload_2         
	//* 148  292:invokespecial   #369 <Method boolean tryWaitForChild(JobSupport$Finishing, ChildHandleNode, Object)>
	//* 149  295:ifeq            300
	//* 150  298:iconst_2        
	//* 151  299:ireturn         
	//* 152  300:aload_0         
	//* 153  301:aload           5
	//* 154  303:aload_2         
	//* 155  304:iload_3         
	//* 156  305:invokespecial   #372 <Method boolean tryFinalizeFinishingState(JobSupport$Finishing, Object, int)>
	//* 157  308:ifeq            313
	//* 158  311:iconst_1        
	//* 159  312:ireturn         
	//* 160  313:iconst_3        
	//* 161  314:ireturn         
	//* 162  315:astore_1        
	//* 163  316:aload           5
	//* 164  318:monitorexit     
	//* 165  319:aload_1         
	//* 166  320:athrow          
	//* 167  321:iconst_3        
	//* 168  322:ireturn         
			obj = obj1;
	//  169  323:aload_2         
	//  170  324:astore_1        
		obj = ((Object) ((CompletedExceptionally)obj));
		if(obj == null)
			break MISSING_BLOCK_LABEL_241;
		((Finishing) (obj2)).addExceptionLocked(((CompletedExceptionally) (obj)).cause);
		obj = ((Object) (((Finishing) (obj2)).rootCause));
		if(!(flag ^ true))
	//* 171  325:goto            223
			obj = null;
	//  172  328:aconst_null     
	//  173  329:astore_1        
		obj3 = ((Object) (Unit.INSTANCE));
		obj2;
		JVM INSTR monitorexit ;
		if(obj != null)
			notifyCancelling(nodelist, ((Throwable) (obj)));
		obj = ((Object) (firstChild(incomplete)));
		if(obj != null && tryWaitForChild(((Finishing) (obj2)), ((ChildHandleNode) (obj)), obj1))
			return 2;
		return !tryFinalizeFinishingState(((Finishing) (obj2)), obj1, i) ? 3 : 1;
		obj;
		throw obj;
		return 3;
	//* 174  330:goto            257
	}

	private final boolean tryWaitForChild(Finishing finishing, ChildHandleNode childhandlenode, Object obj)
	{
		do
		{
	/* block-local class not found */
	class ChildCompletion {}

			if(Job.DefaultImpls.invokeOnCompletion$default(((Job) (childhandlenode.childJob)), false, false, (Function1)(CompletionHandlerBase)new ChildCompletion(finishing, childhandlenode, obj), 1, ((Object) (null))) != NonDisposableHandle.INSTANCE)
	//*   0    0:aload_2         
	//*   1    1:getfield        #597 <Field ChildJob ChildHandleNode.childJob>
	//*   2    4:iconst_0        
	//*   3    5:iconst_0        
	//*   4    6:new             #16  <Class JobSupport$ChildCompletion>
	//*   5    9:dup             
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:aload_3         
	//*  10   14:invokespecial   #599 <Method void JobSupport$ChildCompletion(JobSupport, JobSupport$Finishing, ChildHandleNode, Object)>
	//*  11   17:checkcast       #601 <Class CompletionHandlerBase>
	//*  12   20:checkcast       #434 <Class Function1>
	//*  13   23:iconst_1        
	//*  14   24:aconst_null     
	//*  15   25:invokestatic    #607 <Method DisposableHandle Job$DefaultImpls.invokeOnCompletion$default(Job, boolean, boolean, Function1, int, Object)>
	//*  16   28:getstatic       #314 <Field NonDisposableHandle NonDisposableHandle.INSTANCE>
	//*  17   31:if_acmpeq       36
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
			childhandlenode = nextChild((LockFreeLinkedListNode)childhandlenode);
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:checkcast       #235 <Class LockFreeLinkedListNode>
	//   23   41:invokespecial   #366 <Method ChildHandleNode nextChild(LockFreeLinkedListNode)>
	//   24   44:astore_2        
		} while(childhandlenode != null);
	//   25   45:aload_2         
	//   26   46:ifnull          52
	//*  27   49:goto            0
		return false;
	//   28   52:iconst_0        
	//   29   53:ireturn         
	}

	public final ChildHandle attachChild(ChildJob childjob)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (childjob)), "child");
	//    0    0:aload_1         
	//    1    1:ldc2            #609 <String "child">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		childjob = ((ChildJob) (Job.DefaultImpls.invokeOnCompletion$default(((Job) (this)), true, false, (Function1)(CompletionHandlerBase)new ChildHandleNode(this, childjob), 2, ((Object) (null)))));
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:iconst_0        
	//    6   10:new             #390 <Class ChildHandleNode>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #616 <Method void ChildHandleNode(JobSupport, ChildJob)>
	//   11   19:checkcast       #601 <Class CompletionHandlerBase>
	//   12   22:checkcast       #434 <Class Function1>
	//   13   25:iconst_2        
	//   14   26:aconst_null     
	//   15   27:invokestatic    #607 <Method DisposableHandle Job$DefaultImpls.invokeOnCompletion$default(Job, boolean, boolean, Function1, int, Object)>
	//   16   30:astore_1        
		if(childjob == null)
	//*  17   31:aload_1         
	//*  18   32:ifnonnull       46
			throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
	//   19   35:new             #247 <Class TypeCastException>
	//   20   38:dup             
	//   21   39:ldc2            #618 <String "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle">
	//   22   42:invokespecial   #252 <Method void TypeCastException(String)>
	//   23   45:athrow          
		else
			return (ChildHandle)childjob;
	//   24   46:aload_1         
	//   25   47:checkcast       #302 <Class ChildHandle>
	//   26   50:areturn         
	}

	public final Object awaitInternal$kotlinx_coroutines_core(Continuation continuation)
	{
		Object obj;
		do
		{
			obj = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_2        
			if(!(obj instanceof Incomplete))
	//*   3    5:aload_2         
	//*   4    6:instanceof      #269 <Class Incomplete>
	//*   5    9:ifne            29
				if(obj instanceof CompletedExceptionally)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #275 <Class CompletedExceptionally>
	//*   8   16:ifeq            27
					throw ((CompletedExceptionally)obj).cause;
	//    9   19:aload_2         
	//   10   20:checkcast       #275 <Class CompletedExceptionally>
	//   11   23:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   12   26:athrow          
				else
					return obj;
	//   13   27:aload_2         
	//   14   28:areturn         
		} while(startInternal(obj) < 0);
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:invokespecial   #431 <Method int startInternal(Object)>
	//   18   34:iflt            0
		return awaitSuspend(continuation);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #621 <Method Object awaitSuspend(Continuation)>
	//   22   42:areturn         
	}

	final Object awaitSuspend(Continuation continuation)
	{
	/* block-local class not found */
	class AwaitContinuation {}

		Object obj = ((Object) (new AwaitContinuation(IntrinsicsKt.intercepted(continuation), this)));
	//    0    0:new             #14  <Class JobSupport$AwaitContinuation>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #628 <Method Continuation IntrinsicsKt.intercepted(Continuation)>
	//    4    8:aload_0         
	//    5    9:invokespecial   #631 <Method void JobSupport$AwaitContinuation(Continuation, JobSupport)>
	//    6   12:astore_2        
		((AwaitContinuation) (obj)).initCancellability();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #634 <Method void JobSupport$AwaitContinuation.initCancellability()>
		invokeOnCompletion((Function1)(CompletionHandlerBase)new ResumeAwaitOnCompletion(this, (AbstractContinuation)obj));
	//    9   17:aload_0         
	//   10   18:new             #636 <Class ResumeAwaitOnCompletion>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:checkcast       #638 <Class AbstractContinuation>
	//   15   27:invokespecial   #641 <Method void ResumeAwaitOnCompletion(JobSupport, AbstractContinuation)>
	//   16   30:checkcast       #601 <Class CompletionHandlerBase>
	//   17   33:checkcast       #434 <Class Function1>
	//   18   36:invokevirtual   #644 <Method DisposableHandle invokeOnCompletion(Function1)>
	//   19   39:pop             
		obj = ((AwaitContinuation) (obj)).getResult();
	//   20   40:aload_2         
	//   21   41:invokevirtual   #647 <Method Object JobSupport$AwaitContinuation.getResult()>
	//   22   44:astore_2        
		if(obj == IntrinsicsKt.getCOROUTINE_SUSPENDED())
	//*  23   45:aload_2         
	//*  24   46:invokestatic    #650 <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//*  25   49:if_acmpne       56
			DebugProbesKt.probeCoroutineSuspended(continuation);
	//   26   52:aload_1         
	//   27   53:invokestatic    #656 <Method void DebugProbesKt.probeCoroutineSuspended(Continuation)>
		return obj;
	//   28   56:aload_2         
	//   29   57:areturn         
	}

	public void cancel()
	{
		cancel(((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #658 <Method boolean cancel(Throwable)>
	//    3    5:pop             
	//    4    6:return          
	}

	public boolean cancel()
	{
		return Job.DefaultImpls.cancel(((Job) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #664 <Method boolean Job$DefaultImpls.cancel(Job)>
	//    2    4:ireturn         
	}

	public boolean cancel(Throwable throwable)
	{
		return cancelImpl(((Object) (throwable))) && getHandlesException();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #667 <Method boolean cancelImpl(Object)>
	//    3    5:ifeq            17
	//    4    8:aload_0         
	//    5    9:invokevirtual   #669 <Method boolean getHandlesException()>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean childCancelled(Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (throwable)), "cause");
	//    0    0:aload_1         
	//    1    1:ldc2            #670 <String "cause">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return cancelImpl(((Object) (throwable))) && getHandlesException();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #667 <Method boolean cancelImpl(Object)>
	//    6   12:ifeq            24
	//    7   15:aload_0         
	//    8   16:invokevirtual   #669 <Method boolean getHandlesException()>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public Object fold(Object obj, Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "operation");
	//    0    0:aload_2         
	//    1    1:ldc2            #674 <String "operation">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.fold(((Job) (this)), obj, function2);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #677 <Method Object Job$DefaultImpls.fold(Job, Object, Function2)>
	//    7   13:areturn         
	}

	public kotlin.coroutines.CoroutineContext.Element get(kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc2            #680 <String "key">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.get(((Job) (this)), key);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #683 <Method kotlin.coroutines.CoroutineContext$Element Job$DefaultImpls.get(Job, kotlin.coroutines.CoroutineContext$Key)>
	//    6   12:areturn         
	}

	public final CancellationException getCancellationException()
	{
		Object obj = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_1        
		if(obj instanceof Finishing)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #18  <Class JobSupport$Finishing>
	//*   5    9:ifeq            79
		{
			obj = ((Object) (((Finishing)obj).rootCause));
	//    6   12:aload_1         
	//    7   13:checkcast       #18  <Class JobSupport$Finishing>
	//    8   16:getfield        #446 <Field Throwable JobSupport$Finishing.rootCause>
	//    9   19:astore_1        
			if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          39
			{
				obj = ((Object) (toCancellationException(((Throwable) (obj)), "Job is cancelling")));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc2            #687 <String "Job is cancelling">
	//   15   29:invokespecial   #689 <Method CancellationException toCancellationException(Throwable, String)>
	//   16   32:astore_1        
				if(obj != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          39
					return ((CancellationException) (obj));
	//   19   37:aload_1         
	//   20   38:areturn         
			}
			obj = ((Object) (new StringBuilder()));
	//   21   39:new             #328 <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #329 <Method void StringBuilder()>
	//   24   46:astore_1        
			((StringBuilder) (obj)).append("Job is still new or active: ");
	//   25   47:aload_1         
	//   26   48:ldc2            #691 <String "Job is still new or active: ">
	//   27   51:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
			((StringBuilder) (obj)).append(((Object) (this)));
	//   29   55:aload_1         
	//   30   56:aload_0         
	//   31   57:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   32   60:pop             
			throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (obj)).toString())).toString());
	//   33   61:new             #285 <Class IllegalStateException>
	//   34   64:dup             
	//   35   65:aload_1         
	//   36   66:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   37   69:invokevirtual   #290 <Method String Object.toString()>
	//   38   72:invokespecial   #291 <Method void IllegalStateException(String)>
	//   39   75:checkcast       #293 <Class Throwable>
	//   40   78:athrow          
		}
		if(obj instanceof Incomplete)
	//*  41   79:aload_1         
	//*  42   80:instanceof      #269 <Class Incomplete>
	//*  43   83:ifeq            126
		{
			obj = ((Object) (new StringBuilder()));
	//   44   86:new             #328 <Class StringBuilder>
	//   45   89:dup             
	//   46   90:invokespecial   #329 <Method void StringBuilder()>
	//   47   93:astore_1        
			((StringBuilder) (obj)).append("Job is still new or active: ");
	//   48   94:aload_1         
	//   49   95:ldc2            #691 <String "Job is still new or active: ">
	//   50   98:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   51  101:pop             
			((StringBuilder) (obj)).append(((Object) (this)));
	//   52  102:aload_1         
	//   53  103:aload_0         
	//   54  104:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   55  107:pop             
			throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (obj)).toString())).toString());
	//   56  108:new             #285 <Class IllegalStateException>
	//   57  111:dup             
	//   58  112:aload_1         
	//   59  113:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   60  116:invokevirtual   #290 <Method String Object.toString()>
	//   61  119:invokespecial   #291 <Method void IllegalStateException(String)>
	//   62  122:checkcast       #293 <Class Throwable>
	//   63  125:athrow          
		}
		if(obj instanceof CompletedExceptionally)
	//*  64  126:aload_1         
	//*  65  127:instanceof      #275 <Class CompletedExceptionally>
	//*  66  130:ifeq            148
			return toCancellationException(((CompletedExceptionally)obj).cause, "Job was cancelled");
	//   67  133:aload_0         
	//   68  134:aload_1         
	//   69  135:checkcast       #275 <Class CompletedExceptionally>
	//   70  138:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   71  141:ldc2            #384 <String "Job was cancelled">
	//   72  144:invokespecial   #689 <Method CancellationException toCancellationException(Throwable, String)>
	//   73  147:areturn         
		else
			return (CancellationException)new JobCancellationException("Job has completed normally", ((Throwable) (null)), (Job)this);
	//   74  148:new             #382 <Class JobCancellationException>
	//   75  151:dup             
	//   76  152:ldc2            #693 <String "Job has completed normally">
	//   77  155:aconst_null     
	//   78  156:aload_0         
	//   79  157:checkcast       #6   <Class Job>
	//   80  160:invokespecial   #387 <Method void JobCancellationException(String, Throwable, Job)>
	//   81  163:checkcast       #296 <Class CancellationException>
	//   82  166:areturn         
	}

	protected boolean getCancelsParent()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Throwable getChildJobCancellationCause()
	{
		Object obj1;
label0:
		{
			Object obj2 = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_3        
			Object obj;
			if(obj2 instanceof Finishing)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #18  <Class JobSupport$Finishing>
	//*   5    9:ifeq            23
			{
				obj = ((Object) (((Finishing)obj2).rootCause));
	//    6   12:aload_3         
	//    7   13:checkcast       #18  <Class JobSupport$Finishing>
	//    8   16:getfield        #446 <Field Throwable JobSupport$Finishing.rootCause>
	//    9   19:astore_1        
			} else
	//*  10   20:goto            90
			{
				if(obj2 instanceof Incomplete)
	//*  11   23:aload_3         
	//*  12   24:instanceof      #269 <Class Incomplete>
	//*  13   27:ifeq            70
				{
					obj = ((Object) (new StringBuilder()));
	//   14   30:new             #328 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #329 <Method void StringBuilder()>
	//   17   37:astore_1        
					((StringBuilder) (obj)).append("Cannot be cancelling child in this state: ");
	//   18   38:aload_1         
	//   19   39:ldc2            #695 <String "Cannot be cancelling child in this state: ">
	//   20   42:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
					((StringBuilder) (obj)).append(obj2);
	//   22   46:aload_1         
	//   23   47:aload_3         
	//   24   48:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   25   51:pop             
					throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (obj)).toString())).toString());
	//   26   52:new             #285 <Class IllegalStateException>
	//   27   55:dup             
	//   28   56:aload_1         
	//   29   57:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   30   60:invokevirtual   #290 <Method String Object.toString()>
	//   31   63:invokespecial   #291 <Method void IllegalStateException(String)>
	//   32   66:checkcast       #293 <Class Throwable>
	//   33   69:athrow          
				}
				if(obj2 instanceof CompletedExceptionally)
	//*  34   70:aload_3         
	//*  35   71:instanceof      #275 <Class CompletedExceptionally>
	//*  36   74:ifeq            88
					obj = ((Object) (((CompletedExceptionally)obj2).cause));
	//   37   77:aload_3         
	//   38   78:checkcast       #275 <Class CompletedExceptionally>
	//   39   81:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   40   84:astore_1        
				else
	//*  41   85:goto            90
					obj = null;
	//   42   88:aconst_null     
	//   43   89:astore_1        
			}
			if(obj != null)
	//*  44   90:aload_1         
	//*  45   91:ifnull          112
			{
				obj1 = obj;
	//   46   94:aload_1         
	//   47   95:astore_2        
				if(!getHandlesException())
					break label0;
	//   48   96:aload_0         
	//   49   97:invokevirtual   #669 <Method boolean getHandlesException()>
	//   50  100:ifeq            158
				obj1 = obj;
	//   51  103:aload_1         
	//   52  104:astore_2        
				if(obj instanceof CancellationException)
					break label0;
	//   53  105:aload_1         
	//   54  106:instanceof      #296 <Class CancellationException>
	//   55  109:ifne            158
			}
			obj1 = ((Object) (new StringBuilder()));
	//   56  112:new             #328 <Class StringBuilder>
	//   57  115:dup             
	//   58  116:invokespecial   #329 <Method void StringBuilder()>
	//   59  119:astore_2        
			((StringBuilder) (obj1)).append("Parent job is ");
	//   60  120:aload_2         
	//   61  121:ldc2            #697 <String "Parent job is ">
	//   62  124:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   63  127:pop             
			((StringBuilder) (obj1)).append(stateString(obj2));
	//   64  128:aload_2         
	//   65  129:aload_0         
	//   66  130:aload_3         
	//   67  131:invokespecial   #699 <Method String stateString(Object)>
	//   68  134:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   69  137:pop             
			obj1 = ((Object) ((Throwable)new JobCancellationException(((StringBuilder) (obj1)).toString(), ((Throwable) (obj)), (Job)this)));
	//   70  138:new             #382 <Class JobCancellationException>
	//   71  141:dup             
	//   72  142:aload_2         
	//   73  143:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   74  146:aload_1         
	//   75  147:aload_0         
	//   76  148:checkcast       #6   <Class Job>
	//   77  151:invokespecial   #387 <Method void JobCancellationException(String, Throwable, Job)>
	//   78  154:checkcast       #293 <Class Throwable>
	//   79  157:astore_2        
		}
		return ((Throwable) (obj1));
	//   80  158:aload_2         
	//   81  159:areturn         
	}

	public final Sequence getChildren()
	{
	/* block-local class not found */
	class children._cls1 {}

		return SequencesKt.sequence((Function2)new children._cls1(((Continuation) (null))));
	//    0    0:new             #701 <Class JobSupport$children$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #704 <Method void JobSupport$children$1(JobSupport, Continuation)>
	//    5    9:checkcast       #706 <Class Function2>
	//    6   12:invokestatic    #712 <Method Sequence SequencesKt.sequence(Function2)>
	//    7   15:areturn         
	}

	public final Object getCompletedInternal$kotlinx_coroutines_core()
	{
		Object obj = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_2        
		boolean flag;
		if(!(obj instanceof Incomplete))
	//*   3    5:aload_2         
	//*   4    6:instanceof      #269 <Class Incomplete>
	//*   5    9:ifne            17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_1        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		if(!flag)
	//*  11   19:iload_1         
	//*  12   20:ifne            40
			throw (Throwable)new IllegalStateException(((Object) ("This job has not completed yet")).toString());
	//   13   23:new             #285 <Class IllegalStateException>
	//   14   26:dup             
	//   15   27:ldc2            #715 <String "This job has not completed yet">
	//   16   30:invokevirtual   #290 <Method String Object.toString()>
	//   17   33:invokespecial   #291 <Method void IllegalStateException(String)>
	//   18   36:checkcast       #293 <Class Throwable>
	//   19   39:athrow          
		if(obj instanceof CompletedExceptionally)
	//*  20   40:aload_2         
	//*  21   41:instanceof      #275 <Class CompletedExceptionally>
	//*  22   44:ifeq            55
			throw ((CompletedExceptionally)obj).cause;
	//   23   47:aload_2         
	//   24   48:checkcast       #275 <Class CompletedExceptionally>
	//   25   51:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   26   54:athrow          
		else
			return obj;
	//   27   55:aload_2         
	//   28   56:areturn         
	}

	protected final Throwable getCompletionCause()
	{
		Object obj = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_1        
		if(obj instanceof Finishing)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #18  <Class JobSupport$Finishing>
	//*   5    9:ifeq            66
		{
			obj = ((Object) (((Finishing)obj).rootCause));
	//    6   12:aload_1         
	//    7   13:checkcast       #18  <Class JobSupport$Finishing>
	//    8   16:getfield        #446 <Field Throwable JobSupport$Finishing.rootCause>
	//    9   19:astore_1        
			if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          26
			{
				return ((Throwable) (obj));
	//   12   24:aload_1         
	//   13   25:areturn         
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//   14   26:new             #328 <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #329 <Method void StringBuilder()>
	//   17   33:astore_1        
				((StringBuilder) (obj)).append("Job is still new or active: ");
	//   18   34:aload_1         
	//   19   35:ldc2            #691 <String "Job is still new or active: ">
	//   20   38:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
				((StringBuilder) (obj)).append(((Object) (this)));
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   25   47:pop             
				throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (obj)).toString())).toString());
	//   26   48:new             #285 <Class IllegalStateException>
	//   27   51:dup             
	//   28   52:aload_1         
	//   29   53:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   30   56:invokevirtual   #290 <Method String Object.toString()>
	//   31   59:invokespecial   #291 <Method void IllegalStateException(String)>
	//   32   62:checkcast       #293 <Class Throwable>
	//   33   65:athrow          
			}
		}
		if(obj instanceof Incomplete)
	//*  34   66:aload_1         
	//*  35   67:instanceof      #269 <Class Incomplete>
	//*  36   70:ifeq            113
		{
			obj = ((Object) (new StringBuilder()));
	//   37   73:new             #328 <Class StringBuilder>
	//   38   76:dup             
	//   39   77:invokespecial   #329 <Method void StringBuilder()>
	//   40   80:astore_1        
			((StringBuilder) (obj)).append("Job is still new or active: ");
	//   41   81:aload_1         
	//   42   82:ldc2            #691 <String "Job is still new or active: ">
	//   43   85:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
			((StringBuilder) (obj)).append(((Object) (this)));
	//   45   89:aload_1         
	//   46   90:aload_0         
	//   47   91:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   48   94:pop             
			throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (obj)).toString())).toString());
	//   49   95:new             #285 <Class IllegalStateException>
	//   50   98:dup             
	//   51   99:aload_1         
	//   52  100:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   53  103:invokevirtual   #290 <Method String Object.toString()>
	//   54  106:invokespecial   #291 <Method void IllegalStateException(String)>
	//   55  109:checkcast       #293 <Class Throwable>
	//   56  112:athrow          
		}
		if(obj instanceof CompletedExceptionally)
	//*  57  113:aload_1         
	//*  58  114:instanceof      #275 <Class CompletedExceptionally>
	//*  59  117:ifeq            128
			return ((CompletedExceptionally)obj).cause;
	//   60  120:aload_1         
	//   61  121:checkcast       #275 <Class CompletedExceptionally>
	//   62  124:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   63  127:areturn         
		else
			return null;
	//   64  128:aconst_null     
	//   65  129:areturn         
	}

	public final Throwable getCompletionExceptionOrNull()
	{
		Object obj = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_2        
		boolean flag;
		if(!(obj instanceof Incomplete))
	//*   3    5:aload_2         
	//*   4    6:instanceof      #269 <Class Incomplete>
	//*   5    9:ifne            17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_1        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		if(!flag)
	//*  11   19:iload_1         
	//*  12   20:ifne            40
			throw (Throwable)new IllegalStateException(((Object) ("This job has not completed yet")).toString());
	//   13   23:new             #285 <Class IllegalStateException>
	//   14   26:dup             
	//   15   27:ldc2            #715 <String "This job has not completed yet">
	//   16   30:invokevirtual   #290 <Method String Object.toString()>
	//   17   33:invokespecial   #291 <Method void IllegalStateException(String)>
	//   18   36:checkcast       #293 <Class Throwable>
	//   19   39:athrow          
		else
			return getExceptionOrNull(obj);
	//   20   40:aload_0         
	//   21   41:aload_2         
	//   22   42:invokespecial   #717 <Method Throwable getExceptionOrNull(Object)>
	//   23   45:areturn         
	}

	protected boolean getHandlesException()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final kotlin.coroutines.CoroutineContext.Key getKey()
	{
		return (kotlin.coroutines.CoroutineContext.Key)Job.Key;
	//    0    0:getstatic       #721 <Field Job$Key Job.Key>
	//    1    3:checkcast       #723 <Class kotlin.coroutines.CoroutineContext$Key>
	//    2    6:areturn         
	}

	public boolean getOnCancelComplete$kotlinx_coroutines_core()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final SelectClause0 getOnJoin()
	{
		return (SelectClause0)this;
	//    0    0:aload_0         
	//    1    1:checkcast       #12  <Class SelectClause0>
	//    2    4:areturn         
	}

	public final Object getState$kotlinx_coroutines_core()
	{
		do
		{
			Object obj = _state;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field Object _state>
	//    2    4:astore_1        
			if(!(obj instanceof OpDescriptor))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #726 <Class OpDescriptor>
	//*   5    9:ifne            14
				return obj;
	//    6   12:aload_1         
	//    7   13:areturn         
			((OpDescriptor)obj).perform(((Object) (this)));
	//    8   14:aload_1         
	//    9   15:checkcast       #726 <Class OpDescriptor>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #729 <Method Object OpDescriptor.perform(Object)>
	//   12   22:pop             
		} while(true);
	//   13   23:goto            0
	}

	protected void handleJobException(Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (throwable)), "exception");
	//    0    0:aload_1         
	//    1    1:ldc2            #730 <String "exception">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	//    3    7:return          
	}

	public void handleOnCompletionException$kotlinx_coroutines_core(Throwable throwable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (throwable)), "exception");
	//    0    0:aload_1         
	//    1    1:ldc2            #730 <String "exception">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		throw throwable;
	//    3    7:aload_1         
	//    4    8:athrow          
	}

	public final void initParentJobInternal$kotlinx_coroutines_core(Job job)
	{
		boolean flag;
		if(parentHandle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #300 <Field ChildHandle parentHandle>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		if(!flag)
	//*   8   14:iload_2         
	//*   9   15:ifne            35
			throw (Throwable)new IllegalStateException(((Object) ("Check failed.")).toString());
	//   10   18:new             #285 <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:ldc2            #585 <String "Check failed.">
	//   13   25:invokevirtual   #290 <Method String Object.toString()>
	//   14   28:invokespecial   #291 <Method void IllegalStateException(String)>
	//   15   31:checkcast       #293 <Class Throwable>
	//   16   34:athrow          
		if(job == null)
	//*  17   35:aload_1         
	//*  18   36:ifnonnull       50
		{
			parentHandle = (ChildHandle)NonDisposableHandle.INSTANCE;
	//   19   39:aload_0         
	//   20   40:getstatic       #314 <Field NonDisposableHandle NonDisposableHandle.INSTANCE>
	//   21   43:checkcast       #302 <Class ChildHandle>
	//   22   46:putfield        #300 <Field ChildHandle parentHandle>
			return;
	//   23   49:return          
		}
		job.start();
	//   24   50:aload_1         
	//   25   51:invokeinterface #733 <Method boolean Job.start()>
	//   26   56:pop             
		job = ((Job) (job.attachChild((ChildJob)this)));
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:checkcast       #8   <Class ChildJob>
	//   30   62:invokeinterface #735 <Method ChildHandle Job.attachChild(ChildJob)>
	//   31   67:astore_1        
		parentHandle = ((ChildHandle) (job));
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:putfield        #300 <Field ChildHandle parentHandle>
		if(isCompleted())
	//*  35   73:aload_0         
	//*  36   74:invokevirtual   #737 <Method boolean isCompleted()>
	//*  37   77:ifeq            96
		{
			((ChildHandle) (job)).dispose();
	//   38   80:aload_1         
	//   39   81:invokeinterface #308 <Method void ChildHandle.dispose()>
			parentHandle = (ChildHandle)NonDisposableHandle.INSTANCE;
	//   40   86:aload_0         
	//   41   87:getstatic       #314 <Field NonDisposableHandle NonDisposableHandle.INSTANCE>
	//   42   90:checkcast       #302 <Class ChildHandle>
	//   43   93:putfield        #300 <Field ChildHandle parentHandle>
		}
	//   44   96:return          
	}

	public final DisposableHandle invokeOnCompletion(Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "handler");
	//    0    0:aload_1         
	//    1    1:ldc2            #738 <String "handler">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return invokeOnCompletion(false, true, function1);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:iconst_1        
	//    6   10:aload_1         
	//    7   11:invokevirtual   #741 <Method DisposableHandle invokeOnCompletion(boolean, boolean, Function1)>
	//    8   14:areturn         
	}

	public final DisposableHandle invokeOnCompletion(boolean flag, boolean flag1, Function1 function1)
	{
		Object obj;
		Object obj3;
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "handler");
	//    0    0:aload_3         
	//    1    1:ldc2            #738 <String "handler">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		obj3 = null;
	//    3    7:aconst_null     
	//    4    8:astore          10
		obj = ((Object) ((JobNode)null));
	//    5   10:aconst_null     
	//    6   11:checkcast       #323 <Class JobNode>
	//    7   14:astore          5
_L10:
		do
		{
			Object obj4 = getState$kotlinx_coroutines_core();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//   10   20:astore          11
			boolean flag2;
			DisposableHandle disposablehandle;
			Object obj2;
			DisposableHandle disposablehandle1;
			Throwable throwable;
			Throwable throwable1;
			NodeList nodelist;
			if(obj4 instanceof Empty)
	//*  11   22:aload           11
	//*  12   24:instanceof      #420 <Class Empty>
	//*  13   27:ifeq            98
			{
				Object obj1 = ((Object) ((Empty)obj4));
	//   14   30:aload           11
	//   15   32:checkcast       #420 <Class Empty>
	//   16   35:astore          6
				if(((Empty) (obj1)).isActive())
	//*  17   37:aload           6
	//*  18   39:invokevirtual   #514 <Method boolean Empty.isActive()>
	//*  19   42:ifeq            89
				{
					if(obj != null)
	//*  20   45:aload           5
	//*  21   47:ifnull          57
						obj1 = obj;
	//   22   50:aload           5
	//   23   52:astore          6
					else
	//*  24   54:goto            65
						obj1 = ((Object) (makeNode(function1, flag)));
	//   25   57:aload_0         
	//   26   58:aload_3         
	//   27   59:iload_1         
	//   28   60:invokespecial   #744 <Method JobNode makeNode(Function1, boolean)>
	//   29   63:astore          6
					obj = obj1;
	//   30   65:aload           6
	//   31   67:astore          5
					if(_state$FU.compareAndSet(((Object) (this)), obj4, obj1))
	//*  32   69:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//*  33   72:aload_0         
	//*  34   73:aload           11
	//*  35   75:aload           6
	//*  36   77:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//*  37   80:ifeq            16
						return (DisposableHandle)obj1;
	//   38   83:aload           6
	//   39   85:checkcast       #746 <Class DisposableHandle>
	//   40   88:areturn         
				} else
				{
					promoteEmptyToNodeList(((Empty) (obj1)));
	//   41   89:aload_0         
	//   42   90:aload           6
	//   43   92:invokespecial   #748 <Method void promoteEmptyToNodeList(Empty)>
				}
			} else
	//*  44   95:goto            16
			if(obj4 instanceof Incomplete)
	//*  45   98:aload           11
	//*  46  100:instanceof      #269 <Class Incomplete>
	//*  47  103:ifeq            391
			{
label0:
				{
					nodelist = ((Incomplete)obj4).getList();
	//   48  106:aload           11
	//   49  108:checkcast       #269 <Class Incomplete>
	//   50  111:invokeinterface #352 <Method NodeList Incomplete.getList()>
	//   51  116:astore          13
					if(nodelist != null)
						break label0;
	//   52  118:aload           13
	//   53  120:ifnonnull       151
					if(obj4 == null)
	//*  54  123:aload           11
	//*  55  125:ifnonnull       139
						throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
	//   56  128:new             #247 <Class TypeCastException>
	//   57  131:dup             
	//   58  132:ldc2            #750 <String "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>">
	//   59  135:invokespecial   #252 <Method void TypeCastException(String)>
	//   60  138:athrow          
					promoteSingleToNodeList((JobNode)obj4);
	//   61  139:aload_0         
	//   62  140:aload           11
	//   63  142:checkcast       #323 <Class JobNode>
	//   64  145:invokespecial   #426 <Method void promoteSingleToNodeList(JobNode)>
				}
			} else
	//*  65  148:goto            16
	//*  66  151:aconst_null     
	//*  67  152:checkcast       #293 <Class Throwable>
	//*  68  155:astore          12
	//*  69  157:getstatic       #314 <Field NonDisposableHandle NonDisposableHandle.INSTANCE>
	//*  70  160:checkcast       #746 <Class DisposableHandle>
	//*  71  163:astore          8
	//*  72  165:aload           5
	//*  73  167:astore          7
	//*  74  169:aload           12
	//*  75  171:astore          9
	//*  76  173:aload           8
	//*  77  175:astore          6
	//*  78  177:iload_1         
	//*  79  178:ifeq            331
	//*  80  181:aload           5
	//*  81  183:astore          7
	//*  82  185:aload           12
	//*  83  187:astore          9
	//*  84  189:aload           8
	//*  85  191:astore          6
	//*  86  193:aload           11
	//*  87  195:instanceof      #18  <Class JobSupport$Finishing>
	//*  88  198:ifeq            331
	//*  89  201:aload           11
	//*  90  203:monitorenter    
	//*  91  204:aload           11
	//*  92  206:checkcast       #18  <Class JobSupport$Finishing>
	//*  93  209:getfield        #446 <Field Throwable JobSupport$Finishing.rootCause>
	//*  94  212:astore          9
	//*  95  214:aload           9
	//*  96  216:ifnull          449
	//*  97  219:aload           5
	//*  98  221:astore          7
	//*  99  223:aload           8
	//* 100  225:astore          6
	//* 101  227:aload_3         
	//* 102  228:instanceof      #390 <Class ChildHandleNode>
	//* 103  231:ifeq            314
	//* 104  234:aload           5
	//* 105  236:astore          7
	//* 106  238:aload           8
	//* 107  240:astore          6
	//* 108  242:aload           11
	//* 109  244:checkcast       #18  <Class JobSupport$Finishing>
	//* 110  247:getfield        #273 <Field boolean JobSupport$Finishing.isCompleting>
	//* 111  250:ifne            314
	//* 112  253:goto            449
	//* 113  256:aload_0         
	//* 114  257:aload_3         
	//* 115  258:iload_1         
	//* 116  259:invokespecial   #744 <Method JobNode makeNode(Function1, boolean)>
	//* 117  262:astore          5
	//* 118  264:aload_0         
	//* 119  265:aload           11
	//* 120  267:aload           13
	//* 121  269:aload           5
	//* 122  271:invokespecial   #752 <Method boolean addLastAtomic(Object, NodeList, JobNode)>
	//* 123  274:istore          4
	//* 124  276:iload           4
	//* 125  278:ifne            287
	//* 126  281:aload           11
	//* 127  283:monitorexit     
	//* 128  284:goto            16
	//* 129  287:aload           9
	//* 130  289:ifnonnull       303
	//* 131  292:aload           5
	//* 132  294:checkcast       #746 <Class DisposableHandle>
	//* 133  297:astore_3        
	//* 134  298:aload           11
	//* 135  300:monitorexit     
	//* 136  301:aload_3         
	//* 137  302:areturn         
	//* 138  303:aload           5
	//* 139  305:checkcast       #746 <Class DisposableHandle>
	//* 140  308:astore          6
	//* 141  310:aload           5
	//* 142  312:astore          7
	//* 143  314:getstatic       #504 <Field Unit Unit.INSTANCE>
	//* 144  317:astore          5
	//* 145  319:aload           11
	//* 146  321:monitorexit     
	//* 147  322:goto            331
	//* 148  325:astore_3        
	//* 149  326:aload           11
	//* 150  328:monitorexit     
	//* 151  329:aload_3         
	//* 152  330:athrow          
	//* 153  331:aload           9
	//* 154  333:ifnull          352
	//* 155  336:iload_2         
	//* 156  337:ifeq            349
	//* 157  340:aload_3         
	//* 158  341:aload           9
	//* 159  343:invokeinterface #437 <Method Object Function1.invoke(Object)>
	//* 160  348:pop             
	//* 161  349:aload           6
	//* 162  351:areturn         
	//* 163  352:aload           7
	//* 164  354:ifnull          360
	//* 165  357:goto            368
	//* 166  360:aload_0         
	//* 167  361:aload_3         
	//* 168  362:iload_1         
	//* 169  363:invokespecial   #744 <Method JobNode makeNode(Function1, boolean)>
	//* 170  366:astore          7
	//* 171  368:aload           7
	//* 172  370:astore          5
	//* 173  372:aload_0         
	//* 174  373:aload           11
	//* 175  375:aload           13
	//* 176  377:aload           7
	//* 177  379:invokespecial   #752 <Method boolean addLastAtomic(Object, NodeList, JobNode)>
	//* 178  382:ifeq            16
	//* 179  385:aload           7
	//* 180  387:checkcast       #746 <Class DisposableHandle>
	//* 181  390:areturn         
			{
				if(flag1)
	//* 182  391:iload_2         
	//* 183  392:ifeq            442
				{
					obj = obj4;
	//  184  395:aload           11
	//  185  397:astore          5
					if(!(obj4 instanceof CompletedExceptionally))
	//* 186  399:aload           11
	//* 187  401:instanceof      #275 <Class CompletedExceptionally>
	//* 188  404:ifne            410
						obj = null;
	//  189  407:aconst_null     
	//  190  408:astore          5
					CompletedExceptionally completedexceptionally = (CompletedExceptionally)obj;
	//  191  410:aload           5
	//  192  412:checkcast       #275 <Class CompletedExceptionally>
	//  193  415:astore          6
					obj = ((Object) (obj3));
	//  194  417:aload           10
	//  195  419:astore          5
					if(completedexceptionally != null)
	//* 196  421:aload           6
	//* 197  423:ifnull          433
						obj = ((Object) (completedexceptionally.cause));
	//  198  426:aload           6
	//  199  428:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//  200  431:astore          5
					function1.invoke(obj);
	//  201  433:aload_3         
	//  202  434:aload           5
	//  203  436:invokeinterface #437 <Method Object Function1.invoke(Object)>
	//  204  441:pop             
				}
				return (DisposableHandle)NonDisposableHandle.INSTANCE;
	//  205  442:getstatic       #314 <Field NonDisposableHandle NonDisposableHandle.INSTANCE>
	//  206  445:checkcast       #746 <Class DisposableHandle>
	//  207  448:areturn         
			}
		} while(true);
		if(!flag) goto _L2; else goto _L1
_L1:
		obj2 = obj;
		throwable = throwable1;
		disposablehandle = disposablehandle1;
		if(!(obj4 instanceof Finishing)) goto _L2; else goto _L3
_L3:
		obj4;
		JVM INSTR monitorenter ;
		throwable = ((Finishing)obj4).rootCause;
		if(throwable == null) goto _L5; else goto _L4
_L4:
		obj2 = obj;
		disposablehandle = disposablehandle1;
		if(!(function1 instanceof ChildHandleNode)) goto _L7; else goto _L6
_L6:
		obj2 = obj;
		disposablehandle = disposablehandle1;
		if(((Finishing)obj4).isCompleting) goto _L7; else goto _L5
_L12:
		obj = ((Object) (makeNode(function1, flag)));
_L11:
		flag2 = addLastAtomic(obj4, nodelist, ((JobNode) (obj)));
		if(flag2) goto _L9; else goto _L8
_L8:
		obj4;
		JVM INSTR monitorexit ;
		  goto _L10
_L9:
		if(throwable != null)
			break MISSING_BLOCK_LABEL_303;
		function1 = ((Function1) ((DisposableHandle)obj));
		obj4;
		JVM INSTR monitorexit ;
		return ((DisposableHandle) (function1));
		disposablehandle = (DisposableHandle)obj;
		obj2 = obj;
_L7:
		obj = ((Object) (Unit.INSTANCE));
		obj4;
		JVM INSTR monitorexit ;
		  goto _L2
		function1;
		throw function1;
_L2:
		if(throwable != null)
		{
			if(flag1)
				function1.invoke(((Object) (throwable)));
			return disposablehandle;
		}
		if(obj2 == null)
			obj2 = ((Object) (makeNode(function1, flag)));
		obj = obj2;
		if(addLastAtomic(obj4, nodelist, ((JobNode) (obj2))))
			return (DisposableHandle)obj2;
		  goto _L10
_L5:
		if(obj == null) goto _L12; else goto _L11
	//  208  449:aload           5
	//  209  451:ifnull          256
	//* 210  454:goto            264
	}

	public boolean isActive()
	{
		Object obj = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_1        
		return (obj instanceof Incomplete) && ((Incomplete)obj).isActive();
	//    3    5:aload_1         
	//    4    6:instanceof      #269 <Class Incomplete>
	//    5    9:ifeq            26
	//    6   12:aload_1         
	//    7   13:checkcast       #269 <Class Incomplete>
	//    8   16:invokeinterface #451 <Method boolean Incomplete.isActive()>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public final boolean isCancelled()
	{
		Object obj = getState$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:astore_1        
		return (obj instanceof CompletedExceptionally) || (obj instanceof Finishing) && ((Finishing)obj).isCancelling();
	//    3    5:aload_1         
	//    4    6:instanceof      #275 <Class CompletedExceptionally>
	//    5    9:ifne            34
	//    6   12:aload_1         
	//    7   13:instanceof      #18  <Class JobSupport$Finishing>
	//    8   16:ifeq            32
	//    9   19:aload_1         
	//   10   20:checkcast       #18  <Class JobSupport$Finishing>
	//   11   23:invokevirtual   #398 <Method boolean JobSupport$Finishing.isCancelling()>
	//   12   26:ifeq            32
	//   13   29:goto            34
	//   14   32:iconst_0        
	//   15   33:ireturn         
	//   16   34:iconst_1        
	//   17   35:ireturn         
	}

	public final boolean isCompleted()
	{
		return !(getState$kotlinx_coroutines_core() instanceof Incomplete);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:instanceof      #269 <Class Incomplete>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final boolean isCompletedExceptionally()
	{
		return getState$kotlinx_coroutines_core() instanceof CompletedExceptionally;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    2    4:instanceof      #275 <Class CompletedExceptionally>
	//    3    7:ireturn         
	}

	public final Object join(Continuation continuation)
	{
		if(!joinInternal())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #755 <Method boolean joinInternal()>
	//*   2    4:ifne            20
		{
			YieldKt.checkCompletion(continuation.getContext());
	//    3    7:aload_1         
	//    4    8:invokeinterface #761 <Method CoroutineContext Continuation.getContext()>
	//    5   13:invokestatic    #767 <Method void YieldKt.checkCompletion(CoroutineContext)>
			return ((Object) (Unit.INSTANCE));
	//    6   16:getstatic       #504 <Field Unit Unit.INSTANCE>
	//    7   19:areturn         
		} else
		{
			return joinSuspend(continuation);
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #769 <Method Object joinSuspend(Continuation)>
	//   11   25:areturn         
		}
	}

	final Object joinSuspend(Continuation continuation)
	{
		Object obj = ((Object) (new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1)));
	//    0    0:new             #772 <Class CancellableContinuationImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #628 <Method Continuation IntrinsicsKt.intercepted(Continuation)>
	//    4    8:iconst_1        
	//    5    9:invokespecial   #775 <Method void CancellableContinuationImpl(Continuation, int)>
	//    6   12:astore_2        
		((CancellableContinuationImpl) (obj)).initCancellability();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #776 <Method void CancellableContinuationImpl.initCancellability()>
		CancellableContinuation cancellablecontinuation = (CancellableContinuation)obj;
	//    9   17:aload_2         
	//   10   18:checkcast       #778 <Class CancellableContinuation>
	//   11   21:astore_3        
		CancellableContinuationKt.disposeOnCancellation(cancellablecontinuation, invokeOnCompletion((Function1)(CompletionHandlerBase)new ResumeOnCompletion((Job)this, (Continuation)cancellablecontinuation)));
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:new             #780 <Class ResumeOnCompletion>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:checkcast       #6   <Class Job>
	//   18   32:aload_3         
	//   19   33:checkcast       #757 <Class Continuation>
	//   20   36:invokespecial   #783 <Method void ResumeOnCompletion(Job, Continuation)>
	//   21   39:checkcast       #601 <Class CompletionHandlerBase>
	//   22   42:checkcast       #434 <Class Function1>
	//   23   45:invokevirtual   #644 <Method DisposableHandle invokeOnCompletion(Function1)>
	//   24   48:invokestatic    #789 <Method void CancellableContinuationKt.disposeOnCancellation(CancellableContinuation, DisposableHandle)>
		obj = ((CancellableContinuationImpl) (obj)).getResult();
	//   25   51:aload_2         
	//   26   52:invokevirtual   #790 <Method Object CancellableContinuationImpl.getResult()>
	//   27   55:astore_2        
		if(obj == IntrinsicsKt.getCOROUTINE_SUSPENDED())
	//*  28   56:aload_2         
	//*  29   57:invokestatic    #650 <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//*  30   60:if_acmpne       67
			DebugProbesKt.probeCoroutineSuspended(continuation);
	//   31   63:aload_1         
	//   32   64:invokestatic    #656 <Method void DebugProbesKt.probeCoroutineSuspended(Continuation)>
		return obj;
	//   33   67:aload_2         
	//   34   68:areturn         
	}

	public final boolean makeCompleting$kotlinx_coroutines_core(Object obj)
	{
		do
			switch(tryMakeCompleting(getState$kotlinx_coroutines_core(), obj, 0))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//*   3    5:aload_1         
	//*   4    6:iconst_0        
	//*   5    7:invokespecial   #283 <Method int tryMakeCompleting(Object, Object, int)>
			{
	//*   6   10:tableswitch     0 3: default 40
	//	               0 59
	//	               1 57
	//	               2 57
	//	               3 0
			default:
				throw (Throwable)new IllegalStateException(((Object) ("unexpected result")).toString());
	//    7   40:new             #285 <Class IllegalStateException>
	//    8   43:dup             
	//    9   44:ldc2            #287 <String "unexpected result">
	//   10   47:invokevirtual   #290 <Method String Object.toString()>
	//   11   50:invokespecial   #291 <Method void IllegalStateException(String)>
	//   12   53:checkcast       #293 <Class Throwable>
	//   13   56:athrow          

			case 1: // '\001'
			case 2: // '\002'
				return true;
	//   14   57:iconst_1        
	//   15   58:ireturn         

			case 0: // '\0'
				return false;
	//   16   59:iconst_0        
	//   17   60:ireturn         

			case 3: // '\003'
				break;
			}
		while(true);
	}

	public final boolean makeCompletingOnce$kotlinx_coroutines_core(Object obj, int i)
	{
		StringBuilder stringbuilder;
label0:
		do
			switch(tryMakeCompleting(getState$kotlinx_coroutines_core(), obj, i))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokespecial   #283 <Method int tryMakeCompleting(Object, Object, int)>
			{
	//*   6   10:tableswitch     0 3: default 40
	//	               0 61
	//	               1 59
	//	               2 57
	//	               3 0
			default:
				throw (Throwable)new IllegalStateException(((Object) ("unexpected result")).toString());
	//    7   40:new             #285 <Class IllegalStateException>
	//    8   43:dup             
	//    9   44:ldc2            #287 <String "unexpected result">
	//   10   47:invokevirtual   #290 <Method String Object.toString()>
	//   11   50:invokespecial   #291 <Method void IllegalStateException(String)>
	//   12   53:checkcast       #293 <Class Throwable>
	//   13   56:athrow          

			case 3: // '\003'
				break;

			case 2: // '\002'
				return false;
	//   14   57:iconst_0        
	//   15   58:ireturn         

			case 1: // '\001'
				return true;
	//   16   59:iconst_1        
	//   17   60:ireturn         

			case 0: // '\0'
				stringbuilder = new StringBuilder();
	//   18   61:new             #328 <Class StringBuilder>
	//   19   64:dup             
	//   20   65:invokespecial   #329 <Method void StringBuilder()>
	//   21   68:astore_3        
				break label0;
			}
		while(true);
		stringbuilder.append("Job ");
	//   22   69:aload_3         
	//   23   70:ldc2            #793 <String "Job ">
	//   24   73:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   25   76:pop             
		stringbuilder.append(((Object) (this)));
	//   26   77:aload_3         
	//   27   78:aload_0         
	//   28   79:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   29   82:pop             
		stringbuilder.append(" is already complete or completing, ");
	//   30   83:aload_3         
	//   31   84:ldc2            #795 <String " is already complete or completing, ">
	//   32   87:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   33   90:pop             
		stringbuilder.append("but is being completed with ");
	//   34   91:aload_3         
	//   35   92:ldc2            #797 <String "but is being completed with ">
	//   36   95:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   37   98:pop             
		stringbuilder.append(obj);
	//   38   99:aload_3         
	//   39  100:aload_1         
	//   40  101:invokevirtual   #338 <Method StringBuilder StringBuilder.append(Object)>
	//   41  104:pop             
		throw (Throwable)new IllegalStateException(stringbuilder.toString(), getExceptionOrNull(obj));
	//   42  105:new             #285 <Class IllegalStateException>
	//   43  108:dup             
	//   44  109:aload_3         
	//   45  110:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   46  113:aload_0         
	//   47  114:aload_1         
	//   48  115:invokespecial   #717 <Method Throwable getExceptionOrNull(Object)>
	//   49  118:invokespecial   #798 <Method void IllegalStateException(String, Throwable)>
	//   50  121:checkcast       #293 <Class Throwable>
	//   51  124:athrow          
	}

	public CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key key)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (key)), "key");
	//    0    0:aload_1         
	//    1    1:ldc2            #680 <String "key">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.minusKey(((Job) (this)), key);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #803 <Method CoroutineContext Job$DefaultImpls.minusKey(Job, kotlin.coroutines.CoroutineContext$Key)>
	//    6   12:areturn         
	}

	public String nameString$kotlinx_coroutines_core()
	{
		return DebugKt.getClassSimpleName(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #809 <Method String DebugKt.getClassSimpleName(Object)>
	//    2    4:areturn         
	}

	protected void onCancellation(Throwable throwable)
	{
	//    0    0:return          
	}

	public void onCompletionInternal$kotlinx_coroutines_core(Object obj, int i, boolean flag)
	{
	//    0    0:return          
	}

	public void onStartInternal$kotlinx_coroutines_core()
	{
	//    0    0:return          
	}

	public final void parentCancelled(ParentJob parentjob)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (parentjob)), "parentJob");
	//    0    0:aload_1         
	//    1    1:ldc2            #811 <String "parentJob">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		cancelImpl(((Object) (parentjob)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #667 <Method boolean cancelImpl(Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public CoroutineContext plus(CoroutineContext coroutinecontext)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc2            #815 <String "context">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.plus(((Job) (this)), coroutinecontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #818 <Method CoroutineContext Job$DefaultImpls.plus(Job, CoroutineContext)>
	//    6   12:areturn         
	}

	public Job plus(Job job)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (job)), "other");
	//    0    0:aload_1         
	//    1    1:ldc2            #822 <String "other">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Job.DefaultImpls.plus(((Job) (this)), job);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #825 <Method Job Job$DefaultImpls.plus(Job, Job)>
	//    6   12:areturn         
	}

	public final void registerSelectClause0(SelectInstance selectinstance, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (selectinstance)), "select");
	//    0    0:aload_1         
	//    1    1:ldc2            #826 <String "select">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "block");
	//    3    7:aload_2         
	//    4    8:ldc2            #827 <String "block">
	//    5   11:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj;
		do
		{
			obj = getState$kotlinx_coroutines_core();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    8   18:astore_3        
			if(selectinstance.isSelected())
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #832 <Method boolean SelectInstance.isSelected()>
	//*  11   25:ifeq            29
				return;
	//   12   28:return          
			if(!(obj instanceof Incomplete))
	//*  13   29:aload_3         
	//*  14   30:instanceof      #269 <Class Incomplete>
	//*  15   33:ifne            71
			{
				if(selectinstance.trySelect(((Object) (null))))
	//*  16   36:aload_1         
	//*  17   37:aconst_null     
	//*  18   38:invokeinterface #835 <Method boolean SelectInstance.trySelect(Object)>
	//*  19   43:ifeq            70
				{
					YieldKt.checkCompletion(selectinstance.getCompletion().getContext());
	//   20   46:aload_1         
	//   21   47:invokeinterface #839 <Method Continuation SelectInstance.getCompletion()>
	//   22   52:invokeinterface #761 <Method CoroutineContext Continuation.getContext()>
	//   23   57:invokestatic    #767 <Method void YieldKt.checkCompletion(CoroutineContext)>
					UndispatchedKt.startCoroutineUnintercepted(function1, selectinstance.getCompletion());
	//   24   60:aload_2         
	//   25   61:aload_1         
	//   26   62:invokeinterface #839 <Method Continuation SelectInstance.getCompletion()>
	//   27   67:invokestatic    #845 <Method void UndispatchedKt.startCoroutineUnintercepted(Function1, Continuation)>
				}
				return;
	//   28   70:return          
			}
		} while(startInternal(obj) != 0);
	//   29   71:aload_0         
	//   30   72:aload_3         
	//   31   73:invokespecial   #431 <Method int startInternal(Object)>
	//   32   76:ifne            14
		selectinstance.disposeOnSelect(invokeOnCompletion((Function1)(CompletionHandlerBase)new SelectJoinOnCompletion(this, selectinstance, function1)));
	//   33   79:aload_1         
	//   34   80:aload_0         
	//   35   81:new             #847 <Class SelectJoinOnCompletion>
	//   36   84:dup             
	//   37   85:aload_0         
	//   38   86:aload_1         
	//   39   87:aload_2         
	//   40   88:invokespecial   #850 <Method void SelectJoinOnCompletion(JobSupport, SelectInstance, Function1)>
	//   41   91:checkcast       #601 <Class CompletionHandlerBase>
	//   42   94:checkcast       #434 <Class Function1>
	//   43   97:invokevirtual   #644 <Method DisposableHandle invokeOnCompletion(Function1)>
	//   44  100:invokeinterface #854 <Method void SelectInstance.disposeOnSelect(DisposableHandle)>
	//   45  105:return          
	}

	public final void registerSelectClause1Internal$kotlinx_coroutines_core(SelectInstance selectinstance, Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (selectinstance)), "select");
	//    0    0:aload_1         
	//    1    1:ldc2            #826 <String "select">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "block");
	//    3    7:aload_2         
	//    4    8:ldc2            #827 <String "block">
	//    5   11:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj;
		do
		{
			obj = getState$kotlinx_coroutines_core();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    8   18:astore_3        
			if(selectinstance.isSelected())
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #832 <Method boolean SelectInstance.isSelected()>
	//*  11   25:ifeq            29
				return;
	//   12   28:return          
			if(!(obj instanceof Incomplete))
	//*  13   29:aload_3         
	//*  14   30:instanceof      #269 <Class Incomplete>
	//*  15   33:ifne            79
			{
				if(selectinstance.trySelect(((Object) (null))))
	//*  16   36:aload_1         
	//*  17   37:aconst_null     
	//*  18   38:invokeinterface #835 <Method boolean SelectInstance.trySelect(Object)>
	//*  19   43:ifeq            78
				{
					if(obj instanceof CompletedExceptionally)
	//*  20   46:aload_3         
	//*  21   47:instanceof      #275 <Class CompletedExceptionally>
	//*  22   50:ifeq            67
					{
						selectinstance.resumeSelectCancellableWithException(((CompletedExceptionally)obj).cause);
	//   23   53:aload_1         
	//   24   54:aload_3         
	//   25   55:checkcast       #275 <Class CompletedExceptionally>
	//   26   58:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   27   61:invokeinterface #858 <Method void SelectInstance.resumeSelectCancellableWithException(Throwable)>
						return;
	//   28   66:return          
					}
					UndispatchedKt.startCoroutineUnintercepted(function2, obj, selectinstance.getCompletion());
	//   29   67:aload_2         
	//   30   68:aload_3         
	//   31   69:aload_1         
	//   32   70:invokeinterface #839 <Method Continuation SelectInstance.getCompletion()>
	//   33   75:invokestatic    #861 <Method void UndispatchedKt.startCoroutineUnintercepted(Function2, Object, Continuation)>
				}
				return;
	//   34   78:return          
			}
		} while(startInternal(obj) != 0);
	//   35   79:aload_0         
	//   36   80:aload_3         
	//   37   81:invokespecial   #431 <Method int startInternal(Object)>
	//   38   84:ifne            14
		selectinstance.disposeOnSelect(invokeOnCompletion((Function1)(CompletionHandlerBase)new SelectAwaitOnCompletion(this, selectinstance, function2)));
	//   39   87:aload_1         
	//   40   88:aload_0         
	//   41   89:new             #863 <Class SelectAwaitOnCompletion>
	//   42   92:dup             
	//   43   93:aload_0         
	//   44   94:aload_1         
	//   45   95:aload_2         
	//   46   96:invokespecial   #866 <Method void SelectAwaitOnCompletion(JobSupport, SelectInstance, Function2)>
	//   47   99:checkcast       #601 <Class CompletionHandlerBase>
	//   48  102:checkcast       #434 <Class Function1>
	//   49  105:invokevirtual   #644 <Method DisposableHandle invokeOnCompletion(Function1)>
	//   50  108:invokeinterface #854 <Method void SelectInstance.disposeOnSelect(DisposableHandle)>
	//   51  113:return          
	}

	public final void removeNode$kotlinx_coroutines_core(JobNode jobnode)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (jobnode)), "node");
	//    0    0:aload_1         
	//    1    1:ldc2            #868 <String "node">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		do
		{
			Object obj = getState$kotlinx_coroutines_core();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    5   11:astore_2        
			if(obj instanceof JobNode)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #323 <Class JobNode>
	//*   8   16:ifeq            40
			{
				if(obj != jobnode)
	//*   9   19:aload_2         
	//*  10   20:aload_1         
	//*  11   21:if_acmpeq       25
					return;
	//   12   24:return          
				if(_state$FU.compareAndSet(((Object) (this)), obj, ((Object) (JobSupportKt.access$getEMPTY_ACTIVE$p()))))
	//*  13   25:getstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//*  14   28:aload_0         
	//*  15   29:aload_2         
	//*  16   30:invokestatic    #219 <Method Empty JobSupportKt.access$getEMPTY_ACTIVE$p()>
	//*  17   33:invokevirtual   #523 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//*  18   36:ifeq            7
					return;
	//   19   39:return          
			} else
			if(obj instanceof Incomplete)
	//*  20   40:aload_2         
	//*  21   41:instanceof      #269 <Class Incomplete>
	//*  22   44:ifeq            65
			{
				if(((Incomplete)obj).getList() != null)
	//*  23   47:aload_2         
	//*  24   48:checkcast       #269 <Class Incomplete>
	//*  25   51:invokeinterface #352 <Method NodeList Incomplete.getList()>
	//*  26   56:ifnull          64
					jobnode.remove();
	//   27   59:aload_1         
	//   28   60:invokevirtual   #871 <Method boolean JobNode.remove()>
	//   29   63:pop             
				return;
	//   30   64:return          
			} else
			{
				return;
	//   31   65:return          
			}
		} while(true);
	}

	public final void selectAwaitCompletion$kotlinx_coroutines_core(SelectInstance selectinstance, Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (selectinstance)), "select");
	//    0    0:aload_1         
	//    1    1:ldc2            #826 <String "select">
	//    2    4:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "block");
	//    3    7:aload_2         
	//    4    8:ldc2            #827 <String "block">
	//    5   11:invokestatic    #613 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = getState$kotlinx_coroutines_core();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//    8   18:astore_3        
		if(obj instanceof CompletedExceptionally)
	//*   9   19:aload_3         
	//*  10   20:instanceof      #275 <Class CompletedExceptionally>
	//*  11   23:ifeq            40
		{
			selectinstance.resumeSelectCancellableWithException(((CompletedExceptionally)obj).cause);
	//   12   26:aload_1         
	//   13   27:aload_3         
	//   14   28:checkcast       #275 <Class CompletedExceptionally>
	//   15   31:getfield        #317 <Field Throwable CompletedExceptionally.cause>
	//   16   34:invokeinterface #858 <Method void SelectInstance.resumeSelectCancellableWithException(Throwable)>
			return;
	//   17   39:return          
		} else
		{
			CancellableKt.startCoroutineCancellable(function2, obj, selectinstance.getCompletion());
	//   18   40:aload_2         
	//   19   41:aload_3         
	//   20   42:aload_1         
	//   21   43:invokeinterface #839 <Method Continuation SelectInstance.getCompletion()>
	//   22   48:invokestatic    #876 <Method void CancellableKt.startCoroutineCancellable(Function2, Object, Continuation)>
			return;
	//   23   51:return          
		}
	}

	public final boolean start()
	{
		do
			switch(startInternal(getState$kotlinx_coroutines_core()))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//*   3    5:invokespecial   #431 <Method int startInternal(Object)>
			{
	//*   4    8:tableswitch     0 1: default 32
	//	               0 37
	//	               1 35
	//*   5   32:goto            0
			case 1: // '\001'
				return true;
	//    6   35:iconst_1        
	//    7   36:ireturn         

			case 0: // '\0'
				return false;
	//    8   37:iconst_0        
	//    9   38:ireturn         
			}
		while(true);
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #328 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #329 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(nameString$kotlinx_coroutines_core());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #878 <Method String nameString$kotlinx_coroutines_core()>
	//    7   13:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append('{');
	//    9   17:aload_1         
	//   10   18:bipush          123
	//   11   20:invokevirtual   #881 <Method StringBuilder StringBuilder.append(char)>
	//   12   23:pop             
		stringbuilder.append(stateString(getState$kotlinx_coroutines_core()));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:aload_0         
	//   16   27:invokevirtual   #267 <Method Object getState$kotlinx_coroutines_core()>
	//   17   30:invokespecial   #699 <Method String stateString(Object)>
	//   18   33:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		stringbuilder.append("}@");
	//   20   37:aload_1         
	//   21   38:ldc2            #883 <String "}@">
	//   22   41:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		stringbuilder.append(DebugKt.getHexAddress(((Object) (this))));
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:invokestatic    #886 <Method String DebugKt.getHexAddress(Object)>
	//   27   50:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
		return stringbuilder.toString();
	//   29   54:aload_1         
	//   30   55:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   31   58:areturn         
	}

	private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(kotlinx/coroutines/JobSupport, java/lang/Object, "_state");
	private volatile Object _state;
	private volatile ChildHandle parentHandle;

	static 
	{
	//    0    0:ldc1            #2   <Class JobSupport>
	//    1    2:ldc1            #4   <Class Object>
	//    2    4:ldc1            #201 <String "_state">
	//    3    6:invokestatic    #207 <Method AtomicReferenceFieldUpdater AtomicReferenceFieldUpdater.newUpdater(Class, Class, String)>
	//    4    9:putstatic       #209 <Field AtomicReferenceFieldUpdater _state$FU>
	//*   5   12:return          
	}


/*
	public static final void access$continueCompleting(JobSupport jobsupport, Finishing finishing, ChildHandleNode childhandlenode, Object obj)
	{
		jobsupport.continueCompleting(finishing, childhandlenode, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #231 <Method void continueCompleting(JobSupport$Finishing, ChildHandleNode, Object)>
		return;
	//    5    7:return          
	}

*/
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines.channels;

import kotlin.*;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.*;
import kotlinx.coroutines.internal.*;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.selects.*;

// Referenced classes of package kotlinx.coroutines.channels:
//			AbstractSendChannel, Channel, Send, Closed, 
//			AbstractChannelKt, ReceiveOrClosed, ChannelIterator, Receive

public abstract class AbstractChannel extends AbstractSendChannel
	implements Channel
{

	public AbstractChannel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void AbstractSendChannel()>
	//    2    4:return          
	}

	private final boolean enqueueReceive(Receive receive1)
	{
		boolean flag2;
		boolean flag3;
		flag2 = isBufferAlwaysEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method boolean isBufferAlwaysEmpty()>
	//    2    4:istore_3        
		flag3 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		if(!flag2) goto _L2; else goto _L1
	//    5    8:iload_3         
	//    6    9:ifeq            91
_L1:
		LockFreeLinkedListHead lockfreelinkedlisthead = getQueue();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #129 <Method LockFreeLinkedListHead getQueue()>
	//    9   16:astore          5
_L7:
		boolean flag;
		Object obj;
		obj = ((LockFreeLinkedListNode) (lockfreelinkedlisthead)).getPrev();
	//   10   18:aload           5
	//   11   20:invokevirtual   #134 <Method Object LockFreeLinkedListNode.getPrev()>
	//   12   23:astore          6
		if(obj == null)
	//*  13   25:aload           6
	//*  14   27:ifnonnull       40
			throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//   15   30:new             #136 <Class TypeCastException>
	//   16   33:dup             
	//   17   34:ldc1            #138 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   18   36:invokespecial   #141 <Method void TypeCastException(String)>
	//   19   39:athrow          
		obj = ((Object) ((LockFreeLinkedListNode)obj));
	//   20   40:aload           6
	//   21   42:checkcast       #131 <Class LockFreeLinkedListNode>
	//   22   45:astore          6
		if(!(obj instanceof Send))
	//*  23   47:aload           6
	//*  24   49:instanceof      #143 <Class Send>
	//*  25   52:ifne            60
			flag = true;
	//   26   55:iconst_1        
	//   27   56:istore_2        
		else
	//*  28   57:goto            62
			flag = false;
	//   29   60:iconst_0        
	//   30   61:istore_2        
		if(flag) goto _L4; else goto _L3
	//   31   62:iload_2         
	//   32   63:ifne            72
_L3:
		flag2 = flag3;
	//   33   66:iload           4
	//   34   68:istore_3        
		  goto _L5
	//*  35   69:goto            211
_L4:
		if(!((LockFreeLinkedListNode) (obj)).addNext((LockFreeLinkedListNode)receive1, ((LockFreeLinkedListNode) (lockfreelinkedlisthead)))) goto _L7; else goto _L6
	//   36   72:aload           6
	//   37   74:aload_1         
	//   38   75:checkcast       #131 <Class LockFreeLinkedListNode>
	//   39   78:aload           5
	//   40   80:invokevirtual   #147 <Method boolean LockFreeLinkedListNode.addNext(LockFreeLinkedListNode, LockFreeLinkedListNode)>
	//   41   83:ifeq            18
_L6:
		flag2 = true;
	//   42   86:iconst_1        
	//   43   87:istore_3        
		break; /* Loop/switch isn't completed */
	//   44   88:goto            211
_L2:
		LockFreeLinkedListHead lockfreelinkedlisthead1 = getQueue();
	//   45   91:aload_0         
	//   46   92:invokevirtual   #129 <Method LockFreeLinkedListHead getQueue()>
	//   47   95:astore          5
		receive1 = ((Receive) ((LockFreeLinkedListNode)receive1));
	//   48   97:aload_1         
	//   49   98:checkcast       #131 <Class LockFreeLinkedListNode>
	//   50  101:astore_1        
	/* block-local class not found */
	class enqueueReceive..inlined.addLastIfPrevAndIf._cls1 {}

		kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condaddop = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp)new enqueueReceive..inlined.addLastIfPrevAndIf._cls1(((LockFreeLinkedListNode) (receive1)), ((LockFreeLinkedListNode) (receive1)), this);
	//   51  102:new             #149 <Class AbstractChannel$enqueueReceive$$inlined$addLastIfPrevAndIf$1>
	//   52  105:dup             
	//   53  106:aload_1         
	//   54  107:aload_1         
	//   55  108:aload_0         
	//   56  109:invokespecial   #152 <Method void AbstractChannel$enqueueReceive$$inlined$addLastIfPrevAndIf$1(LockFreeLinkedListNode, LockFreeLinkedListNode, AbstractChannel)>
	//   57  112:checkcast       #154 <Class kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp>
	//   58  115:astore          6
		do
		{
			Object obj1 = ((LockFreeLinkedListNode) (lockfreelinkedlisthead1)).getPrev();
	//   59  117:aload           5
	//   60  119:invokevirtual   #134 <Method Object LockFreeLinkedListNode.getPrev()>
	//   61  122:astore          7
			if(obj1 == null)
	//*  62  124:aload           7
	//*  63  126:ifnonnull       139
				throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//   64  129:new             #136 <Class TypeCastException>
	//   65  132:dup             
	//   66  133:ldc1            #138 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   67  135:invokespecial   #141 <Method void TypeCastException(String)>
	//   68  138:athrow          
			obj1 = ((Object) ((LockFreeLinkedListNode)obj1));
	//   69  139:aload           7
	//   70  141:checkcast       #131 <Class LockFreeLinkedListNode>
	//   71  144:astore          7
			boolean flag1;
			if(!(obj1 instanceof Send))
	//*  72  146:aload           7
	//*  73  148:instanceof      #143 <Class Send>
	//*  74  151:ifne            159
				flag1 = true;
	//   75  154:iconst_1        
	//   76  155:istore_2        
			else
	//*  77  156:goto            161
				flag1 = false;
	//   78  159:iconst_0        
	//   79  160:istore_2        
			if(!flag1)
	//*  80  161:iload_2         
	//*  81  162:ifne            171
			{
				flag2 = flag3;
	//   82  165:iload           4
	//   83  167:istore_3        
				break; /* Loop/switch isn't completed */
	//   84  168:goto            211
			}
			flag2 = flag3;
	//   85  171:iload           4
	//   86  173:istore_3        
			switch(((LockFreeLinkedListNode) (obj1)).tryCondAddNext(((LockFreeLinkedListNode) (receive1)), ((LockFreeLinkedListNode) (lockfreelinkedlisthead1)), condaddop))
	//*  87  174:aload           7
	//*  88  176:aload_1         
	//*  89  177:aload           5
	//*  90  179:aload           6
	//*  91  181:invokevirtual   #158 <Method int LockFreeLinkedListNode.tryCondAddNext(LockFreeLinkedListNode, LockFreeLinkedListNode, kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp)>
			{
			default:
				break;

	//*  92  184:tableswitch     1 2: default 208
	//	               1 86
	//	               2 211
			case 1: // '\001'
				continue; /* Loop/switch isn't completed */
	//   93  208:goto            117

			case 2: // '\002'
				break; /* Loop/switch isn't completed */
			}
		} while(true);
		if(true) goto _L6; else goto _L5
_L5:
		if(flag2)
	//*  94  211:iload_3         
	//*  95  212:ifeq            219
			onReceiveEnqueued();
	//   96  215:aload_0         
	//   97  216:invokevirtual   #160 <Method void onReceiveEnqueued()>
		return flag2;
	//   98  219:iload_3         
	//   99  220:ireturn         
	}

	private final Object receiveOrNullResult(Object obj)
	{
		if(obj instanceof Closed)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #164 <Class Closed>
	//*   2    4:ifeq            26
		{
			obj = ((Object) ((Closed)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #164 <Class Closed>
	//    5   11:astore_1        
			if(((Closed) (obj)).closeCause != null)
	//*   6   12:aload_1         
	//*   7   13:getfield        #168 <Field Throwable Closed.closeCause>
	//*   8   16:ifnull          24
				throw ((Closed) (obj)).closeCause;
	//    9   19:aload_1         
	//   10   20:getfield        #168 <Field Throwable Closed.closeCause>
	//   11   23:athrow          
			else
				return ((Object) (null));
	//   12   24:aconst_null     
	//   13   25:areturn         
		} else
		{
			return obj;
	//   14   26:aload_1         
	//   15   27:areturn         
		}
	}

	private final Object receiveResult(Object obj)
	{
		if(obj instanceof Closed)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #164 <Class Closed>
	//*   2    4:ifeq            15
			throw ((Closed)obj).getReceiveException();
	//    3    7:aload_1         
	//    4    8:checkcast       #164 <Class Closed>
	//    5   11:invokevirtual   #173 <Method Throwable Closed.getReceiveException()>
	//    6   14:athrow          
		else
			return obj;
	//    7   15:aload_1         
	//    8   16:areturn         
	}

	private final void registerSelectReceive(SelectInstance selectinstance, Function2 function2)
	{
		Object obj1;
		do
		{
			do
			{
				if(selectinstance.isSelected())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #178 <Method boolean SelectInstance.isSelected()>
	//*   2    6:ifeq            10
					return;
	//    3    9:return          
				if(!isEmpty())
					break;
	//    4   10:aload_0         
	//    5   11:invokevirtual   #180 <Method boolean isEmpty()>
	//    6   14:ifeq            114
				if(function2 == null)
	//*   7   17:aload_2         
	//*   8   18:ifnonnull       31
					throw new TypeCastException("null cannot be cast to non-null type suspend (E?) -> R");
	//    9   21:new             #136 <Class TypeCastException>
	//   10   24:dup             
	//   11   25:ldc1            #182 <String "null cannot be cast to non-null type suspend (E?) -> R">
	//   12   27:invokespecial   #141 <Method void TypeCastException(String)>
	//   13   30:athrow          
	/* block-local class not found */
	class TryEnqueueReceiveDesc {}

				Object obj = selectinstance.performAtomicIfNotSelected((AtomicDesc)new TryEnqueueReceiveDesc(selectinstance, function2, false));
	//   14   31:aload_1         
	//   15   32:new             #21  <Class AbstractChannel$TryEnqueueReceiveDesc>
	//   16   35:dup             
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:iconst_0        
	//   21   40:invokespecial   #185 <Method void AbstractChannel$TryEnqueueReceiveDesc(AbstractChannel, SelectInstance, Function2, boolean)>
	//   22   43:checkcast       #187 <Class AtomicDesc>
	//   23   46:invokeinterface #191 <Method Object SelectInstance.performAtomicIfNotSelected(AtomicDesc)>
	//   24   51:astore_3        
				if(obj != null)
	//*  25   52:aload_3         
	//*  26   53:ifnull          113
				{
					if(obj == SelectKt.getALREADY_SELECTED())
	//*  27   56:aload_3         
	//*  28   57:invokestatic    #196 <Method Object SelectKt.getALREADY_SELECTED()>
	//*  29   60:if_acmpne       64
						return;
	//   30   63:return          
					if(obj != AbstractChannelKt.ENQUEUE_FAILED)
	//*  31   64:aload_3         
	//*  32   65:getstatic       #202 <Field Object AbstractChannelKt.ENQUEUE_FAILED>
	//*  33   68:if_acmpne       74
	//*  34   71:goto            0
					{
						selectinstance = ((SelectInstance) (new StringBuilder()));
	//   35   74:new             #204 <Class StringBuilder>
	//   36   77:dup             
	//   37   78:invokespecial   #205 <Method void StringBuilder()>
	//   38   81:astore_1        
						((StringBuilder) (selectinstance)).append("performAtomicIfNotSelected(TryEnqueueReceiveDesc) returned ");
	//   39   82:aload_1         
	//   40   83:ldc1            #207 <String "performAtomicIfNotSelected(TryEnqueueReceiveDesc) returned ">
	//   41   85:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//   42   88:pop             
						((StringBuilder) (selectinstance)).append(obj);
	//   43   89:aload_1         
	//   44   90:aload_3         
	//   45   91:invokevirtual   #214 <Method StringBuilder StringBuilder.append(Object)>
	//   46   94:pop             
						throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (selectinstance)).toString())).toString());
	//   47   95:new             #216 <Class IllegalStateException>
	//   48   98:dup             
	//   49   99:aload_1         
	//   50  100:invokevirtual   #220 <Method String StringBuilder.toString()>
	//   51  103:invokevirtual   #223 <Method String Object.toString()>
	//   52  106:invokespecial   #224 <Method void IllegalStateException(String)>
	//   53  109:checkcast       #226 <Class Throwable>
	//   54  112:athrow          
					}
				} else
				{
					return;
	//   55  113:return          
				}
			} while(true);
			obj1 = pollSelectInternal(selectinstance);
	//   56  114:aload_0         
	//   57  115:aload_1         
	//   58  116:invokevirtual   #229 <Method Object pollSelectInternal(SelectInstance)>
	//   59  119:astore_3        
			if(obj1 == SelectKt.getALREADY_SELECTED())
	//*  60  120:aload_3         
	//*  61  121:invokestatic    #196 <Method Object SelectKt.getALREADY_SELECTED()>
	//*  62  124:if_acmpne       128
				return;
	//   63  127:return          
		} while(obj1 == AbstractChannelKt.POLL_FAILED);
	//   64  128:aload_3         
	//   65  129:getstatic       #232 <Field Object AbstractChannelKt.POLL_FAILED>
	//   66  132:if_acmpne       138
	//*  67  135:goto            0
		if(obj1 instanceof Closed)
	//*  68  138:aload_3         
	//*  69  139:instanceof      #164 <Class Closed>
	//*  70  142:ifeq            153
		{
			throw ((Closed)obj1).getReceiveException();
	//   71  145:aload_3         
	//   72  146:checkcast       #164 <Class Closed>
	//   73  149:invokevirtual   #173 <Method Throwable Closed.getReceiveException()>
	//   74  152:athrow          
		} else
		{
			UndispatchedKt.startCoroutineUnintercepted(function2, obj1, selectinstance.getCompletion());
	//   75  153:aload_2         
	//   76  154:aload_3         
	//   77  155:aload_1         
	//   78  156:invokeinterface #236 <Method Continuation SelectInstance.getCompletion()>
	//   79  161:invokestatic    #242 <Method void UndispatchedKt.startCoroutineUnintercepted(Function2, Object, Continuation)>
			return;
	//   80  164:return          
		}
	}

	private final void registerSelectReceiveOrNull(SelectInstance selectinstance, Function2 function2)
	{
		Object obj1;
		do
		{
			do
			{
				if(selectinstance.isSelected())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #178 <Method boolean SelectInstance.isSelected()>
	//*   2    6:ifeq            10
					return;
	//    3    9:return          
				if(!isEmpty())
					break;
	//    4   10:aload_0         
	//    5   11:invokevirtual   #180 <Method boolean isEmpty()>
	//    6   14:ifeq            100
				Object obj = selectinstance.performAtomicIfNotSelected((AtomicDesc)new TryEnqueueReceiveDesc(selectinstance, function2, true));
	//    7   17:aload_1         
	//    8   18:new             #21  <Class AbstractChannel$TryEnqueueReceiveDesc>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:iconst_1        
	//   14   26:invokespecial   #185 <Method void AbstractChannel$TryEnqueueReceiveDesc(AbstractChannel, SelectInstance, Function2, boolean)>
	//   15   29:checkcast       #187 <Class AtomicDesc>
	//   16   32:invokeinterface #191 <Method Object SelectInstance.performAtomicIfNotSelected(AtomicDesc)>
	//   17   37:astore_3        
				if(obj != null)
	//*  18   38:aload_3         
	//*  19   39:ifnull          99
				{
					if(obj == SelectKt.getALREADY_SELECTED())
	//*  20   42:aload_3         
	//*  21   43:invokestatic    #196 <Method Object SelectKt.getALREADY_SELECTED()>
	//*  22   46:if_acmpne       50
						return;
	//   23   49:return          
					if(obj != AbstractChannelKt.ENQUEUE_FAILED)
	//*  24   50:aload_3         
	//*  25   51:getstatic       #202 <Field Object AbstractChannelKt.ENQUEUE_FAILED>
	//*  26   54:if_acmpne       60
	//*  27   57:goto            0
					{
						selectinstance = ((SelectInstance) (new StringBuilder()));
	//   28   60:new             #204 <Class StringBuilder>
	//   29   63:dup             
	//   30   64:invokespecial   #205 <Method void StringBuilder()>
	//   31   67:astore_1        
						((StringBuilder) (selectinstance)).append("performAtomicIfNotSelected(TryEnqueueReceiveDesc) returned ");
	//   32   68:aload_1         
	//   33   69:ldc1            #207 <String "performAtomicIfNotSelected(TryEnqueueReceiveDesc) returned ">
	//   34   71:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
						((StringBuilder) (selectinstance)).append(obj);
	//   36   75:aload_1         
	//   37   76:aload_3         
	//   38   77:invokevirtual   #214 <Method StringBuilder StringBuilder.append(Object)>
	//   39   80:pop             
						throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (selectinstance)).toString())).toString());
	//   40   81:new             #216 <Class IllegalStateException>
	//   41   84:dup             
	//   42   85:aload_1         
	//   43   86:invokevirtual   #220 <Method String StringBuilder.toString()>
	//   44   89:invokevirtual   #223 <Method String Object.toString()>
	//   45   92:invokespecial   #224 <Method void IllegalStateException(String)>
	//   46   95:checkcast       #226 <Class Throwable>
	//   47   98:athrow          
					}
				} else
				{
					return;
	//   48   99:return          
				}
			} while(true);
			obj1 = pollSelectInternal(selectinstance);
	//   49  100:aload_0         
	//   50  101:aload_1         
	//   51  102:invokevirtual   #229 <Method Object pollSelectInternal(SelectInstance)>
	//   52  105:astore_3        
			if(obj1 == SelectKt.getALREADY_SELECTED())
	//*  53  106:aload_3         
	//*  54  107:invokestatic    #196 <Method Object SelectKt.getALREADY_SELECTED()>
	//*  55  110:if_acmpne       114
				return;
	//   56  113:return          
		} while(obj1 == AbstractChannelKt.POLL_FAILED);
	//   57  114:aload_3         
	//   58  115:getstatic       #232 <Field Object AbstractChannelKt.POLL_FAILED>
	//   59  118:if_acmpne       124
	//*  60  121:goto            0
		if(obj1 instanceof Closed)
	//*  61  124:aload_3         
	//*  62  125:instanceof      #164 <Class Closed>
	//*  63  128:ifeq            170
		{
			obj1 = ((Object) ((Closed)obj1));
	//   64  131:aload_3         
	//   65  132:checkcast       #164 <Class Closed>
	//   66  135:astore_3        
			if(((Closed) (obj1)).closeCause == null)
	//*  67  136:aload_3         
	//*  68  137:getfield        #168 <Field Throwable Closed.closeCause>
	//*  69  140:ifnonnull       165
			{
				if(selectinstance.trySelect(((Object) (null))))
	//*  70  143:aload_1         
	//*  71  144:aconst_null     
	//*  72  145:invokeinterface #247 <Method boolean SelectInstance.trySelect(Object)>
	//*  73  150:ifeq            164
					UndispatchedKt.startCoroutineUnintercepted(function2, ((Object) (null)), selectinstance.getCompletion());
	//   74  153:aload_2         
	//   75  154:aconst_null     
	//   76  155:aload_1         
	//   77  156:invokeinterface #236 <Method Continuation SelectInstance.getCompletion()>
	//   78  161:invokestatic    #242 <Method void UndispatchedKt.startCoroutineUnintercepted(Function2, Object, Continuation)>
				return;
	//   79  164:return          
			} else
			{
				throw ((Closed) (obj1)).closeCause;
	//   80  165:aload_3         
	//   81  166:getfield        #168 <Field Throwable Closed.closeCause>
	//   82  169:athrow          
			}
		} else
		{
			UndispatchedKt.startCoroutineUnintercepted(function2, obj1, selectinstance.getCompletion());
	//   83  170:aload_2         
	//   84  171:aload_3         
	//   85  172:aload_1         
	//   86  173:invokeinterface #236 <Method Continuation SelectInstance.getCompletion()>
	//   87  178:invokestatic    #242 <Method void UndispatchedKt.startCoroutineUnintercepted(Function2, Object, Continuation)>
			return;
	//   88  181:return          
		}
	}

	private final void removeReceiveOnCancel(CancellableContinuation cancellablecontinuation, Receive receive1)
	{
	/* block-local class not found */
	class RemoveReceiveOnCancel {}

		cancellablecontinuation.invokeOnCancellation((Function1)(CancelHandlerBase)new RemoveReceiveOnCancel(receive1));
	//    0    0:aload_1         
	//    1    1:new             #19  <Class AbstractChannel$RemoveReceiveOnCancel>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #250 <Method void AbstractChannel$RemoveReceiveOnCancel(AbstractChannel, Receive)>
	//    6   10:checkcast       #252 <Class CancelHandlerBase>
	//    7   13:checkcast       #254 <Class Function1>
	//    8   16:invokeinterface #260 <Method void CancellableContinuation.invokeOnCancellation(Function1)>
	//    9   21:return          
	}

	public void cancel()
	{
		cancel(((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #264 <Method boolean cancel(Throwable)>
	//    3    5:pop             
	//    4    6:return          
	}

	public boolean cancel()
	{
		return Channel.DefaultImpls.cancel(((Channel) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #277 <Method boolean Channel$DefaultImpls.cancel(Channel)>
	//    2    4:ireturn         
	}

	public boolean cancel(Throwable throwable)
	{
		boolean flag = close(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #283 <Method boolean close(Throwable)>
	//    3    5:istore_2        
		cleanupSendQueueOnCancel();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #285 <Method void cleanupSendQueueOnCancel()>
		return flag;
	//    6   10:iload_2         
	//    7   11:ireturn         
	}

	protected void cleanupSendQueueOnCancel()
	{
		Closed closed = getClosedForSend();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #289 <Method Closed getClosedForSend()>
	//    2    4:astore_2        
		if(closed != null)
			do
	//*   3    5:aload_2         
	//*   4    6:ifnull          86
			{
				Send send = takeFirstSendOrPeekClosed();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #293 <Method Send takeFirstSendOrPeekClosed()>
	//    7   13:astore_3        
				if(send != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          69
				{
					if(send instanceof Closed)
	//*  10   18:aload_3         
	//*  11   19:instanceof      #164 <Class Closed>
	//*  12   22:ifeq            59
					{
						boolean flag;
						if(send == closed)
	//*  13   25:aload_3         
	//*  14   26:aload_2         
	//*  15   27:if_acmpne       35
							flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_1        
						else
	//*  18   32:goto            37
							flag = false;
	//   19   35:iconst_0        
	//   20   36:istore_1        
						if(!flag)
	//*  21   37:iload_1         
	//*  22   38:ifne            58
							throw (Throwable)new IllegalStateException(((Object) ("Check failed.")).toString());
	//   23   41:new             #216 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:ldc2            #295 <String "Check failed.">
	//   26   48:invokevirtual   #223 <Method String Object.toString()>
	//   27   51:invokespecial   #224 <Method void IllegalStateException(String)>
	//   28   54:checkcast       #226 <Class Throwable>
	//   29   57:athrow          
						else
							return;
	//   30   58:return          
					}
					send.resumeSendClosed(closed);
	//   31   59:aload_3         
	//   32   60:aload_2         
	//   33   61:invokeinterface #299 <Method void Send.resumeSendClosed(Closed)>
				} else
	//*  34   66:goto            9
				{
					throw (Throwable)new IllegalStateException(((Object) ("Cannot happen")).toString());
	//   35   69:new             #216 <Class IllegalStateException>
	//   36   72:dup             
	//   37   73:ldc2            #301 <String "Cannot happen">
	//   38   76:invokevirtual   #223 <Method String Object.toString()>
	//   39   79:invokespecial   #224 <Method void IllegalStateException(String)>
	//   40   82:checkcast       #226 <Class Throwable>
	//   41   85:athrow          
				}
			} while(true);
		else
			throw (Throwable)new IllegalStateException(((Object) ("Cannot happen")).toString());
	//   42   86:new             #216 <Class IllegalStateException>
	//   43   89:dup             
	//   44   90:ldc2            #301 <String "Cannot happen">
	//   45   93:invokevirtual   #223 <Method String Object.toString()>
	//   46   96:invokespecial   #224 <Method void IllegalStateException(String)>
	//   47   99:checkcast       #226 <Class Throwable>
	//   48  102:athrow          
	}

	protected final TryPollDesc describeTryPoll()
	{
	/* block-local class not found */
	class TryPollDesc {}

		return new TryPollDesc(getQueue());
	//    0    0:new             #23  <Class AbstractChannel$TryPollDesc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #129 <Method LockFreeLinkedListHead getQueue()>
	//    4    8:invokespecial   #305 <Method void AbstractChannel$TryPollDesc(LockFreeLinkedListHead)>
	//    5   11:areturn         
	}

	protected final boolean getHasReceiveOrClosed()
	{
		return getQueue().getNextNode() instanceof ReceiveOrClosed;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method LockFreeLinkedListHead getQueue()>
	//    2    4:invokevirtual   #312 <Method LockFreeLinkedListNode LockFreeLinkedListHead.getNextNode()>
	//    3    7:instanceof      #314 <Class ReceiveOrClosed>
	//    4   10:ireturn         
	}

	public final SelectClause1 getOnReceive()
	{
	/* block-local class not found */
	class onReceive._cls1 {}

		return (SelectClause1)new onReceive._cls1();
	//    0    0:new             #316 <Class AbstractChannel$onReceive$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #319 <Method void AbstractChannel$onReceive$1(AbstractChannel)>
	//    4    8:checkcast       #321 <Class SelectClause1>
	//    5   11:areturn         
	}

	public final SelectClause1 getOnReceiveOrNull()
	{
	/* block-local class not found */
	class onReceiveOrNull._cls1 {}

		return (SelectClause1)new onReceiveOrNull._cls1();
	//    0    0:new             #324 <Class AbstractChannel$onReceiveOrNull$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #325 <Method void AbstractChannel$onReceiveOrNull$1(AbstractChannel)>
	//    4    8:checkcast       #321 <Class SelectClause1>
	//    5   11:areturn         
	}

	protected abstract boolean isBufferAlwaysEmpty();

	protected abstract boolean isBufferEmpty();

	public final boolean isClosedForReceive()
	{
		return getClosedForReceive() != null && isBufferEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #328 <Method Closed getClosedForReceive()>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #330 <Method boolean isBufferEmpty()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final boolean isEmpty()
	{
		return !(getQueue().getNextNode() instanceof Send) && isBufferEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method LockFreeLinkedListHead getQueue()>
	//    2    4:invokevirtual   #312 <Method LockFreeLinkedListNode LockFreeLinkedListHead.getNextNode()>
	//    3    7:instanceof      #143 <Class Send>
	//    4   10:ifne            22
	//    5   13:aload_0         
	//    6   14:invokevirtual   #330 <Method boolean isBufferEmpty()>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public final ChannelIterator iterator()
	{
	/* block-local class not found */
	class Itr {}

		return (ChannelIterator)new Itr();
	//    0    0:new             #11  <Class AbstractChannel$Itr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #332 <Method void AbstractChannel$Itr(AbstractChannel)>
	//    4    8:checkcast       #334 <Class ChannelIterator>
	//    5   11:areturn         
	}

	protected void onReceiveDequeued()
	{
	//    0    0:return          
	}

	protected void onReceiveEnqueued()
	{
	//    0    0:return          
	}

	public final Object poll()
	{
		Object obj = pollInternal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method Object pollInternal()>
	//    2    4:astore_1        
		if(obj == AbstractChannelKt.POLL_FAILED)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #232 <Field Object AbstractChannelKt.POLL_FAILED>
	//*   5    9:if_acmpne       14
			return ((Object) (null));
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return receiveOrNullResult(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #339 <Method Object receiveOrNullResult(Object)>
	//   11   19:areturn         
	}

	protected Object pollInternal()
	{
		do
		{
			Send send = takeFirstSendOrPeekClosed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #293 <Method Send takeFirstSendOrPeekClosed()>
	//    2    4:astore_1        
			if(send != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          35
			{
				Object obj = send.tryResumeSend(((Object) (null)));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokeinterface #343 <Method Object Send.tryResumeSend(Object)>
	//    8   16:astore_2        
				if(obj != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          0
				{
					send.completeResumeSend(obj);
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokeinterface #347 <Method void Send.completeResumeSend(Object)>
					return send.getPollResult();
	//   14   28:aload_1         
	//   15   29:invokeinterface #350 <Method Object Send.getPollResult()>
	//   16   34:areturn         
				}
			} else
			{
				return AbstractChannelKt.POLL_FAILED;
	//   17   35:getstatic       #232 <Field Object AbstractChannelKt.POLL_FAILED>
	//   18   38:areturn         
			}
		} while(true);
	}

	protected Object pollSelectInternal(SelectInstance selectinstance)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (selectinstance)), "select");
	//    0    0:aload_1         
	//    1    1:ldc2            #351 <String "select">
	//    2    4:invokestatic    #357 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		TryPollDesc trypolldesc = describeTryPoll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #359 <Method AbstractChannel$TryPollDesc describeTryPoll()>
	//    5   11:astore_2        
		selectinstance = ((SelectInstance) (selectinstance.performAtomicTrySelect((AtomicDesc)trypolldesc)));
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:checkcast       #187 <Class AtomicDesc>
	//    9   17:invokeinterface #362 <Method Object SelectInstance.performAtomicTrySelect(AtomicDesc)>
	//   10   22:astore_1        
		if(selectinstance != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
			return ((Object) (selectinstance));
	//   13   27:aload_1         
	//   14   28:areturn         
		selectinstance = ((SelectInstance) ((Send)trypolldesc.getResult()));
	//   15   29:aload_2         
	//   16   30:invokevirtual   #365 <Method Object AbstractChannel$TryPollDesc.getResult()>
	//   17   33:checkcast       #143 <Class Send>
	//   18   36:astore_1        
		Object obj = trypolldesc.resumeToken;
	//   19   37:aload_2         
	//   20   38:getfield        #368 <Field Object AbstractChannel$TryPollDesc.resumeToken>
	//   21   41:astore_3        
		if(obj == null)
	//*  22   42:aload_3         
	//*  23   43:ifnonnull       49
			Intrinsics.throwNpe();
	//   24   46:invokestatic    #371 <Method void Intrinsics.throwNpe()>
		((Send) (selectinstance)).completeResumeSend(obj);
	//   25   49:aload_1         
	//   26   50:aload_3         
	//   27   51:invokeinterface #347 <Method void Send.completeResumeSend(Object)>
		return trypolldesc.pollResult;
	//   28   56:aload_2         
	//   29   57:getfield        #374 <Field Object AbstractChannel$TryPollDesc.pollResult>
	//   30   60:areturn         
	}

	public final Object receive(Continuation continuation)
	{
		Object obj = pollInternal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method Object pollInternal()>
	//    2    4:astore_2        
		if(obj != AbstractChannelKt.POLL_FAILED)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #232 <Field Object AbstractChannelKt.POLL_FAILED>
	//*   5    9:if_acmpeq       18
			return receiveResult(obj);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokespecial   #377 <Method Object receiveResult(Object)>
	//    9   17:areturn         
		else
			return receiveSuspend(continuation);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #379 <Method Object receiveSuspend(Continuation)>
	//   13   23:areturn         
	}

	public final Object receiveOrNull(Continuation continuation)
	{
		Object obj = pollInternal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method Object pollInternal()>
	//    2    4:astore_2        
		if(obj != AbstractChannelKt.POLL_FAILED)
	//*   3    5:aload_2         
	//*   4    6:getstatic       #232 <Field Object AbstractChannelKt.POLL_FAILED>
	//*   5    9:if_acmpeq       18
			return receiveOrNullResult(obj);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokespecial   #339 <Method Object receiveOrNullResult(Object)>
	//    9   17:areturn         
		else
			return receiveOrNullSuspend(continuation);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #382 <Method Object receiveOrNullSuspend(Continuation)>
	//   13   23:areturn         
	}

	final Object receiveOrNullSuspend(Continuation continuation)
	{
		Object obj = ((Object) (new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 0)));
	//    0    0:new             #384 <Class CancellableContinuationImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #390 <Method Continuation IntrinsicsKt.intercepted(Continuation)>
	//    4    8:iconst_0        
	//    5    9:invokespecial   #393 <Method void CancellableContinuationImpl(Continuation, int)>
	//    6   12:astore_2        
		Object obj1 = ((Object) ((CancellableContinuation)obj));
	//    7   13:aload_2         
	//    8   14:checkcast       #256 <Class CancellableContinuation>
	//    9   17:astore_3        
	/* block-local class not found */
	class ReceiveElement {}

		Object obj3 = ((Object) (new ReceiveElement(((CancellableContinuation) (obj1)), true)));
	//   10   18:new             #13  <Class AbstractChannel$ReceiveElement>
	//   11   21:dup             
	//   12   22:aload_3         
	//   13   23:iconst_1        
	//   14   24:invokespecial   #396 <Method void AbstractChannel$ReceiveElement(CancellableContinuation, boolean)>
	//   15   27:astore          5
		do
		{
			Object obj2 = ((Object) ((Receive)obj3));
	//   16   29:aload           5
	//   17   31:checkcast       #398 <Class Receive>
	//   18   34:astore          4
			if(enqueueReceive(((Receive) (obj2))))
	//*  19   36:aload_0         
	//*  20   37:aload           4
	//*  21   39:invokestatic    #400 <Method boolean access$enqueueReceive(AbstractChannel, Receive)>
	//*  22   42:ifeq            61
			{
				((CancellableContinuation) (obj1)).initCancellability();
	//   23   45:aload_3         
	//   24   46:invokeinterface #403 <Method void CancellableContinuation.initCancellability()>
				removeReceiveOnCancel(((CancellableContinuation) (obj1)), ((Receive) (obj2)));
	//   25   51:aload_0         
	//   26   52:aload_3         
	//   27   53:aload           4
	//   28   55:invokestatic    #405 <Method void access$removeReceiveOnCancel(AbstractChannel, CancellableContinuation, Receive)>
				break;
	//   29   58:goto            176
			}
			obj2 = pollInternal();
	//   30   61:aload_0         
	//   31   62:invokevirtual   #337 <Method Object pollInternal()>
	//   32   65:astore          4
			if(obj2 instanceof Closed)
	//*  33   67:aload           4
	//*  34   69:instanceof      #164 <Class Closed>
	//*  35   72:ifeq            147
			{
				obj2 = ((Object) ((Closed)obj2));
	//   36   75:aload           4
	//   37   77:checkcast       #164 <Class Closed>
	//   38   80:astore          4
				if(((Closed) (obj2)).closeCause == null)
	//*  39   82:aload           4
	//*  40   84:getfield        #168 <Field Throwable Closed.closeCause>
	//*  41   87:ifnonnull       113
				{
					obj1 = ((Object) ((Continuation)obj1));
	//   42   90:aload_3         
	//   43   91:checkcast       #407 <Class Continuation>
	//   44   94:astore_3        
					obj2 = ((Object) (Result.Companion));
	//   45   95:getstatic       #413 <Field kotlin.Result$Companion Result.Companion>
	//   46   98:astore          4
					((Continuation) (obj1)).resumeWith(Result.constructor_2D_impl(((Object) (null))));
	//   47  100:aload_3         
	//   48  101:aconst_null     
	//   49  102:invokestatic    #416 <Method Object Result.constructor_2D_impl(Object)>
	//   50  105:invokeinterface #419 <Method void Continuation.resumeWith(Object)>
				} else
	//*  51  110:goto            176
				{
					obj1 = ((Object) ((Continuation)obj1));
	//   52  113:aload_3         
	//   53  114:checkcast       #407 <Class Continuation>
	//   54  117:astore_3        
					obj2 = ((Object) (((Closed) (obj2)).closeCause));
	//   55  118:aload           4
	//   56  120:getfield        #168 <Field Throwable Closed.closeCause>
	//   57  123:astore          4
					obj3 = ((Object) (Result.Companion));
	//   58  125:getstatic       #413 <Field kotlin.Result$Companion Result.Companion>
	//   59  128:astore          5
					((Continuation) (obj1)).resumeWith(Result.constructor_2D_impl(ResultKt.createFailure(((Throwable) (obj2)))));
	//   60  130:aload_3         
	//   61  131:aload           4
	//   62  133:invokestatic    #425 <Method Object ResultKt.createFailure(Throwable)>
	//   63  136:invokestatic    #416 <Method Object Result.constructor_2D_impl(Object)>
	//   64  139:invokeinterface #419 <Method void Continuation.resumeWith(Object)>
				}
				break;
	//   65  144:goto            176
			}
			if(obj2 == AbstractChannelKt.POLL_FAILED)
				continue;
	//   66  147:aload           4
	//   67  149:getstatic       #232 <Field Object AbstractChannelKt.POLL_FAILED>
	//   68  152:if_acmpeq       29
			obj1 = ((Object) ((Continuation)obj1));
	//   69  155:aload_3         
	//   70  156:checkcast       #407 <Class Continuation>
	//   71  159:astore_3        
			obj3 = ((Object) (Result.Companion));
	//   72  160:getstatic       #413 <Field kotlin.Result$Companion Result.Companion>
	//   73  163:astore          5
			((Continuation) (obj1)).resumeWith(Result.constructor_2D_impl(obj2));
	//   74  165:aload_3         
	//   75  166:aload           4
	//   76  168:invokestatic    #416 <Method Object Result.constructor_2D_impl(Object)>
	//   77  171:invokeinterface #419 <Method void Continuation.resumeWith(Object)>
			break;
		} while(true);
		obj = ((CancellableContinuationImpl) (obj)).getResult();
	//   78  176:aload_2         
	//   79  177:invokevirtual   #426 <Method Object CancellableContinuationImpl.getResult()>
	//   80  180:astore_2        
		if(obj == IntrinsicsKt.getCOROUTINE_SUSPENDED())
	//*  81  181:aload_2         
	//*  82  182:invokestatic    #429 <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//*  83  185:if_acmpne       192
			DebugProbesKt.probeCoroutineSuspended(continuation);
	//   84  188:aload_1         
	//   85  189:invokestatic    #435 <Method void DebugProbesKt.probeCoroutineSuspended(Continuation)>
		return obj;
	//   86  192:aload_2         
	//   87  193:areturn         
	}

	final Object receiveSuspend(Continuation continuation)
	{
		Object obj = ((Object) (new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 0)));
	//    0    0:new             #384 <Class CancellableContinuationImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #390 <Method Continuation IntrinsicsKt.intercepted(Continuation)>
	//    4    8:iconst_0        
	//    5    9:invokespecial   #393 <Method void CancellableContinuationImpl(Continuation, int)>
	//    6   12:astore_2        
		Object obj2 = ((Object) ((CancellableContinuation)obj));
	//    7   13:aload_2         
	//    8   14:checkcast       #256 <Class CancellableContinuation>
	//    9   17:astore          4
		Object obj3 = ((Object) (new ReceiveElement(((CancellableContinuation) (obj2)), false)));
	//   10   19:new             #13  <Class AbstractChannel$ReceiveElement>
	//   11   22:dup             
	//   12   23:aload           4
	//   13   25:iconst_0        
	//   14   26:invokespecial   #396 <Method void AbstractChannel$ReceiveElement(CancellableContinuation, boolean)>
	//   15   29:astore          5
		do
		{
			Object obj1 = ((Object) ((Receive)obj3));
	//   16   31:aload           5
	//   17   33:checkcast       #398 <Class Receive>
	//   18   36:astore_3        
			if(enqueueReceive(((Receive) (obj1))))
	//*  19   37:aload_0         
	//*  20   38:aload_3         
	//*  21   39:invokestatic    #400 <Method boolean access$enqueueReceive(AbstractChannel, Receive)>
	//*  22   42:ifeq            62
			{
				((CancellableContinuation) (obj2)).initCancellability();
	//   23   45:aload           4
	//   24   47:invokeinterface #403 <Method void CancellableContinuation.initCancellability()>
				removeReceiveOnCancel(((CancellableContinuation) (obj2)), ((Receive) (obj1)));
	//   25   52:aload_0         
	//   26   53:aload           4
	//   27   55:aload_3         
	//   28   56:invokestatic    #405 <Method void access$removeReceiveOnCancel(AbstractChannel, CancellableContinuation, Receive)>
				break;
	//   29   59:goto            141
			}
			obj1 = pollInternal();
	//   30   62:aload_0         
	//   31   63:invokevirtual   #337 <Method Object pollInternal()>
	//   32   66:astore_3        
			if(obj1 instanceof Closed)
	//*  33   67:aload_3         
	//*  34   68:instanceof      #164 <Class Closed>
	//*  35   71:ifeq            111
			{
				obj2 = ((Object) ((Continuation)obj2));
	//   36   74:aload           4
	//   37   76:checkcast       #407 <Class Continuation>
	//   38   79:astore          4
				obj1 = ((Object) (((Closed)obj1).getReceiveException()));
	//   39   81:aload_3         
	//   40   82:checkcast       #164 <Class Closed>
	//   41   85:invokevirtual   #173 <Method Throwable Closed.getReceiveException()>
	//   42   88:astore_3        
				obj3 = ((Object) (Result.Companion));
	//   43   89:getstatic       #413 <Field kotlin.Result$Companion Result.Companion>
	//   44   92:astore          5
				((Continuation) (obj2)).resumeWith(Result.constructor_2D_impl(ResultKt.createFailure(((Throwable) (obj1)))));
	//   45   94:aload           4
	//   46   96:aload_3         
	//   47   97:invokestatic    #425 <Method Object ResultKt.createFailure(Throwable)>
	//   48  100:invokestatic    #416 <Method Object Result.constructor_2D_impl(Object)>
	//   49  103:invokeinterface #419 <Method void Continuation.resumeWith(Object)>
				break;
	//   50  108:goto            141
			}
			if(obj1 == AbstractChannelKt.POLL_FAILED)
				continue;
	//   51  111:aload_3         
	//   52  112:getstatic       #232 <Field Object AbstractChannelKt.POLL_FAILED>
	//   53  115:if_acmpeq       31
			obj2 = ((Object) ((Continuation)obj2));
	//   54  118:aload           4
	//   55  120:checkcast       #407 <Class Continuation>
	//   56  123:astore          4
			obj3 = ((Object) (Result.Companion));
	//   57  125:getstatic       #413 <Field kotlin.Result$Companion Result.Companion>
	//   58  128:astore          5
			((Continuation) (obj2)).resumeWith(Result.constructor_2D_impl(obj1));
	//   59  130:aload           4
	//   60  132:aload_3         
	//   61  133:invokestatic    #416 <Method Object Result.constructor_2D_impl(Object)>
	//   62  136:invokeinterface #419 <Method void Continuation.resumeWith(Object)>
			break;
		} while(true);
		obj = ((CancellableContinuationImpl) (obj)).getResult();
	//   63  141:aload_2         
	//   64  142:invokevirtual   #426 <Method Object CancellableContinuationImpl.getResult()>
	//   65  145:astore_2        
		if(obj == IntrinsicsKt.getCOROUTINE_SUSPENDED())
	//*  66  146:aload_2         
	//*  67  147:invokestatic    #429 <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//*  68  150:if_acmpne       157
			DebugProbesKt.probeCoroutineSuspended(continuation);
	//   69  153:aload_1         
	//   70  154:invokestatic    #435 <Method void DebugProbesKt.probeCoroutineSuspended(Continuation)>
		return obj;
	//   71  157:aload_2         
	//   72  158:areturn         
	}

	protected ReceiveOrClosed takeFirstReceiveOrPeekClosed()
	{
		ReceiveOrClosed receiveorclosed = super.takeFirstReceiveOrPeekClosed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #438 <Method ReceiveOrClosed AbstractSendChannel.takeFirstReceiveOrPeekClosed()>
	//    2    4:astore_1        
		if(receiveorclosed != null && !(receiveorclosed instanceof Closed))
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
	//*   5    9:aload_1         
	//*   6   10:instanceof      #164 <Class Closed>
	//*   7   13:ifne            20
			onReceiveDequeued();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #440 <Method void onReceiveDequeued()>
		return receiveorclosed;
	//   10   20:aload_1         
	//   11   21:areturn         
	}


/*
	public static final boolean access$enqueueReceive(AbstractChannel abstractchannel, Receive receive1)
	{
		return abstractchannel.enqueueReceive(receive1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #110 <Method boolean enqueueReceive(Receive)>
	//    3    5:ireturn         
	}

*/


/*
	public static final void access$registerSelectReceive(AbstractChannel abstractchannel, SelectInstance selectinstance, Function2 function2)
	{
		abstractchannel.registerSelectReceive(selectinstance, function2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #115 <Method void registerSelectReceive(SelectInstance, Function2)>
		return;
	//    4    6:return          
	}

*/


/*
	public static final void access$registerSelectReceiveOrNull(AbstractChannel abstractchannel, SelectInstance selectinstance, Function2 function2)
	{
		abstractchannel.registerSelectReceiveOrNull(selectinstance, function2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #118 <Method void registerSelectReceiveOrNull(SelectInstance, Function2)>
		return;
	//    4    6:return          
	}

*/


/*
	public static final void access$removeReceiveOnCancel(AbstractChannel abstractchannel, CancellableContinuation cancellablecontinuation, Receive receive1)
	{
		abstractchannel.removeReceiveOnCancel(cancellablecontinuation, receive1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #123 <Method void removeReceiveOnCancel(CancellableContinuation, Receive)>
		return;
	//    4    6:return          
	}

*/

	// Unreferenced inner class kotlinx/coroutines/channels/AbstractChannel$IdempotentTokenValue
	/* block-local class not found */
	class IdempotentTokenValue {}


	// Unreferenced inner class kotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext
	/* block-local class not found */
	class ReceiveHasNext {}


	// Unreferenced inner class kotlinx/coroutines/channels/AbstractChannel$ReceiveSelect
	/* block-local class not found */
	class ReceiveSelect {}

}

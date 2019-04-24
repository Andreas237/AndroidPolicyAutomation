// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.*;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.*;
import kotlinx.coroutines.internal.*;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.selects.*;

// Referenced classes of package kotlinx.coroutines.channels:
//			SendChannel, ReceiveOrClosed, AbstractChannelKt, Closed, 
//			Receive, Send, SendElement

public abstract class AbstractSendChannel
	implements SendChannel
{

	public AbstractSendChannel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #139 <Class LockFreeLinkedListHead>
	//    4    8:dup             
	//    5    9:invokespecial   #140 <Method void LockFreeLinkedListHead()>
	//    6   12:putfield        #142 <Field LockFreeLinkedListHead queue>
		onCloseHandler = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #144 <Field Object onCloseHandler>
	//   10   20:return          
	}

	private final int countQueueSize()
	{
		LockFreeLinkedListHead lockfreelinkedlisthead = queue;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    2    4:astore          4
		Object obj = lockfreelinkedlisthead.getNext();
	//    3    6:aload           4
	//    4    8:invokevirtual   #166 <Method Object LockFreeLinkedListHead.getNext()>
	//    5   11:astore_3        
		if(obj == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       26
			throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//    8   16:new             #168 <Class TypeCastException>
	//    9   19:dup             
	//   10   20:ldc1            #170 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   11   22:invokespecial   #173 <Method void TypeCastException(String)>
	//   12   25:athrow          
		obj = ((Object) ((LockFreeLinkedListNode)obj));
	//   13   26:aload_3         
	//   14   27:checkcast       #175 <Class LockFreeLinkedListNode>
	//   15   30:astore_3        
		int i;
		int j;
		for(i = 0; Intrinsics.areEqual(obj, ((Object) (lockfreelinkedlisthead))) ^ true; i = j)
	//*  16   31:iconst_0        
	//*  17   32:istore_1        
	//*  18   33:aload_3         
	//*  19   34:aload           4
	//*  20   36:invokestatic    #181 <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  21   39:iconst_1        
	//*  22   40:ixor            
	//*  23   41:ifeq            67
		{
			j = i;
	//   24   44:iload_1         
	//   25   45:istore_2        
			if(obj instanceof LockFreeLinkedListNode)
	//*  26   46:aload_3         
	//*  27   47:instanceof      #175 <Class LockFreeLinkedListNode>
	//*  28   50:ifeq            57
				j = i + 1;
	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_2        
			obj = ((Object) (((LockFreeLinkedListNode) (obj)).getNextNode()));
	//   33   57:aload_3         
	//   34   58:invokevirtual   #185 <Method LockFreeLinkedListNode LockFreeLinkedListNode.getNextNode()>
	//   35   61:astore_3        
		}

	//   36   62:iload_2         
	//   37   63:istore_1        
	//*  38   64:goto            33
		return i;
	//   39   67:iload_1         
	//   40   68:ireturn         
	}

	private final Object enqueueSend(SendElement sendelement)
	{
		if(isBufferAlwaysFull())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #187 <Method boolean isBufferAlwaysFull()>
	//*   2    4:ifeq            67
		{
			LockFreeLinkedListHead lockfreelinkedlisthead = queue;
	//    3    7:aload_0         
	//    4    8:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    5   11:astore_3        
			Object obj;
			do
			{
				obj = ((LockFreeLinkedListNode) (lockfreelinkedlisthead)).getPrev();
	//    6   12:aload_3         
	//    7   13:invokevirtual   #190 <Method Object LockFreeLinkedListNode.getPrev()>
	//    8   16:astore          4
				if(obj == null)
	//*   9   18:aload           4
	//*  10   20:ifnonnull       33
					throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//   11   23:new             #168 <Class TypeCastException>
	//   12   26:dup             
	//   13   27:ldc1            #170 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   14   29:invokespecial   #173 <Method void TypeCastException(String)>
	//   15   32:athrow          
				obj = ((Object) ((LockFreeLinkedListNode)obj));
	//   16   33:aload           4
	//   17   35:checkcast       #175 <Class LockFreeLinkedListNode>
	//   18   38:astore          4
				if(obj instanceof ReceiveOrClosed)
	//*  19   40:aload           4
	//*  20   42:instanceof      #192 <Class ReceiveOrClosed>
	//*  21   45:ifeq            51
					return obj;
	//   22   48:aload           4
	//   23   50:areturn         
			} while(!((LockFreeLinkedListNode) (obj)).addNext((LockFreeLinkedListNode)sendelement, ((LockFreeLinkedListNode) (lockfreelinkedlisthead))));
	//   24   51:aload           4
	//   25   53:aload_1         
	//   26   54:checkcast       #175 <Class LockFreeLinkedListNode>
	//   27   57:aload_3         
	//   28   58:invokevirtual   #196 <Method boolean LockFreeLinkedListNode.addNext(LockFreeLinkedListNode, LockFreeLinkedListNode)>
	//   29   61:ifeq            12
		} else
	//*  30   64:goto            182
		{
			LockFreeLinkedListHead lockfreelinkedlisthead1 = queue;
	//   31   67:aload_0         
	//   32   68:getfield        #142 <Field LockFreeLinkedListHead queue>
	//   33   71:astore_3        
			sendelement = ((SendElement) ((LockFreeLinkedListNode)sendelement));
	//   34   72:aload_1         
	//   35   73:checkcast       #175 <Class LockFreeLinkedListNode>
	//   36   76:astore_1        
	/* block-local class not found */
	class enqueueSend..inlined.addLastIfPrevAndIf._cls1 {}

			kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condaddop = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp)new enqueueSend..inlined.addLastIfPrevAndIf._cls1(((LockFreeLinkedListNode) (sendelement)), ((LockFreeLinkedListNode) (sendelement)), this);
	//   37   77:new             #198 <Class AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1>
	//   38   80:dup             
	//   39   81:aload_1         
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:invokespecial   #201 <Method void AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1(LockFreeLinkedListNode, LockFreeLinkedListNode, AbstractSendChannel)>
	//   43   87:checkcast       #203 <Class kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp>
	//   44   90:astore          4
			boolean flag;
label0:
			do
			{
				Object obj1 = ((LockFreeLinkedListNode) (lockfreelinkedlisthead1)).getPrev();
	//   45   92:aload_3         
	//   46   93:invokevirtual   #190 <Method Object LockFreeLinkedListNode.getPrev()>
	//   47   96:astore          5
				if(obj1 == null)
	//*  48   98:aload           5
	//*  49  100:ifnonnull       113
					throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//   50  103:new             #168 <Class TypeCastException>
	//   51  106:dup             
	//   52  107:ldc1            #170 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   53  109:invokespecial   #173 <Method void TypeCastException(String)>
	//   54  112:athrow          
				obj1 = ((Object) ((LockFreeLinkedListNode)obj1));
	//   55  113:aload           5
	//   56  115:checkcast       #175 <Class LockFreeLinkedListNode>
	//   57  118:astore          5
				if(obj1 instanceof ReceiveOrClosed)
	//*  58  120:aload           5
	//*  59  122:instanceof      #192 <Class ReceiveOrClosed>
	//*  60  125:ifeq            131
					return obj1;
	//   61  128:aload           5
	//   62  130:areturn         
				switch(((LockFreeLinkedListNode) (obj1)).tryCondAddNext(((LockFreeLinkedListNode) (sendelement)), ((LockFreeLinkedListNode) (lockfreelinkedlisthead1)), condaddop))
	//*  63  131:aload           5
	//*  64  133:aload_1         
	//*  65  134:aload_3         
	//*  66  135:aload           4
	//*  67  137:invokevirtual   #207 <Method int LockFreeLinkedListNode.tryCondAddNext(LockFreeLinkedListNode, LockFreeLinkedListNode, kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp)>
				{
				default:
					break;

	//*  68  140:tableswitch     1 2: default 164
	//	               1 172
	//	               2 167
	//*  69  164:goto            92
				case 2: // '\002'
					flag = false;
	//   70  167:iconst_0        
	//   71  168:istore_2        
					break label0;
	//   72  169:goto            174

				case 1: // '\001'
					flag = true;
	//   73  172:iconst_1        
	//   74  173:istore_2        
					break label0;
				}
			} while(true);
			if(!flag)
	//*  75  174:iload_2         
	//*  76  175:ifne            182
				return AbstractChannelKt.ENQUEUE_FAILED;
	//   77  178:getstatic       #212 <Field Object AbstractChannelKt.ENQUEUE_FAILED>
	//   78  181:areturn         
		}
		return ((Object) (null));
	//   79  182:aconst_null     
	//   80  183:areturn         
	}

	private final String getQueueDebugStateString()
	{
		LockFreeLinkedListNode lockfreelinkedlistnode = queue.getNextNode();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    2    4:invokevirtual   #213 <Method LockFreeLinkedListNode LockFreeLinkedListHead.getNextNode()>
	//    3    7:astore_3        
		if(lockfreelinkedlistnode == queue)
	//*   4    8:aload_3         
	//*   5    9:aload_0         
	//*   6   10:getfield        #142 <Field LockFreeLinkedListHead queue>
	//*   7   13:if_acmpne       19
			return "EmptyQueue";
	//    8   16:ldc1            #215 <String "EmptyQueue">
	//    9   18:areturn         
		Object obj;
		if(lockfreelinkedlistnode instanceof Closed)
	//*  10   19:aload_3         
	//*  11   20:instanceof      #217 <Class Closed>
	//*  12   23:ifeq            34
			obj = ((Object) (lockfreelinkedlistnode.toString()));
	//   13   26:aload_3         
	//   14   27:invokevirtual   #219 <Method String LockFreeLinkedListNode.toString()>
	//   15   30:astore_1        
		else
	//*  16   31:goto            86
		if(lockfreelinkedlistnode instanceof Receive)
	//*  17   34:aload_3         
	//*  18   35:instanceof      #221 <Class Receive>
	//*  19   38:ifeq            47
			obj = "ReceiveQueued";
	//   20   41:ldc1            #223 <String "ReceiveQueued">
	//   21   43:astore_1        
		else
	//*  22   44:goto            86
		if(lockfreelinkedlistnode instanceof Send)
	//*  23   47:aload_3         
	//*  24   48:instanceof      #225 <Class Send>
	//*  25   51:ifeq            60
		{
			obj = "SendQueued";
	//   26   54:ldc1            #227 <String "SendQueued">
	//   27   56:astore_1        
		} else
	//*  28   57:goto            86
		{
			obj = ((Object) (new StringBuilder()));
	//   29   60:new             #229 <Class StringBuilder>
	//   30   63:dup             
	//   31   64:invokespecial   #230 <Method void StringBuilder()>
	//   32   67:astore_1        
			((StringBuilder) (obj)).append("UNEXPECTED:");
	//   33   68:aload_1         
	//   34   69:ldc1            #232 <String "UNEXPECTED:">
	//   35   71:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
			((StringBuilder) (obj)).append(((Object) (lockfreelinkedlistnode)));
	//   37   75:aload_1         
	//   38   76:aload_3         
	//   39   77:invokevirtual   #239 <Method StringBuilder StringBuilder.append(Object)>
	//   40   80:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   41   81:aload_1         
	//   42   82:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   43   85:astore_1        
		}
		LockFreeLinkedListNode lockfreelinkedlistnode1 = queue.getPrevNode();
	//   44   86:aload_0         
	//   45   87:getfield        #142 <Field LockFreeLinkedListHead queue>
	//   46   90:invokevirtual   #243 <Method LockFreeLinkedListNode LockFreeLinkedListHead.getPrevNode()>
	//   47   93:astore          4
		Object obj1 = obj;
	//   48   95:aload_1         
	//   49   96:astore_2        
		if(lockfreelinkedlistnode1 != lockfreelinkedlistnode)
	//*  50   97:aload           4
	//*  51   99:aload_3         
	//*  52  100:if_acmpeq       181
		{
			obj1 = ((Object) (new StringBuilder()));
	//   53  103:new             #229 <Class StringBuilder>
	//   54  106:dup             
	//   55  107:invokespecial   #230 <Method void StringBuilder()>
	//   56  110:astore_2        
			((StringBuilder) (obj1)).append(((String) (obj)));
	//   57  111:aload_2         
	//   58  112:aload_1         
	//   59  113:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   60  116:pop             
			((StringBuilder) (obj1)).append(",queueSize=");
	//   61  117:aload_2         
	//   62  118:ldc1            #245 <String ",queueSize=">
	//   63  120:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   64  123:pop             
			((StringBuilder) (obj1)).append(countQueueSize());
	//   65  124:aload_2         
	//   66  125:aload_0         
	//   67  126:invokespecial   #247 <Method int countQueueSize()>
	//   68  129:invokevirtual   #250 <Method StringBuilder StringBuilder.append(int)>
	//   69  132:pop             
			obj = ((Object) (((StringBuilder) (obj1)).toString()));
	//   70  133:aload_2         
	//   71  134:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   72  137:astore_1        
			obj1 = obj;
	//   73  138:aload_1         
	//   74  139:astore_2        
			if(lockfreelinkedlistnode1 instanceof Closed)
	//*  75  140:aload           4
	//*  76  142:instanceof      #217 <Class Closed>
	//*  77  145:ifeq            181
			{
				obj1 = ((Object) (new StringBuilder()));
	//   78  148:new             #229 <Class StringBuilder>
	//   79  151:dup             
	//   80  152:invokespecial   #230 <Method void StringBuilder()>
	//   81  155:astore_2        
				((StringBuilder) (obj1)).append(((String) (obj)));
	//   82  156:aload_2         
	//   83  157:aload_1         
	//   84  158:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   85  161:pop             
				((StringBuilder) (obj1)).append(",closedForSend=");
	//   86  162:aload_2         
	//   87  163:ldc1            #252 <String ",closedForSend=">
	//   88  165:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   89  168:pop             
				((StringBuilder) (obj1)).append(((Object) (lockfreelinkedlistnode1)));
	//   90  169:aload_2         
	//   91  170:aload           4
	//   92  172:invokevirtual   #239 <Method StringBuilder StringBuilder.append(Object)>
	//   93  175:pop             
				obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   94  176:aload_2         
	//   95  177:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   96  180:astore_2        
			}
		}
		return ((String) (obj1));
	//   97  181:aload_2         
	//   98  182:areturn         
	}

	private final void helpClose(Closed closed)
	{
		do
		{
			LockFreeLinkedListNode lockfreelinkedlistnode = closed.getPrevNode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #253 <Method LockFreeLinkedListNode Closed.getPrevNode()>
	//    2    4:astore_2        
			if(!(lockfreelinkedlistnode instanceof LockFreeLinkedListHead))
	//*   3    5:aload_2         
	//*   4    6:instanceof      #139 <Class LockFreeLinkedListHead>
	//*   5    9:ifne            45
			{
				if(!(lockfreelinkedlistnode instanceof Receive))
	//*   6   12:aload_2         
	//*   7   13:instanceof      #221 <Class Receive>
	//*   8   16:ifne            20
					return;
	//    9   19:return          
				if(!lockfreelinkedlistnode.remove())
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #256 <Method boolean LockFreeLinkedListNode.remove()>
	//*  12   24:ifne            34
					lockfreelinkedlistnode.helpRemove();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #259 <Method void LockFreeLinkedListNode.helpRemove()>
				else
	//*  15   31:goto            0
					((Receive)lockfreelinkedlistnode).resumeReceiveClosed(closed);
	//   16   34:aload_2         
	//   17   35:checkcast       #221 <Class Receive>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #262 <Method void Receive.resumeReceiveClosed(Closed)>
			} else
	//*  20   42:goto            0
			{
				return;
	//   21   45:return          
			}
		} while(true);
	}

	private final void invokeOnCloseHandler(Throwable throwable)
	{
		Object obj = onCloseHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field Object onCloseHandler>
	//    2    4:astore_2        
		if(obj != null && obj != AbstractChannelKt.HANDLER_INVOKED && onCloseHandler$FU.compareAndSet(((Object) (this)), obj, AbstractChannelKt.HANDLER_INVOKED))
	//*   3    5:aload_2         
	//*   4    6:ifnull          45
	//*   5    9:aload_2         
	//*   6   10:getstatic       #268 <Field Object AbstractChannelKt.HANDLER_INVOKED>
	//*   7   13:if_acmpeq       45
	//*   8   16:getstatic       #133 <Field AtomicReferenceFieldUpdater onCloseHandler$FU>
	//*   9   19:aload_0         
	//*  10   20:aload_2         
	//*  11   21:getstatic       #268 <Field Object AbstractChannelKt.HANDLER_INVOKED>
	//*  12   24:invokevirtual   #272 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//*  13   27:ifeq            45
			((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(((Object) (throwable)));
	//   14   30:aload_2         
	//   15   31:iconst_1        
	//   16   32:invokestatic    #278 <Method Object TypeIntrinsics.beforeCheckcastToFunctionOfArity(Object, int)>
	//   17   35:checkcast       #280 <Class Function1>
	//   18   38:aload_1         
	//   19   39:invokeinterface #283 <Method Object Function1.invoke(Object)>
	//   20   44:pop             
	//   21   45:return          
	}

	private final void registerSelectSend(SelectInstance selectinstance, Object obj, Function2 function2)
	{
		Object obj2;
		do
		{
			do
			{
				if(selectinstance.isSelected())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #288 <Method boolean SelectInstance.isSelected()>
	//*   2    6:ifeq            10
					return;
	//    3    9:return          
				if(!isFull())
					break;
	//    4   10:aload_0         
	//    5   11:invokevirtual   #290 <Method boolean isFull()>
	//    6   14:ifeq            123
	/* block-local class not found */
	class TryEnqueueSendDesc {}

				Object obj1 = selectinstance.performAtomicIfNotSelected((AtomicDesc)new TryEnqueueSendDesc(obj, selectinstance, function2));
	//    7   17:aload_1         
	//    8   18:new             #17  <Class AbstractSendChannel$TryEnqueueSendDesc>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:invokespecial   #293 <Method void AbstractSendChannel$TryEnqueueSendDesc(AbstractSendChannel, Object, SelectInstance, Function2)>
	//   15   29:checkcast       #295 <Class AtomicDesc>
	//   16   32:invokeinterface #299 <Method Object SelectInstance.performAtomicIfNotSelected(AtomicDesc)>
	//   17   37:astore          4
				if(obj1 != null)
	//*  18   39:aload           4
	//*  19   41:ifnull          122
				{
					if(obj1 == SelectKt.getALREADY_SELECTED())
	//*  20   44:aload           4
	//*  21   46:invokestatic    #304 <Method Object SelectKt.getALREADY_SELECTED()>
	//*  22   49:if_acmpne       53
						return;
	//   23   52:return          
					if(obj1 != AbstractChannelKt.ENQUEUE_FAILED)
	//*  24   53:aload           4
	//*  25   55:getstatic       #212 <Field Object AbstractChannelKt.ENQUEUE_FAILED>
	//*  26   58:if_acmpne       64
	//*  27   61:goto            0
						if(obj1 instanceof Closed)
	//*  28   64:aload           4
	//*  29   66:instanceof      #217 <Class Closed>
	//*  30   69:ifeq            81
						{
							throw ((Closed)obj1).getSendException();
	//   31   72:aload           4
	//   32   74:checkcast       #217 <Class Closed>
	//   33   77:invokevirtual   #308 <Method Throwable Closed.getSendException()>
	//   34   80:athrow          
						} else
						{
							selectinstance = ((SelectInstance) (new StringBuilder()));
	//   35   81:new             #229 <Class StringBuilder>
	//   36   84:dup             
	//   37   85:invokespecial   #230 <Method void StringBuilder()>
	//   38   88:astore_1        
							((StringBuilder) (selectinstance)).append("performAtomicIfNotSelected(TryEnqueueSendDesc) returned ");
	//   39   89:aload_1         
	//   40   90:ldc2            #310 <String "performAtomicIfNotSelected(TryEnqueueSendDesc) returned ">
	//   41   93:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   42   96:pop             
							((StringBuilder) (selectinstance)).append(obj1);
	//   43   97:aload_1         
	//   44   98:aload           4
	//   45  100:invokevirtual   #239 <Method StringBuilder StringBuilder.append(Object)>
	//   46  103:pop             
							throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (selectinstance)).toString())).toString());
	//   47  104:new             #312 <Class IllegalStateException>
	//   48  107:dup             
	//   49  108:aload_1         
	//   50  109:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   51  112:invokevirtual   #313 <Method String Object.toString()>
	//   52  115:invokespecial   #314 <Method void IllegalStateException(String)>
	//   53  118:checkcast       #316 <Class Throwable>
	//   54  121:athrow          
						}
				} else
				{
					return;
	//   55  122:return          
				}
			} while(true);
			obj2 = offerSelectInternal(obj, selectinstance);
	//   56  123:aload_0         
	//   57  124:aload_2         
	//   58  125:aload_1         
	//   59  126:invokevirtual   #318 <Method Object offerSelectInternal(Object, SelectInstance)>
	//   60  129:astore          4
			if(obj2 == SelectKt.getALREADY_SELECTED())
	//*  61  131:aload           4
	//*  62  133:invokestatic    #304 <Method Object SelectKt.getALREADY_SELECTED()>
	//*  63  136:if_acmpne       140
				return;
	//   64  139:return          
		} while(obj2 == AbstractChannelKt.OFFER_FAILED);
	//   65  140:aload           4
	//   66  142:getstatic       #321 <Field Object AbstractChannelKt.OFFER_FAILED>
	//   67  145:if_acmpne       151
	//*  68  148:goto            0
		if(obj2 == AbstractChannelKt.OFFER_SUCCESS)
	//*  69  151:aload           4
	//*  70  153:getstatic       #324 <Field Object AbstractChannelKt.OFFER_SUCCESS>
	//*  71  156:if_acmpne       171
		{
			UndispatchedKt.startCoroutineUnintercepted(function2, ((Object) (this)), selectinstance.getCompletion());
	//   72  159:aload_3         
	//   73  160:aload_0         
	//   74  161:aload_1         
	//   75  162:invokeinterface #328 <Method Continuation SelectInstance.getCompletion()>
	//   76  167:invokestatic    #334 <Method void UndispatchedKt.startCoroutineUnintercepted(Function2, Object, Continuation)>
			return;
	//   77  170:return          
		}
		if(obj2 instanceof Closed)
	//*  78  171:aload           4
	//*  79  173:instanceof      #217 <Class Closed>
	//*  80  176:ifeq            188
		{
			throw ((Closed)obj2).getSendException();
	//   81  179:aload           4
	//   82  181:checkcast       #217 <Class Closed>
	//   83  184:invokevirtual   #308 <Method Throwable Closed.getSendException()>
	//   84  187:athrow          
		} else
		{
			selectinstance = ((SelectInstance) (new StringBuilder()));
	//   85  188:new             #229 <Class StringBuilder>
	//   86  191:dup             
	//   87  192:invokespecial   #230 <Method void StringBuilder()>
	//   88  195:astore_1        
			((StringBuilder) (selectinstance)).append("offerSelectInternal returned ");
	//   89  196:aload_1         
	//   90  197:ldc2            #336 <String "offerSelectInternal returned ">
	//   91  200:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   92  203:pop             
			((StringBuilder) (selectinstance)).append(obj2);
	//   93  204:aload_1         
	//   94  205:aload           4
	//   95  207:invokevirtual   #239 <Method StringBuilder StringBuilder.append(Object)>
	//   96  210:pop             
			throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (selectinstance)).toString())).toString());
	//   97  211:new             #312 <Class IllegalStateException>
	//   98  214:dup             
	//   99  215:aload_1         
	//  100  216:invokevirtual   #240 <Method String StringBuilder.toString()>
	//  101  219:invokevirtual   #313 <Method String Object.toString()>
	//  102  222:invokespecial   #314 <Method void IllegalStateException(String)>
	//  103  225:checkcast       #316 <Class Throwable>
	//  104  228:athrow          
		}
	}

	protected void afterClose(Throwable throwable)
	{
	//    0    0:return          
	}

	public boolean close(Throwable throwable)
	{
		Closed closed = new Closed(throwable);
	//    0    0:new             #217 <Class Closed>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #340 <Method void Closed(Throwable)>
	//    4    8:astore_3        
		LockFreeLinkedListHead lockfreelinkedlisthead = queue;
	//    5    9:aload_0         
	//    6   10:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    7   13:astore          4
		boolean flag;
		do
		{
			Object obj = ((LockFreeLinkedListNode) (lockfreelinkedlisthead)).getPrev();
	//    8   15:aload           4
	//    9   17:invokevirtual   #190 <Method Object LockFreeLinkedListNode.getPrev()>
	//   10   20:astore          5
			if(obj == null)
	//*  11   22:aload           5
	//*  12   24:ifnonnull       37
				throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//   13   27:new             #168 <Class TypeCastException>
	//   14   30:dup             
	//   15   31:ldc1            #170 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   16   33:invokespecial   #173 <Method void TypeCastException(String)>
	//   17   36:athrow          
			obj = ((Object) ((LockFreeLinkedListNode)obj));
	//   18   37:aload           5
	//   19   39:checkcast       #175 <Class LockFreeLinkedListNode>
	//   20   42:astore          5
			if(!(obj instanceof Closed))
	//*  21   44:aload           5
	//*  22   46:instanceof      #217 <Class Closed>
	//*  23   49:ifne            57
				flag = true;
	//   24   52:iconst_1        
	//   25   53:istore_2        
			else
	//*  26   54:goto            59
				flag = false;
	//   27   57:iconst_0        
	//   28   58:istore_2        
			if(!flag)
	//*  29   59:iload_2         
	//*  30   60:ifne            68
			{
				flag = false;
	//   31   63:iconst_0        
	//   32   64:istore_2        
				break;
	//   33   65:goto            84
			}
			if(!((LockFreeLinkedListNode) (obj)).addNext((LockFreeLinkedListNode)closed, ((LockFreeLinkedListNode) (lockfreelinkedlisthead))))
				continue;
	//   34   68:aload           5
	//   35   70:aload_3         
	//   36   71:checkcast       #175 <Class LockFreeLinkedListNode>
	//   37   74:aload           4
	//   38   76:invokevirtual   #196 <Method boolean LockFreeLinkedListNode.addNext(LockFreeLinkedListNode, LockFreeLinkedListNode)>
	//   39   79:ifeq            15
			flag = true;
	//   40   82:iconst_1        
	//   41   83:istore_2        
			break;
		} while(true);
		if(!flag)
	//*  42   84:iload_2         
	//*  43   85:ifne            121
		{
			throwable = ((Throwable) (queue.getPrevNode()));
	//   44   88:aload_0         
	//   45   89:getfield        #142 <Field LockFreeLinkedListHead queue>
	//   46   92:invokevirtual   #243 <Method LockFreeLinkedListNode LockFreeLinkedListHead.getPrevNode()>
	//   47   95:astore_1        
			if(throwable == null)
	//*  48   96:aload_1         
	//*  49   97:ifnonnull       111
			{
				throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
	//   50  100:new             #168 <Class TypeCastException>
	//   51  103:dup             
	//   52  104:ldc2            #342 <String "null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>">
	//   53  107:invokespecial   #173 <Method void TypeCastException(String)>
	//   54  110:athrow          
			} else
			{
				helpClose((Closed)throwable);
	//   55  111:aload_0         
	//   56  112:aload_1         
	//   57  113:checkcast       #217 <Class Closed>
	//   58  116:invokespecial   #157 <Method void helpClose(Closed)>
				return false;
	//   59  119:iconst_0        
	//   60  120:ireturn         
			}
		} else
		{
			helpClose(closed);
	//   61  121:aload_0         
	//   62  122:aload_3         
	//   63  123:invokespecial   #157 <Method void helpClose(Closed)>
			invokeOnCloseHandler(throwable);
	//   64  126:aload_0         
	//   65  127:aload_1         
	//   66  128:invokespecial   #344 <Method void invokeOnCloseHandler(Throwable)>
			onClosed(closed);
	//   67  131:aload_0         
	//   68  132:aload_3         
	//   69  133:invokevirtual   #346 <Method void onClosed(Closed)>
			afterClose(throwable);
	//   70  136:aload_0         
	//   71  137:aload_1         
	//   72  138:invokevirtual   #348 <Method void afterClose(Throwable)>
			return true;
	//   73  141:iconst_1        
	//   74  142:ireturn         
		}
	}

	protected final void conflatePreviousSendBuffered(LockFreeLinkedListNode lockfreelinkedlistnode)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (lockfreelinkedlistnode)), "node");
	//    0    0:aload_1         
	//    1    1:ldc2            #350 <String "node">
	//    2    4:invokestatic    #354 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		LockFreeLinkedListNode lockfreelinkedlistnode1 = lockfreelinkedlistnode.getPrevNode();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #355 <Method LockFreeLinkedListNode LockFreeLinkedListNode.getPrevNode()>
	//    5   11:astore_2        
		lockfreelinkedlistnode = lockfreelinkedlistnode1;
	//    6   12:aload_2         
	//    7   13:astore_1        
	/* block-local class not found */
	class SendBuffered {}

		if(!(lockfreelinkedlistnode1 instanceof SendBuffered))
	//*   8   14:aload_2         
	//*   9   15:instanceof      #9   <Class AbstractSendChannel$SendBuffered>
	//*  10   18:ifne            23
			lockfreelinkedlistnode = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
		lockfreelinkedlistnode = ((LockFreeLinkedListNode) ((SendBuffered)lockfreelinkedlistnode));
	//   13   23:aload_1         
	//   14   24:checkcast       #9   <Class AbstractSendChannel$SendBuffered>
	//   15   27:astore_1        
		if(lockfreelinkedlistnode != null)
	//*  16   28:aload_1         
	//*  17   29:ifnull          37
			((SendBuffered) (lockfreelinkedlistnode)).remove();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #356 <Method boolean AbstractSendChannel$SendBuffered.remove()>
	//   20   36:pop             
	//   21   37:return          
	}

	protected final kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc describeSendBuffered(Object obj)
	{
	/* block-local class not found */
	class SendBufferedDesc {}

		return (kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc)new SendBufferedDesc(queue, obj);
	//    0    0:new             #11  <Class AbstractSendChannel$SendBufferedDesc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    4    8:aload_1         
	//    5    9:invokespecial   #359 <Method void AbstractSendChannel$SendBufferedDesc(LockFreeLinkedListHead, Object)>
	//    6   12:checkcast       #361 <Class kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc>
	//    7   15:areturn         
	}

	protected final kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc describeSendConflated(Object obj)
	{
	/* block-local class not found */
	class SendConflatedDesc {}

		return (kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc)new SendConflatedDesc(queue, obj);
	//    0    0:new             #13  <Class AbstractSendChannel$SendConflatedDesc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    4    8:aload_1         
	//    5    9:invokespecial   #363 <Method void AbstractSendChannel$SendConflatedDesc(LockFreeLinkedListHead, Object)>
	//    6   12:checkcast       #361 <Class kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc>
	//    7   15:areturn         
	}

	protected final TryOfferDesc describeTryOffer(Object obj)
	{
	/* block-local class not found */
	class TryOfferDesc {}

		return new TryOfferDesc(obj, queue);
	//    0    0:new             #19  <Class AbstractSendChannel$TryOfferDesc>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    5    9:invokespecial   #366 <Method void AbstractSendChannel$TryOfferDesc(Object, LockFreeLinkedListHead)>
	//    6   12:areturn         
	}

	protected String getBufferDebugString()
	{
		return "";
	//    0    0:ldc2            #368 <String "">
	//    1    3:areturn         
	}

	protected final Closed getClosedForReceive()
	{
		LockFreeLinkedListNode lockfreelinkedlistnode = queue.getNextNode();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    2    4:invokevirtual   #213 <Method LockFreeLinkedListNode LockFreeLinkedListHead.getNextNode()>
	//    3    7:astore_2        
		Object obj = ((Object) (lockfreelinkedlistnode));
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(!(lockfreelinkedlistnode instanceof Closed))
	//*   6   10:aload_2         
	//*   7   11:instanceof      #217 <Class Closed>
	//*   8   14:ifne            19
			obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		obj = ((Object) ((Closed)obj));
	//   11   19:aload_1         
	//   12   20:checkcast       #217 <Class Closed>
	//   13   23:astore_1        
		if(obj != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          35
		{
			helpClose(((Closed) (obj)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokespecial   #157 <Method void helpClose(Closed)>
			return ((Closed) (obj));
	//   19   33:aload_1         
	//   20   34:areturn         
		} else
		{
			return null;
	//   21   35:aconst_null     
	//   22   36:areturn         
		}
	}

	protected final Closed getClosedForSend()
	{
		LockFreeLinkedListNode lockfreelinkedlistnode = queue.getPrevNode();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    2    4:invokevirtual   #243 <Method LockFreeLinkedListNode LockFreeLinkedListHead.getPrevNode()>
	//    3    7:astore_2        
		Object obj = ((Object) (lockfreelinkedlistnode));
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(!(lockfreelinkedlistnode instanceof Closed))
	//*   6   10:aload_2         
	//*   7   11:instanceof      #217 <Class Closed>
	//*   8   14:ifne            19
			obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		obj = ((Object) ((Closed)obj));
	//   11   19:aload_1         
	//   12   20:checkcast       #217 <Class Closed>
	//   13   23:astore_1        
		if(obj != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          35
		{
			helpClose(((Closed) (obj)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokespecial   #157 <Method void helpClose(Closed)>
			return ((Closed) (obj));
	//   19   33:aload_1         
	//   20   34:areturn         
		} else
		{
			return null;
	//   21   35:aconst_null     
	//   22   36:areturn         
		}
	}

	public final SelectClause2 getOnSend()
	{
	/* block-local class not found */
	class onSend._cls1 {}

		return (SelectClause2)new onSend._cls1();
	//    0    0:new             #371 <Class AbstractSendChannel$onSend$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #374 <Method void AbstractSendChannel$onSend$1(AbstractSendChannel)>
	//    4    8:checkcast       #376 <Class SelectClause2>
	//    5   11:areturn         
	}

	protected final LockFreeLinkedListHead getQueue()
	{
		return queue;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    2    4:areturn         
	}

	public void invokeOnClose(Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "handler");
	//    0    0:aload_1         
	//    1    1:ldc2            #379 <String "handler">
	//    2    4:invokestatic    #354 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!onCloseHandler$FU.compareAndSet(((Object) (this)), ((Object) (null)), ((Object) (function1))))
	//*   3    7:getstatic       #133 <Field AtomicReferenceFieldUpdater onCloseHandler$FU>
	//*   4   10:aload_0         
	//*   5   11:aconst_null     
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #272 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//*   8   16:ifne            82
		{
			function1 = ((Function1) (onCloseHandler));
	//    9   19:aload_0         
	//   10   20:getfield        #144 <Field Object onCloseHandler>
	//   11   23:astore_1        
			if(function1 == AbstractChannelKt.HANDLER_INVOKED)
	//*  12   24:aload_1         
	//*  13   25:getstatic       #268 <Field Object AbstractChannelKt.HANDLER_INVOKED>
	//*  14   28:if_acmpne       45
			{
				throw (Throwable)new IllegalStateException("Another handler was already registered and successfully invoked");
	//   15   31:new             #312 <Class IllegalStateException>
	//   16   34:dup             
	//   17   35:ldc2            #381 <String "Another handler was already registered and successfully invoked">
	//   18   38:invokespecial   #314 <Method void IllegalStateException(String)>
	//   19   41:checkcast       #316 <Class Throwable>
	//   20   44:athrow          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   21   45:new             #229 <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #230 <Method void StringBuilder()>
	//   24   52:astore_2        
				stringbuilder.append("Another handler was already registered: ");
	//   25   53:aload_2         
	//   26   54:ldc2            #383 <String "Another handler was already registered: ">
	//   27   57:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
				stringbuilder.append(((Object) (function1)));
	//   29   61:aload_2         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #239 <Method StringBuilder StringBuilder.append(Object)>
	//   32   66:pop             
				throw (Throwable)new IllegalStateException(stringbuilder.toString());
	//   33   67:new             #312 <Class IllegalStateException>
	//   34   70:dup             
	//   35   71:aload_2         
	//   36   72:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   37   75:invokespecial   #314 <Method void IllegalStateException(String)>
	//   38   78:checkcast       #316 <Class Throwable>
	//   39   81:athrow          
			}
		}
		Closed closed = getClosedForSend();
	//   40   82:aload_0         
	//   41   83:invokevirtual   #385 <Method Closed getClosedForSend()>
	//   42   86:astore_2        
		if(closed != null && onCloseHandler$FU.compareAndSet(((Object) (this)), ((Object) (function1)), AbstractChannelKt.HANDLER_INVOKED))
	//*  43   87:aload_2         
	//*  44   88:ifnull          116
	//*  45   91:getstatic       #133 <Field AtomicReferenceFieldUpdater onCloseHandler$FU>
	//*  46   94:aload_0         
	//*  47   95:aload_1         
	//*  48   96:getstatic       #268 <Field Object AbstractChannelKt.HANDLER_INVOKED>
	//*  49   99:invokevirtual   #272 <Method boolean AtomicReferenceFieldUpdater.compareAndSet(Object, Object, Object)>
	//*  50  102:ifeq            116
			function1.invoke(((Object) (closed.closeCause)));
	//   51  105:aload_1         
	//   52  106:aload_2         
	//   53  107:getfield        #389 <Field Throwable Closed.closeCause>
	//   54  110:invokeinterface #283 <Method Object Function1.invoke(Object)>
	//   55  115:pop             
	//   56  116:return          
	}

	protected abstract boolean isBufferAlwaysFull();

	protected abstract boolean isBufferFull();

	public final boolean isClosedForSend()
	{
		return getClosedForSend() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #385 <Method Closed getClosedForSend()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final boolean isFull()
	{
		return !(queue.getNextNode() instanceof ReceiveOrClosed) && isBufferFull();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    2    4:invokevirtual   #213 <Method LockFreeLinkedListNode LockFreeLinkedListHead.getNextNode()>
	//    3    7:instanceof      #192 <Class ReceiveOrClosed>
	//    4   10:ifne            22
	//    5   13:aload_0         
	//    6   14:invokevirtual   #392 <Method boolean isBufferFull()>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public final boolean offer(Object obj)
	{
		obj = offerInternal(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #394 <Method Object offerInternal(Object)>
	//    3    5:astore_1        
		if(obj == AbstractChannelKt.OFFER_SUCCESS)
	//*   4    6:aload_1         
	//*   5    7:getstatic       #324 <Field Object AbstractChannelKt.OFFER_SUCCESS>
	//*   6   10:if_acmpne       15
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		if(obj == AbstractChannelKt.OFFER_FAILED)
	//*   9   15:aload_1         
	//*  10   16:getstatic       #321 <Field Object AbstractChannelKt.OFFER_FAILED>
	//*  11   19:if_acmpne       44
		{
			obj = ((Object) (getClosedForSend()));
	//   12   22:aload_0         
	//   13   23:invokevirtual   #385 <Method Closed getClosedForSend()>
	//   14   26:astore_1        
			if(obj != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          42
			{
				obj = ((Object) (((Closed) (obj)).getSendException()));
	//   17   31:aload_1         
	//   18   32:invokevirtual   #308 <Method Throwable Closed.getSendException()>
	//   19   35:astore_1        
				if(obj != null)
	//*  20   36:aload_1         
	//*  21   37:ifnull          42
					throw obj;
	//   22   40:aload_1         
	//   23   41:athrow          
			}
			return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         
		}
		if(obj instanceof Closed)
	//*  26   44:aload_1         
	//*  27   45:instanceof      #217 <Class Closed>
	//*  28   48:ifeq            59
		{
			throw ((Closed)obj).getSendException();
	//   29   51:aload_1         
	//   30   52:checkcast       #217 <Class Closed>
	//   31   55:invokevirtual   #308 <Method Throwable Closed.getSendException()>
	//   32   58:athrow          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   59:new             #229 <Class StringBuilder>
	//   34   62:dup             
	//   35   63:invokespecial   #230 <Method void StringBuilder()>
	//   36   66:astore_2        
			stringbuilder.append("offerInternal returned ");
	//   37   67:aload_2         
	//   38   68:ldc2            #396 <String "offerInternal returned ">
	//   39   71:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
			stringbuilder.append(obj);
	//   41   75:aload_2         
	//   42   76:aload_1         
	//   43   77:invokevirtual   #239 <Method StringBuilder StringBuilder.append(Object)>
	//   44   80:pop             
			throw (Throwable)new IllegalStateException(((Object) (stringbuilder.toString())).toString());
	//   45   81:new             #312 <Class IllegalStateException>
	//   46   84:dup             
	//   47   85:aload_2         
	//   48   86:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   49   89:invokevirtual   #313 <Method String Object.toString()>
	//   50   92:invokespecial   #314 <Method void IllegalStateException(String)>
	//   51   95:checkcast       #316 <Class Throwable>
	//   52   98:athrow          
		}
	}

	protected Object offerInternal(Object obj)
	{
		do
		{
			ReceiveOrClosed receiveorclosed = takeFirstReceiveOrPeekClosed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #400 <Method ReceiveOrClosed takeFirstReceiveOrPeekClosed()>
	//    2    4:astore_2        
			if(receiveorclosed != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          36
			{
				Object obj1 = receiveorclosed.tryResumeReceive(obj, ((Object) (null)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:invokeinterface #404 <Method Object ReceiveOrClosed.tryResumeReceive(Object, Object)>
	//    9   17:astore_3        
				if(obj1 != null)
	//*  10   18:aload_3         
	//*  11   19:ifnull          0
				{
					receiveorclosed.completeResumeReceive(obj1);
	//   12   22:aload_2         
	//   13   23:aload_3         
	//   14   24:invokeinterface #408 <Method void ReceiveOrClosed.completeResumeReceive(Object)>
					return receiveorclosed.getOfferResult();
	//   15   29:aload_2         
	//   16   30:invokeinterface #411 <Method Object ReceiveOrClosed.getOfferResult()>
	//   17   35:areturn         
				}
			} else
			{
				return AbstractChannelKt.OFFER_FAILED;
	//   18   36:getstatic       #321 <Field Object AbstractChannelKt.OFFER_FAILED>
	//   19   39:areturn         
			}
		} while(true);
	}

	protected Object offerSelectInternal(Object obj, SelectInstance selectinstance)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (selectinstance)), "select");
	//    0    0:aload_2         
	//    1    1:ldc2            #413 <String "select">
	//    2    4:invokestatic    #354 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		obj = ((Object) (describeTryOffer(obj)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #415 <Method AbstractSendChannel$TryOfferDesc describeTryOffer(Object)>
	//    6   12:astore_1        
		selectinstance = ((SelectInstance) (selectinstance.performAtomicTrySelect((AtomicDesc)obj)));
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:checkcast       #295 <Class AtomicDesc>
	//   10   18:invokeinterface #418 <Method Object SelectInstance.performAtomicTrySelect(AtomicDesc)>
	//   11   23:astore_2        
		if(selectinstance != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          30
			return ((Object) (selectinstance));
	//   14   28:aload_2         
	//   15   29:areturn         
		selectinstance = ((SelectInstance) ((ReceiveOrClosed)((TryOfferDesc) (obj)).getResult()));
	//   16   30:aload_1         
	//   17   31:invokevirtual   #421 <Method Object AbstractSendChannel$TryOfferDesc.getResult()>
	//   18   34:checkcast       #192 <Class ReceiveOrClosed>
	//   19   37:astore_2        
		obj = ((TryOfferDesc) (obj)).resumeToken;
	//   20   38:aload_1         
	//   21   39:getfield        #424 <Field Object AbstractSendChannel$TryOfferDesc.resumeToken>
	//   22   42:astore_1        
		if(obj == null)
	//*  23   43:aload_1         
	//*  24   44:ifnonnull       50
			Intrinsics.throwNpe();
	//   25   47:invokestatic    #427 <Method void Intrinsics.throwNpe()>
		((ReceiveOrClosed) (selectinstance)).completeResumeReceive(obj);
	//   26   50:aload_2         
	//   27   51:aload_1         
	//   28   52:invokeinterface #408 <Method void ReceiveOrClosed.completeResumeReceive(Object)>
		return ((ReceiveOrClosed) (selectinstance)).getOfferResult();
	//   29   57:aload_2         
	//   30   58:invokeinterface #411 <Method Object ReceiveOrClosed.getOfferResult()>
	//   31   63:areturn         
	}

	protected void onClosed(Closed closed)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closed)), "closed");
	//    0    0:aload_1         
	//    1    1:ldc2            #429 <String "closed">
	//    2    4:invokestatic    #354 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	//    3    7:return          
	}

	public final Object send(Object obj, Continuation continuation)
	{
		if(offer(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #432 <Method boolean offer(Object)>
	//*   3    5:ifeq            12
			return ((Object) (Unit.INSTANCE));
	//    4    8:getstatic       #438 <Field Unit Unit.INSTANCE>
	//    5   11:areturn         
		else
			return sendSuspend(obj, continuation);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #440 <Method Object sendSuspend(Object, Continuation)>
	//   10   18:areturn         
	}

	protected final ReceiveOrClosed sendBuffered(Object obj)
	{
		LockFreeLinkedListHead lockfreelinkedlisthead = queue;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    2    4:astore_2        
		obj = ((Object) ((LockFreeLinkedListNode)new SendBuffered(obj)));
	//    3    5:new             #9   <Class AbstractSendChannel$SendBuffered>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #443 <Method void AbstractSendChannel$SendBuffered(Object)>
	//    7   13:checkcast       #175 <Class LockFreeLinkedListNode>
	//    8   16:astore_1        
		Object obj1;
		do
		{
			obj1 = ((LockFreeLinkedListNode) (lockfreelinkedlisthead)).getPrev();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #190 <Method Object LockFreeLinkedListNode.getPrev()>
	//   11   21:astore_3        
			if(obj1 == null)
	//*  12   22:aload_3         
	//*  13   23:ifnonnull       36
				throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//   14   26:new             #168 <Class TypeCastException>
	//   15   29:dup             
	//   16   30:ldc1            #170 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   17   32:invokespecial   #173 <Method void TypeCastException(String)>
	//   18   35:athrow          
			obj1 = ((Object) ((LockFreeLinkedListNode)obj1));
	//   19   36:aload_3         
	//   20   37:checkcast       #175 <Class LockFreeLinkedListNode>
	//   21   40:astore_3        
			if(obj1 instanceof ReceiveOrClosed)
	//*  22   41:aload_3         
	//*  23   42:instanceof      #192 <Class ReceiveOrClosed>
	//*  24   45:ifeq            53
				return (ReceiveOrClosed)obj1;
	//   25   48:aload_3         
	//   26   49:checkcast       #192 <Class ReceiveOrClosed>
	//   27   52:areturn         
		} while(!((LockFreeLinkedListNode) (obj1)).addNext(((LockFreeLinkedListNode) (obj)), ((LockFreeLinkedListNode) (lockfreelinkedlisthead))));
	//   28   53:aload_3         
	//   29   54:aload_1         
	//   30   55:aload_2         
	//   31   56:invokevirtual   #196 <Method boolean LockFreeLinkedListNode.addNext(LockFreeLinkedListNode, LockFreeLinkedListNode)>
	//   32   59:ifeq            17
		return null;
	//   33   62:aconst_null     
	//   34   63:areturn         
	}

	protected final ReceiveOrClosed sendConflated(Object obj)
	{
		obj = ((Object) (new SendBuffered(obj)));
	//    0    0:new             #9   <Class AbstractSendChannel$SendBuffered>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #443 <Method void AbstractSendChannel$SendBuffered(Object)>
	//    4    8:astore_1        
		LockFreeLinkedListHead lockfreelinkedlisthead = queue;
	//    5    9:aload_0         
	//    6   10:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    7   13:astore_2        
		Object obj1;
		do
		{
			obj1 = ((LockFreeLinkedListNode) (lockfreelinkedlisthead)).getPrev();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #190 <Method Object LockFreeLinkedListNode.getPrev()>
	//   10   18:astore_3        
			if(obj1 == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       33
				throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//   13   23:new             #168 <Class TypeCastException>
	//   14   26:dup             
	//   15   27:ldc1            #170 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   16   29:invokespecial   #173 <Method void TypeCastException(String)>
	//   17   32:athrow          
			obj1 = ((Object) ((LockFreeLinkedListNode)obj1));
	//   18   33:aload_3         
	//   19   34:checkcast       #175 <Class LockFreeLinkedListNode>
	//   20   37:astore_3        
			if(obj1 instanceof ReceiveOrClosed)
	//*  21   38:aload_3         
	//*  22   39:instanceof      #192 <Class ReceiveOrClosed>
	//*  23   42:ifeq            50
				return (ReceiveOrClosed)obj1;
	//   24   45:aload_3         
	//   25   46:checkcast       #192 <Class ReceiveOrClosed>
	//   26   49:areturn         
		} while(!((LockFreeLinkedListNode) (obj1)).addNext((LockFreeLinkedListNode)obj, ((LockFreeLinkedListNode) (lockfreelinkedlisthead))));
	//   27   50:aload_3         
	//   28   51:aload_1         
	//   29   52:checkcast       #175 <Class LockFreeLinkedListNode>
	//   30   55:aload_2         
	//   31   56:invokevirtual   #196 <Method boolean LockFreeLinkedListNode.addNext(LockFreeLinkedListNode, LockFreeLinkedListNode)>
	//   32   59:ifeq            14
		conflatePreviousSendBuffered((LockFreeLinkedListNode)obj);
	//   33   62:aload_0         
	//   34   63:aload_1         
	//   35   64:checkcast       #175 <Class LockFreeLinkedListNode>
	//   36   67:invokevirtual   #446 <Method void conflatePreviousSendBuffered(LockFreeLinkedListNode)>
		return null;
	//   37   70:aconst_null     
	//   38   71:areturn         
	}

	final Object sendSuspend(Object obj, Continuation continuation)
	{
		Object obj3;
label0:
		{
			CancellableContinuationImpl cancellablecontinuationimpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 0);
	//    0    0:new             #448 <Class CancellableContinuationImpl>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokestatic    #454 <Method Continuation IntrinsicsKt.intercepted(Continuation)>
	//    4    8:iconst_0        
	//    5    9:invokespecial   #457 <Method void CancellableContinuationImpl(Continuation, int)>
	//    6   12:astore_3        
			Object obj1 = ((Object) ((CancellableContinuation)cancellablecontinuationimpl));
	//    7   13:aload_3         
	//    8   14:checkcast       #459 <Class CancellableContinuation>
	//    9   17:astore          4
			Object obj2 = ((Object) (new SendElement(obj, ((CancellableContinuation) (obj1)))));
	//   10   19:new             #461 <Class SendElement>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:aload           4
	//   14   26:invokespecial   #464 <Method void SendElement(Object, CancellableContinuation)>
	//   15   29:astore          5
			do
			{
				obj3 = enqueueSend(((SendElement) (obj2)));
	//   16   31:aload_0         
	//   17   32:aload           5
	//   18   34:invokestatic    #466 <Method Object access$enqueueSend(AbstractSendChannel, SendElement)>
	//   19   37:astore          6
				if(obj3 == null)
	//*  20   39:aload           6
	//*  21   41:ifnonnull       64
				{
					((CancellableContinuation) (obj1)).initCancellability();
	//   22   44:aload           4
	//   23   46:invokeinterface #469 <Method void CancellableContinuation.initCancellability()>
					CancellableContinuationKt.removeOnCancellation(((CancellableContinuation) (obj1)), (LockFreeLinkedListNode)obj2);
	//   24   51:aload           4
	//   25   53:aload           5
	//   26   55:checkcast       #175 <Class LockFreeLinkedListNode>
	//   27   58:invokestatic    #475 <Method void CancellableContinuationKt.removeOnCancellation(CancellableContinuation, LockFreeLinkedListNode)>
					break;
	//   28   61:goto            229
				}
				if(obj3 instanceof Closed)
	//*  29   64:aload           6
	//*  30   66:instanceof      #217 <Class Closed>
	//*  31   69:ifeq            120
				{
					obj2 = ((Object) ((Closed)obj3));
	//   32   72:aload           6
	//   33   74:checkcast       #217 <Class Closed>
	//   34   77:astore          5
					helpClose(((Closed) (obj2)));
	//   35   79:aload_0         
	//   36   80:aload           5
	//   37   82:invokestatic    #477 <Method void access$helpClose(AbstractSendChannel, Closed)>
					obj = ((Object) ((Continuation)obj1));
	//   38   85:aload           4
	//   39   87:checkcast       #479 <Class Continuation>
	//   40   90:astore_1        
					obj1 = ((Object) (((Closed) (obj2)).getSendException()));
	//   41   91:aload           5
	//   42   93:invokevirtual   #308 <Method Throwable Closed.getSendException()>
	//   43   96:astore          4
					obj2 = ((Object) (Result.Companion));
	//   44   98:getstatic       #485 <Field kotlin.Result$Companion Result.Companion>
	//   45  101:astore          5
					((Continuation) (obj)).resumeWith(Result.constructor_2D_impl(ResultKt.createFailure(((Throwable) (obj1)))));
	//   46  103:aload_1         
	//   47  104:aload           4
	//   48  106:invokestatic    #491 <Method Object ResultKt.createFailure(Throwable)>
	//   49  109:invokestatic    #494 <Method Object Result.constructor_2D_impl(Object)>
	//   50  112:invokeinterface #497 <Method void Continuation.resumeWith(Object)>
					break;
	//   51  117:goto            229
				}
				obj3 = offerInternal(obj);
	//   52  120:aload_0         
	//   53  121:aload_1         
	//   54  122:invokevirtual   #394 <Method Object offerInternal(Object)>
	//   55  125:astore          6
				if(obj3 == AbstractChannelKt.OFFER_SUCCESS)
	//*  56  127:aload           6
	//*  57  129:getstatic       #324 <Field Object AbstractChannelKt.OFFER_SUCCESS>
	//*  58  132:if_acmpne       165
				{
					obj = ((Object) ((Continuation)obj1));
	//   59  135:aload           4
	//   60  137:checkcast       #479 <Class Continuation>
	//   61  140:astore_1        
					obj1 = ((Object) (Unit.INSTANCE));
	//   62  141:getstatic       #438 <Field Unit Unit.INSTANCE>
	//   63  144:astore          4
					obj2 = ((Object) (Result.Companion));
	//   64  146:getstatic       #485 <Field kotlin.Result$Companion Result.Companion>
	//   65  149:astore          5
					((Continuation) (obj)).resumeWith(Result.constructor_2D_impl(obj1));
	//   66  151:aload_1         
	//   67  152:aload           4
	//   68  154:invokestatic    #494 <Method Object Result.constructor_2D_impl(Object)>
	//   69  157:invokeinterface #497 <Method void Continuation.resumeWith(Object)>
					break;
	//   70  162:goto            229
				}
				if(obj3 == AbstractChannelKt.OFFER_FAILED)
	//*  71  165:aload           6
	//*  72  167:getstatic       #321 <Field Object AbstractChannelKt.OFFER_FAILED>
	//*  73  170:if_acmpne       176
					continue;
	//   74  173:goto            31
				if(!(obj3 instanceof Closed))
					break label0;
	//   75  176:aload           6
	//   76  178:instanceof      #217 <Class Closed>
	//   77  181:ifeq            247
				obj2 = ((Object) ((Closed)obj3));
	//   78  184:aload           6
	//   79  186:checkcast       #217 <Class Closed>
	//   80  189:astore          5
				helpClose(((Closed) (obj2)));
	//   81  191:aload_0         
	//   82  192:aload           5
	//   83  194:invokestatic    #477 <Method void access$helpClose(AbstractSendChannel, Closed)>
				obj = ((Object) ((Continuation)obj1));
	//   84  197:aload           4
	//   85  199:checkcast       #479 <Class Continuation>
	//   86  202:astore_1        
				obj1 = ((Object) (((Closed) (obj2)).getSendException()));
	//   87  203:aload           5
	//   88  205:invokevirtual   #308 <Method Throwable Closed.getSendException()>
	//   89  208:astore          4
				obj2 = ((Object) (Result.Companion));
	//   90  210:getstatic       #485 <Field kotlin.Result$Companion Result.Companion>
	//   91  213:astore          5
				((Continuation) (obj)).resumeWith(Result.constructor_2D_impl(ResultKt.createFailure(((Throwable) (obj1)))));
	//   92  215:aload_1         
	//   93  216:aload           4
	//   94  218:invokestatic    #491 <Method Object ResultKt.createFailure(Throwable)>
	//   95  221:invokestatic    #494 <Method Object Result.constructor_2D_impl(Object)>
	//   96  224:invokeinterface #497 <Method void Continuation.resumeWith(Object)>
				break;
			} while(true);
			obj = cancellablecontinuationimpl.getResult();
	//   97  229:aload_3         
	//   98  230:invokevirtual   #498 <Method Object CancellableContinuationImpl.getResult()>
	//   99  233:astore_1        
			if(obj == IntrinsicsKt.getCOROUTINE_SUSPENDED())
	//* 100  234:aload_1         
	//* 101  235:invokestatic    #501 <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//* 102  238:if_acmpne       245
				DebugProbesKt.probeCoroutineSuspended(continuation);
	//  103  241:aload_2         
	//  104  242:invokestatic    #507 <Method void DebugProbesKt.probeCoroutineSuspended(Continuation)>
			return obj;
	//  105  245:aload_1         
	//  106  246:areturn         
		}
		obj = ((Object) (new StringBuilder()));
	//  107  247:new             #229 <Class StringBuilder>
	//  108  250:dup             
	//  109  251:invokespecial   #230 <Method void StringBuilder()>
	//  110  254:astore_1        
		((StringBuilder) (obj)).append("offerInternal returned ");
	//  111  255:aload_1         
	//  112  256:ldc2            #396 <String "offerInternal returned ">
	//  113  259:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//  114  262:pop             
		((StringBuilder) (obj)).append(obj3);
	//  115  263:aload_1         
	//  116  264:aload           6
	//  117  266:invokevirtual   #239 <Method StringBuilder StringBuilder.append(Object)>
	//  118  269:pop             
		throw (Throwable)new IllegalStateException(((Object) (((StringBuilder) (obj)).toString())).toString());
	//  119  270:new             #312 <Class IllegalStateException>
	//  120  273:dup             
	//  121  274:aload_1         
	//  122  275:invokevirtual   #240 <Method String StringBuilder.toString()>
	//  123  278:invokevirtual   #313 <Method String Object.toString()>
	//  124  281:invokespecial   #314 <Method void IllegalStateException(String)>
	//  125  284:checkcast       #316 <Class Throwable>
	//  126  287:athrow          
	}

	protected ReceiveOrClosed takeFirstReceiveOrPeekClosed()
	{
		LockFreeLinkedListHead lockfreelinkedlisthead = queue;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    2    4:astore_3        
		do
		{
			Object obj;
label0:
			{
				obj = ((LockFreeLinkedListNode) (lockfreelinkedlisthead)).getNext();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #508 <Method Object LockFreeLinkedListNode.getNext()>
	//    5    9:astore_1        
				if(obj == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       24
					throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//    8   14:new             #168 <Class TypeCastException>
	//    9   17:dup             
	//   10   18:ldc1            #170 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   11   20:invokespecial   #173 <Method void TypeCastException(String)>
	//   12   23:athrow          
				obj = ((Object) ((LockFreeLinkedListNode)obj));
	//   13   24:aload_1         
	//   14   25:checkcast       #175 <Class LockFreeLinkedListNode>
	//   15   28:astore_1        
				LockFreeLinkedListNode lockfreelinkedlistnode = (LockFreeLinkedListNode)lockfreelinkedlisthead;
	//   16   29:aload_3         
	//   17   30:checkcast       #175 <Class LockFreeLinkedListNode>
	//   18   33:astore          4
				Object obj1 = null;
	//   19   35:aconst_null     
	//   20   36:astore_2        
				if(obj == lockfreelinkedlistnode)
	//*  21   37:aload_1         
	//*  22   38:aload           4
	//*  23   40:if_acmpne       48
					obj = ((Object) (obj1));
	//   24   43:aload_2         
	//   25   44:astore_1        
				else
	//*  26   45:goto            80
				if(!(obj instanceof ReceiveOrClosed))
	//*  27   48:aload_1         
	//*  28   49:instanceof      #192 <Class ReceiveOrClosed>
	//*  29   52:ifne            60
					obj = ((Object) (obj1));
	//   30   55:aload_2         
	//   31   56:astore_1        
				else
	//*  32   57:goto            80
				if(!((ReceiveOrClosed)obj instanceof Closed) && !((LockFreeLinkedListNode) (obj)).remove())
					break label0;
	//   33   60:aload_1         
	//   34   61:checkcast       #192 <Class ReceiveOrClosed>
	//   35   64:instanceof      #217 <Class Closed>
	//   36   67:ifeq            73
	//   37   70:goto            80
	//   38   73:aload_1         
	//   39   74:invokevirtual   #256 <Method boolean LockFreeLinkedListNode.remove()>
	//   40   77:ifeq            85
				return (ReceiveOrClosed)obj;
	//   41   80:aload_1         
	//   42   81:checkcast       #192 <Class ReceiveOrClosed>
	//   43   84:areturn         
			}
			((LockFreeLinkedListNode) (obj)).helpDelete();
	//   44   85:aload_1         
	//   45   86:invokevirtual   #511 <Method void LockFreeLinkedListNode.helpDelete()>
		} while(true);
	//   46   89:goto            5
	}

	protected final Send takeFirstSendOrPeekClosed()
	{
		LockFreeLinkedListHead lockfreelinkedlisthead = queue;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field LockFreeLinkedListHead queue>
	//    2    4:astore_3        
		do
		{
			Object obj;
label0:
			{
				obj = ((LockFreeLinkedListNode) (lockfreelinkedlisthead)).getNext();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #508 <Method Object LockFreeLinkedListNode.getNext()>
	//    5    9:astore_1        
				if(obj == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       24
					throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
	//    8   14:new             #168 <Class TypeCastException>
	//    9   17:dup             
	//   10   18:ldc1            #170 <String "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */">
	//   11   20:invokespecial   #173 <Method void TypeCastException(String)>
	//   12   23:athrow          
				obj = ((Object) ((LockFreeLinkedListNode)obj));
	//   13   24:aload_1         
	//   14   25:checkcast       #175 <Class LockFreeLinkedListNode>
	//   15   28:astore_1        
				LockFreeLinkedListNode lockfreelinkedlistnode = (LockFreeLinkedListNode)lockfreelinkedlisthead;
	//   16   29:aload_3         
	//   17   30:checkcast       #175 <Class LockFreeLinkedListNode>
	//   18   33:astore          4
				Object obj1 = null;
	//   19   35:aconst_null     
	//   20   36:astore_2        
				if(obj == lockfreelinkedlistnode)
	//*  21   37:aload_1         
	//*  22   38:aload           4
	//*  23   40:if_acmpne       48
					obj = ((Object) (obj1));
	//   24   43:aload_2         
	//   25   44:astore_1        
				else
	//*  26   45:goto            80
				if(!(obj instanceof Send))
	//*  27   48:aload_1         
	//*  28   49:instanceof      #225 <Class Send>
	//*  29   52:ifne            60
					obj = ((Object) (obj1));
	//   30   55:aload_2         
	//   31   56:astore_1        
				else
	//*  32   57:goto            80
				if(!((Send)obj instanceof Closed) && !((LockFreeLinkedListNode) (obj)).remove())
					break label0;
	//   33   60:aload_1         
	//   34   61:checkcast       #225 <Class Send>
	//   35   64:instanceof      #217 <Class Closed>
	//   36   67:ifeq            73
	//   37   70:goto            80
	//   38   73:aload_1         
	//   39   74:invokevirtual   #256 <Method boolean LockFreeLinkedListNode.remove()>
	//   40   77:ifeq            85
				return (Send)obj;
	//   41   80:aload_1         
	//   42   81:checkcast       #225 <Class Send>
	//   43   84:areturn         
			}
			((LockFreeLinkedListNode) (obj)).helpDelete();
	//   44   85:aload_1         
	//   45   86:invokevirtual   #511 <Method void LockFreeLinkedListNode.helpDelete()>
		} while(true);
	//   46   89:goto            5
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #229 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #230 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(DebugKt.getClassSimpleName(((Object) (this))));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #519 <Method String DebugKt.getClassSimpleName(Object)>
	//    7   13:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append('@');
	//    9   17:aload_1         
	//   10   18:bipush          64
	//   11   20:invokevirtual   #522 <Method StringBuilder StringBuilder.append(char)>
	//   12   23:pop             
		stringbuilder.append(DebugKt.getHexAddress(((Object) (this))));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokestatic    #525 <Method String DebugKt.getHexAddress(Object)>
	//   16   29:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append('{');
	//   18   33:aload_1         
	//   19   34:bipush          123
	//   20   36:invokevirtual   #522 <Method StringBuilder StringBuilder.append(char)>
	//   21   39:pop             
		stringbuilder.append(getQueueDebugStateString());
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:invokespecial   #527 <Method String getQueueDebugStateString()>
	//   25   45:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append('}');
	//   27   49:aload_1         
	//   28   50:bipush          125
	//   29   52:invokevirtual   #522 <Method StringBuilder StringBuilder.append(char)>
	//   30   55:pop             
		stringbuilder.append(getBufferDebugString());
	//   31   56:aload_1         
	//   32   57:aload_0         
	//   33   58:invokevirtual   #529 <Method String getBufferDebugString()>
	//   34   61:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		return stringbuilder.toString();
	//   36   65:aload_1         
	//   37   66:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   38   69:areturn         
	}

	private static final AtomicReferenceFieldUpdater onCloseHandler$FU = AtomicReferenceFieldUpdater.newUpdater(kotlinx/coroutines/channels/AbstractSendChannel, java/lang/Object, "onCloseHandler");
	private volatile Object onCloseHandler;
	private final LockFreeLinkedListHead queue = new LockFreeLinkedListHead();

	static 
	{
	//    0    0:ldc1            #2   <Class AbstractSendChannel>
	//    1    2:ldc1            #5   <Class Object>
	//    2    4:ldc1            #125 <String "onCloseHandler">
	//    3    6:invokestatic    #131 <Method AtomicReferenceFieldUpdater AtomicReferenceFieldUpdater.newUpdater(Class, Class, String)>
	//    4    9:putstatic       #133 <Field AtomicReferenceFieldUpdater onCloseHandler$FU>
	//*   5   12:return          
	}


/*
	public static final Object access$enqueueSend(AbstractSendChannel abstractsendchannel, SendElement sendelement)
	{
		return abstractsendchannel.enqueueSend(sendelement);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method Object enqueueSend(SendElement)>
	//    3    5:areturn         
	}

*/


/*
	public static final void access$helpClose(AbstractSendChannel abstractsendchannel, Closed closed)
	{
		abstractsendchannel.helpClose(closed);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #157 <Method void helpClose(Closed)>
		return;
	//    3    5:return          
	}

*/


/*
	public static final void access$registerSelectSend(AbstractSendChannel abstractsendchannel, SelectInstance selectinstance, Object obj, Function2 function2)
	{
		abstractsendchannel.registerSelectSend(selectinstance, obj, function2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #161 <Method void registerSelectSend(SelectInstance, Object, Function2)>
		return;
	//    5    7:return          
	}

*/

	// Unreferenced inner class kotlinx/coroutines/channels/AbstractSendChannel$SendSelect
	/* block-local class not found */
	class SendSelect {}

}

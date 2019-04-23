// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

// Referenced classes of package androidx.work:
//			OperationKt

public static final class OperationKt$await$1 extends ContinuationImpl
{

	public final Object invokeSuspend(Object obj)
	{
		result = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Object result>
		label = label | 0x80000000;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field int label>
	//    6   10:ldc1            #59  <Int 0x80000000>
	//    7   12:ior             
	//    8   13:putfield        #58  <Field int label>
		return OperationKt.await(((Operation) (null)), ((Continuation) (this)));
	//    9   16:aconst_null     
	//   10   17:aload_0         
	//   11   18:invokestatic    #60  <Method Object OperationKt.await(Operation, Continuation)>
	//   12   21:areturn         
	}

	Object L$0;
	Object L$1;
	int label;
	Object result;

	public OperationKt$await$1(Continuation continuation)
	{
		super(continuation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void ContinuationImpl(Continuation)>
	//    3    5:return          
	}
}

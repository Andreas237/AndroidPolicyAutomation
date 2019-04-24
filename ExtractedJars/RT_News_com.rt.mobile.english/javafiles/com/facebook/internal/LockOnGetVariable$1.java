// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.facebook.internal:
//			LockOnGetVariable

class LockOnGetVariable$1
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		LockOnGetVariable.access$002(LockOnGetVariable.this, val$callable.call());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LockOnGetVariable this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Callable val$callable>
	//    4    8:invokeinterface #35  <Method Object Callable.call()>
	//    5   13:invokestatic    #39  <Method Object LockOnGetVariable.access$002(LockOnGetVariable, Object)>
	//    6   16:pop             
		LockOnGetVariable.access$100(LockOnGetVariable.this).countDown();
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field LockOnGetVariable this$0>
	//    9   21:invokestatic    #43  <Method CountDownLatch LockOnGetVariable.access$100(LockOnGetVariable)>
	//   10   24:invokevirtual   #48  <Method void CountDownLatch.countDown()>
		return null;
	//   11   27:aconst_null     
	//   12   28:areturn         
		Exception exception;
		exception;
	//   13   29:astore_1        
		LockOnGetVariable.access$100(LockOnGetVariable.this).countDown();
	//   14   30:aload_0         
	//   15   31:getfield        #19  <Field LockOnGetVariable this$0>
	//   16   34:invokestatic    #43  <Method CountDownLatch LockOnGetVariable.access$100(LockOnGetVariable)>
	//   17   37:invokevirtual   #48  <Method void CountDownLatch.countDown()>
		throw exception;
	//   18   40:aload_1         
	//   19   41:athrow          
	}

	final LockOnGetVariable this$0;
	final Callable val$callable;

	LockOnGetVariable$1()
	{
		this$0 = final_lockongetvariable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LockOnGetVariable this$0>
		val$callable = Callable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Callable val$callable>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

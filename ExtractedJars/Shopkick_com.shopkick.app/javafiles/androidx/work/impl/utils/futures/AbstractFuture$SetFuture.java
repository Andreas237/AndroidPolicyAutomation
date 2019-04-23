// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;

// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

private static final class AbstractFuture$SetFuture
	implements Runnable
{

	public void run()
	{
		if(owner.value != this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field AbstractFuture owner>
	//*   2    4:getfield        #33  <Field Object AbstractFuture.value>
	//*   3    7:aload_0         
	//*   4    8:if_acmpeq       12
			return;
	//    5   11:return          
		Object obj = AbstractFuture.getFutureValue(future);
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field ListenableFuture future>
	//    8   16:invokestatic    #37  <Method Object AbstractFuture.getFutureValue(ListenableFuture)>
	//    9   19:astore_1        
		if(AbstractFuture.ATOMIC_HELPER.casValue(owner, ((Object) (this)), obj))
	//*  10   20:getstatic       #41  <Field AbstractFuture$AtomicHelper AbstractFuture.ATOMIC_HELPER>
	//*  11   23:aload_0         
	//*  12   24:getfield        #23  <Field AbstractFuture owner>
	//*  13   27:aload_0         
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #47  <Method boolean AbstractFuture$AtomicHelper.casValue(AbstractFuture, Object, Object)>
	//*  16   32:ifeq            42
			AbstractFuture.complete(owner);
	//   17   35:aload_0         
	//   18   36:getfield        #23  <Field AbstractFuture owner>
	//   19   39:invokestatic    #51  <Method void AbstractFuture.complete(AbstractFuture)>
	//   20   42:return          
	}

	final ListenableFuture future;
	final AbstractFuture owner;

	AbstractFuture$SetFuture(AbstractFuture abstractfuture, ListenableFuture listenablefuture)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		owner = abstractfuture;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field AbstractFuture owner>
		future = listenablefuture;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field ListenableFuture future>
	//    8   14:return          
	}
}

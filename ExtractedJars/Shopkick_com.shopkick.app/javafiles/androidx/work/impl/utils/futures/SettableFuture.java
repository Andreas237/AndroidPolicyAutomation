// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;

// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

public final class SettableFuture extends AbstractFuture
{

	private SettableFuture()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AbstractFuture()>
	//    2    4:return          
	}

	public static SettableFuture create()
	{
		return new SettableFuture();
	//    0    0:new             #2   <Class SettableFuture>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void SettableFuture()>
	//    3    7:areturn         
	}

	public boolean set(Object obj)
	{
		return super.set(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method boolean AbstractFuture.set(Object)>
	//    3    5:ireturn         
	}

	public boolean setException(Throwable throwable)
	{
		return super.setException(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method boolean AbstractFuture.setException(Throwable)>
	//    3    5:ireturn         
	}

	public boolean setFuture(ListenableFuture listenablefuture)
	{
		return super.setFuture(listenablefuture);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method boolean AbstractFuture.setFuture(ListenableFuture)>
	//    3    5:ireturn         
	}
}

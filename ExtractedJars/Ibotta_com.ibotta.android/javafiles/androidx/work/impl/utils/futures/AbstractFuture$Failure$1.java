// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;


// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

static final class AbstractFuture$Failure$1 extends Throwable
{

	public Throwable fillInStackTrace()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
	//*   2    2:aload_0         
		return ((Throwable) (this));
	//    3    3:monitorexit     
	//    4    4:aload_0         
	//    5    5:areturn         
	}

	AbstractFuture$Failure$1(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void Throwable(String)>
	//    3    5:return          
	}
}

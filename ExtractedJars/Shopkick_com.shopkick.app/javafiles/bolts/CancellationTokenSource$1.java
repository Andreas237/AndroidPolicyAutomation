// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


// Referenced classes of package bolts:
//			CancellationTokenSource

class CancellationTokenSource$1
	implements Runnable
{

	public void run()
	{
		synchronized(CancellationTokenSource.access$000(CancellationTokenSource.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field CancellationTokenSource this$0>
	//*   2    4:invokestatic    #26  <Method Object CancellationTokenSource.access$000(CancellationTokenSource)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			CancellationTokenSource.access$102(CancellationTokenSource.this, ((java.util.concurrent.ScheduledFuture) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field CancellationTokenSource this$0>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #30  <Method java.util.concurrent.ScheduledFuture CancellationTokenSource.access$102(CancellationTokenSource, java.util.concurrent.ScheduledFuture)>
	//   10   18:pop             
		}
	//   11   19:aload_1         
	//   12   20:monitorexit     
		cancel();
	//   13   21:aload_0         
	//   14   22:getfield        #17  <Field CancellationTokenSource this$0>
	//   15   25:invokevirtual   #33  <Method void CancellationTokenSource.cancel()>
		return;
	//   16   28:return          
		exception;
	//   17   29:astore_2        
		obj;
	//   18   30:aload_1         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw exception;
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	final CancellationTokenSource this$0;

	CancellationTokenSource$1()
	{
		this$0 = CancellationTokenSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CancellationTokenSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

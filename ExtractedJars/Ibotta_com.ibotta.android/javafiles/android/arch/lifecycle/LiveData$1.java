// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			LiveData

class LiveData$1
	implements Runnable
{

	public void run()
	{
		Object obj1;
		synchronized(LiveData.access$000(LiveData.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field LiveData this$0>
	//*   2    4:invokestatic    #23  <Method Object LiveData.access$000(LiveData)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			obj1 = LiveData.access$100(LiveData.this);
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field LiveData this$0>
	//    8   14:invokestatic    #26  <Method Object LiveData.access$100(LiveData)>
	//    9   17:astore_2        
			LiveData.access$102(LiveData.this, LiveData.access$200());
	//   10   18:aload_0         
	//   11   19:getfield        #14  <Field LiveData this$0>
	//   12   22:invokestatic    #30  <Method Object LiveData.access$200()>
	//   13   25:invokestatic    #34  <Method Object LiveData.access$102(LiveData, Object)>
	//   14   28:pop             
		}
	//   15   29:aload_1         
	//   16   30:monitorexit     
		setValue(obj1);
	//   17   31:aload_0         
	//   18   32:getfield        #14  <Field LiveData this$0>
	//   19   35:aload_2         
	//   20   36:invokevirtual   #38  <Method void LiveData.setValue(Object)>
		return;
	//   21   39:return          
		exception;
	//   22   40:astore_2        
		obj;
	//   23   41:aload_1         
		JVM INSTR monitorexit ;
	//   24   42:monitorexit     
		throw exception;
	//   25   43:aload_2         
	//   26   44:athrow          
	}

	final LiveData this$0;

	LiveData$1()
	{
		this$0 = LiveData.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LiveData this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

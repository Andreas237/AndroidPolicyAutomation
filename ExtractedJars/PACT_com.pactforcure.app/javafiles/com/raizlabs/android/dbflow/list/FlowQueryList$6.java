// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;


// Referenced classes of package com.raizlabs.android.dbflow.list:
//			FlowQueryList

class FlowQueryList$6
	implements Runnable
{

	public void run()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		FlowQueryList.access$1502(FlowQueryList.this, false);
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field FlowQueryList this$0>
	//    4    6:iconst_0        
	//    5    7:invokestatic    #23  <Method boolean FlowQueryList.access$1502(FlowQueryList, boolean)>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		refresh();
	//    9   13:aload_0         
	//   10   14:getfield        #14  <Field FlowQueryList this$0>
	//   11   17:invokevirtual   #26  <Method void FlowQueryList.refresh()>
		return;
	//   12   20:return          
		Exception exception;
		exception;
	//   13   21:astore_1        
		this;
	//   14   22:aload_0         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw exception;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	final FlowQueryList this$0;

	FlowQueryList$6()
	{
		this$0 = FlowQueryList.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field FlowQueryList this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

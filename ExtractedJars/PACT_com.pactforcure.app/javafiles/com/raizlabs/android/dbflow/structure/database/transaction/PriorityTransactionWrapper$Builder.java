// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;


// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			PriorityTransactionWrapper, ITransaction

public static class PriorityTransactionWrapper$Builder
{

	public PriorityTransactionWrapper build()
	{
		return new PriorityTransactionWrapper(this);
	//    0    0:new             #6   <Class PriorityTransactionWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #32  <Method void PriorityTransactionWrapper(PriorityTransactionWrapper$Builder)>
	//    4    8:areturn         
	}

	public PriorityTransactionWrapper$Builder priority(int i)
	{
		priority = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int priority>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private int priority;
	private final ITransaction transaction;


/*
	static int access$000(PriorityTransactionWrapper$Builder prioritytransactionwrapper$builder)
	{
		return prioritytransactionwrapper$builder.priority;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int priority>
	//    2    4:ireturn         
	}

*/


/*
	static ITransaction access$100(PriorityTransactionWrapper$Builder prioritytransactionwrapper$builder)
	{
		return prioritytransactionwrapper$builder.transaction;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ITransaction transaction>
	//    2    4:areturn         
	}

*/

	public PriorityTransactionWrapper$Builder(ITransaction itransaction)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		transaction = itransaction;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ITransaction transaction>
	//    5    9:return          
	}
}

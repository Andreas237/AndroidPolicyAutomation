// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.annotation.Annotation;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			ITransaction

public class PriorityTransactionWrapper
	implements ITransaction, Comparable
{
	public static class Builder
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

		public Builder priority(int i)
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
		static int access$000(Builder builder)
		{
			return builder.priority;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int priority>
		//    2    4:ireturn         
		}

*/


/*
		static ITransaction access$100(Builder builder)
		{
			return builder.transaction;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ITransaction transaction>
		//    2    4:areturn         
		}

*/

		public Builder(ITransaction itransaction)
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

	public static interface Priority
		extends Annotation
	{
	}


	PriorityTransactionWrapper(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		if(builder.priority == 0)
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #36  <Method int PriorityTransactionWrapper$Builder.access$000(PriorityTransactionWrapper$Builder)>
	//*   4    8:ifne            25
			priority = 1;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #38  <Field int priority>
		else
	//*   8   16:aload_0         
	//*   9   17:aload_1         
	//*  10   18:invokestatic    #42  <Method ITransaction PriorityTransactionWrapper$Builder.access$100(PriorityTransactionWrapper$Builder)>
	//*  11   21:putfield        #44  <Field ITransaction transaction>
	//*  12   24:return          
			priority = builder.priority;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #36  <Method int PriorityTransactionWrapper$Builder.access$000(PriorityTransactionWrapper$Builder)>
	//   16   30:putfield        #38  <Field int priority>
		transaction = builder.transaction;
	//*  17   33:goto            16
	}

	public int compareTo(PriorityTransactionWrapper prioritytransactionwrapper)
	{
		return prioritytransactionwrapper.priority - priority;
	//    0    0:aload_1         
	//    1    1:getfield        #38  <Field int priority>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field int priority>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((PriorityTransactionWrapper)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class PriorityTransactionWrapper>
	//    3    5:invokevirtual   #52  <Method int compareTo(PriorityTransactionWrapper)>
	//    4    8:ireturn         
	}

	public void execute(DatabaseWrapper databasewrapper)
	{
		transaction.execute(databasewrapper);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ITransaction transaction>
	//    2    4:aload_1         
	//    3    5:invokeinterface #56  <Method void ITransaction.execute(DatabaseWrapper)>
	//    4   10:return          
	}

	public static final int PRIORITY_HIGH = 2;
	public static final int PRIORITY_LOW = 0;
	public static final int PRIORITY_NORMAL = 1;
	public static final int PRIORITY_UI = 5;
	private final int priority;
	private final ITransaction transaction;
}

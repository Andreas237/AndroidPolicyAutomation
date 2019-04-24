// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;


// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			PriorityTransactionQueue, Transaction, PriorityTransactionWrapper

class PriorityTransactionQueue$PriorityEntry
	implements Comparable
{

	public int compareTo(PriorityTransactionQueue$PriorityEntry prioritytransactionqueue$priorityentry)
	{
		return transactionWrapper.compareTo(prioritytransactionqueue$priorityentry.transactionWrapper);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
	//    2    4:aload_1         
	//    3    5:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
	//    4    8:invokevirtual   #54  <Method int PriorityTransactionWrapper.compareTo(PriorityTransactionWrapper)>
	//    5   11:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((PriorityTransactionQueue$PriorityEntry)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class PriorityTransactionQueue$PriorityEntry>
	//    3    5:invokevirtual   #59  <Method int compareTo(PriorityTransactionQueue$PriorityEntry)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #65  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #65  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((PriorityTransactionQueue$PriorityEntry)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class PriorityTransactionQueue$PriorityEntry>
	//   16   28:astore_1        
			if(transactionWrapper != null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
	//*  19   33:ifnull          48
				return ((Object) (transactionWrapper)).equals(((Object) (((PriorityTransactionQueue$PriorityEntry) (obj)).transactionWrapper)));
	//   20   36:aload_0         
	//   21   37:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
	//   22   40:aload_1         
	//   23   41:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
	//   24   44:invokevirtual   #67  <Method boolean Object.equals(Object)>
	//   25   47:ireturn         
			if(((PriorityTransactionQueue$PriorityEntry) (obj)).transactionWrapper != null)
	//*  26   48:aload_1         
	//*  27   49:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
	//*  28   52:ifnull          5
				return false;
	//   29   55:iconst_0        
	//   30   56:ireturn         
		}
		return true;
	}

	public Transaction getEntry()
	{
		return entry;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Transaction entry>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(transactionWrapper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
	//*   2    4:ifnull          15
			return ((Object) (transactionWrapper)).hashCode();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
	//    5   11:invokevirtual   #74  <Method int Object.hashCode()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	final Transaction entry;
	final PriorityTransactionQueue this$0;
	final PriorityTransactionWrapper transactionWrapper;

	public PriorityTransactionQueue$PriorityEntry(Transaction transaction)
	{
		this$0 = PriorityTransactionQueue.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field PriorityTransactionQueue this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		entry = transaction;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Transaction entry>
		if(transaction.transaction() instanceof PriorityTransactionWrapper)
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #32  <Method ITransaction Transaction.transaction()>
	//*  10   18:instanceof      #34  <Class PriorityTransactionWrapper>
	//*  11   21:ifeq            36
		{
			transactionWrapper = (PriorityTransactionWrapper)transaction.transaction();
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #32  <Method ITransaction Transaction.transaction()>
	//   15   29:checkcast       #34  <Class PriorityTransactionWrapper>
	//   16   32:putfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
			return;
	//   17   35:return          
		} else
		{
			transactionWrapper = (new PriorityTransactionWrapper.Builder(transaction.transaction())).build();
	//   18   36:aload_0         
	//   19   37:new             #38  <Class PriorityTransactionWrapper$Builder>
	//   20   40:dup             
	//   21   41:aload_2         
	//   22   42:invokevirtual   #32  <Method ITransaction Transaction.transaction()>
	//   23   45:invokespecial   #41  <Method void PriorityTransactionWrapper$Builder(ITransaction)>
	//   24   48:invokevirtual   #45  <Method PriorityTransactionWrapper PriorityTransactionWrapper$Builder.build()>
	//   25   51:putfield        #36  <Field PriorityTransactionWrapper transactionWrapper>
			return;
	//   26   54:return          
		}
	}
}

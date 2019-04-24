// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.config.DatabaseDefinition;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			Transaction, ITransaction

public static final class Transaction$Builder
{

	public Transaction build()
	{
		return new Transaction(this);
	//    0    0:new             #6   <Class Transaction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method void Transaction(Transaction$Builder)>
	//    4    8:areturn         
	}

	public Transaction$Builder error(Transaction.Error error1)
	{
		errorCallback = error1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field Transaction$Error errorCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Transaction$Builder name(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String name>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Transaction$Builder runCallbacksOnSameThread(boolean flag)
	{
		runCallbacksOnSameThread = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field boolean runCallbacksOnSameThread>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Transaction$Builder shouldRunInTransaction(boolean flag)
	{
		shouldRunInTransaction = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field boolean shouldRunInTransaction>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Transaction$Builder success(Transaction$Success transaction$success)
	{
		successCallback = transaction$success;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field Transaction$Success successCallback>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	final DatabaseDefinition databaseDefinition;
	Transaction.Error errorCallback;
	String name;
	private boolean runCallbacksOnSameThread;
	boolean shouldRunInTransaction;
	Transaction$Success successCallback;
	final ITransaction transaction;


/*
	static boolean access$000(Transaction$Builder transaction$builder)
	{
		return transaction$builder.runCallbacksOnSameThread;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean runCallbacksOnSameThread>
	//    2    4:ireturn         
	}

*/

	public Transaction$Builder(ITransaction itransaction, DatabaseDefinition databasedefinition)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		shouldRunInTransaction = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #28  <Field boolean shouldRunInTransaction>
		transaction = itransaction;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #30  <Field ITransaction transaction>
		databaseDefinition = databasedefinition;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #32  <Field DatabaseDefinition databaseDefinition>
	//   11   19:return          
	}
}
